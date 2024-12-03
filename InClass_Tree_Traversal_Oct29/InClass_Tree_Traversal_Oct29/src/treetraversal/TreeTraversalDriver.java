package treetraversal;

public class TreeTraversalDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(11);
		root.leftlink = new TreeNode(6);
		root.rightlink = new TreeNode(7);
		root.leftlink.leftlink=new TreeNode(15);
		root.leftlink.rightlink=new TreeNode(17);
		root.rightlink.leftlink=new TreeNode(22);
		root.rightlink.rightlink=new TreeNode(33);
		inorder(root);
	}
	public static void inorder(TreeNode root) {
		if(root== null) {
			return;
		}
		inorder(root.leftlink); // traverse left subtree
		System.out.print(root.val+" "); // print the root
		inorder(root.rightlink); // traverse right subtree
	}
	
	

}
