/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ing.pomodoro.rest.client.model.wrapper.test;

import com.ing.pomodoro.rest.client.model.PTask;
import com.ing.pomodoro.rest.client.model.wrapper.PTaskListWrapper;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Test class of PTask.
 *
 * @author amazingguni
 */

public final class PTaskListWrapperTest {
  @Test
  public void convertTestSuccess1() {
    assertTrue(new File("resources/PTask.json").exists());
    PTaskListWrapper taskListWrapper = PTaskListWrapper.convert(new File("resources/PTask.json"));
    assertNotNull(taskListWrapper);
    System.out.println(taskListWrapper);
  }
}
