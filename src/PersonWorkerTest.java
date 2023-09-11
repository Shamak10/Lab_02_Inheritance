import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonWorkerTest {
    private Person person;

    @Before
    public void setUp() {
        person = new Person();
    }

    @Test
    public void testFullName() {
        String fullName = person.fullName();
        assertEquals("John Doe", fullName);
    }

    @Test
    public void testFormalName() {
        String formalName = person.formalName();
        assertEquals("Mr. John Doe", formalName);
    }

    @Test
    public void testGetAge() {
        int age = person.getAge(2023); // Assuming the current year is 2023
        assertEquals(38, age);
    }
}
