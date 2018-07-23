package Letters;

public class MyLetters {
    public String L1;
    public String L2;
    public String L3;
    public String L4;
    public String L5;
    public String L6;
    public String L7;


    public void MyLetters() {
        L1 = this.L1;
        L2 = this.L2;
        L3 = this.L3;
        L4 = this.L4;
        L5 = this.L5;
        L6 = this.L6;
        L7 = this.L7;
    }

    public void keyPressed(String keyCode) {
        int letterAmount = keyCode.length();
        for (int i = 0; i < letterAmount; i++) {
            String curr;
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
        }
    }
}
