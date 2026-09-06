class Solution {
    public int searchInsert(int[] nums, int target) {
        int result=nums.length;
        int l=0;
        int r=result-1;
        
        while(l<=r){
            int mid=l+(r-l)/2;

            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                r=mid-1;
                result =mid;
            
            }else{
                l=mid+1;
            }
        }
        return result;
    }
}