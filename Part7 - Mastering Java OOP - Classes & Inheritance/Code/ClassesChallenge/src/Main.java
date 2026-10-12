public class Main {
    public static void main(String[] args) {

        //        Account bobsAccount = new Account("12345",500, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
        //        bobsAccount.setNumber("12345");
        //        bobsAccount.setBalance(500);
        //        bobsAccount.setCustomerName("Bob Brown");
        //        bobsAccount.setCustomerEmail("myemail@bob.com");
        //        bobsAccount.setCustomerPhone("(087) 123-4567");

        Account bobsAccount = new  Account();

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250.0);
        bobsAccount.withdrawFunds(50.0);
    }

}