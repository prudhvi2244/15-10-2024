package abstract_demos;

public  class Demo2 extends Demo1 {

    Demo2(){
        System.out.println("Demo2 constructor");
    }
    @Override
    public void f2() {
        System.out.println("f2() method implemented inside class Demo2");
    }

    @Override
    public void f3() {
        System.out.println("f3() method implemented inside class Demo2");
    }

    public static void main(String[] args) {
       Demo1 demo1 = new Demo2();
       demo1.f2();
       demo1.f1();
       System.out.println(demo1.a);
       demo1.f3();
    }

}
