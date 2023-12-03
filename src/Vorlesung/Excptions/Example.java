package Vorlesung.Excptions;

public class Example {

    public void methode1(int nr1, int nr2) throws ArithmeticException, MyException {
        methode2(nr1, nr2);
    }

    private void methode2(int nr1, int nr2) throws ArithmeticException, MyException {
        methode3(nr1, nr2);
    }

    private void methode3(int nr1, int nr2) throws ArithmeticException, MyException {
        if (nr2 == 0) {
            throw new ArithmeticException("Divide by zero is not defined");
        }
        else if(nr2 == 3){
            throw new MyException("I dont like the number 3!!!");
        }
        else {
            System.out.println(nr1 / nr2);
        }

    }
}

