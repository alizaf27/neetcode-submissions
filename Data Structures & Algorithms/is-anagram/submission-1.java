class Solution {
    public boolean isAnagram(String s, String t) {
          if (s.length() != t.length()) {
            return false;
        }
        char[] chars= s.toCharArray();
        char[] chars2= t.toCharArray();
        Arrays.sort(chars);
         Arrays.sort(chars2);
        String k= new String(chars);
         String k2= new String(chars2);
         return k.equals(k2);
    }
}
