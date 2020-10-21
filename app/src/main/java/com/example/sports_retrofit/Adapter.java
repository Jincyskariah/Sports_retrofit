package com.example.sports_retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sports_retrofit.Model.Sports_categ;

public class Adapter extends RecyclerView.Adapter<Adapter.My_vh>{
    Sports_categ sports_categ;
    Context context;
    public Adapter(Sports_categ sports_categ, Context context) {

        this.sports_categ = sports_categ;
        this.context = context;
    }


    @NonNull
    @Override
    public My_vh onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sports_list,viewGroup,false);

        return new My_vh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull My_vh holder, int position) {
        holder.name.setText(sports_categ.getLeagues().get(position).getStrSport());
        holder.league.setText(sports_categ.getLeagues().get(position).getStrLeague());
        holder.alt_league.setText(sports_categ.getLeagues().get(position).getStrLeagueAlternate());

    }

    @Override
    public int getItemCount() {
        return sports_categ.getLeagues().size();
    }

    class My_vh extends RecyclerView.ViewHolder{
        TextView name,league,alt_league;

        public My_vh(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.sports_name);
            league=itemView.findViewById(R.id.sports_league);
            alt_league=itemView.findViewById(R.id.sports_alt_lea);
        }
    }
}
