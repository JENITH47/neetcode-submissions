class MyStack {
    Queue<Integer> first;
    // Queue<Integer> second;

    public MyStack() {
       first=new LinkedList<>(); 
    //    second=new LinkedList<>(); 
    }
    
    public void push(int x) {
        first.add(x);
        
    }
    
    public int pop() {
        int n=first.size();
        while(n!=1){
            int x=first.remove();
            first.add(x);
            n--;
        }
        int ans=first.remove();
        // n=first.size();
        // while(n!=1){
        //     int x=first.remove();
        //     first.add(x);
        //     n--;
        // }
        return ans;
    }
    
    public int top() {
        int n=first.size();
        while(n!=1){
            int x=first.remove();
            first.add(x);
            n--;
        }
        int ans=first.peek();
        n=first.size();
        // while(n!=1){
        //     int x=first.remove();
        //     first.add(x);
        //     n--;
        // }
        first.add(first.remove());
        return ans;
        
    }
    
    public boolean empty() {
        return first.isEmpty();
        
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