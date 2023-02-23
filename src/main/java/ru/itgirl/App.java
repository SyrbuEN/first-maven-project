package ru.itgirl;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Введите день недели на английском языке: ");
        Scanner inputDay = new Scanner(System.in);
        String day = inputDay.nextLine();
        System.out.println(dayOfWeek(DayOfWeekEn.valueOf(day)));
    }

    public static String dayOfWeek(DayOfWeekEn dayOfWeekEn) {
        String dayOfWeekRu = "";
        switch (dayOfWeekEn) {
            case MONDAY:
                dayOfWeekRu = "Понедельник";
                break;
            case TUESDAY:
                dayOfWeekRu = "Вторник";
                break;
            case WEDNESDAY:
                dayOfWeekRu = "Среда";
                break;
            case THURSDAY:
                dayOfWeekRu = "Четверг";
                break;
            case FRIDAY:
                dayOfWeekRu = "Пятница";
                break;
            case SATURDAY:
                dayOfWeekRu = "Суббота";
                break;
            case SUNDAY:
                dayOfWeekRu = "Воскресенье";
                break;
        }
        return String.format("Сегодня %s!", dayOfWeekRu);
    }

    public enum DayOfWeekEn {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}
