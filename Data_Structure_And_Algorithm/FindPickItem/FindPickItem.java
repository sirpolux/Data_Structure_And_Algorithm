package FindPickItem;

public class FindPickItem {
    public static void main(String[] args) {
        int[]  nums = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 18, 16, 14, 12, 10, 8, 6, 5, 6, 3, 4, 2, 1};
        System.out.println(peakElement(nums));
    }

    static int peakElement(int[] nums){
        int start = 0;
        int end = nums.length;
        int mid =0;
        while (start<end){
            mid = start + (end - start)/2;
            if (nums[mid]> nums[mid+1]){
                end = mid;
            }else {
                start = mid +1;
            }
        }
        return nums[start];
    }
}
