package core;

public class Token {	
	private byte[] data = null;
		
	public void setData(byte[] data) {
		this.data = data;
	}
	
	public byte[] getData() { 
		return data; 
	}
	
	public int getByteCount() {
		return data.length;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		
		if(obj instanceof Token) {
			Token token = (Token)obj;
			
			if(token.getByteCount() == this.getByteCount()) {
				for(int i=0; i < this.getByteCount(); ++i) {
					if(token.getData()[i] != this.getData()[i]) {
						return false;
					}
				}
				return true;
			}
		}
		
		return false;		
	}
}
