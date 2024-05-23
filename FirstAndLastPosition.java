package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 10;
        int ans[]=findPosition(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findPosition(int[] arr, int target) {
        int nums[]={-1,-1};
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] == target) {
                nums[0]=i;
                break;
            }
        }
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == target) {
                nums[1] = i;
                break;
            }
        }
     return nums;
    }
}
