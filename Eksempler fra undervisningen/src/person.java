public class person {

    public String name;
    public int age;

    public person(String oname, int oage)
    {
        name = oname;
        age = oage;
    }

    public void sayYourName()
    {
        System.out.print(name);
    }

    public void sayYourAge()
    {
        System.out.println(" " + age);
    }
}
