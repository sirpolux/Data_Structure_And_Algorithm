package FirstMissingPositive;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums={7,8,9,11,12};
        //int[] nums={3,4,-1,1};
        int currentPosition =0;
        while (currentPosition<nums.length){
            int correctLocation=nums[currentPosition];
            if(correctLocation<nums.length  && correctLocation>0 && nums[currentPosition]!=nums[correctLocation]){
                swap(nums,currentPosition,correctLocation);
                continue;
            }
            currentPosition++;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(firstMissing(nums));
    }

    static  void swap(int[] arr, int first, int  second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =temp;
    }

    static int firstMissing(int[] nums){
        int missingNum=nums.length;
        if (nums.length<2){
            if(nums[1]!=1){
                missingNum= 1;
            }else {
                missingNum= 2;
            }
        }
        for (int i=1; i<nums.length; i++){
            if(nums[i]!=i) {
                missingNum = i;
                break;
            }
        }
        return missingNum;
    }
}
