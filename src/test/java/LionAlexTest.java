import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexTest {

    @Test
    public void getFrinedsLionAlexClassTest() throws Exception {
        Feline feline = new Feline();
        LionAlex lionAlex = new LionAlex(feline);
        List<String> actualResult = lionAlex.getFriends();
        List<String> expectedResult = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getPlaceOfLivingLionAlexClassTest() throws Exception {
        Feline feline = new Feline();
        LionAlex lionAlex = new LionAlex(feline);
        String actualResult = lionAlex.getPlaceOfLiving();
        String expectedResult = "Нью-Йоркский зоопарк";

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void getKittensLionAlexClassTest() throws Exception {
        Feline feline = new Feline();
        LionAlex lionAlex = new LionAlex(feline);

        int actualResult = lionAlex.getKittens();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }
}
