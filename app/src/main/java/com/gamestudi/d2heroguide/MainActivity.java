package com.gamestudi.d2heroguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.codemybrainsout.ratingdialog.RatingDialog;
import com.gamestudi.d2heroguide.GameGuideBasicScreens.GameGuideBasicMainActivity;
import com.gamestudi.d2heroguide.HeroScreens.AgilityHeroesFragment;
import com.gamestudi.d2heroguide.HeroScreens.IntelligenceHeroesFragment;
import com.gamestudi.d2heroguide.HeroScreens.StrengthHeroesFragment;
import com.gamestudi.d2heroguide.ItemScreens.BasicItemsFragment;
import com.gamestudi.d2heroguide.ItemScreens.SecretItemsFragment;
import com.gamestudi.d2heroguide.ItemScreens.UpgradedItemsFragment;
import com.gamestudi.d2heroguide.NeutralsItemScreens.NeutralsItemMainActivity;
import com.gamestudi.d2heroguide.NeutralsScreens.NeutralsMainActivity;
import com.gigamole.navigationtabstrip.NavigationTabStrip;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

import static com.gamestudi.d2heroguide.BuildConfig.debug;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, ViewPager.OnPageChangeListener {

    MyPageAdapter pageAdapter;
    private ViewPager mViewPager;
    private NavigationTabStrip mCenterNavigationTabStrip;
    private com.google.android.gms.ads.InterstitialAd InterstitialAd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  MobileAds.initialize(this);


        //If this is a debug build then load test interstitial ads
        if (debug) {
            InterstitialAd = new InterstitialAd(this);
            InterstitialAd.setAdUnitId(getResources().getString(R.string.test_interstitial_ad_unit_id));
            InterstitialAd.loadAd(new AdRequest.Builder().build());
        }

        //If this is not a debug build then load real ads
        if (!debug){
            InterstitialAd = new InterstitialAd(this);
            InterstitialAd.setAdUnitId(getResources().getString(R.string.d2heroguide_interstitial_ad_unit_id));
            InterstitialAd.loadAd(new AdRequest.Builder().build());
        }


        //App rating dialogue will appear after opening the app after 4 times.
        //Have configured it so that 4-5 stars will go to play store, anything else will load a feedback form which will get emailed.
        //More info --> https://github.com/codemybrainsout/smart-app-rate
        final RatingDialog ratingDialog = new RatingDialog.Builder(this)
                .threshold(4)
                .session(4)
                .title("How are we doing? Help us out by leaving a review.")
                .formTitle("Submit Feedback")
                .formHint("How can we improve?")
                .ratingBarColor(R.color.colorYellow)
                .onRatingBarFormSumbit(new RatingDialog.Builder.RatingDialogFormListener() {
                    @Override
                    public void onFormSubmitted(String feedback) {
                        //Opens up an email client and populates it with the feedback they provided earlier
                        Intent i = new Intent(Intent.ACTION_SEND);
                        i.setType("message/rfc822");
                        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"YOUR_EMAIL_HERE"});
                        i.putExtra(Intent.EXTRA_SUBJECT, "Dota 2 Hero Guide - User Feedback");
                        i.putExtra(Intent.EXTRA_TEXT   , feedback);
                        try {
                            startActivity(Intent.createChooser(i, "Send mail..."));
                        } catch (android.content.ActivityNotFoundException ex) {
                            Toast.makeText(MainActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                        }
                    }
                }).build();

        ratingDialog.show();

        //Sets up the hero selection screen
        setupHeroScreen();

    }



    //Closes the navigation drawer if the back button is pressed
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    //Is used with the navigation drawer DO something if item is clicked
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_heroes) {

            //If interstitialAd is loaded then show the ad
            if (InterstitialAd.isLoaded()) {
                InterstitialAd.show();
            }
            //If the user clicks on items in the navigation drawer then do the following
            //Hides the item screen and shows the hero screen
            setupHeroScreen();


        } else if (id == R.id.nav_gameguide_basic) {

            //If interstitialAd is loaded then show the ad
            if (InterstitialAd.isLoaded()) {
                InterstitialAd.show();
            }
            //If the user clicks on neutrals in the navigation drawer then do the following
            //Starts the Neutrals Main Activity
            Intent myIntent = new Intent(MainActivity.this, GameGuideBasicMainActivity.class);
            MainActivity.this.startActivity(myIntent);

        } else if (id == R.id.nav_items) {

            //If interstitialAd is loaded then show the ad
            if (InterstitialAd.isLoaded()) {
                InterstitialAd.show();
            }
            //If the user clicks on items in the navigation drawer then do the following
            //Hides the hero screen and shows the item screen
            setupItemScreen();

        } else if (id == R.id.nav_neutral_items) {

            //If interstitialAd is loaded then show the ad
            if (InterstitialAd.isLoaded()) {
                InterstitialAd.show();
            }
            //If the user clicks on neutral items in the navigation drawer then do the following
            //Hides the hero screen and shows the neutral item screen
            //Starts the Neutral Items Main Activity
            Intent myIntent = new Intent(MainActivity.this, NeutralsItemMainActivity.class);
            MainActivity.this.startActivity(myIntent);

        } else if (id == R.id.nav_neutrals) {

            //If interstitialAd is loaded then show the ad
            if (InterstitialAd.isLoaded()) {
                InterstitialAd.show();
            }
            //If the user clicks on neutrals in the navigation drawer then do the following
            //Starts the Neutrals Main Activity
            Intent myIntent = new Intent(MainActivity.this, NeutralsMainActivity.class);
            MainActivity.this.startActivity(myIntent);

        } else if (id == R.id.nav_manage) {
        } else if (id == R.id.nav_contact) {

            //If they select contact - then open up email client so they can email us
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("message/rfc822");
            i.putExtra(Intent.EXTRA_EMAIL, new String[]{"YOUR_EMAIL_HERE"});
            i.putExtra(Intent.EXTRA_SUBJECT, "Dota 2 Hero Guide - Contact Us");
            try {
                startActivity(Intent.createChooser(i, "Send mail..."));
            } catch (android.content.ActivityNotFoundException ex) {
                 Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
            }
        } else if (id == R.id.nav_credits) {

            //If interstitialAd is loaded then show the ad
            if (InterstitialAd.isLoaded()) {
                InterstitialAd.show();
            }
            Intent main = new Intent(this, CreditsScreen.class);
            startActivity(main);
        } else if (id == R.id.nav_gameplay_updates) {

            //If interstitialAd is loaded then show the ad
            if (InterstitialAd.isLoaded()) {
                InterstitialAd.show();
            }
            Intent main = new Intent(this, GameplayUpdatesScreen.class);
            startActivity(main);
        } else if (id == R.id.nav_privacy_policy) {

            //If interstitialAd is loaded then show the ad
            if (InterstitialAd.isLoaded()) {
                InterstitialAd.show();
            }
            Intent main = new Intent(this, PrivacyPolicyScreen.class);
            startActivity(main);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    @Override
    public void onPageScrollStateChanged(int arg0) {
    }

    // Manages the Page changes, synchronizing it with Tabs
    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {
        int pos = this.mViewPager.getCurrentItem();
        //Is used to switch when the user swipes between pages
        mCenterNavigationTabStrip.setViewPager(mViewPager, pos);

    }

    @Override
    public void onPageSelected(int arg0) {
    }



public void setupHeroScreen(){
    //Show the heroes screen
    LinearLayout hero_screen = (LinearLayout) findViewById(R.id.main_include_heroes);
    hero_screen.setVisibility(View.VISIBLE);

    //Hide the items screen
    LinearLayout item_screen = (LinearLayout) findViewById(R.id.main_include_items);
    item_screen.setVisibility(View.GONE);

    //Sets up the toolbar (The three lines that open up the navigation drawer)
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_heroes);
    setSupportActionBar(toolbar);

    //Sets up our custom navigation strip
    mCenterNavigationTabStrip = (NavigationTabStrip) findViewById(R.id.nts_center_heroes);
    mViewPager = (ViewPager) findViewById(R.id.viewpager_heroes);

    //Fragments and ViewPager Initialization
    List<Fragment> heroFragments = getHeroFragments();
    pageAdapter = new MyPageAdapter(getSupportFragmentManager(), heroFragments);
    mViewPager.setAdapter(pageAdapter);
    mViewPager.addOnPageChangeListener(MainActivity.this);

    //Sets the default tab strip to the first value which is strength.
    //In other words sets the default tabstrip to Strength heroes
    mCenterNavigationTabStrip.setViewPager(mViewPager, 0);



    //Navigation drawer stuff
    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    drawer.addDrawerListener(toggle);
    toggle.syncState();

    NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
    navigationView.setNavigationItemSelectedListener(this);
}

