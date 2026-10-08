class Solution {
    class Pair{
        String str;
        int step;
        Pair(String str,int step){
            this.str=str;
            this.step=step;
        }
    }
    public int openLock(String[] deadends, String target) {

        // boolean[] visited=new boolean[10000];
        // 
        HashSet<String> visited=new HashSet<>();
        HashSet<String> dead=new HashSet<>();
        for(int i=0;i<deadends.length;i++){
            if(deadends[i].equals("0000") || deadends[i].equals(target)){
                return -1;
            }
            dead.add(deadends[i]);
        }
        Queue<Pair> queue=new LinkedList<>();
        queue.offer(new Pair("0000",0));
        // visited[0]=true;
        visited.add("0000");
        while(!queue.isEmpty()){
            String node=queue.peek().str;
            int cost=queue.peek().step;
            queue.poll();
            if(node.equals(target)){
                return cost;
            }
            for(int i=0;i<4;i++){
                char[] arr=node.toCharArray();
                arr[i]=(char)((arr[i]-'0'+1)%10+'0');
                String x=new String(arr);
                if(!visited.contains(x) && !dead.contains(x)){
                    queue.offer(new Pair(x,cost+1));
                    visited.add(x);
                }
                arr=node.toCharArray();
                arr[i]=(char)((arr[i]-'0' +9)%10+'0');
                x=new String(arr);
                if(!visited.contains(x) && !dead.contains(x)){
                    queue.offer(new Pair(x,cost+1));
                    visited.add(x);
                }

            }
        }
        return -1;
    }
}