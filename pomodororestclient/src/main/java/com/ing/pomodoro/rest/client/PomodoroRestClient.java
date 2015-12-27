/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ing.pomodoro.rest.client;

import com.ing.pomodoro.rest.client.model.PRestServer;
import com.ing.pomodoro.rest.client.model.PUserAccount;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * The pomodoro client to communicate with server. This class return instance to use rest api
 * easily.
 *
 * @author amazingguni
 */
public class PomodoroRestClient {
  /**
   * instance.
   */
  private static PomodoroRestClient Instance = new PomodoroRestClient();

  /**
   * The httpClient that is connected with pomodoro rest server. If this value is null, getInstance
   * method doesn't return instance to use pomodoro rest server.
   */
  private static HttpClient client = null;

  private PomodoroRestClient() {
    // no instance.
  }

  /**
   * Returns the instance of pomodoro rest api client.
   *
   * @return PomodoroRestClient
   * @throws PRestException if rest api is not connected.
   */
  public static PomodoroRestClient getInstance() throws PRestException {
    if (client == null)
      throw new PRestException("Rest api is not connected.");
    return Instance;
  }

  /**
   * Logins to rest server and returns rest api client instance.
   *
   * @param server  pomodoro rest api server
   * @param account user account.
   * @return PomodoroRestClient
   */
  public static PomodoroRestClient login(final PRestServer server, final PUserAccount account) {
    client = null;
    HttpClient newClient = HttpClientBuilder.create().build();
    /**
     *  TODO need to implement login process. if login is failed, need to throw exception.
     */
    client = newClient;
    return Instance;
  }
}
