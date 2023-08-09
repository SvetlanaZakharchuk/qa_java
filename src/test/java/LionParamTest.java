import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamTest {

    @Parameterized.Parameter
    public String sex;
    @Parameterized.Parameter(1)
    public boolean hasMane;

    @Mock
    Feline feline;

    @Parameterized.Parameters(name = "Lion {0}  have mane {1}")
    public static Object[][] params() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},
        };
    }

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    //в этом тесте используем параметры sex и hasMane
    @Test
    public void lionDoesHasManeLionClassParamTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);

        boolean actualResult = lion.doesHaveMane();
        boolean expectedResult = hasMane;

        assertEquals(expectedResult, actualResult);
    }

    //в тестировании метода используем параметр sex
    @Test
    public void getFoodLionClassParamTest() throws Exception {

        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = lion.getFood();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expectedResult, actualResult);
    }
}
