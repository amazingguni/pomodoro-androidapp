/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ing.pomodoro.rest.client.model;

/**
 * Describes the tomato period setting.
 *
 * @author amazingguni
 */
public interface IPeriod {
  /**
   * The default work period value.
   */
  public static int DEFAULT_WORK_PERIOD = 25;
  /**
   * The default rest period value.
   */
  public static int DEFAULT_REST_PERIOD = 5;

  /**
   * Returns the work period of tomato.
   *
   * @return work period(min)
   */
  int getWorkPeriod();

  /**
   * Sets the work period of tomato.
   *
   * @param workPeriod new work period(min)
   */
  void setWorkPeriod(int workPeriod);

  /**
   * Returns the rest period of tomato.
   *
   * @return rest period(min)
   */

  int getRestPeriod();

  /**
   * Sets the rest period of tomato.
   *
   * @param restPeriod new rest period(min)
   */
  void setRestPeriod(int restPeriod);
}
