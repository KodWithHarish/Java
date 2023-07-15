public class AccountDetails {
    public long accountNumber;
    protected String email;
    private int pin;
    // default Access modifier
    int branchCode;

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }
}