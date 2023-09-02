package CeilNumber;

public class CeilNumber {
    public static void main(String[] args) {
        int[] sample1={3,5,7,9,11,13,15,19,21,24,28,29,34};
        int index=ceilNumber(sample1,10);
        System.out.println(index);

        int[] sample2={19,17,15,12,7,6,4,2,1};
        int index2 = ceilNumber(sample2,5);
        System.out.println(index2);
    }

    public static int ceilNumber(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid+1]>target && target>arr[mid]){
                    return mid+1;
                }
                if(arr[mid]>target){
                    end=mid;
                }else {
                    start=mid;
                }
            }else{
                if(arr[mid-1]>target && target>arr[mid]){
                    return mid-1;
                }
                if (arr[mid]>target){
                    start=mid;
                }else {
                    end=mid;
                }
            }
        }
        return -1;
    }
}
