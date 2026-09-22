class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        List<List<Integer>> temp= new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-1;i++){
               if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
      int j=nums.length-1;

       int k=i+1;
       while(k<j){
            if(nums[i]+nums[j]+nums[k]==0 && i!=j&&i!=k&&j!=k)  {  
                 List<Integer> ans= new ArrayList<>();       ans.add(nums[i]);
            ans.add(nums[k]);
            ans.add(nums[j]);
            temp.add(ans);
              // skip duplicates
                    while (k < j && nums[k] == nums[k + 1]) {
                        k++;
                    }

                    while (k < j && nums[j] == nums[j - 1]) {
                        j--;
                    }

          k++;
            j--;
            }

            else if(nums[i]+nums[j]+nums[k]>0) j--;
            else k++;
      
        }}
         return temp;
    }
}
