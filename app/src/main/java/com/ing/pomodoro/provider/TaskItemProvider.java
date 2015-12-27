/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ing.pomodoro.provider;

import com.ing.pomodoro.rest.client.model.PTask;
import com.ing.pomodoro.rest.client.model.TaskStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Provider class for providing task content for user interfaces.
 * @author amazingguni
 */
public class TaskItemProvider {

  private static final int COUNT = 25;
  /**
   * An array of pomodoro task items.
   */
  public static List<PTask> ITEMS = new ArrayList<PTask>();
  /**
   * A map of task items, by ID.
   */
  public static Map<Integer, PTask> ITEM_MAP = new HashMap<Integer, PTask>();

  static {
    // Add some sample items.
    for (int i = 1; i <= COUNT; i++) {
      addItem(createDummyItem(i));
    }
  }

  /**
   * Adds the PTask item.
   *
   * @param item item
   */
  private static void addItem(final PTask item) {
    ITEMS.add(item);
    ITEM_MAP.put(item.getId(), item);
  }

  /**
   * Creates dummy task item.
   * @param position position
   * @return dummy task item.
   */
  private static PTask createDummyItem(final int position) {
    Random random = new Random();

    TaskStatus status = TaskStatus.findById(random.nextInt(2));
    String title = String.format("[%s] Title %d", status.getName(), position);
    String description = String.format("[%s] Description %d", status.getName(), position);
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    calendar.add(Calendar.DATE, -position);
    String createdDateTime = format.format(calendar.getTime());
    calendar.add(Calendar.HOUR, position);
    calendar.add(Calendar.MINUTE, position);
    String startedDateTime = null;
    String updatedDateTime = createdDateTime;
    String finishedDateTime = null;
    if (status == TaskStatus.DONE) {
      startedDateTime = format.format(calendar.getTime());
      calendar.add(Calendar.MINUTE, 30);
      finishedDateTime = format.format(calendar.getTime());
      updatedDateTime = finishedDateTime;
    }
    return new PTask(position, title, description, createdDateTime, updatedDateTime, startedDateTime, finishedDateTime, status.getName());
  }

  /**
   * Returns the string to describe task matching with given position.
   * @param position
   * @return
   */
  private static String makeDetails(int position) {
    return ITEMS.get(position).toString();
  }

}