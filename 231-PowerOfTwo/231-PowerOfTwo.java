// Last updated: 7/9/2026, 9:50:48 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;  
        long val = 1;              
        while (val < n) {           
            val = val * 2;          
        }
        return val == n;
}
}