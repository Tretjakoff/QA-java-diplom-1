import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTest {

    public final String name;
    public final float price;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] getNameAndPrice() {
        return new Object[][]{
                {"black bun", 100},
                {"white bun", 200},
                {"red bun", 300},
                {"", 0},
                {null, 0.0f},
        };
    }

    @Test
    public void parameterizedBunNameTest() {
            Bun bun = new Bun(name, price);
            assertEquals(name, bun.getName());
    }

    @Test
    public void parameterizedBunPriceTest() {
        Bun bun = new Bun(name, price);
        assertEquals(price, bun.getPrice(), 0.0f);
    }
}
