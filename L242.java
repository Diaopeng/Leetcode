public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        String sortedS = new String(s1);
        char[] t1 = t.toCharArray();
        Arrays.sort(t1);
        String sortedT = new String(t1);
        return sortedS.equals(sortedT);
    }
}
