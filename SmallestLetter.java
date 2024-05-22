package BinarySearch;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target = 'j';
        char ans=smallestLetter(letters,target);
        System.out.println(ans);
    }
    public static char smallestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return letters[start%letters.length];
    }
}
