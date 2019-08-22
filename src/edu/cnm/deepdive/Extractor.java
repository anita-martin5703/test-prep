package edu.cnm.deepdive;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Extractor {

  public static void main(String[] args) {
    String source = (args.length > 0) ? args[0] : "Hello, World!";
    Set<Character> chars = new TreeSet<>((c1, c2) ->
        Comparator.comparingInt((Character c) -> Character.toUpperCase(c)).compare(c1, c2));
    for (char c : source.toCharArray()) {
      chars.add(c);
    }
    System.out.println(chars);
  }
}

