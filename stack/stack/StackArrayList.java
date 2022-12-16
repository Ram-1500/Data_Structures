package stack;

import java.util.EmptyStackException;
import java.util.ArrayList;


public class StackArrayList {

	 public static void main(String[] args) {
	        StackArrayList stack = new StackArrayList();
	        assert stack.isEmpty();

	        for (int i = 1; i <= 5; ++i) {
	            stack.push(i);
	            assert stack.size() == i;
	        }

	        System.out.print(stack.size() == 5);
	        assert stack.peek() == 5 && stack.pop() == 5 && stack.peek() == 4;

	        /* pop elements at the top of this stack one by one */
	        while (!stack.isEmpty()) {
	            stack.pop();
	        }
	        assert stack.isEmpty();

	        try {
	            stack.pop();
	            assert false;
	            /* this should not happen */
	        } catch (EmptyStackException e) {
	            assert true;
	            /* this should happen */
	        }
	    }
	 
	    private ArrayList<Integer> stack;

	    public StackArrayList() {
	        stack = new ArrayList<>();
	    }

	    public void push(int value) {
	        stack.add(value);
	    }

	    public int pop() {
	        if (isEmpty()) {
	            throw new EmptyStackException();
	        }
	        /* remove the element on the top of the stack */
	        return stack.remove(stack.size() - 1);
	    }

	    public boolean isEmpty() {
	        return stack.isEmpty();
	    }
	    
	    public int peek() {
	        if (isEmpty()) {
	            throw new EmptyStackException();
	        }
	        return stack.get(stack.size() - 1);
	    }

	    public int size() {
	        return stack.size();
	    }
}
