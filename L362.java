//使用数组解决会方便一点
class HitCounter {
    
    int [] times;
    int [] hits;

    /** Initialize your data structure here. */
    public HitCounter() {
        times = new int[300];
        hits = new int[300];
    }
    
    /** Record a hit.
        @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        int temp = timestamp % 300;
        if(times[temp] != timestamp){
            times[temp] = timestamp;
            hits[temp] = 1;
        }
        else{
            hits[temp]++;
        }
    }
    
    /** Return the number of hits in the past 5 minutes.
        @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
        int total = 0;
        for(int i = 0;i < 300;i++){
            if(timestamp - times[i] < 300){
                total += hits[i];
            }
        }
        return total;
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */
