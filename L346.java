// 模拟滑动窗口的设计
class MovingAverage {
    /** Initialize your data structure here. */
    private int [] window;
    private int insert, n;
    private long sum;
    public MovingAverage(int size) {
        window = new int[size];
        insert = 0; sum = 0;n = 0;
    }
    
    public double next(int val) {
        if(n < window.length) n++;
        sum -= window[insert];
        sum += val;
        window[insert] = val;
        insert = (insert + 1) % window.length;
        
        return (double) sum/n;
    }
}
