package com.gamestudi.d2heroguide.NeutralsScreens;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gamestudi.d2heroguide.R;

import java.util.ArrayList;
import java.util.List;

public class NeutralsMediumCampActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    // Item List
    private List<Item> listItem = new ArrayList();

    // ImageList
    private int[] neutralImages = {R.drawable.neutrals_mediumcamp_centuar_camp, R.drawable.neutrals_mediumcamp_golem_camp, R.drawable.neutrals_mediumcamp_ogre_camp, R.drawable.neutrals_mediumcamp_satyr_camp, R.drawable.neutrals_mediumcamp_wolf_camp};

    //List of Titles
    private String[] neutralNames = {"Centaur Camp", "Golem Camp", "Ogre Camp", "Satyr Camp", "Wolf Camp"};

    // Custom Recycler View Adaptor
    private NeutralsCampSelectedRecyclerViewAdaptor adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neutrals_main_activity);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        for (int i = 0; i < 5; i++) {
            Item item = new Item();
            item.setImage(neutralImages[i]);
            item.setTitle(neutralNames[i]);
            listItem.add(item);
        }

        adapter = new NeutralsCampSelectedRecyclerViewAdaptor(listItem, this);
        recyclerView.setAdapter(adapter);
    }
}