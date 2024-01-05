class MyQueue {

    Stack<Integer> input=new Stack<>();
    Stack<Integer> output=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if(!output.isEmpty()){
            return output.pop();
        }
        while(!input.isEmpty()){
            int val=input.peek();
            output.push(val);
            input.pop();
        }
        return output.pop();
    }
    
    public int peek() {
        if(!output.isEmpty()){
            return output.peek();
        }
        while(!input.isEmpty()){
            int val=input.peek();
            output.push(val);
            input.pop();
        }
        return output.peek();
    }
    
    public boolean empty() {
        
        return(output.isEmpty() && input.isEmpty()?true:false);
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
