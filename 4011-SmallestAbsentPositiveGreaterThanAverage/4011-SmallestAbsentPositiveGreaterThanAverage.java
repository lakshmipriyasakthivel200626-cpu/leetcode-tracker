// Last updated: 7/9/2026, 9:47:21 AM
class Solution {
    public int smallestAbsent(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double avg = (double) sum / nums.length;
        int ans = (int) Math.floor(avg) + 1;
        if (ans < 1) {
            ans = 1;
        }
        boolean found = true;
        while (found) {
            found = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == ans) {
                    ans++;
                    found = true;
                    break;
                }
            }
        }
        return ans;
    }
}