package Vorlesung.Lampdas.EmployeeManagmentSystem;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Verwaltung {

   private LinkedList<Employee> employees;

    public Verwaltung() {
        this.employees =new LinkedList<>();
    }

    public void add(Employee employee){
        this.employees.add(employee);
    }

    // 1. sort by nachname
    public void sortByNachname(){
        Collections.sort(employees, (o1, o2) -> o1.getNachname().compareTo(o2.getNachname()));
    }


    // 2. print all employees
    public void printAllEmployees(){
        employees.forEach(e-> System.out.println(e));
    }


    // 3. print all employees where nachname start with letter example ('A')
    public void printAllEmployeesStartWithLetter(Predicate<Employee> predicate ){
        for(Employee e: employees){
            if(predicate.test(e)){
                System.out.println(e);
            }
        }
    }
}
