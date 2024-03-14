package leetCode;

public class MinimumDepthOfBT {

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
		
		int mindepth = minDepth(node);
		System.out.println(mindepth);
	}
	
	public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if(root.left == null && root.right == null)
             return 1;
        if(root.left == null)
             return 1 + minDepth(root.right);
        if(root.right==null)
             return 1+minDepth(root.left);

        int leftheight = minDepth(root.left);
        int rightheight = minDepth(root.right);
        
        return Math.min(leftheight, rightheight) + 1;
    }

}
