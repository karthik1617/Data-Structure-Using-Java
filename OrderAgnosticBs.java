public class OrderAgnosticBs {
    public static void main(String[] args) {
        //int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
       int [] arr={10,9,8,7,6,5,4,3,2,1};
        int target=9;
        int ans=orderAgnosticBs(arr,target);
        System.out.println(ans);
    }
    public static int orderAgnosticBs(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
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
