package ChrisHofer.Uebungen.Mitarbeiter;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Szollosi", "Kata", "IT", 2500);
        Employee e2 = new Employee("Kertesz", "Nora", "Design", 2400);

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(e1);
        employeeManager.addEmployee(e2);

        System.out.println(employeeManager.calcTotalSalary());
        System.out.println(employeeManager.getSalaryByDepartment());


    }
}
