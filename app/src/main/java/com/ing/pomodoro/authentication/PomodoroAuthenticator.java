package com.ing.pomodoro.authentication;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/**
 * Manages pomodoro server authenticator.
 *
 * @author amazingguni
 */

public class PomodoroAuthenticator extends AbstractAccountAuthenticator {
  private final String TAG = PomodoroAuthenticator.class.getSimpleName();

  /**
   * Context.
   */
  private final Context mContext;


  public PomodoroAuthenticator(Context context) {
    super(context);
    mContext = context;
  }

  @Override
  public Bundle editProperties(AccountAuthenticatorResponse response, String accountType) {
    return null;
  }

  @Override
  public Bundle addAccount(final AccountAuthenticatorResponse response, final String accountType,
                           final String authTokenType, final String[] requiredFeatures,
                           final Bundle options) throws NetworkErrorException {
    Log.d(TAG, "addAccount");
    Intent intent = new Intent(mContext, PomodoroAuthenticator.class);
    intent.putExtra(AuthenticatorActivity.ARG_ACCOUNT_TYPE, accountType);
    intent.putExtra(AuthenticatorActivity.ARG_AUTH_TYPE, authTokenType);
    intent.putExtra(AuthenticatorActivity.ARG_IS_ADDING_NEW_ACCOUNT, true);
    intent.putExtra(AccountManager.KEY_ACCOUNT_AUTHENTICATOR_RESPONSE, response);

    final Bundle bundle = new Bundle();
    bundle.putParcelable(AccountManager.KEY_INTENT, intent);
    return bundle;
  }

  @Override
  public Bundle confirmCredentials(AccountAuthenticatorResponse response, Account account, Bundle options) throws NetworkErrorException {
    return null;
  }

  @Override
  public Bundle getAuthToken(AccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options) throws NetworkErrorException {
    Log.d(TAG, "getAuthToken");
    // Extract the username and password from the Account Manager, and ask the server for an appropriate AuthToken.
    final AccountManager am = AccountManager.get(mContext);
    String authToken = am.peekAuthToken(account, authTokenType);

    // if token is empty, try to authenticate the user.
    if (TextUtils.isEmpty(authToken)) {
      final String password = am.getPassword(account);
      if (password != null) {
        // authToken = sServerAuthenticate.
      }
    }

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
