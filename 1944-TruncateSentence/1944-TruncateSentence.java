// Last updated: 7/9/2026, 9:48:14 AM
class Solution {
    public String truncateSentence(String s, int k) {
    String ar[]=s.split(" ");
    String str="";
    for(int i=0;i<k;i++){
        str=str+ar[i];
        if(i<k-1){
        str+=" ";
        }
    }    
    return str;
    }
}