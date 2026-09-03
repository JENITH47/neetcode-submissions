class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        // int ans=0;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int x=stack.pop();
                int y=stack.pop();
                if(tokens[i].equals("+")){
                    stack.push(y+x);
                }
                else if(tokens[i].equals("-")){
                    stack.push(y-x);
                }
                else if(tokens[i].equals("*")){
                    stack.push(y*x);
                }
                else if(tokens[i].equals("/")){
                    stack.push(y/x);
                }

            }
            else{
                int a=Integer.parseInt(tokens[i]);
                stack.push(a);

            }
        }
        return stack.pop();
    }
}
