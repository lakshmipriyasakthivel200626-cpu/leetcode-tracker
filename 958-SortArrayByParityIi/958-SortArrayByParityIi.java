// Last updated: 7/9/2026, 9:49:17 AM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int evenInd = 0, oddInd = 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                res[evenInd] = num;
                evenInd += 2;
            } else {
                res[oddInd] = num;
                oddInd += 2;
            }
        }

        return res;
    }
}
