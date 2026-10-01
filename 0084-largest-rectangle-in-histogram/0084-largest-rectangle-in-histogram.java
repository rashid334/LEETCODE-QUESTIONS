class Solution {
    public int largestRectangleArea(int[] heights) {
       int n = heights.length;
       Stack<Integer> st = new Stack<>();
        //Nearest Smaller Integer 
       int right[] = new int[n];
       for(int i=n-1;i>=0;i--){
        while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
            st.pop();
        }
        if(st.isEmpty()){
            right[i]=n;
        }
        else{
            right[i]=st.peek();
        }
        st.push(i);
        }
        //clear stack
        st.clear();
        //previous smaller integer
        int ps[] = new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ps[i]=-1;
            }
            else{
                ps[i]=st.peek();
            }
            st.push(i);
        }
        //calculate maximum area
        int maxi=0;
        for(int i=0;i<n;i++){
            //maximum(maxi,heights[i]*width)    width=right[i]-ps[i]-1
maxi=Math.max(maxi,heights[i]*(right[i]-ps[i]-1));
       }
        return maxi;
    }
}