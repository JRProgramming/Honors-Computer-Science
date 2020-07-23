import java.util.Scanner;
public class FingerSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 0-Enter-0-Enter. The program will measure time between the enters.");
		int first0 = input.nextInt();
		double startTime = System.currentTimeMillis();	
		int second0 = input.nextInt();
		double endTime = System.currentTimeMillis();
		System.out.println("Your time is " + ((endTime-startTime)/1000));
	}

}
