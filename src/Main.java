public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        // Задание 2
        System.out.println("Задание 2");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // Задание 3
        System.out.println("Задание 3");
        int number = 1;
        System.out.println(number + " ");
        for (int i = 0; i < 9; i++) {
            number = number * 2;
            System.out.println(number + " ");
        }
    }
}