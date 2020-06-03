package compositepatternhomework;

public class CompositePatternHomeWork {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ulaş", 2500);
        Employee emp2 = new Employee("Berke", 3500);
        Employee emp3 = new Employee("Canberk", 4500);
        Employee emp4 = new Employee("Yusuf", 5500);
        Director dir1 = new Director();
        dir1.addEmployee(emp1);
        dir1.addEmployee(emp2);
        dir1.addEmployee(emp3);
        dir1.addEmployee(emp4);
        
        Employee emp5 = new Employee("Berkay", 3500);
        Employee emp6 = new Employee("Ali", 6500);
        Employee emp7 = new Employee("Barış", 12500);
        Director dir2 = new Director();
        dir2.addEmployee(emp5);        
        dir2.addEmployee(emp6);
        dir2.addEmployee(emp7);

        Director dir3 = new Director();
        dir3.addEmployee(dir1);
        dir3.addEmployee(dir2);
        dir3.showEmployeeInfo();
        
    }
    
}
