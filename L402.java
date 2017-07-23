//这个题目最重要的就是搞清楚怎么贪心，要保证从高位到低位，如果这一位大于下一位，则去掉，直到去掉k个数
public class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<Character>();
        StringBuffer result = new StringBuffer();
        if(k == num.length())
            return "0";
        for(int i = 0;i < num.length();i++){
            while(k>0 && !s.empty() && s.peek() > num.charAt(i)){
                s.pop();
                k--;
            }
            s.push(num.charAt(i));
        }
        while(k > 0){
            s.pop();
            k--;
        }
        while(!s.empty())
            result.insert(0,s.pop());
        while(result.length() > 1 && result.charAt(0) == '0')
            result.deleteCharAt(0);
        return result.toString();
    }
}
