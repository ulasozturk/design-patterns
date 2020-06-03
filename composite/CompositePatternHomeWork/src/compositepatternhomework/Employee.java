package compositepatternhomework;

public class Employee implements IEmployee{
    private String name;
    private int salary;
    
    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showEmployeeInfo() {
        System.out.println(name + ", " + salary);
    }
    
    
}
