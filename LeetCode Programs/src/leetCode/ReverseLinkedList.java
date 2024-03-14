package leetCode;

public class ReverseLinkedList {

	public static void main(String[] args) {

		ListNode list = new ListNode(1);
		list.next = new ListNode(4);
		list.next.next = new ListNode(6);
		list.next.next.next = new ListNode(2);

		ListNode head = reverseList(list);

		printList(head);

	}

	public static ListNode reverseList(ListNode head) {

		if (head != null) {
			ListNode temp = head;
			ListNode prev = null;
			ListNode next;

			while (temp != null) {
				next = temp.next;
				temp.next = prev;
				prev = temp;
				temp = next;
			}
			head = prev;
			return head;
		}

		return null;
	}

	private static void printList(ListNode head) {

		while (head != null) {
			System.out.print(head.val);
			head = head.next;
		}
	}

}
