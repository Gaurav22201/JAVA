import java.util.Scanner;

public class agecheckVote {	
	public static void canVote(int age) {
		if(age>=18) {
			System.out.print("Can Vote.");
		}else {
			System.out.print("Can not Vote.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		canVote(x);
		sc.close();

	}

}
