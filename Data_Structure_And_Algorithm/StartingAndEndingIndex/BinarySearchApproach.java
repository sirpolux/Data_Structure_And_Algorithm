package StartingAndEndingIndex;

import java.util.Arrays;

public class BinarySearchApproach {
    public static void main(String[] args) {
        int[] data = {7,7,7,7,8,8,10};
        int target = 7;
        int[] ans= searchRange(data,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] searchRange(int[] nums, int target){
        int[] ans= {-1,-1};

        ans[0]=getPosition(nums,target,true);
        ans[1]=getPosition(nums,target,false);
        return  ans;
    }

    static int getPosition(int[]nums, int target, boolean startIndex){
        int start = 0;
        int end = nums.length-1;
        int position =-1;
        int mid=0;
        while(start<=end){
            mid = start + (end-start)/2;
           if (target<nums[mid]){
               end=mid-1;
           }else if(target>nums[mid]){
               start=mid+1;
           }else {
               position=mid;
               if (startIndex){
                   end=mid-1;
               }else {
                   start=mid+1;
               }
           }
        }
        return position;
    }
}
