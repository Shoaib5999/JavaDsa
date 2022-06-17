import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
//        question 2
//        [Write a function that returns all prime numbers between two given numbers.]
//        lets say here we need to calculate all the prime numbers between 0 to 100 and then wwe will think about the actual questions
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        for (int i = 2;i<num/2;i++){
            if(num%i==0){
                count++;
            }
        }
        if (count>0){
            System.out.println(num+" is not a prime number");
        }
        else {
            System.out.println(num+" is a prime number");
        }

//    [Write a function to find if a number is a palindrome or not. Take number as parameter.


    }

}
