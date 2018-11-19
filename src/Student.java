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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.isEmpty())
            throw new IllegalArgumentException("first name cannot be empty");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.isEmpty())
            throw new IllegalArgumentException("last name cannot be empty");
        this.lastName = lastName;
    }

    public ArrayList<Float> getGrades() {
        return grades;
    }

    public void addGrade(float newGrade) {
        if (newGrade >=0 && newGrade <=100)
            grades.add(newGrade);
        else
            throw new IllegalArgumentException("grade must be 0-100");
    }
}
