class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st = new Stack<>();
        int arr[] = new int[temp.length];
        for(int i=temp.length-1;i>=0;i--){
        while(!st.empty()&&temp[st.peek()]<=temp[i]){
st.pop();
        }
if(st.empty()){
    arr[i]=0;
}
else{
arr[i]=st.peek()-i;
}
st.push(i);
        }
        return arr;
    }
}