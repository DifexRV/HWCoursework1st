package Pro.sky;

import static Pro.sky.EmployeeServis.*;


public class Main {


    public static void main(String[] args) {

        basicDifficultyLevel();
        difficultDifficultyLevel();
    }

    public static void basicDifficultyLevel() {
        //Базовый уровень сложности.
        printEmployees();
        printSeparator();
        System.out.println("Общая сумма на выплату заработной платы составляет: " + calculateTotalSalary() + " рублей");
        printSeparator();
        System.out.println("Минимальная заработная плата у сотрудника " + calculateMinSalary());
        printSeparator();
        System.out.println("Максимальная заработная плата у сотрудника " + calculateMaxSalary());
        printSeparator();
        System.out.println("Средняя заработная плата по штатному расписанию составляет " + calculateAverageSalary());
        printSeparator();
        printFullName();
        printSeparator();
    }

    public static void difficultDifficultyLevel() {
        //Сложный уровень сложности.
        printSeparator();
        System.out.println("Сотрудника с минимальной зарплатой " + calculateMinSalaryDepartment(1) + " рублей");
        printSeparator();
        System.out.println("Сотрудника с минимальной зарплатой " + calculateMaxSalaryDepartment(2) + " рублей");
        printSeparator();
        System.out.println("Сумму затрат на зарплату по отделу " + calculateTotalSalaryDepartment(1) + " рублей");
        printSeparator();
        System.out.println("Среднюю зарплату по отделу " + calculateAverageSalaryDepartment(1) + " рублей");
        printSeparator();
        increaseSalaryDepartment(5,5);
        System.out.println("Проиндексировать зарплату всех сотрудников отдела " + calculateTotalSalaryDepartment(5) + " рублей");
        printSeparator();
        printEmployeeDepartment(1);
        printSeparator();
    }

}