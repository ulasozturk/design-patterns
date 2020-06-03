/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatternhomework;

import java.util.ArrayList;
/**
 *
 * @author pc
 */
public class Director implements IEmployee{
    
    private ArrayList<IEmployee> employees = new ArrayList<IEmployee>();
    @Override
    public void showEmployeeInfo() {
        for(IEmployee employee: employees){
            employee.showEmployeeInfo();
        }
    }
    
    public void addEmployee(IEmployee employee){
        employees.add(employee);
    }
    public void removeEmployee(IEmployee employee){
        employees.remove(employee);
    }
}
