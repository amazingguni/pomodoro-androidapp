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
 * Describes the Pomodoro Category.
 *
 * @author amazingguni
 */
@Deprecated
public final class PCategory extends AbstractPomodoro {
  /**
   * The list of pomodoro task.
   */
  private List<PTask> taskList = null;

  /**
   * Constructor.
   *
   * @param id              id
   * @param createdDateTime created datetime
   * @param updatedDateTime updated datetime
   * @param taskList        list of the task
   */
  public PCategory(final int id, final String createdDateTime, final String updatedDateTime,
                   final List<PTask> taskList) {
    super(id, createdDateTime, updatedDateTime);
    this.taskList = taskList;
  }

  /**
   * Returns the list of pomodoro task in category.
   *
   * @return list of task
   */
  public List<PTask> getTaskList() {
    return taskList;
  }

  /**
   * Sets the list of pomodoro task in category.
   *
   * @param taskList new list of pomodoro task
   */
  public void setTaskList(List<PTask> taskList) {
    this.taskList = taskList;
  }
}
