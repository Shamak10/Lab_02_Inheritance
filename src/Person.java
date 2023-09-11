import java.util.Calendar;

public class Person {
    String firstName;
    public String lastName;
    private String ID;
    public String title;
    private int YOB;

    public Person() {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public Person(String firstName, String lastName, String title, int yearOfBirth) {
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public String formalName() {
        return title + " " + fullName();
    }

    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - YOB;
    }

    public int getAge(int year) {
        return year - YOB;
    }

    public String toCSVDataRecord() {
        return ID + "," + firstName + "," + lastName + "," + title + "," + YOB;
    }
}