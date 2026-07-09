// Last updated: 7/9/2026, 9:51:21 AM
class Solution {
    public String reverseWords(String s) {
        String str[]=s.split(" ");
        String res="";
        for(int i=str.length-1;i>=0;i--){
            if(str[i]!=""){
               res+=str[i]+" ";
            }
        }
        return res.trim();
    }
}