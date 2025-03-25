package FindInMountainArray;

public class FindInMountainArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7, 9, 11}; // Ascending
        int[] arr2 = {10, 8, 6, 4, 2, 0}; // Descending
        System.out.println(agnosticBinarySearch(arr1,0,arr1.length-1,11));
        System.out.println(agnosticBinarySearch(arr2,0,arr2.length-1, 10));
    }

    static  int agnosticBinarySearch(int[] arr, int start, int end, int target){
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if (arr[start]<arr[end]){
                if (target>arr[mid]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }else {
                if (target>arr[mid]){
                    end=mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return  -1;

    }

    static int peakIndexMountainArray(){
        return  -1;
    }


}
