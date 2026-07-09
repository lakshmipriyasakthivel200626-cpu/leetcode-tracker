// Last updated: 7/9/2026, 9:50:31 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;   
        long val = 1;               
        while (val < n) {           
            val = val * 3;          
        }
        return val == n;            
    }
}
