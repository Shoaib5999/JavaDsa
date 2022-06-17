//public class questiom {
//    public static void main(String[] args) {
//        //take input for a 2d matrixx and show the output
//        Scanner in = new Scanner(System.in);
//        int [][] arr = new int[3][4];
//        for(int i=0 ; i<3 ; i++){
//            for (int j = 0; j<4 ; j++){
//                arr[i][j] = in.nextInt();
//            }
//        }
//        for(int i=0 ; i<3 ; i++){
//            for (int j = 0; j<4 ; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}

//here we are doing linear search with 2d arrays

import java.util.Arrays;

public class questiom {
    public static void main(String[] args) {
        int[][] arr ={
            {2,4,5},
            {8,15,11},
                {23,42,99}
        };

        System.out.println("program executed successfully :)");
        int target= 99;
        System.out.println(Arrays.toString(search(arr,target)));
    }

//    public static int[] search(int[][] arr, int target) {
//        for (int i = 0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                if (arr[i][j]==target){
//
//                    return new int[]{i,j};
//                }
//            }
//            System.out.println();
//        }
//        return new int[]{-1,-1};
//    }
}

//find maximum value of element in 2d array
import java.util.Arrays;
public class questiom {
    public static void main(String[] args) {
        int[][] arr ={
            {2,4,5},
            {8,15,11},
                {23,42,99}
        };

        System.out.println("program executed successfully :)");
        System.out.println(search(arr));
    }

    public static int search(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]>max){

                    max=arr[i][j];
                }

                }
            System.out.println();
             }

        }
}


