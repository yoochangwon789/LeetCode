package MaximumSixNineNumber;

public class SixNineTest {
    public static void main(String[] args) {

        int n = 6699;

        String test = Integer.toString(n);
        StringBuilder builder = new StringBuilder(test);

        System.out.println(builder.charAt(2));
    }
}
