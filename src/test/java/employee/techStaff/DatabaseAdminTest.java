package employee.techStaff;

import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.*;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before() {

        databaseAdmin = new DatabaseAdmin("David",123456, 32000);
    }

    @Test
    public void hasName() {

        assertEquals("David", databaseAdmin.getName());
    }

    @Test
    public void hasNi() {
        assertEquals(123456, databaseAdmin.getNi());
    }

    @Test
    public void hasSalary() {
        assertEquals(32000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(580.98);
        assertEquals(32580.98, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canNotRaiseSalary() {
        databaseAdmin.raiseSalary(-33000);
        assertEquals(0, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(320.0, databaseAdmin.payBonus(), 0.0);
    }

    @Test
    public void canChangeName() {
        databaseAdmin.setName("Mark");
        assertEquals("Mark", databaseAdmin.getName());
    }

}