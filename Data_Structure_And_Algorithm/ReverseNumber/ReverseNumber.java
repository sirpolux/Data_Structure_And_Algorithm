package ReverseNumber;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345601;
        int reversed = reverseNumber(num, getBase(num));
        System.out.println(reversed);
        //System.out.println(getBase(123456));
    }

    static int reverseNumber(int number, int base){
        if (number<=1)
            return number;
        return (base*(number%10))+ reverseNumber(number/10, base/10);
    }

    static  int getBase(int number){
        int base=1;
        while (number>9){
            base*=10;
            number/=10;
        }
        return  base;
    }
}
