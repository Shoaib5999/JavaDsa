import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        for loop to print first 5 numbers
//        for (int num=1;num<=5;num++){
//            System.out.println(num);
//
//        }
        //Print from 1 to n
//        Scanner input = new Scanner(System.in);
//                int s = input.nextInt();
//        for (int n = 1; n<=s;n++){
//            System.out.println(n);
//        }
//        System.out.println("the program get executed successfully");
//        System.out.println(Math.max(23,Math.max(23,45)));
//        Scanner input = new Scanner(System.in);
//        char ch = input.next().charAt(2);
//        System.out.println(ch);


        // print all the 3 digits armstrong numbers
        //write a program to swap two numbers given by users
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a  = in.nextInt();
        System.out.print("Enter the value of b :");
        int b = in.nextInt();
        System.out.println("the value of a before swap is "+a);
        System.out.println("the value of b before swap is "+b);
        int temp;
        temp = a;
        a=b;
        b= temp;
        System.out.println("");
        System.out.println();
        System.out.println("the value of a before swap is " + a);
        System.out.println("the value of b before swap is " + b);

    }
}