import java.util.Scanner;
public class SENDMOREMONEY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int s = 0;
		int e = 0;
		int n = 0;
		int d = 0;
		int m = 0;
		int o = 0;
		int r = 0;
		int y = 0;
		int money = 0;
		int i = 0;
		int j = 0;
		boolean unique = true;
		for(i=1000;i<=10000;i++) {
			s = i/1000;
			e = i/100%10;
			n = i/10%10;
			d = i%10;
			for(j=1000;j<10000;j++) {
				if(j%10 == e) {
					m = j/1000;
					o = j/100%10;
					r = j/10%10;
					y = (d + e)%10;
					money = m*10000 + o*1000 + n*100 + e*10 + y;
					if(i+j == money) {
						System.out.println("C:" + i + " " + j + " " + money);
						int[] array = { s, e, n, d, m, o, r, y };
						for(int x=0;x<array.length;x++) {
							for(int z=0;z<array.length;z++) {
								if(array[x] == array[z])
									unique = false;
							}
						}
						if(unique) 
							break;
					}
				}
			}
			if(i + j == money && unique)
				break;
		}
		System.out.println(i);
		System.out.println(j);
		System.out.println(money);
	}

}




