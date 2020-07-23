public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "A";
		System.out.println(a);
		for(int i = 1;i<100; i++) {
			if(a.charAt(0) == 'A') {
				a = " A";
				System.out.println(a);
			} else {
				int random = (int)(Math.random()*2);
				if(random == 0)
					a = " " + a;
				else
					a = a.substring(1);
				System.out.println(a);
			}
		}
			
	}

}
