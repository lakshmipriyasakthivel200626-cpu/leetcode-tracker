// Last updated: 7/9/2026, 9:49:20 AM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j] % 2 > nums[j+1] % 2) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}