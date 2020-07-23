import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double pi = 3.1416;
		System.out.println("Enter the radius of the circle.");
		double radius = input.nextDouble();
		double area = Math.pow(radius,  2)*pi;
		double circumference = 2*radius*pi;
		System.out.println("The area of the circle is " + area);
		System.out.println("The circumference of the circle is " + circumference);
	}

}
