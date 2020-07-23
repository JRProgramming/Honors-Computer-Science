
public class BROOK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String brook = "brook";
		int x = 0;
		for(int i=1;i<=7; i++) {
			for(int j=0;j<i;j++) {
				System.out.print(brook.charAt(x%5));
				x++;
			}
			System.out.println();
		}
	}

}
