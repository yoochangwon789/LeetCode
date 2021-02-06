package MaximumSixNineNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumSixNineNumber {
    public static void main(String[] args) {

        int num = 9669;

        System.out.println(maximumSixNineNumber(num));
    }

    public static int maximumSixNineNumber(int num) {
        int answer;

        List<Integer> integerList = new ArrayList<>();
        String sixNine = Integer.toString(num);
        StringBuilder stringBuilder;

        char a = '6';
        char b = '9';

        integerList.add(num);

        for (int i = 0; i < sixNine.length(); i++) {
            stringBuilder = new StringBuilder(sixNine);

            if (sixNine.charAt(i) == a) {
                stringBuilder.setCharAt(i, '9');
                integerList.add(Integer.parseInt(String.valueOf(stringBuilder)));
            }

            if (sixNine.charAt(i) == b) {
                stringBuilder.setCharAt(i, '6');
                integerList.add(Integer.parseInt(String.valueOf(stringBuilder)));
            }
        }

        System.out.println(integerList);

        answer = Collections.max(integerList);

        return answer;
    }
}
