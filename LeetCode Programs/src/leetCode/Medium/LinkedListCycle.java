package leetCode.Medium;

public class LinkedListCycle {

	public static void main(String[] args) {

		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		head.next.next = new ListNode(0);
		head.next.next.next = new ListNode(-4);
		
//		int pos = 1;
		
		ListNode node = detectCycle(head);
		
		while(node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

	public static ListNode detectCycle(ListNode head) {

		ListNode slow = head, fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				break;
		}

		if (fast == null || fast.next == null)
			return null;

		while (head != slow) {
			head = head.next;
			slow = slow.next;
		}
		return head;
	}

}
