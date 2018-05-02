package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariables {
    int val = 10;
    int x;

    AtomicVariables(int i){
        val = i;
    }

    private AtomicInteger value = new AtomicInteger(val);

    public static void main(String[] args) {
        AtomicVariables testClass = new AtomicVariables(5);
        System.out.println(testClass.value.decrementAndGet());
    }
}
