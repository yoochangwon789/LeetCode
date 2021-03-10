package sequence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sequence {
    public static void main(String[] args) {

    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        boolean answer;

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            integerList.add(arr[i]);
        }

        Collections.sort(integerList);

        int cnt = 0;

        for (int i = 1; i < integerList.size(); i++) {
            int a = arr[i - 1] - arr[i];

        }

        return true;
    }
}
