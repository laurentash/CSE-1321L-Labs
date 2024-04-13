public class FSA {
    private int state;


    public FSA(int state) {

        if (state < 0 || state > 3) {

            this.state = 0;
            System.out.println("This is an invalid state. Starting at state 0");

        }
        else {
            this.state = state;
        }
    }


    public int goToNextState() {

        switch (state) {

            case 0:
                state = 1;
                break;
            case 1:
                state = 2;
                break;
            case 2:
                state = 3;
                break;
            case 3:

                break;
        }
        return state;
    }


    public boolean end() {

        return state == 3;
    }
}
