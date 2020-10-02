import homework.Task14;
import org.junit.Assert;
import org.junit.Test;

public class Task14Test {
    private Task14 task = new Task14();
    private Task14 task2 = new Task14();

    @Test
    public void encryptTextTest_Ok() {
        task.setKey("1112");
        task.setText("1112");
        Assert.assertEquals("bbbd", task.encryptText());

        task2.setKey("2113");
        task2.setText("3112");
        Assert.assertEquals("ebbe", task2.encryptText());
    }

    @Test(expected = RuntimeException.class)
    public void encryptTextTest() {
        task.setKey("111");
        task.setText("1112");
        task.encryptText();

        task2.setKey("211");
        task2.setText("3112");
        task2.encryptText();
    }

    @Test
    public void decryptTextTest_Ok() {
        task.setKey("1112");
        task.setText("1112");
        Assert.assertEquals("1112", task.decryptText(task.encryptText()));

        task2.setKey("2113");
        task2.setText("3112");
        Assert.assertEquals("3112", task2.decryptText(task2.encryptText()));
    }
}
