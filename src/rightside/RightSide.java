package rightside;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RightSide {
    public static void main(String[] args) {

        int[] arr = {17,18,5,4,6,1};

        System.out.println(replaceElements(arr));
    }

    public static int[] replaceElements(int[] arr) {
        int[] answer = {};
        List<Integer> stackList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) stackList.add(arr[i]);

        if (arr.length == 1) integerList.add(-1);

        if (stackList.size() > 1) {
            while (true) {
                stackList.remove(0);

                integerList.add(Collections.max(stackList));

                if (stackList.size() == 1) integerList.add(-1);

                if (integerList.size() == arr.length) break;
            }
        }

        answer = new int[integerList.size()];

        for (int i = 0; i < answer.length; i++) answer[i] = integerList.get(i);

        return answer;
    }
}
