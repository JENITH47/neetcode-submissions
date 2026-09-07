class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            while(!stack.isEmpty() && ((x<0 && stack.peek()>0))){
               
                if(arr[i]<0 && stack.peek()>0){
                    if(Math.abs(x)>Math.abs(stack.peek())){
                        stack.pop();
                    }
                    else if(Math.abs(x)==Math.abs(stack.peek())){
                        x=0;
                        stack.pop();
                        break;
                    }
                    else{
                        x=stack.pop();
                        break;
                    }
                    
                }
            }
            if(x!=0){
            stack.push(x);}
        }
        int[] ans = stack.stream().mapToInt(Integer::intValue).toArray();
        return ans;

    }
}