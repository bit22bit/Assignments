package com.example.assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.assignments.adapters.CustomAdapter;
import com.example.assignments.models.Movies;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Movies> movies;

    public ArrayList<Movies> generateMovies() {
        ArrayList<Movies> users = new ArrayList<>();
        users.add(new Movies("Sufna", "Rating: 4/5", "A love story of punjabi villager with an orphan girl.",""));
        users.add(new Movies("Chal Mera Putt","Rating: 5/5", "Struggle of an illegal resident in London",""));
        users.add(new Movies("Love Punjab","Rating: 4/5","Representing Punjab by a kid living in Canada", ""));
        users.add(new Movies("Sanju","Rating: 4/5","Biopic of Sanjay Dutt, an actor from the Bollywood", ""));
        users.add(new Movies("Dil Bechara","Rating: 4/5","Falling in love while having a terminal illness", ""));
        users.add(new Movies("Love Aaj Kal 2","Rating: 4/5","Separation story of two married people", ""));
        users.add(new Movies("Dangal","Rating: 4/5","decides to fulfil his dream of winning a gold medal by a girl", ""));

        return users;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.userListView);
        movies = generateMovies();
        CustomAdapter adapter = new CustomAdapter(movies);
        listView.setAdapter(adapter);
    }


}