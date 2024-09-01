package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

<<<<<<< HEAD
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.Assert.assertThrows;
=======
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
>>>>>>> 08fc0ead5074d9a989adf1374352fa32d5c0f961

@RunWith(MockitoJUnitRunner.class)
public class LionTest extends TestCase {
    private static final String MALE = "Самец";
    private static final String UNSUPPORTED_SEX = "unsupported sex";
    private static final String TEXT_EXCEPTION = "Используйте допустимые значения пола животного - самей или самка";
    private Lion lion;
    @Mock
    private Feline feline;

    @Test
    public void testGetKittens() throws Exception {
<<<<<<< HEAD
        Lion lion = new Lion("Самец", feline);
        int expectedValue = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedValue);
        assertEquals(expectedValue, lion.getKittens());
=======
        lion = new Lion(MALE, feline);

        lion.getKittens();
        Mockito.verify(feline).getKittens();
>>>>>>> 08fc0ead5074d9a989adf1374352fa32d5c0f961
    }

    @Test
    public void testDoesHaveManeException() {
        Throwable throwable = catchThrowable(() -> {
            lion = new Lion(UNSUPPORTED_SEX, feline);
        });
        assertThat(throwable)
                .isInstanceOf(Exception.class)
                .hasMessage(TEXT_EXCEPTION);
    }

    @Test
<<<<<<< HEAD
    public void testLionConstructorWithFemale() {
        boolean expectedresultOfMane = false;
        try {
            Lion lion = new Lion("Самка", feline);
            assertEquals(expectedresultOfMane, lion.doesHaveMane());
        } catch (Exception e) {
            assertThrows(Exception.class, () -> new Lion("Самка", feline));
        }
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedtValue = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedtValue);
        assertEquals(expectedtValue, lion.getFood());
=======
    public void testGetFood() throws Exception {
        lion = new Lion(MALE, feline);

        lion.getFood();
        Mockito.verify(feline).getFood(Mockito.anyString());
>>>>>>> 08fc0ead5074d9a989adf1374352fa32d5c0f961
    }
}