package org.liveSense.misc.sessionManager;

import org.liveSense.misc.sessionManager.SessionFactory;
import org.liveSense.misc.sessionManager.SessionImpl;

public class TestSessionImpl extends SessionImpl {
	
	private Long testParam1;

	public Long getTestParam1() {
		return testParam1;
	}

	public void setTestParam1(Long testParam1) {
		this.testParam1 = testParam1;
	}
	
	public TestSessionImpl(SessionFactory factory) {
		super(factory);
	}
	

}
