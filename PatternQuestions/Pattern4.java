public class Pattern4 {
    public static void main(String[] args) {
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
        //running for number of rows
        int n = 5;
        for(int row = 1; row <=n;row++){
            //running loop for each column here we can see each column has number from one to no
            //of rows
            for(int column=1;column<=row;column++){
                System.out.print(column + " ");
            }
            System.out.println();}
    }
}
//ALHAMDULILLAH LOOKS GOOD