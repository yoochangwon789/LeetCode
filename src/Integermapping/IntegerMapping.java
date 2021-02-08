package Integermapping;

import java.util.HashMap;
import java.util.Map;

public class IntegerMapping {
    public static void main(String[] args) {

    }

    public static String freqAlphabets(String s) {
        String answer = "";

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        char aToI = 'a';
        int iaToI = 1;

        for (int i = 0; i < 9; i++) {
            characterIntegerMap.put(aToI, iaToI);
            aToI++;
            iaToI++;
        }

        System.out.println(characterIntegerMap.get('a'));

        return answer;
    }
}
