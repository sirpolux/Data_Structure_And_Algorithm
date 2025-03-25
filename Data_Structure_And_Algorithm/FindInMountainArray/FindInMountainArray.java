package FindInMountainArray;

public class FindInMountainArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7, 9, 11}; // Ascending
        int[] arr2 = {10, 8, 6, 4, 2, 0}; // Descending
        int[] mountainArray = {1, 3, 7, 12,13, 10, 5, 2};
    //    System.out.println(agnosticBinarySearch(arr1,0,arr1.length-1,11));
      //  System.out.println(agnosticBinarySearch(arr2,0,arr2.length-1, 10));
        //System.out.println(peakIndexMountainArray(mountainArray));
        MountainArray mountainArray1 = new MountainArray();

        int peak = peakIndexMountainArray2(mountainArray1, 0, mountainArray1.getSize());
       // System.out.println(agnosticBinarySearch2(mountainArray1,));
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

    static  int agnosticBinarySearch2(MountainArray arr, int start, int end, int target){
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr.getIndex(mid) == target){
                return mid;
            }
            if (arr.getIndex(start)<arr.getIndex(end)){
                if (target>arr.getIndex(mid)){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }else {
                if (target>arr.getIndex(mid)){
                    end=mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return  -1;

    }


    static int peakIndexMountainArray2(MountainArray arr, int start, int end){
        while (start<end){
            int mid = start + (end-start)/2;
            if (arr.getIndex(mid)>arr.getIndex(mid+1)){
                end=mid;
            }else {
                start=mid+1;
            }
        }
        return  start;
    }


    static int peakIndexMountainArray(int[] arr, int start, int end){
        while (start<end){
            int mid = start + (end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end=mid;
            }else {
                start=mid+1;
            }
        }
        return  start;
    }





}

class MountainArray{
    private final int[]  mountainArray = {1,2,3,4,5,3,1};
    private final int length = mountainArray.length;
    public int getIndex(int index){
        if (index>=length){
            return -1;
        }
        if (index<0){
            return -1;
        }
        return  mountainArray[index];
    }
    public int getSize(){
        return mountainArray.length;
    }
}
