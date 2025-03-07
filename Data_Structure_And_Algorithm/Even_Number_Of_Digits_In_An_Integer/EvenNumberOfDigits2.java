package Even_Number_Of_Digits_In_An_Integer;

public class EvenNumberOfDigits2 {
    public static void main(String[] args) {
        int [] sampleData = {12,345,2,6,7896};
    }


    static int findNumbers(int[] nums){
        int evenCount =0;
        for (int num:nums){
            if (isEven(num)){
                evenCount++;
            }
        }
        return evenCount;
    }

   private static boolean isEven(int num){
        return getSize(num)%2==0;
    }
    private static int getSize(int num){
        return (int)(Math.log10(num)+1);
    }

}
