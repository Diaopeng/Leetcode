
//这两种方法都是使用hashmap的方法进行计算,写法上面稍微有点不同
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        HashSet<Character> set = new HashSet<Character>();
        for(int i = 0;i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
            else{
                map.put(s.charAt(i),t.charAt(i));
                if(!set.add(t.charAt(i))) return false;
            }
        }
        return true;
    }
}

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0;i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
            else{
                if(map.containsValue(t.charAt(i))) return false;
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}

//这种使用了数组来进行标记，初始化时候所有都是0
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int [] a = new int[129];
        int [] b = new int[129];
        for(int i = 0;i < s.length();i++){
            if(a[s.charAt(i)] != b[t.charAt(i)]) return false;
            a[s.charAt(i)] = i + 1;
            b[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
