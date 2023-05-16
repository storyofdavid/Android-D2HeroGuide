package com.gamestudi.d2heroguide.NeutralsScreens;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gamestudi.d2heroguide.R;

import java.util.ArrayList;
import java.util.List;

public class NeutralsAncientCampActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    // Item List
    private List<Item> listItem = new ArrayList();

    // ImageList
    private int[] neutralImages = {R.drawable.neutrals_ancientcamp_dragon_camp, R.drawable.neutrals_ancientcamp_large_golem_camp, R.drawable.neutrals_ancientcamp_thunderhide_camp};

    //List of Titles
    private String[] neutralNames = {"Dragon Camp", "Large Golem Camp", "Thunderhide Camp"};

    // Custom Recycler View Adaptor
    private NeutralsCampSelectedRecyclerViewAdaptor adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neutrals_main_activity);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        for (int i = 0; i < 3; i++) {
            Item item = new Item();
            item.setImage(neutralImages[i]);
            item.setTitle(neutralNames[i]);
            listItem.add(item);
        }

        adapter = new NeutralsCampSelectedRecyclerViewAdaptor(listItem, this);
        recyclerView.setAdapter(adapter);
    }
}