package management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirectorTest {

    private Director director;

    @Before
    public void before() {
        director = new Director("David",123456, 32000,"Marketing", 100000);
    }

    @Test
    public void hasName() {
        assertEquals("David", director.getName());
    }

    @Test
    public void hasNi() {
        assertEquals(123456, director.getNi());
    }

    @Test
    public void hasSalary() {
        assertEquals(32000, director.getSalary(), 0.0);
    }

    @Test
    public void hasDeparment() {
        assertEquals("Marketing", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(580.98);
        assertEquals(32580.98, director.getSalary(), 0.0);
    }

    @Test
    public void canNotRaiseSalary() {
        director.raiseSalary(-33000);
        assertEquals(0, director.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(640.0, director.payBonus(), 0.0);
    }

    @Test
    public void hasBudget() {
        assertEquals(100000, director.getBudget(), 0.0);
    }

    @Test
    public void canChangeName() {
        director.setName("Mark");
        assertEquals("Mark", director.getName());
    }

}