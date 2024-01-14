package com.dangercode.javaCore.enums;

// CalendarApp.java
public class CalendarApp {

    public static void main(String[] args) {
        // Enum değerini kullanma
        MonthsEnum currentMonth = MonthsEnum.JANUARY;
        System.out.println("Current month: " + currentMonth);

        // Gün sayısını alma
        int daysInCurrentMonth = currentMonth.getDays();
        System.out.println("Days in current month: " + daysInCurrentMonth);

        // Tüm ayları döngü ile gezme
        System.out.println("\nAll months and their days:");
        for (MonthsEnum month : MonthsEnum.values()) {
            System.out.println(month + ": " + month.getDays() + " days");
        }
    }
}

