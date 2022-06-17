import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr) {
        //we need to render all the element inside that arr

        for (int i = 0;i< arr.length-1;i++){
            boolean swapped = false;
            for(   int j = 1;j< arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]= temp;
                    swapped = true;
                }
            }
        if(!swapped){
        break;}
        }
    return arr;}
}
