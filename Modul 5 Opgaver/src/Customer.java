public class Customer {

    //attributes
    public String name;
    public int id;
    public double balance;

    //constructor
    public Customer(String oname, int oid) {

        name = oname;
        id = oid;
        balance = 0;

    }

    public Customer(String oname, int oid, double obalance) {

        name = oname;
        id = oid;
        balance = obalance;

    }

    public void deposit(double amount) {

        balance = amount + balance;

    }
    //method

    public void withdraw(double amount) {

        if (balance > amount)
            balance = balance - amount;

    }

    public double getBalance() {

        return balance;

    }


}
