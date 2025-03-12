package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {3, 7, 12, 18, 25, 31, 37, 42, 48, 53, 59, 65, 71, 78, 84, 90, 97, 103, 110, 118};
        System.out.println(binarySearch(sortedArray,25));
        System.out.println(binarySearch(sortedArray,18));
        System.out.println(binarySearch(sortedArray,28));
        System.out.println(binarySearch(sortedArray,-5));
    }

    private static int binarySearch(int[] arr, int target){
        int start = 0;
        int end =arr.length-1;
        int mid = 0;
        while (start<=end){
            mid = start+(end-start)/2;
            if (arr[mid]<target){
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
