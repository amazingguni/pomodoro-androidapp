/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ing.pomodoro.rest.client.model.wrapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ing.pomodoro.rest.client.PRestException;

import java.io.File;
import java.io.IOException;

/**
 * Describes abstract class to parse json from pomodoro restapi server.
 * @author amazingguni
 */

public class AbstractResponseWrapper {
  /**
   * Response code from pomodoro rest api server.
   */
  private int responseCode;


  /**
   * Converts raw string to pomodoro instance given as parameter.
   *
   * @param jsonString json string
   * @param cls        target class
   * @param <T>        class to convert
   * @return converted instance.
   * @throws PRestException throws if fail to parse json string.
   */
  public static <T> T convert(final String jsonString, final Class<T> cls) throws PRestException {
    ObjectMapper mapper = new ObjectMapper();
    T parsedObj = null;
    try {
      parsedObj = mapper.readValue(jsonString, cls);
    } catch (IOException e) {
      throw new PRestException(e.getMessage(), e);
    }
    return parsedObj;
  }

  /**
   * Converts raw string to pomodoro instance given as parameter.
   *
   * @param file json file
   * @param cls  target class
   * @param <T>  class to convert
   * @return converted instance.
   * @throws PRestException throws if fail to parse json string.
   */
  public static <T> T convert(final File file, final Class<T> cls) throws PRestException {
    ObjectMapper mapper = new ObjectMapper();
    T parsedObj = null;
    try {
      parsedObj = mapper.readValue(file, cls);
    } catch (IOException e) {
      throw new PRestException(e.getMessage(), e);
    }
    return parsedObj;
  }
}
