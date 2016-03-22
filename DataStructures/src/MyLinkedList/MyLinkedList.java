package MyLinkedList;

public class MyLinkedList<T> {

	private Node<T> headNode;

	public void addHeadElement(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.setNextNode(this.headNode);
		this.headNode = newNode;
	}

	@Override
	public String toString() {
		Node<T> currentNode = headNode;
		String str = "{";
		while (currentNode != null) {

			str += currentNode.toString() + ",";
			currentNode = currentNode.getNextNode();

		}
		str += "}";
		return str;
	}

	public int length() {

		int leng = 0;
		Node<T> currentNode = headNode;

		while (currentNode != null) {
			leng++;
			currentNode = currentNode.getNextNode();
		}
		return leng;
	}

	public void deleteHeadNode() {

		headNode = headNode.getNextNode();

	}
	
	public String get(int index){
		Node<T> currentNode = headNode;
		
		for(int i=0; i<index; i++){
			currentNode = currentNode.getNextNode();
		}
		
		return ""+currentNode.getData();
	}
}
