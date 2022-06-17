public class arrquestion1 {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        System.out.println(isMonotonic(nums));

    }
    static boolean isMonotonic(int[] nums){
        int i = 0;
        int j = 1;
        while(j<nums.length){
           if( nums[i]<=nums[j]){
               i++;
               j++;
           }else{
               return false;
           }
        }
    return true;}
}
