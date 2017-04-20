package org.joyofcoding.objectcalisthenics;

/**
 * Created by Nikky on 20-4-2017.
 */
public class Quality {
  private int quality;

  public Quality(int quality) {
    this.quality = quality;
  }

  public void decreaseQualityByOne() {
      if (quality > 0) {
        quality -= 1;
      }
  }

  public void increaseQualityByOne() {
      if (quality < 50) {
        quality += 1;
      }
  }

  public int getQuality() {
    return quality;
  }

  public void resetQuality() {
    quality = 0;
  }

}
