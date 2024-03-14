package leetCode;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class BinaryTreeInOrderTraversal {

	public static void main(String[] args) {

		TreeNode node = new TreeNode();
		node.val = 1;
		node.left = null;
		node.right = new TreeNode(2);
		node.right.left = new TreeNode(3);
		
		List<Integer> li = inorderTraversal(node);
		
		for(Integer l : li) {
			
			System.out.println(l);
		}
	}
	
	static List<Integer> res = new ArrayList<>();
    public static List<Integer> inorderTraversal(TreeNode root) {
        
        if (root != null) {        
            inorderTraversal(root.left);
            res.add(root.val);
            inorderTraversal(root.right);
        }
        return res;
    }

}
