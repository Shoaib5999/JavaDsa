import java.awt.image.BandedSampleModel;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class questionsArr {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        int[] myArray = {1,3,5,4,2};   // so when we are initialising and assingning the values at the
        //same time in array we dont need to give the row space

        for (int i=0; i<= myArray.length;i++){
            int[] ans = {myArray[myArray[i]]};
            System.out.print(Arrays.toString(ans));
        }


    }
}
