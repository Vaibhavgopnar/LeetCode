package leetCode;

public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		
		TreeNode node = new TreeNode();
		node.val = 1;
		node.left = new TreeNode(2);
		node.right = new TreeNode(2);
		node.left.left = new TreeNode(3);
		node.left.right = new TreeNode(4);
		node.right.left = new TreeNode(4);
		node.right.right = new TreeNode(3);
		node.right.right.left = new TreeNode(6);
		
		int depth = maxDepth(node);
		System.out.println(depth);
	}
	
	public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftheight = maxDepth(root.left);
        int rightheight = maxDepth(root.right);
        
        return Math.max(leftheight, rightheight) + 1;
	}

}
