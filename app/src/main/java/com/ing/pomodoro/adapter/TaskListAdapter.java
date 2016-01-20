/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ing.pomodoro.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.ing.pomodoro.R;
import com.ing.pomodoro.rest.client.model.PTask;
import com.ing.pomodoro.rest.client.model.TaskStatus;

import java.util.List;

/**
 * Adapter class to make Task list item.
 *
 * @author amazingguni
 */

public final class TaskListAdapter extends ArrayAdapter<PTask> {
    /**
     * Context.
     */
    private final Context context;

    /**
     * Layout resource id.
     */
    private final int resource;
    /**
     * The list of PTask.
     */
    private final List<PTask> values;

    /**
     * Constructor.
     *
     * @param context  context
     * @param resource resource
     * @param values   values
     */
    public TaskListAdapter(final Context context, final int resource, final List<PTask> values) {
        super(context, resource, values);
        this.context = context;
        this.resource = resource;
        this.values = values;
    }

    @Override
    public View getView(final int position, final View convertView, final ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(resource, parent, false);
        TextView textViewTaskTitle = (TextView) rowView.findViewById(R.id.textview_tasktitle);
        CheckBox checkBoxTaskStatus = (CheckBox) rowView.findViewById(R.id.checkbox_taskstatus);
        checkBoxTaskStatus.setOnCheckedChangeListener(new onTaskStatusChangeListener());
        PTask task = values.get(position);
        textViewTaskTitle.setText(task.getTitle());
        TaskStatus taskStatus = task.getStatus();
        if (taskStatus == TaskStatus.TODO) {
            checkBoxTaskStatus.setChecked(false);
            //textViewTaskTitle.setPaintFlags(textViewTaskTitle.getPaintFlags() ^ Paint.STRIKE_THRU_TEXT_FLAG);
        } else if (taskStatus == TaskStatus.DONE) {
            checkBoxTaskStatus.setChecked(true);
            textViewTaskTitle.setPaintFlags(textViewTaskTitle.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        } else {
            textViewTaskTitle.setPaintFlags(textViewTaskTitle.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            checkBoxTaskStatus.setChecked(true);
        }
        return rowView;
    }

    private class onTaskStatusChangeListener implements CompoundButton.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        }
    }
}
