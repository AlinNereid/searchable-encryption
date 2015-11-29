package aspects;

import core.Token;

public aspect TokenDataAspect {
	static long totalDataSet = 0;
	
	pointcut tokenSetData(Token token, byte[] data): call(public void Token.setData(byte[])) && target(token) && args(data);
	
	before(Token token, byte[] data) : tokenSetData(token, data) {
		byte[] oldData = token.getData();
		if(oldData != null) {
			totalDataSet -= oldData.length;
		}
		
		totalDataSet += data.length;
		
		System.out.println("[TRACE] Currently " + totalDataSet + " bytes set in tokens.");
	}
	
}
