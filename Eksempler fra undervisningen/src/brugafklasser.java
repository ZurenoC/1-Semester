public class brugafklasser {

    public static void main(String[] args)
    {

        person p1 = new person("John", 23);
        p1.sayYourName();
        p1.sayYourAge();

        person p2 = new person("Jonas", 66);
        p2.sayYourName();
        p2.sayYourAge();

        System.out.println(p1.name + " is " + p1.age + " years old");
    }

}
