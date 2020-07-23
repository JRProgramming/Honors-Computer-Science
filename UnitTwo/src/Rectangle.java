import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the width of the rectangle");
		double width = input.nextDouble();
		System.out.println("Enter the length of the rectangle");
		double length = input.nextDouble();
		double area = width * length;
		double perimeter = 2*width + 2*length;
		System.out.println("The area of the rectangle is " + area + "units squaed.");
		System.out.println("The perimeter of the rectangle is " + perimeter + " units");
	}

}
