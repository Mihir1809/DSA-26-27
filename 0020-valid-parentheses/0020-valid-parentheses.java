class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();;
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch==')' && !st.isEmpty() && st.peek()=='('){
                st.pop();
            }
            else if(ch=='}' && !st.isEmpty() && st.peek()=='{'){
                st.pop();
            }
            else if(ch==']' && !st.isEmpty() && st.peek()=='['){
                st.pop();
            }
            else st.push(ch);
        }
        return st.isEmpty();
    }
}