import java.security.SecureRandom;

public class StudentTest {

    public static void main(String[] args)
    {
        Student student1 = new Student("Jaret","Wright");
        student1.addGrade(99);
        student1.addGrade(100);
        student1.addGrade(71);
        student1.addGrade(66);

        SecureRandom rng = new SecureRandom();

        Student student2 = new Student("Tolu","Character");
        for (int i=1; i<=8; i++)
            student2.addGrade(rng.nextInt(50)+50);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        
    }
}
