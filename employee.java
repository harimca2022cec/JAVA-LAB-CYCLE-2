import java.util.Scanner;
class Employee {
    private int enumber;
    private String ename;
    private double salary;
    
    public Employee(int enumber, String ename, double salary) {
        this.enumber = enumber;
        this.ename = ename;
        this.salary = salary;
    }
    
    public int getENumber() {
        return enumber;
    }
    
    public String getEName() {
        return ename;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(101, "hari", 50000.0);
        employees[1] = new Employee(102, "asik", 60000.0);
        employees[2] = new Employee(103, "diya", 70000.0);
        System.out.print("Enter employee number to search: ");
        int enumber = scanner.nextInt();
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getENumber() == enumber) {
                System.out.println("Employee found: " + employee.getEName() + ", Salary: " + employee.getSalary());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}

