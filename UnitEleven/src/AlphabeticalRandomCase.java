
public class AlphabeticalRandomCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] letters = new char[12];
		char[] origLetters = new char[12];
		for(int i=0;i<12;i++) {
			int random = (int)(Math.random()*2+1);
			if(random == 1) {
				letters[i] += Character.toLowerCase((char)((int)(Math.random()*26)+97));
				origLetters[i] += letters[i];
			} else {
				letters[i] += Character.toUpperCase((char)((int)(Math.random()*26)+97));
				origLetters[i] += letters[i];
			}	
		}
		for(int i=11;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(Math.max(Character.toLowerCase(letters[j]), Character.toLowerCase(letters[j+1])) == Character.toLowerCase(letters[j])) {
					char max = letters[j];
					char min = letters[j+1];
					letters[j] = min;
					letters[j+1] = max;
				}
			}
		}
		for(int i=0;i<12;i++) {
			System.out.print(origLetters[i] + " ");
		}
		System.out.println();
		for(int i=0;i<12;i++) {
			System.out.print(letters[i] + " ");
		}
	}
}
