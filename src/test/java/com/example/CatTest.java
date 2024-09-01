package com.example;
<<<<<<< HEAD
=======

>>>>>>> 08fc0ead5074d9a989adf1374352fa32d5c0f961
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

<<<<<<< HEAD
import java.util.Arrays;
import java.util.List;

=======
>>>>>>> 08fc0ead5074d9a989adf1374352fa32d5c0f961
@RunWith(MockitoJUnitRunner.class)
public class CatTest extends TestCase {
    private Cat cat;

    @Mock
    Feline feline;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }


    @Test
    public void testGetSound() {
        String actual = cat.getSound();

        assertEquals("Мяу", actual);
    }

    @Test
    public void testGetFood() throws Exception {
<<<<<<< HEAD
        List<String> expectedValue = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedValue);
        assertEquals(expectedValue, cat.getFood());
=======
        cat.getFood();
        Mockito.verify(feline).eatMeat();
>>>>>>> 08fc0ead5074d9a989adf1374352fa32d5c0f961
    }
}