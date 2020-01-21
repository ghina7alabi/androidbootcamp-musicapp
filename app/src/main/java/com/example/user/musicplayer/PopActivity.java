package com.example.user.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 06-May-18.
 */

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        ArrayList<Music> songs = new ArrayList<Music>();


        songs.add(new Music("Camila Cabello", "Never Be The Same", R.drawable.music));
        songs.add(new Music("Ed Sheeran", "Perfect", R.drawable.music));
        songs.add(new Music("Drake", "God's Plan", R.drawable.music));
        songs.add(new Music("Dua Lipa", "New Rules", R.drawable.music));
        songs.add(new Music("Maroon 5", "Wait", R.drawable.music));
        songs.add(new Music("Bazzi", "Mine", R.drawable.music));
        songs.add(new Music("Shawn Mendes", "In My Blood", R.drawable.music));
        songs.add(new Music("Lauv", "I Like Me Better", R.drawable.music));
        songs.add(new Music("Meghan Trainer", "No Excuses", R.drawable.music));
        songs.add(new Music("Demi Lovato", "Tell Me You Love Me", R.drawable.music));
        songs.add(new Music("Dua Lipa", "IDGAF", R.drawable.music));
        songs.add(new Music("Taylor Swift", "Delicate", R.drawable.music));
        songs.add(new Music("Calvin Harris & Dua Lipa", "One Kiss", R.drawable.music));
        songs.add(new Music("Zayn", "Let Me", R.drawable.music));


        MusicAdapter adapter = new MusicAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
