package com.cropin.services.valueobject;

import javax.persistence.Embeddable;

/**
 * Created by Pranay on 27/12/18
 */

@Embeddable
public class LoginName {

  private String loginName;

  public LoginName() {
  }

  public LoginName(String loginName) {
    this.loginName = loginName;
  }

  public String getLoginName() {
    return loginName;
  }
}
