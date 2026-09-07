class StockSpanner {
    Stack<int[]> stack;
    // Stack<Integer> x;

    public StockSpanner() {
        stack=new Stack<>();
        // x=new Stack<>();
        
    }
    
    public int next(int price) {
        int count=1;
        
    
        while((!stack.isEmpty()) && stack.peek()[0]<=price){
            count+=stack.peek()[1];
        stack.pop();
        
        // count++;}
        
        
        

        
    }
    stack.push(new int[]{price,count});
        return count;
}
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */