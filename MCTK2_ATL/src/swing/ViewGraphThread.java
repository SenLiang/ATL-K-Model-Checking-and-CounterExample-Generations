package swing;

import edu.wis.jtlv.lib.mc.RTCTLK.GraphExplainRTCTLK;
import edu.wis.jtlv.lib.mc.RTCTLK.ViewerExplainRTCTLK;
import org.graphstream.graph.Graph;
/**
 * 测试图形化反例
 */
public class ViewGraphThread implements Runnable{
    GraphExplainRTCTLK g;

    public ViewGraphThread(GraphExplainRTCTLK graph) {
        this.g=graph;
    }
    @Override
    public void run() {
        new ViewerExplainRTCTLK(g);
    }
}