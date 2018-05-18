
//注意输入是一个string 数组
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(String s : tokens){
            if(s.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if(s.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            }
            else if(s.equals("*"))
                stack.push(stack.pop() * stack.pop());
            else if(s.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            }
            else 
                stack.push(Integer.parseInt(s));
        }
        return stack.pop();
    }
}
