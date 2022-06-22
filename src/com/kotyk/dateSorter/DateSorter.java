package com.kotyk.dateSorter;

import java.time.LocalDate;
import java.util.*;

public class DateSorter implements IDateSorter {

    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {

        ArrayList<Integer> monthNumbersWithRInName = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 9, 10, 11, 12));
        List<LocalDate> monthWithRInName = new ArrayList<>();
        List<LocalDate> monthWithoutRInName = new ArrayList<>();
        List<LocalDate> sortedDates = new ArrayList<>();

        for (LocalDate date : unsortedDates) {
            if (monthNumbersWithRInName.contains(date.getMonthValue())) {
                monthWithRInName.add(date);
            } else {
                monthWithoutRInName.add(date);
            }
        }

        Collections.sort(monthWithRInName);

        Collections.sort(monthWithoutRInName);
        Collections.reverse(monthWithoutRInName);

        sortedDates.addAll(monthWithRInName);
        sortedDates.addAll(monthWithoutRInName);

        return sortedDates;
    }
}
