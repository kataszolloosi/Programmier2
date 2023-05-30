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
        HashMap<String, Double> map = new HashMap<String, Double>();

        for (Employee e: empList) {
            if (map.containsKey(e.department)){
                map.put(e.department, e.getFullSalary()+map.get(e.department));
            } else {   //department nicht im hashmap
                map.put(e.department, e.getFullSalary());
            }
        } return map;
    }
}
