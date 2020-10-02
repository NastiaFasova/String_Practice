import homework.Task28;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Task28Test {
    private Task28 task = new Task28();

    @Test
    public void GetStringFromArrayTest() {
        String[] str = {"123", "abcd" , "Java"};
        Assert.assertEquals("123 abcd Java", task.getStringFromArray(str));
    }

    @Test
    public void getUniqueSymbolsTest() {
        String str = "Heo,Jv!";
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        Assert.assertEquals(list, task.getUniqueSymbols("Hello, Java!"));
    }

    @Test
    public void showParametersInfoTest() {
        Assert.assertEquals(4, task.showParametersInfo(new String[]{"123", "678", "5", "980"}));
    }
}
