/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ing.pomodoro.rest.client;

/**
 * Exception to handle error using pomodoro rest api client.
 *
 * @author amazingguni
 */

public class PRestException extends RuntimeException {
  /**
   * Constructor.
   */
  public PRestException() {
    super();
  }

  /**
   * Constructor.
   *
   * @param message message
   */
  public PRestException(String message) {
    super(message);
  }

  /**
   * Constructor.
   *
   * @param message message
   * @param cause   cause
   */
  public PRestException(String message, Throwable cause) {
    super(message, cause);
  }
}
