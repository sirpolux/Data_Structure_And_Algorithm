package DisappearedNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumber {
    public static void main(String[] args) {
        int[] arr ={4,3,2,7,8,2,3,1};
        disappearedNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findMissingNum(arr));
    }
    static void disappearedNumber(int[] arr){
        //PERFORM CYCLE SORT
        int i =0;
        while (i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[correctIndex]!= arr[i]){
                swap(arr,correctIndex,i);
            }else{
                i++;
            }
        }
    }

    static  void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static List<Integer> findMissingNum(int[] arr){
           List<Integer> missingNum = new ArrayList<>();
           for (int i=0; i<arr.length; i++){
               if(arr[i]!=i+1)
                   missingNum.add(i+1);
           }
           return  missingNum;
    }
}
