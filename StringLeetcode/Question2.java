public class Question2 {
    public String restoreString(String s, int[] indices) {
        String ans = "";
        for(int i = 0;i<indices.length-1;i++){
            //comparing the elements of array with string
            for (int j=0;j<indices.length-1;j++){
                if(indices[j]==i){
                    ans=ans +ans.charAt(j);
                }
            }
        }
        return ans; }
}