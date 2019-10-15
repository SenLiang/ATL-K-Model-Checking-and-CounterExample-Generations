package swing;

import edu.wis.jtlv.env.Env;

public class Statistic {
    Runtime runtime;
    long beginTime;
    long beginMemory;
    long beginBDD ;
    long beginVar ;

    public Statistic() {
        beginTime = System.currentTimeMillis();
        runtime = Runtime.getRuntime();
        runGC();//runtime.gc();
        beginMemory =runtime.totalMemory() - runtime.freeMemory();//获取开始时内存使用量
        beginBDD = Env.TRUE().getFactory().getNodeNum();
        beginVar = Env.TRUE().getFactory().varNum();
    }

    public String endTime() {
        return "execution time:" + ((System.currentTimeMillis() - beginTime) / 1000.0) + " s\n";
    }

    public String endMemory(){
            runGC();//runtime.gc();
        long endMem = runtime.totalMemory() - runtime.freeMemory();// 获取结束时内存使用量
        return  "Memory in use:" + (endMem-beginMemory) / 1024.0 + " KB\n";
    }

    public String endBDD() {
        System.out.println("endBDD------"+Env.TRUE().getFactory().getNodeNum());
        return "Number of BDD nodes:" + (Env.TRUE().getFactory().getNodeNum() - beginBDD)+"\n";
    }

    public  String SpecEndVar() {
        return "Number of BDD variables:" + beginVar+"\n";
    }
    public  String endVar() {
        System.out.println("endVar------"+Env.TRUE().getFactory().varNum());
        return "Number of BDD variables:" + (Env.TRUE().getFactory().varNum()-beginVar)+"\n";
    }

    private void runGC()  {
        long usedMem1 = runtime.totalMemory() - runtime.freeMemory(), usedMem2 = Long.MAX_VALUE;
        for (int i = 0; (usedMem1 < usedMem2) && (i < 500); ++i) {
            runtime.runFinalization();
            runtime.gc();
            Thread.currentThread().yield();
            usedMem2 = usedMem1;
            usedMem1 = runtime.totalMemory() - runtime.freeMemory();;
        }
    }
}
