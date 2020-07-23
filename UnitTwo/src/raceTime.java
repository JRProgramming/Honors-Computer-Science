import java.util.Scanner;
public class raceTime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What was the event's start time?");
		int startHour = input.nextInt(), startMinute = input.nextInt(), startSecond = input.nextInt();
		System.out.println("What was the event's finish time?");
		int finishHour = input.nextInt(), finishMinute = input.nextInt(), finishSecond = input.nextInt();
		int timeDurationSeconds = (finishHour*3600 + finishMinute*60 + finishSecond) - (startHour*3600 + startMinute*60 + startSecond);
		int raceHour = timeDurationSeconds/3600;
		int raceMinute = (timeDurationSeconds%3600)/60;
		int raceSeconds = timeDurationSeconds%60;
		System.out.println("The event lasted for " + raceHour + " hours and " + raceMinute + " minutes and " + raceSeconds + " seconds.");
	}
}
