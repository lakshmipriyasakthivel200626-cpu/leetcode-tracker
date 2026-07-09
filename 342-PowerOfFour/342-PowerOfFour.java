// Last updated: 7/9/2026, 9:50:30 AM
class Solution {
    public boolean isPowerOfFour(int n) {
    if(n==1) return true;
   if( n<=0 || n%4!=0 )
       return false;
       
    return isPowerOfFour(n/4);
    }
}