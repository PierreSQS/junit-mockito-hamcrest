package org.pierrot.mockito;

import java.util.List;

public class NumberCollection {
    private final List<Integer> numbers;

    public NumberCollection(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getTotalUsingLoop() {
        var total = 0;
        for (var i = 0; i < numbers.size(); i++) {
            total += numbers.get(i);
        }

        return total;
    }

    public int getTotalUsingIterable() {
        var total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public int getTotalUsingStream()  {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
}
