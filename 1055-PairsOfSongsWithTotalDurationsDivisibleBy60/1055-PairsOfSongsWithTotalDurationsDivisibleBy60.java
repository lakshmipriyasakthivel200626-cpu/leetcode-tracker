// Last updated: 7/9/2026, 9:49:10 AM
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
     int[] arr = new int[60]; 
        int count = 0;
        for (int i = 0; i < time.length; i++) {
            int r = time[i] % 60;
            if (r == 0) {
                count += arr[0];
            } else {
                count += arr[60 - r];
            }
            arr[r]++;
        }
        return count;
    }
}
