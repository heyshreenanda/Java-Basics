
class Employee {
    String name;
    int empId;
    double salary;

    Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }
}

public class EmployeeData {
    public static void main(String[] args) {
        Employee emp[] = new Employee[3];

        emp[0] = new Employee("name1", 23111, 78000);
        emp[1] = new Employee("name2", 29112, 90000);
        emp[2] = new Employee("name3", 23141, 87000);

        Employee a1 = emp[0];

        for (int i = 0; i < 3; i++) {
            if (a1.salary < emp[i].salary) {
                a1 = emp[i];
            }
        }
        System.out.println("employee with highest salary: " + a1.name + "  salary: " + a1.salary);

    }
}
