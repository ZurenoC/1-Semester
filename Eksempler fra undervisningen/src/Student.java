public class Student extends human {

    public String lineOfStudy;
    public int studentId;

    public Student(String slineOfStudy, int sStudentId) {
        lineOfStudy = slineOfStudy;
        studentId = sStudentId;
    }

    public Student(String name, int age, String slineOfStudy, int sStudentId) {
        super(name, age);
        lineOfStudy = slineOfStudy;
        studentId = sStudentId;
    }

    public String getLineOfStudy() {
        return lineOfStudy;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String getName()
    {
        return "" + studentId; //lav en interger om til en string ved at lave "" foran med et + tegn
    }
}



