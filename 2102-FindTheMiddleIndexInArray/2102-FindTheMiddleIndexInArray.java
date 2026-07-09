// Last updated: 7/9/2026, 9:48:17 AM
class Solution {
    public int findMiddleIndex(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            int right = total - left - nums[i]; 
            if (left == right) {
                return i; 
            }

            left = left + nums[i]; 
        }

        return -1; 
    }
}
