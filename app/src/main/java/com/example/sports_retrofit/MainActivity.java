package com.example.sports_retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sports_retrofit.Model.Sports_categ;
import com.example.sports_retrofit.Retrofit.Retro_config;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Sports_categ sports_categ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.r_view);
    Retro_config retro_config=new Retro_config();
        retro_config.getApis().categ_call().enqueue(new Callback<Sports_categ>() {
            @Override
            public void onResponse(Call<Sports_categ> call, Response<Sports_categ> response) {
                sports_categ=response.body();

                LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(new Adapter(sports_categ,MainActivity.this));
            }

            @Override
            public void onFailure(Call<Sports_categ> call, Throwable t) {

            }
        });

    }
}
