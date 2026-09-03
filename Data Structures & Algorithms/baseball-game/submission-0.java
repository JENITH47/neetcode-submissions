class Solution {
    public int calPoints(String[] operations) {
      Stack<Integer> first=new Stack<>();
      // Stack<Intege> second=new Stack<>();
      for(int i=0;i<operations.length;i++){
        if(operations[i].equals("+") || operations[i].equals("C") || operations[i].equals("D") ){
          if(operations[i].equals("+")){
            int x=first.pop();
            int y=first.pop();
            first.push(y);
            first.push(x);
            first.push(x+y);
          }
          else if(operations[i].equals("C")){
            first.pop();
            
          }
          else if(operations[i].equals("D")){
            int x=first.peek();
            first.push(2*x);

          }
        }
        else{
          first.push(Integer.parseInt(operations[i]));
        }
        
      }
      int ans=0;
      while(!(first.isEmpty())){
        ans+=first.pop();
      }
      return ans;

    }
}