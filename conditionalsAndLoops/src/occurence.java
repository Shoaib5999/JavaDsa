import java.util.Scanner;

public class occurence {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
        int num = 77777579;
        int count = 0;
        while (num>0){
            if (num%10==7){
                count++;

            }
            num = num/10;

        }
        System.out.println(count);
    }

}
