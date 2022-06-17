import java.util.Arrays;

public class question5 {
    public static void main(String[] args) {
//        Given an array of integers nums and an integer target
//        , return indices of the two numbers such that they add up to target.

        //note 1 that the arrat is not sorted we cannot use binary search
        int[] nums = {2,5,5,11};
        int target = 10;
        System.out.println(Arrays.toString(sumIndex(nums,target)));
//        ans should be 0,1


    }
    static int[] sumIndex(int[] arr,int target){
        for(int i = 0; i<arr.length;i++){
            for (int j = 0 ;j< arr.length;j++){
                if(i!=j){
                if (arr[i]+arr[j]==target){
                    return new int [] {i,j};
                }}
            }
        }
    return new int[] {-1,-1};}
}
