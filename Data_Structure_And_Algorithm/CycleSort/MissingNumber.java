package CycleSort;

import java.util.Arrays;

public class MissingNumber {
//268. Missing Number
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
    public static void main(String[] args) {
        int[] arr= {6,3,0,5,4,2,1};
        //Input: nums = [3,0,1,2]
        cycleSort(arr);
        int x=missingNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(x);
    }

    static  void  cycleSort(int[] arr){
        int i= 0;
        while (i<arr.length){
            int correctIndex = arr[i];
            if(correctIndex!=arr.length && arr[correctIndex]!= arr[i]){
                swap(arr,correctIndex,i);
            }else{
                i++;
            }
        }
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int missingNumber(int arr[]){

        for(int i=0;i<arr.length;i++){
            if(i!=arr[i]){
                return i;
            }
        }
        return arr.length;
    }
}
