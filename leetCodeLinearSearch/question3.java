//[Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)
import java.util.Arrays;

public class question3 {
    public static void main(String[] args) {
        int [] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(result(nums)));
        System.out.println(nums.length);
    }

    private static int[] result(int[] nums) {
        int [] ans = new int[nums.length];
        for (int i = 0; i< nums.length;i++){
            ans[i] = nums[nums[i]];
        }
    return ans;
    }

}
//ALHAMDULILLAH COMPLETED FIRST QUESTION WITH SUCCESS ALHAMDULILLAH
