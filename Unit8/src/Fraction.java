import java.util.Scanner;
public class Fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the decimal portion of a number");
		double num = input.nextInt();
		boolean achieved = false;
		double x = 2;
		double j = 0;
		int y = 0;
		while(num/Math.pow(10, y) >= 1) {
			y++;
		}
		while(!achieved) {
			for(int i=1;i<x;i++) {
				if(i/x == (num/Math.pow(10, y))) {
					achieved = true;
					j = i;
					break;
				}
			}
			if(!achieved) {
				x++;
			}
		}
		System.out.println((num/Math.pow(10, y)) + " = " + (int)j + "/" + (int)x);
	}

}
