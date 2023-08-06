import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {
    //тестируем метод getSound()
    @Test
    public void getSoundCatClassTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);

        String actualResult = cat.getSound();
        String expectedResult = "Мяу";

        assertEquals(expectedResult, actualResult);
    }
    //тестируем метод getFood()
    @Test
    public void getFoodCatClassTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);


        List<String> actualResult = cat.getFood();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");

       assertEquals(expectedResult, actualResult);
    }
}
