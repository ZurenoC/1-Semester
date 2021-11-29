public class CustomerDatabase {

    public Customer[] customers;

    public CustomerDatabase() {

        customers = new Customer[10];

    }

    public void save(Customer customer) {

        for (int i = 0; i <= 10; i++) {
            if (customers[i] == null) {
                customers[i] = customer;
                break;
            } else {
                System.out.println("Error");
            }

        }

    }

    public void remove(int id) {
        for (int i = 0; i <= 10; i++) {


        }


    }


}
