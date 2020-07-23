import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for(int i=1;i<=T;i++) {
            int N = input.nextInt();
            int B = input.nextInt();
            int[] housePrice = new int[N];
            for(int j=0;j<N;j++) {
                housePrice[j] = input.nextInt();
            }
            int Ai = affordableHouses(housePrice, B);
            System.out.println("Case #" + i + ": " + Ai);
        }
    }
    public static int affordableHouses(int[] array, int budget) {
        Arrays.sort(array);
        int sumOfHouses = 0;
        int index = 0;
        while(sumOfHouses <= budget) {
            sumOfHouses += array[index];
            index ++;
        }
        return index-1;
    }
}