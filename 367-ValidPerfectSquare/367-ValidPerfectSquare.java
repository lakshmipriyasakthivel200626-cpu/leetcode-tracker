// Last updated: 7/9/2026, 9:50:22 AM
class Solution {
    public boolean isPerfectSquare(int num) {
     int res=(int)Math.sqrt(num);
     if(res*res==num){
        return true;
     }    
     return false;
    }
}