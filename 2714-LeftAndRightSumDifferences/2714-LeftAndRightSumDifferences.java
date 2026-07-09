// Last updated: 7/9/2026, 9:47:51 AM
class Solution {
    public int[] leftRightDifference(int[] nums) {
    int n=nums.length;
    int ans[]=new int[n];
    int leftsum=0;
    int totalsum=0;
    for(int num:nums){
        totalsum+=num;
    }
    for(int i=0;i<n;i++){
        int rightsum=totalsum-leftsum-nums[i];
           int diff;
        if(leftsum>=rightsum){
            diff=leftsum-rightsum;
        }else{
            diff=rightsum-leftsum;
        }
    ans[i]=diff;
    leftsum+=nums[i];
    }
    return ans;

    }
}