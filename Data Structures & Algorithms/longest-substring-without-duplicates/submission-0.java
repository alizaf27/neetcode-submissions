class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int count=0;
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            count=Math.max(i - left + 1, count);
        } return count;
    }
}