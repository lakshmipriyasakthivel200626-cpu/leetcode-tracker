// Last updated: 7/9/2026, 9:49:09 AM
class Solution {
    public String removeDuplicates(String s) {
    Stack<Character> st=new Stack<>();
    int count=0;
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(!st.isEmpty() && st.peek() == ch ){
        st.pop();
        }else{
            st.push(ch);
        }
    }  
    String ans="";
    while(!st.isEmpty()){
        ans=st.pop()+ans;
    }
    return ans;
    }
}