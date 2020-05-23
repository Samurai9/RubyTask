package test.ru.kpfu.itis.Generator;

import main.ru.kpfu.itis.Generator.Generator;
import org.junit.*;

public class GeneratorTest {
    @Test
    public void serialNumberEqual0() {
        String result = Generator.generate(0);
        Assert.assertArrayEquals("".toCharArray(), result.toCharArray());
    }

    @Test
    public void serialNumberEqual1() {
        String result = Generator.generate(1);
        Assert.assertArrayEquals("1".toCharArray(), result.toCharArray());
    }

    @Test
    public void serialNumberEqual2() {
        String result = Generator.generate(2);
        Assert.assertArrayEquals("11".toCharArray(), result.toCharArray());
    }

    @Test
    public void serialNumberEqual3() {
        String result = Generator.generate(3);
        Assert.assertArrayEquals("21".toCharArray(), result.toCharArray());
    }

    @Test
    public void serialNumberEqual4() {
        String result = Generator.generate(4);
        Assert.assertArrayEquals("1211".toCharArray(), result.toCharArray());
    }

    @Test
    public void serialNumberEqual5() {
        String result = Generator.generate(5);
        Assert.assertArrayEquals("111221".toCharArray(), result.toCharArray());
    }

    @Test
    public void serialNumberEqual6() {
        String result = Generator.generate(6);
        Assert.assertArrayEquals("312211".toCharArray(), result.toCharArray());
    }
}
