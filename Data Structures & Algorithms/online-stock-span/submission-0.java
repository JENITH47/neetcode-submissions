class StockSpanner {
    Stack<Integer> stack;
    Stack<Integer> x;

    public StockSpanner() {
        stack=new Stack<>();
        x=new Stack<>();
        
    }
    
    public int next(int price) {
        int count=1;
        if(stack.isEmpty()){
            stack.push(price);
            return count;
            
        }
        else{
        while((!stack.isEmpty()) && stack.peek()<=price){
        int a=stack.pop();
        x.push(a);
        count++;}
        while(!x.isEmpty()){
            stack.push(x.pop());
        }
        stack.push(price);
        return count;}
        

        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */