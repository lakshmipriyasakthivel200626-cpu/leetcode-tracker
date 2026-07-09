// Last updated: 7/9/2026, 9:48:03 AM
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
     int n=seats.length;
     int m=students.length;
     Arrays.sort(seats);
     Arrays.sort(students);
     int moves=0;
     for(int i=0;i<n;i++){
      moves+=Math.abs(students[i]-seats[i]);
     }   
     return moves;
    }
}