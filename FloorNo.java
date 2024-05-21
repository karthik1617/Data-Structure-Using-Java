package BinarySearch;

public class FloorNo {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=6;
        int ans=floorNo(arr,target);
        System.out.println(ans);
    }
    public static int floorNo(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
