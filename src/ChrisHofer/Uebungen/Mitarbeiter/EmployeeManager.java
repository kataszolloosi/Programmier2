package ChrisHofer.Uebungen.Mitarbeiter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }

    protected ArrayList<Employee> empList = new ArrayList<>();


    public void addEmployee(Employee e) {
        empList.add(e);
    }

    // berechnet das gesamte Gehalt aller MitarbeiterInnen (inklusive derer Provisionen)
    public double calcTotalSalary() {
        double total = 0;
        for(Employee e : empList) {
            total += e.getFullSalary();
        }
        return total;
    }

    // Liefert das gesamte Gehalt aller Mitarbeiter auf die einzelnen Abteilungen abgebildet
    public HashMap<String, Double> getSalaryByDepartment() {
        Map<String, Double> result = new HashMap<>();
        for (Employee e: empList) {
            if (e.getBaseSalary() < e.get)
        }
    }
}
