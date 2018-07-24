package Play;

import Grid.Grid;
import Letters.Letter;
import Letters.Letters;
import Letters.MyLetters;
import Other.intPair;

import java.util.ArrayList;
import java.util.List;

public class Play {
  MyLetters ml = new MyLetters();
  Letters ls = new Letters();
  Letter l;
  //Grid g = new Grid();


    public String[][] VisitedGrid = {
            {null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null, null}};

    public Letter[][][] WordFrag = {
            {{null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}},
            {{null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}},
            {{null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}},
            {{null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}},
            {{null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}},
            {{null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}},
            {{null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}},
            {{null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}},
            {{null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}},
            {{null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}},
            {{null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}, {null}}};


    public Play(Grid g){
        this.ml = ml;
        //this.g = g;
    if (g.MainGrid[6][6] != null){
        List stp = SpacesToPlay(g);

    }
    }



    public List SpacesToPlay(Grid g) {
        makeVisitedGrid(g);
        return adjacentSpaces();
    }


    public void makeVisitedGrid(Grid g){
        for (int y = 0; y < 11; y++) {
            for (int x = 0; x < 11; x++) {

                if (g.MainGrid[y][x] != null){
                    VisitedGrid[y][x] = "false";

                    if (y+1 < 11){
                    if (VisitedGrid[y+1][x] != "false"){
                        VisitedGrid[y+1][x] = "true";

                        int n = 0;
                         for(int i = y; i + 1 > 0; i--){
                             if (VisitedGrid[i][x] == "false"){
                                 WordFrag[y+1][x][n] = g.MainGrid[i][x];
                                 n++;
                             } else {
                                 i = -1;
                             }
                        }
                    }}

                    if (x+1 < 11){
                    if (VisitedGrid[y][x+1] != "false"){
                        VisitedGrid[y][x+1] = "true";

                        int n = 0;
                        for(int i = x; i >= 0; i--){
                            if (VisitedGrid[y][i] == "false"){
                                WordFrag[y][x+1][n] = g.MainGrid[y][i];
                                n++;
                            } else {
                                i = -1;
                            }
                        }
                    }}

                if (y-1 > 0) {
                    if (VisitedGrid[y - 1][x] != "false") {
                        VisitedGrid[y - 1][x] = "true";

                        int n = 0;
                        for (int i = y; i <= 11; i++) {
                            if (VisitedGrid[i][x] == "false") {
                                WordFrag[y - 1][x][n] = g.MainGrid[i][x];
                                n++;
                            } else {
                                i = 12;
                            }
                        }
                    }
                }

                if (x-1 > 0) {
                    if (VisitedGrid[y][x-1] != "false"){
                        VisitedGrid[y][x-1] = "true";

                        int n = 0;
                        for(int i = x; i <= 11; i++){
                            if (VisitedGrid[y][i] == "false"){
                                WordFrag[y][x-1][n] = g.MainGrid[y][i];
                                n++;
                            } else {
                                i = 12;
                            }
                        }
                    } } } }}}

    public List adjacentSpaces(){
        List<intPair> ret = new ArrayList<intPair>();

        for (int y = 0; y < 11; y++) {
            for (int x = 0; x < 11; x++) {
                if (VisitedGrid[y][x] == "true"){
                    ret.add(new intPair(y,x));
                }
                }
            }
            return ret;
}}