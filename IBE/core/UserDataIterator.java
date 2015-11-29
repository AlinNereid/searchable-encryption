package core;

import java.util.ArrayList;

public class UserDataIterator implements Iterator {	
	UserData userData;
	ArrayList<Token> tokens;
	int currentIndex;
	
	public UserDataIterator(UserData userData, ArrayList<Token> tokens) {
		this.userData = userData;
		this.tokens = tokens;
		currentIndex = 0;
	}

	@Override
	public void first() {
		currentIndex = 0;
	}

	@Override
	public void next() {
		if(!isDone()) {
			++currentIndex;;
		}
	}

	@Override
	public boolean isDone() {
		if(currentIndex >= userData.count()) {
			return true;
		}
		return false;
	}

	@Override
	public Object currentItem() {
		if(isDone()) {
			return null;
		}
		
		return tokens.get(currentIndex);
	}

}
