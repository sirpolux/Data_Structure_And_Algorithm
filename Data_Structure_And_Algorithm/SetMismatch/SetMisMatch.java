package SetMismatch;

import java.util.Arrays;

public class SetMisMatch {

    public static void main(String[] args) {
        int currentIndex=0;
        int[] nums={1,2,2,4};
        while (currentIndex<nums.length){
            int correctIndex=nums[currentIndex]-1;
            if(nums[currentIndex]!= nums[correctIndex]){
                swap(nums, currentIndex, correctIndex);
                continue;
            }
            currentIndex++;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(misMatch(nums)));
    }

    static  void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =temp;
    }

    static int [] misMatch(int[] nums){
        int mis[] = new int[2];
        for(int i =0; i<nums.length; i++)
            if(nums[i]!=i+1) {
                mis[0]=nums[i];
                mis[1]=i+1;
            }
        return mis;
    }

}


