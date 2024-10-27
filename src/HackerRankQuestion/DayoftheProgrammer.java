package HackerRankQuestion;

import java.util.Scanner;

public class DayoftheProgrammer {
    public static boolean isLeapYear(int year) {
        if (year < 1918) {
            return year % 4 == 0;
        } else if (year > 1918) {
            return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
        }
        return false;
    }
    public static String dayOfProgrammer(int year) {
        boolean leapYear = isLeapYear(year);
        int feb = leapYear ? 29 : 28;
        int eightMonthTotal = 215 + feb;

        int date = 256 - eightMonthTotal;
        int sept = 9;

        return year == 1918 ? "26.09.1918" :String.format("%02d.%02d.%d", date, sept, year);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        System.out.println(dayOfProgrammer(year));

    }
    }
