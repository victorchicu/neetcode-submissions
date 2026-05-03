class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sorted_s = s.toCharArray();
        char[] sorted_t = t.toCharArray();

        if (sorted_s.length != sorted_t.length)
            return false;

        Arrays.sort(sorted_s);
        Arrays.sort(sorted_t);

        String new_s = new String(sorted_s);
        String new_t = new String(sorted_t);

        return new_s.contains(new_t);
    }
}
