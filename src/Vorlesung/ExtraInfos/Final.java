package Vorlesung.ExtraInfos;

public class Final {
    public static void main(String[] args) {
        final int x = 10;
        // x = 20; error because x is final
    }

    class A {
        final void print() {
            System.out.println("A");
        }
    }

    final class B extends A {

        //@Override
        //void print(){
        //System.out.println("B");
        //  }

        // error because print() in A i final!
    }

    // class C extends  B{ // Error because B is final!

   // }
}
