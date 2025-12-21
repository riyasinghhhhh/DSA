class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int count = 0;
        char prev = 0;

        for (int i = 0; i < word.length(); i++) {
            char curr = word.charAt(i);

            if (curr != prev || count == 9) {
                if (count > 0) {
                    comp.append(count).append(prev);
                }
                prev = curr;
                count = 1;
            } else {
                count++;
            }
        }
        comp.append(count).append(prev);

        return comp.toString();
    }
}
