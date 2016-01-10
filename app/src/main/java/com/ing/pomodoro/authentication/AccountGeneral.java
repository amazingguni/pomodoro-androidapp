package com.ing.pomodoro.authentication;

/**
 * Contains the constant values about pomodoro account.
 *
 * @author amazingguni
 */

public class AccountGeneral {
  /**
   * Account type id.
   */
  public static final String ACCOUNT_TYPE = "com.ing.pomodoro.authentication";
  /**
   * Account name.
   */
  public static final String ACCOUNT_NAME = "Pomodoro";

  /**
   * Auth token types
   */
  public static final String AUTHTOKEN_TYPE_READ_ONLY = "Read only";
  public static final String AUTHTOKEN_TYPE_READ_ONLY_LABEL = "Read only access to an Pomodoro account";

  public static final String AUTHTOKEN_TYPE_FULL_ACCESS = "Full access";
  public static final String AUTHTOKEN_TYPE_FULL_ACCESS_LABEL = "Full access to an Pomodoro account";

  public static final ServerAuthenticate sServerAuthenticate = new PRestServerAuthenticate();
}
