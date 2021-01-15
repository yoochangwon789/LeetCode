package consistentstrings;

import java.util.ArrayList;

public class ConsistentStringsTest {
    public static void main(String[] args) {

        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};

        ArrayList<String> arrayList = new ArrayList();

        String[] arr = new String[allowed.length()];

        for (int i = 0; i < allowed.length(); i++) {
            arr[i] = String.valueOf(allowed.charAt(i));
        }

        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < words.length; j++) {
                arrayList.add(words[j].replace(arr[i], ""));
            }
        }

        String[] answer = new String[arrayList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (answer[j].indexOf(arr[i]) < 0) {
                    arrayList.remove(j);
                }
            }
        }


        System.out.println(arrayList);
    }
}
