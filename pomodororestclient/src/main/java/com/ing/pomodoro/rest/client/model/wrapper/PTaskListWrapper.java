/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ing.pomodoro.rest.client.model.wrapper;/**
 * Created by YoungGun on 2015-11-10.
 */

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ing.pomodoro.rest.client.PRestException;
import com.ing.pomodoro.rest.client.model.PTask;

import java.io.File;
import java.util.List;

/**
 * Describes the wrapper class of the list of PTask for parsing json.
 *
 * @author amazingguni
 */

public final class PTaskListWrapper extends AbstractResponseWrapper {
  /**
   * The list of the pomodoro task.
   */
  private List<PTask> taskList;

  /**
   * Constructor.
   *
   * @param taskList the list of the pomodoro task
   */
  @JsonCreator
  public PTaskListWrapper(@JsonProperty("task_list") final List<PTask> taskList) {
    this.taskList = taskList;
  }

  /**
   * Converts raw string to response wrapper containing the list of pTask.
   *
   * @param jsonString json string
   * @return response wrapper
   * @throws PRestException throws if fail to parse json string.
   */
  public static PTaskListWrapper convert(final String jsonString) throws PRestException {
    return convert(jsonString, PTaskListWrapper.class);
  }

  /**
   * Converts json file to response wrapper containing the list of pTask.
   *
   * @param file json file
   * @return response wrapper
   * @throws PRestException throws if fail to parse json string.
   */
  public static PTaskListWrapper convert(final File file) throws PRestException {
    return convert(file, PTaskListWrapper.class);
  }

  /**
   * Returns the list of PTask.
   *
   * @return the list of PTask
   */
  public List<PTask> getTaskList() {
    return taskList;
  }

  @Override
  public String toString() {
    return "PTaskListWrapper{"
        + "taskList=" + taskList
        + "} " + super.toString();
  }
}
