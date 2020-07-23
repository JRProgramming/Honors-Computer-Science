import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your 4 quiz grades, separated by spaces");
		int grades[] = new int[4];
		double average = 0;
		double highest = 0;
		for(int i=0;i<grades.length;i++) {
			grades[i] = input.nextInt();
			average += grades[i];
			if(Math.max(highest, grades[i]) == grades[i]){
				highest = grades[i];
			}
		}
		average /= 4;
		System.out.println("The quiz average is " + average);
		System.out.println("The higest score is " + highest);
		
	}

}
