package com.example.user.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 06-May-18.
 */

public class MusicAdapter extends ArrayAdapter<Music> {

    public MusicAdapter(Activity context, ArrayList<Music> music) {
        super(context, 0, music);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Music currentSong = getItem(position);

        TextView titleTextView = listItemView.findViewById(R.id.music_title);
        titleTextView.setText(currentSong.getMusicTitle());


        TextView authorTextView = listItemView.findViewById(R.id.music_author);
        authorTextView.setText(currentSong.getAuthor());


        ImageView iconView = (ImageView) listItemView.findViewById(R.id.music_image);
        iconView.setImageResource(currentSong.getImage());

        return listItemView;
    }
}
