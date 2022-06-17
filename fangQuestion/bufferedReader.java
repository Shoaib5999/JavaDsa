import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        System.out.println("enter the value of a :");
        a = Integer.parseInt(obj.readLine());
        System.out.println("enter the value of b :");
        b = Integer.parseInt(obj.readLine());
        System.out.println("the sum is "+(a+b));
    }
}