public void setupItemScreen(){
    //Hide the heroes screen
    LinearLayout hero_screen = (LinearLayout) findViewById(R.id.main_include_heroes);
    hero_screen.setVisibility(View.GONE);

    //Show the items screen
    LinearLayout item_screen = (LinearLayout) findViewById(R.id.main_include_items);
    item_screen.setVisibility(View.VISIBLE);

    //Sets up the toolbar (The three lines that open up the navigation drawer)
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_items);
    setSupportActionBar(toolbar);

    //Sets up our custom navigation strip
    mCenterNavigationTabStrip = (NavigationTabStrip) findViewById(R.id.nts_center_items);
    mViewPager = (ViewPager) findViewById(R.id.viewpager_items);

    //Fragments and ViewPager Initialization
    List<Fragment> itemFragments = getItemFragments();
    pageAdapter = new MyPageAdapter(getSupportFragmentManager(), itemFragments);
    mViewPager.setAdapter(pageAdapter);
    mViewPager.addOnPageChangeListener(MainActivity.this);

    //Sets the default tab strip to the first value which is basic.
    //In other words sets the default tabstrip to basic items.
    mCenterNavigationTabStrip.setViewPager(mViewPager, 0);

    //Navigation drawer stuff
    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    drawer.addDrawerListener(toggle);
    toggle.syncState();

    NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
    navigationView.setNavigationItemSelectedListener(this);
}



    //Generates the fragments which will be used for Strength, Agility, & Intelligence heroes
    private List<Fragment> getHeroFragments() {
        List<Fragment> fList = new ArrayList<Fragment>();

        // TODO Put here your Fragments
        StrengthHeroesFragment f1 = StrengthHeroesFragment.newInstance();
        AgilityHeroesFragment f2 = AgilityHeroesFragment.newInstance();
        IntelligenceHeroesFragment f3 = IntelligenceHeroesFragment.newInstance();
        fList.add(f1);
        fList.add(f2);
        fList.add(f3);

        return fList;
    }


    //Generates the fragments which will be used for Items
    private List<Fragment> getItemFragments() {
        List<Fragment> fList = new ArrayList<Fragment>();

        // TODO Put here your Fragments
        BasicItemsFragment f1 = BasicItemsFragment.newInstance();
        UpgradedItemsFragment f2 = UpgradedItemsFragment.newInstance();
        SecretItemsFragment f3 = SecretItemsFragment.newInstance();
        fList.add(f1);
        fList.add(f2);
        fList.add(f3);

        return fList;
    }


}
