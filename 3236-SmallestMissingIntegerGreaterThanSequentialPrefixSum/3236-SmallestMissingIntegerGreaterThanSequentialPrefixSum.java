// Last updated: 7/9/2026, 9:47:41 AM
class Solution {
    public int missingInteger(int[] nums) { 
        int sum = nums[0];
        int i = 1;
        while (i < nums.length && nums[i] == nums[i - 1] + 1) {
            sum += nums[i];
            i++;
        }
        int x = sum;
        while (true) {
            boolean found = false;
            for (int num : nums) {
                if (num == x) {
                    found = true;
                    break;
                }
            }
            if (!found) return x;
            x++;
        }
    }
}
