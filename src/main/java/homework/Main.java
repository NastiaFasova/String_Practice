package homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    Task2 task2 = new Task2(Integer.parseInt(args[0]),
                            Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                    System.out.println("Кількість чисел в заданому діапазоні із певним кроком: "
                            + task2.showTable());
                }
                case 2 -> {
                    Task14 task14 = new Task14();
                    task14.getText();
                    task14.getKey();
                    String encryptedText = task14.encryptText();
                    System.out.println("Зашифрований текст: " + encryptedText);
                    String decryptedText = task14.decryptText(encryptedText);
                    System.out.println("Розшифрований текст: " + decryptedText);
                }
                case 3 -> {
                    Task28 task28 = new Task28();
                    task28.showParametersInfo(args);
                }
                case 4 -> {
                    Task38 task38 = new Task38();
                    task38.showParametersInfo(args);
                }
                case 5 ->
                    System.exit(0);
            }
        }
    }

    private static void showMenu()  {
        System.out.println("\nОберіть який клас хочете протестувати або вийдіть з програми: ");
        System.out.println("1. Task2(вивести таблицю із числами в певному діапазоні і "
                + "певним кроком в 10-ій та 16-ій системах). Необхідно передати 3 цілих значення");
        System.out.println("2. Task14(зашифрувати та розшифрувати текст)");
        System.out.println("3. Task28(отримати інформацію про введені параметри "
                + "та вивести строку із унікальними символами). Необхідно передати символи");
        System.out.println("4. Task38(отримати інформацію про введені параметри "
                + "та перетворити число із 2-ї системи в 16-у систему числення)."
                + " Необхідно передати символи і числа в двійковій системі за бажанням");
        System.out.println("5. Вийти з програми...");
    }
}
