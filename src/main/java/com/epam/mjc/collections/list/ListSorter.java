package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(Comparator.comparingInt(Integer::parseInt));
        sourceList.sort((o1, o2) -> (int) (5 * (Math.pow(Integer.parseInt(o1), 2)) + 3 - 5 * (Math.pow(Integer.parseInt(o2), 2)) + 3)
        );
    }
}
//5x^2+3
class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return (Math.max(Integer.parseInt(a), Integer.parseInt(b)));
    }
}