package Vorlesung.Lampdas.EmployeeManagmentSystem;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Verwaltung verwaltung = new Verwaltung();
        verwaltung.add(new Employee("Esraa", "Alawad", 20));
        verwaltung.add(new Employee("Mariam", "Alaoirafli", 15));
        verwaltung.add(new Employee("Nesriin", "Basha", 30));
        verwaltung.add(new Employee("Adnan", "Nassar", 35));


        System.out.println("Before Sort!");
        verwaltung.printAllEmployees();

        System.out.println();
        verwaltung.sortByNachname();

        System.out.println("After Sort!");
        verwaltung.printAllEmployees();
        System.out.println();
        verwaltung.printAllEmployeesStartWithLetter(employee -> employee.getNachname().startsWith("B"));
    }
}
