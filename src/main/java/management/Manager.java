package management;

import staff.Employee;

public class Manager extends Employee {

    public String deptName;

    public Manager(String name, int ni, double salary, String deptName) {
        super(name, ni, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }
}
