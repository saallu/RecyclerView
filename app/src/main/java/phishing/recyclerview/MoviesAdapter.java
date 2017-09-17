package phishing.recyclerview;

import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    List<Movies> movielist;


    public MoviesAdapter(List<Movies> movielist){
        this.movielist = movielist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movies movie = movielist.get(position);
        holder.name.setText(movie.getTitle());
        holder.genere.setText(movie.getGenere());
        holder.year.setText(movie.getYear());

    }

    @Override
    public int getItemCount() {
        return movielist.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,year,genere;

        public MyViewHolder(View view) {
            super(view);
            name= (TextView) view.findViewById(R.id.title);
            year= (TextView) view.findViewById(R.id.year);
            genere= (TextView) view.findViewById(R.id.genre);
        }
    }

}