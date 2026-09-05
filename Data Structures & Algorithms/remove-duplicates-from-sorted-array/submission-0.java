class Solution {
    public int removeDuplicates(int[] nums) {
        int r=1;
        int l=1;
        int n=nums.length;
        while(r<n){
            if(nums[r]!=nums[r-1]){
                nums[l]=nums[r];
                l++;
            }
            r++;
        }
        return l;
        
    }
}