import java.util.Scanner;



public class LeetCodeQuestions1 {
    public static void main(String[] args) {
//        1. [Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.]
//        (https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html)
    Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3  = in.nextInt();
        int n =max(n1,n1,n2);
            System.out.println(n);
    }
    static int max(int n1,int n2,int n3){
        return Math.max(n1,n2);
    }
}
