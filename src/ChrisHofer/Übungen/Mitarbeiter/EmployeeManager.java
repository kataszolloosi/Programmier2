package ChrisHofer.Übungen.Mitarbeiter;

import java.util.ArrayList;

public class EmployeeManager {
    protected ArrayList<Employee> empList = new ArrayList<>();


    public void addEmployee(Employee e) {
        empList.add(e);
    }

    public double calcTotalSalary() {
        double total = 0;
        for(Employee e : empList) {
            total += e.getFullSalary();
        }
        return total;
    }
}
