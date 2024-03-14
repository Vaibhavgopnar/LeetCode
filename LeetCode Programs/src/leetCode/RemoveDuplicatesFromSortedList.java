package leetCode;

//class ListNode {
//	int val;
//	ListNode next;
//
//	ListNode() {
//	}
//
//	ListNode(int val) {
//		this.val = val;
//	}
//
//	ListNode(int val, ListNode next) {
//		this.val = val;
//		this.next = next;
//	}
//}

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {

		ListNode head = new ListNode();
		head.val = 1;
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);
		
		ListNode node = deleteDuplicates(head);
		
		while(node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

	public static ListNode deleteDuplicates(ListNode head) {

		if (head == null)
			return null;

		ListNode current = head;

		while (current != null && current.next != null) {
			if (current.val == current.next.val) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return head;
	}

}
