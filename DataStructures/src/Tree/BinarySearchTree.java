package Tree;

public class BinarySearchTree {

	private TreeNode rootNode;
	private TreeNode currentRoot;

	public TreeNode getNode(int data) {
		
		if (currentRoot.getData() == data && !currentRoot.isDeleted()) {
			return currentRoot;
		}
		if (data < currentRoot.getData() && currentRoot.getLeftChild() != null) {
			currentRoot = currentRoot.getLeftChild();
			return getNode(data);
		}
		if (currentRoot.getRightChild() != null) {
			currentRoot = currentRoot.getRightChild();
			return getNode(data);
		}
		return null;
	}

	public void insertNode(int data) {
		TreeNode newNode = new TreeNode(data);
		if (rootNode != null) {
			currentRoot = rootNode;
			insert(newNode);
		} else {
			rootNode = newNode;
		}
	}

	public TreeNode find(int data) {
		if (currentRoot != null) {
			currentRoot = rootNode;
			return getNode(data);
		} else {
			return null;
		}

	}
	
	public void delete(int data){
		TreeNode nodeToBEDeleted = find(data);
		
		if(nodeToBEDeleted != null){
			nodeToBEDeleted.setDeleted(true);
		}
	}

	private void insert(TreeNode newNode) {
		if (newNode.getData() == currentRoot.getData()) {
			System.out.println("node : " + newNode.getData() + " already present hence ignored");
			return;
		}
		if (newNode.getData() < currentRoot.getData()) {
			if (currentRoot.getLeftChild() != null) {
				currentRoot = currentRoot.getLeftChild();
				insert(newNode);
			} else {
				currentRoot.setLeftChild(newNode);
			}
			return;
		}
		if (newNode.getData() > currentRoot.getData()) {
			if (currentRoot.getRightChild() != null) {
				currentRoot = currentRoot.getRightChild();
				insert(newNode);
			} else {
				currentRoot.setRightChild(newNode);
			}
			return;
		}
	}
	@SuppressWarnings("unused")
	public void orderedTraversal(){
		if(rootNode != null){
			rootNode.orderedTrversal();
		}else{
			System.out.println("No data found inside tree");
		}
	}
}
