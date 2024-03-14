package leetCode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostOrderTraversal {

	public static void main(String[] args) {
		
		TreeNode node = new TreeNode();
		node.val = 1;
		node.left = null;
		node.right = new TreeNode(2);
		node.right.left = new TreeNode(3);
		
		List<Integer> li = postorderTraversal(node);
		
		for(Integer l : li) {
			
			System.out.println(l);
		}

	}
	
	static List<Integer> res = new ArrayList<>();

	public static List<Integer> postorderTraversal(TreeNode root) {
        if(root != null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            res.add(root.val);
        }
        return res;
    }

}
