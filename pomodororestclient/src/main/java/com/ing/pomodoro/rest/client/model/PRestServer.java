/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ing.pomodoro.rest.client.model;

/**
 * Describes the pomodoro rest api server information.
 *
 * @author amazingguni
 */

public final class PRestServer {
  /**
   * The hostname of pomodoro rest api server.
   */
  private String hostname;
  /**
   * The port of pomodoro rest api server.
   */
  private int port;

  /**
   * Constructor
   *
   * @param hostname hostname
   * @param port     port
   */
  public PRestServer(final String hostname, final int port) {
    this.hostname = hostname;
    this.port = port;
  }

  /**
   * Returns the hostname of pomodoro rest api server.
   * <pre>
   *   http://10.89.25.64
   *   http://www.outpomodoro.co.kr
   * </pre>
   *
   * @return hostname
   */
  public String getHostname() {
    return hostname;
  }

  /**
   * Sets the hostname of pomodoro rest api server.
   * <pre>
   *   http://10.89.25.64
   *   http://www.outpomodoro.co.kr
   * </pre>
   *
   * @param hostname new hostname
   */
  public void setHostname(final String hostname) {
    this.hostname = hostname;
  }

  /**
   * Returns the port number of pomodoro rest api server.
   * <pre>
   *   8080
   *   8090
   * </pre>
   *
   * @return port number
   */
  public int getPort() {
    return port;
  }

  /**
   * Sets the port number of pomodoro rest api server.
   * <pre>
   *   8080
   *   8090
   * </pre>
   *
   * @param port new port number
   */
  public void setPort(final int port) {
    this.port = port;
  }
}
