// Last updated: 7/9/2026, 9:49:35 AM
class Solution {
    public int dominantIndex(int[] nums) {    
        int max=-1,sec=-1,maxin=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxin=i;
            }
        }  
        for(int i=0;i<nums.length;i++){
            if(nums[i]>sec &&  max!=nums[i]){
                sec=nums[i];
            }
        }
        if(sec*2<=max){
            return maxin;
        }
        return -1;
    }
}