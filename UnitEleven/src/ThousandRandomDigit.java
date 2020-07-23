public class ThousandRandomDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[1000];
		for(int i=0;i<1000;i++) {
			array[i] = (int)(Math.random()*10);
		}
		for(int e: array) {
			System.out.print(e);
		}
	}

}
