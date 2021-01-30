
public class Stack {
	int[] stack= {};
	public void push(int num) {
		int[] new_stack= new int[stack.length+1];
		for(int i=0;i<stack.length;i++) {
			new_stack[i]=stack[i];
		}
		new_stack[new_stack.length-1]=num;
		stack=new_stack;
	}
	public int pop() {
		int[] new_stack= new int[stack.length-1];
		int to_return=stack[stack.length-1];
		for(int i=0;i<new_stack.length;i++) {
			new_stack[i] = stack[i];
		}
		stack=new_stack;
		return to_return;
	}
	public String toString() {
		String output_str = "";
		for(int i=0;i<stack.length;i++) {
			output_str+=stack[i]+", ";
		}
		return output_str;
	}
}
