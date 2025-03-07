package Bai1_RaceCondition;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    AtomicInteger count = new AtomicInteger(0);

    void increment() {
        count.getAndIncrement(); // Atomic operation
    }
}
