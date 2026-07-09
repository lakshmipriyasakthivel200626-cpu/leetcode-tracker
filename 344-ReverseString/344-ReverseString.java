// Last updated: 7/9/2026, 9:50:28 AM
class Solution {
    public void reverseString(char[] s) {
     int i=0;
     int j=s.length-1;
     while(i<j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;

        i++;
        j--;
     }   
    }
}