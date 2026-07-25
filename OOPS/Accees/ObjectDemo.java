public class ObjectDemo {

  int num;
  public ObjectDemo(int num) {
    this.num = num;
  }

  @Override 
  public int hashCode() { // hashcode = unique representations of a object via number
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override 
  public String toString() { // to string give the string representation
    return super.toString();
  }

  @Override
  protected void finalize() throws Throwable { // finilazied get calles when garbage collections heat 
    super.finalize();
  }

  public static void main(String[] args) {
    ObjectDemo obj = new ObjectDemo(34);
    ObjectDemo obj2 = new ObjectDemo(34);
    System.out.println(obj.hashCode());
    System.out.println(obj2.hashCode());
  }
  
}
