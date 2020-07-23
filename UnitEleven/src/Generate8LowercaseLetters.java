public class Generate8LowercaseLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] letters = new char[8];
		char[] origLetters = new char[8];
		for(int i=0;i<8;i++) {
			letters[i] += (char)((int)(Math.random()*26)+97);
			origLetters[i] += letters[i];
		}
		for(int i=7;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(Math.max(letters[j], letters[j+1]) == letters[j]) {
					char max = letters[j];
					char min = letters[j+1];
					letters[j] = min;
					letters[j+1] = max;
				}
			}
		}
		for(int i=0;i<8;i++) {
			System.out.print(letters[i] + " ");
		}
		System.out.println();
		for(int i=0;i<8;i++) {
			System.out.print(origLetters[i] + " ");
		}
	}

}
