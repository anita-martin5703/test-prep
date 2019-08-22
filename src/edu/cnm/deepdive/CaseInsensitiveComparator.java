package edu.cnm.deepdive;

import java.util.Comparator;

public class CaseInsensitiveComparator implements Comparator<Character> {


  @Override
  public int compare(Character c1, Character c2) {
    return Character.compare(Character.toUpperCase(c1), Character.toUpperCase(c2));
  }
}
