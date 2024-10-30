package SumOfDigits;

public class SumOfDigits {
    public static void main(String[] args) {
        int digits = 46375;
        int digitSum = sumOfDigits(digits);
        System.out.println(digitSum);
    }

    static int sumOfDigits(int digits){
        if (digits<=1){
            return digits;
        }
        int digit = digits%10;
        int remDigits = digits/10;
        return digit + sumOfDigits(remDigits);
    }
}
