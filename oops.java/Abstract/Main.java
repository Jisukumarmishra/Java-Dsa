package Abstract;

public class Main {
  public static void main(String[] args) {
  Son son = new Son();
  son.career(null);
  son.normal();

  Parent daughter = new Daughter(28);
  daughter.career();

  Parent.hello();
  // Parent mom = new Parent(45);
  }
}
