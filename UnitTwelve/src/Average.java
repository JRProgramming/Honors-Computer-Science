import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers.");
		System.out.println(average(input.nextInt(), input.nextInt(), input.nextInt()));
	}
	public static double average(int n1, int n2, int n3) {
		return (n1+n2+n3)/3.0;
	}
}
