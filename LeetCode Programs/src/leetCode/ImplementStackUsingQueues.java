package leetCode;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {

	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();

	public ImplementStackUsingQueues() {

	}

	public void push(int x) {
		while (!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();
		}
		q1.add(x);

		while (!q2.isEmpty()) {
			q1.add(q2.peek());
			q2.remove();
		}
	}

	public int pop() {
		int val = q1.peek();
		q1.remove();
		return val;
	}

	public int top() {
		int val = q1.peek();
		return val;
	}

	public boolean empty() {
		return q1.isEmpty();
	}
	
	public static void main(String[] args) {
		
		ImplementStackUsingQueues myStack = new ImplementStackUsingQueues();
		myStack.push(1);
		myStack.push(2);
		int top = myStack.top(); // return 2
		int pop = myStack.pop(); // return 2
		boolean isEmpty = myStack.empty(); // return False
		
		System.out.println(top);
		System.out.println(pop);
		System.out.println(isEmpty);
	}
}
