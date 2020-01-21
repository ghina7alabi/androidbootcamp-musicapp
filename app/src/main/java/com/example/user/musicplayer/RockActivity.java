package com.example.user.musicplayer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 06-May-18.
 */

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Music> songs = new ArrayList<Music>();


        songs.add(new Music("Metallica", "One", R.drawable.music));
        songs.add(new Music("Iron Maiden", "Fear of the Dark", R.drawable.music));
        songs.add(new Music("Linkin Park", "In The End", R.drawable.music));
        songs.add(new Music("Seether", "Careless Whisper", R.drawable.music));
        songs.add(new Music("The Scorpions", "Wind of Change", R.drawable.music));
        songs.add(new Music("Duo", "Holy Diver", R.drawable.music));
        songs.add(new Music("Guns N' Roses", "Sweet Child O' Mine", R.drawable.music));
        songs.add(new Music("Aerosmith", "What It Takes", R.drawable.music));
        songs.add(new Music("Adele", "Rolling In The Deep", R.drawable.music));
        songs.add(new Music("Elvis", "It's Now or Never", R.drawable.music));
        songs.add(new Music("Skid Row", "I Remember You", R.drawable.music));
        songs.add(new Music("Heart", "Alone", R.drawable.music));
        songs.add(new Music("Led Zeppelin", "Tangerine", R.drawable.music));
        songs.add(new Music("Adam Lambert", "Whataya Want From Me", R.drawable.music));


        MusicAdapter adapter = new MusicAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
