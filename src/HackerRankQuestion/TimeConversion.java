package HackerRankQuestion;

import java.util.Scanner;

public class TimeConversion {
    public static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        String min = s.substring(3, 5);
        String sec = s.substring(6, 8);
        String amPm = s.substring(8);

        if (amPm.equals("PM") && hour != 12) {
            hour += 12;
        } else if (amPm.equals("AM") && hour == 12) {
            hour = 0;
        }

        return String.format("%02d:%s:%s", hour, min, sec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sh = sc.next();
        System.out.println(timeConversion(sh));


    }
}
