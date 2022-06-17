public class question2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1,7}};
        int sum= 0;
        for (int i = 0; i<arr.length;i++){
            for(int j=0; j <arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            System.out.println("the value of the " + sum);
            sum=0;
        }
    }
}
