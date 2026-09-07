class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> stack=new Stack<>();
        int[] res = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=0;
                stack.push(i);
            }
            else{
                res[i]=stack.peek()-i;
                stack.push(i);
            }

        }
        return res;
    }
}