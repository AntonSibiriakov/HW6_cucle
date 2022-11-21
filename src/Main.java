public class Main {
    public static void main(String[] args) {
        //Задание №1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Задание №2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Задание №3
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //Задание №4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Задание №5
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является высокосным");
        }

        //Задание №6
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        //Задание №7
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }

        //Задание №8
        int savings = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total += savings;
            System.out.println("Месяц " + i + " сумма накоплений " + total);
        }

        //Задание №9
        int savings0 = 29000;
        int total0 = 0;
        for (int i = 0; i < 12; i++) {
            total0 += total0 / 100;
            total0 += savings0;
            System.out.println("Месяц " + i + " сумма накоплений " + total0);
        }
    }
}