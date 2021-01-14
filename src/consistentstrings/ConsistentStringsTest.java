package consistentstrings;

public class ConsistentStringsTest {
    public static void main(String[] args) {

        String allowed = "ab";
        char[] colander = new char[allowed.length()];
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        int[] wordsLength = new int[words.length];

        int cnt = 0;

        for (int i = 0; i < wordsLength.length; i++) {
            wordsLength[i] = words[i].length();
        }

        for (int i = 0; i < allowed.length(); i++) {
            colander[i] = allowed.charAt(i);
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < allowed.length(); j++) {
                if (words[i].indexOf(allowed.charAt(j)))
            }
        }
    }
}
