package Tree;

public class TreeNode {

	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	private boolean isDeleted = false;

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public int getData() {
		return data;
	}

	public TreeNode(int data) {
		this.data = data;
	}

	public TreeNode() {

	}

	// See, the setData method is not provided, it is to give a immutable nature
	// to the object
	// it is good practise

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public void orderedTrversal() {
		
		if (this.leftChild != null)
			this.leftChild.orderedTrversal();
		System.out.print(this.data + " ");
		if (this.rightChild != null)
			this.rightChild.orderedTrversal();
		

	}

}
