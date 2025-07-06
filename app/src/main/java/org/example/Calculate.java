package org.example;

public class Calculate {
    public int sum(int a, int b) {
        return a + b;
    }

    public double average(int a, int b) {
        return (a + b) / 2.0;
    }

    public int sumBetween(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }

    public double averageBetween(int from, int to) {
        return sumBetween(from, to) / (double)(to - from + 1);
    }

    public int sumOddBetween(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            if (i % 2 == 1) sum += i;
        }
        return sum;
    }

    public int sumEvenBetween(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) sum += i;
        }
        return sum;
    }
}
