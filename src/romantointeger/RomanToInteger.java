package romantointeger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int answer = 0;

        Map<Character, Integer> romanCharDict = new HashMap<>();
        romanCharDict.put('I', 1);
        romanCharDict.put('V', 5);
        romanCharDict.put('X', 10);
        romanCharDict.put('L', 50);
        romanCharDict.put('C', 100);
        romanCharDict.put('D', 500);
        romanCharDict.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || romanCharDict.get(s.charAt(i)) <= romanCharDict.get(s.charAt(i - 1))) {
                answer += romanCharDict.get(s.charAt(i));
            } else {
                answer += romanCharDict.get(s.charAt(i)) - 2 * romanCharDict.get(s.charAt(i - 1));
            }
        }

        return  answer;
    }
}
