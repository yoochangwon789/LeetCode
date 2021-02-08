package Integermapping;

import java.util.HashMap;
import java.util.Map;

public class IntegerMappingTest {
    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();

        map.put('a', 1);

        System.out.println(map.get('a'));
    }
}
