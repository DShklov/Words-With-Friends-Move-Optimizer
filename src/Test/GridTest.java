package Test;

import Letters.Letter;
import Letters.Letters;
import Letters.MyLetters;
import Grid.Grid;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GridTest {
    private MyLetters ml;
    private Letter l;
    private Grid g;
    private Letters ls;


    @BeforeEach
    public void runBefore() {
        ml = new MyLetters();
        l = new Letter("a", 12, 5);
        g = new Grid();
        ls = new Letters();
    }

    @Test
    public void testAddKey() {
        g.addToGrid(ls.lettersMap.get("a"), 0, 0);
        assertEquals(ls.lettersMap.get("a"), g.MainGrid[0][0]);
    }
}

