class Solution {
    public int calPoints(String[] operations) {
        int result =0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            String number = operations[i];
            if(number.equals("+")){
               int val1 = st.pop();
               int val2 = st.pop();
               int newVal = val1+val2;
               st.push(val2);
               st.push(val1);
               st.push(newVal);
            }
           else if(number.equals("D")){
st.push(2*st.peek());
            }
            else if(number.equals("C")){
st.pop();
            }
            else{
                st.push(Integer.parseInt(number));
            }
        }
        while(!st.isEmpty()){
result+=st.pop();
        }
        return result;
    }
}