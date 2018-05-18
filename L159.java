//看得答案，sliding window
class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int start = 0, end = 0;
        int result = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        while(end < s.length()){
            if(map.size() <= 2){
                map.put(s.charAt(end),end);
                end++;
            }
            if(map.size() > 2){
                start = s.length();
                for(int num : map.values()){
                    start = Math.min(start,num);
                }
                map.remove(s.charAt(start));
                start++;
            }
            result = Math.max(end- start, result);
        }
        return result;
    }
}
