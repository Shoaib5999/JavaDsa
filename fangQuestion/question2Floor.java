public class question2Floor {
    public static void main(String[] args) {
        int [] arr = {1,2,20,25,27,34,99};
        int target =24;
        int ans =searchBin(arr,target);
        System.out.println(ans);
    }
    static int searchBin(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            //find mid element

            int mid = start+(end-start)/2;
            if (target>arr[mid]){
                start =mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }

            else{
                return mid;
            }
        }
        return end;}
}
//so here was the answer for ceil and floor

