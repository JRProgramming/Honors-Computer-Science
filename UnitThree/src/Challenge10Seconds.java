import java.util.Scanner;
public class Challenge10Seconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 0 and press “Enter” to start the clock.");
		int okay = input.nextInt();
		double startTime = System.currentTimeMillis();
		System.out.println("Now count 10 seconds in your head.  Enter a 0 and press “Enter” at 10 seconds.");
		okay = input.nextInt();
		double endTime = System.currentTimeMillis();
		double seconds = (endTime - startTime)/1000;
		double error = ((Math.abs(10-seconds))*10);
		System.out.println("The time was " + seconds + " seconds.  You missed by " + error + "%.");
	}

}
