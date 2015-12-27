/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ing.pomodoro.rest.client.model.wrapper;

/**
 * Describes the response code from pomodoro rest api server.
 *
 * @author amazignguni
 */
public enum ResponseCode {
  /**
   * Success code.
   */
  SUCCESS(200);
  /**
   * response code.
   */
  private final int fCode;

  /**
   * Constructor.
   *
   * @param code response code
   */
  ResponseCode(final int code) {
    this.fCode = code;
  }

  /**
   * Returns the response code.
   *
   * @return response code
   */
  public int getCode() {
    return fCode;
  }
}
