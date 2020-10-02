package homework;

import java.util.Scanner;

public class Task14 {
    private String key;
    private String text;

    public void setKey(String key) {
        this.key = key;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст, який хочете зашифрувати: ");
        text = scanner.nextLine();
        return text;
    }

    public String getKey() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ключ для шифрування(вираз "
                + "повинен бути такої ж довжини як і початковий текст)");
        key = scanner.nextLine();
        return key;
    }

    public String encryptText() {
        StringBuilder sb = new StringBuilder();
        if (checkLength(text)) {
            for (int i = 0; i < text.length(); i++) {
                sb.append((char)(text.charAt(i) + key.charAt(i)));
            }
        }
        return sb.toString();
    }

    public String decryptText(String encrypted) {
        StringBuilder sb = new StringBuilder();
        if (checkLength(encrypted)) {
            for (int i = 0; i < encrypted.length(); i++) {
                sb.append((char)(encrypted.charAt(i) - key.charAt(i)));
            }
        }
        return sb.toString();
    }

    private boolean checkLength(String text) {
        if  (key.trim().length() != text.trim().length()) {
            throw new RuntimeException("Некоректний ввід даних. Ключ і текст повинні бути однакової довжини");
        }
        return true;
    }

    public static void main(String[] args) {
        Task14 task14 = new Task14();
        task14.getText();
        task14.getKey();
        String encryptedText = task14.encryptText();
        System.out.println("Зашифрований текст: " + encryptedText);
        String decryptedText = task14.decryptText(encryptedText);
        System.out.println("Розшифрований текст: " + decryptedText);
    }
}
