import java.util.Scanner;

public class SecondPattern {
    public static void main(String[] args) {
        int n;
        System.out.print("enter the no of lines :");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int row = 1;row<=n;row++){
            for(int column = 1;column<=n;column++){
                System.out.print("* ");
            }
            System.out.println();}
    }
}
