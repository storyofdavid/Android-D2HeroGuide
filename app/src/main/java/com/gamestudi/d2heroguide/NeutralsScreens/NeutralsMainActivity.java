package com.gamestudi.d2heroguide.NeutralsScreens;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gamestudi.d2heroguide.R;

import java.util.ArrayList;
import java.util.List;

public class NeutralsMainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    // Item List
    private List<Item> listItem = new ArrayList();

    // ImageList
    private int[] neutralImages = {R.drawable.neutrals_smallcamp_ghost_camp, R.drawable.neutrals_mediumcamp_golem_camp, R.drawable.neutrals_largecamp_centaur_camp, R.drawable.neutrals_ancientcamp_dragon_camp, R.drawable.neutrals_roshan};

    //List of Titles
    private String[] neutralNames = {"Small Camps", "Medium Camps", "Large Camps", "Ancient Camps", "Roshan"};

    // Custom Recycler View Adaptor
    private RecyclerViewAdaptor adapter;


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

        adapter = new RecyclerViewAdaptor(listItem, this);
        recyclerView.setAdapter(adapter);
    }
}
