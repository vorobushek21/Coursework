import javax.swing.plaf.IconUIResource;

public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private int id;
    private static int counter;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter+1;
        counter++;
    }
    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Полное имя = " + fullName +
                ", отделение = " + department +
                ", зарплата = " + salary +
                ", id = " + id;
    }
}
