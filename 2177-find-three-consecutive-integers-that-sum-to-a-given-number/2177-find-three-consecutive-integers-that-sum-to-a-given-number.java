class Solution {
    public long[] sumOfThree(long num) {
        long ans[] = new long [3];
        long x = (num-3)/3;
        if((x+x+1+x+2)==num){
            ans[0]=x;
            ans[1]=x+1;
            ans[2]=x+2;
            return ans;
        }
        return new long[0];
    }
}