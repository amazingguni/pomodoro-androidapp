/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ing.pomodoro.rest.client.model;

/**
 * Describes the status of task.
 *
 * @author amazingguni
 */

public enum TaskStatus implements Identifier {
  /**
   * The task to do.
   */
  TODO(0, "TODO"),
  /**
   * The done task.
   */
  DONE(1, "DONE");

  /**
   * The task status id.
   */
  private final int id;
  /**
   * The task status name.
   */
  private final String name;

  /**
   * Constructor.
   *
   * @param id   id
   * @param name name
   */
  TaskStatus(final int id, final String name) {
    this.id = id;
    this.name = name;
  }

  /**
   * Returns the task status matching with given id.
   *
   * @param id id to find
   * @return TaskStstus
   */
  public static TaskStatus findById(final int id) {
    if (id == DONE.getId()) {
      return DONE;
    } else if (id == TODO.getId()) {
      return TODO;
    } else {
      return TODO;
    }
  }

  /**
   * Returns the task status matching with given id.
   *
   * @param name name to find
   * @return TaskStstus
   */
  public static TaskStatus findByName(final String name) {
    if (DONE.getName().equals(name)) {
      return DONE;
    } else if (TODO.getName().equals(name)) {
      return TODO;
    } else {
      return TODO;
    }
  }

  @Override
  public int getId() {
    return id;
  }

  /**
   * Returns the status name.
   *
   * @return status name
   */
  public String getName() {
    return name;
  }
}
