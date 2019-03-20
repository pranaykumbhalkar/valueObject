package com.github.pranaykumbhalkar.valueobject;

import javax.persistence.Embeddable;

/**
 * Created by Pranay on 4/1/19
 */

@Embeddable
public class ItemCode extends BaseValueObject {

  private String itemCode;

  public ItemCode() {
  }

  public ItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  public String getItemCode() {
    return itemCode;
  }
}
