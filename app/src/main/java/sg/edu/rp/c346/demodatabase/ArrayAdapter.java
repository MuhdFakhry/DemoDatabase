package sg.edu.rp.c346.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ArrayAdapter extends android.widget.ArrayAdapter {

    ArrayList<Task> taskList;
    Context context;

    public ArrayAdapter(Context context, int resource, ArrayList<Task> objects) {
        super(context, resource, objects);

        taskList = objects;
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);
        TextView id = rowView.findViewById(R.id.tvID);
        TextView description = rowView.findViewById(R.id.tvDesc);
        TextView date = rowView.findViewById(R.id.tvDate);
        Task tasks = taskList.get(position);
        id.setText(String.valueOf(tasks.getId()));
        description.setText(tasks.getDescription());
        date.setText(tasks.getDate());
        return rowView;

    }
}