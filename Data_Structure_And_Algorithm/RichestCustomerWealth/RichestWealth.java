package RichestCustomerWealth;

public class RichestWealth {
    public static void main(String[] args) {
        //Sample data
        //[[1,5],[7,3],[3,5]]
        int[][] accounts = {{1,5},{7,3}, {3,5}};
        int highestBalance= maximumWealth(accounts);
        System.out.println(highestBalance); //returns 10
    }

    static int maximumWealth(int[][] accounts){
        int highestWealth =Integer.MIN_VALUE;
        for(int[] persons: accounts){
            int currentBalance=0;
            for(int accountBalance: persons){
                currentBalance+=accountBalance;
            }
            if(currentBalance>highestWealth)
                highestWealth = currentBalance;
        }
        return highestWealth;
    }
}
