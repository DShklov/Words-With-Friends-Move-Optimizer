package Test;

import Letters.MyLetters;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyLettersTest {
    private MyLetters ml;

    @BeforeEach
    public void runBefore(){
        ml = new MyLetters();}

    @Test
    public void testkeyPressed() {
        ml.keyPressed("abcdefg");
        assertEquals("a", ml.L1);
        assertEquals("b",ml.L2);
        assertEquals("c",ml.L3);
        assertEquals("d",ml.L4);
        assertEquals("e", ml.L5);
        assertEquals("f", ml.L6);
        assertEquals("g",ml.L7);
    }

    @Test
    public void testkeyPressedNotAllLetters(){
        ml.keyPressed("abc");
            assertEquals("a", ml.L1);
            assertEquals("b",ml.L2);
            assertEquals("c",ml.L3);
            assertEquals(null,ml.L4);
            assertEquals(null, ml.L5);
            assertEquals(null, ml.L6);
            assertEquals(null,ml.L7);

    }



    }