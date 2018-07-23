package Letters;

import java.util.HashMap;
import java.util.Map;

public class Letters {
    Letter a = new Letter("a", 1, 9);
    Letter b = new Letter("b", 4, 2);
    Letter c = new Letter("c", 4, 2);
    Letter d = new Letter("d", 2, 5);
    Letter e = new Letter("e", 1, 13);
    Letter f = new Letter("f", 4, 2);
    Letter g = new Letter("g", 3, 3);
    Letter h = new Letter("h", 3, 4);
    Letter i = new Letter("i", 1, 8);
    Letter j = new Letter("j", 10, 1);
    Letter k = new Letter("k", 5, 1);
    Letter l = new Letter("l", 2, 4);
    Letter m = new Letter("m", 4, 2);
    Letter n = new Letter("n", 2, 5);
    Letter o = new Letter("o", 1, 8);
    Letter p = new Letter("p", 4, 2);
    Letter q = new Letter("q", 10, 1);
    Letter r = new Letter("r", 1, 6);
    Letter s = new Letter("s", 1, 5);
    Letter t = new Letter("t", 1, 7);
    Letter u = new Letter("u", 2, 4);
    Letter v = new Letter("v", 5, 2);
    Letter w = new Letter("w", 4, 2);
    Letter x = new Letter("x", 8, 1);
    Letter y = new Letter("y", 3, 2);
    Letter z = new Letter("z", 10, 1);
    Letter unknown = new Letter("unknown", 0, 2);

    Map<String, Letter> lettersMap = new HashMap<String, Letter>();


    public Letters() {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.unknown = unknown;
        this.lettersMap = lettersMap;
        updateMap();
    }

    public void updateMap() {
        lettersMap.put("a", a);
        lettersMap.put("b", b);
        lettersMap.put("c", c);
        lettersMap.put("d", d);
        lettersMap.put("e", e);
        lettersMap.put("f", f);
        lettersMap.put("g", g);
        lettersMap.put("h", h);
        lettersMap.put("i", i);
        lettersMap.put("j", j);
        lettersMap.put("k", k);
        lettersMap.put("l", l);
        lettersMap.put("m", m);
        lettersMap.put("n", n);
        lettersMap.put("o", o);
        lettersMap.put("p", p);
        lettersMap.put("q", q);
        lettersMap.put("r", r);
        lettersMap.put("s", s);
        lettersMap.put("t", t);
        lettersMap.put("u", u);
        lettersMap.put("v", v);
        lettersMap.put("w", w);
        lettersMap.put("x", x);
        lettersMap.put("y", y);
        lettersMap.put("z", z);
        lettersMap.put("unknown", unknown);

    }

}


