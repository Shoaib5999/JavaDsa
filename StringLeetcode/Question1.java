import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        String ip = "1.1.1.1";
        String ans = "";
//        System.out.println(Arrays.toString(ip.chars());
//        String dg  = ip.replaceAll(".","[.]");
//        System.out.println(dg);
        for(int i=0;i<ip.length();i++){
            if(ip.charAt(i)=='.'){
                ans=ans+"[.]";
            }
            else{
                ans = ans+ip.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
