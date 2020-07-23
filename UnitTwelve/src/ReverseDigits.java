import java.util.Scanner;
public class ReverseDigits
{
	public static void main(String[] args)
	{
		Scanner joe = new Scanner(System.in);
		System.out.println("Please enter 2 integers, separated by a space.");
		int first = joe.nextInt(); //notice nextInt() is a method of the Scanner class.
		int second = joe.nextInt();
		int answer = sum(first,second);// this line calls the “sum” method, written below.
		System.out.println("The sum of the integers between "+Math.min(first, second)+" to "+Math.max(first, second)+" is " + answer);
	}
		public static int sum(int i1,int i2)
		{ 			
			int low = Math.min(i1,i2);
			int hi = Math.max(i1,i2);
			int tot = 0;
			for (int i = low + 1;i<hi;i++)
				tot +=i;
			return tot;
		}
}	