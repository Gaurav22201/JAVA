import java.util.Stack;

public class stckpushpop {
	public static void pushinstck(Stack<Integer> stck, int data) {
		stck.push(data);
		System.out.println("Pushed "+data);
		System.out.println("Stack: "+stck);
	}
	
	public static void popfromstck(Stack<Integer> stck) {
		Integer x = (Integer)stck.pop();
		System.out.println("Popped: "+x);
		System.out.println("Stack: "+stck);
	}

	public static void main(String[] args) {
		Stack<Integer>stck = new Stack<>();
		
		pushinstck(stck, 1);
		pushinstck(stck, 2);
		pushinstck(stck, 3);
		pushinstck(stck, 4);
		popfromstck(stck);
		popfromstck(stck);

	}

}
