class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<List<String>>();
        helper(result, new ArrayList<String>(), s,0);
        return result;
    }
    
    public void helper(List<List<String>> result, List<String> temp, String s, int start){
        if(start == s.length())
            result.add(new ArrayList<String>(temp));
        else for(int i = start+1;i <= s.length();i++){
            String str = s.substring(start,i);
            if(isPalindrome(str)){
                temp.add(str);
                helper(result, temp, s, i);
                temp.remove(temp.size() - 1);
            }
        }
    }
    public boolean isPalindrome(String s){
        if(s.length() == 1) 
            return true;
        int start = 0, end = s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;end--;
        }
        return true;
    }
}
