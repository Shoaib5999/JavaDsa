public class Pattern3 {
    public static void main(String[] args) {
        int n=5;
//        int column = n
        for (int row = 1; row <=n; row++) {
            for ( int column = 1; column <=n-row+1 ; column++) {
                System.out.print("* ");
            }
            System.out.println();}
    }
}
