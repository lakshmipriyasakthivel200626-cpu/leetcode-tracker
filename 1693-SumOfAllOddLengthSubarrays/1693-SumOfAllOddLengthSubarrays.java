// Last updated: 7/9/2026, 9:48:26 AM
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int total = 0;
        for (int i = 0; i < n; i++) {
            int totalSub = (i + 1) * (n - i);
            int oddSub = (totalSub + 1) / 2;
            total += arr[i] * oddSub;
        }
        return total;
    }
}
