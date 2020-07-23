
public class TenRandomInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		for(int i=0;i<10;i++) {
			array[i] += (int)(Math.random()*100);
		}
		int[] origArray = new int[10];
		for(int i=0;i<10;i++) {
			origArray[i] += array[i];
		}
		for(int i=array.length-1;i>-1;i--) {
			for(int j=0;j<i;j++) {
				if(Math.max(array[j], array[j+1]) == array[j]) {
					int max = array[j];
					int min = array[j+1];
					array[j] = min;
					array[j+1] = max;
				}
			}
		}
		for(int e: array) {
			System.out.print(e + " ");
		}
		System.out.println();
		for(int e: origArray) {
			System.out.print(e + " ");
		}
	}

}
