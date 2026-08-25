class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int idx0=0;
        int idx1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                idx0++;
            }
            if(nums[i]==1){
                idx1++;
            }
        }
        for(int i=0;i<idx0;i++){
            nums[i]=0;
        }
        for(int i=idx0;i<idx1+idx0;i++){
            nums[i]=1;
        }
        for(int i=idx0+idx1;i<n;i++){
            nums[i]=2;
        }
        
    }
}