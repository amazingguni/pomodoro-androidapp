/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ing.pomodoro.rest.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Describes the Pomodoro Task.
 *
 * @author amazingguni
 */

public final class PTask extends AbstractPomodoro implements Serializable {
  /**
   * The title.
   */
  private String title;
  /**
   * The description.
   */
  private String description;

  /**
   * The started datetime of task.
   */
  private String startedDateTime;
  /**
   * The finished datetime of task.
   */
  private String finishedDateTime;
  /**
   * The list of pomodoro tomato.
   */
  private List<PTomato> tomatoList = null;

  private TaskStatus status = TaskStatus.DONE;

  /**
   * Constructor.
   *
   * @param id               id
   * @param title            title
   * @param description      description
   * @param createdDateTime  created datetime
   * @param updatedDateTime  updated datetime
   * @param startedDateTime  started datetime
   * @param finishedDateTime finished datetime
   */
  @JsonCreator
  public PTask(@JsonProperty("id") final int id, @JsonProperty("title") final String title,
               @JsonProperty("description") final String description,
               @JsonProperty("createdDateTime") final String createdDateTime,
               @JsonProperty("updatedDateTime") final String updatedDateTime,
               @JsonProperty("startedDateTime") final String startedDateTime,
               @JsonProperty("finishedDateTime") final String finishedDateTime,
               @JsonProperty("status") final String status) {
    super(id, createdDateTime, updatedDateTime);
    this.title = title;
    this.description = description;
    this.startedDateTime = startedDateTime;
    this.finishedDateTime = finishedDateTime;
    this.status = TaskStatus.findByName(status);
  }


  /**
   * Returns the title.
   *
   * @return title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the title.
   *
   * @param title new title
   */
  public void setTitle(final String title) {
    this.title = title;
  }

  /**
   * Returns the description.
   *
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the description.
   *
   * @param description new description
   */
  public void setDescription(final String description) {
    this.description = description;
  }


  /**
   * Returns started datetime of the task.
   * <pre>
   *   It means when tomato job is started first time.
   * </pre>
   *
   * @return started datetime of the task
   */
  public String getStartedDateTime() {
    return startedDateTime;
  }

  /**
   * Sets started datetime of the task.
   * <pre>
   *   It means when tomato job is started first time.
   * </pre>
   *
   * @param startedDateTime new started datetime of the task
   */
  public void setStartedDateTime(final String startedDateTime) {
    this.startedDateTime = startedDateTime;
  }

  /**
   * Returns finished datetime of the task.
   * <pre>
   *   It means when user change task state to done.
   * </pre>
   *
   * @return finished datetime of the task.
   */
  public String getFinishedDateTime() {
    return finishedDateTime;
  }

  /**
   * Sets finished datetime of the task.
   * <pre>
   *   It means when user change task state to done.
   * </pre>
   *
   * @param finishedDateTime new finished datetime of the task.
   */
  public void setFinishedDateTime(final String finishedDateTime) {
    this.finishedDateTime = finishedDateTime;
  }

  /**
   * Returns the list of tomato in the task.
   *
   * @return the list of tomato
   */
  public List<PTomato> getTomatoList() {
    return tomatoList;
  }

  /**
   * Sets the list of tomato.
   *
   * @param tomatoList new list of tomato
   */
  public void setTomatoList(final List<PTomato> tomatoList) {
    this.tomatoList = tomatoList;
  }

  /**
   * Returns the status of task.
   *
   * @return status
   */
  public TaskStatus getStatus() {
    return status;
  }

  /**
   * Sets the status of task.
   *
   * @param status new status
   */
  public void setStatus(final TaskStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "PTask{"
        + "title='" + title + '\''
        + ", description='" + description + '\''
        + ", startedDateTime='" + startedDateTime + '\''
        + ", finishedDateTime='" + finishedDateTime + '\''
        + ", tomatoList=" + tomatoList
        + ", status=" + status
        + "} " + super.toString();
  }
}
