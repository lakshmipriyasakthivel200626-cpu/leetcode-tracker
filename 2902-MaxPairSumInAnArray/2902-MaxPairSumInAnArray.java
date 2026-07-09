// Last updated: 7/9/2026, 9:47:46 AM
class Solution {
    public int maxSum(int[] nums) {
     int maxSum =-1;
     for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(getMaxDigit(nums[i])== getMaxDigit(nums[j]))
{
    maxSum=Math.max(maxSum,nums[i]+nums[j]);
       }
     }   
    }
    return maxSum;
}
private int getMaxDigit(int num){
    int max=0;
    while(num>0){
        int d=num%10;
        if(d>max) max=d;
        num/=10;
    }
    return max;
}
}