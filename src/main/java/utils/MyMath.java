package utils;

public class MyMath {

    public static int getDigitsSum(final int i) {
        int res = 0;
        int temp = Math.abs(i);

        for (int j = 0; j < 4; j++) {
            res += temp % 10;
            temp = temp / 10;
        }

        return res;
    }
}
