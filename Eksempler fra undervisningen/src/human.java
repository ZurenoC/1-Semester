public class human {

    public String name;
    public int age;

    public human() {
        name = "John Diller";
        age = 22;
    }

    public human(String pname, int page) {
        name = pname;
        age = page;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString()
    {
        return name;
    }

}



