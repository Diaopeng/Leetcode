

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0;i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.replace(s.charAt(i), -1);   
            }
            else
                map.put(s.charAt(i),i);
        }
        for(int i = 0;i < s.length();i++){
            if(map.get(s.charAt(i)) != -1)
                return map.get(s.charAt(i));
        }
        return -1;
    }
}

//讨论中更快的解法
class Solution {
    public int firstUniqChar(String s) {
        int[] letter = new int[26];
        for(int i = 0;i < s.length();i++){
            letter[s.charAt(i) - 'a']++;
        }
        for(int i = 0;i < s.length();i++){
            if(letter[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}

