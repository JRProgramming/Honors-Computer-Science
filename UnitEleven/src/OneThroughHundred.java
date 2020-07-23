public class OneThroughHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[100];
		for(int i=0;i<100;i++) {
			array[i] = i;
		}
		for(int e:array) {
			System.out.println(e);
		}
	}

}
