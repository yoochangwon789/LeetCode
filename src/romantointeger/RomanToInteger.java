package romantointeger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {

        String s = "IV";
        int result = 0;

        Map<Character, Integer> romanCharDict = new HashMap<>();
        romanCharDict.put('I', 1);
        romanCharDict.put('V', 5);
        romanCharDict.put('X', 10);
        romanCharDict.put('L', 50);
        romanCharDict.put('C', 100);
        romanCharDict.put('D', 500);
        romanCharDict.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || romanCharDict.get(s.charAt(i)) >= romanCharDict.get(s.charAt(i + 1))) {
                result += romanCharDict.get(s.charAt((i)));
            } else {
                result += romanCharDict.get(s.charAt((i + 1))) - romanCharDict.get(s.charAt((i)));
            }
        }
        System.out.println(result);
    }

    public int romanToInt(String s) {
        int answer = 0;
        return  answer;
    }
}
