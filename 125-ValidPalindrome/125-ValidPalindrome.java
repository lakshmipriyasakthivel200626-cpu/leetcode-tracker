// Last updated: 7/9/2026, 9:51:32 AM
class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for( char c:s.toCharArray()){
            if( Character.isLetterOrDigit(c)){
                str +=Character.toLowerCase(c);
            }
            }
            String rev="";
            for(int i=str.length()-1;i>=0;i--){
                rev+=str.charAt(i);
            }
                if(rev.equals(str)){
                    return true;
                }else{
                    return false;
                }
            
        
    }
}
