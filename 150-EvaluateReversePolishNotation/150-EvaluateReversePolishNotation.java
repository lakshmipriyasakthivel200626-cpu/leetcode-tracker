// Last updated: 7/9/2026, 9:51:22 AM
class Solution {
    public int evalRPN(String[] tokens) {
     Stack<Integer> st=new Stack<>();
     for(int i=0;i<tokens.length;i++){
        if(!tokens[i].equals("+") && !tokens[i].equals("-") &&
                !tokens[i].equals("*") && !tokens[i].equals("/")) {

                st.push(Integer.parseInt(tokens[i]));

        }else{
           int b= st.pop();
           int a=st.pop();
           int res=0;
            if(tokens[i].equals("+")) res=a+b;
            else if(tokens[i].equals("-")) res=a-b;
            else if (tokens[i].equals("*")) res=a*b;
            else
                res=a/b;
                st.push(res);
        }

        }
        return st.peek(); 
    

}
}