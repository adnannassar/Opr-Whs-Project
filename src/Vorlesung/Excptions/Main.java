package Vorlesung.Excptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            myMethod();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void myMethod() throws MyException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nr1: ");
        int nr1 = scanner.nextInt();
        System.out.print("Nr2: ");
        int nr2 = scanner.nextInt();
        if (nr1 == 3 || nr2 == 3) {
            throw new MyException("I dont like the number 3!!!");
        } else {
            System.out.println("Result = " + (nr1 + nr2));
        }
    }
}
