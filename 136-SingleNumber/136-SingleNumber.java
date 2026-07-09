// Last updated: 7/9/2026, 9:51:29 AM
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
    int n=nums.length;
    for(int i=0;i<n-1;i+=2){
        if(nums[i]!=nums[i+1]){
            return nums[i];
        }    
    }   
    return nums[n-1];
    }
}