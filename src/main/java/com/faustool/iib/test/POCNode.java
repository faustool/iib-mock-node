package com.faustool.iib.test;

import com.ibm.broker.plugin.MbException;
import com.ibm.broker.plugin.MbInputTerminal;
import com.ibm.broker.plugin.MbMessageAssembly;
import com.ibm.broker.plugin.MbNode;
import com.ibm.broker.plugin.MbNodeInterface;

public class POCNode extends MbNode implements MbNodeInterface {

	public POCNode() throws MbException {
		createInputTerminal("in");
		createOutputTerminal("out");
		createOutputTerminal("alternate");
	}

	@Override
	public void evaluate(MbMessageAssembly arg0, MbInputTerminal arg1) throws MbException {

	}

}
