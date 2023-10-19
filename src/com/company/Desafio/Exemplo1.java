package com.company.Desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Exemplo1 {
    public static void main(String[] args) {
        List<List<Interval>> testCases = new ArrayList<>();
        testCases.add(List.of(new Interval(1, 3), new Interval(4, 7), new Interval(2, 5), new Interval(6, 8)));
        testCases.add(List.of(new Interval(1, 3), new Interval(7, 9), new Interval(2, 5)));

        for (List<Interval> intervals : testCases) {
            int distinctCount = countDistinctIntervals(intervals);
            System.out.println("Quantidade de intervalos distintos: " + distinctCount);
        }
    }

    public static int countDistinctIntervals(List<Interval> intervals) {
        if (intervals.isEmpty()) {
            return 0;
        }

        // Ordena os intervalos com base no ponto inicial.
        Collections.sort(intervals, (a, b) -> a.start - b.start);

        int count = 1;
        int end = intervals.get(0).end;

        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start > end) {
                count++;
                end = intervals.get(i).end;
            } else {
                end = Math.max(end, intervals.get(i).end);
            }
        }

        return count;
    }
}


