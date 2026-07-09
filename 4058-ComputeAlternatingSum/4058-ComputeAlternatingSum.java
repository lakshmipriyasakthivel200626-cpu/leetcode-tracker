// Last updated: 7/9/2026, 9:47:18 AM
class Solution {
    public int alternatingSum(int[] nums) {
    int n=nums.length;
    int sum=0;
    int newsum=0;
    for(int i=0;i<n;i+=2){
        sum+=nums[i];
    }    
    for(int i=1;i<n;i+=2){
        newsum+=nums[i];
    }
    int rem=sum-newsum;
    return rem;
    }
}