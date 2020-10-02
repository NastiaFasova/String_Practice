package homework;

import java.util.ArrayList;
import java.util.List;

public class Task28 {
    static final int NO_OF_CHARS = 256;

    public int showParametersInfo(String[] args) {
        System.out.printf("Кількість аргументів: %d\nПерелік агрументів: ", args.length);
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.print("\nУнікальні символи: ");
        getUniqueSymbols(getStringFromArray(args));
        return args.length;
    }

    public List<Character> getUniqueSymbols(String args) {
        int[] count = new int[NO_OF_CHARS];
        List<Character> list = new ArrayList<>();
        int i;
        for (i = 0; i < args.length(); i++) {
            if (args.charAt(i) != ' ') {
                count[(int) args.charAt(i)]++;
            }
        }
        int n = i;
        for (i = 0; i < n; i++) {
            if (count[(int) args.charAt(i)] == 1) {
                Character c = args.charAt(i);
                System.out.print(c);
                list.add(c);
            }
        }
        return list;
    }

    public String getStringFromArray(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (String arg : args) {
            sb.append(arg).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Task28 task28 = new Task28();
        task28.showParametersInfo(args);
    }
}
