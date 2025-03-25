package FindInMountainArray;

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length =  mountainArr.length()-1;
        int peakIndex = peakIndexMountainArray(mountainArr, 0, length);
        if(target>mountainArr.get(peakIndex-1)){
            if(mountainArr.get(peakIndex)==target){
                return peakIndex;
            }
            return agnosticBinarySearch(mountainArr, peakIndex, length, target);
        }
        int inIncreasingHalf = agnosticBinarySearch(mountainArr, 0, peakIndex, target);
        if(inIncreasingHalf!=-1){
            return inIncreasingHalf;
        }
        return agnosticBinarySearch(mountainArr, peakIndex+1, length, target);
    }



    static int peakIndexMountainArray(MountainArray arr, int start, int end){
        while (start<end){
            int mid = start + (end-start)/2;
            if (arr.get(mid)>arr.get(mid+1)){
                end=mid;
            }else {
                start=mid+1;
            }
        }
        return  start;
    }

    static  int agnosticBinarySearch(MountainArray arr, int start, int end, int target){
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr.get(mid) == target){
                return mid;
            }
            if (arr.get(start)<arr.get(end)){
                if (target>arr.get(mid)){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }else {
                if (target>arr.get(mid)){
                    end=mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return  -1;

    }

}
