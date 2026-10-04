class Solution {
    public int removeElement(int[] nums, int val) {
        int start = 0;int k = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                k--;
            }
            else{
                nums[start++]=nums[i];
            }
        }
        return k;
    }
}