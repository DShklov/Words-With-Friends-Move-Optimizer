package Letters;

public class MyLetters {
    public String L1;
    public String L2;
    public String L3;
    public String L4;
    public String L5;
    public String L6;
    public String L7;
    Letters ls = new Letters();
    Letter l = new Letter("",0,0);


    public MyLetters() {

        this.L1 = L1;
        this.L2 = L2;
        this.L3 = L3;
        this.L4 = L4;
        this.L5 = L5;
        this.L6 = L6;
        this.L7 = L7;
        this.ls = ls;
        this.l = l;
    }

    public void keyPressed(String keyCode) {
        int letterAmount = keyCode.length();
        String curr = "";
        for (int i = 0; i < letterAmount; i++) {
            switch(i) {
                case 0:
                    curr = keyCode.substring(0,1);
                    L1 = curr;
                    break;
                case 1:
                    curr = keyCode.substring(1,2);
                    L2 = curr;
                    break;
                case 2:
                    curr = keyCode.substring(2,3);
                    L3 = curr;
                    break;
                case 3:
                    curr = keyCode.substring(3,4);
                    L4 = curr;
                    break;
                case 4:
                    curr = keyCode.substring(4,5);
                    L5 = curr;
                    break;
                case 5:
                    curr = keyCode.substring(5,6);
                    L6 = curr;
                    break;
                case 6:
                    curr = keyCode.substring(6,7);
                    L7 = curr;
                    break;
            }
            if (this.ls.lettersMap.containsKey(curr)){
              Letter currlet = this.ls.lettersMap.get(curr);
              int newAmount = Letter.getAmount(currlet) - 1;
              this.ls.lettersMap.put(curr, new Letter(curr, currlet.getValue(currlet), newAmount));
            }
        }
    }
}
