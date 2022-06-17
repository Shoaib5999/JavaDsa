public class question4 {
    public static void main(String[] args) {
        //find position of an element in a sorted array of infinite length
        int [] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
//        System.out.println(arr.length);
        System.out.println(ans(arr,target));

    }
  //  because the question is of sorted array we are applying binary search
    static int ans(int [] arr,int target){
        int start = 0;
        int end = 1;
        while(arr[end]<target){
            int newStart = end+1;  //here we are creating a new variable because we have the use of old start below this line

            end = end +(end-start+1)*2;
            start = newStart;
        }
        return binarySearch(arr,target ,start,end);}
    static int binarySearch(int [] arr, int target,int start,int end){
//        int start = 0;
//        int end  = arr.length-1;
        while(start<=end){
        int mid = start+end/2;
            if(target>arr[mid]){
                end = end-1;
            } else if (target<arr[mid]) {
                start = start +1;
            }else{
                return mid;
            }
        }
    return -1;}
}

//here this is a simple binary code but we need to convert this into infinite array question
//ALHAMDULILLAH SOLVED THIS QUESTION AND ALSO UNDERSTAND THIS ONE ALHAMDULILLAH