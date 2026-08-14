class Solution {
    public int addDigits(int num) {
        int r;int sum=0;
while(num>0){
    r=num%10;
sum = sum+r;
num = num/10;
}
while(sum>=10){
r = sum%10;
    int summ=0;
while(sum>0){
    r = sum%10;
summ = summ+r;
sum = sum/10;
}
 sum = summ;
}
return sum;

    }
}