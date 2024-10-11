package ru.netology.services;

public class HolidayService {
    public int calculate(int income, int expense, int threshold) {
        int cash = 0;
        int count = 0;
        for (int month = 1; month <= 12; month++) {
            if (cash >= threshold) {
                cash = cash - expense;
                cash = cash / 3;
                count++;
            } else {
                cash += income - expense;
            }
        }
        return count;

    }
}
