import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
              String n=st.nextToken();
             ans=n.length();            
        }
        return ans;
            }
}