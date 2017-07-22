public class MyQueue {
    
    Stack<Integer> q;
    /** Initialize your data structure here. */
    public MyQueue() {
        q = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        Stack<Integer> temp = new Stack<Integer>();
        while(!q.empty()){
            int num = q.pop();
            temp.push(num);
        }
        q.push(x);
        while(!temp.empty()){
            int num = temp.pop();
            q.push(num);
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        
        return q.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        
        return q.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return q.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
