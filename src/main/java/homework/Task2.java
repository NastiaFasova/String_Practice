package homework;

public class Task2 {
    private int min;
    private int max;
    private int step;

    public Task2(int min, int max, int step) {
        this.min = min;
        this.max = max;
        this.step = step;
    }

    public int showTable() {
        int count = 0;
        System.out.println(" ---------------------------------------------------------");
        System.out.println("|Число в 10-му представленні | Число в 16-му представленні|");
        for (int i = min; i <= max; i += step) {
            count++;
            System.out.println(" ---------------------------------------------------------");
            System.out.printf("|%15d %13c  %12x %14c \n", i, '|', i, '|');
        }
        System.out.println(" ---------------------------------------------------------");
        return count;
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2(Integer.parseInt(args[0]),
                Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        System.out.println("Кількість чисел в заданому діапазоні із певним кроком: "
                + task2.showTable());
    }
}
