package AllDuplicatesInAnArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDuplicatesInAnArray {
    public static void main(String[] args) {
        int current=0;
        int nums[] = {4,3,2,7,8,2,3,1};
        while (current<nums.length){
            int correctIndex= nums[current]-1;
            if(nums[correctIndex]!=nums[current]){
                swap(nums,current,correctIndex);
                continue;
            }
            current++;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(duplicates(nums));
    }

    static  void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =temp;
    }

   static List<Integer> duplicates(int nums[]){
        List<Integer> dup =  new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]!= i+1){
                dup.add(i+1);
            }
        }
        return dup;
    }

}
