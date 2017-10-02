class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        boolean flag = false;
        if(strs == null || strs.length == 0) return sb.toString();
        for(int i = 0;i < strs[0].length();i++){
            for(int j = 1;j < strs.length;j++){
                if(i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)){
                    flag = true;
                    break;
                }
            }
            if(flag) break;
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}
