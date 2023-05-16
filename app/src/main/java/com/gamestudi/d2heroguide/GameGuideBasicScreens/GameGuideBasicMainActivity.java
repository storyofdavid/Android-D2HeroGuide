package com.gamestudi.d2heroguide.GameGuideBasicScreens;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.gamestudi.d2heroguide.MainActivity;
import com.gamestudi.d2heroguide.R;

public class GameGuideBasicMainActivity extends AppCompatActivity {

    CardView cvLastHitting;
    CardView cvWarding;
    CardView cvHeroPositions;
    CardView cvObjectives;
    CardView cvLanes;
    CardView cvRunes;
    CardView cvRoshan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameguide_basic_main_activity);

        cvLastHitting = findViewById(R.id.cvLastHitting);
        cvWarding = findViewById(R.id.cvWarding);
        cvHeroPositions = findViewById(R.id.cvHeroPositions);
        cvObjectives = findViewById(R.id.cvObjectives);
        cvLanes = findViewById(R.id.cvLanes);
        cvRunes = findViewById(R.id.cvRunes);
        cvRoshan = findViewById(R.id.cvRoshan);

        handleOnClick();

    }

    private void handleOnClick(){

        cvLastHitting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(GameGuideBasicMainActivity.this, GameGuideBasicLastHittingActivity.class);
                GameGuideBasicMainActivity.this.startActivity(myIntent);
            }
        });

        cvWarding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(GameGuideBasicMainActivity.this, GameGuideBasicWardingActivity.class);
                GameGuideBasicMainActivity.this.startActivity(myIntent);
            }
        });

        cvHeroPositions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(GameGuideBasicMainActivity.this, GameGuideBasicHeroPositionsActivity.class);
                GameGuideBasicMainActivity.this.startActivity(myIntent);
            }
        });

        cvObjectives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(GameGuideBasicMainActivity.this, GameGuideBasicObjectivesActivity.class);
                GameGuideBasicMainActivity.this.startActivity(myIntent);
            }
        });

        cvLanes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(GameGuideBasicMainActivity.this, GameGuideBasicLanesActivity.class);
                GameGuideBasicMainActivity.this.startActivity(myIntent);
            }
        });

        cvRunes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(GameGuideBasicMainActivity.this, GameGuideBasicRunesActivity.class);
                GameGuideBasicMainActivity.this.startActivity(myIntent);
            }
        });

        cvRoshan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(GameGuideBasicMainActivity.this, GameGuideBasicRoshanActivity.class);
                GameGuideBasicMainActivity.this.startActivity(myIntent);
            }
        });
    }
}