class Solution {
    public int mySqrt(int x) {
      int low=0,high=x/2,ans=0;if(x==1) return 1;
      while(low<=high)
      {
        int mid=(low+high)/2;
        if((long) mid*mid==x)
        return mid;
        else if((long) mid*mid<x)
        {
            ans=mid;
            low=mid+1;
        }else
        high=mid-1;
      }  return ans;
    }
}