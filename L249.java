
//这个问题的思路主要是将所有的string首字母都变成a，然后计算hashmap里面是否包含这个string
class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> result = new ArrayList<List<String>>();
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for(String s: strings){
            int offset = s.charAt(0) - 'a';
            String key = "";
            for(int j = 0;j < s.length();j++){
                char c = (char)(s.charAt(j) - offset);
                if(c < 'a'){
                    c += 26;
                }
                key += c;
            }
            if(!map.containsKey(key)){
                List<String> row = new ArrayList<String>();
                map.put(key,row);
            }
            map.get(key).add(s);
        }
        for(String key: map.keySet()){
            Collections.sort(map.get(key));
            result.add(map.get(key));
        }
        return result;
        
    }
}