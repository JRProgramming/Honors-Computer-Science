import java.util.Scanner;
public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two integers.");
		Scanner input = new Scanner(System.in);
		int first = input.nextInt(), second = input.nextInt();
		System.out.println(LCM(first, second));
	}

	public static int LCM(int first, int second) {
		int num = 0;
		for(int i=Math.min(first, second);i<=first*second;i++) {
			if(i%first == 0 && i%second == 0) {
				num = i;
				break;
			}
		}
		return num;
	}
}
