package com.ravi.delayqueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedElement implements Delayed {
    @Override
    public long getDelay(TimeUnit unit) {
        return TimeUnit.SECONDS.ordinal();
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }
}
