public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Ea", 20, 100);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());


        Student s1 = new Student("Jonas", 22, 101);
        System.out.println(s1.getStudentId());

    }
}
