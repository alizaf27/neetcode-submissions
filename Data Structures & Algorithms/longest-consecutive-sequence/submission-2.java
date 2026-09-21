class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int ans=1;
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) continue;
            if(nums[i+1]-nums[i]==1) ans++;
            else if(nums[i+1]-nums[i]!=1) {max=Math.max(ans,max);
            ans=1;}
        } return Math.max(max,ans);
    }
}
