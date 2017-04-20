package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
  public static void main(String[] args) {
    GildedRose gildedRose = new GildedRose();
    gildedRose.updateQuality(gildedRose.makeItems());
  }

  public List<Item> makeItems() {
    List<Item> items = new ArrayList<Item>();
    items.add(new Item("+5 Dexterity Vest", 10, 20));
    items.add(new Item("Aged Brie", 2, 0));
    items.add(new Item("Elixir of the Mongoose", 5, 7));
    items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
    items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
    items.add(new Item("Conjured Mana Cake", 3, 6));
    return items;
  }

  public void updateQuality(List<Item> items) {
    for (int i = 0; i < items.size(); i++) {
      Item item = items.get(i);
      String itemName = item.getName();
      firstCheck(item);
      secondCheck(item);
      thirdCheck(item);
    }
  }

  private void firstCheck(Item item) {
    String itemName = item.getName();

    if (!agedBrie(item) && !backstagePasses(item) && qualityHigherThanZero(item)) {
      if (!aSulfuras(item)) {
        item.decreaseQualityByOne();
      }
    } else {
      item.increaseQualityByOne();

      if (backstagePasses(item)) {
        updateBackstagePassesQuality(item);
      }
    }
  }

  private void secondCheck(Item item) {
    String itemName = item.getName();

    if (!aSulfuras(item)) {
      item.decreaseDaysToSellByOne();
    }
  }

  private void thirdCheck(Item item) {
    String itemName = item.getName();

    if (afterSellDate(item)) {
      if (!agedBrie(item)) {
        if (!backstagePasses(item)) {
          if (!aSulfuras(item)) {
            item.decreaseQualityByOne();
          }
        } else {
          item.resetQuality();
        }
      } else {
        item.increaseQualityByOne();
      }
    }
  }

  private boolean agedBrie(Item item) {
    return "Aged Brie".equals(item.getName());
  }

  private boolean aSulfuras(Item item) {
    return "Sulfuras, Hand of Ragnaros".equals(item.getName());
  }

  private boolean backstagePasses(Item item) {
    return "Backstage passes to a TAFKAL80ETC concert".equals(item
      .getName());
  }

  private void updateBackstagePassesQuality(Item item) {
    if (item.getSellIn() < 11) {
      item.increaseQualityByOne();
    }

    if (item.getSellIn() < 6) {
      item.increaseQualityByOne();
    }
  }

  private boolean afterSellDate(Item item) {
    return item.getSellIn() < 0;
  }

  private boolean qualityHigherThanZero(Item item) {
    return item.getQuality() > 0;
  }
}
