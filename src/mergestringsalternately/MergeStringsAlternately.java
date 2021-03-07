package mergestringsalternately;

import java.util.ArrayList;
import java.util.List;

public class MergeStringsAlternately {
    public static void main(String[] args) {

        System.out.println(mergeAlternately("abc", "pqr"));
    }

    public static String mergeAlternately(String word1, String word2) {
        String answer = "";

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        if (chars1.length == chars2.length) {
            for (int i = 0; i < chars1.length; i++) {
                answer += chars1[i];
                answer += chars2[i];
            }
        }
        else {
            int top1 = 0;
            int top2 = 0;

            if (chars1.length > chars2.length) {
                for (int i = 0; i < chars2.length; i++) {
                    answer += chars1[i];
                    answer += chars2[i];
                    top1++;
                }

                for (int i = top1; i < chars1.length; i++) {
                    answer += chars1[i];
                }
            } else {
                for (int i = 0; i < chars1.length; i++) {
                    answer += chars1[i];
                    answer += chars2[i];
                    top2++;
                }

                for (int i = top2; i < chars2.length; i++) {
                    answer += chars2[i];
                }
            }
        }

        return answer;
    }
}
