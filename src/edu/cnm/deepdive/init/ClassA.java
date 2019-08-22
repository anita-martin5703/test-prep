package edu.cnm.deepdive.init;

public class ClassA {

  static {
    System.out.println("ClassA::static1");
  }

  private static int data = getValue();

  private static int getValue() {
    System.out.println("ClassA::getValue");
    return 10;
  }

  static {
    System.out.println("ClassA::static2");
  }

}
