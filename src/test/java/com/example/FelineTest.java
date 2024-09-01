package com.example;
<<<<<<< HEAD
=======

>>>>>>> 08fc0ead5074d9a989adf1374352fa32d5c0f961
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

<<<<<<< HEAD
import java.util.List;

import static org.mockito.Mockito.when;

=======
>>>>>>> 08fc0ead5074d9a989adf1374352fa32d5c0f961
@RunWith(MockitoJUnitRunner.class)
public class FelineTest extends TestCase {
    private final String expected = "Кошачьи";
    private static final int EXPECTED_KITTENS_COUNT_FOR_MOCK = 1;
    private int kittensCount = 5;

    @Spy
    private Feline feline;

    @Test
    public void testEatMeat() throws Exception {
<<<<<<< HEAD
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood);
=======
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
>>>>>>> 08fc0ead5074d9a989adf1374352fa32d5c0f961
    }

    @Test
    public void testGetFamily() {
        String actual = feline.getFamily();
        Mockito.verify(feline, Mockito.times(1)).getFamily();

        assertEquals("Ожидаемое семейство не соответствует фактическому",
                expected, actual);
    }

    @Test
    public void testGetKittens() {
        int actual = feline.getKittens();
        Mockito.verify(feline).getKittens(EXPECTED_KITTENS_COUNT_FOR_MOCK);

        assertEquals("Количество котят не соответствует ожидаемому",
                EXPECTED_KITTENS_COUNT_FOR_MOCK, actual);
    }

    @Test
    public void testTestGetKittens() {
        int actual = feline.getKittens(kittensCount);
        Mockito.verify(feline).getKittens(Mockito.anyInt());

        assertEquals("Количество котят не соответствует ожидаемому",
                kittensCount, actual);
    }
}