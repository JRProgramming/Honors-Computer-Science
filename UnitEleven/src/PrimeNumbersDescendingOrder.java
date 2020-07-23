public class PrimeNumbersDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prime = new int[50];
		int num = 2;
		int primeCount = 0;
		boolean isPrime = true;
		while(primeCount < 50) {
			for(int i=2; i<num; i++) {
				if(num%i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				prime[primeCount] += num;
				primeCount ++;
			}	
			num ++;
			isPrime = true;
		}
		int[] reversePrime = new int[50];
		for(int i=0;i<50;i++) {
			reversePrime[49-i] = prime[i];
		}
		for(int e: reversePrime) {
			System.out.print(e + " ");
		}
	}
}
 