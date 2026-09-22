class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }

        // First window
        for (int i = 0; i < s1.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
        }

        // Slide the window
        for (int right = s1.length(); right < s2.length(); right++) {

            if (Arrays.equals(freq1, freq2)) {
                return true;
            }

            // Remove left character
            int left = right - s1.length();
            freq2[s2.charAt(left) - 'a']--;

            // Add right character
            freq2[s2.charAt(right) - 'a']++;
        }

        // Check last window
        return Arrays.equals(freq1, freq2);
    }
}
