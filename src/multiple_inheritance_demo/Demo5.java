package multiple_inheritance_demo;

public class Demo5 implements I3,I4{


    public static void main(String[] args) {
    }


    @Override
    public void f2() {
        System.out.println("f2() method");
    }

    @Override
    public void f1() {
        System.out.println("f1() method");
    }
}
