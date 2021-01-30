import java.util.Random; 

public class Client {
	public static void main(String[] args) {
		Random rnd = new Random();
		Stack stack = new Stack();
		for(int i=0;i<10;i++) {
			stack.push((int)(rnd.nextFloat()*10));
			System.out.println(stack);
		}
		for(int i=0;i<10;i++) {
			System.out.println(stack.pop());
		}
	}
}
