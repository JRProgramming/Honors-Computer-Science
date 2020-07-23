public class Os {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String o = "OOOOO";
		for(int i=0;i<60;i++) {
			double time = System.currentTimeMillis();
			while(System.currentTimeMillis() - time < 1000) {
			}
			for(int j=0;j<4;j++) {
				if(o.length() != 1 && o.length() != 10) {
					int random = (int)(Math.random()*2);
					if(random == 1) {
						o += "O";
						System.out.println(o);
					} else {
						o = o.substring(0, o.length()-1);
						System.out.println(o);
					}
				} else if(o.length() == 1) {
					o += "O";
					System.out.println(o);
				} else {
					o = o.substring(0, o.length()-1);
					System.out.println(o);
				}
				time = System.currentTimeMillis();
			}
		}
	}

}
