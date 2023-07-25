public class Bank {
    private int amt = 10000;
    int pin = 8079;

    public void setAmt(int p, int a) {
        if (pin == p) {
            amt = a;
        } else {
            System.out.println("Invalid pin");
            System.exit(0);
        }
    }

    public int getAmt(int p) {
        if (pin != p) {
            System.out.println("Invalid pin");
            System.exit(0);
        }
        return amt;
    }
}
