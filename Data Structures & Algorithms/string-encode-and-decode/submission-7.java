class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty())
            return "";
        StringBuilder builder = new StringBuilder();
        for (String str : strs) {
            builder.append(str.length());
            builder.append("П");
            builder.append(str);
            builder.append("В");
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        if (str.isEmpty())
            return new ArrayList<>();
        List<String> strings = new ArrayList<>();
        String[] words = str.split("В");
        for (String word : words) {
            String[] parts = word.split("П");
            int size = Integer.parseInt(parts[0]);
            strings.add(size > 0 ? parts[1] : "");
        }
        return strings;
    }
}
