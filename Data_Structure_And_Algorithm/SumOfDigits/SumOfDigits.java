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
        return (digits%10) + sumOfDigits(digits/10);
    }
}
