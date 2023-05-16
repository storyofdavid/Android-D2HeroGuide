package com.gamestudi.d2heroguide.GameGuideBasicScreens;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.gamestudi.d2heroguide.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class GameGuideBasicRoshanActivity extends AppCompatActivity {

    //Is used for the adview
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameguide_basic_roshan);

        //Loads the ad as soon as the activity is created
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}