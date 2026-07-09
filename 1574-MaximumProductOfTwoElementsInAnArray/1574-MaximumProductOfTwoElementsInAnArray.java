// Last updated: 7/9/2026, 9:48:38 AM
class Solution {
    public int maxProduct(int[] nums) {
     int n=nums.length;
     int max=0;
     int pr=1;
     for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
       pr= (nums[i]-1)*(nums[j]-1);
       if(pr>max){
        max=pr;
       }
     }
     }  
     return max; 
    }
}