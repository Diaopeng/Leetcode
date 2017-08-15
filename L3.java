
//这是我自己的方法，使用一个指针，计算过程找到重复就返回重复点
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0;i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                i = map.get(s.charAt(i));
                max = Math.max(max, map.size());
                map.clear();
            }
            else{
                map.put(s.charAt(i),i);
            }
        }
        return Math.max(max, map.size());
    }
}

// 这是讨论中的方法，效率更高，计算过程中使用两个指针，一个遍历，一个指向重复点，两个指针都只能向前移动

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0,j = 0;i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(map.get(s.charAt(i)) + 1,j);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max, i - j + 1);
        }                     
        return max;
    }
}
