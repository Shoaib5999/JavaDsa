import java.util.Arrays;

public class matrixRowColumn {
    public static void main(String[] args) {
        int [][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 37;
        System.out.println(Arrays.toString(search(arr,target)));

    }
    static int [] search(int arr[][] , int target){
        int r =0;
        int c = arr.length-1;
        while(r<arr.length&&c>=0){
            if (target == arr[r][c]){
                return new int[]{r,c};
            } else if (arr[r][c]>target) {
                c--;
            }else{
                r++;
            }
        }
    return new int[] {r,c};}
}
//ALHAMDULILLAH PROGRAM EXECUTED SUCESSFULLLY