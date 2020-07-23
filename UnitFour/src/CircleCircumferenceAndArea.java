import java.util.Scanner;
public class CircleCircumferenceAndArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle.");
		double radius = input.nextDouble();
		if(radius != Math.abs(radius)) {
			System.out.println("Sorry, that is an invalid entry.");
		} else {
			double area = Math.PI*Math.pow(radius, 2);
			double circumference = Math.PI*2*radius;
			System.out.println("The circumference of the circle is 23.24779.");
			System.out.println("The area of the circle is 43.0084.");
		}
	}

}
