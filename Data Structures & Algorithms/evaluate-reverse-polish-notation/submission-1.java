class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();
        for(String x:tokens){
           if(x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/")){
                int b=stack.pop();
                int a=stack.pop();
                if(x.equals("+")){
                    stack.push(a+b);
                }
                else if(x.equals("-")){
                    stack.push(a-b);
                }
                else if(x.equals("*")){
                    stack.push(a*b);
                }
               else{
                    stack.push(a/b);
                }
            }else{
                stack.push(Integer.parseInt(x));
            }

        } return stack.pop();
    }
}
