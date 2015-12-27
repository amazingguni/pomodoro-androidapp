/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ing.pomodoro.rest.client.model;

/**
 * Abstract class of pomodoro response data.
 *
 * @author amazingguni
 */

public class AbstractPomodoro implements Identifier {
  /**
   * The id.
   */
  protected int id;

  /**
   * The created date time.
   */
  protected String createdDateTime;

  /**
   * The last modified date time.
   */
  protected String updatedDateTime;


  /**
   * Constructor.
   *
   * @param id              id
   * @param createdDateTime created datetime
   * @param updatedDateTime updated datetime
   */
  public AbstractPomodoro(final int id, final String createdDateTime,
                          final String updatedDateTime) {
    this.id = id;
    this.createdDateTime = createdDateTime;
    this.updatedDateTime = updatedDateTime;
  }


  /**
   * Returns the id.
   *
   * @return id
   */
  @Override
  public int getId() {
    return id;
  }

  /**
   * Returns the created datetime.
   *
   * @return craeted datetime
   */
  public String getCreatedDatetime() {
    return createdDateTime;
  }

  /**
   * Returns the updated datetime.
   *
   * @return updated datetime
   */
  public String getUpdatedDateTime() {
    return updatedDateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    AbstractPomodoro that = (AbstractPomodoro) o;

    return id == that.id;

  }

  @Override
  public int hashCode() {
    return id;
  }

  @Override
  public String toString() {
    return "AbstractPomodoro{" +
        "id=" + id +
        ", createdDateTime='" + createdDateTime + '\'' +
        ", updatedDateTime='" + updatedDateTime + '\'' +
        '}';
  }
}
