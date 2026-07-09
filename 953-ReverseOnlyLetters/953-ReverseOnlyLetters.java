// Last updated: 7/9/2026, 9:49:19 AM
class Solution {
    public String reverseOnlyLetters(String s) {
     int l=0;
     int r=s.length()-1;
     char chars[]=s.toCharArray();
     while(l<r){
    while(l<r && !Character.isLetter(chars[l])) l++;
    while(l<r && !Character.isLetter(chars[r])) r--;
    char temp=chars[l];
    chars[l]=chars[r];
    chars[r]=temp;
    l++;
    r--;
     }  
     return new String(chars); 
    }
}