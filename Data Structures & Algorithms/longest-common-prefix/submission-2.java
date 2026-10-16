class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder(strs[0]);

        for(int i=1;i<strs.length;i++){
            StringBuilder x=new StringBuilder(strs[i]);
            for(int j=0;j<sb.length() && j<strs[i].length();j++){
                if(x.charAt(j)!=sb.charAt(j)){
                    sb=new StringBuilder(sb.substring(0,j));
                    break;
                }
            }
            if(sb.length()>strs[i].length()){
                sb=new StringBuilder(strs[i]);
            }
        }
        return sb.toString();
    }
}