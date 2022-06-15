package staff;

public abstract class Employee {

    private String name;
    private int ni;
    private double salary;

    // Constructor
    public Employee(String name, int ni, double salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getNi() {
        return this.ni;
    }

    public double getSalary() {
        return this.salary;
    }

    // Methods
    public double raiseSalary(double moneyIncrement) {
        return this.salary += moneyIncrement;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}
