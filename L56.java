/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals,new Comparator<Interval>(){
            public int compare(Interval o1, Interval o2){
                return o1.start - o2.start;
            }
        });
        for(int i = 0;i < intervals.size() - 1;i++){
            if(intervals.get(i).end >= intervals.get(i + 1).start){
                Interval merg = new Interval(intervals.get(i).start,Math.max(intervals.get(i + 1).end,intervals.get(i).end));
                intervals.remove(i);
                intervals.remove(i);
                intervals.add(i,merg);
                i--;
            }
        }
        return intervals;
    }
}
