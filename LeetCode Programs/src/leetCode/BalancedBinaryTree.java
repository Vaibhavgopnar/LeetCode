package leetCode;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		
		TreeNode node = new TreeNode();
		node.val = 1;
		node.left = new TreeNode(2);
		node.right = new TreeNode(2);
//		node.left.left = new TreeNode(3);
//		node.left.right = new TreeNode(4);
		node.right.left = new TreeNode(4);
		node.right.right = new TreeNode(3);
		node.right.right.left = new TreeNode(6);
		
		boolean isBalance = isBalanced(node);
		System.out.println(isBalance);

	}
	
	public static boolean isBalanced(TreeNode root) {

        return height(root) != -1;
    }

	static int height(TreeNode root){
        
        if (root == null) {
             return 0;
         }
         int leftHeight = height(root. left);
         if (leftHeight == -1) {
             return -1;
         }
         int rightHeight = height(root.right);
         if (rightHeight == -1) {
             return -1;
         }
         if (Math. abs(leftHeight - rightHeight) > 1) {
             return -1;
         }
         return Math.max(leftHeight, rightHeight) + 1;
    }

}
