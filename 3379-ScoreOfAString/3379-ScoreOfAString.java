// Last updated: 7/9/2026, 9:47:36 AM
class Solution {
    public int scoreOfString(String s) {
    int score=0;
    for(int i=1;i<s.length();i++){
        int diff;
        if(s.charAt(i)>=s.charAt(i-1)){
            diff=s.charAt(i)-s.charAt(i-1);
        }else{
         diff=s.charAt(i-1)-s.charAt(i);   
        }
        score+=diff;
    } 
    return score;   
    }
}