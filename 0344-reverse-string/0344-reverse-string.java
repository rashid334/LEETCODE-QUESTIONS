class Solution {
    public void reverseString(char[] s) {
        int high = s.length-1;
        int low = 0;
        while(high>low){
            char temp = s[high];
            s[high] = s[low];
            s[low]=temp;
            high--;
            low++;
        }
    }
}