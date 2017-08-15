

//使用x - min作为数据插入栈中，如果小于0,则更新 x - min。这种我们在出栈时候，就可以根据 x -min 是否大于0, 选择更新min值

public class MinStack {
    private Stack<Long> s;
    private long min;

    /** initialize your data structure here. */
    public MinStack() {
        s = new Stack<Long>();
    }
    
    public void push(int x) {
        if(s.empty()){
            s.push(0L);
            min = x;
        }
        else{
            s.push(x - min);
            if(x < min) min = x;
        }
    }
    
    public void pop() {
        long t = s.pop();
        if(t < 0)
            min = min - t;
    }
    
    public int top() {
        long top = s.peek();
        if(top < 0) return (int) min;
        else return (int) (min + top);
    }
    
    public int getMin() {
        return (int) min;
    }
}
