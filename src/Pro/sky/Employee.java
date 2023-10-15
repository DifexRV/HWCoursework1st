package Pro.sky;


import java.util.Objects;

public class Employee {

    static int count = 0;
    private final int id;
    private final String fullName;
    private int department;
    private int salary;


    public Employee(int department, String fullName, int salary) {
        this.id = count++;
        this.department = department;
        this.fullName = fullName;
        this.salary = salary;

    }

    public int getDepartament() {
        return this.department;
    }

    public void setDepartament(int department) {
        if (department < 1 || department > 5) {
            System.out.println("Отдела с номером " + department + " не существует !");
            return;
        }
        this.department = department;
    }

    public static int getCount() {
        return count;
    }
    public String getFullName() {
        return this.fullName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID: " + id + "; Отдел: " + department + "; ФИО Сотрудника: " + fullName + "; Заработная плата: " + salary + ".";
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Employee employee = (Employee) other;
        return id == employee.id && department == employee.department && Objects.equals(fullName, employee.fullName) && salary == employee.salary;
    }

    public int hashCode() {
        return Objects.hash(id, department, fullName, salary);
    }

}
