class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        backtrak(n,n,result, "");
        return result;
    }
    public void backtrak(int left, int right, List<String> result, String s){
        if(left == 0 && right == 0){
            result.add(s);
            return;
        }
        if(left != 0)
            backtrak(left - 1, right, result,s + "(");
        if(right != 0 && right > left)
            backtrak(left, right - 1, result,s + ")");
    }
    
}
