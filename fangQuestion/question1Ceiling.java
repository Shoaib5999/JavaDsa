public class question1Ceiling {
    public static void main(String[] args) {
        int [] arr = {1,2,20,27,25,34,99};
        int target = 19;
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
        return start;}
}
//so here was the answer for ceil and floor

