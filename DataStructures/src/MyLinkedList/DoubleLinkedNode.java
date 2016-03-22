package MyLinkedList;

public class DoubleLinkedNode<T> implements Comparable<DoubleLinkedNode<T>>{
	
	private T data;
	private DoubleLinkedNode<T> nextNode;
	private DoubleLinkedNode<T> previousNode;
	
	public DoubleLinkedNode(T data) {
		
		this.data = data;
	
	}
	
	public T getData() {
		return data;
	}
	public String getStringData() {
		return ""+data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public DoubleLinkedNode<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoubleLinkedNode<T> nextNode) {
		this.nextNode = nextNode;
	}

	public DoubleLinkedNode<T> getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(DoubleLinkedNode<T> previousNode) {
		this.previousNode = previousNode;
	}
	
	@Override
	public int compareTo(DoubleLinkedNode<T> o) {
		return this.getStringData().compareTo(o.getStringData());
	}
	@Override
	public String toString(){
		
		return data+"";
		
	}
}
