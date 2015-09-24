package com.example.shrutinallari.shruti;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by shrutinallari on 9/22/15.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.PersonViewHolder> {


    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        private TextView mpersonsName;
        private TextView mpersonsage;
        public ImageView mpersonsPhoto;

        public PersonViewHolder(View v) {
            super(v);
            mpersonsName = (TextView) v.findViewById(R.id.personname);
            mpersonsage = (TextView) v.findViewById(R.id.personage);
            mpersonsPhoto = (ImageView) v.findViewById(R.id.personphoto);
        }
    }

    List<Person> persons;

    public MyAdapter(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent,
                                               int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_cell, parent, false);
        PersonViewHolder vh = new PersonViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        holder.mpersonsName.setText(persons.get(position).name);
        holder.mpersonsage.setText(persons.get(position).age);
        holder.mpersonsPhoto.setImageResource(persons.get(position).photoId);


    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
