public class LockerQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] lockers = new boolean[1000];
		//true = open
		for(int i=0;i<lockers.length;i++) {
			lockers[i] = false;
		}
		for(int i=1;i<=lockers.length;i++) {
			for(int j=i;j<lockers.length;j+=i) {
				lockers[j] = !lockers[j];
			}
		}
		int leftOpen = 0;
		for(int i=0;i<lockers.length;i++) {
			if(lockers[i]) {
				leftOpen ++;
			}
		}
		System.out.println("The number of lockers left open were " + leftOpen);
	}

}
