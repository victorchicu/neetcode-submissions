class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> anagrams = new HashMap<Integer, List<String>>();
        for (String str : strs) {
            char[] sortedBytes = str.toCharArray();
            Arrays.sort(sortedBytes);
            String sortedStr = new String(sortedBytes);
            int anagramKey = sortedStr.hashCode();
            if (anagrams.containsKey(anagramKey)) {
                List<String> anagramList = anagrams.get(anagramKey);
                anagramList.add(str);
            } else {
                List<String> anagramList = new ArrayList<String>();
                anagramList.add(str);
                anagrams.put(anagramKey, anagramList);
            }
        }
        List<List<String>> output = new ArrayList<List<String>>();
        Set<Map.Entry<Integer, List<String>>> anagramsSet = anagrams.entrySet();
        for (Map.Entry<Integer, List<String>> set : anagramsSet) {
            output.add(set.getValue());
        }
        return output;
    }
}
