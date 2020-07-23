import java.util.Scanner;
public class Threes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] array = new int[6];
		for(int i=0;i<6;i++) {
			array[i] = input.nextInt();
		}	
		int three = 0;
		boolean threeAppearance = false;
		boolean adjacentThree = false;
		for(int i=0;i<array.length;i++) {
			if(array[i] == 3) {
				three++;
				if(threeAppearance)
					adjacentThree = true;
				threeAppearance = true;
			} else { 
				threeAppearance = false;
			}
		}
		System.out.println(!adjacentThree && three == 2);
	}	

}
