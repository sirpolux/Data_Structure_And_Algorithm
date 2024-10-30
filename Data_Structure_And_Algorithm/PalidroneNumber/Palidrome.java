package PalidroneNumber;

public class Palidrome {

    public static void main(String[] args) {
        long number= 123211;
        long base = getLongestPlaceVal(number);
        long result = reverseNumber(number, base);
        System.out.println(result);

        if (result==number){
            System.out.println("Is a palidron number");
        }else{
            System.out.println("Not a palidrone number");
        }

    }

    static long reverseNumber(long number, long base){
        if (number<=1){
            return  number;
        }
        return ((number%10) * base) +  reverseNumber(number/10, base/10);

    }

    static long getLongestPlaceVal(long number){
        long base= 1;
        while (number>9){
            number/=10;
            base*=10;
        }
        return  base;
    }
}
