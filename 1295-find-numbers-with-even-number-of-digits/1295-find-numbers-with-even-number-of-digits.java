class Solution {
    public int findNumbers(int[] nums) {
       int count=0;
 for(int i=0;i<nums.length;i++){
        int digit=0;
       int x = nums[i];
    while(x>0){
       x = x/10;
        digit++;
    }
    if(digit%2==0){
count++;
    }
 }
    return count;

    }
}