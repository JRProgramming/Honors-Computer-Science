public class LoopForever {
	public static void use(long[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (long)Math.pow((double)arr[i], (double)i);
		}
		System.out.println(arr[1]);
	}
	
	public static void main (String[] args) {
		long arr[] = new long[65536];
		while(true) {
			for (int i = 0; i < arr.length; i++)
				arr[i] = (long)i;
			use(arr);
			arr = new long[arr.length * 3 / 2];
		}
	}
}
