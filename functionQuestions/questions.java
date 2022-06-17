import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
//        question 14.Write a function that returns the sum of first n natural numbers
    int value = sumN();
        System.out.println(value);
    }

    private static int sumN() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        while(n>0){
            sum = sum+n;
            n=n-1;
        }
        return sum;

    }
}
