package CeilNumber;

public class FloorNumber {

    public static void main(String[] args) {
        int[] sample1={3,5,7,9,11,13,15,19,21,24,28,29,34};
        int index=floorNumber(sample1,20);
        System.out.println(index);

        int[] sample2={19,17,15,12,7,6,4,2,1};
        int index2 = floorNumber(sample2,8);
        System.out.println(index2);
    }

    public static int floorNumber(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            //Handle increasing order
            if(arr[start]<arr[end]){
                if(arr[mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(arr[mid]<target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return  end;
    }
}
