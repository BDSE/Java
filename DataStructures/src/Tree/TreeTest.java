package Tree;

public class TreeTest {
	public static void main(String[] args) {
		BinarySearchTree bs = new BinarySearchTree();
	    bs.insertNode(59);
	    bs.insertNode(29);
	    bs.insertNode(34);
	    bs.insertNode(78);
	    bs.insertNode(60);
	    bs.insertNode(452);
	    bs.insertNode(19);
	    //bs.insertNode(29);

	    bs.orderedTraversal();
	    System.out.println("");
	    TreeNode tn = bs.find(78);
	    if( tn != null)
	    System.out.println(tn.getData());
	    else
	    System.out.println("Node not found");
	    
	    bs.delete(78);

	}
}
