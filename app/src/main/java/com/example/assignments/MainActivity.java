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
        users.add(new Movies("Supna", "Rating: 4/5", "Punjabi love story",""));
        users.add(new Movies("Rabb Da Radio","Rating: 4/5", "Punjabi love story",""));
        users.add(new Movies("Khaali Peeli","Rating: 4/5","Punjabi love story", ""));
        users.add(new Movies("Daaka","Rating: 4/5","Punjabi love story", ""));
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