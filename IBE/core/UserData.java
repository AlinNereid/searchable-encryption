package core;
import java.util.ArrayList;

public class UserData implements Iterable {
	ArrayList<Token> tokens = new ArrayList<Token>();

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {		
		return tokens.size();
	}

	@Override
	public int addElement(Object o) {
		tokens.add((Token)o);
		return 0;
	}

	@Override
	public int removeElement(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
