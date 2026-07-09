// Last updated: 7/9/2026, 9:49:50 AM
class Solution {
    public String reverseWords(String s) {
        String str[]=s.split(" ");
     String rev="";
             for (int w = 0; w < str.length; w++) {
            String st = str[w];

        for(int i=st.length()-1;i>=0;i--){
       rev+=st.charAt(i);
        }
        if (w != str.length - 1) {
                rev += " ";
            }
     }
     
     return rev;
    }
}