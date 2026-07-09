// Last updated: 7/9/2026, 9:50:38 AM
 class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 1);
        }
        for (int i = 0; i <= n; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return -1;
    }
}