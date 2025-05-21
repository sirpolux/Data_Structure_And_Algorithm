package LeetCodeInterviewQuestions.HappyNumber;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(19%10);
        System.out.println(19/10);
        System.out.println(1/10);
        System.out.println(0/10);
        System.out.println(isHappy(19));

    }

     static boolean isHappy(int n) {
        if(n<1){
            return false;
        }
        if(n==1){
            return true;
        }
        int tortoise=getSquareOfDigits(n);
        int hare=getSquareOfDigits(n);
            hare=getSquareOfDigits(hare);


        while(hare!=tortoise || hare==1){
            if(hare==1){
                return true;
            }
            tortoise = getSquareOfDigits(tortoise);
            hare= getSquareOfDigits(getSquareOfDigits(hare));
        }
        return false;
    }

     static int getSquareOfDigits(int num){
        int sum=0;
        while(num>0){
            int val = num%10;
            sum=sum+(val*val);
            num = (num-val)/10;
        }
        return sum;
    }
}
