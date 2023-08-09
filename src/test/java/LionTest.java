import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    //тестируем метод getKittens()
    @Test
    public void getKittensLionClassTest() throws Exception {

        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);

        int actualResult = lion.getKittens();
        int expectedResult = 1;

        assertEquals(expectedResult, actualResult);
    }

    //в этом тесте проверяем, что у льва есть грива (в отдельном классе объединила тесты и сделала параметризованный тест)
    @Test
    public void doesHasManeTrueLionClassTest() throws Exception {
        Lion lion = new Lion("Самец", feline);

        boolean actualResult = lion.doesHaveMane();
        boolean expectedResult = true;

        assertEquals(expectedResult, actualResult);
    }

    //в этом тесте проверяем, что у львицы гривы нет (в отдельном классе объединила тесты и сделала параметризованный тест)
    @Test
    public void doesHasManeFalseLionClassTest() throws Exception {
        Lion lion = new Lion("Самка", feline);

        boolean actualResult = lion.doesHaveMane();
        boolean expectedResult = false;

        assertEquals(expectedResult, actualResult);
    }

    //тестируем метод List<String> getFood() для льва (в классе LionParamTest.java для тестирования метода использую параметризацию)
    @Test
    public void getFoodMaleLionClassTest() throws Exception {

        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = lion.getFood();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expectedResult, actualResult);
    }

    //тестируем метод getFood() для львицы (в классе LionParamTest.java для тестирования метода использую параметризацию)
    @Test
    public void getFoodLionFemaleLineClassTest() throws Exception {

        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = lion.getFood();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expectedResult, actualResult);
    }

    //тестируем исключение, если при создании льва в качестве пола передано не самец и не самка
    @Test
    public void LionClassExceptionLineClassTest() {
        try {
            Lion lion = new Lion("Просто текст", feline);
        } catch (Exception exception) {
            String textException = "Используйте допустимые значения пола животного - самей или самка";
            Assert.assertEquals(textException, exception.getMessage());
        }
    }


}
