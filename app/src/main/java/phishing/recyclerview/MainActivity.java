package phishing.recyclerview;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MoviesAdapter moviesAdapter;
    List<Movies> moviesList=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.rec);

        moviesAdapter=new MoviesAdapter(moviesList);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(moviesAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        
        items();



    }

    private void items() {

        Movies movie=new Movies("salman","sa","aksja");
        moviesList.add(movie);

        movie = new Movies("Inside Out", "Animation, Kids & Family", "2015");
        moviesList.add(movie);

        movie = new Movies("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        moviesList.add(movie);

        movie = new Movies("Shaun the Sheep", "Animation", "2015");
        moviesList.add(movie);

        movie = new Movies("The Martian", "Science Fiction & Fantasy", "2015");
        moviesList.add(movie);

        movie = new Movies("Krish","ajaira Movie","1889");
        moviesList.add(movie);
    }
}
