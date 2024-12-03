package tree;

//author Tejaswi Allam

public class TreeNode {
	char value;
	TreeNode leftlink;
	TreeNode rightlink;
	
	public TreeNode(char value) {
		this.value=value;
		this.leftlink = null;
        this.rightlink = null;
	}
	
	public static void constructTree(TreeNode root) {
        //TreeNode root = new TreeNode('*');
        root.leftlink = new TreeNode('+');
        root.rightlink = new TreeNode('-');
        root.leftlink.leftlink = new TreeNode('5');
        root.leftlink.rightlink = new TreeNode('/');
        root.rightlink.leftlink = new TreeNode('4');
        root.rightlink.rightlink = new TreeNode('*');
        root.leftlink.rightlink.leftlink = new TreeNode('8');
        root.leftlink.rightlink.rightlink = new TreeNode('3');
        root.rightlink.rightlink.leftlink = new TreeNode('2');
        root.rightlink.rightlink.rightlink = new TreeNode('6');

        //return root;
    }
	
	 public static int getHeight(TreeNode node) {
	        if (node == null) 
	        	{
	        	return -1;  // height of empty tree is -1        	
	        	}
	        return 1 + Math.max(getHeight(node.leftlink), getHeight(node.rightlink));
	    }
	 
	 public static int noofleaves(TreeNode node) {
	        if (node == null)
	        	{
	        	return 0;
	        	}
	        if (node.leftlink == null && node.rightlink == null)
	        	{
	        	return 1;	        	
	        	}
	        return noofleaves(node.leftlink) + noofleaves(node.rightlink);
	    }
	 
	 public static void inorder(TreeNode node) {
			if(node == null) {
				return;
			}
			
			inorder(node.leftlink); // traverse left subtree
			System.out.print(node.value+" "); // print the root
			inorder(node.rightlink); // traverse right subtree
		}
	 
	 public static void preorder(TreeNode node) {
		 
			if(node == null) {
				return;
			}
			
			System.out.print(node.value+" "); // print the root
			preorder(node.leftlink); // traverse left subtree
			preorder(node.rightlink); // traverse right subtree
		}
	 
	 public static void postorder(TreeNode node) {
		 
			if(node == null) {
				return;
			}
			
			postorder(node.leftlink); // traverse left subtree
			postorder(node.rightlink); // traverse right subtree
			System.out.print(node.value+" "); // print the root
		}
	 
	 public static void infixWithParentheses(TreeNode node) {
	        if (node != null) {
	            // If the node is an operator, add parentheses
	            if (node.value == '+' || node.value == '-' || node.value == '*' || node.value == '/') {
	                System.out.print("(");
	            }

	            // Traverse left subtree
	            infixWithParentheses(node.leftlink);

	            // Print the current node's data
	            System.out.print(node.value);

	            // Traverse right subtree
	            infixWithParentheses(node.rightlink);

	            // If the node is an operator, close parentheses
	            if (node.value == '+' || node.value == '-' || node.value == '*' || node.value == '/') {
	                System.out.print(")");
	            }
	        }
	 }
}
