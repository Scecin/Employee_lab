package employee.techStaff;

import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.*;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("David",123456, 32000);
    }

    @Test
    public void hasName() {
        assertEquals("David", developer.getName());
    }

    @Test
    public void hasNi() {
        assertEquals(123456, developer.getNi());
    }

    @Test
    public void hasSalary() {
        assertEquals(32000,developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(580.98);
        assertEquals(32580.98, developer.getSalary(), 0.0);
    }

    @Test
    public void canNotRaiseSalary() {
        developer.raiseSalary(-33000);
        assertEquals(0, developer.getSalary(), 0.0);
    }
    @Test
    public void canPayBonus() {
        assertEquals(320.0, developer.payBonus(), 0.0);
    }

    @Test
    public void canChangeName() {
        developer.setName("Mark");
        assertEquals("Mark", developer.getName());
    }

}