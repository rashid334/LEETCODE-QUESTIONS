class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int maxi=0;
        for(int i=0;i<n;i++){
        maxi = Math.max(maxi,candies[i]);
        }
        List<Boolean> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
ans.add(candies[i]+extraCandies>=maxi);
        }
        return ans;
    }
}