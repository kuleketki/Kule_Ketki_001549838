/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {

    private ArrayList<Employee> employeeList;
    private int lastEmployeeId = 0;
    

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public int getLastEmployeeId() {
        return lastEmployeeId;
    }
    
    public void setEmployeeId(int id){
        lastEmployeeId = id;
    }

    public Employee createEmployee(String name) {
        Employee employee = new Employee(lastEmployeeId);
        employee.setName(name);
        lastEmployeeId = employee.getId();
        employeeList.add(employee);
        return employee;
    }
}
