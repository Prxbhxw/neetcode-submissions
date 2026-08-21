class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int len1=s.length();
        int len2=t.length();
        int flag=1;

        if(len1!=len2){
            flag=0;             
        }else{
            for(int i=0;i<len1;i++){
                if(arr1[i]!=arr2[i]){
                    flag=0;
                    break;

                }
            }
        }
        if(flag==1){
            return true;
        }else{
            return false;
        }
    }
}
