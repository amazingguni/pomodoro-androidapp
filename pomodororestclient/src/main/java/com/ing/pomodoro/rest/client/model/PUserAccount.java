/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ing.pomodoro.rest.client.model;

/**
 * Describes the pomodoro user account.
 *
 * @author amazingguni
 */

public class PUserAccount extends AbstractPomodoro {
  /**
   * The email address.
   */
  private String email;
  /**
   * The password of user account.
   */
  private String password;


  /**
   * Constructor.
   *
   * @param id              id
   * @param createdDateTime createdDateTime
   * @param updatedDateTime updatedDateTime
   * @param email           email
   * @param password        password
   */
  public PUserAccount(final int id, final String createdDateTime, final String updatedDateTime,
                      final String email, final String password) {
    super(id, createdDateTime, updatedDateTime);
    this.email = email;
    this.password = password;
  }

  /**
   * Returns the email address of user.
   *
   * @return email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Sets the email address of user.
   *
   * @param email new email
   */
  public void setEmail(final String email) {
    this.email = email;
  }

  /**
   * Returns the password of user.
   *
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Sets the password of user.
   *
   * @param password new password
   */
  public void setPassword(String password) {
    this.password = password;
  }
}
