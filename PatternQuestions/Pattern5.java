public class Pattern5 {
    public static void main(String[] args) {
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
        //this is unique type of question here we will run the row loop two times
        //one times increasing and other time decreasing
        int n=5;
        for (int row = 1; row <=2*n; row++) {
            //now here we need to apply for loop columns and if n =5 till increase then decrease
            for (int column = 1; column <= row; column++) {
                if(row<=5){
                    System.out.print("*");
                }else{
            }
        }
    }
}
