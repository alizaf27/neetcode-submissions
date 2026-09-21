class Solution {
    public boolean isAnagram(String s, String t) {
          if (s.length() != t.length()) {
            return false;
        }
        char[] chars= s.toCharArray();
        char[] chars2= t.toCharArray();
        Arrays.sort(chars);
         Arrays.sort(chars2);
       
         return Arrays.equals(chars,chars2);
    }
}
