package Test;

import Letters.Letter;
import Letters.MyLetters;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyLettersTest {
    private MyLetters ml;
    private Letter l;


    @BeforeEach
    public void runBefore() {
        ml = new MyLetters();
        Letter l = new Letter("a", 12, 5);
    }

    @Test
    public void testkeyPressed() {
        ml.keyPressed("abcdefg");
        assertEquals("a", ml.L1);
        assertEquals("b", ml.L2);
        assertEquals("c", ml.L3);
        assertEquals("d", ml.L4);
        assertEquals("e", ml.L5);
        assertEquals("f", ml.L6);
        assertEquals("g", ml.L7);
    }

    @Test
    public void testkeyPressedNotAllLetters() {
        ml.keyPressed("abc");
        assertEquals("a", ml.L1);
        assertEquals("b", ml.L2);
        assertEquals("c", ml.L3);
        assertEquals(null, ml.L4);
        assertEquals(null, ml.L5);
        assertEquals(null, ml.L6);
        assertEquals(null, ml.L7);

    }

    @Test
    public void getAmountTest(){
        assertEquals(5, Letter.getAmount(new Letter("a", 12, 5)));
    }

    @Test
    public void getValueTest(){
        assertEquals(12, Letter.getValue(new Letter("a", 12, 5)));
    }
}