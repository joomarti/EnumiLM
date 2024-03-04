import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        while (true) {
            Day.valueOf(new Scanner(System.in).nextLine());
            System.out.println(Day.MONDAY.getTranslationInKyrgyz() + " " + Day.MONDAY.getTimetableLessons());
            Day.valueOf(new Scanner(System.in).nextLine());
            System.out.println(Day.TUESDAY.getTranslationInKyrgyz() + " " + Day.TUESDAY.getTimetableLessons());
            Day.valueOf(new Scanner(System.in).nextLine());
            System.out.println(Day.THURSDAY.getTranslationInKyrgyz() + " " + Day.THURSDAY.getTimetableLessons());
            Day.valueOf(new Scanner(System.in).nextLine());
            System.out.println(Day.WENDEESDAY.getTranslationInKyrgyz() + " " + Day.WENDEESDAY.getTimetableLessons());
            Day.valueOf(new Scanner(System.in).nextLine());
            System.out.println(Day.SATURDAY.getTranslationInKyrgyz() + " " + Day.SATURDAY.getTimetableLessons());
            Day.valueOf(new Scanner(System.in).nextLine());
            System.out.println(Day.SUNDAY.getTimetableLessons() + " " + Day.SUNDAY.getTimetableLessons());
            Day.valueOf(new Scanner(System.in).nextLine());
            System.out.println(Day.FRIDAY.getTranslationInKyrgyz() + " " + Day.FRIDAY.getTimetableLessons());
        }
    }
}









