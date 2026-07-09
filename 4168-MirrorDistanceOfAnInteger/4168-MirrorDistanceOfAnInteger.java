// Last updated: 7/9/2026, 9:47:15 AM
class Solution {
    public int mirrorDistance(int n) {
        int ori=n;
        int rev=0;
        while(n>0){
           int dig=n%10;
           rev=rev*10+dig;
             n/=10;
        }
        int ans=Math.abs(ori-rev);
        return ans;
        
    }
}