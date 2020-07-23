public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		for(i = 1; i<2500; i++) {
			int num = i*4;
			int firstDig = i/1000;
			int secondDig = i/100%10;
			int thirdDig = i/10%10;
			int fourthDig = i%10;
			int reverse = fourthDig*1000 + thirdDig*100 + secondDig*10 + firstDig;
			if(num == reverse)
				break;
		}
		System.out.println(i);
	}

}
