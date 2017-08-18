//   题目参考答案的做法， BFS
class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<String>();
        
        Queue<String> q = new LinkedList<String>();
        HashSet<String> set = new HashSet<String>();
        
        q.add(s);
        set.add(s);
        boolean flag = false;
        
        while(!q.isEmpty()){
            String t = q.poll();
            if(Valid(t)) {
                flag = true;
                result.add(t);
            }
            
            if(flag) continue;
            for(int i = 0; i < t.length();i++){
                if(t.charAt(i) == '(' || t.charAt(i) == ')'){
                    String str = t.substring(0,i) + t.substring(i + 1);
                    if(!set.contains(str)){
                        q.add(str);
                        set.add(str);
                    }
                }
            }
        }
        return result;
    }
        boolean Valid(String s){
            int count = 0;
            for(int i = 0;i < s.length();i++){
                if(s.charAt(i) == '(') count++;
                if(s.charAt(i) == ')' && count-- == 0) return false;
            }
            return count == 0;
        }
}
