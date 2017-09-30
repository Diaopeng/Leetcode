class MedianFinder {

    /** initialize your data structure here. */
    PriorityQueue<Integer> min = new PriorityQueue<Integer>();
    PriorityQueue<Integer> max = new PriorityQueue<Integer>(new Comparator<Integer>(){
        public int compare(Integer o1, Integer o2){
            return o2 - o1;
        }
    });
    
    public MedianFinder() {
    }
    
    public void addNum(int num) {
        max.add(num);
        min.add(max.poll());
        if(max.size() < min.size())
            max.add(min.poll());
    }
    
    public double findMedian() {
        if(max.size() == min.size()) return (max.peek() + min.peek())/ 2.0;
        else  return max.peek();
        
    }
}
