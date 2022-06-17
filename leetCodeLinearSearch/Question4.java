// [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(Arrays.toString(concatination(nums)));
    }

    static int[] concatination(int[] nums) {
        int [] ans = new int[2* nums.length];
        int temp = 0;
        for (int i = 0; i < ans.length; i ++){
            if (i< nums.length){
                ans[i]=nums[i];

            }else{
                //while(temp< nums.length){
                    ans[i]= nums[temp];
                    temp++;
                  //  i++;
                //}

            }
        }
      return ans;
        //            return new int[0];
    }
}

//ALHAMDULILLAH COMPLETED THE FIRST PROGRAM SUCCESSFULLY THANKS TO ALLAH
