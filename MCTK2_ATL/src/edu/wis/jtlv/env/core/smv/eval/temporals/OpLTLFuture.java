package edu.wis.jtlv.env.core.smv.eval.temporals;

import edu.wis.jtlv.env.core.smv.SMVParseException;
import edu.wis.jtlv.env.core.smv.eval.AbstractElement;
import edu.wis.jtlv.env.core.smv.eval.AbstractUnaryOperator;
import edu.wis.jtlv.env.core.smv.eval.ILTLOperator;
import edu.wis.jtlv.env.core.smv.eval.ValueStmt;

public class OpLTLFuture extends AbstractUnaryOperator implements ILTLOperator {

	public OpLTLFuture(AbstractElement a_val) throws SMVParseException {
		super(a_val);
	}

	@Override
	protected ValueStmt do_eval() throws SMVParseException {
		throw new SMVParseException("LTL Operators are not implemented yet.");
	}

	@Override
	public String elemToString() {
		return "FUTURE";
	}
	
	@Override
	protected OpLTLFuture duplicate() throws SMVParseException {
		return new OpLTLFuture(this.getVal());
	}
	
	// ////////////////////////////////////////////////////////////////////////
	// ////////////////////////////////////////////////////////////////////////
	// ////////////////////////////////////////////////////////////////////////

	@Override
	protected ValueStmt doDefaultNodeOp(ValueStmt v)
			throws SMVParseException {
		throw new SMVParseException("LTL Operators are not implemented yet.");
	}
}
