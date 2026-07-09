// Last updated: 7/9/2026, 9:47:32 AM
class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;      
        int min= Integer.MAX_VALUE;;
        for(int i=0;i<n;i++){
          int temp=nums[i];  
         int sum=0;
     while(temp>0){
        int dig=temp%10;
        sum+=dig;
        temp/=10;
     }  
    
      if( sum<min){
        min=sum;
      }
        }
     return min;
    }
}