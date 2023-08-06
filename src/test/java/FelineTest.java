import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {

        //тестируем метод eatMeat()
    @Test
    public void eatMeatFelineClassTest() throws Exception {
        Feline feline = new Feline();

        List<String> actualResult = feline.eatMeat();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expectedResult, actualResult);
    }

    // метод getFamily()
    @Test
    public void getFamilyFelineClassTest(){
        Feline feline = new Feline();
        String actualResult = feline.getFamily();
        String expectedResult = "Кошачьи";

       assertEquals(expectedResult, actualResult);
    }

   //тестируем метод getKittens() без параметров
    @Test
    public void getKittensFelineClassTest(){
        Feline feline = new Feline();

        int actualResult = feline.getKittens();
        int expectedResult = 1;

        assertEquals(expectedResult, actualResult);
    }

    //проверяем метод getKittens(int kittensCount) с параметрами
    @Test
    public void getKittensFelineClassWithArgumentTest(){
        Feline feline = new Feline();
        Integer actualResult = feline.getKittens(4);
        Integer expectedResult = 4;

        assertEquals(expectedResult,actualResult);
     }
}
