
public interface Iterable {

	Iterator createIterator();
	
	int count();
	
	int addElement(Object o);
	
	int removeElement(Object o);
	
}
