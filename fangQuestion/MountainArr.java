public class MountainArr {
    public static void main(String[] args) {
        int [] arr = new int[] {2,4,6,7,8,9,10,3,2,1};
        System.out.println(peak(arr));
    }

    static int peak(int[] arr) {
//        return 0;
        int start =0;
        int end = arr.length;
        while(start<end){
            int mid = (start + end)/2;
            if (arr[mid]>arr[mid+1]){
                end = mid;
            } else if (arr[mid]<arr[mid+1]) {
                start = mid+1;
            }



        }
   return arr[start]; }

}
