package longestcommonprefix;

import java.util.ArrayList;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};
        String answer = "";

        for (int i = 0; i < strs.length; i++) {
            answer += strs[i];
        }

        char[] arr = answer.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
