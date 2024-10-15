package abstract_demos;

public abstract class Demo1 {

    int a=10;
    public Demo1(){
        System.out.println("abstract class Demo1 constructor");
    }
    // Concrete method
    public void f1(){
        System.out.println("f1() method inside abstract class Demo1");
    }

    // Abstract method
    public abstract void f2();
    public abstract void f3();



}
