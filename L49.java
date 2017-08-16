
//  使用sorted作为key， 然后使用对应的List作为value
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String> >map = new HashMap<String, List<String> >();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(map.containsKey(sorted)){ 
                map.get(sorted).add(s);
            }
            else{
                map.put(sorted, new ArrayList<String>() );
                map.get(sorted).add(s);
            }
        }
        return new ArrayList<List<String> > (map.values());
    }
}
