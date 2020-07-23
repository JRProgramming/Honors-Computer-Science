import java.util.Scanner;
public class QuizPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the base that you are about to enter the number in?");
		double base = input.nextDouble(); //base of the number about to be inputed
		if(base != (int)base || base <= 0) { //if a decimal or any other character that wasn't a number was inputed, or if something greater than 10 or less than 0 was inputed
			System.out.println("Invalid entry.");
		} else if(base > 10 || base < 17) {
			int numValue = 0;
			char letterValue = ' ';
			String limitValue = "";
			switch (letterValue) {
			case 'a': numValue = 11;
			break;
			case 'b': numValue = 12;
			break;
			case 'c': numValue = 13;
			break;
			case 'd': numValue = 14;
			break;
			case 'e': numValue = 15;
			break;
			case 'f': numValue = 16;
			break;
			}
			switch ((int)base) {
			case 11: limitValue = "a";
			break;
			case 12: limitValue = "b";
			break;
			case 13: limitValue = "c";
			break;
			case 14: limitValue = "d";
			break;
			case 15: limitValue = "e";
			break;
			case 16: limitValue = "f";
			break;
			default: limitValue = "" + (char)(base+97);
			}
			System.out.println("Enter a number is base-" + (int)base + " with digits ranging from (0-" + limitValue + ".");
		} else {
			System.out.println("Enter a number in base-" + (int)base + " with digits ranging from (0-" + (int)(base-1) + ").");
			double num = input.nextDouble(); //number in that specific base
			int digs = 0; //variable that will store the number of digits in that number
			while((int)(num/Math.pow(10, digs)) > 0) { 
				digs += 1;
				/*//runs a loop that divides the number by 10  to the nth power 
				 * to count the number of digits
				 */
			}
			boolean invalidNumber = false; //checks to see if the number contains a digit that is higher than it is supposed to be
			for(int i=0;i<digs; i++) { //runs a loop to see if each digit contains a number that is within the appropriate boundary
				int numAtIndex = (int)(num/Math.pow(10, i)%10); //takes the number at that index
				if(numAtIndex >= base) {
					invalidNumber = true; //the number is too high
				}
			}
			if(num <= 0 || num != (int)num) {
				invalidNumber = true; //number is too low or number is a decimal or contains an inappropriate character
			}
			if(invalidNumber)
				System.out.println("Invalid entry.");
				/*if a decimal or any other character that wasn't a number was inputed
				 Or if the number in the sequence was greater than 0 */
			else { //number is in valid format
				System.out.println("What base would you like to convert " + (int)num + " to?");
				double newBase = input.nextDouble(); //base that the number is being converted to
				if(newBase != (int)newBase || base > 10 || base <= 0) { //if a decimal or any other character that wasn't a number was inputed, or if something greater than 10 or less than 0 was inputed
					System.out.println("Inavlid entry.");
				} else { //number is in valid format
					int origNum = (int)num; //creates a copy of the number for later
					int digits = 0; //variable that will store the number of digits in that number
					while((int)(origNum/Math.pow(10, digits)) > 0) { 
						digits += 1;
						/*//runs a loop that divides the number by 10  to the nth power 
						 * to count the number of digits
						 */
					}
					int ans = 0; //variable that will store the number in base-10 form
					for(int i=0;i<digits;i++) { //runs a loop that takes each digit in the number and do some calculation
						int digNum = (int)(num/Math.pow(10, i)%10); //extracts the number from each digit
						ans += (int)(digNum*Math.pow(base, i)); //adds the converted base-10 number to the variable
					}
					int i=0; //variable that will see what power the number can reach
					while(ans>Math.pow(newBase, i)) { //runs a loop until an exponent gets higher than the number
						i+=1; 
					}
					int answer = 0; //variable that will store the final product
					for(int j=i;j>-1;j--) { //runs a loop that converts the base-10 form to the new base form
						int dig = (int)(ans/Math.pow(newBase, j)); //goes through each exponent and divides it out
						ans -= (int)(dig*Math.pow(newBase, j)); //subtracts from each exponent after dividing
						answer += (int)(Math.pow(10, j)*dig); //adds the quotient to the answer
					}
					System.out.println(origNum + " in base-" + (int)(base) + " is equal to " + answer + " in base-" + (int)newBase + "."); //output
				}
			}
		}
	}
}
