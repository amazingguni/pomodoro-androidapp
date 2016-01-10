package com.ing.pomodoro.authentication;

import android.util.Log;

/**
 * @author amazingguni
 */

public class PRestServerAuthenticate implements ServerAuthenticate {
  private final String TAG = PRestServerAuthenticate.class.getSimpleName();

  @Override
  public String userSignUp(String name, String email, String pass, String authType) throws Exception {
    Log.d(TAG, "userSignUp");
    return null;
  }

  @Override
  public String userSignIn(String user, String pass, String authType) throws Exception {
    Log.d(TAG, "userSignIn");
    return null;
  }
}
