package org.joyofcoding.objectcalisthenics;

public class Item {
    private String name;
    private SellIn sellIn;
    private Quality quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = new Quality(quality);
        this.sellIn = new SellIn(sellIn);
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn.getSellIn();
    }

    public void decreaseDaysToSellByOne() {
      sellIn.decreaseDaysToSellByOne();
    }

    public int getQuality() {
        return quality.getQuality();
    }

    public void increaseQualityByOne() {
      quality.increaseQualityByOne();
    }

    public void decreaseQualityByOne() {
      quality.decreaseQualityByOne();
    }

    public void resetQuality() {
      quality.resetQuality();
  }
}
