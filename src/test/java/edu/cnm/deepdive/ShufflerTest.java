package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import org.junit.jupiter.api.Test;

class ShufflerTest {

  @Test
  void shuffle() {
    int[] input = generate(1_000_000);
    int[] testCopy = input.clone();
    Shuffler shuffler = new Shuffler(new Random());
    shuffler.shuffle(input);
    assertFalse(Arrays.equals(input, testCopy));
    Set<Integer> original = buildSet(testCopy);
    Set<Integer> shuffled = buildSet(input);
    assertEquals(original, shuffled);
  }

  private Set<Integer> buildSet(int[] source) {
    Set<Integer> target = new HashSet<>();
    for (int value : source) {
      target.add(value);
    }
    return target;
  }

  private int[] generate(int size) {
    int[] content = new int[size];
    for (int i = 0; i < content.length; i++) {
      content[i] = i;
    }
    return content;
  }

}