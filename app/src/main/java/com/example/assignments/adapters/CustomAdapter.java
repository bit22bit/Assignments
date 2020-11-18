package com.example.assignments.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project.R;
import com.example.project.models.User;

import java.util.ArrayList;

import javax.xml.xpath.XPathFunctionResolver;

public class CustomAdapter extends BaseAdapter {

    ArrayList<User> users;
    private Integer[] mImage = {R.drawable.im1, R.drawable.im2, R.drawable.im3, R.drawable.im4};
    public CustomAdapter(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public User getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if (view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_row_layout, null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) view.getTag();
        }

        User user = getItem(position);
        viewHolder.nameTv.setText(user.getName());
        viewHolder.ratingTv.setText(user.getRating());
        viewHolder.detailTv.setText(user.getDetail());
        viewHolder.imageTv.setImageResource(mImage[position]);

        return view;
    }

    class ViewHolder{
        TextView nameTv;
        TextView ratingTv;
        TextView detailTv;
        ImageView imageTv;

        public ViewHolder(View view){
            nameTv = view.findViewById(R.id.movieName);
            ratingTv = view.findViewById(R.id.movieRating);
            detailTv = view.findViewById(R.id.movieDesc);
            imageTv = view.findViewById(R.id.rowImage);
        }
    }
}
