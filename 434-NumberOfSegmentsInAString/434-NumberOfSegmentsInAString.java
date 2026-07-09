// Last updated: 7/9/2026, 9:50:13 AM
class Solution {
    public int countSegments(String s) {
       int segmentCount=0;
       for(int i=0;i<s.length();i++ ){
        if((i==0||s.charAt(i-1)==' ')&& s.charAt(i)!=' '){
            segmentCount++;
        }
       }
       return segmentCount;
    }
}