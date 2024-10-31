package Sorted;

public class Sorted {

    public static void main(String[] args) {
        int[] numbers = {2,2,3,3,5,4,6,7,8};
        boolean isSorted = sorted(numbers,0, numbers.length - 1);
        System.out.println(isSorted);
    }

    static  boolean sorted(int[] numbers, int position, int len){
        if (position>=len){
            return  true;
        }
        if (numbers[position] <= numbers[position+1]){
            return  sorted(numbers,++position,len);
        }
        return false;

    }
}
