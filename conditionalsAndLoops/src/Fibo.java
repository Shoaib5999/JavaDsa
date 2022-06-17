import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        int p = 0;
        int i = 1;
        int count = 2;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while(count<n){
            int temp = i;
           // p = i;
            i = i+p;
            p=temp;
            count++;
        }
        System.out.println(i);
    }
}
