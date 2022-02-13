import java.util.Scanner;

public class circlesummary {
	public static void circumarea(int i) {
		System.out.println("Area: "+(3.14*i*i));
		System.out.println("Circumference: "+(3.14*2*i));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		circumarea(x);
		sc.close();


	}

}
