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
import java.io.Serializable;

/**
 * Desribes the pomodoro tomato.
 *
 * @author amazingguni
 */

public class PTomato extends AbstractPomodoro implements IPeriod, Serializable {

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
   * The started datetime of tomato.
   */
  private String startedDatatime;
  /**
   * The finished datetime of tomato.
   */
  private String finishedDatetime;

  /**
   * The status of tomato.
   */
  private TomatoStatus status;

  /**
   * Constructor.
   *
   * @param id               id
   * @param createdDateTime  createdDateTime
   * @param updatedDateTime  updatedDateTime
   * @param startedDatatime  startedDatetime
   * @param finishedDatetime finishedDatetime
   * @param status           status of tomoto
   */
  public PTomato(final int id, final String createdDateTime, final String updatedDateTime,
                 final String startedDatatime, final String finishedDatetime,
                 final TomatoStatus status) {
    super(id, createdDateTime, updatedDateTime);
    this.startedDatatime = startedDatatime;
    this.finishedDatetime = finishedDatetime;
    this.status = status;
  }



  /**
   * Returns the started datetime of tomato.
   *
   * @return the started datetime
   */
  public String getStartedDatatime() {
    return startedDatatime;
  }

  /**
   * Sets the started datetime of tomato.
   *
   * @param startedDatatime new started datetime
   */
  public void setStartedDatatime(final String startedDatatime) {
    this.startedDatatime = startedDatatime;
  }

  /**
   * Returns the finished datetime of tomato.
   *
   * @return finished datetime
   */
  public String getFinishedDatetime() {
    return finishedDatetime;
  }

  /**
   * Sets the finished datetime of tomato.
   *
   * @param finishedDatetime new finished datetime.
   */
  public void setFinishedDatetime(final String finishedDatetime) {
    this.finishedDatetime = finishedDatetime;
  }

  /**
   * Returns the status of tomoto.
   *
   * @return status
   */
  public TomatoStatus getStatus() {
    return status;
  }

  /**
   * Sets the status of tomato.
   *
   * @param status new status
   */
  public void setStatus(final TomatoStatus status) {
    this.status = status;
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
