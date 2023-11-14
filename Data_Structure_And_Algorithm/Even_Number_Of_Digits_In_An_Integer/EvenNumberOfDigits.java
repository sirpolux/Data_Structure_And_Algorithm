package Even_Number_Of_Digits_In_An_Integer;

public class EvenNumberOfDigits {
    public  static  void  main(String[] args){
        //Sample input
        int[] numSet = {555,901,482,1771};
        System.out.println(getEvenCount(numSet));
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

    static int getEvenCount(int[] nums){
        int evenCount = 0;
        for(int i:nums){
            if(evenDigits(len(i)))
                evenCount++;
        }
        return  evenCount;
    }

}
