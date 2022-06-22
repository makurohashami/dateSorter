package com.kotyk.dateSorter;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<LocalDate> unsortedDates = new ArrayList<>();
        unsortedDates.add(LocalDate.of(2005, 7, 1));
        unsortedDates.add(LocalDate.of(2005, 1, 2));
        unsortedDates.add(LocalDate.of(2005, 1, 1));
        unsortedDates.add(LocalDate.of(2005, 5, 3));

        IDateSorter dateSorter = new DateSorter();
        ArrayList<LocalDate> sortedDates = (ArrayList<LocalDate>) dateSorter.sortDates(unsortedDates);

        System.out.println(sortedDates.toString());

    }
}
