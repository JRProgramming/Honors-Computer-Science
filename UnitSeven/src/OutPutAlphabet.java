public class OutPutAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isUpperCase = false;
		for(int j=0; j<40; j++) {
			String alphabet = "";
			for(int i = 97; i<123; i++) {
				alphabet += (char)i;
			}
			if(isUpperCase)
				alphabet = alphabet.toUpperCase();
			isUpperCase = !isUpperCase;
			System.out.println(alphabet);
		}
	}

}
