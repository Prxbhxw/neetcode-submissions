class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>n/3 && !arr.contains(nums[i])){
                arr.add(nums[i]);
            }
            
        }
        return arr;
    }
}