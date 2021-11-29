public class Main {

    public static void main(String[] args) {
        human p;
        p = new human("Anders", 36);

        System.out.println(p.getName());
        System.out.println(p.getAge());

        human p1 = new human();
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        Student s = new Student("Bjarne", 48, "SI/ST", 82948579);
        System.out.println(s.getLineOfStudy());
        System.out.println(s.getStudentId());
        System.out.println(s.getName());
        System.out.println(s.getAge());

        human[] human = new human[2];
        human p2 = new human ("The Real Bjarke", 22);
        System.out.println(p2.toString());



    }
}
