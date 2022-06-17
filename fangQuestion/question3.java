//import java.util.Arrays;
////here the program is running soomthly alhamdulillah
//public class question3 {
//    public static void main(String[] args) {
//        int [] arr = {5,7,7,7,7,8,8,10};
//        int target =10; //answer should be [1,4]
//        System.out.println("first occurance " +firstOcurance(arr,target));
//        System.out.println( "last occurance " +lastOcurance(arr,target));
//    }
//
//    static int firstOcurance(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length-1;
//        while(start<=end){
//            int mid = (start + end)/2;
//            if (target<arr[mid]){
//                end = mid - 1;
//            } else if (target>arr[mid]) {
//                start=mid+1;
//            }
//            if (target == arr[mid]){
//                end = mid - 1;
//            }
//            }
////        int [] ans = {end,start};
//        return start;  }
//    static int lastOcurance(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length-1;
//        while(start<=end){
//            int mid = (start + end)/2;
//            if (target<arr[mid]){
//                end = mid - 1;
//            } else if (target>arr[mid]) {
//                start=mid+1;
//            }
//            if (target == arr[mid]){
//                start = mid + 1;
//            }
//        }
////        int [] ans = {end,start};
//        return end; }
//}


//now we will try to write the same code in optimise way lets see bismillah

import java.util.Arrays;

public class question3{
    public static void main(String[] args) {
        int [] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(firstLastOccurance(arr,target)));


    }
    static int[] firstLastOccurance(int[] arr, int target) {
        int[] ans = {-1,-1};
        int start = search(arr,target,true);
        int end  = search(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int[] arr,int target,boolean findStartIndex){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        //boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            //find mid element
            int mid = start+(end-start)/2;
            if (target>arr[mid]){
                start =mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }

            else{
                ans=mid;
            if (findStartIndex){
                end = mid -1;
            }else {
                start = mid +1;
            }

            }
        }
        return ans;}
    }


    //alhamdullilah more optimise version i get from here

