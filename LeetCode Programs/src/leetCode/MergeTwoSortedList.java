package leetCode;

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

public class MergeTwoSortedList {

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		if (list1 == null && list2 == null)
			return null;

		if (list1 == null & list2 != null)
			return list2;

		if (list1 != null && list2 == null)
			return list1;

		ListNode head = new ListNode(0);
		ListNode list3 = head;

		while (list1 != null && list2 != null) {

			if (list1.val <= list2.val) {
				list3.next = list1;
				list1 = list1.next;
			} else {
				list3.next = list2;
				list2 = list2.next;
			}
			list3 = list3.next;
		}

		if (list1 != null)
			list3.next = list1;
		else if (list2 != null)
			list3.next = list2;

		return head.next;
	}

	public static void main(String[] args) {

		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(4);
		list1.next.next = new ListNode(4);

		ListNode list2 = new ListNode(3);
		list2.next = new ListNode(5);
		list2.next.next = new ListNode(6);

		ListNode head = mergeTwoLists(list1, list2);

		printList(head);

	}

	private static void printList(ListNode head) {

		while (head != null) {
			System.out.print(head.val);
			head = head.next;
		}
	}

}
