public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,10,11,12,13};
        int target = 5;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    public static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
