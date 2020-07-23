import java.util.Scanner;
public class Factor3Or4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer on the interval [20,100).");
		double num = input.nextDouble();
		if(num >= 100 || num < 20 || num != (int)num)
			System.out.println("Invalid Entry");
		else {
			int intNum = (int)num;
			if(num%3 == 0 && num%4 == 0) 
				System.out.println(intNum + " has 4 and 3 as factors.");
			else if(num%3 == 0)
				System.out.println(intNum + " has 3 as a factor.");
			else if(num%4 == 0)
				System.out.println(intNum + " has 4 as a factor.");
			else 
				System.out.println(intNum + " does not have 3 or 4 as a factor.");
		}
	}

}
