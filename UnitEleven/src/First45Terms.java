public class First45Terms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[45];
		for(int i=0;i<45;i++) {
			array[i] = (3*i + 8);
		}
		for(int e: array) {
			System.out.println(e);
		}
	}

}
