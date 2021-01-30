package numberofcandies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberOfCandiesTest {
    public static void main(String[] args) {

        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        Arrays.sort(candies);

        int max = candies[candies.length - 1];

        List<Boolean> booleans = new ArrayList<>();

        for (int i = 0 ; i < candies.length; i++) {
            if (max >= candies[i] + extraCandies) {

            }
        }
    }
}
