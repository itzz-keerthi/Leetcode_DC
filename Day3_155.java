class MinStack {

    Stack<Integer> res= new Stack<>();
    int min;
    public MinStack() {
        res = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(val<=min){
            res.push(min);
            min=val;
        }
        res.push(val);
    }
    
    public void pop() {
        if(res.isEmpty()) return;
        int popped_element=res.pop();
        if(popped_element==min){
            min=res.pop();
        }
    }
    
    public int top() {
        if(res.isEmpty()) return -1;
        return res.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
