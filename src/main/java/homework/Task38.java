package homework;

import java.util.ArrayList;
import java.util.List;

public class Task38 {
    public int showParametersInfo(String[] args) {
        System.out.printf("Кількість аргументів: %d\nПерелік агрументів: ", args.length);
        List<String> listOfBinary = new ArrayList<>();
        for (String arg : args) {
            if (!isBinaryNumber(arg)) {
                System.out.print(arg + " ");
            } else {
                listOfBinary.add(arg);
            }
        }
        System.out.println("\nКількість чисел в 2-ій системі : " +  listOfBinary.size());
        showBinaryTable(listOfBinary);
        return listOfBinary.size();
    }

    public boolean isBinaryNumber(String str) {
        String regex = "[0-1]+";
        return str.matches(regex);
    }

    private String getHexadecimalFromBinary(String str) {
        int decimal = Integer.parseInt(str,2);
        return Integer.toString(decimal,16);
    }

    private void showBinaryTable(List<String> list) {
        System.out.println(" \n---------------------------------------------");
        System.out.println("| Число в 2-ій системі | Число в 16-ій системі|");
        System.out.println(" ---------------------------------------------");
        for (String s : list) {
            System.out.printf("| %20s | %20s |", s, getHexadecimalFromBinary(s));
            System.out.println("\n ---------------------------------------------");
        }
    }

    public static void main(String[] args) {
        Task38 task38 = new Task38();
        task38.showParametersInfo(args);
    }
}

