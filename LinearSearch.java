class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 11;
        int ans=linearSearch(nums,target);
        System.out.println(ans);
    }
     static int linearSearch(int[] arr, int target) {
        if(arr.length==0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
             if (element == target) {
                 return i;
             }
         }
//         for(int ele : arr){
//             if(ele==target){
//                 return ele;
//             }
//         }
        return -1;
     }
}
