class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack= new Stack<>();
        int n=temperatures.length;
        int[] ans= new int[n]; 
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int prev=stack.pop();
                int curr= i-prev;
                ans[prev]=curr;
            }
            stack.push(i);
        } return ans;
    }
}
