class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if(digits.length() == 0) return result;
        result.add("");
        String [] map =  {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int i = 0;i < digits.length();i++){
            String s = map[digits.charAt(i)-'0'];
            List<String> tempres = new ArrayList<String>();
            for(int j = 0;j < s.length();j++){
                for(String temp : result){
                    tempres.add(temp + s.charAt(j));
                }
            }
            result = tempres;
        }
        return result;
        
    }
}
