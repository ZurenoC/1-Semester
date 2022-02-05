public class Car extends Vehicle implements Price {


    Car(String name, int age){
        super(name, age);
    }


    @Override
    public void go() {

    }


    Price price = new Car("Bently",24);

    @Override
    public void price() {

    }
}
