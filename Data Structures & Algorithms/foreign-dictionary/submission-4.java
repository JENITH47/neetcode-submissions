class Solution {
    // public void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int i,Stack<Integer> stack){
    //     visited[i]=true;
    //     for(int a:adj.get(i)){
    //         if(!visited[a]){
    //             dfs(adj,visited,a,stack);
    //         }
    //     }
    //     stack.add(i);
    // }
    public String foreignDictionary(String[] words) {
      ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
      for(int i=0;i<26;i++){
        ArrayList<Integer> list=new ArrayList<>();
        adj.add(list);
      }
      for(int i=0;i<words.length-1;i++){
        String a=words[i];
        String b=words[i+1];
        int x=0;
        while(x<a.length() && x<b.length()){
            if(a.charAt(x)!=b.charAt(x)){
                adj.get(a.charAt(x)-'a').add(b.charAt(x)-'a');
                break;
            }
            x++;
        }
        if (x == b.length() && a.length() > b.length()) {
        return "";

    }
    
    

      }
    //   boolean[] visited=new boolean[26];
      boolean[] present=new boolean[26];
      int[] in=new int[26];
      for(int i=0;i<words.length;i++){
        for(char a:words[i].toCharArray()){
            present[a-'a']=true;
        }
      }
      for(int i=0;i<26;i++){
        for(int a:adj.get(i)){
            in[a]++;
        }
      }
      int distinct=0;
      Stack<Integer> stack=new Stack<>();
      for(int i=0;i<26;i++){
        if(present[i]){
            distinct++;
            if(in[i]==0){
                stack.push(i);
            }
        }
      }

      
      
      StringBuilder sb=new StringBuilder();

      
      while(!stack.isEmpty()){
        int x=stack.pop();
        sb.append((char)(x+'a'));
        for(int a:adj.get(x)){
            in[a]--;
            if(in[a]==0){
                stack.push(a);
            }
        }
      }
      String s=sb.toString();
      if(s.length()!=distinct){
        return "";
      }
      return sb.toString();
      
    }
}
