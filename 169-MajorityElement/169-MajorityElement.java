// Last updated: 7/9/2026, 9:51:05 AM
class Solution {
    public int majorityElement(int[] nums) {
       
        int max=0;
        int newt=nums[0];
        for(int i=0;i<nums.length;i++){
             int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
                if(count>max){
                    max=count;
                    newt=nums[i];
                }
            }
        }
        return newt;
       }
}