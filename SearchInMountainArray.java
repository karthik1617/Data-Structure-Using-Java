package BinarySearch;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};
        int target = 9;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    public static int search(int[] arr, int target) {
        int peak=findPeakElement(arr);
        int Ascending=orderAgnosticBs(arr, target,0,peak);
        if(Ascending != -1)
            return Ascending;
        return orderAgnosticBs(arr, target,peak+1,arr.length-1);
    }
    public static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start!=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) {
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }
    public static int orderAgnosticBs(int[] arr, int target,int start,int end) {
        boolean isAscending = arr[start] < arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }

            if(isAscending) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            else {
                if(arr[mid]<target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
