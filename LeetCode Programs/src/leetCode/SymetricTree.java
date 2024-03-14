package leetCode;

public class SymetricTree {

	public static void main(String[] args) {
		
		TreeNode node = new TreeNode();
		node.val = 1;
		node.left = new TreeNode(2);
		node.right = new TreeNode(2);
		node.left.left = new TreeNode(3);
		node.left.right = new TreeNode(4);
		node.right.left = new TreeNode(4);
		node.right.right = new TreeNode(3);
		
		boolean is = isSymmetric(node);
		System.out.println(is);
	}

	public static boolean isSymmetric(TreeNode root) {
        
	      if (root == null)
					return true;

				return isMirror(root.left, root.right);

	    }
	    public static boolean isMirror(TreeNode left, TreeNode right) {
			
			if (left == null && right == null) {
				return true;
			} else if (right == null || left == null) {
				return false;
			}

			if (left.val != right.val)
				return false;

			if (!isMirror(left.left, right.right))
				return false;
			if (!isMirror(left.right, right.left))
				return false;

			return true;
		}
}
