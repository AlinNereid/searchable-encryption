package core;
import java.util.ArrayList;

public class UserData implements Iterable {
	ArrayList<Token> tokens = new ArrayList<Token>();

	@Override
	public Iterator createIterator() {		
		return new UserDataIterator(this, tokens);
	}

	@Override
	public int count() {		
		return tokens.size();
	}

	@Override
	public int addElement(Object o) {
		if(!(o instanceof Token)) {
			return -1;
		}
		
		tokens.add((Token)o);
		return 0;
	}

	@Override
	public int removeElement(Object o) {
		if(!(o instanceof Token)) {
			return -1;
		}
		
		Token token = (Token) o;
		
		for(int i=0; i<count(); ++i) {
			if(tokens.get(i).equals(token)) {
				tokens.remove(i);
				return 0;
			}
		}
		
		return -1;
	}

}
