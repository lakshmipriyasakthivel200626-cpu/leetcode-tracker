// Last updated: 7/9/2026, 9:47:59 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
    long count=0;
    long res=0;
  for(int i=0;i<nums.length;i++){
    if(nums[i]==0){
        count++;
        res+=count;
    }else{
        count=0;
    }
  }    
  return res;
    }
}