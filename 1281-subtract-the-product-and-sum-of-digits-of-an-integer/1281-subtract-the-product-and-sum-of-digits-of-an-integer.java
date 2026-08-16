class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1,k=n;
        while(n>0){
           product = product * (n%10);
           n=n/10; 
        }
        int sum =0;
while(k>0){
           sum = sum + (k%10);
           k=k/10; 
}
int difference = product - sum;
return difference;
    }
}