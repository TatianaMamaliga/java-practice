package solutions;

import java.util.ArrayList;
import java.util.Collections;

public class NextBiggestNumberWithTheSameDigits {

    public long getNumber(long n) {
        long result;

        String[] strings = String.valueOf(n).split("");
        ArrayList<Long> longs = new ArrayList<>();

        for (String s : strings) {
            longs.add(Long.valueOf(s));
        }
        longs.sort(Collections.reverseOrder());

        StringBuilder stringBuilder = new StringBuilder();
        for (Long l : longs) {
            stringBuilder.append(l);
        }

        result = Long.parseLong(stringBuilder.toString());

        if (result > n){
            return result;
        } else {
            return -1;
        }
    }
}