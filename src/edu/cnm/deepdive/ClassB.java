package edu.cnm.deepdive;

public class ClassB extends ClassA {

  private static String stringData = getStringData();

  static {
    System.out.println("ClassB::static");
  }

  private static String getStringData() {
    System.out.println("ClassB::getStringData");
    return "some stuff";
  }

  public static void main(String[] args) {
    System.out.println("ClassB::main");
    ClassC c1 = new ClassC();
    ClassC c2 = new ClassD();
    ClassD d1 = new ClassD();
    ClassD d2;
    c1.setInstanceData(10);
    c1 = d1;
    ((ClassD) c2).isAvailable();
    d1.setInstanceData(20);
    System.out.println(c1.getInstanceData());
  }


}
