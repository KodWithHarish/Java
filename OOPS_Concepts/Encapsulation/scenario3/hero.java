public class hero {
    public static void main(String[] args) {
        Bank b = new Bank();
    int p = 8079;
    b.setAmt(p, 5500);
    int a=b.getAmt(p);
    System.out.println("amt "+a);
    }
}
