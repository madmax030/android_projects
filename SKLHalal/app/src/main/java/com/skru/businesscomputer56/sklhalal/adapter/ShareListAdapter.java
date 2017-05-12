package com.skru.businesscomputer56.sklhalal.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.skru.businesscomputer56.sklhalal.R;

/**
 * Created by MUHAMMAD on 9/4/2560.
 */

public class ShareListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] shitemname;
    private final Integer[] shimgid;

    public ShareListAdapter(Activity context, String[] itemname, Integer[] imgid) {
        super(context, R.layout.sharelist, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.shitemname=itemname;
        this.shimgid=imgid;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.sharelist, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        txtTitle.setText(shitemname[position]);
        imageView.setImageResource(shimgid[position]);
        extratxt.setText("แชร์แอพพลิเคชั่นนี้ได้เลย "+shitemname[position]);
        return rowView;

    }
}