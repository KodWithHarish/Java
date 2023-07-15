public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.bankName = "Canara";
        bank.branchCode = "CNRB0001";
        bank.name = "Harish Kumbhar";
        bank.accountNumber = "0123456789124";
        bank.setPin(1234);

        // this will rise error because the access modifier is Private and private variable cannot be accessed directly
        // bank.pin = "1234";

        System.out.println("Your bank details are : ");
        System.out.println("Bank Name: " + bank.bankName);
        System.out.println("Bank branch-code: " + bank.branchCode);
        System.out.println("A/C Holder Name: " + bank.name);
        System.out.println("Bank Account Number: " + bank.accountNumber);
        System.out.println("ATM Pin: " + bank.getPin());
    }

}
