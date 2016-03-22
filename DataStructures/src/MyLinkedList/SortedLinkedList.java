package MyLinkedList;

public class SortedLinkedList<T> {

	private Node<T> headNode;
	
	public void addElement(T data) {

		Node<T> newNode = new Node<T>(data);
		Node<T> currentNode = new Node<T>();

		if (this.headNode == null) {

			this.headNode = newNode;

		} else {
			currentNode.setNextNode(headNode);
			while (currentNode.getNextNode() != null) {
				
				if (currentNode.getNextNode().getStringdata().compareTo(newNode.getStringdata()) > 0) {
					if(currentNode.getNextNode() == headNode){
						newNode.setNextNode(headNode);
						currentNode.setNextNode(newNode);
						headNode = newNode;
						break;
					}else{
						newNode.setNextNode(currentNode.getNextNode());
						currentNode.setNextNode(newNode);
						break;
					}
					
				}
				if(currentNode.getNextNode().getStringdata().compareTo(newNode.getStringdata()) < 0 && currentNode.getNextNode().getNextNode() == null){
					currentNode.getNextNode().setNextNode(newNode);
					newNode.setNextNode(null);
					break;
				}
				currentNode = currentNode.getNextNode();
			}

		}

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
