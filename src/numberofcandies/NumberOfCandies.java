package numberofcandies;

import java.util.ArrayList;
import java.util.List;

public class NumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;

        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];

        List<Boolean> booleans = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) max = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            if (max <= candies[i] + extraCandies) {
                booleans.add(true);
            }
            if (max > candies[i] + extraCandies) {
                booleans.add(false);
            }
        }

        return booleans;
    }
}
