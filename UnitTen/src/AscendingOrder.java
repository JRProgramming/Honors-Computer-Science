import java.util.Scanner;
public class AscendingOrder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bill = new Scanner(System.in);
		System.out.println("How many numbers would you like to enter?");
		int numnum = bill.nextInt();
		double [] nums = new double[numnum];
		System.out.print("Please enter the numbers, separated by spaces.");
		for (int i=0;i<numnum;i++)
			nums[i]=bill.nextDouble(); 
		for (int j=nums.length-1;j>0;j--)
		{	
			for (int i=0;i<j;i++)
				if (nums[i]>nums[i+1]) {
					double temp = nums[i];
					nums[i]=nums[i+1];
					nums[i+1]=temp;
				}
		}
		for (int k = 0;k<nums.length;k++)
			System.out.print(nums[k]+" ");
	}
}

