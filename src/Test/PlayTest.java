package Test;

import Grid.Grid;
import Letters.Letter;
import Letters.Letters;
import Letters.MyLetters;
import Play.Play;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayTest {
    private MyLetters ml;
    private Letter l;
    private Grid g;
    private Letters ls;
    private Play p;


    @BeforeEach
    public void runBefore() {
        ml = new MyLetters();
        l = new Letter("a", 12, 5);
        g = new Grid();
        ls = new Letters();
        p = new Play(g);
    }

    @Test
    public void makeVisitedGrid() {
        g.addToGrid(ls.lettersMap.get("a"), 0, 0);
        g.addToGrid(ls.lettersMap.get("z"),5,5);
        p.makeVisitedGrid(g);
        assertEquals("false", p.VisitedGrid[5][5]);
        assertEquals("true", p.VisitedGrid[6][5]);
        assertEquals("true", p.VisitedGrid[5][6]);
        assertEquals("true", p.VisitedGrid[4][5]);
        assertEquals("true", p.VisitedGrid[5][4]);
        assertEquals(null, p.VisitedGrid[7][3]);

    }

}

