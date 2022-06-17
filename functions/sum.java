import java.util.Arrays;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        //this is the simple sum function and here we will try to debug this to know how it is working properly
        sum();
        int arr[]={32,55,56,88};
        change(arr);
        String greet = greet();
    }

    static void change(int[] arr) {
        arr[0]=99;
        System.out.println(Arrays.toString(arr));
    }

    static String greet() {
        System.out.println("so here we dont need to write the function syntax just wee need to call the fun" );
    return "abc";

    }

    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first num :");
        int num1 = input.nextInt();
        System.out.print("Enter the second num :");
        int num2 = input.nextInt();
        System.out.println("the sum is :"+ (num1+num2));
    }
}
