public class MyStack {

    /** Initialize your data structure here. */
    Queue<Integer> q = new LinkedList<Integer>();
    
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        Queue<Integer> temp = new LinkedList<Integer>();
        while(!q.isEmpty()){
            temp.add(q.poll());
        }
        q.add(x);
        while(!temp.isEmpty()){
            q.add(temp.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return q.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
