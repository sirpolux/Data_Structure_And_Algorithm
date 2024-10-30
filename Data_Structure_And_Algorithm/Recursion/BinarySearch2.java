package Recursion;

public class BinarySearch2 {

    public static void main(String[] args) {
        int[] nums = {3,5,7,9,11,13,14,15,18,20};
        int index = binarySearch(nums,12, 0, nums.length-1);
        System.out.println(index);
    }


    static int binarySearch(int[] arr, int target, int start, int end){
        if (start>end){
            return -1;
        }
        int mid = ((end - start)/2) + start;
        if (arr[mid]==target)
            return  mid;
        if (arr[mid]>target){
           return binarySearch(arr, target, start, mid-1);
        }
        return  binarySearch(arr, target, mid+1, end);
    }
}
