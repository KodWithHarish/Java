public class Account {
    public static void main(String[] args) {
        AccountDetails ad = new AccountDetails();
        ad.accountNumber = "05862410006630";
        ad.email = "harish@gmail.com";
        ad.branchCode = "CNRB0010586";

        // this will show error because private access modifier cannot be accessed directly
        // ad.pin = "harish@gmail.com";
        ad.setPin(1234);

        System.out.println("Account Details are: ");
        System.out.println("A/C No: " + ad.accountNumber);
        System.out.println("IFSC Code: " + ad.branchCode);
        System.out.println("Email: " + ad.email);
        System.out.println("Pin: " + ad.getPin());
    }
}
