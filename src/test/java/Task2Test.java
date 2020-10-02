import homework.Task2;
import org.junit.Assert;
import org.junit.Test;

public class Task2Test {
    private Task2 task = new Task2(2, 20, 2);
    private Task2 task2 = new Task2(2, 50, 2);

    @Test
    public void showTableTest() {
        Assert.assertEquals(10, task.showTable());
        Assert.assertEquals(25, task2.showTable());
    }
}
