package Pro.sky;


import static Pro.sky.EmployeeBook.employees;

public class EmployeeServis {

    public static void printSeparator() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }


    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static float calculateAverageSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        float averageSalary = sum / (float) employees.length;
        return averageSalary;
    }

    public static Employee calculateMinSalary() {
        Employee result = employees[0];
        if (employees[0] == null) {
            throw new RuntimeException("Позиция не заполнена");
        }
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee calculateMaxSalary() {
        Employee result = employees[0];
        if (employees[0] == null) {
            throw new RuntimeException("Позиция не заполнена");
        }
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static void increaseSalary(int percent) {
        for (Employee employee : employees) {
            int currentSalary = employee.getSalary();
            employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
        }
    }


    public static int calculateTotalSalaryDepartment(int departmentNumber) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartament() == departmentNumber) {
                sum += employee.getSalary();
            }
        }
        return sum;

    }

    public static float calculateAverageSalaryDepartment(int department) {
        int employeesCount = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartament() == department) {
                sum += employee.getSalary();
                employeesCount++;
            }
        }
        return sum / (float) employeesCount;
    }

    public static Employee calculateMinSalaryDepartment(int department) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = employees[0];
        if (employees[0] == null) {
            throw new RuntimeException("Позиция не заполнена");
        }
        for (Employee employee : employees) {
            if (employee.getDepartament() != department) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee calculateMaxSalaryDepartment(int department) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = employees[0];
        if (employees[0] == null) {
            throw new RuntimeException("Позиция не заполнена");
        }
        for (Employee employee : employees) {
            if (employee.getDepartament() != department) {
                continue;
            }
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static void printDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartament() == department) {
                System.out.println(employee.getId() + ". " + employee.getFullName() + ". " + employee.getSalary());
            }
        }
    }

    public static void increaseSalaryDepartment(int department, int percent) {
        for (Employee employee : employees) {
            if (employee.getDepartament() == department) {
                int currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
            }
        }
    }

    public static void printEmployeeDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartament() == department) {
                System.out.println("ID: " + employee.getId() + ". ФИО Сотрудника: " + employee.getFullName() + "Зарплата: " + employee.getSalary());
            }
        }
    }

    public static void printSalaryBelowLevel(int Salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < Salary) {
                System.out.println("ID: " + employee.getId() + ". ФИО Сотрудника: " + employee.getFullName() + "Зарплата: " + employee.getSalary());
            }
        }
    }

    public static void printSalaryAboveLevel(int Salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() > Salary) {
                System.out.println("ID: " + employee.getId() + ". ФИО Сотрудника: " + employee.getFullName() + "Зарплата: " + employee.getSalary());
            }
        }
    }
}