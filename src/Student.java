import java.util.ArrayList;

public class Student {
    private String firstName, lastName;
    private ArrayList<Float> grades;

    /**
     * This is the constructor.  It accepts the first and last name
     * of the student as arguments and sends them to the set methods
     * for validation and setting of the instance variables
     */
    public Student(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
        grades = new ArrayList<>();
    }

    


}
