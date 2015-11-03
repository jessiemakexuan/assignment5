package stack;

import java.util.LinkedList;

/*using queue to realize stack's operations(simulate a queue by using a linked list)
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * empty() -- Return whether the stack is empty.*/
//queue->FIFO stack->FILO
class MyStack {
	LinkedList<Integer> queue=new LinkedList<Integer>();
	// Push element x onto stack.
	public void push(int x) {
		queue.add(x);
	}

	// Removes the element on top of the stack.(find the last one and pop it)
	public void pop() {
		int nums[]=new int[queue.size()];
		for(int i=0;i<nums.length;i++){
			nums[i]=queue.pop();
		}
		for(int i=0;i<nums.length-1;i++){
			queue.add(nums[i]);
		}

	}

	// Get the top element.(find the last one)
	public int top() {
		int nums[]=new int[queue.size()];
		for(int i=0;i<nums.length;i++){
			nums[i]=queue.pop();
		}
		for(int i=0;i<nums.length;i++){
			queue.add(nums[i]);
		}
		return nums[nums.length-1];
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return queue.isEmpty();
	}
}



