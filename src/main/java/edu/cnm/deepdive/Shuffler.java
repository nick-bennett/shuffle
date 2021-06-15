package edu.cnm.deepdive;

import java.util.Random;

/**
 * Implements <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates</a>
 * shuffle for arrays of all primitive data types, as well as of {@link Object}. Shuffling is done
 * in-place&mdash;that is, the methods don't return copies of the original arrays, but instead
 * modify the contents of those arrays directly.
 */
public class Shuffler {

  private final Random rng;

  /**
   * Initializes this instance, using the provided source of randomness.
   *
   * @param rng Source of randomness.
   */
  public Shuffler(Random rng) {
    this.rng = rng;
  }

  public void shuffle(int[] data) {
    for (int targetIndex = data.length - 1; targetIndex > 0; targetIndex--) {
      int sourceIndex = rng.nextInt(targetIndex + 1);
      int temp = data[targetIndex];
      data[targetIndex] = data[sourceIndex];
      data[sourceIndex] = temp;
    }
  }

  public void shuffle(byte[] data) {
    for (int targetIndex = data.length - 1; targetIndex > 0; targetIndex--) {
      int sourceIndex = rng.nextInt(targetIndex + 1);
      byte temp = data[targetIndex];
      data[targetIndex] = data[sourceIndex];
      data[sourceIndex] = temp;
    }
  }

  public void shuffle(Object[] data) {
    for (int targetIndex = data.length - 1; targetIndex > 0; targetIndex--) {
      int sourceIndex = rng.nextInt(targetIndex + 1);
      Object temp = data[targetIndex];
      data[targetIndex] = data[sourceIndex];
      data[sourceIndex] = temp;
    }
  }

}
