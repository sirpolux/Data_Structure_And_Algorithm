package DuplicateNumber;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        cycleSort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(getRepeatedNumber(nums));
    }

    static void cycleSort(int[] nums){
        int i=0;
        while (i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[correctIndex]!= nums[i]){
                swap(nums,correctIndex,i);
            }else{
                i++;
            }
        }

    }
    static  void swap(int[] nums,  int x, int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    static int getRepeatedNumber(int[] nums){

        for (int i=0; i<nums.length;i++){
            if(nums[i]!=i+1)
                return nums[i];
        }
        return nums.length;
    }
}
