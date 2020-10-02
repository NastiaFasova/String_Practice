import homework.Task38;
import org.junit.Assert;
import org.junit.Test;

public class Task38Test {
    private Task38 task = new Task38();

    @Test
    public void isBinaryNumberTest_Ok() {
        Assert.assertTrue(task.isBinaryNumber("0101"));
        Assert.assertTrue(task.isBinaryNumber("11"));
    }

    @Test
    public void isBinaryNumberTest() {
        Assert.assertFalse(task.isBinaryNumber("-1"));
        Assert.assertFalse(task.isBinaryNumber("a"));
    }

    @Test
    public void showParametersInfoTest() {
        Assert.assertEquals(2,
                task.showParametersInfo(new String[]{"1111", "01111", "aaaa", "123", "-111"}));
    }
}
