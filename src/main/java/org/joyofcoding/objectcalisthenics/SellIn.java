package org.joyofcoding.objectcalisthenics;

/**
 * Created by Nikky on 20-4-2017.
 */
public class SellIn {
  private int SellIn;

  public SellIn(int SellIn) {
    this.SellIn = SellIn;
  }

  public void decreaseDaysToSellByOne() {
      SellIn -= 1;
  }

  public void increaseDaysToSellByOne() {
    SellIn += 1;
  }

  public int getSellIn() {
    return SellIn;
  }
}
