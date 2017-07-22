


public class Solution {
    public boolean isValidSerialization(String preorder) {
        Stack<String> s = new Stack<String>();
        String [] data = preorder.split(",");
        for(int i = 0;i < data.length;i++){
            while(data[i].equals("#") && !s.empty() && s.peek().equals("#")){
                s.pop();
                if(s.empty())
                    return false;
                s.pop();
            }
            s.push(data[i]);
        }
        return (s.size()==1) && (s.peek().equals("#"));
    }
}
