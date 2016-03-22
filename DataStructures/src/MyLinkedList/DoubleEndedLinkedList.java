package MyLinkedList;

public class DoubleEndedLinkedList<T> {

	private Node<T> headNode;
	private Node<T> tailNode;

	public void addElementAtEnd(T data) {

		Node<T> newNode = new Node<T>(data);
		if (this.headNode == null) {
			this.headNode = newNode;
		}
		if (this.tailNode != null) {
			this.tailNode.setNextNode(newNode);
		}
		this.tailNode = newNode;
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
}
