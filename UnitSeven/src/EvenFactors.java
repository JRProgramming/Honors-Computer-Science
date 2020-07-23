import java.util.Scanner;
public class EvenFactors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer.");
		int num = input.nextInt();
		String number = "";
		for(int i=1;i<=num; i++) {
			if(i%2 == 0 && num%i==0) {
				number += i + " ";
			}
		}
		if(number.length() > 0) {
			number = number.substring(0, number.length()-1);
			System.out.println(num + " has " + number.length()/2 + " even factors: " + number + ".");
		} else {
			System.out.println(num + " has 0 even factors.");
		}
 	}
}
