import java.util.Scanner;

public class FirstPattern {
    public static void main(String[] args) {
        //first se how many rows are there and run the outer for loop how many times rows is
        System.out.print("Enter numbers of columns :");
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int row = 1;row<=n;row++){
            //now we will observe the pattern and see for how manyy times for each row column is running
            for(int column = 1;column<=row;column++){
                System.out.print("* ");
            }
            System.out.println();}

    }
}
