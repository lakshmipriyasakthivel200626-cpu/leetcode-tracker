// Last updated: 7/9/2026, 9:48:15 AM
class Solution {
    public int maxAscendingSum(int[] nums) {
       int n=nums.length;
       int max=nums[0];
       int sum=nums[0];
       for(int i=1;i<n;i++){
        if(nums[i]>nums[i-1]){
            sum+=nums[i];
        }else{
            sum=nums[i];
        }
        if(sum>max){
            max=sum;
        }
       } 
       return max;
    }
}