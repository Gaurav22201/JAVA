import java.util.Stack;

public class stcksearch {

	public static void main(String[] args) {
		Stack<String> stk= new Stack<>();  
		// pushing elements into Stack  
		stk.push("Apple");  
		stk.push("Grapes");  
		stk.push("Mango");  
		stk.push("Orange");  
		System.out.println("Stack: " + stk);  
		int loc = stk.search("Apple");
		System.out.println("Apple is at "+loc);
		System.out.println("Size of Stack: "+stk.size());

	}

}
