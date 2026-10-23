class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
    for(int i=0;i<strs[0].length();i++){
        char ch = strs[0].charAt(i);
        for(int j=1;j<strs.length;j++){
            if(i>=strs[j].length()){
                return ans;
            }
            char chh = strs[j].charAt(i);
            if(ch!=chh){
                return ans;
            }
        }
     ans = ans + ch;
        // if(strs[0].length()==1){
        //     return strs[0].charAt(0);
        // }
    }  
    return ans;  
    }
}