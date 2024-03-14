package leetCode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreOrderTraversal {

	public static void main(String[] args) {
		
		TreeNode node = new TreeNode();
		node.val = 1;
		node.left = null;
		node.right = new TreeNode(2);
		node.right.left = new TreeNode(3);
		
		List<Integer> li = preorderTraversal(node);
		
		for(Integer l : li) {
			
			System.out.println(l);
		}

	}
	
	static List<Integer> res = new ArrayList<>();
    public static List<Integer> preorderTraversal(TreeNode root) {
         
        if (root != null) {   
            res.add(root.val);     
            preorderTraversal(root.left);
           
            preorderTraversal(root.right);
        }
        return res;
    }

}
