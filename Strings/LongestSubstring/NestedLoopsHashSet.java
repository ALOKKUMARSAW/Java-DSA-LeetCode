import java.util.HashSet;
import java.util.Set;

class Solution {
    public int NestedLoopHashSet(String s) {
        int n = s.length();
        int maxLength = 0;

        for (int start = 0; start < n; start++) {
            Set<Character> set = new HashSet<>();

            for (int end = start; end < n; end++) {
                char current = s.charAt(end);

                if (set.contains(current)) {
                    break;
                }

                set.add(current);
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }

        return maxLength;
    }
}