// Last updated: 7/9/2026, 9:48:21 AM
class Solution {
    public int largestAltitude(int[] gain) {
     int n=gain.length;
     int al=0;
     int max=0;
     for(int i=0;i<n;i++){
        al+=gain[i];
        if(al>max){
            max=al;
        }
     }   
     return max;
    }
}