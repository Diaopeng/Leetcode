class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> [] bucket = new List[nums.length+1];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i]) + 1);
            else
                map.put(nums[i],1);
        }
        
        for(int num: map.keySet()){
            int frequency = map.get(num);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<Integer>();
            }
            bucket[frequency].add(num);
        }
        
        List<Integer> result = new ArrayList<Integer>();
        for(int i = bucket.length -1; i >= 0 && result.size() < k;i--){
            if(bucket[i] != null){
                result.addAll(bucket[i]);
            }
            
        }
        return result;
    }
}
