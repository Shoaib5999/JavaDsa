public class question6 {
    public static void main(String[] args) {
        int [] arr1 = new int[] {1,2,2,1};
        int [] arr2 = new int[] {1,2};
    }

        public static int[] intersection(int[] nums1, int[] nums2) {
        int [] ans = new int [] {};
            for(int i =0;i<nums1.length;i++){
                for(int j =0;j<nums2.length;j++){
                    if(nums1[i]==nums2[j]){
                        return new int[]{1,2};
                    }
                }
            }
            return new int[]{-1,-1};
        }

}
