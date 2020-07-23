import java.util.Scanner;
public class NumOfFours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] array = new int[4];
		for(int i=0;i<4;i++) {
			array[i] = input.nextInt();
		}
		int fourCount = 0;
		int oneCount = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i] == 4) {
				fourCount ++;
			} else if(array[i] == 1) {
				oneCount ++;
			}
		}
		System.out.println(fourCount >= oneCount);
	}

}
