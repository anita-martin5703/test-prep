package edu.cnm.deepdive;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Extractor {

  public static void main(String[] args) {
    Comparator<Character> comparator = (Character c1, Character c2) ->
        Character.compare(Character.toUpperCase(c1), Character.toUpperCase(c2));
    String source = (args.length > 0) ? args[0] : "Hello, World!";
    Set<Character> chars = new TreeSet<>(comparator);
    for (char c : source.toCharArray()) {
      chars.add(c);
    }
    System.out.println(chars);
  }
}

