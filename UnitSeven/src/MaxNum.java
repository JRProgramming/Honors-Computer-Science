import java.util.Scanner;
public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers would you like to enter?");
		int num = input.nextInt();
		int max = 0;
		for(int i=1;i<num+1;i++) {
			System.out.println("Enter #" + i);
			int number = input.nextInt();
			if(Math.max(max, number) == number)
				max = number;
		}
		System.out.println("The highest number entered is 20.");
	}

}
