// Last updated: 7/9/2026, 9:48:41 AM
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int n = startTime.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(startTime[i] <= queryTime && queryTime <= endTime[i]){
                count++;
            }
        }

        return count;
    }
}