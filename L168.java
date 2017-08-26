class Solution {
    public String convertToTitle(int n) {
        StringBuffer result = new StringBuffer();
        while(n != 0){
            char a = (char)('A' + (n - 1) % 26);
            result.append(a);
            n = (n - 1) / 26;
        }
        return result.reverse().toString();
    }
}
