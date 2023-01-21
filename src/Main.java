public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Комарова Ксения Арсентьевна", 3, 32168);
        employees[1] = new Employee("Захарова Милана Тимофеевна", 1, 31744);
        employees[2] = new Employee("Денисова Мария Арсентьевна", 2, 32436);
        employees[3] = new Employee("Антонов Давид Романович", 1, 46899);
        employees[4] = new Employee("Новикова Екатерина Ильинична", 2, 31141);
        employees[5] = new Employee("Чумаков Кирилл Владимирович", 3, 47814);
        employees[6] = new Employee("Маслова Виктория Георгиевна", 4, 34895);
        employees[7] = new Employee("Михайлова Василиса Михайловна", 5, 35968);
        employees[8] = new Employee("Попова Лидия Егоровна", 5, 48979);
        employees[9] = new Employee("Лобанов Али Семёнович", 4, 37790);
        printAllEmployee(employees);
        System.out.println();
        System.out.println("Сумма затрат на выплату заплат составила - " + amountOfSalaryCost(employees) + " рублей");
        System.out.println();
        smallestSalaryEmployee(employees);
        System.out.println();
        biggestSalaryEmployee(employees);
        System.out.println();
        System.out.println("Средний показатель заработной платы составляет - " + middleSalary(employees) + " рублей");
        System.out.println();
        fullNameAllOfEmployees(employees);
        System.out.println();
        salaryIndexing(employees, 4);
        System.out.println();
        smallestSalaryInDepartment(employees, 2);
        System.out.println();
        biggestSalaryInDepartment(employees, 4);
        System.out.println();
        amountOfDepartmentSalaryCost(employees, 2);
        System.out.println();
        middleSalaryOnDepartment(employees, 1);
        System.out.println();
        salaryIndexingOfDepartment(employees, 7, 3);
        System.out.println();
        fullNameEmployeesInDepartment(employees, 4);
        System.out.println();
        employeeWithSalaryLessThan(employees, 40000);
        System.out.println();
        employeeWithSalaryMoreThan(employees, 35000);
    }

    public static void printAllEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public static int amountOfSalaryCost(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    public static void smallestSalaryEmployee(Employee[] employees) {
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

    public static void biggestSalaryEmployee(Employee[] employees) {
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

    public static int middleSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum / employees.length;
    }

    public static void fullNameAllOfEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    public static void salaryIndexing(Employee[] employees, int percent) {
        int onePercent;
        int indexingSalary;
        for (int i = 0; i < employees.length; i++) {
            onePercent = employees[i].getSalary() / 100;
            indexingSalary = (onePercent * percent) + employees[i].getSalary();
            System.out.println("Проиндексированная на " + percent + " процента зарплата сотрудника " + employees[i].getFullName() + " составляет " + indexingSalary + " рублей");
        }
    }

        public static void smallestSalaryInDepartment (Employee[]employees,int department){
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

        public static void biggestSalaryInDepartment (Employee[]employees,int department){
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

        public static void amountOfDepartmentSalaryCost (Employee[]employees,int department){
            int sum = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == department) {
                    sum += employees[i].getSalary();
                }
            }
            System.out.println("Сумма затрат на заработную плату в отделе " + department + " составляет " + sum + " рублей");
        }

        public static void middleSalaryOnDepartment (Employee[]employees,int department){
            int sum = 0;
            int numberOfEmployees = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == department) {
                    sum += employees[i].getSalary();
                    numberOfEmployees++;
                }
            }
            int middleSalary = sum / numberOfEmployees;
            System.out.println("Средняя заработная плату в отделе " + department + " составляет " + middleSalary + " рублей");
        }


    public static void salaryIndexingOfDepartment(Employee[] employees, int percent, int department) {
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

    public static void fullNameEmployeesInDepartment(Employee[] employees, int department) {
        System.out.println("Все сотрудники отдела "+department+":");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].getFullName() + ", зарплата = "+employees[i].getSalary() + ", id = " + employees[i].getId());
            }
        }
    }

    public static void employeeWithSalaryLessThan(Employee[] employees, int maxSalary) {
        System.out.println("Работники с зарплатой меньше "+maxSalary+" рублей:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < maxSalary) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public static void employeeWithSalaryMoreThan(Employee[] employees, int minSalary) {
        System.out.println("Работники с зарплатой выше "+minSalary+" рублей:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= minSalary) {
                System.out.println(employees[i].toString());
            }
        }
    }
}
