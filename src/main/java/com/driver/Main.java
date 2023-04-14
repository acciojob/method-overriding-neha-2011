package com.driver;

public class Main {
    public  void main(String[] args) {
        A objA = new A();
        System.out.println(objA.meth()); // prints "Invoking method from class A"

        B objB = new B();
        System.out.println(objB.meth()); // prints "Method is overridden in Extended class B"
    }
class A{
    public String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

}