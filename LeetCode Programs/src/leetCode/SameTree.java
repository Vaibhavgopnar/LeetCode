package leetCode;

public class SameTree {

	public static void main(String[] args) {
		
		TreeNode node = new TreeNode();
		node.val = 1;
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		
		TreeNode node1 = new TreeNode();
		node1.val = 1;
		node1.left = new TreeNode(2);
		node1.right = new TreeNode(3);

		boolean isSame = isSameTree(node, node1);
		System.out.println(isSame);
	}
	
public static boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p == null && q == null){
            return true;
        }
        else if(p == null || q == null){
            return false;
        }
        if(p.val == q.val){
            if(isSameTree(p.right, q.right) && isSameTree(p.left, q.left)){
                if(p.val == q.val){
                    return true;
                }
            }
        }

        return false; 
    }

}
