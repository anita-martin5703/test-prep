package edu.cnm.deepdive;

import java.util.Set;
import java.util.TreeSet;

public class Extractor {

  public static void main(String[] args) {
    String source = (args.length > 0) ? args[0] : "Hello, World!";
    Set<Character> chars = new TreeSet<>(new CaseInsensitiveComparator());
    for (char c : source.toCharArray()) {
      chars.add(c);
    }
    System.out.println(chars);
  }

}

