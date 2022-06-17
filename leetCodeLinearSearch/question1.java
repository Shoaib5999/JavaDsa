public class question1 {
    public static void main(String[] args) {
        //Given an array nums of integers, return how many of them contain even numbers of digits
        int[] arr= {12,345,2,6,7896,45,67677667,789};
        int count = 0;

        for (int i = 0; i< arr.length;i++){
            if (digit(arr[i])%2 == 0){
                count++;
            }
        }
        System.out.println("numbers of even digit numbers is "+count);

    }

    private static int digit(int i) {
        int count = 0;
        while(i>0){
            count++;
            i=i/10;
        }
        return count;

    }//ALHAMDULILLAH i am so happy i have understand and solved one leet code question
}

