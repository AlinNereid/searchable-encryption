public class EncryptedWords implements Container{
	public String encryptedWord[] = {"abc","def","ghe"};
	
	private int index;
	
	@Override
	public Iterator getIterator() {
		return new EncryptedWordsIterator();
	}
	private class EncryptedWordsIterator implements Iterator{

		@Override
		public boolean hasNext() {
			return index < encryptedWord.length;
		}
		
		@Override
		public Object next() {
			if(hasNext()){
				return encryptedWord[index++];
			}
			return null;
		}
		
	}
}