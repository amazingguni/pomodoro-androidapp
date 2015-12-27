/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ing.pomodoro.rest.client.model;


/**
 * Describes the status of tomato.
 *
 * @author amazingguni
 */

public enum TomatoStatus implements Identifier {

  /**
   * complete tomato.
   */
  COMPLETE(0, "COMPLETE"),
  /**
   * The incomplete tomato.
   */
  INCOMPLETE(1, "INCOMPLETE");


  /**
   * The tomato status id.
   */
  private final int id;
  /**
   * The tomato status name.
   */
  private final String name;

  /**
   * Constructor.
   *
   * @param id   id
   * @param name name
   */
  TomatoStatus(final int id, final String name) {
    this.id = id;
    this.name = name;
  }


  /**
   * Returns the tomato status matching with given id.
   *
   * @param id id to find
   * @return TomatoStstus
   */
  public static TomatoStatus findById(final int id) {
    if (id == COMPLETE.getId()) {
      return COMPLETE;
    } else if (id == INCOMPLETE.getId()) {
      return INCOMPLETE;
    } else {
      return INCOMPLETE;
    }
  }

  /**
   * Returns the tomato status matching with given id.
   *
   * @param name name to find
   * @return TomatoStstus
   */
  public static TomatoStatus findByName(final String name) {
    if (COMPLETE.getName().equals(name)) {
      return COMPLETE;
    } else if (INCOMPLETE.getName().equals(name)) {
      return INCOMPLETE;
    } else {
      return INCOMPLETE;
    }
  }

  @Override
  public int getId() {
    return id;
  }

  /**
   * Returns the name of tomato status.
   *
   * @return name
   */
  public String getName() {
    return name;
  }
}
