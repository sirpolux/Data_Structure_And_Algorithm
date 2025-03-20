package ProvideTheIndexOfItemInfiniteArray;

public class IndexOfItem {
    public static void main(String[] args) {


        int[] nums = {1,4,6,7,9,10,11,13,15,16,18,19,22,24,26,28,30,31,33,35,37,39};
        int start=0;
        int end =start + 1;
        int target =13;
        while (target>nums[end]){
            int newStart = end+1;
            end = end + (end+1) * 2;
            start=newStart;
        }
        System.out.println(binarySearch(nums,start,end,target));
    }

    static int binarySearch(int[] nums, int start, int end, int target){
        int mid;
        while (start<=end){
            mid = start + (end-start)/2;
            if (target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
