public class Misc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfNumbers = 0;
		int i = 2;
		String compositeList = "";
		while(numberOfNumbers != 50) {
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					compositeList += i + ", ";
					numberOfNumbers ++;
					break;
				}
			}
			i ++;
		}
		compositeList = compositeList.substring(0, compositeList.length()-2);
		System.out.println(compositeList);
	}
}

