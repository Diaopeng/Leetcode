
// 
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '(') stack.push(')');
            else if(s.charAt(i) == '[') stack.push(']');
            else if(s.charAt(i) == '{') stack.push('}');
            else if(stack.empty() || s.charAt(i) != stack.pop()) return false;
        }
        return stack.empty();
    }
}
