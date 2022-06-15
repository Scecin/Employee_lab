import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("David",123456, 32000,"Marketing");
    }

    @Test
    public void hasName() {
        assertEquals("David", manager.getName());
    }

    @Test
    public void hasNi() {
        assertEquals(123456, manager.getNi());
    }

    @Test
    public void hasSalary() {
        assertEquals(32000, manager.getSalary(), 0.0);
    }

    @Test
    public void hasDeparment() {
        assertEquals("Marketing", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(32580.98, manager.raiseSalary(580.98), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(320.0, manager.payBonus(), 0.0);
    }

}