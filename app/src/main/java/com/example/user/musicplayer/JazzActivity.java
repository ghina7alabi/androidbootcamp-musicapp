package com.example.user.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 06-May-18.
 */

public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Music> songs = new ArrayList<Music>();


        songs.add(new Music("Dave Brubeck", "Take Five", R.drawable.music));
        songs.add(new Music("Miles Davis", "So What", R.drawable.music));
        songs.add(new Music("Miles Davis", "All Blues", R.drawable.music));
        songs.add(new Music("Weather Report", "Birdland", R.drawable.music));
        songs.add(new Music("Benny Goodman", "Sing, Sing, Sing", R.drawable.music));
        songs.add(new Music("Billie Holiday", "Strange Fruit", R.drawable.music));
        songs.add(new Music("John Coltrane", "Giant Steps", R.drawable.music));
        songs.add(new Music("Charles Mingus", "Goodbye Pork Pie Hat", R.drawable.music));
        songs.add(new Music("Miles Davis", "Blue in Green", R.drawable.music));
        songs.add(new Music("John Coltrane", "Naima", R.drawable.music));
        songs.add(new Music("John Coltrane", "Blue Train", R.drawable.music));
        songs.add(new Music("Ahmad Jamal", "Poinciana", R.drawable.music));
        songs.add(new Music("Duke Ellington", "Caravan", R.drawable.music));


        MusicAdapter adapter = new MusicAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
