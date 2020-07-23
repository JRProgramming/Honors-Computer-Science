public class LookForSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		int numberOfSixes = 0;
		for(int i=0;i<10;i++) {
			array[i] = (int)(Math.random()*10);
			if(array[i] == 6) {
				numberOfSixes ++;
			}
		}
		int[] position = new int[numberOfSixes];
		int index=0;
		for(int i=0;i<10;i++) {
			if(array[i] == 6) {
				position[index] = i;
				index++;
			}
		}
		for(int e:array) {
			System.out.print(e + " ");
		}
		System.out.println();
		System.out.println("There are " + numberOfSixes + " 6's.");
		if(numberOfSixes != 0) {
			System.out.print("The 6's are in position ");
			for(int e:position) {
				System.out.print(e + ", ");
			}
		}
	}
}
