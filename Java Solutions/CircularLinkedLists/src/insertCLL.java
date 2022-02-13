public class insertCLL {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			next = null;
		}
	}
	
	public void printlist() {
		if(head !=null) {
			Node temp = head;
			
			do {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}while(temp!=head);
			
		}
	}
	
	public void insertf(Node last,int data) {
		if(head!=null) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
			last.next = head;
		}
	}
	
	public void insertmid(Node prev,int data) {
		if(head!=null) {
			Node nn = new Node(data);
			nn.next = prev.next;
			prev.next = nn;
		}
	}
	
	public void insertend(Node last,int data) {
		if(head!=null) {
			Node newnode = new Node(data);
			last.next = newnode;
			newnode.next = head;
		}
	}
	
	public static void main(String[] args) {
		insertCLL cllist = new insertCLL();
		
		cllist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		cllist.head.next = second;
		second.next = third;
		third.next = cllist.head;
		
		cllist.printlist();
//		cllist.insertf(third,0);
//		cllist.insertend(third, 0);
		cllist.insertmid(second, 0);
		cllist.printlist();
	}

}
