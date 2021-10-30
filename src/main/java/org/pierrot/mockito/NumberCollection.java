package org.pierrot.mockito;

import java.util.List;

public class NumberCollection {
    private final List<Integer> numbers;

    public NumberCollection(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getTotalUsingLoop() {
        int total = 0;
        for (int i = 0; i < numbers.size(); i++) {
            total += numbers.get(i);
        }

        return total;
    }
}
