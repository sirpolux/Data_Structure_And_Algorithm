package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] num = {3,6,2,4,9,1};
        bubble(num);
        System.out.println(Arrays.toString(num));
    }

    static  void bubble(int[] arr){
        for(int x = 0; x<arr.length;x++){
            boolean swapped=false;
            for (int y =1; y< arr.length-x; y++){
                if(arr[y]<arr[y-1]){
                    int temp=arr[y-1];
                    arr[y-1]=arr[y];
                    arr[y]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
