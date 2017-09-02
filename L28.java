class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        if(needle.length() > haystack.length()) return -1;
        int result = -1;
        for(int i = 0;i < haystack.length();i++){
            if(i + needle.length() > haystack.length())
                break;
            if(haystack.substring(i,i + needle.length()).equals(needle)){
                result = i;
                break;
            }
        }
        return result;
        
    }
}
