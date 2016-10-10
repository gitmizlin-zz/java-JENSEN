

public class Stack<T> {

	Node<T> top;
		
    public Stack() {
    	this.top = null;
	}

	public void push(T value) {
    	Node node = new Node(value);
    	node.setNext(top);
    	top = node;
    }
    
    T pop() {
        if (top != null) {
            T value = top.getValue();
            top = top.getNext();
            return value;
        }
        return null;
    }
    
    public boolean isEmpty() {
        return top == null;
    }

}	
