package com.example.user.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 06-May-18.
 */

public class MetalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Music> songs = new ArrayList<Music>();


        songs.add(new Music("Metallica", "Master of Puppets", R.drawable.music));
        songs.add(new Music("Sabbath", "Paranoid", R.drawable.music));
        songs.add(new Music("Black Sabbath", "Heaven and Hell", R.drawable.music));
        songs.add(new Music("Seether", "Careless Whisper", R.drawable.music));
        songs.add(new Music("Mercyful Fate", "Melissa", R.drawable.music));
        songs.add(new Music("Megadeth", "Rust in Peace", R.drawable.music));
        songs.add(new Music("Symphony X", "The Divine Wings of Tragedy", R.drawable.music));
        songs.add(new Music("Opeth", "Blackwater Park", R.drawable.music));
        songs.add(new Music("Death", "Symbolic", R.drawable.music));
        songs.add(new Music("Possessed", "Seven Churches", R.drawable.music));
        songs.add(new Music("Iron Maiden", "Killers", R.drawable.music));
        songs.add(new Music("Darkthrone", "Transilvanian Hunger", R.drawable.music));
        songs.add(new Music("Black Sabbath", "Master of Reality", R.drawable.music));
        songs.add(new Music("Queensrÿche", "Operation: Mindcrime", R.drawable.music));


        MusicAdapter adapter = new MusicAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
