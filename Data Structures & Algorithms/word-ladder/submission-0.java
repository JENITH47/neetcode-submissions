class Solution {
    class Pair{
        String x;
        int height;
        Pair(String x,int height){
            this.x=x;
            this.height=height;

        }}
    public int ladderLength(String startWord, String targetWord, List<String> wordList) {
        if(!wordList.contains(targetWord)){
        return 0;
     }
     Queue<Pair> queue=new LinkedList<>();
     queue.offer(new Pair(startWord,1));
     ArrayList<String> visited=new ArrayList<>();
    //  int count=1;
     while(!queue.isEmpty()){
        String a=queue.peek().x;
        visited.add(a);
        int height=queue.peek().height;
        queue.poll();
        // count++;
        if(a.equals(targetWord)){
            return height;
        }
        StringBuilder sb=new StringBuilder(a);
        for(int i=0;i<a.length();i++){
            for(int j=0;j<26;j++){
                sb.setCharAt(i,((char)('a'+j)));
                String s=sb.toString();
                if(wordList.contains(s) && !visited.contains(s)){
                    queue.offer(new Pair(s,height+1));
                }
            }
            sb=new StringBuilder(a);
        }
        // count++;


     }
     return 0;
    }
}
