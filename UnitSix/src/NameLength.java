import java.util.Scanner;
public class NameLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.next();
		System.out.println(name + " has " + name.length() + " letters.");
	}

}
