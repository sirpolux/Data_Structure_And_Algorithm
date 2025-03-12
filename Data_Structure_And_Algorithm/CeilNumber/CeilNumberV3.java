package CeilNumber;

public class CeilNumberV3 {
    public static void main(String[] args) {

        int[]  numberSet = {2,3,5,9,14,16,18};
        System.out.println(ceilNumber(numberSet,14));
        System.out.println(ceilNumber(numberSet,15));
        System.out.println(ceilNumber(numberSet,19));


        
    }
    private static int ceilNumber(int[] arr, int target){
        int start = 0;
        int end =arr.length-1;
        int mid = 0;
        while (start<=end){
            mid = start+(end-start)/2;
            if (arr[mid]<target){
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }else {
                return mid;
            }
        }
       //return start;
        //System.out.println("len : "+ arr.length);
        //System.out.println("start : "+ start);
        if (start>arr.length-1){
            return -1;
        }
        return start;
        //return start>=arr.length?start:-1;
    }
}
