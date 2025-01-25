public class IsAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean result = isAnagram(s, t);
        System.out.println(result);
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // If the lengths are different, they cannot be anagrams
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // Increment the count for each character in s
            count[t.charAt(i) - 'a']--; // Decrement the count for each character in t
        }

        // Check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false; // If any count is not zero, they are not anagrams
            }
        }
        return true; // If all counts are zero, they are anagrams
    }
}
