package com.faustool.iib.test;

import com.ibm.broker.plugin.MbException;
import com.ibm.broker.plugin.MbInputNode;
import com.ibm.broker.plugin.MbInputNodeInterface;
import com.ibm.broker.plugin.MbMessageAssembly;

public class POCInputNode extends MbInputNode implements MbInputNodeInterface {

	public POCInputNode() throws MbException {
		super();
	}

	@Override
	public int run(MbMessageAssembly arg0) throws MbException {
		// TODO Auto-generated method stub
		return 0;
	}

}
