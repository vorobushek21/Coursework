public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Комарова Ксения Арсентьевна", 3, 32168);
        employeeBook.addEmployee("Захарова Милана Тимофеевна", 1, 31744);
        employeeBook.addEmployee("Денисова Мария Арсентьевна", 2, 32436);
        employeeBook.addEmployee("Антонов Давид Романович", 1, 46899);
        employeeBook.addEmployee("Новикова Екатерина Ильинична", 2, 31141);
        employeeBook.addEmployee("Чумаков Кирилл Владимирович", 3, 47814);
        employeeBook.addEmployee("Маслова Виктория Георгиевна", 4, 34895);
        employeeBook.addEmployee("Михайлова Василиса Михайловна", 5, 35968);
        employeeBook.addEmployee("Попова Лидия Егоровна", 5, 48979);
        employeeBook.addEmployee("Лобанов Али Семёнович", 4, 37790);
        employeeBook.printAllEmployee();
        System.out.println();
        System.out.println("Сумма затрат на выплату заплат составила - " + employeeBook.amountOfSalaryCost() + " рублей");
        System.out.println();
        employeeBook.smallestSalaryEmployee();
        System.out.println();
        employeeBook.biggestSalaryEmployee();
        System.out.println();
        System.out.println("Средний показатель заработной платы составляет - " + employeeBook.middleSalary() + " рублей");
        System.out.println();
        employeeBook.fullNameAllOfEmployees();
        System.out.println();
        employeeBook.salaryIndexing(4);
        System.out.println();
        employeeBook.smallestSalaryInDepartment(2);
        System.out.println();
        employeeBook.biggestSalaryInDepartment(4);
        System.out.println();
        employeeBook.amountOfDepartmentSalaryCost(2);
        System.out.println();
        employeeBook.middleSalaryOnDepartment(1);
        System.out.println();
        employeeBook.salaryIndexingOfDepartment(7, 3);
        System.out.println();
        employeeBook.fullNameEmployeesInDepartment(4);
        System.out.println();
        employeeBook.employeeWithSalaryLessThan(40000);
        System.out.println();
        employeeBook.employeeWithSalaryMoreThan(35000);
        System.out.println(employeeBook.getSize());
        employeeBook.removeEmployee(4);
        System.out.println(employeeBook.getSize());
        employeeBook.addEmployee("Демин Валерий Максимович", 2, 48000);
        employeeBook.changeEmployeeSalary("Демин Валерий Максимович", 31000);
        employeeBook.changeEmployeeDepartment("Демин Валерий Максимович", 1);
        employeeBook.printEmployee("Демин Валерий Максимович");
        employeeBook.printAllEmployeesWithDepartment();
    }
}
