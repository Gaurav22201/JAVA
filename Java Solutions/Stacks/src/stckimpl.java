import java.util.Stack;
public class stckimpl {

	public static void main(String[] args) {
		Stack<Integer>stck = new Stack<>();
		
	//check empty stack
		boolean emp = stck.empty();
		System.out.println(emp);
		
	//push items in stack
		stck.push(1);
		stck.push(2);
		stck.push(3);
		stck.push(4);
		stck.push(5);
		stck.push(6);
		
		//print elements in stack
		System.out.println(stck);
		emp = stck.empty();
		System.out.println(emp);
	}

}
