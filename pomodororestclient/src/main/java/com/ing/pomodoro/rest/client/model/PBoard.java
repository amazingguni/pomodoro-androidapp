/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ing.pomodoro.rest.client.model;


import com.ing.pomodoro.rest.client.PRestException;

import java.io.File;
import java.util.List;

/**
 * Describes the Pomodoro Board.
 *
 * @author amazingguni
 */
@Deprecated
public final class PBoard extends AbstractPomodoro implements IPeriod {
  /**
   * The list of pomodoro category.
   */
  private List<PCategory> categoryList = null;

  /**
   * The work period of tomato(min).
   * <pre>
   *   default : 25mins
   * </pre>
   */
  private int workPeriod = IPeriod.DEFAULT_WORK_PERIOD;
  /**
   * The rest period of tomato(min).
   * <pre>
   *   default : 5mins
   * </pre>
   */
  private int restPeriod = IPeriod.DEFAULT_REST_PERIOD;

  /**
   * Constructor.
   *
   * @param id              id
   * @param createdDateTime created datetime
   * @param updatedDateTime updated datetime
   * @param categoryList    the list of pomodoro category
   */
  public PBoard(final int id, final String createdDateTime, final String updatedDateTime,
                final List<PCategory> categoryList) {
    super(id, createdDateTime, updatedDateTime);
    this.categoryList = categoryList;
  }


  /**
   * Returns the list of pomodoro category.
   *
   * @return list of pomodoro category
   */
  public List<PCategory> getCategoryList() {
    return categoryList;
  }

  /**
   * Sets the list of pomodoro category.
   *
   * @param categoryList list of pomodoro category
   */
  public void setCategoryList(final List<PCategory> categoryList) {
    this.categoryList = categoryList;
  }

  @Override
  public int getWorkPeriod() {
    return workPeriod;
  }

  @Override
  public void setWorkPeriod(final int workPeriod) {
    this.workPeriod = workPeriod;
  }

  @Override
  public int getRestPeriod() {
    return restPeriod;
  }

  @Override
  public void setRestPeriod(final int restPeriod) {
    this.restPeriod = restPeriod;
  }


}
