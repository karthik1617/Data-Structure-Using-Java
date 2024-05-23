package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target=13;
        int ans=findRange(arr,target);
        System.out.println(ans);
    }
    public static int findRange(int[] arr,int target){
        int start=0;
        int end=2;
        while(target>arr[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(int[] arr, int target,int start, int end) {
        while(start<=end){
            int mid=start+(end-start)/2 ;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
