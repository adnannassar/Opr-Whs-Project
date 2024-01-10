package Vorlesung.JUnit;

public class Calculator {
    int[] array = new int[5];

    public void insertValueInIndexOfArray(int value, int index) {
        if (index >= 0 && index < array.length - 1) {
            array[index] = value;
        }
        else{
            array[0] = -1;
        }
    }

    public int add(int a, int b) {
        return a + b;
    }
}
