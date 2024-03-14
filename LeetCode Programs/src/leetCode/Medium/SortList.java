package leetCode.Medium;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class SortList {

	public static void main(String[] args) {

		ListNode head = new ListNode(4);
		head.next = new ListNode(2);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(3);
		
		ListNode root = sortList(head);
		
		while(root != null) {
			System.out.println(root.val);
			root = root.next;
		}
	}

	public static ListNode sortList(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode middle = middleNode(head);
		ListNode secondHalf = middle.next;
		middle.next = null;

		return merge(sortList(head), sortList(secondHalf));

	}

	public static ListNode middleNode(ListNode node) {
		if (node == null) {
			return null;
		}

		ListNode a = node;
		ListNode b = node.next;

		while (b != null && b.next != null) {
			a = a.next;
			b = b.next.next;
		}
		return a;
	}

	public static ListNode merge(ListNode a, ListNode b) {
		ListNode temp = new ListNode();
		ListNode finalList = temp;

		while (a != null && b != null) {
			if (a.val < b.val) {
				temp.next = a;
				a = a.next;
			} else {
				temp.next = b;
				b = b.next;
			}
			temp = temp.next;
		}
		temp.next = (a == null) ? b : a;
		return finalList.next;
	}

}
