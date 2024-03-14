package leetCode;

import java.util.ArrayList;
import java.util.List;

class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
};

public class N_aryTreePreOrderTraversal {

	public static void main(String[] args) {

		Node root = new Node(1);
        root.children.add(new Node(2));
        root.children.add(new Node(3));
        root.children.add(new Node(4));
		root.children.get(0).children.add(new Node(5));
		root.children.get(0).children.add(new Node(6));
		
		List<Integer> li = preorder(root);
		
		for(Integer i : li) {
			System.out.println(i);
		}
		
	}

	static List<Integer> arr = new ArrayList<>();

	public static List<Integer> preorder(Node root) {

		if (root == null)
			return arr;
		arr.add(root.val);
		for (Node i : root.children) {
			preorder(i);
		}
		return arr;

	}
}
