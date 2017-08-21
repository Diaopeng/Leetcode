class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                char a = (char)(s.charAt(i) + 'a' - 'A');
                sb.append(a);
            }
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                sb.append(s.charAt(i));
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                sb.append(s.charAt(i));
        }
        int i = 0, j = sb.length() - 1;
        while(i < j){
            if(sb.charAt(i) != sb.charAt(j))
                return false;
            i++;j--;
        }
        return true;
    }
}

优化变成一次遍历

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j){
            char a = s.charAt(i), b = s.charAt(j);
            if(!Character.isLetterOrDigit(a))
                i++;
            else if(!Character.isLetterOrDigit(b))
                j--;
            else if(Character.toLowerCase(a) != Character.toLowerCase(b))
                return false;
            else {
                i++;j--;
            }
        }
        return true;
    }
}
