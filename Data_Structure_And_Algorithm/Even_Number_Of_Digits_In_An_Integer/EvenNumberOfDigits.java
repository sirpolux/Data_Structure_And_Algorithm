package Even_Number_Of_Digits_In_An_Integer;

public class EvenNumberOfDigits {
    public  static  void  main(String[] args){
        int[] numSet = {647,7489,2,0,828,-939394,3939030,0};
        int evenCount = 0;
        for(int i:numSet){
            if(evenDigits(len(i)))
                evenCount++;
        }
        System.out.println(evenCount);
    }
    static boolean evenDigits(int len){
        return len%2==0;
    }
    static int len(int num){
        if(num<0)
            return (int)Math.log10(num * -1)+1;
        if(num==0)
            return 1;
        return (int)Math.log10(num)+1;
    }
}
