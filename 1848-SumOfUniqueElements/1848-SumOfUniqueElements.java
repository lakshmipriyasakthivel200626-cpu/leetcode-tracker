// Last updated: 7/9/2026, 9:48:19 AM
class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                sum += nums[i];
            }
        }

        return sum;
    }
}
