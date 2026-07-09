// Last updated: 7/9/2026, 9:47:19 AM
class Solution {
    public int vowelConsonantScore(String s) {
    int vc=0;
    int cc=0;
    int score=0;
    for(int i=0;i<s.length();i++){
        char ch=Character.toLowerCase(s.charAt(i));
        if (Character.isLetter(ch)) {
        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
            vc++;
        }else{
            cc++;
        }
       
    }
    }
     if(cc>0){
score=vc/cc;
        }    
        return score;
    }
}