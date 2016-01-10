package com.ing.pomodoro.authentication;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Manages pomodoro server authenticator.
 *
 * @author amazingguni
 */

public class PomodoroAuthenticator extends AbstractAccountAuthenticator {
  /** Context. */
  private Context mContext;
  public PomodoroAuthenticator(Context context) {
    super(context);
  }

  @Override
  public Bundle editProperties(AccountAuthenticatorResponse response, String accountType) {
    return null;
  }

  @Override
  public Bundle addAccount(final AccountAuthenticatorResponse response, final String accountType,
                           final String authTokenType, final String[] requiredFeatures,
                           final Bundle options) throws NetworkErrorException {
    Intent intent = new Intent(mContext, PomodoroAuthenticator.class);
    /** FIXME need to put extras later */
    final Bundle bundle = new Bundle();
    bundle.putParcelable("intent", intent);
    return bundle;
  }

  @Override
  public Bundle confirmCredentials(AccountAuthenticatorResponse response, Account account, Bundle options) throws NetworkErrorException {
    return null;
  }

  @Override
  public Bundle getAuthToken(AccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options) throws NetworkErrorException {
    return null;
  }

  @Override
  public String getAuthTokenLabel(String authTokenType) {
    return null;
  }

  @Override
  public Bundle updateCredentials(AccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options) throws NetworkErrorException {
    return null;
  }

  @Override
  public Bundle hasFeatures(AccountAuthenticatorResponse response, Account account, String[] features) throws NetworkErrorException {
    return null;
  }
}
