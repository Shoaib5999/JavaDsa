public class Question3 {
    public static void main(String[] args) {
//        https://leetcode.com/problems/goal-parser-interpretation/
            String s = "(al)G(al)()()G";
            String ans = "";
        //iterating all the char of the string using for loop
        for(int i = 0; i<s.length()-1;i++){
            //now comparing if the string has string () replace it with 0;
            if(s.charAt(i)=='('){
                if(s.charAt(i+1)==')'){
                    ans = s.charAt(i-1)+"o";
                }else {
                    ans=ans+s.charAt(i+1)+s.charAt(i+2);
                }
            }
        }
        System.out.println(ans);

    }
}
