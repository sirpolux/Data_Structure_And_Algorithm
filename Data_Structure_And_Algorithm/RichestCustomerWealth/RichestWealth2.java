package RichestCustomerWealth;

public class RichestWealth2 {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3}, {3,2,1},{3,2,3}};
        System.out.println(maximumWealth(accounts));
    }

    private static int maximumWealth(int[][] accounts){
        int richest = Integer.MIN_VALUE;
        for (int[] account:accounts){
            richest= Math.max(computeAccountTotal(account), richest);
        }
        return richest;
    }
    private static  int computeAccountTotal(int[] accounts){
        int sum =0;
        for (int balance:accounts){
            sum+=balance;
        }
        return sum;
    }
}
