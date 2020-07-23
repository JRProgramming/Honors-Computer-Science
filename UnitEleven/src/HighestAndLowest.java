
public class HighestAndLowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		for(int i=0;i<5;i++) {
			array[i] = (int)(Math.random()*10);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		int max = array[0];
		int min = array[0];
		for(int e: array) {
			if(Math.max(e, max) == e) {
				max = e;
			}
			if(Math.min(e,  min) == e) {
				min = e;
			}
		}
		int maxPosition = 0;
		int minPosition = 0;
		for(int i=0;i<5;i++) {
			if(array[i] == max) {
				maxPosition = i;
			}
			if(array[i] == min) {
				minPosition = i;
			}
		}
		System.out.println("The highest digit is " + max + ". It is in position " + maxPosition);
		System.out.println("The lowest digit is " + min + ". It is in position " + minPosition);
	}

}
