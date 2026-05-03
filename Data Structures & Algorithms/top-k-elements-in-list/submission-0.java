class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencies = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (frequencies.containsKey(num)) {
                Integer counter = frequencies.get(num);
                counter++;
                frequencies.put(num, counter);
            } else {
                frequencies.put(num, 1);
            }
        }
        
        Comparator<Map.Entry<Integer, Integer>> reversedComparator =
            Comparator.comparingInt((Map.Entry<Integer, Integer> entry) -> entry.getValue())
                .reversed();

        int[] freq = frequencies.entrySet().stream()
                .sorted(reversedComparator)
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
        
        return freq;
    }
}
