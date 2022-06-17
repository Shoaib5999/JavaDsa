public class isPalindrome {
    public static void main(String[] args) {
        int num =1231;
        System.out.println(isPalindrome(num));
    }
    static boolean isPalindrome(int n){
        int r,sum=0,temp;


        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            return true;
return false;    }
}
