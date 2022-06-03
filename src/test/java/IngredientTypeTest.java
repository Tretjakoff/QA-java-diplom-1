import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

@RunWith(Parameterized.class)
public class IngredientTypeTest {

    public final IngredientType typeIngredient;
    public final String nameIngredient;
    public final float priceIngredient;

    public IngredientTypeTest(IngredientType typeIngredient, String nameIngredient, float priceIngredient) {
        this.typeIngredient = typeIngredient;
        this.nameIngredient = nameIngredient;
        this.priceIngredient = priceIngredient;
    }

    @Parameterized.Parameters
    public static Object[][] getNameAndPrice() {
        return new Object[][]{
                {IngredientType.SAUCE, "hot sauce", 100},
                {IngredientType.SAUCE, "sour cream", 200},
                {IngredientType.SAUCE, "chili sauce", 300},
                {IngredientType.FILLING, "cutlet", 100},
                {IngredientType.FILLING, "dinosaur", 200},
                {IngredientType.FILLING, "sausage", 300},
        };
    }

    @Test
    public void enumIncludes() {
        Ingredient ingredient = new Ingredient(typeIngredient, nameIngredient, priceIngredient);
        IngredientType actual = ingredient.getType();
        Assert.assertEquals(typeIngredient, actual);
    }
}
