package solutions;

import java.util.concurrent.TimeUnit;

public class MillisecondsSinceMidnight {
    public int getMilliseconds(int h, int m, int s) {
        return (int) ((int) TimeUnit.HOURS.toMillis(h) + TimeUnit.MINUTES.toMillis(m) + TimeUnit.SECONDS.toMillis(s));
    }
}