package CeilNumber;

public class CeilNumber {
    public static void main(String[] args) {
        int[] sample1={3,5,7,9,11,13,15,19,21,24,28,29,34};
        int index=ceilNumber(sample1,40);
        System.out.println(index);

        int[] sample2={19,17,15,12,7,6,4,2,1};
        int index2 = ceilNumber(sample2,30);
        System.out.println(index2);
    }

    public static int ceilNumber(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        if (isAsc)
            if(target>arr[end])
                return -1;
        if(!isAsc)
            if(target>arr[start])
                return -1;

        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                    if(target<arr[mid]){
                        end=mid-1;
                    }else {
                        start=mid+1;
                    }
            }else{
                    if (target<arr[mid]){
                        start=mid+1;
                    }else {
                        end=mid-1;
                    }
            }
        }
        return start;
    }
}
