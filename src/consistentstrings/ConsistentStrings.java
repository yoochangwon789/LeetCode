package consistentstrings;

import java.util.HashSet;
import java.util.Set;

public class ConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};

        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }

        int cnt = 0;

        for (String word : words) {
            boolean flag = true;
            for (int j = 0; j < word.length(); j++) {
                if (!set.contains(word.charAt(j))) {
                    flag = false;
                }
            }
            if (flag) {
                cnt++;
            }
        }
        return cnt;
    }
}
