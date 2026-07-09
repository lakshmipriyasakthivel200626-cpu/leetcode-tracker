// Last updated: 7/9/2026, 9:47:30 AM
class Solution {
    public int subarraySum(int[] nums) {
        int n=nums.length;
    int totalsum=0;
    for(int i=0;i<n;i++){
        int start=Math.max(0,i-nums[i]);
        for(int j=start;j<=i;j++){
          totalsum+=nums[j];
        }
    }  
    return totalsum;  
    }
}