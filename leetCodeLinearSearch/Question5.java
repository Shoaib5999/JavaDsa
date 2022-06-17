import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(sump(arr)));
    }

    public static int[] sump(int[] arr) {
    int sum = 0;
    int [] ans = new int[arr.length];
    for (int i = 0; i< arr.length;i++){
        ans[i]=sum+arr[i];
        sum =arr[i]+sum;
    }
    return ans;



        //            return new int[0];
    }
}
