package tree;

//author Tejaswi Allam

public class TreeDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		TreeNode root = new TreeNode('*');
        //System.out.println("Constructing the tree...");
        TreeNode.constructTree(root);
        
         int heightoftree = TreeNode.getHeight(root);
         System.out.println("Height of tree: " + heightoftree);
         
         int noofleaves = TreeNode.noofleaves(root);
         System.out.println("Number of leaves: " + noofleaves);
         
         System.out.print("Inorder traversal: ");
         TreeNode.inorder(root);
         System.out.println();
         
         System.out.print("Preorder traversal: ");
         TreeNode.preorder(root);
         System.out.println();
         
         System.out.print("Postorder traversal: ");
         TreeNode.postorder(root);
         System.out.println();
         
         System.out.print("Infix notation with parentheses: ");
         TreeNode.infixWithParentheses(root);
         System.out.println();

	}

}
