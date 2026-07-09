// Last updated: 7/9/2026, 9:47:48 AM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
     int n=hours.length;
     int count=0;
     for(int i=0;i<n;i++){
          if(hours[i]>=target){
            count++;
          }
     }   
     return count;
    }
}