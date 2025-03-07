package Even_Number_Of_Digits_In_An_Integer;

public class EvenNumberOfDigits2 {
    public static void main(String[] args) {

    }





    private static boolean isEven(int len){
        return len%2==0;
    }

    private static int getSize(String num){
        return (int)(Math.log10(Integer.parseInt(num))+1);
    }

}
