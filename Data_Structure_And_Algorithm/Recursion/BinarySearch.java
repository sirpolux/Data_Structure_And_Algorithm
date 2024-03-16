package Recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {3,5,7,8,9,10,12,14,15};
        int target=11;
        int end = nums.length-1;
        System.out.println(search(nums,target,0,end));

    }

    static  int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }

        int m = s + (e-s)/2;
        if(arr[m]==target)
            return m;
        if(target<arr[m])
            return search(arr,target, s, m-1);
        return search(arr,target,m+1,e);
    }
}
