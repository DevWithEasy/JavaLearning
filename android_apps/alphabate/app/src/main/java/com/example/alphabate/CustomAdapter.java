package com.example.alphabate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private String [] capital_alphabets,small_alphabets,english_words;
    private int [] images;
    private LayoutInflater inflater;
    Context context;

    CustomAdapter(Context context,int[] images, String[] capital_alphabets, String[] small_alphabets, String[] english_words){
        this.context = context;
        this.images = images;
        this.capital_alphabets = capital_alphabets;
        this.small_alphabets = small_alphabets;
        this.english_words = english_words;
    }

    @Override
    public int getCount() {
        return capital_alphabets.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item, parent, false);

            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.item_image_id);
            holder.letterView = convertView.findViewById(R.id.item_letter_id);
            holder.wordView = convertView.findViewById(R.id.item_word_id);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.imageView.setImageResource(images[position]);
        holder.letterView.setText(capital_alphabets[position] + " " + small_alphabets[position]);
        holder.wordView.setText(english_words[position]);

        return convertView;
    }

    static class ViewHolder {
        ImageView imageView;
        TextView letterView;
        TextView wordView;
    }

}
