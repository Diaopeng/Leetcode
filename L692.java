class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        List<String> res = new ArrayList<String>();
        for(int i = 0;i < words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<String,Integer>>(){
            public int compare(Map.Entry<String,Integer>a, Map.Entry<String,Integer>b){
                if(a.getValue() == b.getValue())
                    return b.getKey().compareTo(a.getKey());
                return a.getValue()-b.getValue();
            }
        });
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            pq.add(entry);
            if(pq.size() > k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            res.add(0,pq.poll().getKey());
        }
        return res;
        
    }
}