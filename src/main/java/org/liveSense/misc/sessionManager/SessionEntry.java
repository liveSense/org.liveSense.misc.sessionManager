package org.liveSense.misc.sessionManager;

public interface SessionEntry<O> {
	
	public void onClose(Session session, SessionEntry<O> entry) throws Throwable;
	
	public void onError(Session session, SessionEntry<O> entry, Throwable th, SessionEntry<?> errEntry);

	public O getValue();
}
