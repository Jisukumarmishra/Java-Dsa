public class Main {
  public static void main(String[] args) {
    
  }

  // This is not dependent on objects 
  static void fun () {
    
  // gretting(); // you cant use this because it reqquire an instance 
  // but the function  you are using it in doen not depend on instances
  
  // you cant acces non static stufff without refrencing their Instances in a static context
  
  // hence, here i am refrencing it
  Main obj = new Main();
  obj.greeting();

  }

  void fun2 () {
    greeting(); // you can use this because it is non static and you are in a non static function
  }
  
  // we know that something which is npot static , belongs to an object and we need to create an instance of that class to use it
  void greeting () {
    fun(); // i can use this because it is static and i am in a non static function, but the opposite is not true
    System.out.println("Hello World");
  }


}
