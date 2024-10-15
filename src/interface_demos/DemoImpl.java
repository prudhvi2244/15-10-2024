package interface_demos;

public abstract class DemoImpl implements I1 {

    @Override
    public void f1() {
        System.out.println("f1() method inside DemoImpl class");
    }

    @Override
    public void f2() {
        System.out.println("f2() method inside DemoImpl class");
    }

    @Override
    public void f3() {
        System.out.println("f3() method inside DemoImpl class");
    }
}
