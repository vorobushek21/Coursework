public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String name, int department, int salary) {
        if (size >= employees.length) {
            System.out.println("Нового сотрудника добавить нельзя");
        }
        Employee newEmployee = new Employee(name, department, salary);
        employees[size++] = newEmployee;
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                System.out.println(employees[i].getFullName() + " удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void changeEmployeeDepartment(String name, int newDepartment) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(name)) {
                employees[i].setDepartment(newDepartment);
            }
        }
    }

    public void changeEmployeeSalary(String name, int newSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(name)) {
                employees[i].setSalary(newSalary);
            }
        }
    }

    public void printAllEmployeesWithDepartment() {
        int departmentNumber = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() > departmentNumber) {
                departmentNumber = employees[i].getDepartment();
            }
        }
        for (int i = 1; i <= departmentNumber; i++) {
            System.out.println("Работники отдела "+i+":");
            for (int j = 0; j < employees.length; j++) {
                if (i == employees[j].getDepartment()) {
                    System.out.println(employees[j].toString());
                }
            }
        }
    }

    public void printEmployee(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(name)) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public void printAllEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public  int amountOfSalaryCost() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    public  void smallestSalaryEmployee() {
        int min = 50000;
        for (int i = 0; i < employees.length; i++) {
            if (min > employees[i].getSalary()) {
                min = employees[i].getSalary();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (min == employees[i].getSalary()) {
                System.out.println("Сотрудник с нименьшей заработной платой:");
                System.out.println(employees[i].toString());
            }
        }

        //Методы для наибольшей и наименьшей зарплаты написаны разными способами в угоду разнообразию.

    }

    public  void biggestSalaryEmployee() {
        int max = 30000;
        Employee maxSalaryEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (max < employees[i].getSalary()) {
                max = employees[i].getSalary();
                maxSalaryEmployee = employees[i];
            }
        }
        System.out.println("Сотрудник с наибольшей заработной платой:");
        System.out.println(maxSalaryEmployee.toString());
    }

    public  int middleSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum / employees.length;
    }

    public void fullNameAllOfEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    public void salaryIndexing(int percent) {
        int onePercent;
        int indexingSalary;
        for (int i = 0; i < employees.length; i++) {
            onePercent = employees[i].getSalary() / 100;
            indexingSalary = (onePercent * percent) + employees[i].getSalary();
            System.out.println("Проиндексированная на " + percent + " процента зарплата сотрудника " + employees[i].getFullName() + " составляет " + indexingSalary + " рублей");
        }
    }

    public void smallestSalaryInDepartment (int department){
        int minSalary = 50000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (minSalary == employees[i].getSalary()) {
                System.out.println("Минимальная зарплата в отделе " + department + " принадлежит сотруднику " + employees[i].getFullName() + " и составляет " + minSalary);
            }
        }
    }

    public void biggestSalaryInDepartment (int department){
        int maxSalary = 20000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary == employees[i].getSalary()) {
                System.out.println("Максимальная зарплата в отделе " + department + " принадлежит сотруднику " + employees[i].getFullName() + " и составляет " + maxSalary);
            }
        }
    }

    public void amountOfDepartmentSalaryCost (int department){
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на заработную плату в отделе " + department + " составляет " + sum + " рублей");
    }

    public void middleSalaryOnDepartment (int department){
        int sum = 0;
        int numberOfEmployees = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
                numberOfEmployees++;
            }
        }
        int middleSalary = sum / numberOfEmployees;
        System.out.println("Средняя заработная плата в отделе " + department + " составляет " + middleSalary + " рублей");
    }


    public void salaryIndexingOfDepartment(int percent, int department) {
        int onePercent;
        int indexingSalary;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                onePercent = employees[i].getSalary() / 100;
                indexingSalary = (onePercent * percent) + employees[i].getSalary();
                System.out.println("Проиндексированная на " + percent + " процента зарплата сотрудника " + employees[i].getFullName() +"из отдела "+department+ " составляет " + indexingSalary + " рублей");
            }
        }
    }

    public void fullNameEmployeesInDepartment(int department) {
        System.out.println("Все сотрудники отдела "+department+":");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].getFullName() + ", зарплата = "+employees[i].getSalary() + ", id = " + employees[i].getId());
            }
        }
    }

    public void employeeWithSalaryLessThan(int maxSalary) {
        System.out.println("Работники с зарплатой меньше "+maxSalary+" рублей:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < maxSalary) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public void employeeWithSalaryMoreThan(int minSalary) {
        System.out.println("Работники с зарплатой выше "+minSalary+" рублей:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= minSalary) {
                System.out.println(employees[i].toString());
            }
        }
    }
}
