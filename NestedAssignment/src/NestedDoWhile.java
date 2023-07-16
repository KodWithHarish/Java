public class NestedDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Outside loop : " + i);
            int j = 1;
            do {
                System.out.println("Inside loop : " + j);
                j++;
            } while (j <= 5);
            i++;
        } while (i <= 2);
    }
}
