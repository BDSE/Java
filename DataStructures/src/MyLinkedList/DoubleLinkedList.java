package MyLinkedList;

public class DoubleLinkedList<T> {
	
	private DoubleLinkedNode<T> headNode;
	
	public void addElementAtHead(T data){
		
		DoubleLinkedNode<T> newNode = new DoubleLinkedNode<T>(data);
		
		newNode.setNextNode(this.headNode);
		if(this.headNode != null){
			newNode.getNextNode().setPreviousNode(newNode);	
		}
		headNode = newNode;
		
	}
	public String toString() {
		DoubleLinkedNode<T> currentNode = headNode;
		String str = "{";
		while (currentNode != null) {

			str += currentNode.toString() + ",";
			currentNode = currentNode.getNextNode();

		}
		str += "}";
		return str;
	}

}
