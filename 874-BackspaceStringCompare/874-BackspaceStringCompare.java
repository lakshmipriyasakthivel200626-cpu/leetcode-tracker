// Last updated: 7/9/2026, 9:49:28 AM
import java.util.Stack;
public class Solution { 
    public boolean backspaceCompare(String s, String t) {
        return processString(s).equals(processString(t));
    }
    private String processString(String str) {
        Stack<Character> stack = new Stack<>();  
        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                stack.push(ch);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.backspaceCompare("ab#c", "ad#c"));  
        System.out.println(solution.backspaceCompare("ab##", "c#d#"));  
        System.out.println(solution.backspaceCompare("a#c", "b"));      
    }
}