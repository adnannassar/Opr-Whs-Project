public class Main {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.m(5));
    }
    public static class A {
        public String m(int a) {
            return "A m(" + a + ")";
        }
    }
    public static class B extends A {
        @Override
        public String m(int a) {
            return super.m(10) + ", B m(" + a + ")";
        }
    }
}
