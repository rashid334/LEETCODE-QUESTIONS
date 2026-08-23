class Solution {
    public int mySqrt(int x) {
      int low = 0,high=x/2,ans=0;
      if(x==1){
        return 1;
      }
      while(low<=high){
        int mid =(high+low)/2;
        if((long)mid*mid==x){
            return mid;
        }
        else if((long)mid*mid<x){
            low=mid+1;
        }
        else{
            high = mid-1;
        }
      }
      return high;
    }
}