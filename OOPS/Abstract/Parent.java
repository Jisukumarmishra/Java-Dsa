package Abstract;

public abstract class Parent {
  abstract void career (String name);
  abstract void partner(String name, int age);
   int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 32456789;
    }

    static void hello(){
        System.out.println("hey");
    }

    void normal() {
        System.out.println("this is a normal method");
    }

    abstract void career();
    abstract void partner();
}
