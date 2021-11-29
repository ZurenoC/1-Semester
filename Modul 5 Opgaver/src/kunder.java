public class kunder {

    public static void main(String[] args) {

        Customer aCustomer = new Customer("Peter", 101);
        aCustomer.deposit(1000);
        aCustomer.withdraw(600);
        aCustomer.getBalance();
        CustomerDatabase dataBase = new CustomerDatabase();
        dataBase.save(aCustomer);
        dataBase.save(new Customer("Erik", 102));



        System.out.println(aCustomer.name + " " + aCustomer.id );
        System.out.println(aCustomer.getBalance());


    }

}
