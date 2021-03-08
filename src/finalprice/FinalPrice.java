package finalprice;

import java.util.ArrayList;
import java.util.List;

public class FinalPrice {
    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};

        finalPrices(prices);
        System.out.println("test");
    }

    public static int[] finalPrices(int[] prices) {
        int[] answer = {};

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < prices.length; i++) {
            integerList.add(prices[i]);
        }

        return answer;
    }
}
