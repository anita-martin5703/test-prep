package edu.cnm.deepdive;

public class ClassD extends ClassC {

  public ClassD() {
    System.out.println("ClassD::new");
  }

  @Override
  public void doSomething() {
    System.out.println("ClassD::doSomething");
  }

  public static void doSomethingElse() {
    System.out.println("ClassD::doSomethingElse");
  }

  public boolean isAvailable() {
    return true;
  }
}
