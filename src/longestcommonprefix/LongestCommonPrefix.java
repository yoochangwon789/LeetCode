package longestcommonprefix;

import java.util.ArrayList;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] strs = {"abc", "abhy", "abty"};
        ArrayList<String> arrayList = new ArrayList<>();
        String shortLetter = strs[0];
        String answer = "";

        for (int i = 0; i < strs.length; i++) {
            arrayList.add(strs[i]);

            if (shortLetter.length() > strs[i].length()) {
                shortLetter = strs[i];
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == shortLetter){
                arrayList.remove(arrayList.get(i));
            }
        }

        for (int i = 0; i < strs.length; i++) {

        }
    }
}
