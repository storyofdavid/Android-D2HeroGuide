package com.gamestudi.d2heroguide.HeroScreens;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.gamestudi.d2heroguide.ItemScreens.ItemScreenFragment;
import com.gamestudi.d2heroguide.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class HeroItemsFragment extends Fragment {

    private static View mView;

    public static final HeroItemsFragment newInstance() {
        HeroItemsFragment f = new HeroItemsFragment();

        Bundle b = new Bundle();

        f.setArguments(b);

        return f;

    }

    //Is used for the adview
    private AdView mAdView;



    //Imageviews used to display the items for the heroes
    ImageView startingItems1;
    ImageView startingItems2;
    ImageView startingItems3;
    ImageView startingItems4;
    ImageView startingItems5;
    ImageView startingItems6;
    ImageView startingItems7;
    ImageView startingItems8;

    ImageView earlyGame1;
    ImageView earlyGame2;
    ImageView earlyGame3;
    ImageView earlyGame4;

    ImageView midGame1;
    ImageView midGame2;
    ImageView midGame3;
    ImageView midGame4;

    ImageView lateGame1;
    ImageView lateGame2;
    ImageView lateGame3;
    ImageView lateGame4;

    ImageView popularItems1;
    ImageView popularItems2;
    ImageView popularItems3;
    ImageView popularItems4;
    ImageView popularItems5;
    ImageView popularItems6;
    ImageView popularItems7;
    ImageView popularItems8;
    ImageView popularItems9;
    ImageView popularItems10;
    ImageView popularItems11;
    ImageView popularItems12;


//All of the string resources used to see which item screen to correctly load when an item is clicked
    String startingItems1OnClick;
    String startingItems2OnClick;
    String startingItems3OnClick;
    String startingItems4OnClick;
    String startingItems5OnClick;
    String startingItems6OnClick;
    String startingItems7OnClick;
    String startingItems8OnClick;

    String earlyGame1OnClick;
    String earlyGame2OnClick;
    String earlyGame3OnClick;
    String earlyGame4OnClick;


    String midGame1OnClick;
    String midGame2OnClick;
    String midGame3OnClick;
    String midGame4OnClick;

    String lateGame1OnClick;
    String lateGame2OnClick;
    String lateGame3OnClick;
    String lateGame4OnClick;

    String popularItems1OnClick;
    String popularItems2OnClick;
    String popularItems3OnClick;
    String popularItems4OnClick;
    String popularItems5OnClick;
    String popularItems6OnClick;
    String popularItems7OnClick;
    String popularItems8OnClick;
    String popularItems9OnClick;
    String popularItems10OnClick;
    String popularItems11OnClick;
    String popularItems12OnClick;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mView = inflater.inflate(R.layout.hero_screen_fragment_2,
                container, false);


        //Loads the ad as soon as the activity is created
        mAdView = (AdView) mView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        startingItems1 = (ImageView) mView.findViewById(R.id.startingItems1);
        startingItems2 = (ImageView) mView.findViewById(R.id.startingItems2);
        startingItems3 = (ImageView) mView.findViewById(R.id.startingItems3);
        startingItems4 = (ImageView) mView.findViewById(R.id.startingItems4);
        startingItems5 = (ImageView) mView.findViewById(R.id.startingItems5);
        startingItems6 = (ImageView) mView.findViewById(R.id.startingItems6);
        startingItems7 = (ImageView) mView.findViewById(R.id.startingItems7);
        startingItems8 = (ImageView) mView.findViewById(R.id.startingItems8);

        earlyGame1 = (ImageView) mView.findViewById(R.id.earlyGame1);
        earlyGame2 = (ImageView) mView.findViewById(R.id.earlyGame2);
        earlyGame3 = (ImageView) mView.findViewById(R.id.earlyGame3);
        earlyGame4 = (ImageView) mView.findViewById(R.id.earlyGame4);

        midGame1 = (ImageView) mView.findViewById(R.id.midGame1);
        midGame2 = (ImageView) mView.findViewById(R.id.midGame2);
        midGame3 = (ImageView) mView.findViewById(R.id.midGame3);
        midGame4 = (ImageView) mView.findViewById(R.id.midGame4);

        lateGame1 = (ImageView) mView.findViewById(R.id.lateGame1);
        lateGame2 = (ImageView) mView.findViewById(R.id.lateGame2);
        lateGame3 = (ImageView) mView.findViewById(R.id.lateGame3);
        lateGame4 = (ImageView) mView.findViewById(R.id.lateGame4);

        popularItems1 = (ImageView) mView.findViewById(R.id.popularItems1);
        popularItems2 = (ImageView) mView.findViewById(R.id.popularItems2);
        popularItems3 = (ImageView) mView.findViewById(R.id.popularItems3);
        popularItems4 = (ImageView) mView.findViewById(R.id.popularItems4);
        popularItems5 = (ImageView) mView.findViewById(R.id.popularItems5);
        popularItems6 = (ImageView) mView.findViewById(R.id.popularItems6);
        popularItems7 = (ImageView) mView.findViewById(R.id.popularItems7);
        popularItems8 = (ImageView) mView.findViewById(R.id.popularItems8);
        popularItems9 = (ImageView) mView.findViewById(R.id.popularItems9);
        popularItems10 = (ImageView) mView.findViewById(R.id.popularItems10);
        popularItems11 = (ImageView) mView.findViewById(R.id.popularItems11);
        popularItems12 = (ImageView) mView.findViewById(R.id.popularItems12);



        loadStrengthHeroSelection();
        loadAgilityHeroSelection();
        loadIntelligenceHeroSelection();

        //Put all the click events in its own class to make the code nicer
        handleClicks();


        return mView;
    }

    public void handleClicks(){

        //Creates the intent for the item click below
        final Intent intent = new Intent(getActivity(), ItemScreenFragment.class);

        //All of the starting items onClick listeners
        startingItems1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", startingItems1OnClick);
                startActivity(intent);
            }
        });
        startingItems2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", startingItems2OnClick);
                startActivity(intent);
            }
        });
        startingItems3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", startingItems3OnClick);
                startActivity(intent);
            }
        });
        startingItems4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", startingItems4OnClick);
                startActivity(intent);
            }
        });
        startingItems5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", startingItems5OnClick);
                startActivity(intent);
            }
        });
        startingItems6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", startingItems6OnClick);
                startActivity(intent);
            }
        });
        startingItems7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", startingItems7OnClick);
                startActivity(intent);
            }
        });
        startingItems8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", startingItems8OnClick);
                startActivity(intent);
            }
        });



        //All of the early game items onClick listeners
        earlyGame1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", earlyGame1OnClick);
                startActivity(intent);
            }
        });
        earlyGame2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", earlyGame2OnClick);
                startActivity(intent);
            }
        });
        earlyGame3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", earlyGame3OnClick);
                startActivity(intent);
            }
        });
        earlyGame4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", earlyGame4OnClick);
                startActivity(intent);
            }
        });



        //All of the mid game items onClick listeners
        midGame1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", midGame1OnClick);
                startActivity(intent);
            }
        });
        midGame2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", midGame2OnClick);
                startActivity(intent);
            }
        });
        midGame3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", midGame3OnClick);
                startActivity(intent);
            }
        });
        midGame4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", midGame4OnClick);
                startActivity(intent);
            }
        });




        //All of the late game items onClick listeners
        lateGame1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", lateGame1OnClick);
                startActivity(intent);
            }
        });
        lateGame2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", lateGame2OnClick);
                startActivity(intent);
            }
        });
        lateGame3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", lateGame3OnClick);
                startActivity(intent);
            }
        });
        lateGame4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", lateGame4OnClick);
                startActivity(intent);
            }
        });


        //All of the popular items onClick listeners
        popularItems1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", popularItems1OnClick);
                startActivity(intent);
            }
        });
        popularItems2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", popularItems2OnClick);
                startActivity(intent);
            }
        });
        popularItems3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", popularItems3OnClick);
                startActivity(intent);
            }
        });
        popularItems4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", popularItems4OnClick);
                startActivity(intent);
            }
        });
        popularItems5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", popularItems5OnClick);
                startActivity(intent);
            }
        });
        popularItems6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", popularItems6OnClick);
                startActivity(intent);
            }
        });
        popularItems7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", popularItems7OnClick);
                startActivity(intent);
            }
        });
        popularItems8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", popularItems8OnClick);
                startActivity(intent);
            }
        });
        popularItems9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", popularItems9OnClick);
                startActivity(intent);
            }
        });
        popularItems10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", popularItems10OnClick);
                startActivity(intent);
            }
        });
        popularItems11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", popularItems11OnClick);
                startActivity(intent);
            }
        });
        popularItems12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("itemSelected", popularItems12OnClick);
                startActivity(intent);
            }
        });


    }

    public void loadStrengthHeroSelection() {

        //Is used to get the heroSelected value from the previous class
        String heroSelected = getActivity().getIntent().getExtras().getString("heroSelected");


        switch(heroSelected){

            //******************************************************************************
            //ALL OF THE SWITCH CASES FOR STRENGTH HEROES
            //******************************************************************************
            case "Abaddon":
                startingItems1.setImageResource(R.drawable.item_observer_ward);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setImageResource(R.drawable.item_healing_salve);
                startingItems4.setImageResource(R.drawable.item_clarity);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_ring_of_basilius);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_tranquil_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_urn_of_shadows);
                midGame4.setImageResource(R.drawable.item_vladmirs_offering);

                lateGame1.setImageResource(R.drawable.item_solar_crest);
                lateGame2.setImageResource(R.drawable.item_assault_cuirass);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_phase_boots);
                popularItems2.setImageResource(R.drawable.item_hand_of_midas);
                popularItems3.setImageResource(R.drawable.item_radiance);
                popularItems4.setImageResource(R.drawable.item_vladmirs_offering);
                popularItems5.setImageResource(R.drawable.item_solar_crest);
                popularItems6.setImageResource(R.drawable.item_magic_wand);
                popularItems7.setImageResource(R.drawable.item_blade_mail);
                popularItems8.setImageResource(R.drawable.item_power_treads);
                popularItems9.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems10.setImageResource(R.drawable.item_quelling_blade);
                popularItems11.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems12.setImageResource(R.drawable.item_blink_dagger);

                startingItems1OnClick = "observer_ward";
                startingItems2OnClick = "tango";
                startingItems3OnClick = "healing_salve";
                startingItems4OnClick = "clarity";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "ring_of_basilius";

                midGame1OnClick = "tranquil_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "urn_of_shadows";
                midGame4OnClick = "vladmirs_offering";

                lateGame1OnClick = "solar_crest";
                lateGame2OnClick = "assault_cuirass";

                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "hand_of_midas";
                popularItems3OnClick = "radiance";
                popularItems4OnClick = "vladmirs_offering";
                popularItems5OnClick = "solar_crest";
                popularItems6OnClick = "magic_wand";
                popularItems7OnClick = "blade_mail";
                popularItems8OnClick = "power_treads";
                popularItems9OnClick = "aghanims_scepter";
                popularItems10OnClick = "quelling_blade";
                popularItems11OnClick = "urn_of_shadows";
                popularItems12OnClick = "blink_dagger";
                break;


            case "Alchemist":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_bottle);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_helm_of_iron_will);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_armlet_of_mordiggian);
                midGame2.setImageResource(R.drawable.item_radiance);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_manta_style);
                lateGame2.setImageResource(R.drawable.item_octarine_core);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_radiance);
                popularItems2.setImageResource(R.drawable.item_armlet_of_mordiggian);
                popularItems3.setImageResource(R.drawable.item_boots_of_travel);
                popularItems4.setImageResource(R.drawable.item_manta_style);
                popularItems5.setImageResource(R.drawable.item_octarine_core);
                popularItems6.setImageResource(R.drawable.item_solar_crest);
                popularItems7.setImageResource(R.drawable.item_boots_of_speed);
                popularItems8.setImageResource(R.drawable.item_soul_ring);
                popularItems9.setImageResource(R.drawable.item_assault_cuirass);
                popularItems10.setImageResource(R.drawable.item_black_king_bar);
                popularItems11.setImageResource(R.drawable.item_power_treads);
                popularItems12.setImageResource(R.drawable.item_bottle);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "iron_branch";

                earlyGame1OnClick = "bottle";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "helm_of_iron_will";

                midGame1OnClick = "armlet_of_mordiggian";
                midGame2OnClick = "radiance";

                lateGame1OnClick = "manta_style";
                lateGame2OnClick = "octarine_core";

                popularItems1OnClick = "radiance";
                popularItems2OnClick = "armlet_of_mordiggian";
                popularItems3OnClick = "boots_of_travel";
                popularItems4OnClick = "manta_style";
                popularItems5OnClick = "octarine_core";
                popularItems6OnClick = "solar_crest";
                popularItems7OnClick = "boots_of_speed";
                popularItems8OnClick = "soul_ring";
                popularItems9OnClick = "assault_cuirass";
                popularItems10OnClick = "black_king_bar";
                popularItems11OnClick = "power_treads";
                popularItems12OnClick = "bottle";
                break;


            case "Axe":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_tranquil_boots);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_ring_of_health);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_blink_dagger);
                midGame2.setImageResource(R.drawable.item_vanguard);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_blade_mail);
                lateGame2.setImageResource(R.drawable.item_crimson_guard);
                lateGame3.setImageResource(R.drawable.item_heart_of_tarrasque);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_blink_dagger);
                popularItems2.setImageResource(R.drawable.item_blade_mail);
                popularItems3.setImageResource(R.drawable.item_tranquil_boots);
                popularItems4.setImageResource(R.drawable.item_vanguard);
                popularItems5.setImageResource(R.drawable.item_magic_wand);
                popularItems6.setImageResource(R.drawable.item_black_king_bar);
                popularItems7.setImageResource(R.drawable.item_boots_of_travel);
                popularItems8.setImageResource(R.drawable.item_force_staff);
                popularItems9.setImageResource(R.drawable.item_shadowblade);
                popularItems10.setImageResource(R.drawable.item_crimson_guard);
                popularItems11.setImageResource(R.drawable.item_heart_of_tarrasque);
                popularItems12.setImageResource(R.drawable.item_boots_of_speed);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "tango";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "iron_branch";


                earlyGame1OnClick = "tranquil_boots";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "ring_of_health";

                midGame1OnClick = "blink_dagger";
                midGame2OnClick = "vanguard";

                lateGame1OnClick = "blade_mail";
                lateGame2OnClick = "crimson_guard";
                lateGame3OnClick = "heart_of_tarrasque";

                popularItems1OnClick = "blink_dagger";
                popularItems2OnClick = "blade_mail";
                popularItems3OnClick = "tranquil_boots";
                popularItems4OnClick = "vanguard";
                popularItems5OnClick = "magic_wand";
                popularItems6OnClick = "black_king_bar";
                popularItems7OnClick = "boots_of_travel";
                popularItems8OnClick = "force_staff";
                popularItems9OnClick = "shadow_blade";
                popularItems10OnClick = "crimson_guard";
                popularItems11OnClick = "heart_of_tarrasque";
                popularItems12OnClick = "boots_of_speed";
                break;



            case "Beastmaster":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_ring_of_protection);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_quelling_blade);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_tranquil_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_solar_crest);
                lateGame2.setImageResource(R.drawable.item_blink_dagger);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_overwhelming_blink);
                popularItems2.setImageResource(R.drawable.item_quelling_blade);
                popularItems3.setImageResource(R.drawable.item_blink_dagger);
                popularItems4.setImageResource(R.drawable.item_tranquil_boots);
                popularItems5.setImageResource(R.drawable.item_vladmirs_offering);
                popularItems6.setImageResource(R.drawable.item_boots_of_travel);
                popularItems7.setImageResource(R.drawable.item_boots_of_speed);
                popularItems8.setImageResource(R.drawable.item_solar_crest);
                popularItems9.setImageResource(R.drawable.item_assault_cuirass);
                popularItems10.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems11.setImageResource(R.drawable.item_magic_wand);
                popularItems12.setImageResource(R.drawable.item_hand_of_midas);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "ring_of_protection";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "iron_branch";

                earlyGame1OnClick = "quelling_blade";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "boots_of_speed";

                midGame1OnClick = "tranquil_boots";
                midGame2OnClick = "magic_wand";

                lateGame1OnClick = "solar_crest";
                lateGame2OnClick = "blink_dagger";

                popularItems1OnClick = "overwhelming_blink";
                popularItems2OnClick = "quelling_blade";
                popularItems3OnClick = "blink_dagger";
                popularItems4OnClick = "traquil_boots";
                popularItems5OnClick = "vladmirs_offering";
                popularItems6OnClick = "boots_of_travel";
                popularItems7OnClick = "boots_of_speed";
                popularItems8OnClick = "solar_crest";
                popularItems9OnClick = "assault_cuirass";
                popularItems10OnClick = "aghanims_scepter";
                popularItems11OnClick = "magic_wand";
                popularItems12OnClick = "hand_of_midas";
                break;


            case "Brewmaster":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_bottle);
                earlyGame3.setImageResource(R.drawable.item_magic_stick);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_phase_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_vladmirs_offering);
                lateGame2.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame3.setImageResource(R.drawable.item_assault_cuirass);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_blink_dagger);
                popularItems2.setImageResource(R.drawable.item_vladmirs_offering);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_phase_boots);
                popularItems5.setImageResource(R.drawable.item_hand_of_midas);
                popularItems6.setImageResource(R.drawable.item_arcane_boots);
                popularItems7.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems8.setImageResource(R.drawable.item_assault_cuirass);
                popularItems9.setImageResource(R.drawable.item_drum_of_endurance);
                popularItems10.setImageResource(R.drawable.item_boots_of_speed);
                popularItems11.setImageResource(R.drawable.item_radiance);
                popularItems12.setImageResource(R.drawable.item_black_king_bar);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "bottle";
                earlyGame3OnClick = "magic_stick";

                midGame1OnClick = "phase_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "blink_dagger";

                lateGame1OnClick = "vladmirs_offering";
                lateGame2OnClick = "aghanims_scepter";
                lateGame3OnClick = "assault_cuirass";

                popularItems1OnClick = "blink_dagger";
                popularItems2OnClick = "vladmirs_offering";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "phase_boots";
                popularItems5OnClick = "hand_of_midas";
                popularItems6OnClick = "arcane_boots";
                popularItems7OnClick = "aghanims_scepter";
                popularItems8OnClick = "assault_cuirass";
                popularItems9OnClick = "drum_of_endurance";
                popularItems10OnClick = "boots_of_speed";
                popularItems11OnClick = "radiance";
                popularItems12OnClick = "black_king_bar";
                break;


            case "Bristleback":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_enchanted_mango);
                startingItems3.setImageResource(R.drawable.item_ring_of_protection);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_ring_of_health);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_ring_of_basilius);
                earlyGame4.setImageResource(R.drawable.item_magic_stick);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_vanguard);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_crimson_guard);
                lateGame2.setImageResource(R.drawable.item_pipe_of_insight);
                lateGame3.setImageResource(R.drawable.item_shivas_guard);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_power_treads);
                popularItems2.setImageResource(R.drawable.item_vanguard);
                popularItems3.setImageResource(R.drawable.item_solar_crest);
                popularItems4.setImageResource(R.drawable.item_magic_wand);
                popularItems5.setImageResource(R.drawable.item_blade_mail);
                popularItems6.setImageResource(R.drawable.item_crimson_guard);
                popularItems7.setImageResource(R.drawable.item_pipe_of_insight);
                popularItems8.setImageResource(R.drawable.item_hood_of_defiance);
                popularItems9.setImageResource(R.drawable.item_boots_of_speed);
                popularItems10.setImageResource(R.drawable.item_lotus_orb);
                popularItems11.setImageResource(R.drawable.item_heavens_halberd);
                popularItems12.setImageResource(R.drawable.item_octarine_core);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "enchanted_mango";
                startingItems3OnClick = "ring_of_protection";
                startingItems4OnClick = "iron_branch";

                earlyGame1OnClick = "ring_of_health";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "ring_of_basilius";
                earlyGame4OnClick = "magic_stick";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "vanguard";

                lateGame1OnClick = "crimson_guard";
                lateGame2OnClick = "pipe_of_insight";
                lateGame3OnClick = "shivas_guard";

                popularItems1OnClick = "power_treads";
                popularItems2OnClick = "vanguard";
                popularItems3OnClick = "solar_crest";
                popularItems4OnClick = "magic_wand";
                popularItems5OnClick = "blade_mail";
                popularItems6OnClick = "crimson_guard";
                popularItems7OnClick = "pipe_of_insight";
                popularItems8OnClick = "hood_of_defiance";
                popularItems9OnClick = "boots_of_speed";
                popularItems10OnClick = "lotus_orb";
                popularItems11OnClick = "heavens_halberd";
                popularItems12OnClick = "octarine_core";
                break;


            case "Centuar Warrunner":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_wind_lace);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_ironwood_branch);
                earlyGame2.setImageResource(R.drawable.item_tranquil_boots);
                earlyGame3.setImageResource(R.drawable.item_magic_stick);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_hood_of_defiance);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setImageResource(R.drawable.item_vanguard);

                lateGame1.setImageResource(R.drawable.item_crimson_guard);
                lateGame2.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame3.setImageResource(R.drawable.item_pipe_of_insight);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_blink_dagger);
                popularItems2.setImageResource(R.drawable.item_tranquil_boots);
                popularItems3.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems4.setImageResource(R.drawable.item_hood_of_defiance);
                popularItems5.setImageResource(R.drawable.item_pipe_of_insight);
                popularItems6.setImageResource(R.drawable.item_blade_mail);
                popularItems7.setImageResource(R.drawable.item_magic_wand);
                popularItems8.setImageResource(R.drawable.item_force_staff);
                popularItems9.setImageResource(R.drawable.item_radiance);
                popularItems10.setImageResource(R.drawable.item_crimson_guard);
                popularItems11.setImageResource(R.drawable.item_heart_of_tarrasque);
                popularItems12.setImageResource(R.drawable.item_ironwood_branch);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "wind_lace";

                earlyGame1OnClick = "iron_branch";
                earlyGame2OnClick = "tranquil_boots";
                earlyGame3OnClick = "magic_stick";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "hood_of_defiance";
                midGame3OnClick = "blink_dagger";
                midGame4OnClick = "vanguard";

                lateGame1OnClick = "crimson_guard";
                lateGame2OnClick = "aghanims_scepter";
                lateGame3OnClick = "pipe_of_insight";

                popularItems1OnClick = "blink_dagger";
                popularItems2OnClick = "tranquil_boots";
                popularItems3OnClick = "aghanims_scepter";
                popularItems4OnClick = "hood_of_defiance";
                popularItems5OnClick = "pipe_of_insight";
                popularItems6OnClick = "blade_mail";
                popularItems7OnClick = "magic_wand";
                popularItems8OnClick = "force_staff";
                popularItems9OnClick = "radiance";
                popularItems10OnClick = "crimson_guard";
                popularItems11OnClick = "heart_of_tarrasque";
                popularItems12OnClick = "iron_branch";
                break;



            case "Chaos Knight":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_enchanted_mango);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_wand);
                earlyGame3.setImageResource(R.drawable.item_helm_of_iron_will);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_armlet_of_mordiggian);
                midGame4.setImageResource(R.drawable.item_drum_of_endurance);

                lateGame1.setImageResource(R.drawable.item_black_king_bar);
                lateGame2.setImageResource(R.drawable.item_manta_style);
                lateGame3.setImageResource(R.drawable.item_heart_of_tarrasque);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_power_treads);
                popularItems2.setImageResource(R.drawable.item_armlet_of_mordiggian);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_heart_of_tarrasque);
                popularItems5.setImageResource(R.drawable.item_manta_style);
                popularItems6.setImageResource(R.drawable.item_hand_of_midas);
                popularItems7.setImageResource(R.drawable.item_black_king_bar);
                popularItems8.setImageResource(R.drawable.item_drum_of_endurance);
                popularItems9.setImageResource(R.drawable.item_echo_sabre);
                popularItems10.setImageResource(R.drawable.item_assault_cuirass);
                popularItems11.setImageResource(R.drawable.item_ironwood_branch);
                popularItems12.setImageResource(R.drawable.item_boots_of_travel);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "enchanted_mango";
                startingItems4OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_wand";
                earlyGame3OnClick = "helm_of_iron_will";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "armlet_of_mordiggian";
                midGame4OnClick = "drum_of_endurance";

                lateGame1OnClick = "black_king_bar";
                lateGame2OnClick = "manta_style";
                lateGame3OnClick = "heart_of_tarrasque";

                popularItems1OnClick = "power_treads";
                popularItems2OnClick = "armlet_of_mordiggian";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "heart_of_tarrasque";
                popularItems5OnClick = "manta_style";
                popularItems6OnClick = "hand_of_midas";
                popularItems7OnClick = "black_king_bar";
                popularItems8OnClick = "drum_of_endurance";
                popularItems9OnClick = "echo_sabre";
                popularItems10OnClick = "assault_cuirass";
                popularItems11OnClick = "iron_branch";
                popularItems12OnClick = "boots_of_travel";
                break;


            case "Clockwerk":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_clarity);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_phase_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_blade_mail);
                midGame4.setImageResource(R.drawable.item_force_staff);

                lateGame1.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame2.setImageResource(R.drawable.item_shivas_guard);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_blade_mail);
                popularItems2.setImageResource(R.drawable.item_force_staff);
                popularItems3.setImageResource(R.drawable.item_tranquil_boots);
                popularItems4.setImageResource(R.drawable.item_magic_wand);
                popularItems5.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems6.setImageResource(R.drawable.item_hand_of_midas);
                popularItems7.setImageResource(R.drawable.item_phase_boots);
                popularItems8.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems9.setImageResource(R.drawable.item_ironwood_branch);
                popularItems10.setImageResource(R.drawable.item_lotus_orb);
                popularItems11.setImageResource(R.drawable.item_ghost_scepter);
                popularItems12.setImageResource(R.drawable.item_boots_of_speed);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "clarity";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";

                midGame1OnClick = "phase_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "blade_mail";
                midGame4OnClick = "force_staff";

                lateGame1OnClick = "aghanims_scepter";
                lateGame2OnClick = "shivas_guard";

                popularItems1OnClick = "blade_mail";
                popularItems2OnClick = "force_staff";
                popularItems3OnClick = "tranquil_boots";
                popularItems4OnClick = "magic_wand";
                popularItems5OnClick = "aghanims_scepter";
                popularItems6OnClick = "hand_of_midas";
                popularItems7OnClick = "phase_boots";
                popularItems8OnClick = "urn_of_shadows";
                popularItems9OnClick = "iron_branch";
                popularItems10OnClick = "lotus_orb";
                popularItems11OnClick = "ghost_scepter";
                popularItems12OnClick = "boots_of_speed";
                break;

            case "Dawnbreaker":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_enchanted_mango);
                startingItems5.setImageResource(R.drawable.item_quelling_blade);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_power_treads);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_black_king_bar);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setImageResource(R.drawable.item_echo_sabre);

                lateGame1.setImageResource(R.drawable.item_abyssal_blade);
                lateGame2.setImageResource(R.drawable.item_assault_cuirass);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_blade_mail);
                popularItems2.setImageResource(R.drawable.item_power_treads);
                popularItems3.setImageResource(R.drawable.item_abyssal_blade);
                popularItems4.setImageResource(R.drawable.item_black_king_bar);
                popularItems5.setImageResource(R.drawable.item_assault_cuirass);
                popularItems6.setImageResource(R.drawable.item_desolator);
                popularItems7.setImageResource(R.drawable.item_orb_of_corrosion);
                popularItems8.setImageResource(R.drawable.item_heavens_halberd);
                popularItems9.setImageResource(R.drawable.item_echo_sabre);
                popularItems10.setImageResource(R.drawable.item_sange_and_yasha);
                popularItems11.setImageResource(R.drawable.item_lotus_orb);
                popularItems12.setImageResource(R.drawable.item_overwhelming_blink);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "enchanted_mango";
                startingItems5OnClick = "quelling_blade";

                earlyGame1OnClick = "power_treads";
                earlyGame2OnClick = "magic_stick";

                midGame1OnClick = "black_king_bar";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "blink_dagger";
                midGame4OnClick = "echo_sabre";

                lateGame1OnClick = "abyssal_blade";
                lateGame2OnClick = "assault_cuirass";

                popularItems1OnClick = "blade_mail";
                popularItems2OnClick = "power_treads";
                popularItems3OnClick = "abyssal_blade";
                popularItems4OnClick = "black_king_bar";
                popularItems5OnClick = "assault_cuirass";
                popularItems6OnClick = "desolator";
                popularItems7OnClick = "orb_of_corrosion";
                popularItems8OnClick = "heavens_halberd";
                popularItems9OnClick = "echo_sabre";
                popularItems10OnClick = "sange_and_yasha";
                popularItems11OnClick = "lotus_orb";
                popularItems12OnClick = "overwhelming_blink";
                break;

            case "Doom":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ring_of_protection);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_ring_of_basilius);
                earlyGame3.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_phase_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_drum_of_endurance);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_blink_dagger);
                lateGame2.setImageResource(R.drawable.item_assault_cuirass);
                lateGame3.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_phase_boots);
                popularItems2.setImageResource(R.drawable.item_blink_dagger);
                popularItems3.setImageResource(R.drawable.item_hand_of_midas);
                popularItems4.setImageResource(R.drawable.item_shivas_guard);
                popularItems5.setImageResource(R.drawable.item_drum_of_endurance);
                popularItems6.setImageResource(R.drawable.item_shadowblade);
                popularItems7.setImageResource(R.drawable.item_magic_wand);
                popularItems8.setImageResource(R.drawable.item_blade_mail);
                popularItems9.setImageResource(R.drawable.item_tranquil_boots);
                popularItems10.setImageResource(R.drawable.item_black_king_bar);
                popularItems11.setImageResource(R.drawable.item_vladmirs_offering);
                popularItems12.setImageResource(R.drawable.item_boots_of_travel);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "ring_of_protection";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "ring_of_basilius";
                earlyGame3OnClick = "boots_of_speed";

                midGame1OnClick = "phase_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "drum_of_endurance";

                lateGame1OnClick = "blink_dagger";
                lateGame2OnClick = "assault_cuirass";
                lateGame3OnClick = "aghanims_scepter";

                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "blink_dagger";
                popularItems3OnClick = "hand_of_midas";
                popularItems4OnClick = "shivas_guard";
                popularItems5OnClick = "drum_of_endurance";
                popularItems6OnClick = "shadow_blade";
                popularItems7OnClick = "magic_wand";
                popularItems8OnClick = "blade_mail";
                popularItems9OnClick = "tranquil_boots";
                popularItems10OnClick = "black_king_bar";
                popularItems11OnClick = "vladmirs_offering";
                popularItems12OnClick = "boots_of_travel";
                break;



            case "Dragon Knight":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_quelling_blade);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_bottle);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_black_king_bar);
                lateGame2.setImageResource(R.drawable.item_assault_cuirass);
                lateGame3.setImageResource(R.drawable.item_daedalus);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_power_treads);
                popularItems2.setImageResource(R.drawable.item_black_king_bar);
                popularItems3.setImageResource(R.drawable.item_armlet_of_mordiggian);
                popularItems4.setImageResource(R.drawable.item_blink_dagger);
                popularItems5.setImageResource(R.drawable.item_magic_wand);
                popularItems6.setImageResource(R.drawable.item_hand_of_midas);
                popularItems7.setImageResource(R.drawable.item_silver_edge);
                popularItems8.setImageResource(R.drawable.item_assault_cuirass);
                popularItems9.setImageResource(R.drawable.item_bottle);
                popularItems10.setImageResource(R.drawable.item_shadowblade);
                popularItems11.setImageResource(R.drawable.item_heavens_halberd);
                popularItems12.setImageResource(R.drawable.item_heart_of_tarrasque);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "quelling_blade";
                startingItems3OnClick = "iron_branch";

                earlyGame1OnClick = "bottle";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "boots_of_speed";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "magic_wand";

                lateGame1OnClick = "black_king_bar";
                lateGame2OnClick = "assault_cuirass";
                lateGame3OnClick = "daedalus";

                popularItems1OnClick = "power_treads";
                popularItems2OnClick = "black_king_bar";
                popularItems3OnClick = "armlet_of_mordiggian";
                popularItems4OnClick = "blink_dagger";
                popularItems5OnClick = "magic_wand";
                popularItems6OnClick = "hand_of_midas";
                popularItems7OnClick = "silver_edge";
                popularItems8OnClick = "assault_cuirass";
                popularItems9OnClick = "bottle";
                popularItems10OnClick = "shadow_blade";
                popularItems11OnClick = "heavens_halberd";
                popularItems12OnClick = "heart_of_tarrasque";
                break;



            case "Earth Spirit":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_orb_of_venom);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_magic_stick);
                earlyGame4.setImageResource(R.drawable.item_urn_of_shadows);

                midGame1.setImageResource(R.drawable.item_tranquil_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_force_staff);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_veil_of_discord);
                lateGame2.setImageResource(R.drawable.item_glimmer_cape);
                lateGame3.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_tranquil_boots);
                popularItems2.setImageResource(R.drawable.item_magic_wand);
                popularItems3.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems4.setImageResource(R.drawable.item_blink_dagger);
                popularItems5.setImageResource(R.drawable.item_orb_of_venom);
                popularItems6.setImageResource(R.drawable.item_glimmer_cape);
                popularItems7.setImageResource(R.drawable.item_force_staff);
                popularItems8.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems9.setImageResource(R.drawable.item_arcane_boots);
                popularItems10.setImageResource(R.drawable.item_hand_of_midas);
                popularItems11.setImageResource(R.drawable.item_boots_of_speed);
                popularItems12.setImageResource(R.drawable.item_ghost_scepter);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "iron_branch";

                earlyGame1OnClick = "orb_of_venom";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "magic_stick";
                earlyGame4OnClick = "urn_of_shadows";

                midGame1OnClick = "tranquil_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "force_staff";

                lateGame1OnClick = "veil_of_discord";
                lateGame2OnClick = "glimmer_cape";
                lateGame3OnClick = "aghanims_scepter";

                popularItems1OnClick = "tranquil_boots";
                popularItems2OnClick = "magic_wand";
                popularItems3OnClick = "urn_of_shadows";
                popularItems4OnClick = "blink_dagger";
                popularItems5OnClick = "orb_of_venom";
                popularItems6OnClick = "glimmer_cape";
                popularItems7OnClick = "force_staff";
                popularItems8OnClick = "euls_scepter_of_divinity";
                popularItems9OnClick = "arcane_boots";
                popularItems10OnClick = "hand_of_midas";
                popularItems11OnClick = "boots_of_speed";
                popularItems12OnClick = "ghost_scepter";
                break;


            case "Earthshaker":
                startingItems1.setImageResource(R.drawable.item_clarity);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_tango);
                startingItems4.setImageResource(R.drawable.item_observer_ward);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setImageResource(R.drawable.item_ironwood_branch);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_arcane_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_force_staff);
                lateGame2.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_blink_dagger);
                popularItems2.setImageResource(R.drawable.item_arcane_boots);
                popularItems3.setImageResource(R.drawable.item_force_staff);
                popularItems4.setImageResource(R.drawable.item_magic_wand);
                popularItems5.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems6.setImageResource(R.drawable.item_shadowblade);
                popularItems7.setImageResource(R.drawable.item_tranquil_boots);
                popularItems8.setImageResource(R.drawable.item_soul_ring);
                popularItems9.setImageResource(R.drawable.item_wind_lace);
                popularItems10.setImageResource(R.drawable.item_ghost_scepter);
                popularItems11.setImageResource(R.drawable.item_boots_of_travel);
                popularItems12.setImageResource(R.drawable.item_power_treads);

                startingItems1OnClick = "clarity";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "tango";
                startingItems4OnClick = "observer_ward";
                startingItems5OnClick = "iron_branch";
                startingItems6OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";

                midGame1OnClick = "arcane_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "blink_dagger";

                lateGame1OnClick = "force_staff";
                lateGame2OnClick = "aghanims_scepter";

                popularItems1OnClick = "blink_dagger";
                popularItems2OnClick = "arcane_boots";
                popularItems3OnClick = "force_staff";
                popularItems4OnClick = "magic_wand";
                popularItems5OnClick = "euls_scepter_of_divinity";
                popularItems6OnClick = "shadow_blade";
                popularItems7OnClick = "tranquil_boots";
                popularItems8OnClick = "soul_ring";
                popularItems9OnClick = "wind_lace";
                popularItems10OnClick = "ghost_scepter";
                popularItems11OnClick = "boots_of_travel";
                popularItems12OnClick = "power_treads";
                break;



            case "Elder Titan":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_tango);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_wind_lace);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aether_lens);
                lateGame2.setImageResource(R.drawable.item_shivas_guard);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_tranquil_boots);
                popularItems2.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_soul_ring);
                popularItems5.setImageResource(R.drawable.item_force_staff);
                popularItems6.setImageResource(R.drawable.item_wind_lace);
                popularItems7.setImageResource(R.drawable.item_arcane_boots);
                popularItems8.setImageResource(R.drawable.item_glimmer_cape);
                popularItems9.setImageResource(R.drawable.item_solar_crest);
                popularItems10.setImageResource(R.drawable.item_power_treads);
                popularItems11.setImageResource(R.drawable.item_aether_lens);
                popularItems12.setImageResource(R.drawable.item_hand_of_midas);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "tango";
                startingItems4OnClick = "stout_sheild";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "wind_lace";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "euls_scepter_of_divinity";

                lateGame1OnClick = "aether_lens";
                lateGame2OnClick = "shivas_guard";

                popularItems1OnClick = "tranquil_boots";
                popularItems2OnClick = "euls_scepter_of_divinity";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "soul_ring";
                popularItems5OnClick = "force_staff";
                popularItems6OnClick = "wind_lace";
                popularItems7OnClick = "arcane_boots";
                popularItems8OnClick = "glimmer_cape";
                popularItems9OnClick = "solar_crest";
                popularItems10OnClick = "power_treads";
                popularItems11OnClick = "aether_lens";
                popularItems12OnClick = "hand_of_midas";
                break;



            case "Huskar":
                startingItems1.setImageResource(R.drawable.item_healing_salve);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setImageResource(R.drawable.item_gauntlets_of_strength);
                startingItems4.setImageResource(R.drawable.item_gauntlets_of_strength);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_urn_of_shadows);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_armlet_of_mordiggian);
                midGame4.setImageResource(R.drawable.item_vladmirs_offering);

                lateGame1.setImageResource(R.drawable.item_heavens_halberd);
                lateGame2.setImageResource(R.drawable.item_hurricane_pike);
                lateGame3.setImageResource(R.drawable.item_satanic);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_armlet_of_mordiggian);
                popularItems2.setImageResource(R.drawable.item_heavens_halberd);
                popularItems3.setImageResource(R.drawable.item_power_treads);
                popularItems4.setImageResource(R.drawable.item_magic_wand);
                popularItems5.setImageResource(R.drawable.item_black_king_bar);
                popularItems6.setImageResource(R.drawable.item_boots_of_speed);
                popularItems7.setImageResource(R.drawable.item_solar_crest);
                popularItems8.setImageResource(R.drawable.item_hurricane_pike);
                popularItems9.setImageResource(R.drawable.item_morbid_mask);
                popularItems10.setImageResource(R.drawable.item_satanic);
                popularItems11.setImageResource(R.drawable.item_dragon_lance);
                popularItems12.setImageResource(R.drawable.item_boots_of_travel);

                startingItems1OnClick = "healing_salve";
                startingItems2OnClick = "tango";
                startingItems3OnClick = "guantlets_of_strength";
                startingItems4OnClick = "guantlets_of_strength";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "urn_of_shadows";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "armlet_of_mordiggian";
                midGame4OnClick = "vladmirs_offering";

                lateGame1OnClick = "heavens_halberd";
                lateGame2OnClick = "hurricane_pike";
                lateGame3OnClick = "satanic";

                popularItems1OnClick = "armlet_of_mordiggian";
                popularItems2OnClick = "heavens_halberd";
                popularItems3OnClick = "power_treads";
                popularItems4OnClick = "magic_wand";
                popularItems5OnClick = "black_king_bar";
                popularItems6OnClick = "boots_of_speed";
                popularItems7OnClick = "solar_crest";
                popularItems8OnClick = "hurricane_pike";
                popularItems9OnClick = "morbid_mask";
                popularItems10OnClick = "satanic";
                popularItems11OnClick = "dragon_lance";
                popularItems12OnClick = "boots_of_travel";
                break;



            case "Kunkka":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_gauntlets_of_strength);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_bottle);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_magic_stick);
                earlyGame4.setImageResource(R.drawable.item_bracer);

                midGame1.setImageResource(R.drawable.item_phase_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_drum_of_endurance);
                midGame4.setImageResource(R.drawable.item_shadowblade);

                lateGame1.setImageResource(R.drawable.item_daedalus);
                lateGame2.setImageResource(R.drawable.item_black_king_bar);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_magic_wand);
                popularItems2.setImageResource(R.drawable.item_arcane_boots);
                popularItems3.setImageResource(R.drawable.item_aether_lens);
                popularItems4.setImageResource(R.drawable.item_wind_lace);
                popularItems5.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems6.setImageResource(R.drawable.item_phase_boots);
                popularItems7.setImageResource(R.drawable.item_force_staff);
                popularItems8.setImageResource(R.drawable.item_glimmer_cape);
                popularItems9.setImageResource(R.drawable.item_blink_dagger);
                popularItems10.setImageResource(R.drawable.item_drum_of_endurance);
                popularItems11.setImageResource(R.drawable.item_boots_of_speed);
                popularItems12.setImageResource(R.drawable.item_tranquil_boots);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "gauntlets_of_strength";

                earlyGame1OnClick = "bottle";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "magic_stick";
                earlyGame4OnClick = "bracer";

                midGame1OnClick = "phase_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "drum_of_endurance";
                midGame4OnClick = "shadow_blade";

                lateGame1OnClick = "daedalus";
                lateGame2OnClick = "black_king_bar";

                popularItems1OnClick = "magic_wand";
                popularItems2OnClick = "arcane_boots";
                popularItems3OnClick = "aether_lens";
                popularItems4OnClick = "wind_lace";
                popularItems5OnClick = "urn_of_shadows";
                popularItems6OnClick = "phase_boots";
                popularItems7OnClick = "force_staff";
                popularItems8OnClick = "glimmer_cape";
                popularItems9OnClick = "blink_dagger";
                popularItems10OnClick = "drum_of_endurance";
                popularItems11OnClick = "boots_of_speed";
                popularItems12OnClick = "tranquil_boots";
                break;


            case "Legion Commander":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_ring_of_basilius);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setImageResource(R.drawable.item_blade_mail);

                lateGame1.setImageResource(R.drawable.item_assault_cuirass);
                lateGame2.setImageResource(R.drawable.item_mjollnir);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_blink_dagger);
                popularItems2.setImageResource(R.drawable.item_blade_mail);
                popularItems3.setImageResource(R.drawable.item_phase_boots);
                popularItems4.setImageResource(R.drawable.item_assault_cuirass);
                popularItems5.setImageResource(R.drawable.item_black_king_bar);
                popularItems6.setImageResource(R.drawable.item_magic_wand);
                popularItems7.setImageResource(R.drawable.item_shadowblade);
                popularItems8.setImageResource(R.drawable.item_power_treads);
                popularItems9.setImageResource(R.drawable.item_armlet_of_mordiggian);
                popularItems10.setImageResource(R.drawable.item_heavens_halberd);
                popularItems11.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems12.setImageResource(R.drawable.item_desolator);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "ring_of_basilius";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "blink_dagger";
                midGame4OnClick = "blademail";

                lateGame1OnClick = "assault_cuirass";
                lateGame2OnClick = "mjolnir";

                popularItems1OnClick = "blink_dagger";
                popularItems2OnClick = "blade_mail";
                popularItems3OnClick = "phase_boots";
                popularItems4OnClick = "assault_cuirass";
                popularItems5OnClick = "black_king_bar";
                popularItems6OnClick = "magic_wand";
                popularItems7OnClick = "shadow_blade";
                popularItems8OnClick = "power_treads";
                popularItems9OnClick = "armlet_of_mordiggian";
                popularItems10OnClick = "heavens_halberd";
                popularItems11OnClick = "aghanims_scepter";
                popularItems12OnClick = "desolator";
                break;


            case "Lifestealer":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_quelling_blade);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_orb_of_venom);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_phase_boots);
                midGame2.setImageResource(R.drawable.item_armlet_of_mordiggian);
                midGame3.setImageResource(R.drawable.item_echo_sabre);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_desolator);
                lateGame2.setImageResource(R.drawable.item_abyssal_blade);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_phase_boots);
                popularItems2.setImageResource(R.drawable.item_armlet_of_mordiggian);
                popularItems3.setImageResource(R.drawable.item_desolator);
                popularItems4.setImageResource(R.drawable.item_assault_cuirass);
                popularItems5.setImageResource(R.drawable.item_hand_of_midas);
                popularItems6.setImageResource(R.drawable.item_echo_sabre);
                popularItems7.setImageResource(R.drawable.item_skull_basher);
                popularItems8.setImageResource(R.drawable.item_kaya_and_sange);
                popularItems9.setImageResource(R.drawable.item_abyssal_blade);
                popularItems10.setImageResource(R.drawable.item_heavens_halberd);
                popularItems11.setImageResource(R.drawable.item_quelling_blade);
                popularItems12.setImageResource(R.drawable.item_hyperstone);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "quelling_blade";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "orb_of_venom";

                midGame1OnClick = "phase_boots";
                midGame2OnClick = "armlet_of_mordiggian";
                midGame3OnClick = "echo_sabre";

                lateGame1OnClick = "desolator";
                lateGame2OnClick = "abyssal_blade";

                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "armlet_of_mordiggian";
                popularItems3OnClick = "desolator";
                popularItems4OnClick = "assault_cuirass";
                popularItems5OnClick = "hand_of_midas";
                popularItems6OnClick = "echo_sabre";
                popularItems7OnClick = "skull_basher";
                popularItems8OnClick = "sange_and_yasha";
                popularItems9OnClick = "abyssal_blade";
                popularItems10OnClick = "heavens_halberd";
                popularItems11OnClick = "quelling_blade";
                popularItems12OnClick = "hyperstone";
                break;


            case "Lycan":
                startingItems1.setImageResource(R.drawable.item_healing_salve);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ring_of_protection);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_vladmirs_offering);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_helm_of_the_dominator);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_assault_cuirass);
                lateGame2.setImageResource(R.drawable.item_desolator);
                lateGame3.setImageResource(R.drawable.item_black_king_bar);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_power_treads);
                popularItems2.setImageResource(R.drawable.item_mask_of_madness);
                popularItems3.setImageResource(R.drawable.item_armlet_of_mordiggian);
                popularItems4.setImageResource(R.drawable.item_black_king_bar);
                popularItems5.setImageResource(R.drawable.item_desolator);
                popularItems6.setImageResource(R.drawable.item_assault_cuirass);
                popularItems7.setImageResource(R.drawable.item_echo_sabre);
                popularItems8.setImageResource(R.drawable.item_solar_crest);
                popularItems9.setImageResource(R.drawable.item_vladmirs_offering);
                popularItems10.setImageResource(R.drawable.item_quelling_blade);
                popularItems11.setImageResource(R.drawable.item_abyssal_blade);
                popularItems12.setImageResource(R.drawable.item_sange_and_yasha);

                startingItems1OnClick = "healing_salve";
                startingItems2OnClick = "tango";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "ring_of_protection";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "vladmirs_offering";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "helm_of_the_dominator";

                lateGame1OnClick = "assault_cuirass";
                lateGame2OnClick = "desolator";
                lateGame3OnClick = "black_king_bar";

                popularItems1OnClick = "power_treads";
                popularItems2OnClick = "mask_of_madness";
                popularItems3OnClick = "armlet_of_mordiggian";
                popularItems4OnClick = "black_king_bar";
                popularItems5OnClick = "desolator";
                popularItems6OnClick = "assault_cuirass";
                popularItems7OnClick = "echo_sabre";
                popularItems8OnClick = "solar_crest";
                popularItems9OnClick = "vladmirs_offering";
                popularItems10OnClick = "quelling_blade";
                popularItems11OnClick = "abyssal_blade";
                popularItems12OnClick = "sange_and_yasha";
                break;


            case "Magnus":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_bottle);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_magic_stick);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_arcane_boots);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_force_staff);
                lateGame2.setImageResource(R.drawable.item_refresher_orb);
                lateGame3.setImageResource(R.drawable.item_shivas_guard);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_blink_dagger);
                popularItems2.setImageResource(R.drawable.item_arcane_boots);
                popularItems3.setImageResource(R.drawable.item_force_staff);
                popularItems4.setImageResource(R.drawable.item_shadowblade);
                popularItems5.setImageResource(R.drawable.item_hand_of_midas);
                popularItems6.setImageResource(R.drawable.item_shivas_guard);
                popularItems7.setImageResource(R.drawable.item_magic_wand);
                popularItems8.setImageResource(R.drawable.item_black_king_bar);
                popularItems9.setImageResource(R.drawable.item_refresher_orb);
                popularItems10.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems11.setImageResource(R.drawable.item_echo_sabre);
                popularItems12.setImageResource(R.drawable.item_euls_scepter_of_divinity);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "iron_branch";

                earlyGame1OnClick = "bottle";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "magic_stick";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "arcane_boots";
                midGame3OnClick = "blink_dagger";

                lateGame1OnClick = "force_staff";
                lateGame2OnClick = "refresher_orb";
                lateGame3OnClick = "shivas_guard";

                popularItems1OnClick = "blink_dagger";
                popularItems2OnClick = "arcane_boots";
                popularItems3OnClick = "force_staff";
                popularItems4OnClick = "shadow_blade";
                popularItems5OnClick = "hand_of_midas";
                popularItems6OnClick = "shivas_guard";
                popularItems7OnClick = "magic_wand";
                popularItems8OnClick = "black_king_bar";
                popularItems9OnClick = "refresher_orb";
                popularItems10OnClick = "aghanims_scepter";
                popularItems11OnClick = "echo_sabre";
                popularItems12OnClick = "euls_scepter_of_divinity";
                break;


            case "Mars":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_enchanted_mango);
                startingItems4.setImageResource(R.drawable.item_healing_salve);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_bracer);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_phase_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_black_king_bar);
                lateGame2.setImageResource(R.drawable.item_radiance);
                lateGame3.setImageResource(R.drawable.item_shivas_guard);
                lateGame4.setImageResource(R.drawable.item_daedalus);

                popularItems1.setImageResource(R.drawable.item_blink_dagger);
                popularItems2.setImageResource(R.drawable.item_phase_boots);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_radiance);
                popularItems5.setImageResource(R.drawable.item_daedalus);
                popularItems6.setImageResource(R.drawable.item_shivas_guard);
                popularItems7.setImageResource(R.drawable.item_black_king_bar);
                popularItems8.setImageResource(R.drawable.item_assault_cuirass);
                popularItems9.setImageResource(R.drawable.item_mjollnir);
                popularItems10.setImageResource(R.drawable.item_crimson_guard);
                popularItems11.setImageResource(R.drawable.item_heart_of_tarrasque);
                popularItems12.setImageResource(R.drawable.item_pipe_of_insight);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "enchanted_mango";
                startingItems4OnClick = "healing_salve";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "bracer";

                midGame1OnClick = "phase_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "blink_dagger";

                lateGame1OnClick = "black_king_bar";
                lateGame2OnClick = "radiance";
                lateGame3OnClick = "shivas_guard";
                lateGame4OnClick = "daedalus";

                popularItems1OnClick = "blink_dagger";
                popularItems2OnClick = "phase_boots";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "radiance";
                popularItems5OnClick = "daedalus";
                popularItems6OnClick = "shivas_guard";
                popularItems7OnClick = "black_king_bar";
                popularItems8OnClick = "assault_cuirass";
                popularItems9OnClick = "mjolnir";
                popularItems10OnClick = "crimson_guard";
                popularItems11OnClick = "heart_of_tarrasque";
                popularItems12OnClick = "pipe_of_insight";
                break;


            case "Night Stalker":
                startingItems1.setImageResource(R.drawable.item_ironwood_branch);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_tango);
                startingItems4.setImageResource(R.drawable.item_enchanted_mango);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_urn_of_shadows);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_phase_boots);
                midGame3.setImageResource(R.drawable.item_armlet_of_mordiggian);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_assault_cuirass);
                lateGame2.setImageResource(R.drawable.item_abyssal_blade);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_phase_boots);
                popularItems2.setImageResource(R.drawable.item_armlet_of_mordiggian);
                popularItems3.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems4.setImageResource(R.drawable.item_hand_of_midas);
                popularItems5.setImageResource(R.drawable.item_magic_wand);
                popularItems6.setImageResource(R.drawable.item_abyssal_blade);
                popularItems7.setImageResource(R.drawable.item_solar_crest);
                popularItems8.setImageResource(R.drawable.item_black_king_bar);
                popularItems9.setImageResource(R.drawable.item_quelling_blade);
                popularItems10.setImageResource(R.drawable.item_boots_of_speed);
                popularItems11.setImageResource(R.drawable.item_orb_of_venom);
                popularItems12.setImageResource(R.drawable.item_heavens_halberd);

                startingItems1OnClick = "iron_branch";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "tango";
                startingItems4OnClick = "enchanted_mango";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "urn_of_shadows";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "phase_boots";
                midGame3OnClick = "aghanims_scepter";

                lateGame1OnClick = "assault_cuirass";
                lateGame2OnClick = "abyssal_blade";


                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "aghanims_scepter";
                popularItems3OnClick = "urn_of_shadows";
                popularItems4OnClick = "hand_of_midas";
                popularItems5OnClick = "magic_wand";
                popularItems6OnClick = "abyssal_blade";
                popularItems7OnClick = "solar_crest";
                popularItems8OnClick = "black_king_bar";
                popularItems9OnClick = "quelling_blade";
                popularItems10OnClick = "boots_of_speed";
                popularItems11OnClick = "orb_of_venom";
                popularItems12OnClick = "heavens_halberd";
                break;


            case "Omniknight":
                startingItems1.setImageResource(R.drawable.item_clarity);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_tango);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_soul_ring);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_magic_stick);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_arcane_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aether_lens);
                lateGame2.setImageResource(R.drawable.item_force_staff);
                lateGame3.setImageResource(R.drawable.item_ghost_scepter);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_hand_of_midas);
                popularItems2.setImageResource(R.drawable.item_guardian_greaves);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_arcane_boots);
                popularItems5.setImageResource(R.drawable.item_soul_ring);
                popularItems6.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems7.setImageResource(R.drawable.item_force_staff);
                popularItems8.setImageResource(R.drawable.item_solar_crest);
                popularItems9.setImageResource(R.drawable.item_wind_lace);
                popularItems10.setImageResource(R.drawable.item_blink_dagger);
                popularItems11.setImageResource(R.drawable.item_aether_lens);
                popularItems12.setImageResource(R.drawable.item_orb_of_venom);

                startingItems1OnClick = "clarity";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "tango";

                earlyGame1OnClick = "soul_ring";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "magic_stick";

                midGame1OnClick = "arcane_boots";
                midGame2OnClick = "magic_wand";

                lateGame1OnClick = "aether_lens";
                lateGame2OnClick = "force_staff";
                lateGame3OnClick = "ghost_scepter";

                popularItems1OnClick = "hand_of_midas";
                popularItems2OnClick = "guardian_greaves";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "arcane_boots";
                popularItems5OnClick = "soul_ring";
                popularItems6OnClick = "aghanims_scepter";
                popularItems7OnClick = "force_staff";
                popularItems8OnClick = "solar_crest";
                popularItems9OnClick = "wind_lace";
                popularItems10OnClick = "blink_dagger";
                popularItems11OnClick = "aether_lens";
                popularItems12OnClick = "orb_of_venom";
                break;


            case "Phoenix":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_wind_lace);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_tranquil_boots);
                earlyGame3.setImageResource(R.drawable.item_urn_of_shadows);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                midGame3.setImageResource(R.drawable.item_veil_of_discord);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_shivas_guard);
                lateGame2.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_tranquil_boots);
                popularItems2.setImageResource(R.drawable.item_hand_of_midas);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems5.setImageResource(R.drawable.item_veil_of_discord);
                popularItems6.setImageResource(R.drawable.item_shivas_guard);
                popularItems7.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems8.setImageResource(R.drawable.item_lotus_orb);
                popularItems9.setImageResource(R.drawable.item_platemail);
                popularItems10.setImageResource(R.drawable.item_rod_of_atos);
                popularItems11.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems12.setImageResource(R.drawable.item_heavens_halberd);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "wind_lace";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "tranquil_boots";
                earlyGame3OnClick = "urn_of_shadows";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "euls_scepter_of_divinity";
                midGame3OnClick = "veil_of_discord";

                lateGame1OnClick = "shivas_guard";
                lateGame2OnClick = "aghanims_scepter";

                popularItems1OnClick = "tranquil_boots";
                popularItems2OnClick = "hand_of_midas";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "urn_of_shadows";
                popularItems5OnClick = "veil_of_discord";
                popularItems6OnClick = "shivas_guard";
                popularItems7OnClick = "euls_scepter_of_divinity";
                popularItems8OnClick = "lotus_orb";
                popularItems9OnClick = "platemail";
                popularItems10OnClick = "rod_of_atos";
                popularItems11OnClick = "aghanims_scepter";
                popularItems12OnClick = "heavens_halberd";
                break;


            case "Pudge":
                startingItems1.setImageResource(R.drawable.item_wind_lace);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_tango);
                startingItems4.setImageResource(R.drawable.item_enchanted_mango);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_tranquil_boots);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_aether_lens);
                midGame3.setImageResource(R.drawable.item_hood_of_defiance);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_blink_dagger);
                lateGame2.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame3.setImageResource(R.drawable.item_pipe_of_insight);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_tranquil_boots);
                popularItems2.setImageResource(R.drawable.item_magic_wand);
                popularItems3.setImageResource(R.drawable.item_aether_lens);
                popularItems4.setImageResource(R.drawable.item_force_staff);
                popularItems5.setImageResource(R.drawable.item_blade_mail);
                popularItems6.setImageResource(R.drawable.item_blink_dagger);
                popularItems7.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems8.setImageResource(R.drawable.item_hood_of_defiance);
                popularItems9.setImageResource(R.drawable.item_ghost_scepter);
                popularItems10.setImageResource(R.drawable.item_soul_ring);
                popularItems11.setImageResource(R.drawable.item_rod_of_atos);
                popularItems12.setImageResource(R.drawable.item_wind_lace);

                startingItems1OnClick = "wind_lace";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "tango";
                startingItems4OnClick = "enchanted_mango";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "tranquil_boots";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "aether_lens";
                midGame3OnClick = "hood_of_defiance";

                lateGame1OnClick = "blink_dagger";
                lateGame2OnClick = "aghanims_scepter";
                lateGame3OnClick = "pipe_of_insight";

                popularItems1OnClick = "tranquil_boots";
                popularItems2OnClick = "magic_wand";
                popularItems3OnClick = "aether_lens";
                popularItems4OnClick = "force_staff";
                popularItems5OnClick = "blade_mail";
                popularItems6OnClick = "blink_dagger";
                popularItems7OnClick = "urn_of_shadows";
                popularItems8OnClick = "hood_of_defiance";
                popularItems9OnClick = "ghost_scepter";
                popularItems10OnClick = "soul_ring";
                popularItems11OnClick = "rod_of_atos";
                popularItems12OnClick = "wind_lace";
                break;


            case "Sand King":
                startingItems1.setImageResource(R.drawable.item_ironwood_branch);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setImageResource(R.drawable.item_healing_salve);
                startingItems4.setImageResource(R.drawable.item_enchanted_mango);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_arcane_boots);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_force_staff);
                lateGame2.setImageResource(R.drawable.item_veil_of_discord);
                lateGame3.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_blink_dagger);
                popularItems2.setImageResource(R.drawable.item_tranquil_boots);
                popularItems3.setImageResource(R.drawable.item_force_staff);
                popularItems4.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems5.setImageResource(R.drawable.item_magic_wand);
                popularItems6.setImageResource(R.drawable.item_arcane_boots);
                popularItems7.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems8.setImageResource(R.drawable.item_black_king_bar);
                popularItems9.setImageResource(R.drawable.item_boots_of_travel);
                popularItems10.setImageResource(R.drawable.item_lotus_orb);
                popularItems11.setImageResource(R.drawable.item_aether_lens);
                popularItems12.setImageResource(R.drawable.item_veil_of_discord);

                startingItems1OnClick = "iron_branch";
                startingItems2OnClick = "tango";
                startingItems3OnClick = "healing_salve";
                startingItems4OnClick = "enchanted_mango";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "arcane_boots";
                midGame3OnClick = "blink_dagger";

                lateGame1OnClick = "force_staff";
                lateGame2OnClick = "veil_of_discord";
                lateGame3OnClick = "aghanims_scepter";

                popularItems1OnClick = "blink_dagger";
                popularItems2OnClick = "tranquil_boots";
                popularItems3OnClick = "force_staff";
                popularItems4OnClick = "euls_scepter_of_divinity";
                popularItems5OnClick = "magic_wand";
                popularItems6OnClick = "arcane_boots";
                popularItems7OnClick = "aghanims_scepter";
                popularItems8OnClick = "black_king_bar";
                popularItems9OnClick = "boots_of_travel";
                popularItems10OnClick = "lotus_orb";
                popularItems11OnClick = "aether_lens";
                popularItems12OnClick = "veil_of_discord";
                break;


            case "Sladar":
                startingItems1.setImageResource(R.drawable.item_ironwood_branch);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_tango);
                startingItems4.setImageResource(R.drawable.item_enchanted_mango);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_armlet_of_mordiggian);
                lateGame2.setImageResource(R.drawable.item_solar_crest);
                lateGame3.setImageResource(R.drawable.item_assault_cuirass);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_blink_dagger);
                popularItems2.setImageResource(R.drawable.item_tranquil_boots);
                popularItems3.setImageResource(R.drawable.item_force_staff);
                popularItems4.setImageResource(R.drawable.item_magic_wand);
                popularItems5.setImageResource(R.drawable.item_solar_crest);
                popularItems6.setImageResource(R.drawable.item_hand_of_midas);
                popularItems7.setImageResource(R.drawable.item_power_treads);
                popularItems8.setImageResource(R.drawable.item_black_king_bar);
                popularItems9.setImageResource(R.drawable.item_ironwood_branch);
                popularItems10.setImageResource(R.drawable.item_magic_stick);
                popularItems11.setImageResource(R.drawable.item_assault_cuirass);
                popularItems12.setImageResource(R.drawable.item_shadowblade);

                startingItems1OnClick = "iron_branch";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "tango";
                startingItems4OnClick = "enchanted_mango";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "blink_dagger";

                lateGame1OnClick = "armlet_of_mordiggian";
                lateGame2OnClick = "solar_crest";
                lateGame3OnClick = "assault_cuirass";

                popularItems1OnClick = "blink_dagger";
                popularItems2OnClick = "tranquil_boots";
                popularItems3OnClick = "force_staff";
                popularItems4OnClick = "magic_wand";
                popularItems5OnClick = "solar_crest";
                popularItems6OnClick = "hand_of_midas";
                popularItems7OnClick = "power_treads";
                popularItems8OnClick = "black_king_bar";
                popularItems9OnClick = "iron_branch";
                popularItems10OnClick = "magic_stick";
                popularItems11OnClick = "assault_cuirass";
                popularItems12OnClick = "shadow_blade";

                break;


            case "Snapfire":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_gauntlets_of_strength);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_bracer);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_arcane_boots);
                midGame3.setImageResource(R.drawable.item_rod_of_atos);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_heavens_halberd);
                lateGame2.setImageResource(R.drawable.item_glimmer_cape);
                lateGame3.setImageResource(R.drawable.item_guardian_greaves);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_guardian_greaves);
                popularItems2.setImageResource(R.drawable.item_force_staff);
                popularItems3.setImageResource(R.drawable.item_rod_of_atos);
                popularItems4.setImageResource(R.drawable.item_magic_wand);
                popularItems5.setImageResource(R.drawable.item_heavens_halberd);
                popularItems6.setImageResource(R.drawable.item_glimmer_cape);
                popularItems7.setImageResource(R.drawable.item_power_treads);
                popularItems8.setImageResource(R.drawable.item_scythe_of_vyse);
                popularItems9.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems10.setImageResource(R.drawable.item_magic_stick);
                popularItems11.setImageResource(R.drawable.item_pipe_of_insight);
                popularItems12.setImageResource(R.drawable.item_mjollnir);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "gauntlets_of_strength";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "bracer";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "arcane_boots";
                midGame3OnClick = "rod_of_atos";

                lateGame1OnClick = "heavens_halberd";
                lateGame2OnClick = "glimmer_cape";
                lateGame3OnClick = "guardian_greaves";

                popularItems1OnClick = "guardian_greaves";
                popularItems2OnClick = "force_staff";
                popularItems3OnClick = "rod_of_atos";
                popularItems4OnClick = "magic_wand";
                popularItems5OnClick = "heavens_halberd";
                popularItems6OnClick = "glimmer_cape";
                popularItems7OnClick = "power_treads";
                popularItems8OnClick = "scythe_of_vyse";
                popularItems9OnClick = "aghanims_scepter";
                popularItems10OnClick = "magic_stick";
                popularItems11OnClick = "pipe_of_insight";
                popularItems12OnClick = "mjolnir";

                break;


            case "Spirit Breaker":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_urn_of_shadows);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_echo_sabre);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_silver_edge);
                lateGame2.setImageResource(R.drawable.item_assault_cuirass);
                lateGame3.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_power_treads);
                popularItems2.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems3.setImageResource(R.drawable.item_orb_of_venom);
                popularItems4.setImageResource(R.drawable.item_magic_wand);
                popularItems5.setImageResource(R.drawable.item_blade_mail);
                popularItems6.setImageResource(R.drawable.item_hand_of_midas);
                popularItems7.setImageResource(R.drawable.item_shadowblade);
                popularItems8.setImageResource(R.drawable.item_black_king_bar);
                popularItems9.setImageResource(R.drawable.item_boots_of_speed);
                popularItems10.setImageResource(R.drawable.item_ironwood_branch);
                popularItems11.setImageResource(R.drawable.item_echo_sabre);
                popularItems12.setImageResource(R.drawable.item_heavens_halberd);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "urn_of_shadows";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "echo_sabre";

                lateGame1OnClick = "silver_edge";
                lateGame2OnClick = "assault_cuirass";
                lateGame3OnClick = "aghanims_scepter";

                popularItems1OnClick = "power_treads";
                popularItems2OnClick = "urn_of_shadows";
                popularItems3OnClick = "orb_of_venom";
                popularItems4OnClick = "magic_wand";
                popularItems5OnClick = "blade_mail";
                popularItems6OnClick = "hand_of_midas";
                popularItems7OnClick = "shadow_blade";
                popularItems8OnClick = "black_king_bar";
                popularItems9OnClick = "boots_of_speed";
                popularItems10OnClick = "iron_branch";
                popularItems11OnClick = "echo_sabre";
                popularItems12OnClick = "heavens_halberd";
                break;


            case "Sven":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_enchanted_mango);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_echo_sabre);
                midGame4.setImageResource(R.drawable.item_mask_of_madness);

                lateGame1.setImageResource(R.drawable.item_blink_dagger);
                lateGame2.setImageResource(R.drawable.item_daedalus);
                lateGame3.setImageResource(R.drawable.item_black_king_bar);
                lateGame4.setImageResource(R.drawable.item_satanic);

                popularItems1.setImageResource(R.drawable.item_power_treads);
                popularItems2.setImageResource(R.drawable.item_blink_dagger);
                popularItems3.setImageResource(R.drawable.item_mask_of_madness);
                popularItems4.setImageResource(R.drawable.item_black_king_bar);
                popularItems5.setImageResource(R.drawable.item_kaya_and_sange);
                popularItems6.setImageResource(R.drawable.item_echo_sabre);
                popularItems7.setImageResource(R.drawable.item_daedalus);
                popularItems8.setImageResource(R.drawable.item_assault_cuirass);
                popularItems9.setImageResource(R.drawable.item_bloodthorn);
                popularItems10.setImageResource(R.drawable.item_quelling_blade);
                popularItems11.setImageResource(R.drawable.item_boots_of_travel);
                popularItems12.setImageResource(R.drawable.item_crystalys);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "enchanted_mango";
                startingItems4OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "echo_sabre";
                midGame4OnClick = "mask_of_madness";

                lateGame1OnClick = "blink_dagger";
                lateGame2OnClick = "daedalus";
                lateGame3OnClick = "black_king_bar";
                lateGame4OnClick = "satanic";

                popularItems1OnClick = "power_treads";
                popularItems2OnClick = "blink_dagger";
                popularItems3OnClick = "mask_of_madness";
                popularItems4OnClick = "black_king_bar";
                popularItems5OnClick = "sange_and_yasha";
                popularItems6OnClick = "echo_sabre";
                popularItems7OnClick = "daedalus";
                popularItems8OnClick = "assault_cuirass";
                popularItems9OnClick = "bloodthorn";
                popularItems10OnClick = "quelling_blade";
                popularItems11OnClick = "boots_of_travel";
                popularItems12OnClick = "crystalys";

                break;


            case "Tidehunter":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_enchanted_mango);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_arcane_boots);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_mekansm);
                lateGame2.setImageResource(R.drawable.item_refresher_orb);
                lateGame3.setImageResource(R.drawable.item_shivas_guard);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_blink_dagger);
                popularItems2.setImageResource(R.drawable.item_guardian_greaves);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_arcane_boots);
                popularItems5.setImageResource(R.drawable.item_quelling_blade);
                popularItems6.setImageResource(R.drawable.item_pipe_of_insight);
                popularItems7.setImageResource(R.drawable.item_mekansm);
                popularItems8.setImageResource(R.drawable.item_force_staff);
                popularItems9.setImageResource(R.drawable.item_refresher_orb);
                popularItems10.setImageResource(R.drawable.item_shivas_guard);
                popularItems11.setImageResource(R.drawable.item_hood_of_defiance);
                popularItems12.setImageResource(R.drawable.item_magic_stick);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "enchanted_mango";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "arcane_boots";
                midGame3OnClick = "blink_dagger";

                lateGame1OnClick = "mekansm";
                lateGame2OnClick = "refresher_orb";
                lateGame3OnClick = "shivas_guard";

                popularItems1OnClick = "blink_dagger";
                popularItems2OnClick = "guardian_greaves";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "arcane_boots";
                popularItems5OnClick = "quelling_blade";
                popularItems6OnClick = "pipe_of_insight";
                popularItems7OnClick = "mekansm";
                popularItems8OnClick = "force_staff";
                popularItems9OnClick = "refresher_orb";
                popularItems10OnClick = "shivas_guard";
                popularItems11OnClick = "hood_of_defiance";
                popularItems12OnClick = "magic_stick";

                break;


            case "Timbersaw":
                startingItems1.setImageResource(R.drawable.item_ironwood_branch);
                startingItems2.setImageResource(R.drawable.item_enchanted_mango);
                startingItems3.setImageResource(R.drawable.item_tango);
                startingItems4.setImageResource(R.drawable.item_healing_salve);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_soul_ring);
                earlyGame2.setImageResource(R.drawable.item_arcane_boots);
                earlyGame3.setImageResource(R.drawable.item_magic_wand);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_bloodstone);
                midGame2.setImageResource(R.drawable.item_shivas_guard);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame2.setImageResource(R.drawable.item_octarine_core);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_bloodstone);
                popularItems2.setImageResource(R.drawable.item_boots_of_speed);
                popularItems3.setImageResource(R.drawable.item_hood_of_defiance);
                popularItems4.setImageResource(R.drawable.item_boots_of_travel);
                popularItems5.setImageResource(R.drawable.item_crimson_guard);
                popularItems6.setImageResource(R.drawable.item_magic_wand);
                popularItems7.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems8.setImageResource(R.drawable.item_lotus_orb);
                popularItems9.setImageResource(R.drawable.item_shivas_guard);
                popularItems10.setImageResource(R.drawable.item_arcane_boots);
                popularItems11.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems12.setImageResource(R.drawable.item_blink_dagger);

                startingItems1OnClick = "iron_branch";
                startingItems2OnClick = "enchanted_mango";
                startingItems3OnClick = "tango";
                startingItems4OnClick = "healing_salve";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "soul_ring";
                earlyGame2OnClick = "arcane_boots";
                earlyGame3OnClick = "magic_wand";

                midGame1OnClick = "bloodstone";
                midGame2OnClick = "shivas_guard";

                lateGame1OnClick = "aghanims_scepter";
                lateGame2OnClick = "octarine_core";

                popularItems1OnClick = "bloodstone";
                popularItems2OnClick = "boots_of_speed";
                popularItems3OnClick = "hood_of_defiance";
                popularItems4OnClick = "boots_of_travel";
                popularItems5OnClick = "crimson_guard";
                popularItems6OnClick = "magic_wand";
                popularItems7OnClick = "euls_scepter_of_divinity";
                popularItems8OnClick = "lotus_orb";
                popularItems9OnClick = "shivas_guard";
                popularItems10OnClick = "arcane_boots";
                popularItems11OnClick = "aghanims_scepter";
                popularItems12OnClick = "blink_dagger";
                break;


            case "Tiny":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_enchanted_mango);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_echo_sabre);
                midGame4.setImageResource(R.drawable.item_blink_dagger);

                lateGame1.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame2.setImageResource(R.drawable.item_assault_cuirass);
                lateGame3.setImageResource(R.drawable.item_daedalus);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_blink_dagger);
                popularItems2.setImageResource(R.drawable.item_echo_sabre);
                popularItems3.setImageResource(R.drawable.item_power_treads);
                popularItems4.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems5.setImageResource(R.drawable.item_shadowblade);
                popularItems6.setImageResource(R.drawable.item_magic_wand);
                popularItems7.setImageResource(R.drawable.item_bottle);
                popularItems8.setImageResource(R.drawable.item_arcane_boots);
                popularItems9.setImageResource(R.drawable.item_black_king_bar);
                popularItems10.setImageResource(R.drawable.item_phase_boots);
                popularItems11.setImageResource(R.drawable.item_silver_edge);
                popularItems12.setImageResource(R.drawable.item_boots_of_travel);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "enchanted_mango";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "echo_sabre";
                midGame4OnClick = "blink_dagger";

                lateGame1OnClick = "aghanims_scepter";
                lateGame2OnClick = "assault_cuirass";
                lateGame3OnClick = "daedalus";

                popularItems1OnClick = "blink_dagger";
                popularItems2OnClick = "echo_sabre";
                popularItems3OnClick = "power_treads";
                popularItems4OnClick = "aghanims_scepter";
                popularItems5OnClick = "shadow_blade";
                popularItems6OnClick = "magic_wand";
                popularItems7OnClick = "bottle";
                popularItems8OnClick = "arcane_boots";
                popularItems9OnClick = "black_king_bar";
                popularItems10OnClick = "phase_boots";
                popularItems11OnClick = "silver_edge";
                popularItems12OnClick = "boots_of_travel";
                break;


            case "Treant Protector":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_clarity);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_arcane_boots);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                lateGame2.setImageResource(R.drawable.item_blink_dagger);
                lateGame3.setImageResource(R.drawable.item_refresher_orb);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_tranquil_boots);
                popularItems2.setImageResource(R.drawable.item_blink_dagger);
                popularItems3.setImageResource(R.drawable.item_orb_of_venom);
                popularItems4.setImageResource(R.drawable.item_solar_crest);
                popularItems5.setImageResource(R.drawable.item_hand_of_midas);
                popularItems6.setImageResource(R.drawable.item_magic_wand);
                popularItems7.setImageResource(R.drawable.item_arcane_boots);
                popularItems8.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems9.setImageResource(R.drawable.item_wind_lace);
                popularItems10.setImageResource(R.drawable.item_boots_of_speed);
                popularItems11.setImageResource(R.drawable.item_medallion_of_courage);
                popularItems12.setImageResource(R.drawable.item_quelling_blade);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "clarity";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "arcane_boots";

                lateGame1OnClick = "euls_scepter_of_divinity";
                lateGame2OnClick = "blink_dagger";
                lateGame3OnClick = "refresher_orb";

                popularItems1OnClick = "tranquil_boots";
                popularItems2OnClick = "blink_dagger";
                popularItems3OnClick = "orb_of_venom";
                popularItems4OnClick = "solar_crest";
                popularItems5OnClick = "hand_of_midas";
                popularItems6OnClick = "magic_wand";
                popularItems7OnClick = "arcane_boots";
                popularItems8OnClick = "aghanims_scepter";
                popularItems9OnClick = "wind_lace";
                popularItems10OnClick = "boots_of_speed";
                popularItems11OnClick = "medallion_of_courage";
                popularItems12OnClick = "quelling_blade";
                break;


            case "Tusk":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_wand);
                earlyGame3.setImageResource(R.drawable.item_wind_lace);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_arcane_boots);
                midGame2.setImageResource(R.drawable.item_mekansm);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_blink_dagger);
                lateGame2.setImageResource(R.drawable.item_solar_crest);
                lateGame3.setImageResource(R.drawable.item_force_staff);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_magic_wand);
                popularItems2.setImageResource(R.drawable.item_blink_dagger);
                popularItems3.setImageResource(R.drawable.item_arcane_boots);
                popularItems4.setImageResource(R.drawable.item_solar_crest);
                popularItems5.setImageResource(R.drawable.item_orb_of_venom);
                popularItems6.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems7.setImageResource(R.drawable.item_phase_boots);
                popularItems8.setImageResource(R.drawable.item_wind_lace);
                popularItems9.setImageResource(R.drawable.item_boots_of_speed);
                popularItems10.setImageResource(R.drawable.item_tranquil_boots);
                popularItems11.setImageResource(R.drawable.item_guardian_greaves);
                popularItems12.setImageResource(R.drawable.item_force_staff);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "clarity";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_wand";
                earlyGame3OnClick = "wind_lace";

                midGame1OnClick = "arcane_boots";
                midGame2OnClick = "mekansm";

                lateGame1OnClick = "blink_dagger";
                lateGame2OnClick = "solar_crest";
                lateGame3OnClick = "force_staff";

                popularItems1OnClick = "magic_wand";
                popularItems2OnClick = "blink_dagger";
                popularItems3OnClick = "arcane_boots";
                popularItems4OnClick = "solar_crest";
                popularItems5OnClick = "orb_of_venom";
                popularItems6OnClick = "urn_of_shadows";
                popularItems7OnClick = "phase_boots";
                popularItems8OnClick = "wind_lace";
                popularItems9OnClick = "boots_of_speed";
                popularItems10OnClick = "tranquil_boots";
                popularItems11OnClick = "guardian_greaves";
                popularItems12OnClick = "force_staff";

                break;


            case "Underlord":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_circlet);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_headdress);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_arcane_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_mekansm);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_blink_dagger);
                lateGame2.setImageResource(R.drawable.item_guardian_greaves);
                lateGame3.setImageResource(R.drawable.item_shivas_guard);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_guardian_greaves);
                popularItems2.setImageResource(R.drawable.item_pipe_of_insight);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_boots_of_travel);
                popularItems5.setImageResource(R.drawable.item_arcane_boots);
                popularItems6.setImageResource(R.drawable.item_mekansm);
                popularItems7.setImageResource(R.drawable.item_blade_mail);
                popularItems8.setImageResource(R.drawable.item_rod_of_atos);
                popularItems9.setImageResource(R.drawable.item_ironwood_branch);
                popularItems10.setImageResource(R.drawable.item_crimson_guard);
                popularItems11.setImageResource(R.drawable.item_force_staff);
                popularItems12.setImageResource(R.drawable.item_shivas_guard);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "circlet";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "headdress";

                midGame1OnClick = "arcane_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "mekansm";

                lateGame1OnClick = "blink_dagger";
                lateGame2OnClick = "guardian_greaves";
                lateGame3OnClick = "shivas_guard";

                popularItems1OnClick = "guardian_greaves";
                popularItems2OnClick = "pipe_of_insight";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "boots_of_travel";
                popularItems5OnClick = "arcane_boots";
                popularItems6OnClick = "mekansm";
                popularItems7OnClick = "blade_mail";
                popularItems8OnClick = "rod_of_atos";
                popularItems9OnClick = "iron_branch";
                popularItems10OnClick = "crimson_guard";
                popularItems11OnClick = "force_staff";
                popularItems12OnClick = "shivas_guard";
                break;


            case "Undying":
                startingItems1.setImageResource(R.drawable.item_ironwood_branch);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_enchanted_mango);
                startingItems5.setImageResource(R.drawable.item_tango);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_ring_of_basilius);
                earlyGame3.setImageResource(R.drawable.item_magic_stick);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_arcane_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_mekansm);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                lateGame2.setImageResource(R.drawable.item_glimmer_cape);
                lateGame3.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_magic_wand);
                popularItems2.setImageResource(R.drawable.item_arcane_boots);
                popularItems3.setImageResource(R.drawable.item_guardian_greaves);
                popularItems4.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems5.setImageResource(R.drawable.item_ironwood_branch);
                popularItems6.setImageResource(R.drawable.item_hand_of_midas);
                popularItems7.setImageResource(R.drawable.item_glimmer_cape);
                popularItems8.setImageResource(R.drawable.item_pipe_of_insight);
                popularItems9.setImageResource(R.drawable.item_blade_mail);
                popularItems10.setImageResource(R.drawable.item_mekansm);
                popularItems11.setImageResource(R.drawable.item_boots_of_speed);
                popularItems12.setImageResource(R.drawable.item_solar_crest);

                startingItems1OnClick = "iron_branch";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "enchanted_mango";
                startingItems5OnClick = "tango";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "ring_of_basilius";
                earlyGame3OnClick = "magic_stick";

                midGame1OnClick = "arcane_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "mekansm";

                lateGame1OnClick = "euls_scepter_of_divinity";
                lateGame2OnClick = "glimmer_cape";
                lateGame3OnClick = "aghanims_scepter";

                popularItems1OnClick = "magic_wand";
                popularItems2OnClick = "arcane_boots";
                popularItems3OnClick = "guardian_greaves";
                popularItems4OnClick = "aghanims_scepter";
                popularItems5OnClick = "iron_branch";
                popularItems6OnClick = "hand_of_midas";
                popularItems7OnClick = "glimmer_cape";
                popularItems8OnClick = "pipe_of_insight";
                popularItems9OnClick = "blade_mail";
                popularItems10OnClick = "mekansm";
                popularItems11OnClick = "boots_of_speed";
                popularItems12OnClick = "solar_crest";
                break;


            case "Wisp":
                startingItems1.setImageResource(R.drawable.item_gauntlets_of_strength);
                startingItems2.setImageResource(R.drawable.item_gauntlets_of_strength);
                startingItems3.setImageResource(R.drawable.item_tango);
                startingItems4.setImageResource(R.drawable.item_healing_salve);
                startingItems5.setImageResource(R.drawable.item_clarity);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_bottle);
                earlyGame2.setImageResource(R.drawable.item_urn_of_shadows);
                earlyGame3.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame4.setImageResource(R.drawable.item_magic_stick);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_arcane_boots);
                midGame3.setImageResource(R.drawable.item_mekansm);
                midGame4.setImageResource(R.drawable.item_town_portal_scroll);

                lateGame1.setImageResource(R.drawable.item_glimmer_cape);
                lateGame2.setImageResource(R.drawable.item_ghost_scepter);
                lateGame3.setImageResource(R.drawable.item_force_staff);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_bottle);
                popularItems2.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_glimmer_cape);
                popularItems5.setImageResource(R.drawable.item_mekansm);
                popularItems6.setImageResource(R.drawable.item_arcane_boots);
                popularItems7.setImageResource(R.drawable.item_boots_of_speed);
                popularItems8.setImageResource(R.drawable.item_tranquil_boots);
                popularItems9.setImageResource(R.drawable.item_ghost_scepter);
                popularItems10.setImageResource(R.drawable.item_guardian_greaves);
                popularItems11.setImageResource(R.drawable.item_magic_stick);
                popularItems12.setImageResource(R.drawable.item_cloak);

                startingItems1OnClick = "gauntlets_of_strength";
                startingItems2OnClick = "gauntlets_of_strength";
                startingItems3OnClick = "tango";
                startingItems4OnClick = "healing_salve";
                startingItems5OnClick = "clarity";

                earlyGame1OnClick = "bottle";
                earlyGame2OnClick = "urn_of_shadows";
                earlyGame3OnClick = "boots_of_speed";
                earlyGame4OnClick = "magic_stick";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "arcane_boots";
                midGame3OnClick = "mekansm";
                midGame4OnClick = "town_portal_scroll";

                lateGame1OnClick = "glimmer_cape";
                lateGame2OnClick = "ghost_scepter";
                lateGame3OnClick = "force_staff";

                popularItems1OnClick = "bottle";
                popularItems2OnClick = "urn_of_shadows";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "glimmer_cape";
                popularItems5OnClick = "mekansm";
                popularItems6OnClick = "arcane_boots";
                popularItems7OnClick = "boots_of_speed";
                popularItems8OnClick = "tranquil_boots";
                popularItems9OnClick = "ghost_scepter";
                popularItems10OnClick = "guardian_greaves";
                popularItems11OnClick = "magic_stick";
                popularItems12OnClick = "cloak";
                break;


            case "Wraith King":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_enchanted_mango);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_quelling_blade);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_echo_sabre);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_armlet_of_mordiggian);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_blink_dagger);
                lateGame2.setImageResource(R.drawable.item_desolator);
                lateGame3.setImageResource(R.drawable.item_assault_cuirass);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_power_treads);
                popularItems2.setImageResource(R.drawable.item_blink_dagger);
                popularItems3.setImageResource(R.drawable.item_armlet_of_mordiggian);
                popularItems4.setImageResource(R.drawable.item_blade_mail);
                popularItems5.setImageResource(R.drawable.item_radiance);
                popularItems6.setImageResource(R.drawable.item_hand_of_midas);
                popularItems7.setImageResource(R.drawable.item_magic_wand);
                popularItems8.setImageResource(R.drawable.item_assault_cuirass);
                popularItems9.setImageResource(R.drawable.item_black_king_bar);
                popularItems10.setImageResource(R.drawable.item_desolator);
                popularItems11.setImageResource(R.drawable.item_mjollnir);
                popularItems12.setImageResource(R.drawable.item_quelling_blade);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "enchanted_mango";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "quelling_blade";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "echo_sabre";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "armlet_of_mordiggian";

                lateGame1OnClick = "blink_dagger";
                lateGame2OnClick = "desolator";
                lateGame3OnClick = "assault_cuirass";

                popularItems1OnClick = "power_treads";
                popularItems2OnClick = "blink_dagger";
                popularItems3OnClick = "armlet_of_mordiggian";
                popularItems4OnClick = "blade_mail";
                popularItems5OnClick = "radiance";
                popularItems6OnClick = "hand_of_midas";
                popularItems7OnClick = "magic_wand";
                popularItems8OnClick = "assault_cuirass";
                popularItems9OnClick = "black_king_bar";
                popularItems10OnClick = "desolator";
                popularItems11OnClick = "mjollnir";
                popularItems12OnClick = "quelling_blade";
                break;
        }
    }

    public void loadAgilityHeroSelection(){
        //Is used to get the heroSelected value from the previous class
        String heroSelected = getActivity().getIntent().getExtras().getString("heroSelected");



        switch(heroSelected) {
            //******************************************************************************
            //ALL OF THE SWITCH CASES FOR AGILITY HEROES
            //******************************************************************************
            case "Antimage":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_ring_of_health);
                earlyGame2.setImageResource(R.drawable.item_quelling_blade);
                earlyGame3.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_battle_fury);
                midGame3.setImageResource(R.drawable.item_vladmirs_offering);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_manta_style);
                lateGame2.setImageResource(R.drawable.item_skull_basher);
                lateGame3.setImageResource(R.drawable.item_abyssal_blade);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_battle_fury);
                popularItems2.setImageResource(R.drawable.item_power_treads);
                popularItems3.setImageResource(R.drawable.item_manta_style);
                popularItems4.setImageResource(R.drawable.item_abyssal_blade);
                popularItems5.setImageResource(R.drawable.item_assault_cuirass);
                popularItems6.setImageResource(R.drawable.item_butterfly);
                popularItems7.setImageResource(R.drawable.item_vladmirs_offering);
                popularItems8.setImageResource(R.drawable.item_black_king_bar);
                popularItems9.setImageResource(R.drawable.item_skull_basher);
                popularItems10.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems11.setImageResource(R.drawable.item_linkens_sphere);
                popularItems12.setImageResource(R.drawable.item_yasha);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "ring_of_health";
                earlyGame2OnClick = "quelling_blade";
                earlyGame3OnClick = "boots_of_speed";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "battle_fury";
                midGame3OnClick = "vladmirs_offering";

                lateGame1OnClick = "manta_style";
                lateGame2OnClick = "skull_basher";
                lateGame3OnClick = "abyssal_blade";

                popularItems1OnClick = "battle_fury";
                popularItems2OnClick = "power_treads";
                popularItems3OnClick = "manta_style";
                popularItems4OnClick = "abyssal_blade";
                popularItems5OnClick = "assault_cuirass";
                popularItems6OnClick = "butterfly";
                popularItems7OnClick = "vladmirs_offering";
                popularItems8OnClick = "black_king_bar";
                popularItems9OnClick = "skull_basher";
                popularItems10OnClick = "aghanims_scepter";
                popularItems11OnClick = "linkens_sphere";
                popularItems12OnClick = "yasha";
                break;


            case "Arc Warden":
                startingItems1.setImageResource(R.drawable.item_circlet);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setImageResource(R.drawable.item_healing_salve);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_hand_of_midas);
                earlyGame2.setImageResource(R.drawable.item_wraith_band);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_dragon_lance);
                midGame2.setImageResource(R.drawable.item_maelstrom);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_mjollnir);
                lateGame2.setImageResource(R.drawable.item_manta_style);
                lateGame3.setImageResource(R.drawable.item_hurricane_pike);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_hand_of_midas);
                popularItems2.setImageResource(R.drawable.item_boots_of_travel);
                popularItems3.setImageResource(R.drawable.item_mjollnir);
                popularItems4.setImageResource(R.drawable.item_wraith_band);
                popularItems5.setImageResource(R.drawable.item_shadowblade);
                popularItems6.setImageResource(R.drawable.item_hurricane_pike);
                popularItems7.setImageResource(R.drawable.item_maelstrom);
                popularItems8.setImageResource(R.drawable.item_bloodthorn);
                popularItems9.setImageResource(R.drawable.item_silver_edge);
                popularItems10.setImageResource(R.drawable.item_scythe_of_vyse);
                popularItems11.setImageResource(R.drawable.item_monkey_king_bar);
                popularItems12.setImageResource(R.drawable.item_dragon_lance);

                startingItems1OnClick = "circlet";
                startingItems2OnClick = "tango";
                startingItems3OnClick = "healing_salve";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "hand_of_midas";
                earlyGame2OnClick = "wraith_band";

                midGame1OnClick = "dragon_lance";
                midGame2OnClick = "maelstrom";

                lateGame1OnClick = "mjollnir";
                lateGame2OnClick = "manta_style";
                lateGame3OnClick = "hurricane_pike";

                popularItems1OnClick = "hand_of_midas";
                popularItems2OnClick = "boots_of_travel";
                popularItems3OnClick = "mjollnir";
                popularItems4OnClick = "wraith_band";
                popularItems5OnClick = "shadow_blade";
                popularItems6OnClick = "hurricane_pike";
                popularItems7OnClick = "maelstrom";
                popularItems8OnClick = "bloodthorn";
                popularItems9OnClick = "silver_edge";
                popularItems10OnClick = "scythe_of_vyse";
                popularItems11OnClick = "monkey_king_bar";
                popularItems12OnClick = "dragon_lance";
                break;


            case "Bloodseeker":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_quelling_blade);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setVisibility(View.INVISIBLE);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_kaya_and_sange);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_black_king_bar);
                lateGame2.setImageResource(R.drawable.item_mjollnir);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_phase_boots);
                popularItems2.setImageResource(R.drawable.item_blade_mail);
                popularItems3.setImageResource(R.drawable.item_hand_of_midas);
                popularItems4.setImageResource(R.drawable.item_black_king_bar);
                popularItems5.setImageResource(R.drawable.item_power_treads);
                popularItems6.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems7.setImageResource(R.drawable.item_radiance);
                popularItems8.setImageResource(R.drawable.item_force_staff);
                popularItems9.setImageResource(R.drawable.item_kaya_and_sange);
                popularItems10.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems11.setImageResource(R.drawable.item_dagon);
                popularItems12.setImageResource(R.drawable.item_silver_edge);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "quelling_blade";

                earlyGame1OnClick = "boots_of_speed";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "sange_and_yasha";

                lateGame1OnClick = "black_king_bar";
                lateGame2OnClick = "mjollnir";

                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "blade_mail";
                popularItems3OnClick = "hand_of_midas";
                popularItems4OnClick = "black_king_bar";
                popularItems5OnClick = "power_treads";
                popularItems6OnClick = "euls_scepter_of_divinity";
                popularItems7OnClick = "radiance";
                popularItems8OnClick = "force_staff";
                popularItems9OnClick = "sange_and_yasha";
                popularItems10OnClick = "aghanims_scepter";
                popularItems11OnClick = "dagon";
                popularItems12OnClick = "silver_edge";
                break;


            case "Bounty Hunter":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_observer_ward);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_orb_of_venom);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_ring_of_basilius);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_arcane_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_mekansm);
                midGame4.setImageResource(R.drawable.item_medallion_of_courage);

                lateGame1.setImageResource(R.drawable.item_guardian_greaves);
                lateGame2.setImageResource(R.drawable.item_solar_crest);
                lateGame3.setImageResource(R.drawable.item_vladmirs_offering);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_orb_of_venom);
                popularItems2.setImageResource(R.drawable.item_guardian_greaves);
                popularItems3.setImageResource(R.drawable.item_arcane_boots);
                popularItems4.setImageResource(R.drawable.item_magic_wand);
                popularItems5.setImageResource(R.drawable.item_solar_crest);
                popularItems6.setImageResource(R.drawable.item_force_staff);
                popularItems7.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems8.setImageResource(R.drawable.item_wind_lace);
                popularItems9.setImageResource(R.drawable.item_mekansm);
                popularItems10.setImageResource(R.drawable.item_quelling_blade);
                popularItems11.setImageResource(R.drawable.item_vladmirs_offering);
                popularItems12.setImageResource(R.drawable.item_dagon);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "observer_ward";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "orb_of_venom";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "ring_of_basilius";

                midGame1OnClick = "arcane_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "mekansm";
                midGame4OnClick = "medallion_of_courage";

                lateGame1OnClick = "guardian_greaves";
                lateGame2OnClick = "solar_crest";
                lateGame3OnClick = "vladmirs_offering";

                popularItems1OnClick = "orb_of_venom";
                popularItems2OnClick = "guardian_greaves";
                popularItems3OnClick = "arcane_boots";
                popularItems4OnClick = "magic_wand";
                popularItems5OnClick = "solar_crest";
                popularItems6OnClick = "force_staff";
                popularItems7OnClick = "urn_of_shadows";
                popularItems8OnClick = "wind_lace";
                popularItems9OnClick = "mekansm";
                popularItems10OnClick = "quelling_blade";
                popularItems11OnClick = "vladmirs_offering";
                popularItems12OnClick = "dagon";
                break;


            case "Broodmother":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_sages_mask);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_soul_ring);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_magic_stick);
                earlyGame4.setImageResource(R.drawable.item_ring_of_basilius);

                midGame1.setImageResource(R.drawable.item_phase_boots);
                midGame2.setImageResource(R.drawable.item_orchid_malevolence);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_black_king_bar);
                lateGame2.setImageResource(R.drawable.item_solar_crest);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_soul_ring);
                popularItems2.setImageResource(R.drawable.item_phase_boots);
                popularItems3.setImageResource(R.drawable.item_black_king_bar);
                popularItems4.setImageResource(R.drawable.item_orchid_malevolence);
                popularItems5.setImageResource(R.drawable.item_hand_of_midas);
                popularItems6.setImageResource(R.drawable.item_bloodthorn);
                popularItems7.setImageResource(R.drawable.item_power_treads);
                popularItems8.setImageResource(R.drawable.item_desolator);
                popularItems9.setImageResource(R.drawable.item_quelling_blade);
                popularItems10.setImageResource(R.drawable.item_solar_crest);
                popularItems11.setImageResource(R.drawable.item_radiance);
                popularItems12.setImageResource(R.drawable.item_echo_sabre);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "sages_mask";

                earlyGame1OnClick = "soul_ring";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "magic_stick";
                earlyGame4OnClick = "ring_of_basilius";

                midGame1OnClick = "phase_boots";
                midGame2OnClick = "orchid_malevolence";

                lateGame1OnClick = "black_king_bar";
                lateGame2OnClick = "solar_crest";

                popularItems1OnClick = "soul_ring";
                popularItems2OnClick = "phase_boots";
                popularItems3OnClick = "black_king_bar";
                popularItems4OnClick = "orchid_malevolence";
                popularItems5OnClick = "hand_of_midas";
                popularItems6OnClick = "bloodthorn";
                popularItems7OnClick = "power_treads";
                popularItems8OnClick = "desolator";
                popularItems9OnClick = "quelling_blade";
                popularItems10OnClick = "solar_crest";
                popularItems11OnClick = "radiance";
                popularItems12OnClick = "echo_sabre";
                break;


            case "Clinkz":
                startingItems1.setImageResource(R.drawable.item_healing_salve);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_faerie_fire);
                startingItems5.setImageResource(R.drawable.item_circlet);
                startingItems6.setImageResource(R.drawable.item_ring_of_protection);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_soul_ring);
                earlyGame3.setImageResource(R.drawable.item_wraith_band);
                earlyGame4.setImageResource(R.drawable.item_magic_stick);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_desolator);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_black_king_bar);
                lateGame2.setImageResource(R.drawable.item_bloodthorn);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_power_treads);
                popularItems2.setImageResource(R.drawable.item_desolator);
                popularItems3.setImageResource(R.drawable.item_wraith_band);
                popularItems4.setImageResource(R.drawable.item_soul_ring);
                popularItems5.setImageResource(R.drawable.item_black_king_bar);
                popularItems6.setImageResource(R.drawable.item_solar_crest);
                popularItems7.setImageResource(R.drawable.item_dragon_lance);
                popularItems8.setImageResource(R.drawable.item_medallion_of_courage);
                popularItems9.setImageResource(R.drawable.item_bloodthorn);
                popularItems10.setImageResource(R.drawable.item_hurricane_pike);
                popularItems11.setImageResource(R.drawable.item_orchid_malevolence);
                popularItems12.setImageResource(R.drawable.item_diffusal_blade);

                startingItems1OnClick = "healing_salve";
                startingItems2OnClick = "tango";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "faerie_fire";
                startingItems5OnClick = "circlet";
                startingItems6OnClick = "ring_of_protection";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "soul_ring";
                earlyGame3OnClick = "wraith_band";
                earlyGame4OnClick = "magic_stick";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "desolator";

                lateGame1OnClick = "black_king_bar";
                lateGame2OnClick = "bloodthorn";

                popularItems1OnClick = "power_treads";
                popularItems2OnClick = "desolator";
                popularItems3OnClick = "wraith_band";
                popularItems4OnClick = "soul_ring";
                popularItems5OnClick = "black_king_bar";
                popularItems6OnClick = "solar_crest";
                popularItems7OnClick = "dragon_lance";
                popularItems8OnClick = "medallion_of_courage";
                popularItems9OnClick = "bloodthorn";
                popularItems10OnClick = "hurricane_pike";
                popularItems11OnClick = "orchid_malevolence";
                popularItems12OnClick = "diffusal_blade";

                break;


            case "Drow Ranger":
                startingItems1.setImageResource(R.drawable.item_healing_salve);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setImageResource(R.drawable.item_slippers_of_agility);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_wraith_band);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_dragon_lance);
                midGame4.setImageResource(R.drawable.item_helm_of_the_dominator);

                lateGame1.setImageResource(R.drawable.item_shadowblade);
                lateGame2.setImageResource(R.drawable.item_hurricane_pike);
                lateGame3.setImageResource(R.drawable.item_black_king_bar);
                lateGame4.setImageResource(R.drawable.item_butterfly);

                popularItems1.setImageResource(R.drawable.item_power_treads);
                popularItems2.setImageResource(R.drawable.item_wraith_band);
                popularItems3.setImageResource(R.drawable.item_hurricane_pike);
                popularItems4.setImageResource(R.drawable.item_shadowblade);
                popularItems5.setImageResource(R.drawable.item_dragon_lance);
                popularItems6.setImageResource(R.drawable.item_magic_wand);
                popularItems7.setImageResource(R.drawable.item_manta_style);
                popularItems8.setImageResource(R.drawable.item_mask_of_madness);
                popularItems9.setImageResource(R.drawable.item_black_king_bar);
                popularItems10.setImageResource(R.drawable.item_yasha);
                popularItems11.setImageResource(R.drawable.item_silver_edge);
                popularItems12.setImageResource(R.drawable.item_wraith_band);

                startingItems1OnClick = "healing_salve";
                startingItems2OnClick = "tango";
                startingItems3OnClick = "slippers_of_agility";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "wraith_band";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "dragon_lance";
                midGame4OnClick = "helm_of_the_dominator";

                lateGame1OnClick = "shadow_blade";
                lateGame2OnClick = "hurricane_pike";
                lateGame3OnClick = "black_king_bar";
                lateGame4OnClick = "butterfly";

                popularItems1OnClick = "power_treads";
                popularItems2OnClick = "wraith_band";
                popularItems3OnClick = "hurricane_pike";
                popularItems4OnClick = "shadow_blade";
                popularItems5OnClick = "dragon_lance";
                popularItems6OnClick = "magic_wand";
                popularItems7OnClick = "manta_style";
                popularItems8OnClick = "mask_of_madness";
                popularItems9OnClick = "black_king_bar";
                popularItems10OnClick = "yasha";
                popularItems11OnClick = "silver_edge";
                popularItems12OnClick = "wraith_band";
                break;


            case "Ember Spirit":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_bottle);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_quelling_blade);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_wraith_band);
                midGame2.setImageResource(R.drawable.item_battle_fury);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_daedalus);
                lateGame2.setImageResource(R.drawable.item_blink_dagger);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_boots_of_travel);
                popularItems2.setImageResource(R.drawable.item_veil_of_discord);
                popularItems3.setImageResource(R.drawable.item_bottle);
                popularItems4.setImageResource(R.drawable.item_blink_dagger);
                popularItems5.setImageResource(R.drawable.item_maelstrom);
                popularItems6.setImageResource(R.drawable.item_wraith_band);
                popularItems7.setImageResource(R.drawable.item_linkens_sphere);
                popularItems8.setImageResource(R.drawable.item_blade_mail);
                popularItems9.setImageResource(R.drawable.item_magic_wand);
                popularItems10.setImageResource(R.drawable.item_daedalus);
                popularItems11.setImageResource(R.drawable.item_octarine_core);
                popularItems12.setImageResource(R.drawable.item_mjollnir);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";

                earlyGame1OnClick = "bottle";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "quelling_blade";

                midGame1OnClick = "wraith_band";
                midGame2OnClick = "battle_fury";

                lateGame1OnClick = "daedalus";
                lateGame2OnClick = "blink_dagger";

                popularItems1OnClick = "boots_of_travel";
                popularItems2OnClick = "veil_of_discord";
                popularItems3OnClick = "bottle";
                popularItems4OnClick = "blink_dagger";
                popularItems5OnClick = "maelstrom";
                popularItems6OnClick = "wraith_band";
                popularItems7OnClick = "linkens_sphere";
                popularItems8OnClick = "blade_mail";
                popularItems9OnClick = "magic_wand";
                popularItems10OnClick = "daedalus";
                popularItems11OnClick = "octarine_core";
                popularItems12OnClick = "mjollnir";
                break;


            case "Faceless Void":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_quelling_blade);
                earlyGame4.setImageResource(R.drawable.item_morbid_mask);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_vladmirs_offering);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_manta_style);
                lateGame2.setImageResource(R.drawable.item_diffusal_blade);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_power_treads);
                popularItems2.setImageResource(R.drawable.item_vladmirs_offering);
                popularItems3.setImageResource(R.drawable.item_diffusal_blade);
                popularItems4.setImageResource(R.drawable.item_manta_style);
                popularItems5.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems6.setImageResource(R.drawable.item_hand_of_midas);
                popularItems7.setImageResource(R.drawable.item_blink_dagger);
                popularItems8.setImageResource(R.drawable.item_linkens_sphere);
                popularItems9.setImageResource(R.drawable.item_magic_wand);
                popularItems10.setImageResource(R.drawable.item_black_king_bar);
                popularItems11.setImageResource(R.drawable.item_quelling_blade);
                popularItems12.setImageResource(R.drawable.item_yasha);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "quelling_blade";
                earlyGame4OnClick = "morbid_mask";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "vladmirs_offering";

                lateGame1OnClick = "manta_style";
                lateGame2OnClick = "diffusal_blade";

                popularItems1OnClick = "power_treads";
                popularItems2OnClick = "vladmirs_offering";
                popularItems3OnClick = "diffusal_blade";
                popularItems4OnClick = "manta_style";
                popularItems5OnClick = "aghanims_scepter";
                popularItems6OnClick = "hand_of_midas";
                popularItems7OnClick = "blink_dagger";
                popularItems8OnClick = "linkens_sphere";
                popularItems9OnClick = "magic_wand";
                popularItems10OnClick = "black_king_bar";
                popularItems11OnClick = "quelling_blade";
                popularItems12OnClick = "yasha";
                break;


            case "Gyrocopter":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_circlet);
                startingItems4.setImageResource(R.drawable.item_slippers_of_agility);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_wraith_band);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_phase_boots);
                midGame2.setImageResource(R.drawable.item_helm_of_the_dominator);
                midGame3.setImageResource(R.drawable.item_dragon_lance);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_black_king_bar);
                lateGame2.setImageResource(R.drawable.item_monkey_king_bar);
                lateGame3.setImageResource(R.drawable.item_butterfly);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_phase_boots);
                popularItems2.setImageResource(R.drawable.item_wraith_band);
                popularItems3.setImageResource(R.drawable.item_black_king_bar);
                popularItems4.setImageResource(R.drawable.item_kaya_and_sange);
                popularItems5.setImageResource(R.drawable.item_magic_wand);
                popularItems6.setImageResource(R.drawable.item_dragon_lance);
                popularItems7.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems8.setImageResource(R.drawable.item_monkey_king_bar);
                popularItems9.setImageResource(R.drawable.item_hurricane_pike);
                popularItems10.setImageResource(R.drawable.item_satanic);
                popularItems11.setImageResource(R.drawable.item_maelstrom);
                popularItems12.setImageResource(R.drawable.item_morbid_mask);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "circlet";
                startingItems4OnClick = "slippers_of_agility";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "wraith_band";

                midGame1OnClick = "phase_boots";
                midGame2OnClick = "helm_of_the_dominator";
                midGame3OnClick = "dragon_lance";

                lateGame1OnClick = "black_king_bar";
                lateGame2OnClick = "monkey_king_bar";
                lateGame3OnClick = "butterfly";

                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "wraith_band";
                popularItems3OnClick = "black_king_bar";
                popularItems4OnClick = "sange_and_yasha";
                popularItems5OnClick = "magic_wand";
                popularItems6OnClick = "dragon_lance";
                popularItems7OnClick = "aghanims_scepter";
                popularItems8OnClick = "monkey_king_bar";
                popularItems9OnClick = "hurricane_pike";
                popularItems10OnClick = "satanic";
                popularItems11OnClick = "maelstrom";
                popularItems12OnClick = "morbid_mask";

                break;

            case "Hoodwink":
                startingItems1.setImageResource(R.drawable.item_ironwood_branch);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_tango);
                startingItems4.setImageResource(R.drawable.item_slippers_of_agility);
                startingItems5.setImageResource(R.drawable.item_circlet);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_wraith_band);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_dragon_lance);
                midGame4.setImageResource(R.drawable.item_maelstrom);

                lateGame1.setImageResource(R.drawable.item_gleipnir);
                lateGame2.setImageResource(R.drawable.item_daedalus);
                lateGame3.setImageResource(R.drawable.item_monkey_king_bar);
                lateGame4.setImageResource(R.drawable.item_eye_of_skadai);

                popularItems1.setImageResource(R.drawable.item_power_treads);
                popularItems2.setImageResource(R.drawable.item_wraith_band);
                popularItems3.setImageResource(R.drawable.item_black_king_bar);
                popularItems4.setImageResource(R.drawable.item_gleipnir);
                popularItems5.setImageResource(R.drawable.item_daedalus);
                popularItems6.setImageResource(R.drawable.item_monkey_king_bar);
                popularItems7.setImageResource(R.drawable.item_eye_of_skadai);
                popularItems8.setImageResource(R.drawable.item_hurricane_pike);
                popularItems9.setImageResource(R.drawable.item_desolator);
                popularItems10.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems11.setImageResource(R.drawable.item_ethereal_blade);
                popularItems12.setImageResource(R.drawable.item_linkens_sphere);

                startingItems1OnClick = "iron_branch";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "tango";
                startingItems4OnClick = "slippers_of_agility";
                startingItems5OnClick = "circlet";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "wraith_band";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "dragon_lance";
                midGame4OnClick = "maelstrom";


                lateGame1OnClick = "gleipnir";
                lateGame2OnClick = "daedalus";
                lateGame3OnClick = "monkey_king_bar";
                lateGame4OnClick = "eye_of_skadai";


                popularItems1OnClick = "power_treads";
                popularItems2OnClick = "wraith_band";
                popularItems3OnClick = "black_king_bar";
                popularItems4OnClick = "gleipnir";
                popularItems5OnClick = "daedalus";
                popularItems6OnClick = "monkey_king_bar";
                popularItems7OnClick = "eye_of_skadai";
                popularItems8OnClick = "hurricane_pike";
                popularItems9OnClick = "desolator";
                popularItems10OnClick = "euls_scepter_of_divinity";
                popularItems11OnClick = "etheral_blade";
                popularItems12OnClick = "linkens_sphere";

                break;

            case "Juggernaut":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_enchanted_mango);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_quelling_blade);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_magic_stick);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_phase_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_kaya_and_sange);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_abyssal_blade);
                lateGame2.setImageResource(R.drawable.item_butterfly);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_phase_boots);
                popularItems2.setImageResource(R.drawable.item_manta_style);
                popularItems3.setImageResource(R.drawable.item_diffusal_blade);
                popularItems4.setImageResource(R.drawable.item_wraith_band);
                popularItems5.setImageResource(R.drawable.item_blink_dagger);
                popularItems6.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems7.setImageResource(R.drawable.item_magic_wand);
                popularItems8.setImageResource(R.drawable.item_skull_basher);
                popularItems9.setImageResource(R.drawable.item_butterfly);
                popularItems10.setImageResource(R.drawable.item_quelling_blade);
                popularItems11.setImageResource(R.drawable.item_abyssal_blade);
                popularItems12.setImageResource(R.drawable.item_eye_of_skadai);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "enchanted_mango";
                startingItems4OnClick = "iron_branch";

                earlyGame1OnClick = "quelling_blade";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "magic_stick";

                midGame1OnClick = "phase_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "sange_and_yasha";

                lateGame1OnClick = "abyssal_blade";
                lateGame2OnClick = "butterfly";

                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "manta_style";
                popularItems3OnClick = "diffusal_blade";
                popularItems4OnClick = "wraith_band";
                popularItems5OnClick = "blink_dagger";
                popularItems6OnClick = "aghanims_scepter";
                popularItems7OnClick = "magic_wand";
                popularItems8OnClick = "skull_basher";
                popularItems9OnClick = "butterfly";
                popularItems10OnClick = "quelling_blade";
                popularItems11OnClick = "abyssal_blade";
                popularItems12OnClick = "eye_of_skadai";
                break;


            case "Lone Druid":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_orb_of_venom);
                earlyGame3.setImageResource(R.drawable.item_quelling_blade);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_phase_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_town_portal_scroll);
                midGame4.setImageResource(R.drawable.item_radiance);

                lateGame1.setImageResource(R.drawable.item_abyssal_blade);
                lateGame2.setImageResource(R.drawable.item_assault_cuirass);
                lateGame3.setImageResource(R.drawable.item_desolator);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_boots_of_speed);
                popularItems2.setImageResource(R.drawable.item_tranquil_boots);
                popularItems3.setImageResource(R.drawable.item_ironwood_branch);
                popularItems4.setImageResource(R.drawable.item_vladmirs_offering);
                popularItems5.setImageResource(R.drawable.item_phase_boots);
                popularItems6.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems7.setImageResource(R.drawable.item_hand_of_midas);
                popularItems8.setImageResource(R.drawable.item_quelling_blade);
                popularItems9.setImageResource(R.drawable.item_wraith_band);
                popularItems10.setImageResource(R.drawable.item_ironwood_branch);
                popularItems11.setImageResource(R.drawable.item_magic_wand);
                popularItems12.setImageResource(R.drawable.item_maelstrom);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "orb_of_venom";
                earlyGame3OnClick = "quelling_blade";

                midGame1OnClick = "phase_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "town_portal_scroll";
                midGame4OnClick = "radiance";

                lateGame1OnClick = "abyssal_blade";
                lateGame2OnClick = "assault_cuirass";
                lateGame3OnClick = "desolator";

                popularItems1OnClick = "boots_of_speed";
                popularItems2OnClick = "tranquil_boots";
                popularItems3OnClick = "ironwood_branch";
                popularItems4OnClick = "vladmirs_offering";
                popularItems5OnClick = "phase_boots";
                popularItems6OnClick = "aghanims_scepter";
                popularItems7OnClick = "hand_of_midas";
                popularItems8OnClick = "quelling_blade";
                popularItems9OnClick = "wraith_band";
                popularItems10OnClick = "iron_branch";
                popularItems11OnClick = "magic_wand";
                popularItems12OnClick = "maelstrom";
                break;


            case "Luna":
                startingItems1.setImageResource(R.drawable.item_ring_of_protection);
                startingItems2.setImageResource(R.drawable.item_circlet);
                startingItems3.setImageResource(R.drawable.item_tango);
                startingItems4.setImageResource(R.drawable.item_healing_salve);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_wraith_band);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_dragon_lance);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_manta_style);
                lateGame2.setImageResource(R.drawable.item_black_king_bar);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_power_treads);
                popularItems2.setImageResource(R.drawable.item_manta_style);
                popularItems3.setImageResource(R.drawable.item_wraith_band);
                popularItems4.setImageResource(R.drawable.item_black_king_bar);
                popularItems5.setImageResource(R.drawable.item_mask_of_madness);
                popularItems6.setImageResource(R.drawable.item_dragon_lance);
                popularItems7.setImageResource(R.drawable.item_hurricane_pike);
                popularItems8.setImageResource(R.drawable.item_butterfly);
                popularItems9.setImageResource(R.drawable.item_magic_wand);
                popularItems10.setImageResource(R.drawable.item_morbid_mask);
                popularItems11.setImageResource(R.drawable.item_yasha);
                popularItems12.setImageResource(R.drawable.item_satanic);

                startingItems1OnClick = "ring_of_protection";
                startingItems2OnClick = "circlet";
                startingItems3OnClick = "tango";
                startingItems4OnClick = "healing_salve";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "wraith_band";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "dragon_lance";

                lateGame1OnClick = "manta_style";
                lateGame2OnClick = "black_king_bar";

                popularItems1OnClick = "power_treads";
                popularItems2OnClick = "manta_style";
                popularItems3OnClick = "wraith_band";
                popularItems4OnClick = "black_king_bar";
                popularItems5OnClick = "mask_of_madness";
                popularItems6OnClick = "dragon_lance";
                popularItems7OnClick = "hurricane_pike";
                popularItems8OnClick = "butterfly";
                popularItems9OnClick = "magic_wand";
                popularItems10OnClick = "morbid_mask";
                popularItems11OnClick = "yasha";
                popularItems12OnClick = "satanic";
                break;


            case "Medusa":
                startingItems1.setImageResource(R.drawable.item_ring_of_protection);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_tango);
                startingItems5.setImageResource(R.drawable.item_healing_salve);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_ring_of_basilius);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_ring_of_health);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_phase_boots);
                midGame2.setImageResource(R.drawable.item_wraith_band);
                midGame3.setImageResource(R.drawable.item_dragon_lance);
                midGame4.setImageResource(R.drawable.item_linkens_sphere);

                lateGame1.setImageResource(R.drawable.item_eye_of_skadai);
                lateGame2.setImageResource(R.drawable.item_butterfly);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_phase_boots);
                popularItems2.setImageResource(R.drawable.item_wraith_band);
                popularItems3.setImageResource(R.drawable.item_linkens_sphere);
                popularItems4.setImageResource(R.drawable.item_manta_style);
                popularItems5.setImageResource(R.drawable.item_eye_of_skadai);
                popularItems6.setImageResource(R.drawable.item_dragon_lance);
                popularItems7.setImageResource(R.drawable.item_magic_wand);
                popularItems8.setImageResource(R.drawable.item_butterfly);
                popularItems9.setImageResource(R.drawable.item_hurricane_pike);
                popularItems10.setImageResource(R.drawable.item_hand_of_midas);
                popularItems11.setImageResource(R.drawable.item_mjollnir);
                popularItems12.setImageResource(R.drawable.item_yasha);

                startingItems1OnClick = "ring_of_protection";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "tango";
                startingItems5OnClick = "healing_salve";

                earlyGame1OnClick = "ring_of_basilius";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "ring_of_health";

                midGame1OnClick = "phase_boots";
                midGame2OnClick = "wraith_band";
                midGame3OnClick = "dragon_lance";
                midGame4OnClick = "linkens_sphere";

                lateGame1OnClick = "eye_of_skadai";
                lateGame2OnClick = "butterfly";

                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "wraith_band";
                popularItems3OnClick = "linkens_sphere";
                popularItems4OnClick = "manta_style";
                popularItems5OnClick = "eye_of_skadai";
                popularItems6OnClick = "dragon_lance";
                popularItems7OnClick = "magic_wand";
                popularItems8OnClick = "butterfly";
                popularItems9OnClick = "hurricane_pike";
                popularItems10OnClick = "hand_of_midas";
                popularItems11OnClick = "mjollnir";
                popularItems12OnClick = "yasha";
                break;


            case "Meepo":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ring_of_protection);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_ring_of_basilius);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_aghanims_scepter);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_blink_dagger);
                lateGame2.setImageResource(R.drawable.item_eye_of_skadai);
                lateGame3.setImageResource(R.drawable.item_heart_of_tarrasque);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_dragon_lance);
                popularItems2.setImageResource(R.drawable.item_blink_dagger);
                popularItems3.setImageResource(R.drawable.item_power_treads);
                popularItems4.setImageResource(R.drawable.item_ethereal_blade);
                popularItems5.setImageResource(R.drawable.item_scythe_of_vyse);
                popularItems6.setImageResource(R.drawable.item_boots_of_travel);
                popularItems7.setImageResource(R.drawable.item_diffusal_blade);
                popularItems8.setImageResource(R.drawable.item_wraith_band);
                popularItems9.setImageResource(R.drawable.item_eye_of_skadai);
                popularItems10.setImageResource(R.drawable.item_ultimate_orb);
                popularItems11.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems12.setImageResource(R.drawable.item_heart_of_tarrasque);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "ring_of_protection";

                earlyGame1OnClick = "ring_of_basilius";
                earlyGame2OnClick = "boots_of_speed";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "aghanims_scepter";

                lateGame1OnClick = "blink_dagger";
                lateGame2OnClick = "eye_of_skadai";
                lateGame3OnClick = "heart_of_tarrasque";

                popularItems1OnClick = "dragon_lance";
                popularItems2OnClick = "blink_dagger";
                popularItems3OnClick = "power_treads";
                popularItems4OnClick = "ethereal_blade";
                popularItems5OnClick = "scythe_of_vyse";
                popularItems6OnClick = "boots_of_travel";
                popularItems7OnClick = "diffusal_blade";
                popularItems8OnClick = "wraith_band";
                popularItems9OnClick = "eye_of_skadai";
                popularItems10OnClick = "ultimate_orb";
                popularItems11OnClick = "aghanims_scepter";
                popularItems12OnClick = "heart_of_tarrasque";
                break;



            case "Mirana":
                startingItems1.setImageResource(R.drawable.item_wraith_band);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setVisibility(View.INVISIBLE);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_bottle);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame4.setImageResource(R.drawable.item_wraith_band);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_aghanims_scepter);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_blink_dagger);
                lateGame2.setImageResource(R.drawable.item_diffusal_blade);
                lateGame3.setImageResource(R.drawable.item_butterfly);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems2.setImageResource(R.drawable.item_wraith_band);
                popularItems3.setImageResource(R.drawable.item_blink_dagger);
                popularItems4.setImageResource(R.drawable.item_phase_boots);
                popularItems5.setImageResource(R.drawable.item_magic_wand);
                popularItems6.setImageResource(R.drawable.item_hand_of_midas);
                popularItems7.setImageResource(R.drawable.item_arcane_boots);
                popularItems8.setImageResource(R.drawable.item_power_treads);
                popularItems9.setImageResource(R.drawable.item_boots_of_travel);
                popularItems10.setImageResource(R.drawable.item_maelstrom);
                popularItems11.setImageResource(R.drawable.item_bottle);
                popularItems12.setImageResource(R.drawable.item_boots_of_speed);

                startingItems1OnClick = "wraith_band";
                startingItems2OnClick = "tango";

                earlyGame1OnClick = "bottle";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "boots_of_speed";
                earlyGame4OnClick = "wraith_band";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "aghanims_scepter";

                lateGame1OnClick = "blink_dagger";
                lateGame2OnClick = "diffusal_blade";
                lateGame3OnClick = "butterfly";

                popularItems1OnClick = "aghanims_scepter";
                popularItems2OnClick = "wraith_band";
                popularItems3OnClick = "blink_dagger";
                popularItems4OnClick = "phase_boots";
                popularItems5OnClick = "magic_wand";
                popularItems6OnClick = "hand_of_midas";
                popularItems7OnClick = "arcane_boots";
                popularItems8OnClick = "power_treads";
                popularItems9OnClick = "boots_of_travel";
                popularItems10OnClick = "maelstrom";
                popularItems11OnClick = "bottle";
                popularItems12OnClick = "boots_of_speed";
                break;


            case "Monkey King":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_circlet);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_wraith_band);
                earlyGame3.setImageResource(R.drawable.item_ring_of_health);
                earlyGame4.setImageResource(R.drawable.item_blight_stone);

                midGame1.setImageResource(R.drawable.item_phase_boots);
                midGame2.setImageResource(R.drawable.item_vanguard);
                midGame3.setImageResource(R.drawable.item_skull_basher);
                midGame4.setImageResource(R.drawable.item_desolator);

                lateGame1.setImageResource(R.drawable.item_black_king_bar);
                lateGame2.setImageResource(R.drawable.item_abyssal_blade);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_phase_boots);
                popularItems2.setImageResource(R.drawable.item_orb_of_venom);
                popularItems3.setImageResource(R.drawable.item_echo_sabre);
                popularItems4.setImageResource(R.drawable.item_magic_wand);
                popularItems5.setImageResource(R.drawable.item_abyssal_blade);
                popularItems6.setImageResource(R.drawable.item_shadowblade);
                popularItems7.setImageResource(R.drawable.item_wraith_band);
                popularItems8.setImageResource(R.drawable.item_solar_crest);
                popularItems9.setImageResource(R.drawable.item_desolator);
                popularItems10.setImageResource(R.drawable.item_hand_of_midas);
                popularItems11.setImageResource(R.drawable.item_blight_stone);
                popularItems12.setImageResource(R.drawable.item_skull_basher);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "circlet";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "wraith_band";
                earlyGame3OnClick = "ring_of_health";
                earlyGame4OnClick = "blight_stone";

                midGame1OnClick = "phase_boots";
                midGame2OnClick = "vanguard";
                midGame3OnClick = "skull_basher";
                midGame4OnClick = "desolator";

                lateGame1OnClick = "black_king_bar";
                lateGame2OnClick = "abyssal_blade";

                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "orb_of_venom";
                popularItems3OnClick = "echo_sabre";
                popularItems4OnClick = "magic_wand";
                popularItems5OnClick = "abyssal_blade";
                popularItems6OnClick = "shadow_blade";
                popularItems7OnClick = "wraith_band";
                popularItems8OnClick = "solar_crest";
                popularItems9OnClick = "desolator";
                popularItems10OnClick = "hand_of_midas";
                popularItems11OnClick = "blight_stone";
                popularItems12OnClick = "skull_basher";
                break;


            case "Morphling":
                startingItems1.setImageResource(R.drawable.item_slippers_of_agility);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setImageResource(R.drawable.item_healing_salve);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_wraith_band);
                earlyGame4.setImageResource(R.drawable.item_ring_of_health);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_linkens_sphere);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_ethereal_blade);
                lateGame2.setImageResource(R.drawable.item_eye_of_skadai);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_linkens_sphere);
                popularItems2.setImageResource(R.drawable.item_ethereal_blade);
                popularItems3.setImageResource(R.drawable.item_wraith_band);
                popularItems4.setImageResource(R.drawable.item_magic_wand);
                popularItems5.setImageResource(R.drawable.item_boots_of_travel);
                popularItems6.setImageResource(R.drawable.item_power_treads);
                popularItems7.setImageResource(R.drawable.item_manta_style);
                popularItems8.setImageResource(R.drawable.item_dragon_lance);
                popularItems9.setImageResource(R.drawable.item_eye_of_skadai);
                popularItems10.setImageResource(R.drawable.item_black_king_bar);
                popularItems11.setImageResource(R.drawable.item_blink_dagger);
                popularItems12.setImageResource(R.drawable.item_boots_of_speed);

                startingItems1OnClick = "slippers_of_agility";
                startingItems2OnClick = "tango";
                startingItems3OnClick = "healing_salve";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "wraith_band";
                earlyGame4OnClick = "ring_of_health";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "linkens_sphere";

                lateGame1OnClick = "ethereal_blade";
                lateGame2OnClick = "eye_of_skadai";

                popularItems1OnClick = "linkens_sphere";
                popularItems2OnClick = "ethereal_blade";
                popularItems3OnClick = "wraith_band";
                popularItems4OnClick = "magic_wand";
                popularItems5OnClick = "boots_of_travel";
                popularItems6OnClick = "power_treads";
                popularItems7OnClick = "manta_style";
                popularItems8OnClick = "dragon_lance";
                popularItems9OnClick = "eye_of_skadai";
                popularItems10OnClick = "black_king_bar";
                popularItems11OnClick = "blink_dagger";
                popularItems12OnClick = "boots_of_speed";
                break;



            case "Naga Siren":
                startingItems1.setImageResource(R.drawable.item_ironwood_branch);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setImageResource(R.drawable.item_healing_salve);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_wraith_band);
                earlyGame3.setImageResource(R.drawable.item_magic_stick);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_arcane_boots);
                midGame2.setImageResource(R.drawable.item_radiance);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_manta_style);
                lateGame2.setImageResource(R.drawable.item_octarine_core);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_radiance);
                popularItems2.setImageResource(R.drawable.item_boots_of_travel);
                popularItems3.setImageResource(R.drawable.item_manta_style);
                popularItems4.setImageResource(R.drawable.item_octarine_core);
                popularItems5.setImageResource(R.drawable.item_heart_of_tarrasque);
                popularItems6.setImageResource(R.drawable.item_arcane_boots);
                popularItems7.setImageResource(R.drawable.item_butterfly);
                popularItems8.setImageResource(R.drawable.item_diffusal_blade);
                popularItems9.setImageResource(R.drawable.item_wraith_band);
                popularItems10.setImageResource(R.drawable.item_yasha);
                popularItems11.setImageResource(R.drawable.item_wind_lace);
                popularItems12.setImageResource(R.drawable.item_quelling_blade);

                startingItems1OnClick = "iron_branch";
                startingItems2OnClick = "tango";
                startingItems3OnClick = "healing_salve";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "wraith_band";
                earlyGame3OnClick = "magic_stick";

                midGame1OnClick = "arcane_boots";
                midGame2OnClick = "radiance";

                lateGame1OnClick = "manta_style";
                lateGame2OnClick = "octarine_core";

                popularItems1OnClick = "radiance";
                popularItems2OnClick = "boots_of_travel";
                popularItems3OnClick = "manta_style";
                popularItems4OnClick = "octarine_core";
                popularItems5OnClick = "heart_of_tarrasque";
                popularItems6OnClick = "arcane_boots";
                popularItems7OnClick = "butterfly";
                popularItems8OnClick = "diffusal_blade";
                popularItems9OnClick = "wraith_band";
                popularItems10OnClick = "yasha";
                popularItems11OnClick = "wind_lace";
                popularItems12OnClick = "quelling_blade";
                break;



            case "Nyx Assasin":
                startingItems1.setImageResource(R.drawable.item_ironwood_branch);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_tango);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_urn_of_shadows);
                earlyGame3.setImageResource(R.drawable.item_magic_stick);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_arcane_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aether_lens);
                lateGame2.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_arcane_boots);
                popularItems2.setImageResource(R.drawable.item_hand_of_midas);
                popularItems3.setImageResource(R.drawable.item_blink_dagger);
                popularItems4.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems5.setImageResource(R.drawable.item_magic_wand);
                popularItems6.setImageResource(R.drawable.item_force_staff);
                popularItems7.setImageResource(R.drawable.item_aether_lens);
                popularItems8.setImageResource(R.drawable.item_ethereal_blade);
                popularItems9.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems10.setImageResource(R.drawable.item_boots_of_speed);
                popularItems11.setImageResource(R.drawable.item_dagon);
                popularItems12.setImageResource(R.drawable.item_boots_of_travel);

                startingItems1OnClick = "iron_branch";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "tango";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "urn_of_shadows";
                earlyGame3OnClick = "magic_stick";

                midGame1OnClick = "arcane_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "blink_dagger";

                lateGame1OnClick = "aether_lens";
                lateGame2OnClick = "aghanims_scepter";

                popularItems1OnClick = "arcane_boots";
                popularItems2OnClick = "hand_of_midas";
                popularItems3OnClick = "blink_dagger";
                popularItems4OnClick = "aghanims_scepter";
                popularItems5OnClick = "magic_wand";
                popularItems6OnClick = "force_staff";
                popularItems7OnClick = "aether_lens";
                popularItems8OnClick = "ethereal_blade";
                popularItems9OnClick = "euls_scepter_of_divinity";
                popularItems10OnClick = "boots_of_speed";
                popularItems11OnClick = "dagon";
                popularItems12OnClick = "boots_of_travel";
                break;


            case "Pangolier":
                startingItems1.setImageResource(R.drawable.item_ironwood_branch);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setImageResource(R.drawable.item_healing_salve);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_wand);
                earlyGame3.setImageResource(R.drawable.item_wraith_band);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_vanguard);
                midGame3.setImageResource(R.drawable.item_diffusal_blade);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_abyssal_blade);
                lateGame2.setImageResource(R.drawable.item_shivas_guard);
                lateGame3.setImageResource(R.drawable.item_radiance);
                lateGame4.setImageResource(R.drawable.item_linkens_sphere);

                popularItems1.setImageResource(R.drawable.item_power_treads);
                popularItems2.setImageResource(R.drawable.item_magic_wand);
                popularItems3.setImageResource(R.drawable.item_wraith_band);
                popularItems4.setImageResource(R.drawable.item_radiance);
                popularItems5.setImageResource(R.drawable.item_vanguard);
                popularItems6.setImageResource(R.drawable.item_diffusal_blade);
                popularItems7.setImageResource(R.drawable.item_abyssal_blade);
                popularItems8.setImageResource(R.drawable.item_shivas_guard);
                popularItems9.setImageResource(R.drawable.item_linkens_sphere);
                popularItems10.setImageResource(R.drawable.item_phase_boots);
                popularItems11.setImageResource(R.drawable.item_black_king_bar);
                popularItems12.setImageResource(R.drawable.item_skull_basher);

                startingItems1OnClick = "iron_branch";
                startingItems2OnClick = "tango";
                startingItems3OnClick = "healing_salve";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_wand";
                earlyGame3OnClick = "wraith_band";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "vanguard";
                midGame3OnClick = "diffusal_blade";

                lateGame1OnClick = "abyssal_blade";
                lateGame2OnClick = "shivas_guard";
                lateGame3OnClick = "radiance";
                lateGame4OnClick = "linkens_sphere";

                popularItems1OnClick = "power_treads";
                popularItems2OnClick = "magic_wand";
                popularItems3OnClick = "wraith_band";
                popularItems4OnClick = "radiance";
                popularItems5OnClick = "vanguard";
                popularItems6OnClick = "diffusal_blade";
                popularItems7OnClick = "abyssal_blade";
                popularItems8OnClick = "shivas_guard";
                popularItems9OnClick = "linkens_sphere";
                popularItems10OnClick = "phase_boots";
                popularItems11OnClick = "black_king_bar";
                popularItems12OnClick = "skull_basher";
                break;


            case "Phantom Assasin":
                startingItems1.setImageResource(R.drawable.item_healing_salve);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_orb_of_venom);
                earlyGame3.setImageResource(R.drawable.item_magic_wand);
                earlyGame4.setImageResource(R.drawable.item_blight_stone);

                midGame1.setImageResource(R.drawable.item_phase_boots);
                midGame2.setImageResource(R.drawable.item_vladmirs_offering);
                midGame3.setImageResource(R.drawable.item_desolator);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_black_king_bar);
                lateGame2.setImageResource(R.drawable.item_abyssal_blade);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_phase_boots);
                popularItems2.setImageResource(R.drawable.item_desolator);
                popularItems3.setImageResource(R.drawable.item_black_king_bar);
                popularItems4.setImageResource(R.drawable.item_vladmirs_offering);
                popularItems5.setImageResource(R.drawable.item_skull_basher);
                popularItems6.setImageResource(R.drawable.item_abyssal_blade);
                popularItems7.setImageResource(R.drawable.item_monkey_king_bar);
                popularItems8.setImageResource(R.drawable.item_magic_wand);
                popularItems9.setImageResource(R.drawable.item_wraith_band);
                popularItems10.setImageResource(R.drawable.item_quelling_blade);
                popularItems11.setImageResource(R.drawable.item_manta_style);
                popularItems12.setImageResource(R.drawable.item_battle_fury);

                startingItems1OnClick = "healing_salve";
                startingItems2OnClick = "tango";
                startingItems3OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "orb_of_venom";
                earlyGame3OnClick = "magic_wand";
                earlyGame4OnClick = "blight_stone";

                midGame1OnClick = "phase_boots";
                midGame2OnClick = "vladmirs_offering";
                midGame3OnClick = "desolator";

                lateGame1OnClick = "black_king_bar";
                lateGame2OnClick = "abyssal_blade";

                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "desolator";
                popularItems3OnClick = "black_king_bar";
                popularItems4OnClick = "vladmirs_offering";
                popularItems5OnClick = "skull_basher";
                popularItems6OnClick = "abyssal_blade";
                popularItems7OnClick = "monkey_king_bar";
                popularItems8OnClick = "magic_wand";
                popularItems9OnClick = "wraith_band";
                popularItems10OnClick = "quelling_blade";
                popularItems11OnClick = "manta_style";
                popularItems12OnClick = "battle_fury";
                break;



            case "Phantom Lancer":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ring_of_protection);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_wraith_band);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_diffusal_blade);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_manta_style);
                lateGame2.setImageResource(R.drawable.item_eye_of_skadai);
                lateGame3.setImageResource(R.drawable.item_butterfly);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_diffusal_blade);
                popularItems2.setImageResource(R.drawable.item_wraith_band);
                popularItems3.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems4.setImageResource(R.drawable.item_boots_of_travel);
                popularItems5.setImageResource(R.drawable.item_power_treads);
                popularItems6.setImageResource(R.drawable.item_manta_style);
                popularItems7.setImageResource(R.drawable.item_butterfly);
                popularItems8.setImageResource(R.drawable.item_eye_of_skadai);
                popularItems9.setImageResource(R.drawable.item_heart_of_tarrasque);
                popularItems10.setImageResource(R.drawable.item_magic_wand);
                popularItems11.setImageResource(R.drawable.item_vladmirs_offering);
                popularItems12.setImageResource(R.drawable.item_yasha);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "ring_of_protection";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "wraith_band";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "diffusal_blade";

                lateGame1OnClick = "manta_style";
                lateGame2OnClick = "eye_of_skadai";
                lateGame3OnClick = "butterfly";

                popularItems1OnClick = "diffusal_blade";
                popularItems2OnClick = "wraith_band";
                popularItems3OnClick = "aghanims_scepter";
                popularItems4OnClick = "boots_of_travel";
                popularItems5OnClick = "power_treads";
                popularItems6OnClick = "manta_style";
                popularItems7OnClick = "butterfly";
                popularItems8OnClick = "eye_of_skadai";
                popularItems9OnClick = "heart_of_tarrasque";
                popularItems10OnClick = "magic_wand";
                popularItems11OnClick = "vladmirs_offering";
                popularItems12OnClick = "yasha";
                break;



            case "Razor":
                startingItems1.setImageResource(R.drawable.item_ring_of_protection);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setImageResource(R.drawable.item_healing_salve);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setImageResource(R.drawable.item_ironwood_branch);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_wraith_band);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_phase_boots);
                midGame3.setImageResource(R.drawable.item_dragon_lance);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_kaya_and_sange);
                lateGame2.setImageResource(R.drawable.item_hurricane_pike);
                lateGame3.setImageResource(R.drawable.item_black_king_bar);
                lateGame4.setImageResource(R.drawable.item_shivas_guard);

                popularItems1.setImageResource(R.drawable.item_phase_boots);
                popularItems2.setImageResource(R.drawable.item_wraith_band);
                popularItems3.setImageResource(R.drawable.item_kaya_and_sange);
                popularItems4.setImageResource(R.drawable.item_black_king_bar);
                popularItems5.setImageResource(R.drawable.item_drum_of_endurance);
                popularItems6.setImageResource(R.drawable.item_magic_wand);
                popularItems7.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems8.setImageResource(R.drawable.item_hurricane_pike);
                popularItems9.setImageResource(R.drawable.item_shivas_guard);
                popularItems10.setImageResource(R.drawable.item_hand_of_midas);
                popularItems11.setImageResource(R.drawable.item_dragon_lance);
                popularItems12.setImageResource(R.drawable.item_boots_of_travel);

                startingItems1OnClick = "ring_of_protection";
                startingItems2OnClick = "tango";
                startingItems3OnClick = "healing_salve";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";
                startingItems6OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "wraith_band";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "phase_boots";
                midGame3OnClick = "dragon_lance";

                lateGame1OnClick = "sange_and_yasha";
                lateGame2OnClick = "hurricane_pike";
                lateGame3OnClick = "black_king_bar";
                lateGame4OnClick = "shivas_guard";

                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "wraith_band";
                popularItems3OnClick = "sange_and_yasha";
                popularItems4OnClick = "black_king_bar";
                popularItems5OnClick = "drum_of_endurance";
                popularItems6OnClick = "magic_wand";
                popularItems7OnClick = "aghanims_scepter";
                popularItems8OnClick = "hurricane_pike";
                popularItems9OnClick = "shivas_guard";
                popularItems10OnClick = "hand_of_midas";
                popularItems11OnClick = "dragon_lance";
                popularItems12OnClick = "boots_of_travel";
                break;


            case "Riki":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_orb_of_venom);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_diffusal_blade);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_kaya_and_sange);
                lateGame2.setImageResource(R.drawable.item_abyssal_blade);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_diffusal_blade);
                popularItems2.setImageResource(R.drawable.item_phase_boots);
                popularItems3.setImageResource(R.drawable.item_wraith_band);
                popularItems4.setImageResource(R.drawable.item_orb_of_venom);
                popularItems5.setImageResource(R.drawable.item_magic_wand);
                popularItems6.setImageResource(R.drawable.item_skull_basher);
                popularItems7.setImageResource(R.drawable.item_blink_dagger);
                popularItems8.setImageResource(R.drawable.item_tranquil_boots);
                popularItems9.setImageResource(R.drawable.item_power_treads);
                popularItems10.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems11.setImageResource(R.drawable.item_quelling_blade);
                popularItems12.setImageResource(R.drawable.item_blade_of_alacrity);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "orb_of_venom";
                startingItems3OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "diffusal_blade";

                lateGame1OnClick = "sange_and_yasha";
                lateGame2OnClick = "abyssal_blade";

                popularItems1OnClick = "diffusal_blade";
                popularItems2OnClick = "phase_boots";
                popularItems3OnClick = "wraith_band";
                popularItems4OnClick = "orb_of_venom";
                popularItems5OnClick = "magic_wand";
                popularItems6OnClick = "skull_basher";
                popularItems7OnClick = "blink_dagger";
                popularItems8OnClick = "tranquil_boots";
                popularItems9OnClick = "power_treads";
                popularItems10OnClick = "urn_of_shadows";
                popularItems11OnClick = "quelling_blade";
                popularItems12OnClick = "blade_of_alacrity";
                break;


            case "Shadow Fiend":
                startingItems1.setImageResource(R.drawable.item_wraith_band);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setVisibility(View.INVISIBLE);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_bottle);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame4.setImageResource(R.drawable.item_wraith_band);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_dragon_lance);
                midGame4.setImageResource(R.drawable.item_shadowblade);

                lateGame1.setImageResource(R.drawable.item_black_king_bar);
                lateGame2.setImageResource(R.drawable.item_silver_edge);
                lateGame3.setImageResource(R.drawable.item_desolator);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_power_treads);
                popularItems2.setImageResource(R.drawable.item_black_king_bar);
                popularItems3.setImageResource(R.drawable.item_wraith_band);
                popularItems4.setImageResource(R.drawable.item_hurricane_pike);
                popularItems5.setImageResource(R.drawable.item_shadowblade);
                popularItems6.setImageResource(R.drawable.item_silver_edge);
                popularItems7.setImageResource(R.drawable.item_dragon_lance);
                popularItems8.setImageResource(R.drawable.item_butterfly);
                popularItems9.setImageResource(R.drawable.item_bottle);
                popularItems10.setImageResource(R.drawable.item_magic_wand);
                popularItems11.setImageResource(R.drawable.item_manta_style);
                popularItems12.setImageResource(R.drawable.item_boots_of_travel);

                startingItems1OnClick = "wraith_band";
                startingItems2OnClick = "tango";

                earlyGame1OnClick = "bottle";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "boots_of_speed";
                earlyGame4OnClick = "wraith_band";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "dragon_lance";
                midGame4OnClick = "shadow_blade";

                lateGame1OnClick = "black_king_bar";
                lateGame2OnClick = "silver_edge";
                lateGame3OnClick = "desolator";

                popularItems1OnClick = "power_treads";
                popularItems2OnClick = "black_king_bar";
                popularItems3OnClick = "wraith_band";
                popularItems4OnClick = "hurricane_pike";
                popularItems5OnClick = "shadow_blade";
                popularItems6OnClick = "silver_edge";
                popularItems7OnClick = "dragon_lance";
                popularItems8OnClick = "butterfly";
                popularItems9OnClick = "bottle";
                popularItems10OnClick = "magic_wand";
                popularItems11OnClick = "manta_style";
                popularItems12OnClick = "boots_of_travel";
                break;


            case "Slark":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_orb_of_venom);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_echo_sabre);
                midGame4.setImageResource(R.drawable.item_shadowblade);

                lateGame1.setImageResource(R.drawable.item_abyssal_blade);
                lateGame2.setImageResource(R.drawable.item_silver_edge);
                lateGame3.setImageResource(R.drawable.item_eye_of_skadai);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_power_treads);
                popularItems2.setImageResource(R.drawable.item_echo_sabre);
                popularItems3.setImageResource(R.drawable.item_silver_edge);
                popularItems4.setImageResource(R.drawable.item_wraith_band);
                popularItems5.setImageResource(R.drawable.item_shadowblade);
                popularItems6.setImageResource(R.drawable.item_black_king_bar);
                popularItems7.setImageResource(R.drawable.item_skull_basher);
                popularItems8.setImageResource(R.drawable.item_butterfly);
                popularItems9.setImageResource(R.drawable.item_magic_wand);
                popularItems10.setImageResource(R.drawable.item_hand_of_midas);
                popularItems11.setImageResource(R.drawable.item_eye_of_skadai);
                popularItems12.setImageResource(R.drawable.item_abyssal_blade);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "orb_of_venom";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "echo_sabre";
                midGame4OnClick = "shadow_blade";

                lateGame1OnClick = "abyssal_blade";
                lateGame2OnClick = "silver_edge";
                lateGame3OnClick = "eye_of_skadai";

                popularItems1OnClick = "power_treads";
                popularItems2OnClick = "echo_sabre";
                popularItems3OnClick = "silver_edge";
                popularItems4OnClick = "wraith_band";
                popularItems5OnClick = "shadow_blade";
                popularItems6OnClick = "black_king_bar";
                popularItems7OnClick = "skull_basher";
                popularItems8OnClick = "butterfly";
                popularItems9OnClick = "magic_wand";
                popularItems10OnClick = "hand_of_midas";
                popularItems11OnClick = "eye_of_skadai";
                popularItems12OnClick = "abyssal_blade";
                break;


            case "Sniper":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_circlet);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_wraith_band);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_dragon_lance);
                midGame4.setImageResource(R.drawable.item_maelstrom);

                lateGame1.setImageResource(R.drawable.item_hurricane_pike);
                lateGame2.setImageResource(R.drawable.item_mjollnir);
                lateGame3.setImageResource(R.drawable.item_daedalus);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_phase_boots);
                popularItems2.setImageResource(R.drawable.item_hurricane_pike);
                popularItems3.setImageResource(R.drawable.item_wraith_band);
                popularItems4.setImageResource(R.drawable.item_mjollnir);
                popularItems5.setImageResource(R.drawable.item_maelstrom);
                popularItems6.setImageResource(R.drawable.item_power_treads);
                popularItems7.setImageResource(R.drawable.item_dragon_lance);
                popularItems8.setImageResource(R.drawable.item_shadowblade);
                popularItems9.setImageResource(R.drawable.item_monkey_king_bar);
                popularItems10.setImageResource(R.drawable.item_mask_of_madness);
                popularItems11.setImageResource(R.drawable.item_silver_edge);
                popularItems12.setImageResource(R.drawable.item_magic_wand);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "circlet";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "wraith_band";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "dragon_lance";
                midGame4OnClick = "maelstrom";

                lateGame1OnClick = "hurricane_pike";
                lateGame2OnClick = "mjollnir";
                lateGame3OnClick = "daedalus";

                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "hurricane_pike";
                popularItems3OnClick = "wraith_band";
                popularItems4OnClick = "mjollnir";
                popularItems5OnClick = "maelstrom";
                popularItems6OnClick = "power_treads";
                popularItems7OnClick = "dragon_lance";
                popularItems8OnClick = "shadow_blade";
                popularItems9OnClick = "monkey_king_bar";
                popularItems10OnClick = "mask_of_madness";
                popularItems11OnClick = "silver_edge";
                popularItems12OnClick = "magic_wand";
                break;


            case "Spectre":
                startingItems1.setImageResource(R.drawable.item_quelling_blade);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setImageResource(R.drawable.item_healing_salve);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setImageResource(R.drawable.item_ironwood_branch);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_ring_of_health);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_vanguard);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_radiance);
                lateGame2.setImageResource(R.drawable.item_diffusal_blade);
                lateGame3.setImageResource(R.drawable.item_heart_of_tarrasque);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_phase_boots);
                popularItems2.setImageResource(R.drawable.item_radiance);
                popularItems3.setImageResource(R.drawable.item_manta_style);
                popularItems4.setImageResource(R.drawable.item_diffusal_blade);
                popularItems5.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems6.setImageResource(R.drawable.item_blade_mail);
                popularItems7.setImageResource(R.drawable.item_vanguard);
                popularItems8.setImageResource(R.drawable.item_heart_of_tarrasque);
                popularItems9.setImageResource(R.drawable.item_magic_wand);
                popularItems10.setImageResource(R.drawable.item_butterfly);
                popularItems11.setImageResource(R.drawable.item_yasha);
                popularItems12.setImageResource(R.drawable.item_abyssal_blade);

                startingItems1OnClick = "quelling_blade";
                startingItems2OnClick = "tango";
                startingItems3OnClick = "healing_salve";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";
                startingItems6OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "ring_of_health";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "vanguard";

                lateGame1OnClick = "radiance";
                lateGame2OnClick = "diffusal_blade";
                lateGame3OnClick = "heart_of_tarrasque";

                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "radiance";
                popularItems3OnClick = "manta_style";
                popularItems4OnClick = "diffusal_blade";
                popularItems5OnClick = "urn_of_shadows";
                popularItems6OnClick = "blade_mail";
                popularItems7OnClick = "vanguard";
                popularItems8OnClick = "heart_of_tarrasque";
                popularItems9OnClick = "magic_wand";
                popularItems10OnClick = "butterfly";
                popularItems11OnClick = "yasha";
                popularItems12OnClick = "abyssal_blade";
                break;


            case "Templar Assasin":
                startingItems1.setImageResource(R.drawable.item_wraith_band);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setVisibility(View.INVISIBLE);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_bottle);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_magic_stick);
                earlyGame4.setImageResource(R.drawable.item_blight_stone);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_desolator);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_daedalus);
                lateGame2.setImageResource(R.drawable.item_black_king_bar);
                lateGame3.setImageResource(R.drawable.item_monkey_king_bar);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_desolator);
                popularItems2.setImageResource(R.drawable.item_blink_dagger);
                popularItems3.setImageResource(R.drawable.item_power_treads);
                popularItems4.setImageResource(R.drawable.item_black_king_bar);
                popularItems5.setImageResource(R.drawable.item_wraith_band);
                popularItems6.setImageResource(R.drawable.item_hurricane_pike);
                popularItems7.setImageResource(R.drawable.item_bloodthorn);
                popularItems8.setImageResource(R.drawable.item_bottle);
                popularItems9.setImageResource(R.drawable.item_dragon_lance);
                popularItems10.setImageResource(R.drawable.item_boots_of_travel);
                popularItems11.setImageResource(R.drawable.item_monkey_king_bar);
                popularItems12.setImageResource(R.drawable.item_magic_wand);

                startingItems1OnClick = "wraith_band";
                startingItems2OnClick = "tango";

                earlyGame1OnClick = "bottle";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "magic_stick";
                earlyGame4OnClick = "blight_stone";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "desolator";
                midGame3OnClick = "blink_dagger";

                lateGame1OnClick = "daedalus";
                lateGame2OnClick = "black_king_bar";
                lateGame3OnClick = "monkey_king_bar";

                popularItems1OnClick = "desolator";
                popularItems2OnClick = "blink_dagger";
                popularItems3OnClick = "power_treads";
                popularItems4OnClick = "black_king_bar";
                popularItems5OnClick = "wraith_band";
                popularItems6OnClick = "hurricane_pike";
                popularItems7OnClick = "bloodthorn";
                popularItems8OnClick = "bottle";
                popularItems9OnClick = "dragon_lance";
                popularItems10OnClick = "boots_of_travel";
                popularItems11OnClick = "monkey_king_bar";
                popularItems12OnClick = "magic_wand";
                break;


            case "Terrorblade":
                startingItems1.setImageResource(R.drawable.item_ironwood_branch);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_tango);
                startingItems5.setImageResource(R.drawable.item_healing_salve);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_wraith_band);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_drum_of_endurance);
                midGame3.setImageResource(R.drawable.item_manta_style);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_eye_of_skadai);
                lateGame2.setImageResource(R.drawable.item_butterfly);
                lateGame3.setImageResource(R.drawable.item_daedalus);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_power_treads);
                popularItems2.setImageResource(R.drawable.item_wraith_band);
                popularItems3.setImageResource(R.drawable.item_manta_style);
                popularItems4.setImageResource(R.drawable.item_dragon_lance);
                popularItems5.setImageResource(R.drawable.item_eye_of_skadai);
                popularItems6.setImageResource(R.drawable.item_black_king_bar);
                popularItems7.setImageResource(R.drawable.item_hurricane_pike);
                popularItems8.setImageResource(R.drawable.item_assault_cuirass);
                popularItems9.setImageResource(R.drawable.item_diffusal_blade);
                popularItems10.setImageResource(R.drawable.item_butterfly);
                popularItems11.setImageResource(R.drawable.item_quelling_blade);
                popularItems12.setImageResource(R.drawable.item_boots_of_travel);

                startingItems1OnClick = "iron_branch";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "tango";
                startingItems5OnClick = "healing_salve";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "wraith_band";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "drum_of_endurance";
                midGame3OnClick = "manta_style";

                lateGame1OnClick = "eye_of_skadai";
                lateGame2OnClick = "butterfly";
                lateGame3OnClick = "daedalus";

                popularItems1OnClick = "power_treads";
                popularItems2OnClick = "wraith_band";
                popularItems3OnClick = "manta_style";
                popularItems4OnClick = "dragon_lance";
                popularItems5OnClick = "eye_of_skadai";
                popularItems6OnClick = "black_king_bar";
                popularItems7OnClick = "hurricane_pike";
                popularItems8OnClick = "assault_cuirass";
                popularItems9OnClick = "diffusal_blade";
                popularItems10OnClick = "butterfly";
                popularItems11OnClick = "quelling_blade";
                popularItems12OnClick = "boots_of_travel";
                break;


            case "Troll Warlord":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_phase_boots);
                midGame3.setImageResource(R.drawable.item_vladmirs_offering);
                midGame4.setImageResource(R.drawable.item_kaya_and_sange);

                lateGame1.setImageResource(R.drawable.item_silver_edge);
                lateGame2.setImageResource(R.drawable.item_black_king_bar);
                lateGame3.setImageResource(R.drawable.item_daedalus);
                lateGame4.setImageResource(R.drawable.item_satanic);

                popularItems1.setImageResource(R.drawable.item_phase_boots);
                popularItems2.setImageResource(R.drawable.item_kaya_and_sange);
                popularItems3.setImageResource(R.drawable.item_vladmirs_offering);
                popularItems4.setImageResource(R.drawable.item_black_king_bar);
                popularItems5.setImageResource(R.drawable.item_butterfly);
                popularItems6.setImageResource(R.drawable.item_blink_dagger);
                popularItems7.setImageResource(R.drawable.item_silver_edge);
                popularItems8.setImageResource(R.drawable.item_quelling_blade);
                popularItems9.setImageResource(R.drawable.item_shadowblade);
                popularItems10.setImageResource(R.drawable.item_eye_of_skadai);
                popularItems11.setImageResource(R.drawable.item_morbid_mask);
                popularItems12.setImageResource(R.drawable.item_diffusal_blade);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "phase_boots";
                midGame3OnClick = "vladmirs_offering";
                midGame4OnClick = "sange_and_yasha";

                lateGame1OnClick = "silver_edge";
                lateGame2OnClick = "black_king_bar";
                lateGame3OnClick = "daedalus";
                lateGame4OnClick = "satanic";

                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "sange_and_yasha";
                popularItems3OnClick = "vladmirs_offering";
                popularItems4OnClick = "black_king_bar";
                popularItems5OnClick = "butterfly";
                popularItems6OnClick = "blink_dagger";
                popularItems7OnClick = "silver_edge";
                popularItems8OnClick = "quelling_blade";
                popularItems9OnClick = "shadow_blade";
                popularItems10OnClick = "eye_of_skadai";
                popularItems11OnClick = "morbid_mask";
                popularItems12OnClick = "diffusal_blade";
                break;


            case "Ursa":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_ring_of_basilius);
                earlyGame4.setImageResource(R.drawable.item_orb_of_venom);

                midGame1.setImageResource(R.drawable.item_phase_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_vladmirs_offering);
                midGame4.setImageResource(R.drawable.item_blink_dagger);

                lateGame1.setImageResource(R.drawable.item_abyssal_blade);
                lateGame2.setImageResource(R.drawable.item_black_king_bar);
                lateGame3.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_blink_dagger);
                popularItems2.setImageResource(R.drawable.item_phase_boots);
                popularItems3.setImageResource(R.drawable.item_vladmirs_offering);
                popularItems4.setImageResource(R.drawable.item_black_king_bar);
                popularItems5.setImageResource(R.drawable.item_skull_basher);
                popularItems6.setImageResource(R.drawable.item_diffusal_blade);
                popularItems7.setImageResource(R.drawable.item_desolator);
                popularItems8.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems9.setImageResource(R.drawable.item_abyssal_blade);
                popularItems10.setImageResource(R.drawable.item_morbid_mask);
                popularItems11.setImageResource(R.drawable.item_heart_of_tarrasque);
                popularItems12.setImageResource(R.drawable.item_magic_wand);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "phase_boots";
                midGame3OnClick = "vladmirs_offering";
                midGame4OnClick = "sange_and_yasha";

                lateGame1OnClick = "silver_edge";
                lateGame2OnClick = "black_king_bar";
                lateGame3OnClick = "daedalus";
                lateGame4OnClick = "satanic";

                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "sange_and_yasha";
                popularItems3OnClick = "vladmirs_offering";
                popularItems4OnClick = "black_king_bar";
                popularItems5OnClick = "butterfly";
                popularItems6OnClick = "blink_dagger";
                popularItems7OnClick = "silver_edge";
                popularItems8OnClick = "quelling_blade";
                popularItems9OnClick = "shadow_blade";
                popularItems10OnClick = "eye_of_skadai";
                popularItems11OnClick = "morbid_mask";
                popularItems12OnClick = "diffusal_blade";
                break;

            case "Vengeful Spirit":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_medallion_of_courage);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_force_staff);
                lateGame2.setImageResource(R.drawable.item_aether_lens);
                lateGame3.setImageResource(R.drawable.item_solar_crest);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_magic_wand);
                popularItems2.setImageResource(R.drawable.item_solar_crest);
                popularItems3.setImageResource(R.drawable.item_tranquil_boots);
                popularItems4.setImageResource(R.drawable.item_power_treads);
                popularItems5.setImageResource(R.drawable.item_force_staff);
                popularItems6.setImageResource(R.drawable.item_medallion_of_courage);
                popularItems7.setImageResource(R.drawable.item_wraith_band);
                popularItems8.setImageResource(R.drawable.item_boots_of_speed);
                popularItems9.setImageResource(R.drawable.item_wind_lace);
                popularItems10.setImageResource(R.drawable.item_hurricane_pike);
                popularItems11.setImageResource(R.drawable.item_arcane_boots);
                popularItems12.setImageResource(R.drawable.item_phase_boots);

               startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "medallion_of_courage";

                lateGame1OnClick = "force_staff";
                lateGame2OnClick = "aether_lens";
                lateGame3OnClick = "solar_crest";

                popularItems1OnClick = "magic_wand";
                popularItems2OnClick = "solar_crest";
                popularItems3OnClick = "tranquil_boots";
                popularItems4OnClick = "power_treads";
                popularItems5OnClick = "force_staff";
                popularItems6OnClick = "medallion_of_courage";
                popularItems7OnClick = "wraith_band";
                popularItems8OnClick = "boots_of_speed";
                popularItems9OnClick = "wind_lace";
                popularItems10OnClick = "hurricane_pike";
                popularItems11OnClick = "arcane_boots";
                popularItems12OnClick = "phase_boots";
                break;


            case "Venomancer":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ring_of_protection);
                startingItems4.setVisibility(View.GONE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_wraith_band);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_veil_of_discord);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame2.setImageResource(R.drawable.item_blink_dagger);
                lateGame3.setImageResource(R.drawable.item_shivas_guard);
                lateGame4.setImageResource(R.drawable.item_octarine_core);

                popularItems1.setImageResource(R.drawable.item_hand_of_midas);
                popularItems2.setImageResource(R.drawable.item_veil_of_discord);
                popularItems3.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems4.setImageResource(R.drawable.item_magic_wand);
                popularItems5.setImageResource(R.drawable.item_guardian_greaves);
                popularItems6.setImageResource(R.drawable.item_wraith_band);
                popularItems7.setImageResource(R.drawable.item_blink_dagger);
                popularItems8.setImageResource(R.drawable.item_force_staff);
                popularItems9.setImageResource(R.drawable.item_hurricane_pike);
                popularItems10.setImageResource(R.drawable.item_arcane_boots);
                popularItems11.setImageResource(R.drawable.item_boots_of_travel);
                popularItems12.setImageResource(R.drawable.item_tranquil_boots);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "ring_of_protection";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "wraith_band";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "veil_of_discord";

                lateGame1OnClick = "aghanims_scepter";
                lateGame2OnClick = "blink_dagger";
                lateGame3OnClick = "shivas_guard";
                lateGame4OnClick = "octarine_core";

                popularItems1OnClick = "hand_of_midas";
                popularItems2OnClick = "veil_of_discord";
                popularItems3OnClick = "aghanims_scepter";
                popularItems4OnClick = "magic_wand";
                popularItems5OnClick = "guardian_greaves";
                popularItems6OnClick = "wraith_band";
                popularItems7OnClick = "blink_dagger";
                popularItems8OnClick = "force_staff";
                popularItems9OnClick = "hurricane_pike";
                popularItems10OnClick = "arcane_boots";
                popularItems11OnClick = "boots_of_travel";
                popularItems12OnClick = "tranquil_boots";
                break;


            case "Viper":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_slippers_of_agility);
                startingItems4.setImageResource(R.drawable.item_circlet);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_wraith_band);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_dragon_lance);
                midGame4.setImageResource(R.drawable.item_mekansm);

                lateGame1.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame2.setImageResource(R.drawable.item_hurricane_pike);
                lateGame3.setImageResource(R.drawable.item_manta_style);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_wraith_band);
                popularItems2.setImageResource(R.drawable.item_power_treads);
                popularItems3.setImageResource(R.drawable.item_hurricane_pike);
                popularItems4.setImageResource(R.drawable.item_dragon_lance);
                popularItems5.setImageResource(R.drawable.item_phase_boots);
                popularItems6.setImageResource(R.drawable.item_magic_wand);
                popularItems7.setImageResource(R.drawable.item_blade_mail);
                popularItems8.setImageResource(R.drawable.item_hand_of_midas);
                popularItems9.setImageResource(R.drawable.item_black_king_bar);
                popularItems10.setImageResource(R.drawable.item_manta_style);
                popularItems11.setImageResource(R.drawable.item_kaya_and_sange);
                popularItems12.setImageResource(R.drawable.item_yasha);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "slippers_of_agility";
                startingItems4OnClick = "circlet";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "wraith_band";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "dragon_lance";
                midGame4OnClick = "mekansm";

                lateGame1OnClick = "aghanims_scepter";
                lateGame2OnClick = "hurricane_pike";
                lateGame3OnClick = "manta_style";

                popularItems1OnClick = "wraith_band";
                popularItems2OnClick = "power_treads";
                popularItems3OnClick = "hurricane_pike";
                popularItems4OnClick = "dragon_lance";
                popularItems5OnClick = "phase_boots";
                popularItems6OnClick = "magic_wand";
                popularItems7OnClick = "blade_mail";
                popularItems8OnClick = "hand_of_midas";
                popularItems9OnClick = "black_king_bar";
                popularItems10OnClick = "manta_style";
                popularItems11OnClick = "sange_and_yasha";
                popularItems12OnClick = "yasha";
                break;


            case "Weaver":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ring_of_protection);
                startingItems4.setImageResource(R.drawable.item_circlet);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_blight_stone);
                earlyGame4.setImageResource(R.drawable.item_wraith_band);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_linkens_sphere);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_desolator);
                lateGame2.setImageResource(R.drawable.item_daedalus);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_wraith_band);
                popularItems2.setImageResource(R.drawable.item_linkens_sphere);
                popularItems3.setImageResource(R.drawable.item_desolator);
                popularItems4.setImageResource(R.drawable.item_magic_wand);
                popularItems5.setImageResource(R.drawable.item_dragon_lance);
                popularItems6.setImageResource(R.drawable.item_power_treads);
                popularItems7.setImageResource(R.drawable.item_diffusal_blade);
                popularItems8.setImageResource(R.drawable.item_blight_stone);
                popularItems9.setImageResource(R.drawable.item_hurricane_pike);
                popularItems10.setImageResource(R.drawable.item_black_king_bar);
                popularItems11.setImageResource(R.drawable.item_solar_crest);
                popularItems12.setImageResource(R.drawable.item_aghanims_scepter);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "ring_of_protection";
                startingItems4OnClick = "circlet";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "blight_stone";
                earlyGame4OnClick = "wraith_band";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "linkens_sphere";

                lateGame1OnClick = "desolator";
                lateGame2OnClick = "daedalus";

                popularItems1OnClick = "wraith_band";
                popularItems2OnClick = "linkens_sphere";
                popularItems3OnClick = "desolator";
                popularItems4OnClick = "magic_wand";
                popularItems5OnClick = "dragon_lance";
                popularItems6OnClick = "power_treads";
                popularItems7OnClick = "diffusal_blade";
                popularItems8OnClick = "blight_stone";
                popularItems9OnClick = "hurricane_pike";
                popularItems10OnClick = "black_king_bar";
                popularItems11OnClick = "solar_crest";
                popularItems12OnClick = "aghanims_scepter";
                break;
        }
    }

    public void loadIntelligenceHeroSelection(){
        //Is used to get the heroSelected value from the previous class
        String heroSelected = getActivity().getIntent().getExtras().getString("heroSelected");



        switch(heroSelected) {
            //******************************************************************************
            //ALL OF THE SWITCH CASES FOR INTELLIGENCE HEROES
            //******************************************************************************
            case "Ancient Apparition":
                startingItems1.setImageResource(R.drawable.item_ironwood_branch);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_clarity);
                startingItems5.setImageResource(R.drawable.item_tango);
                startingItems6.setImageResource(R.drawable.item_healing_salve);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_wand);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_urn_of_shadows);
                earlyGame4.setImageResource(R.drawable.item_wind_lace);

                midGame1.setImageResource(R.drawable.item_tranquil_boots);
                midGame2.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame2.setImageResource(R.drawable.item_octarine_core);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems2.setImageResource(R.drawable.item_hand_of_midas);
                popularItems3.setImageResource(R.drawable.item_boots_of_speed);
                popularItems4.setImageResource(R.drawable.item_tranquil_boots);
                popularItems5.setImageResource(R.drawable.item_magic_wand);
                popularItems6.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems7.setImageResource(R.drawable.item_arcane_boots);
                popularItems8.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems9.setImageResource(R.drawable.item_wind_lace);
                popularItems10.setImageResource(R.drawable.item_glimmer_cape);
                popularItems11.setImageResource(R.drawable.item_force_staff);
                popularItems12.setImageResource(R.drawable.item_ghost_scepter);

                 startingItems1OnClick = "iron_branch";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "clarity";
                startingItems5OnClick = "tango";
                startingItems6OnClick = "healing_salve";

                earlyGame1OnClick = "magic_wand";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "urn_of_shadows";
                earlyGame4OnClick = "wind_lace";

                midGame1OnClick = "tranquil_boots";
                midGame2OnClick = "euls_scepter_of_divinity";

                lateGame1OnClick = "aghanims_scepter";
                lateGame2OnClick = "octarine_core";

                popularItems1OnClick = "aghanims_scepter";
                popularItems2OnClick = "hand_of_midas";
                popularItems3OnClick = "boots_of_speed";
                popularItems4OnClick = "tranquil_boots";
                popularItems5OnClick = "magic_wand";
                popularItems6OnClick = "euls_scepter_of_divinity";
                popularItems7OnClick = "arcane_boots";
                popularItems8OnClick = "urn_of_shadows";
                popularItems9OnClick = "wind_lace";
                popularItems10OnClick = "glimmer_cape";
                popularItems11OnClick = "force_staff";
                popularItems12OnClick = "ghost_scepter";
                break;


            case "Bane":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_observer_ward);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_soul_ring);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_arcane_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_glimmer_cape);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aether_lens);
                lateGame2.setImageResource(R.drawable.item_blink_dagger);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_magic_wand);
                popularItems2.setImageResource(R.drawable.item_arcane_boots);
                popularItems3.setImageResource(R.drawable.item_glimmer_cape);
                popularItems4.setImageResource(R.drawable.item_aether_lens);
                popularItems5.setImageResource(R.drawable.item_boots_of_speed);
                popularItems6.setImageResource(R.drawable.item_force_staff);
                popularItems7.setImageResource(R.drawable.item_tranquil_boots);
                popularItems8.setImageResource(R.drawable.item_blink_dagger);
                popularItems9.setImageResource(R.drawable.item_soul_ring);
                popularItems10.setImageResource(R.drawable.item_ghost_scepter);
                popularItems11.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems12.setImageResource(R.drawable.item_urn_of_shadows);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "observer_ward";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "soul_ring";

                midGame1OnClick = "arcane_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "glimmer_cape";

                lateGame1OnClick = "aether_lens";
                lateGame2OnClick = "blink_dagger";

                popularItems1OnClick = "magic_wand";
                popularItems2OnClick = "arcane_boots";
                popularItems3OnClick = "glimmer_cape";
                popularItems4OnClick = "aether_lens";
                popularItems5OnClick = "boots_of_speed";
                popularItems6OnClick = "force_staff";
                popularItems7OnClick = "tranquil_boots";
                popularItems8OnClick = "blink_dagger";
                popularItems9OnClick = "soul_ring";
                popularItems10OnClick = "ghost_scepter";
                popularItems11OnClick = "aghanims_scepter";
                popularItems12OnClick = "urn_of_shadows";
                break;


            case "Batrider":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_wind_lace);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_tranquil_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_force_staff);
                lateGame2.setImageResource(R.drawable.item_shivas_guard);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_blink_dagger);
                popularItems2.setImageResource(R.drawable.item_tranquil_boots);
                popularItems3.setImageResource(R.drawable.item_force_staff);
                popularItems4.setImageResource(R.drawable.item_drum_of_endurance);
                popularItems5.setImageResource(R.drawable.item_magic_wand);
                popularItems6.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems7.setImageResource(R.drawable.item_black_king_bar);
                popularItems8.setImageResource(R.drawable.item_boots_of_travel);
                popularItems9.setImageResource(R.drawable.item_wind_lace);
                popularItems10.setImageResource(R.drawable.item_ghost_scepter);
                popularItems11.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems12.setImageResource(R.drawable.item_aether_lens);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "wind_lace";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";

                midGame1OnClick = "tranquil_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "blink_dagger";

                lateGame1OnClick = "force_staff";
                lateGame2OnClick = "shivas_guard";

                popularItems1OnClick = "blink_dagger";
                popularItems2OnClick = "tranquil_boots";
                popularItems3OnClick = "force_staff";
                popularItems4OnClick = "drum_of_endurance";
                popularItems5OnClick = "magic_wand";
                popularItems6OnClick = "euls_scepter_of_divinity";
                popularItems7OnClick = "black_king_bar";
                popularItems8OnClick = "boots_of_travel";
                popularItems9OnClick = "wind_lace";
                popularItems10OnClick = "ghost_scepter";
                popularItems11OnClick = "aghanims_scepter";
                popularItems12OnClick = "aether_lens";
                break;


            case "Chen":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_observer_ward);
                startingItems5.setImageResource(R.drawable.item_observer_ward);
                startingItems6.setImageResource(R.drawable.item_ironwood_branch);
                startingItems7.setImageResource(R.drawable.item_ironwood_branch);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_ring_of_basilius);
                earlyGame3.setImageResource(R.drawable.item_headdress);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_arcane_boots);
                midGame2.setImageResource(R.drawable.item_mekansm);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_guardian_greaves);
                lateGame2.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_arcane_boots);
                popularItems2.setImageResource(R.drawable.item_mekansm);
                popularItems3.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems4.setImageResource(R.drawable.item_guardian_greaves);
                popularItems5.setImageResource(R.drawable.item_ring_of_basilius);
                popularItems6.setImageResource(R.drawable.item_boots_of_speed);
                popularItems7.setImageResource(R.drawable.item_hand_of_midas);
                popularItems8.setImageResource(R.drawable.item_vladmirs_offering);
                popularItems9.setImageResource(R.drawable.item_helm_of_the_dominator);
                popularItems10.setImageResource(R.drawable.item_force_staff);
                popularItems11.setImageResource(R.drawable.item_wind_lace);
                popularItems12.setImageResource(R.drawable.item_drum_of_endurance);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "observer_ward";
                startingItems5OnClick = "observer_ward";
                startingItems6OnClick = "iron_branch";
                startingItems7OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "ring_of_basilius";
                earlyGame3OnClick = "headdress";

                midGame1OnClick = "arcane_boots";
                midGame2OnClick = "mekansm";

                lateGame1OnClick = "guardian_greaves";
                lateGame2OnClick = "aghanims_scepter";

                popularItems1OnClick = "arcane_boots";
                popularItems2OnClick = "mekansm";
                popularItems3OnClick = "aghanims_scepter";
                popularItems4OnClick = "guardian_greaves";
                popularItems5OnClick = "ring_of_basilius";
                popularItems6OnClick = "boots_of_speed";
                popularItems7OnClick = "hand_of_midas";
                popularItems8OnClick = "vladmirs_offering";
                popularItems9OnClick = "helm_of_the_dominator";
                popularItems10OnClick = "force_staff";
                popularItems11OnClick = "wind_lace";
                popularItems12OnClick = "drum_of_endurance";
                break;


            case "Crystal Maiden":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_observer_ward);
                startingItems6.setImageResource(R.drawable.item_observer_ward);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_wind_lace);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_tranquil_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_glimmer_cape);
                lateGame2.setImageResource(R.drawable.item_black_king_bar);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_tranquil_boots);
                popularItems2.setImageResource(R.drawable.item_glimmer_cape);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_force_staff);
                popularItems5.setImageResource(R.drawable.item_blink_dagger);
                popularItems6.setImageResource(R.drawable.item_hand_of_midas);
                popularItems7.setImageResource(R.drawable.item_ghost_scepter);
                popularItems8.setImageResource(R.drawable.item_wind_lace);
                popularItems9.setImageResource(R.drawable.item_drum_of_endurance);
                popularItems10.setImageResource(R.drawable.item_rod_of_atos);
                popularItems11.setImageResource(R.drawable.item_bracer);
                popularItems12.setImageResource(R.drawable.item_aghanims_scepter);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "ironwood_branch";
                startingItems5OnClick = "observer_ward";
                startingItems6OnClick = "observer_ward";

                earlyGame1OnClick = "wind_lace";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "boots_of_speed";

                midGame1OnClick = "tranquil_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "blink_dagger";

                lateGame1OnClick = "glimmer_cape";
                lateGame2OnClick = "black_king_bar";

                popularItems1OnClick = "tranquil_boots";
                popularItems2OnClick = "glimmer_cape";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "force_staff";
                popularItems5OnClick = "blink_dagger";
                popularItems6OnClick = "hand_of_midas";
                popularItems7OnClick = "ghost_scepter";
                popularItems8OnClick = "wind_lace";
                popularItems9OnClick = "drum_of_endurance";
                popularItems10OnClick = "rod_of_atos";
                popularItems11OnClick = "bracer";
                popularItems12OnClick = "aghanims_scepter";
                break;


            case "Dark Seer":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_soul_ring);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_arcane_boots);
                midGame2.setImageResource(R.drawable.item_mekansm);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_guardian_greaves);
                lateGame2.setImageResource(R.drawable.item_shivas_guard);
                lateGame3.setImageResource(R.drawable.item_pipe_of_insight);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_soul_ring);
                popularItems2.setImageResource(R.drawable.item_guardian_greaves);
                popularItems3.setImageResource(R.drawable.item_blink_dagger);
                popularItems4.setImageResource(R.drawable.item_ironwood_branch);
                popularItems5.setImageResource(R.drawable.item_pipe_of_insight);
                popularItems6.setImageResource(R.drawable.item_arcane_boots);
                popularItems7.setImageResource(R.drawable.item_mekansm);
                popularItems8.setImageResource(R.drawable.item_shivas_guard);
                popularItems9.setImageResource(R.drawable.item_magic_wand);
                popularItems10.setImageResource(R.drawable.item_force_staff);
                popularItems11.setImageResource(R.drawable.item_lotus_orb);
                popularItems12.setImageResource(R.drawable.item_hand_of_midas);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "soul_ring";
                earlyGame2OnClick = "boots_of_speed";

                midGame1OnClick = "arcane_boots";
                midGame2OnClick = "mekansm";
                midGame3OnClick = "blink_dagger";

                lateGame1OnClick = "guardian_greaves";
                lateGame2OnClick = "shivas_guard";
                lateGame3OnClick = "pipe_of_insight";

                popularItems1OnClick = "soul_ring";
                popularItems2OnClick = "guardian_greaves";
                popularItems3OnClick = "blink_dagger";
                popularItems4OnClick = "iron_branch";
                popularItems5OnClick = "pipe_of_insight";
                popularItems6OnClick = "arcane_boots";
                popularItems7OnClick = "mekansm";
                popularItems8OnClick = "shivas_guard";
                popularItems9OnClick = "magic_wand";
                popularItems10OnClick = "force_staff";
                popularItems11OnClick = "lotus_orb";
                popularItems12OnClick = "hand_of_midas";
                break;

            case "Dark Willow":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_clarity);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_arcane_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_mekansm);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_guardian_greaves);
                lateGame2.setImageResource(R.drawable.item_blink_dagger);
                lateGame3.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_arcane_boots);
                popularItems2.setImageResource(R.drawable.item_mekansm);
                popularItems3.setImageResource(R.drawable.item_guardian_greaves);
                popularItems4.setImageResource(R.drawable.item_rod_of_atos);
                popularItems5.setImageResource(R.drawable.item_blink_dagger);
                popularItems6.setImageResource(R.drawable.item_force_staff);
                popularItems7.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems8.setImageResource(R.drawable.item_pipe_of_insight);
                popularItems9.setImageResource(R.drawable.item_shivas_guard);
                popularItems10.setImageResource(R.drawable.item_aether_lens);
                popularItems11.setImageResource(R.drawable.item_glimmer_cape);
                popularItems12.setImageResource(R.drawable.item_dagon);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "clarity";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";

                midGame1OnClick = "arcane_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "mekansm";

                lateGame1OnClick = "guardian_greaves";
                lateGame2OnClick = "blink_dagger";
                lateGame3OnClick = "euls_scepter_of_divinity";

                popularItems1OnClick = "arcane_boots";
                popularItems2OnClick = "mekansm";
                popularItems3OnClick = "guardian_greaves";
                popularItems4OnClick = "rod_of_atos";
                popularItems5OnClick = "blink_dagger";
                popularItems6OnClick = "force_staff";
                popularItems7OnClick = "euls_scepter_of_divinity";
                popularItems8OnClick = "pipe_of_insight";
                popularItems9OnClick = "shivas_guard";
                popularItems10OnClick = "aether_lens";
                popularItems11OnClick = "glimmer_cape";
                popularItems12OnClick = "dagon";
                break;

            case "Dazzle":
                startingItems1.setImageResource(R.drawable.item_ironwood_branch);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_clarity);
                startingItems5.setImageResource(R.drawable.item_tango);
                startingItems6.setImageResource(R.drawable.item_observer_ward);
                startingItems7.setImageResource(R.drawable.item_observer_ward);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_urn_of_shadows);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_arcane_boots);
                midGame3.setImageResource(R.drawable.item_medallion_of_courage);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_mekansm);
                lateGame2.setImageResource(R.drawable.item_force_staff);
                lateGame3.setImageResource(R.drawable.item_guardian_greaves);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_arcane_boots);
                popularItems2.setImageResource(R.drawable.item_magic_wand);
                popularItems3.setImageResource(R.drawable.item_solar_crest);
                popularItems4.setImageResource(R.drawable.item_glimmer_cape);
                popularItems5.setImageResource(R.drawable.item_boots_of_speed);
                popularItems6.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems7.setImageResource(R.drawable.item_wind_lace);
                popularItems8.setImageResource(R.drawable.item_medallion_of_courage);
                popularItems9.setImageResource(R.drawable.item_force_staff);
                popularItems10.setImageResource(R.drawable.item_magic_stick);
                popularItems11.setImageResource(R.drawable.item_mekansm);
                popularItems12.setImageResource(R.drawable.item_guardian_greaves);

                startingItems1OnClick = "iron_branch";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "clarity";
                startingItems5OnClick = "tango";
                startingItems6OnClick = "observer_ward";
                startingItems7OnClick = "observer_ward";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "urn_of_shadows";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "arcane_boots";
                midGame3OnClick = "medallion_of_courage";

                lateGame1OnClick = "mekansm";
                lateGame2OnClick = "force_staff";
                lateGame3OnClick = "guardian_greaves";

                popularItems1OnClick = "arcane_boots";
                popularItems2OnClick = "magic_wand";
                popularItems3OnClick = "solar_crest";
                popularItems4OnClick = "glimmer_cape";
                popularItems5OnClick = "boots_of_speed";
                popularItems6OnClick = "urn_of_shadows";
                popularItems7OnClick = "wind_lace";
                popularItems8OnClick = "medallion_of_courage";
                popularItems9OnClick = "force_staff";
                popularItems10OnClick = "magic_stick";
                popularItems11OnClick = "mekansm";
                popularItems12OnClick = "guardian_greaves";
                break;


            case "Death Prophet":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_null_talisman);
                startingItems3.setVisibility(View.INVISIBLE);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_bottle);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_magic_stick);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_phase_boots);
                midGame3.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_octarine_core);
                lateGame2.setImageResource(R.drawable.item_shivas_guard);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems2.setImageResource(R.drawable.item_phase_boots);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_octarine_core);
                popularItems5.setImageResource(R.drawable.item_bottle);
                popularItems6.setImageResource(R.drawable.item_veil_of_discord);
                popularItems7.setImageResource(R.drawable.item_rod_of_atos);
                popularItems8.setImageResource(R.drawable.item_black_king_bar);
                popularItems9.setImageResource(R.drawable.item_shivas_guard);
                popularItems10.setImageResource(R.drawable.item_null_talisman);
                popularItems11.setImageResource(R.drawable.item_solar_crest);
                popularItems12.setImageResource(R.drawable.item_boots_of_travel);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "null_talisman";

                earlyGame1OnClick = "bottle";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "magic_stick";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "phase_boots";
                midGame3OnClick = "euls_scepter_of_divinity";

                lateGame1OnClick = "octarine_core";
                lateGame2OnClick = "shivas_guard";

                popularItems1OnClick = "euls_scepter_of_divinity";
                popularItems2OnClick = "phase_boots";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "octarine_core";
                popularItems5OnClick = "bottle";
                popularItems6OnClick = "veil_of_discord";
                popularItems7OnClick = "rod_of_atos";
                popularItems8OnClick = "black_king_bar";
                popularItems9OnClick = "shivas_guard";
                popularItems10OnClick = "null_talisman";
                popularItems11OnClick = "solar_crest";
                popularItems12OnClick = "boots_of_travel";
                break;


            case "Disruptor":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_observer_ward);
                startingItems6.setImageResource(R.drawable.item_observer_ward);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_arcane_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_force_staff);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aether_lens);
                lateGame2.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_arcane_boots);
                popularItems2.setImageResource(R.drawable.item_magic_wand);
                popularItems3.setImageResource(R.drawable.item_glimmer_cape);
                popularItems4.setImageResource(R.drawable.item_force_staff);
                popularItems5.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems6.setImageResource(R.drawable.item_wind_lace);
                popularItems7.setImageResource(R.drawable.item_tranquil_boots);
                popularItems8.setImageResource(R.drawable.item_boots_of_speed);
                popularItems9.setImageResource(R.drawable.item_ghost_scepter);
                popularItems10.setImageResource(R.drawable.item_hand_of_midas);
                popularItems11.setImageResource(R.drawable.item_blink_dagger);
                popularItems12.setImageResource(R.drawable.item_urn_of_shadows);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "observer_ward";
                startingItems6OnClick = "observer_ward";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";

                midGame1OnClick = "arcane_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "force_staff";

                lateGame1OnClick = "aether_lens";
                lateGame2OnClick = "aghanims_scepter";

                popularItems1OnClick = "arcane_boots";
                popularItems2OnClick = "magic_wand";
                popularItems3OnClick = "glimmer_cape";
                popularItems4OnClick = "force_staff";
                popularItems5OnClick = "aghanims_scepter";
                popularItems6OnClick = "wind_lace";
                popularItems7OnClick = "tranquil_boots";
                popularItems8OnClick = "boots_of_speed";
                popularItems9OnClick = "ghost_scepter";
                popularItems10OnClick = "hand_of_midas";
                popularItems11OnClick = "blink_dagger";
                popularItems12OnClick = "urn_of_shadows";
                break;


            case "Enchantress":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_dragon_lance);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame2.setImageResource(R.drawable.item_hurricane_pike);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_hurricane_pike);
                popularItems2.setImageResource(R.drawable.item_phase_boots);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_drum_of_endurance);
                popularItems5.setImageResource(R.drawable.item_hand_of_midas);
                popularItems6.setImageResource(R.drawable.item_power_treads);
                popularItems7.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems8.setImageResource(R.drawable.item_dragon_lance);
                popularItems9.setImageResource(R.drawable.item_wind_lace);
                popularItems10.setImageResource(R.drawable.item_rod_of_atos);
                popularItems11.setImageResource(R.drawable.item_orchid_malevolence);
                popularItems12.setImageResource(R.drawable.item_ogre_axe);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "dragon_lance";

                lateGame1OnClick = "aghanims_scepter";
                lateGame2OnClick = "hurricane_pike";

                popularItems1OnClick = "hurricane_pike";
                popularItems2OnClick = "phase_boots";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "drum_of_endurance";
                popularItems5OnClick = "hand_of_midas";
                popularItems6OnClick = "power_treads";
                popularItems7OnClick = "aghanims_scepter";
                popularItems8OnClick = "dragon_lance";
                popularItems9OnClick = "wind_lace";
                popularItems10OnClick = "rod_of_atos";
                popularItems11OnClick = "orchid_malevolence";
                popularItems12OnClick = "ogre_axe";
                break;



            case "Enigma":
                startingItems1.setImageResource(R.drawable.item_clarity);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_tango);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_soul_ring);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_magic_stick);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_blink_dagger);
                midGame3.setImageResource(R.drawable.item_arcane_boots);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_mekansm);
                lateGame2.setImageResource(R.drawable.item_black_king_bar);
                lateGame3.setImageResource(R.drawable.item_guardian_greaves);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_blink_dagger);
                popularItems2.setImageResource(R.drawable.item_hand_of_midas);
                popularItems3.setImageResource(R.drawable.item_black_king_bar);
                popularItems4.setImageResource(R.drawable.item_soul_ring);
                popularItems5.setImageResource(R.drawable.item_guardian_greaves);
                popularItems6.setImageResource(R.drawable.item_arcane_boots);
                popularItems7.setImageResource(R.drawable.item_boots_of_speed);
                popularItems8.setImageResource(R.drawable.item_octarine_core);
                popularItems9.setImageResource(R.drawable.item_refresher_orb);
                popularItems10.setImageResource(R.drawable.item_mekansm);
                popularItems11.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems12.setImageResource(R.drawable.item_boots_of_travel);

                startingItems1OnClick = "clarity";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "tango";

                earlyGame1OnClick = "soul_ring";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "magic_stick";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "blink_dagger";
                midGame3OnClick = "arcane_boots";

                lateGame1OnClick = "mekansm";
                lateGame2OnClick = "black_king_bar";
                lateGame3OnClick = "guardian_greaves";

                popularItems1OnClick = "blink_dagger";
                popularItems2OnClick = "hand_of_midas";
                popularItems3OnClick = "black_king_bar";
                popularItems4OnClick = "soul_ring";
                popularItems5OnClick = "guardian_greaves";
                popularItems6OnClick = "arcane_boots";
                popularItems7OnClick = "boots_of_speed";
                popularItems8OnClick = "octarine_core";
                popularItems9OnClick = "refresher_orb";
                popularItems10OnClick = "mekansm";
                popularItems11OnClick = "aghanims_scepter";
                popularItems12OnClick = "boots_of_travel";
                break;


            case "Grimstroke":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_circlet);
                startingItems5.setImageResource(R.drawable.item_mantle_of_intelligence);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_null_talisman);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_arcane_boots);
                midGame2.setImageResource(R.drawable.item_aether_lens);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_glimmer_cape);
                lateGame2.setImageResource(R.drawable.item_force_staff);
                lateGame3.setImageResource(R.drawable.item_scythe_of_vyse);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_glimmer_cape);
                popularItems2.setImageResource(R.drawable.item_arcane_boots);
                popularItems3.setImageResource(R.drawable.item_scythe_of_vyse);
                popularItems4.setImageResource(R.drawable.item_orchid_malevolence);
                popularItems5.setImageResource(R.drawable.item_nullifier);
                popularItems6.setImageResource(R.drawable.item_rod_of_atos);
                popularItems7.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems8.setImageResource(R.drawable.item_force_staff);
                popularItems9.setImageResource(R.drawable.item_ethereal_blade);
                popularItems10.setImageResource(R.drawable.item_dagon);
                popularItems11.setImageResource(R.drawable.item_shivas_guard);
                popularItems12.setImageResource(R.drawable.item_linkens_sphere);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "circlet";
                startingItems5OnClick = "mantle_of_intelligence";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "null_talisman";

                midGame1OnClick = "arcane_boots";
                midGame2OnClick = "aether_lens";

                lateGame1OnClick = "glimmer_cape";
                lateGame2OnClick = "force_staff";
                lateGame3OnClick = "scythe_of_vyse";

                popularItems1OnClick = "glimmer_cape";
                popularItems2OnClick = "arcane_boots";
                popularItems3OnClick = "scythe_of_vyse";
                popularItems4OnClick = "orchid_malevolence";
                popularItems5OnClick = "nullifier";
                popularItems6OnClick = "rod_of_atos";
                popularItems7OnClick = "euls_scepter_of_divinity";
                popularItems8OnClick = "force_staff";
                popularItems9OnClick = "etheral_blade";
                popularItems10OnClick = "dagon";
                popularItems11OnClick = "shivas_guard";
                popularItems12OnClick = "linkens_sphere";
                break;



            case "Invoker":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_null_talisman);
                startingItems3.setVisibility(View.INVISIBLE);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_hand_of_midas);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_phase_boots);
                midGame2.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame2.setImageResource(R.drawable.item_blink_dagger);
                lateGame3.setImageResource(R.drawable.item_scythe_of_vyse);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems2.setImageResource(R.drawable.item_hand_of_midas);
                popularItems3.setImageResource(R.drawable.item_boots_of_travel);
                popularItems4.setImageResource(R.drawable.item_blink_dagger);
                popularItems5.setImageResource(R.drawable.item_null_talisman);
                popularItems6.setImageResource(R.drawable.item_linkens_sphere);
                popularItems7.setImageResource(R.drawable.item_octarine_core);
                popularItems8.setImageResource(R.drawable.item_magic_wand);
                popularItems9.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems10.setImageResource(R.drawable.item_boots_of_speed);
                popularItems11.setImageResource(R.drawable.item_black_king_bar);
                popularItems12.setImageResource(R.drawable.item_shivas_guard);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "null_talisman";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "hand_of_midas";

                midGame1OnClick = "phase_boots";
                midGame2OnClick = "euls_scepter_of_divinity";

                lateGame1OnClick = "aghanims_scepter";
                lateGame2OnClick = "blink_dagger";
                lateGame3OnClick = "scythe_of_vyse";

                popularItems1OnClick = "aghanims_scepter";
                popularItems2OnClick = "hand_of_midas";
                popularItems3OnClick = "boots_of_travel";
                popularItems4OnClick = "blink_dagger";
                popularItems5OnClick = "null_talisman";
                popularItems6OnClick = "linkens_sphere";
                popularItems7OnClick = "octarine_core";
                popularItems8OnClick = "magic_wand";
                popularItems9OnClick = "euls_scepter_of_divinity";
                popularItems10OnClick = "boots_of_speed";
                popularItems11OnClick = "black_king_bar";
                popularItems12OnClick = "shivas_guard";
                break;




            case "Jakiro":
                startingItems1.setImageResource(R.drawable.item_observer_ward);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_wind_lace);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_magic_stick);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_arcane_boots);
                midGame3.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_mekansm);
                lateGame2.setImageResource(R.drawable.item_force_staff);
                lateGame3.setImageResource(R.drawable.item_veil_of_discord);
                lateGame4.setImageResource(R.drawable.item_guardian_greaves);

                popularItems1.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems2.setImageResource(R.drawable.item_tranquil_boots);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_force_staff);
                popularItems5.setImageResource(R.drawable.item_arcane_boots);
                popularItems6.setImageResource(R.drawable.item_glimmer_cape);
                popularItems7.setImageResource(R.drawable.item_wind_lace);
                popularItems8.setImageResource(R.drawable.item_veil_of_discord);
                popularItems9.setImageResource(R.drawable.item_boots_of_speed);
                popularItems10.setImageResource(R.drawable.item_rod_of_atos);
                popularItems11.setImageResource(R.drawable.item_aether_lens);
                popularItems12.setImageResource(R.drawable.item_urn_of_shadows);

                startingItems1OnClick = "observer_ward";
                startingItems2OnClick = "tango";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "iron_branch";

                earlyGame1OnClick = "wind_lace";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "magic_stick";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "arcane_boots";
                midGame3OnClick = "euls_scepter_of_divinity";

                lateGame1OnClick = "mekansm";
                lateGame2OnClick = "force_staff";
                lateGame3OnClick = "veil_of_discord";
                lateGame4OnClick = "guardian_greaves";

                popularItems1OnClick = "euls_scepter_of_divinity";
                popularItems2OnClick = "tranquil_boots";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "force_staff";
                popularItems5OnClick = "arcane_boots";
                popularItems6OnClick = "glimmer_cape";
                popularItems7OnClick = "wind_lace";
                popularItems8OnClick = "veil_of_discord";
                popularItems9OnClick = "boots_of_speed";
                popularItems10OnClick = "rod_of_atos";
                popularItems11OnClick = "aether_lens";
                popularItems12OnClick = "urn_of_shadows";
                break;




            case "Keeper Of The Light":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_observer_ward);
                startingItems4.setImageResource(R.drawable.item_wind_lace);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_tranquil_boots);
                midGame2.setImageResource(R.drawable.item_aghanims_scepter);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_mekansm);
                lateGame2.setImageResource(R.drawable.item_force_staff);
                lateGame3.setImageResource(R.drawable.item_glimmer_cape);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_tranquil_boots);
                popularItems2.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems3.setImageResource(R.drawable.item_force_staff);
                popularItems4.setImageResource(R.drawable.item_glimmer_cape);
                popularItems5.setImageResource(R.drawable.item_magic_wand);
                popularItems6.setImageResource(R.drawable.item_ghost_scepter);
                popularItems7.setImageResource(R.drawable.item_wind_lace);
                popularItems8.setImageResource(R.drawable.item_hand_of_midas);
                popularItems9.setImageResource(R.drawable.item_magic_stick);
                popularItems10.setImageResource(R.drawable.item_point_booster);
                popularItems11.setImageResource(R.drawable.item_aether_lens);
                popularItems12.setImageResource(R.drawable.item_boots_of_travel);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "observer_ward";
                startingItems4OnClick = "wind_lace";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";

                midGame1OnClick = "tranquil_boots";
                midGame2OnClick = "aghanims_scepter";

                lateGame1OnClick = "mekansm";
                lateGame2OnClick = "force_staff";
                lateGame3OnClick = "glimmer_cape";

                popularItems1OnClick = "tranquil_boots";
                popularItems2OnClick = "aghanims_scepter";
                popularItems3OnClick = "force_staff";
                popularItems4OnClick = "glimmer_cape";
                popularItems5OnClick = "magic_wand";
                popularItems6OnClick = "ghost_scepter";
                popularItems7OnClick = "wind_lace";
                popularItems8OnClick = "hand_of_midas";
                popularItems9OnClick = "magic_stick";
                popularItems10OnClick = "point_booster";
                popularItems11OnClick = "aether_lens";
                popularItems12OnClick = "boots_of_travel";
                break;



            case "Leshrac":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_null_talisman);
                startingItems3.setVisibility(View.INVISIBLE);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_bottle);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame4.setImageResource(R.drawable.item_wind_lace);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_phase_boots);
                midGame3.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                midGame4.setImageResource(R.drawable.item_bloodstone);

                lateGame1.setImageResource(R.drawable.item_shivas_guard);
                lateGame2.setImageResource(R.drawable.item_octarine_core);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems2.setImageResource(R.drawable.item_magic_wand);
                popularItems3.setImageResource(R.drawable.item_bloodstone);
                popularItems4.setImageResource(R.drawable.item_arcane_boots);
                popularItems5.setImageResource(R.drawable.item_boots_of_travel);
                popularItems6.setImageResource(R.drawable.item_boots_of_speed);
                popularItems7.setImageResource(R.drawable.item_glimmer_cape);
                popularItems8.setImageResource(R.drawable.item_ghost_scepter);
                popularItems9.setImageResource(R.drawable.item_wind_lace);
                popularItems10.setImageResource(R.drawable.item_tranquil_boots);
                popularItems11.setImageResource(R.drawable.item_rod_of_atos);
                popularItems12.setImageResource(R.drawable.item_bottle);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "null_talisman";

                earlyGame1OnClick = "bottle";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "boots_of_speed";
                earlyGame4OnClick = "wind_lace";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "phase_boots";
                midGame3OnClick = "euls_scepter_of_divinity";
                midGame4OnClick = "bloodstone";

                lateGame1OnClick = "shivas_guard";
                lateGame2OnClick = "octarine_core";

                popularItems1OnClick = "euls_scepter_of_divinity";
                popularItems2OnClick = "magic_wand";
                popularItems3OnClick = "bloodstone";
                popularItems4OnClick = "arcane_boots";
                popularItems5OnClick = "boots_of_travel";
                popularItems6OnClick = "boots_of_speed";
                popularItems7OnClick = "glimmer_cape";
                popularItems8OnClick = "ghost_scepter";
                popularItems9OnClick = "wind_lace";
                popularItems10OnClick = "tranquil_boots";
                popularItems11OnClick = "rod_of_atos";
                popularItems12OnClick = "bottle";
                break;



            case "Lich":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_wind_lace);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_tranquil_boots);
                midGame2.setImageResource(R.drawable.item_mekansm);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_force_staff);
                lateGame2.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_tranquil_boots);
                popularItems2.setImageResource(R.drawable.item_magic_wand);
                popularItems3.setImageResource(R.drawable.item_glimmer_cape);
                popularItems4.setImageResource(R.drawable.item_force_staff);
                popularItems5.setImageResource(R.drawable.item_hand_of_midas);
                popularItems6.setImageResource(R.drawable.item_mekansm);
                popularItems7.setImageResource(R.drawable.item_wind_lace);
                popularItems8.setImageResource(R.drawable.item_ghost_scepter);
                popularItems9.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems10.setImageResource(R.drawable.item_rod_of_atos);
                popularItems11.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems12.setImageResource(R.drawable.item_euls_scepter_of_divinity);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "wind_lace";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";

                midGame1OnClick = "tranquil_boots";
                midGame2OnClick = "mekansm";

                lateGame1OnClick = "force_staff";
                lateGame2OnClick = "aghanims_scepter";

                popularItems1OnClick = "tranquil_boots";
                popularItems2OnClick = "magic_wand";
                popularItems3OnClick = "glimmer_cape";
                popularItems4OnClick = "force_staff";
                popularItems5OnClick = "hand_of_midas";
                popularItems6OnClick = "mekansm";
                popularItems7OnClick = "wind_lace";
                popularItems8OnClick = "ghost_scepter";
                popularItems9OnClick = "aghanims_scepter";
                popularItems10OnClick = "rod_of_atos";
                popularItems11OnClick = "urn_of_shadows";
                popularItems12OnClick = "euls_scepter_of_divinity";
                break;



            case "Lina":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_wind_lace);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_arcane_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                midGame4.setImageResource(R.drawable.item_aether_lens);

                lateGame1.setImageResource(R.drawable.item_force_staff);
                lateGame2.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_bloodstone);
                popularItems2.setImageResource(R.drawable.item_boots_of_travel);
                popularItems3.setImageResource(R.drawable.item_shadowblade);
                popularItems4.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems5.setImageResource(R.drawable.item_null_talisman);
                popularItems6.setImageResource(R.drawable.item_bottle);
                popularItems7.setImageResource(R.drawable.item_magic_wand);
                popularItems8.setImageResource(R.drawable.item_black_king_bar);
                popularItems9.setImageResource(R.drawable.item_boots_of_speed);
                popularItems10.setImageResource(R.drawable.item_linkens_sphere);
                popularItems11.setImageResource(R.drawable.item_shivas_guard);
                popularItems12.setImageResource(R.drawable.item_aghanims_scepter);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "wind_lace";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";

                midGame1OnClick = "arcane_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "euls_scepter_of_divinity";
                midGame4OnClick = "aether_lens";

                lateGame1OnClick = "force_staff";
                lateGame2OnClick = "aghanims_scepter";

                popularItems1OnClick = "bloodstone";
                popularItems2OnClick = "boots_of_travel";
                popularItems3OnClick = "shadow_blade";
                popularItems4OnClick = "euls_scepter_of_divinity";
                popularItems5OnClick = "null_talisman";
                popularItems6OnClick = "bottle";
                popularItems7OnClick = "magic_wand";
                popularItems8OnClick = "black_king_bar";
                popularItems9OnClick = "boots_of_speed";
                popularItems10OnClick = "linkens_sphere";
                popularItems11OnClick = "shivas_guard";
                popularItems12OnClick = "aghanims_scepter";
                break;



            case "Lion":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_ironwood_branch);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_wind_lace);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_tranquil_boots);
                midGame3.setImageResource(R.drawable.item_wind_lace);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_blink_dagger);
                lateGame2.setImageResource(R.drawable.item_aether_lens);
                lateGame3.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_tranquil_boots);
                popularItems2.setImageResource(R.drawable.item_blink_dagger);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_glimmer_cape);
                popularItems5.setImageResource(R.drawable.item_force_staff);
                popularItems6.setImageResource(R.drawable.item_ghost_scepter);
                popularItems7.setImageResource(R.drawable.item_aether_lens);
                popularItems8.setImageResource(R.drawable.item_wind_lace);
                popularItems9.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems10.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems11.setImageResource(R.drawable.item_bracer);
                popularItems12.setImageResource(R.drawable.item_magic_stick);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "iron_branch";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "wind_lace";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "tranquil_boots";
                midGame3OnClick = "wind_lace";

                lateGame1OnClick = "blink_dagger";
                lateGame2OnClick = "aether_lens";
                lateGame3OnClick = "euls_scepter_of_divinity";

                popularItems1OnClick = "tranquil_boots";
                popularItems2OnClick = "blink_dagger";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "glimmer_cape";
                popularItems5OnClick = "force_staff";
                popularItems6OnClick = "ghost_scepter";
                popularItems7OnClick = "aether_lens";
                popularItems8OnClick = "wind_lace";
                popularItems9OnClick = "euls_scepter_of_divinity";
                popularItems10OnClick = "aghanims_scepter";
                popularItems11OnClick = "bracer";
                popularItems12OnClick = "magic_stick";
                break;


            case "Natures Prophet":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_ring_of_protection);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_clarity);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_ring_of_basilius);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_dragon_lance);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_maelstrom);
                lateGame2.setImageResource(R.drawable.item_silver_edge);
                lateGame3.setImageResource(R.drawable.item_scythe_of_vyse);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_phase_boots);
                popularItems2.setImageResource(R.drawable.item_hand_of_midas);
                popularItems3.setImageResource(R.drawable.item_shadowblade);
                popularItems4.setImageResource(R.drawable.item_orchid_malevolence);
                popularItems5.setImageResource(R.drawable.item_power_treads);
                popularItems6.setImageResource(R.drawable.item_bloodthorn);
                popularItems7.setImageResource(R.drawable.item_maelstrom);
                popularItems8.setImageResource(R.drawable.item_null_talisman);
                popularItems9.setImageResource(R.drawable.item_silver_edge);
                popularItems10.setImageResource(R.drawable.item_drum_of_endurance);
                popularItems11.setImageResource(R.drawable.item_scythe_of_vyse);
                popularItems12.setImageResource(R.drawable.item_hurricane_pike);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "ring_of_protection";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "clarity";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "ring_of_basilius";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "dragon_lance";

                lateGame1OnClick = "maelstrom";
                lateGame2OnClick = "silver_edge";
                lateGame3OnClick = "scythe_of_vyse";

                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "hand_of_midas";
                popularItems3OnClick = "shadow_blade";
                popularItems4OnClick = "orchid_malevolence";
                popularItems5OnClick = "power_treads";
                popularItems6OnClick = "bloodthorn";
                popularItems7OnClick = "maelstrom";
                popularItems8OnClick = "null_talisman";
                popularItems9OnClick = "silver_edge";
                popularItems10OnClick = "drum_of_endurance";
                popularItems11OnClick = "scythe_of_vyse";
                popularItems12OnClick = "hurricane_pike";
                break;


            case "Necrophos":
                startingItems1.setImageResource(R.drawable.item_ironwood_branch);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_enchanted_mango);
                startingItems4.setImageResource(R.drawable.item_healing_salve);
                startingItems5.setImageResource(R.drawable.item_tango);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_headdress);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_arcane_boots);
                midGame3.setImageResource(R.drawable.item_mekansm);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_guardian_greaves);
                lateGame2.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame3.setImageResource(R.drawable.item_blink_dagger);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_magic_wand);
                popularItems2.setImageResource(R.drawable.item_blink_dagger);
                popularItems3.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems4.setImageResource(R.drawable.item_phase_boots);
                popularItems5.setImageResource(R.drawable.item_veil_of_discord);
                popularItems6.setImageResource(R.drawable.item_guardian_greaves);
                popularItems7.setImageResource(R.drawable.item_blade_mail);
                popularItems8.setImageResource(R.drawable.item_hand_of_midas);
                popularItems9.setImageResource(R.drawable.item_dagon);
                popularItems10.setImageResource(R.drawable.item_power_treads);
                popularItems11.setImageResource(R.drawable.item_force_staff);
                popularItems12.setImageResource(R.drawable.item_arcane_boots);

                startingItems1OnClick = "iron_branch";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "enchanted_mango";
                startingItems4OnClick = "healing_salve";
                startingItems5OnClick = "tango";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "headdress";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "arcane_boots";
                midGame3OnClick = "mekansm";

                lateGame1OnClick = "guardian_greaves";
                lateGame2OnClick = "aghanims_scepter";
                lateGame3OnClick = "blink_dagger";

                popularItems1OnClick = "magic_wand";
                popularItems2OnClick = "blink_dagger";
                popularItems3OnClick = "aghanims_scepter";
                popularItems4OnClick = "phase_boots";
                popularItems5OnClick = "veil_of_discord";
                popularItems6OnClick = "guardian_greaves";
                popularItems7OnClick = "blade_mail";
                popularItems8OnClick = "hand_of_midas";
                popularItems9OnClick = "dagon";
                popularItems10OnClick = "power_treads";
                popularItems11OnClick = "force_staff";
                popularItems12OnClick = "arcane_boots";
                break;



            case "Ogre Magi":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_enchanted_mango);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_orb_of_venom);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_magic_stick);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_arcane_boots);
                midGame3.setImageResource(R.drawable.item_force_staff);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame2.setImageResource(R.drawable.item_aether_lens);
                lateGame3.setImageResource(R.drawable.item_ghost_scepter);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_arcane_boots);
                popularItems2.setImageResource(R.drawable.item_magic_wand);
                popularItems3.setImageResource(R.drawable.item_force_staff);
                popularItems4.setImageResource(R.drawable.item_orb_of_venom);
                popularItems5.setImageResource(R.drawable.item_glimmer_cape);
                popularItems6.setImageResource(R.drawable.item_wind_lace);
                popularItems7.setImageResource(R.drawable.item_boots_of_speed);
                popularItems8.setImageResource(R.drawable.item_tranquil_boots);
                popularItems9.setImageResource(R.drawable.item_aether_lens);
                popularItems10.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems11.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems12.setImageResource(R.drawable.item_ghost_scepter);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "enchanted_mango";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "orb_of_venom";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "magic_stick";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "arcane_boots";
                midGame3OnClick = "force_staff";

                lateGame1OnClick = "aghanims_scepter";
                lateGame2OnClick = "aether_lens";
                lateGame3OnClick = "ghost_scepter";

                popularItems1OnClick = "arcane_boots";
                popularItems2OnClick = "magic_wand";
                popularItems3OnClick = "force_staff";
                popularItems4OnClick = "orb_of_venom";
                popularItems5OnClick = "glimmer_cape";
                popularItems6OnClick = "wind_lace";
                popularItems7OnClick = "boots_of_speed";
                popularItems8OnClick = "tranquil_boots";
                popularItems9OnClick = "aether_lens";
                popularItems10OnClick = "urn_of_shadows";
                popularItems11OnClick = "euls_scepter_of_divinity";
                popularItems12OnClick = "ghost_scepter";
                break;





            case "Oracle":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_wind_lace);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_arcane_boots);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aether_lens);
                lateGame2.setImageResource(R.drawable.item_force_staff);
                lateGame3.setImageResource(R.drawable.item_guardian_greaves);
                lateGame4.setImageResource(R.drawable.item_euls_scepter_of_divinity);

                popularItems1.setImageResource(R.drawable.item_arcane_boots);
                popularItems2.setImageResource(R.drawable.item_magic_wand);
                popularItems3.setImageResource(R.drawable.item_glimmer_cape);
                popularItems4.setImageResource(R.drawable.item_wind_lace);
                popularItems5.setImageResource(R.drawable.item_aether_lens);
                popularItems6.setImageResource(R.drawable.item_force_staff);
                popularItems7.setImageResource(R.drawable.item_boots_of_speed);
                popularItems8.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems9.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems10.setImageResource(R.drawable.item_guardian_greaves);
                popularItems11.setImageResource(R.drawable.item_ghost_scepter);
                popularItems12.setImageResource(R.drawable.item_magic_stick);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "wind_lace";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "arcane_boots";

                lateGame1OnClick = "aether_lens";
                lateGame2OnClick = "force_staff";
                lateGame3OnClick = "guardian_greaves";
                lateGame4OnClick = "euls_scepter_of_divinity";

                popularItems1OnClick = "arcane_boots";
                popularItems2OnClick = "magic_wand";
                popularItems3OnClick = "glimmer_cape";
                popularItems4OnClick = "wind_lace";
                popularItems5OnClick = "aether_lens";
                popularItems6OnClick = "force_staff";
                popularItems7OnClick = "boots_of_speed";
                popularItems8OnClick = "urn_of_shadows";
                popularItems9OnClick = "euls_scepter_of_divinity";
                popularItems10OnClick = "guardian_greaves";
                popularItems11OnClick = "ghost_scepter";
                popularItems12OnClick = "magic_stick";
                break;



            case "Outworld Devourer":
                startingItems1.setImageResource(R.drawable.item_null_talisman);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setVisibility(View.INVISIBLE);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_bottle);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_hurricane_pike);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_rod_of_atos);
                lateGame2.setImageResource(R.drawable.item_scythe_of_vyse);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_hurricane_pike);
                popularItems2.setImageResource(R.drawable.item_power_treads);
                popularItems3.setImageResource(R.drawable.item_blink_dagger);
                popularItems4.setImageResource(R.drawable.item_hand_of_midas);
                popularItems5.setImageResource(R.drawable.item_null_talisman);
                popularItems6.setImageResource(R.drawable.item_black_king_bar);
                popularItems7.setImageResource(R.drawable.item_magic_wand);
                popularItems8.setImageResource(R.drawable.item_scythe_of_vyse);
                popularItems9.setImageResource(R.drawable.item_shivas_guard);
                popularItems10.setImageResource(R.drawable.item_rod_of_atos);
                popularItems11.setImageResource(R.drawable.item_linkens_sphere);
                popularItems12.setImageResource(R.drawable.item_boots_of_travel);

                startingItems1OnClick = "null_talisman";
                startingItems2OnClick = "tango";

                earlyGame1OnClick = "bottle";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "boots_of_speed";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "hurricane_pike";

                lateGame1OnClick = "rod_of_atos";
                lateGame2OnClick = "scythe_of_vyse";

                popularItems1OnClick = "hurricane_pike";
                popularItems2OnClick = "power_treads";
                popularItems3OnClick = "blink_dagger";
                popularItems4OnClick = "hand_of_midas";
                popularItems5OnClick = "null_talisman";
                popularItems6OnClick = "black_king_bar";
                popularItems7OnClick = "magic_wand";
                popularItems8OnClick = "scythe_of_vyse";
                popularItems9OnClick = "shivas_guard";
                popularItems10OnClick = "rod_of_atos";
                popularItems11OnClick = "linkens_sphere";
                popularItems12OnClick = "boots_of_travel";
                break;



            case "Puck":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_null_talisman);
                startingItems3.setVisibility(View.INVISIBLE);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_bottle);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame4.setImageResource(R.drawable.item_wind_lace);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                lateGame2.setImageResource(R.drawable.item_scythe_of_vyse);
                lateGame3.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_blink_dagger);
                popularItems2.setImageResource(R.drawable.item_veil_of_discord);
                popularItems3.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems4.setImageResource(R.drawable.item_boots_of_travel);
                popularItems5.setImageResource(R.drawable.item_dagon);
                popularItems6.setImageResource(R.drawable.item_power_treads);
                popularItems7.setImageResource(R.drawable.item_bottle);
                popularItems8.setImageResource(R.drawable.item_magic_wand);
                popularItems9.setImageResource(R.drawable.item_linkens_sphere);
                popularItems10.setImageResource(R.drawable.item_hand_of_midas);
                popularItems11.setImageResource(R.drawable.item_boots_of_speed);
                popularItems12.setImageResource(R.drawable.item_aghanims_scepter);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "null_talisman";

                earlyGame1OnClick = "bottle";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "boots_of_speed";
                earlyGame4OnClick = "wind_lace";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "blink_dagger";

                lateGame1OnClick = "euls_scepter_of_divinity";
                lateGame2OnClick = "scythe_of_vyse";
                lateGame3OnClick = "aghanims_scepter";

                popularItems1OnClick = "blink_dagger";
                popularItems2OnClick = "veil_of_discord";
                popularItems3OnClick = "euls_scepter_of_divinity";
                popularItems4OnClick = "boots_of_travel";
                popularItems5OnClick = "dagon";
                popularItems6OnClick = "power_treads";
                popularItems7OnClick = "bottle";
                popularItems8OnClick = "magic_wand";
                popularItems9OnClick = "linkens_sphere";
                popularItems10OnClick = "hand_of_midas";
                popularItems11OnClick = "boots_of_speed";
                popularItems12OnClick = "aghanims_scepter";
                break;



            case "Pugna":
                startingItems1.setImageResource(R.drawable.item_ironwood_branch);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_enchanted_mango);
                startingItems4.setImageResource(R.drawable.item_tango);
                startingItems5.setImageResource(R.drawable.item_healing_salve);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_arcane_boots);
                midGame3.setImageResource(R.drawable.item_aether_lens);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame2.setImageResource(R.drawable.item_black_king_bar);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_aether_lens);
                popularItems2.setImageResource(R.drawable.item_magic_wand);
                popularItems3.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems4.setImageResource(R.drawable.item_boots_of_speed);
                popularItems5.setImageResource(R.drawable.item_arcane_boots);
                popularItems6.setImageResource(R.drawable.item_glimmer_cape);
                popularItems7.setImageResource(R.drawable.item_force_staff);
                popularItems8.setImageResource(R.drawable.item_boots_of_travel);
                popularItems9.setImageResource(R.drawable.item_tranquil_boots);
                popularItems10.setImageResource(R.drawable.item_wind_lace);
                popularItems11.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems12.setImageResource(R.drawable.item_rod_of_atos);

                startingItems1OnClick = "iron_branch";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "enchanted_mango";
                startingItems4OnClick = "tango";
                startingItems5OnClick = "healing_salve";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "arcane_boots";
                midGame3OnClick = "aether_lens";

                lateGame1OnClick = "aghanims_scepter";
                lateGame2OnClick = "black_king_bar";

                popularItems1OnClick = "aether_lens";
                popularItems2OnClick = "magic_wand";
                popularItems3OnClick = "aghanims_scepter";
                popularItems4OnClick = "boots_of_speed";
                popularItems5OnClick = "arcane_boots";
                popularItems6OnClick = "glimmer_cape";
                popularItems7OnClick = "force_staff";
                popularItems8OnClick = "boots_of_travel";
                popularItems9OnClick = "tranquil_boots";
                popularItems10OnClick = "wind_lace";
                popularItems11OnClick = "euls_scepter_of_divinity";
                popularItems12OnClick = "rod_of_atos";
                break;



            case "Queen Of Pain":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_null_talisman);
                startingItems3.setVisibility(View.INVISIBLE);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_bottle);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_magic_stick);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_orchid_malevolence);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame2.setImageResource(R.drawable.item_bloodthorn);
                lateGame3.setImageResource(R.drawable.item_scythe_of_vyse);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_power_treads);
                popularItems2.setImageResource(R.drawable.item_veil_of_discord);
                popularItems3.setImageResource(R.drawable.item_linkens_sphere);
                popularItems4.setImageResource(R.drawable.item_orchid_malevolence);
                popularItems5.setImageResource(R.drawable.item_bottle);
                popularItems6.setImageResource(R.drawable.item_magic_wand);
                popularItems7.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems8.setImageResource(R.drawable.item_black_king_bar);
                popularItems9.setImageResource(R.drawable.item_shivas_guard);
                popularItems10.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems11.setImageResource(R.drawable.item_bloodthorn);
                popularItems12.setImageResource(R.drawable.item_null_talisman);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "null_talisman";

                earlyGame1OnClick = "bottle";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "magic_stick";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "orchid_malevolence";

                lateGame1OnClick = "aghanims_scepter";
                lateGame2OnClick = "bloodthorn";
                lateGame3OnClick = "scythe_of_vyse";

                popularItems1OnClick = "power_treads";
                popularItems2OnClick = "veil_of_discord";
                popularItems3OnClick = "linkens_sphere";
                popularItems4OnClick = "orchid_malevolence";
                popularItems5OnClick = "bottle";
                popularItems6OnClick = "magic_wand";
                popularItems7OnClick = "euls_scepter_of_divinity";
                popularItems8OnClick = "black_king_bar";
                popularItems9OnClick = "shivas_guard";
                popularItems10OnClick = "aghanims_scepter";
                popularItems11OnClick = "bloodthorn";
                popularItems12OnClick = "null_talisman";
                break;



            case "Rubick":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_arcane_boots);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                lateGame2.setImageResource(R.drawable.item_glimmer_cape);
                lateGame3.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_arcane_boots);
                popularItems2.setImageResource(R.drawable.item_blink_dagger);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_glimmer_cape);
                popularItems5.setImageResource(R.drawable.item_wind_lace);
                popularItems6.setImageResource(R.drawable.item_force_staff);
                popularItems7.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems8.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems9.setImageResource(R.drawable.item_ghost_scepter);
                popularItems10.setImageResource(R.drawable.item_tranquil_boots);
                popularItems11.setImageResource(R.drawable.item_aether_lens);
                popularItems12.setImageResource(R.drawable.item_urn_of_shadows);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";

                midGame1OnClick = "arcane_boots";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "blink_dagger";

                lateGame1OnClick = "euls_scepter_of_divinity";
                lateGame2OnClick = "glimmer_cape";
                lateGame3OnClick = "aghanims_scepter";

                popularItems1OnClick = "arcane_boots";
                popularItems2OnClick = "blink_dagger";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "glimmer_cape";
                popularItems5OnClick = "wind_lace";
                popularItems6OnClick = "force_staff";
                popularItems7OnClick = "aghanims_scepter";
                popularItems8OnClick = "euls_scepter_of_divinity";
                popularItems9OnClick = "ghost_scepter";
                popularItems10OnClick = "tranquil_boots";
                popularItems11OnClick = "aether_lens";
                popularItems12OnClick = "urn_of_shadows";
                break;



            case "Shadow Demon":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_wind_lace);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_arcane_boots);
                midGame3.setImageResource(R.drawable.item_force_staff);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                lateGame2.setImageResource(R.drawable.item_guardian_greaves);
                lateGame3.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_magic_wand);
                popularItems2.setImageResource(R.drawable.item_arcane_boots);
                popularItems3.setImageResource(R.drawable.item_glimmer_cape);
                popularItems4.setImageResource(R.drawable.item_wind_lace);
                popularItems5.setImageResource(R.drawable.item_force_staff);
                popularItems6.setImageResource(R.drawable.item_tranquil_boots);
                popularItems7.setImageResource(R.drawable.item_aether_lens);
                popularItems8.setImageResource(R.drawable.item_boots_of_speed);
                popularItems9.setImageResource(R.drawable.item_blink_dagger);
                popularItems10.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems11.setImageResource(R.drawable.item_ghost_scepter);
                popularItems12.setImageResource(R.drawable.item_euls_scepter_of_divinity);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "wind_lace";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "arcane_boots";
                midGame3OnClick = "force_staff";

                lateGame1OnClick = "euls_scepter_of_divinity";
                lateGame2OnClick = "guardian_greaves";
                lateGame3OnClick = "aghanims_scepter";

                popularItems1OnClick = "magic_wand";
                popularItems2OnClick = "arcane_boots";
                popularItems3OnClick = "glimmer_cape";
                popularItems4OnClick = "wind_lace";
                popularItems5OnClick = "force_staff";
                popularItems6OnClick = "tranquil_boots";
                popularItems7OnClick = "aether_lens";
                popularItems8OnClick = "boots_of_speed";
                popularItems9OnClick = "blink_dagger";
                popularItems10OnClick = "urn_of_shadows";
                popularItems11OnClick = "ghost_scepter";
                popularItems12OnClick = "euls_scepter_of_divinity";
                break;



            case "Shadow Shaman":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setImageResource(R.drawable.item_ironwood_branch);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_arcane_boots);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame2.setImageResource(R.drawable.item_refresher_orb);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_arcane_boots);
                popularItems2.setImageResource(R.drawable.item_blink_dagger);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_wind_lace);
                popularItems5.setImageResource(R.drawable.item_glimmer_cape);
                popularItems6.setImageResource(R.drawable.item_aether_lens);
                popularItems7.setImageResource(R.drawable.item_force_staff);
                popularItems8.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems9.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems10.setImageResource(R.drawable.item_ghost_scepter);
                popularItems11.setImageResource(R.drawable.item_tranquil_boots);
                popularItems12.setImageResource(R.drawable.item_boots_of_speed);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";
                startingItems6OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "arcane_boots";
                midGame3OnClick = "blink_dagger";

                lateGame1OnClick = "aghanims_scepter";
                lateGame2OnClick = "refresher_orb";

                popularItems1OnClick = "arcane_boots";
                popularItems2OnClick = "blink_dagger";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "wind_lace";
                popularItems5OnClick = "glimmer_cape";
                popularItems6OnClick = "aether_lens";
                popularItems7OnClick = "force_staff";
                popularItems8OnClick = "aghanims_scepter";
                popularItems9OnClick = "euls_scepter_of_divinity";
                popularItems10OnClick = "ghost_scepter";
                popularItems11OnClick = "tranquil_boots";
                popularItems12OnClick = "boots_of_speed";
                break;



            case "Silencer":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_healing_salve);
                startingItems4.setImageResource(R.drawable.item_circlet);
                startingItems5.setImageResource(R.drawable.item_mantle_of_intelligence);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_stick);
                earlyGame3.setImageResource(R.drawable.item_null_talisman);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_force_staff);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_hurricane_pike);
                lateGame2.setImageResource(R.drawable.item_scythe_of_vyse);
                lateGame3.setImageResource(R.drawable.item_bloodthorn);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_magic_wand);
                popularItems2.setImageResource(R.drawable.item_power_treads);
                popularItems3.setImageResource(R.drawable.item_hand_of_midas);
                popularItems4.setImageResource(R.drawable.item_rod_of_atos);
                popularItems5.setImageResource(R.drawable.item_force_staff);
                popularItems6.setImageResource(R.drawable.item_hurricane_pike);
                popularItems7.setImageResource(R.drawable.item_tranquil_boots);
                popularItems8.setImageResource(R.drawable.item_glimmer_cape);
                popularItems9.setImageResource(R.drawable.item_wind_lace);
                popularItems10.setImageResource(R.drawable.item_boots_of_speed);
                popularItems11.setImageResource(R.drawable.item_null_talisman);
                popularItems12.setImageResource(R.drawable.item_ghost_scepter);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "healing_salve";
                startingItems4OnClick = "circlet";
                startingItems5OnClick = "mantle_of_intelligence";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_stick";
                earlyGame3OnClick = "null_talisman";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "force_staff";

                lateGame1OnClick = "hurricane_pike";
                lateGame2OnClick = "scythe_of_vyse";
                lateGame3OnClick = "bloodthorn";

                popularItems1OnClick = "magic_wand";
                popularItems2OnClick = "power_treads";
                popularItems3OnClick = "hand_of_midas";
                popularItems4OnClick = "rod_of_atos";
                popularItems5OnClick = "force_staff";
                popularItems6OnClick = "hurricane_pike";
                popularItems7OnClick = "tranquil_boots";
                popularItems8OnClick = "glimmer_cape";
                popularItems9OnClick = "wind_lace";
                popularItems10OnClick = "boots_of_speed";
                popularItems11OnClick = "null_talisman";
                popularItems12OnClick = "ghost_scepter";
                break;



            case "Skywrath Mage":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_null_talisman);
                earlyGame3.setImageResource(R.drawable.item_arcane_boots);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_rod_of_atos);
                midGame3.setImageResource(R.drawable.item_aether_lens);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                lateGame2.setImageResource(R.drawable.item_glimmer_cape);
                lateGame3.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_arcane_boots);
                popularItems2.setImageResource(R.drawable.item_rod_of_atos);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_boots_of_speed);
                popularItems5.setImageResource(R.drawable.item_null_talisman);
                popularItems6.setImageResource(R.drawable.item_wind_lace);
                popularItems7.setImageResource(R.drawable.item_veil_of_discord);
                popularItems8.setImageResource(R.drawable.item_bracer);
                popularItems9.setImageResource(R.drawable.item_glimmer_cape);
                popularItems10.setImageResource(R.drawable.item_force_staff);
                popularItems11.setImageResource(R.drawable.item_ghost_scepter);
                popularItems12.setImageResource(R.drawable.item_euls_scepter_of_divinity);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "null_talisman";
                earlyGame3OnClick = "arcane_boots";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "rod_of_atos";
                midGame3OnClick = "aether_lens";

                lateGame1OnClick = "euls_scepter_of_divinity";
                lateGame2OnClick = "glimmer_cape";
                lateGame3OnClick = "aghanims_scepter";

                popularItems1OnClick = "arcane_boots";
                popularItems2OnClick = "rod_of_atos";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "boots_of_speed";
                popularItems5OnClick = "null_talisman";
                popularItems6OnClick = "wind_lace";
                popularItems7OnClick = "veil_of_discord";
                popularItems8OnClick = "bracer";
                popularItems9OnClick = "glimmer_cape";
                popularItems10OnClick = "force_staff";
                popularItems11OnClick = "ghost_scepter";
                popularItems12OnClick = "euls_scepter_of_divinity";
                break;



            case "Storm Spirit":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_null_talisman);
                startingItems3.setVisibility(View.INVISIBLE);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_soul_ring);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_power_treads);
                midGame3.setImageResource(R.drawable.item_bloodstone);
                midGame4.setImageResource(R.drawable.item_bottle);

                lateGame1.setImageResource(R.drawable.item_orchid_malevolence);
                lateGame2.setImageResource(R.drawable.item_shivas_guard);
                lateGame3.setImageResource(R.drawable.item_linkens_sphere);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_bloodstone);
                popularItems2.setImageResource(R.drawable.item_power_treads);
                popularItems3.setImageResource(R.drawable.item_bottle);
                popularItems4.setImageResource(R.drawable.item_orchid_malevolence);
                popularItems5.setImageResource(R.drawable.item_magic_wand);
                popularItems6.setImageResource(R.drawable.item_null_talisman);
                popularItems7.setImageResource(R.drawable.item_black_king_bar);
                popularItems8.setImageResource(R.drawable.item_linkens_sphere);
                popularItems9.setImageResource(R.drawable.item_bloodthorn);
                popularItems10.setImageResource(R.drawable.item_shivas_guard);
                popularItems11.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems12.setImageResource(R.drawable.item_boots_of_travel);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "null_talisman";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "soul_ring";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "power_treads";
                midGame3OnClick = "bloodstone";
                midGame4OnClick = "bottle";

                lateGame1OnClick = "orchid_malevolence";
                lateGame2OnClick = "shivas_guard";
                lateGame3OnClick = "linkens_sphere";

                popularItems1OnClick = "bloodstone";
                popularItems2OnClick = "power_treads";
                popularItems3OnClick = "bottle";
                popularItems4OnClick = "orchid_malevolence";
                popularItems5OnClick = "magic_wand";
                popularItems6OnClick = "null_talisman";
                popularItems7OnClick = "black_king_bar";
                popularItems8OnClick = "linkens_sphere";
                popularItems9OnClick = "bloodthorn";
                popularItems10OnClick = "shivas_guard";
                popularItems11OnClick = "euls_scepter_of_divinity";
                popularItems12OnClick = "boots_of_travel";
                break;



            case "Techies":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_clarity);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_soul_ring);
                earlyGame2.setImageResource(R.drawable.item_arcane_boots);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                midGame2.setImageResource(R.drawable.item_aghanims_scepter);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_force_staff);
                lateGame2.setImageResource(R.drawable.item_octarine_core);
                lateGame3.setImageResource(R.drawable.item_scythe_of_vyse);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_soul_ring);
                popularItems2.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems3.setImageResource(R.drawable.item_arcane_boots);
                popularItems4.setImageResource(R.drawable.item_force_staff);
                popularItems5.setImageResource(R.drawable.item_bloodstone);
                popularItems6.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems7.setImageResource(R.drawable.item_boots_of_speed);
                popularItems8.setImageResource(R.drawable.item_boots_of_travel);
                popularItems9.setImageResource(R.drawable.item_tranquil_boots);
                popularItems10.setImageResource(R.drawable.item_null_talisman);
                popularItems11.setImageResource(R.drawable.item_wind_lace);
                popularItems12.setImageResource(R.drawable.item_staff_of_wizardry);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "clarity";

                earlyGame1OnClick = "soul_ring";
                earlyGame2OnClick = "arcane_boots";

                midGame1OnClick = "euls_scepter_of_divinity";
                midGame2OnClick = "aghanims_scepter";

                lateGame1OnClick = "force_staff";
                lateGame2OnClick = "octarine_core";
                lateGame3OnClick = "scythe_of_vyse";

                popularItems1OnClick = "soul_ring";
                popularItems2OnClick = "aghanims_scepter";
                popularItems3OnClick = "arcane_boots";
                popularItems4OnClick = "force_staff";
                popularItems5OnClick = "bloodstone";
                popularItems6OnClick = "euls_scepter_of_divinity";
                popularItems7OnClick = "boots_of_speed";
                popularItems8OnClick = "boots_of_travel";
                popularItems9OnClick = "tranquil_boots";
                popularItems10OnClick = "null_talisman";
                popularItems11OnClick = "wind_lace";
                popularItems12OnClick = "staff_of_wizardry";
                break;


            case "Tinker":
                startingItems1.setImageResource(R.drawable.item_null_talisman);
                startingItems2.setImageResource(R.drawable.item_tango);
                startingItems3.setVisibility(View.INVISIBLE);
                startingItems4.setVisibility(View.INVISIBLE);
                startingItems5.setVisibility(View.GONE);
                startingItems6.setVisibility(View.GONE);
                startingItems7.setVisibility(View.GONE);
                startingItems8.setVisibility(View.GONE);

                earlyGame1.setImageResource(R.drawable.item_bottle);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_bracer);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_soul_ring);
                midGame2.setImageResource(R.drawable.item_boots_of_travel);
                midGame3.setImageResource(R.drawable.item_blink_dagger);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aether_lens);
                lateGame2.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame3.setImageResource(R.drawable.item_scythe_of_vyse);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_boots_of_travel);
                popularItems2.setImageResource(R.drawable.item_blink_dagger);
                popularItems3.setImageResource(R.drawable.item_soul_ring);
                popularItems4.setImageResource(R.drawable.item_aether_lens);
                popularItems5.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems6.setImageResource(R.drawable.item_bottle);
                popularItems7.setImageResource(R.drawable.item_dagon);
                popularItems8.setImageResource(R.drawable.item_scythe_of_vyse);
                popularItems9.setImageResource(R.drawable.item_bloodstone);
                popularItems10.setImageResource(R.drawable.item_null_talisman);
                popularItems11.setImageResource(R.drawable.item_ghost_scepter);
                popularItems12.setImageResource(R.drawable.item_force_staff);

                startingItems1OnClick = "null_talisman";
                startingItems2OnClick = "tango";

                earlyGame1OnClick = "bottle";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "bracer";

                midGame1OnClick = "soul_ring";
                midGame2OnClick = "boots_of_travel";
                midGame3OnClick = "blink_dagger";

                lateGame1OnClick = "aether_lens";
                lateGame2OnClick = "aghanims_scepter";
                lateGame3OnClick = "scythe_of_vyse";

                popularItems1OnClick = "boots_of_travel";
                popularItems2OnClick = "blink_dagger";
                popularItems3OnClick = "soul_ring";
                popularItems4OnClick = "aether_lens";
                popularItems5OnClick = "aghanims_scepter";
                popularItems6OnClick = "bottle";
                popularItems7OnClick = "dagon";
                popularItems8OnClick = "scythe_of_vyse";
                popularItems9OnClick = "bloodstone";
                popularItems10OnClick = "null_talisman";
                popularItems11OnClick = "ghost_scepter";
                popularItems12OnClick = "force_staff";
                break;


            case "Visage":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_ring_of_protection);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setImageResource(R.drawable.item_ironwood_branch);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_wand);
                earlyGame3.setImageResource(R.drawable.item_ring_of_basilius);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_power_treads);
                midGame2.setImageResource(R.drawable.item_magic_wand);
                midGame3.setImageResource(R.drawable.item_medallion_of_courage);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame2.setImageResource(R.drawable.item_rod_of_atos);
                lateGame3.setImageResource(R.drawable.item_solar_crest);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_solar_crest);
                popularItems2.setImageResource(R.drawable.item_tranquil_boots);
                popularItems3.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems4.setImageResource(R.drawable.item_rod_of_atos);
                popularItems5.setImageResource(R.drawable.item_magic_wand);
                popularItems6.setImageResource(R.drawable.item_hand_of_midas);
                popularItems7.setImageResource(R.drawable.item_medallion_of_courage);
                popularItems8.setImageResource(R.drawable.item_boots_of_speed);
                popularItems9.setImageResource(R.drawable.item_boots_of_travel);
                popularItems10.setImageResource(R.drawable.item_assault_cuirass);
                popularItems11.setImageResource(R.drawable.item_scythe_of_vyse);
                popularItems12.setImageResource(R.drawable.item_null_talisman);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "ring_of_protection";
                startingItems5OnClick = "iron_branch";
                startingItems6OnClick = "iron_branch";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_wand";
                earlyGame3OnClick = "ring_of_basilius";

                midGame1OnClick = "power_treads";
                midGame2OnClick = "magic_wand";
                midGame3OnClick = "medallion_of_courage";

                lateGame1OnClick = "aghanims_scepter";
                lateGame2OnClick = "rod_of_atos";
                lateGame3OnClick = "solar_crest";

                popularItems1OnClick = "solar_crest";
                popularItems2OnClick = "tranquil_boots";
                popularItems3OnClick = "aghanims_scepter";
                popularItems4OnClick = "rod_of_atos";
                popularItems5OnClick = "magic_wand";
                popularItems6OnClick = "hand_of_midas";
                popularItems7OnClick = "medallion_of_courage";
                popularItems8OnClick = "boots_of_speed";
                popularItems9OnClick = "boots_of_travel";
                popularItems10OnClick = "assault_cuirass";
                popularItems11OnClick = "scythe_of_vyse";
                popularItems12OnClick = "null_talisman";
                break;



            case "Void Spirit":
                startingItems1.setImageResource(R.drawable.item_circlet);
                startingItems2.setImageResource(R.drawable.item_mantle_of_intelligence);
                startingItems3.setImageResource(R.drawable.item_quelling_blade);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_faerie_fire);
                startingItems6.setImageResource(R.drawable.item_observer_ward);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame2.setImageResource(R.drawable.item_magic_wand);
                earlyGame3.setImageResource(R.drawable.item_null_talisman);
                earlyGame4.setImageResource(R.drawable.item_bottle);

                midGame1.setImageResource(R.drawable.item_phase_boots);
                midGame2.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                midGame3.setImageResource(R.drawable.item_magic_wand);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame2.setImageResource(R.drawable.item_black_king_bar);
                lateGame3.setImageResource(R.drawable.item_orchid_malevolence);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_phase_boots);
                popularItems2.setImageResource(R.drawable.item_magic_wand);
                popularItems3.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems4.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems5.setImageResource(R.drawable.item_black_king_bar);
                popularItems6.setImageResource(R.drawable.item_blade_mail);
                popularItems7.setImageResource(R.drawable.item_orchid_malevolence);
                popularItems8.setImageResource(R.drawable.item_bloodthorn);
                popularItems9.setImageResource(R.drawable.item_desolator);
                popularItems10.setImageResource(R.drawable.item_scythe_of_vyse);
                popularItems11.setImageResource(R.drawable.item_shivas_guard);
                popularItems12.setImageResource(R.drawable.item_maelstrom);

                startingItems1OnClick = "circlet";
                startingItems2OnClick = "mantle_of_intelligence";
                startingItems3OnClick = "quelling_blade";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "faerie_fire";
                startingItems6OnClick = "observer_ward";

                earlyGame1OnClick = "boots_of_speed";
                earlyGame2OnClick = "magic_wand";
                earlyGame3OnClick = "null_talisman";
                earlyGame4OnClick = "bottle";

                midGame1OnClick = "phase_boots";
                midGame2OnClick = "euls_scepter_of_divinity";
                midGame3OnClick = "magic_wand";

                lateGame1OnClick = "aghanims_scepter";
                lateGame2OnClick = "black_king_bar";
                lateGame3OnClick = "orchid_malevolence";

                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "magic_wand";
                popularItems3OnClick = "euls_scepter_of_divinity";
                popularItems4OnClick = "aghanims_scepter";
                popularItems5OnClick = "black_king_bar";
                popularItems6OnClick = "blade_mail";
                popularItems7OnClick = "orchid_malevolence";
                popularItems8OnClick = "bloodthorn";
                popularItems9OnClick = "desolator";
                popularItems10OnClick = "scythe_of_vyse";
                popularItems11OnClick = "shivas_guard";
                popularItems12OnClick = "maelstrom";
                break;



            case "Warlock":
                startingItems1.setImageResource(R.drawable.item_clarity);
                startingItems2.setImageResource(R.drawable.item_ironwood_branch);
                startingItems3.setImageResource(R.drawable.item_tango);
                startingItems4.setImageResource(R.drawable.item_ring_of_protection);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_ring_of_basilius);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_arcane_boots);
                midGame3.setVisibility(View.INVISIBLE);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame2.setImageResource(R.drawable.item_refresher_orb);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_arcane_boots);
                popularItems2.setImageResource(R.drawable.item_hand_of_midas);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems5.setImageResource(R.drawable.item_glimmer_cape);
                popularItems6.setImageResource(R.drawable.item_boots_of_speed);
                popularItems7.setImageResource(R.drawable.item_wind_lace);
                popularItems8.setImageResource(R.drawable.item_force_staff);
                popularItems9.setImageResource(R.drawable.item_ghost_scepter);
                popularItems10.setImageResource(R.drawable.item_solar_crest);
                popularItems11.setImageResource(R.drawable.item_refresher_orb);
                popularItems12.setImageResource(R.drawable.item_magic_stick);

                startingItems1OnClick = "clarity";
                startingItems2OnClick = "iron_branch";
                startingItems3OnClick = "tango";
                startingItems4OnClick = "ring_of_protection";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "ring_of_basilius";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "arcane_boots";

                lateGame1OnClick = "aghanims_scepter";
                lateGame2OnClick = "refresher_orb";

                popularItems1OnClick = "arcane_boots";
                popularItems2OnClick = "hand_of_midas";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "aghanims_scepter";
                popularItems5OnClick = "glimmer_cape";
                popularItems6OnClick = "boots_of_speed";
                popularItems7OnClick = "wind_lace";
                popularItems8OnClick = "force_staff";
                popularItems9OnClick = "ghost_scepter";
                popularItems10OnClick = "solar_crest";
                popularItems11OnClick = "refresher_orb";
                popularItems12OnClick = "magic_stick";
                break;


            case "Windranger":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_circlet);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setImageResource(R.drawable.item_ironwood_branch);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_wand);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setVisibility(View.INVISIBLE);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_phase_boots);
                midGame2.setImageResource(R.drawable.item_force_staff);
                midGame3.setImageResource(R.drawable.item_maelstrom);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame2.setImageResource(R.drawable.item_mjollnir);
                lateGame3.setImageResource(R.drawable.item_bloodthorn);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_phase_boots);
                popularItems2.setImageResource(R.drawable.item_blink_dagger);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_maelstrom);
                popularItems5.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems6.setImageResource(R.drawable.item_force_staff);
                popularItems7.setImageResource(R.drawable.item_linkens_sphere);
                popularItems8.setImageResource(R.drawable.item_null_talisman);
                popularItems9.setImageResource(R.drawable.item_hand_of_midas);
                popularItems10.setImageResource(R.drawable.item_bottle);
                popularItems11.setImageResource(R.drawable.item_black_king_bar);
                popularItems12.setImageResource(R.drawable.item_solar_crest);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "circlet";
                startingItems5OnClick = "iron_branch";
                startingItems6OnClick = "iron_branch";

                earlyGame1OnClick = "magic_wand";
                earlyGame2OnClick = "boots_of_speed";

                midGame1OnClick = "phase_boots";
                midGame2OnClick = "force_staff";
                midGame3OnClick = "maelstrom";

                lateGame1OnClick = "aghanims_scepter";
                lateGame2OnClick = "mjollnir";
                lateGame3OnClick = "bloodthorn";

                popularItems1OnClick = "phase_boots";
                popularItems2OnClick = "blink_dagger";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "maelstrom";
                popularItems5OnClick = "aghanims_scepter";
                popularItems6OnClick = "force_staff";
                popularItems7OnClick = "linkens_sphere";
                popularItems8OnClick = "null_talisman";
                popularItems9OnClick = "hand_of_midas";
                popularItems10OnClick = "bottle";
                popularItems11OnClick = "black_king_bar";
                popularItems12OnClick = "solar_crest";
                break;


            case "Winter Wyvern":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_urn_of_shadows);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_arcane_boots);
                midGame3.setImageResource(R.drawable.item_force_staff);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_glimmer_cape);
                lateGame2.setImageResource(R.drawable.item_guardian_greaves);
                lateGame3.setImageResource(R.drawable.item_aether_lens);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_arcane_boots);
                popularItems2.setImageResource(R.drawable.item_glimmer_cape);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_blink_dagger);
                popularItems5.setImageResource(R.drawable.item_wind_lace);
                popularItems6.setImageResource(R.drawable.item_force_staff);
                popularItems7.setImageResource(R.drawable.item_tranquil_boots);
                popularItems8.setImageResource(R.drawable.item_aether_lens);
                popularItems9.setImageResource(R.drawable.item_boots_of_speed);
                popularItems10.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems11.setImageResource(R.drawable.item_soul_ring);
                popularItems12.setImageResource(R.drawable.item_ghost_scepter);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "urn_of_shadows";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "arcane_boots";
                midGame3OnClick = "force_staff";

                lateGame1OnClick = "glimmer_cape";
                lateGame2OnClick = "guardian_greaves";
                lateGame3OnClick = "aether_lens";

                popularItems1OnClick = "arcane_boots";
                popularItems2OnClick = "glimmer_cape";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "blink_dagger";
                popularItems5OnClick = "wind_lace";
                popularItems6OnClick = "force_staff";
                popularItems7OnClick = "tranquil_boots";
                popularItems8OnClick = "aether_lens";
                popularItems9OnClick = "boots_of_speed";
                popularItems10OnClick = "urn_of_shadows";
                popularItems11OnClick = "soul_ring";
                popularItems12OnClick = "ghost_scepter";
                break;


            case "Witch Doctor":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_healing_salve);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_ironwood_branch);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setVisibility(View.INVISIBLE);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_magic_stick);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_bracer);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_magic_wand);
                midGame2.setImageResource(R.drawable.item_arcane_boots);
                midGame3.setImageResource(R.drawable.item_glimmer_cape);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame2.setImageResource(R.drawable.item_black_king_bar);
                lateGame3.setVisibility(View.INVISIBLE);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_arcane_boots);
                popularItems2.setImageResource(R.drawable.item_glimmer_cape);
                popularItems3.setImageResource(R.drawable.item_magic_wand);
                popularItems4.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems5.setImageResource(R.drawable.item_wind_lace);
                popularItems6.setImageResource(R.drawable.item_boots_of_speed);
                popularItems7.setImageResource(R.drawable.item_ghost_scepter);
                popularItems8.setImageResource(R.drawable.item_force_staff);
                popularItems9.setImageResource(R.drawable.item_tranquil_boots);
                popularItems10.setImageResource(R.drawable.item_urn_of_shadows);
                popularItems11.setImageResource(R.drawable.item_bracer);
                popularItems12.setImageResource(R.drawable.item_hand_of_midas);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "healing_salve";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "iron_branch";
                startingItems5OnClick = "iron_branch";

                earlyGame1OnClick = "magic_stick";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "bracer";

                midGame1OnClick = "magic_wand";
                midGame2OnClick = "arcane_boots";
                midGame3OnClick = "glimmer_cape";

                lateGame1OnClick = "aghanims_scepter";
                lateGame2OnClick = "black_king_bar";

                popularItems1OnClick = "arcane_boots";
                popularItems2OnClick = "glimmer_cape";
                popularItems3OnClick = "magic_wand";
                popularItems4OnClick = "aghanims_scepter";
                popularItems5OnClick = "wind_lace";
                popularItems6OnClick = "boots_of_speed";
                popularItems7OnClick = "ghost_scepter";
                popularItems8OnClick = "force_staff";
                popularItems9OnClick = "tranquil_boots";
                popularItems10OnClick = "urn_of_shadows";
                popularItems11OnClick = "bracer";
                popularItems12OnClick = "hand_of_midas";
                break;



            case "Zeus":
                startingItems1.setImageResource(R.drawable.item_tango);
                startingItems2.setImageResource(R.drawable.item_clarity);
                startingItems3.setImageResource(R.drawable.item_clarity);
                startingItems4.setImageResource(R.drawable.item_circlet);
                startingItems5.setImageResource(R.drawable.item_ironwood_branch);
                startingItems6.setImageResource(R.drawable.item_ironwood_branch);
                startingItems7.setVisibility(View.INVISIBLE);
                startingItems8.setVisibility(View.INVISIBLE);

                earlyGame1.setImageResource(R.drawable.item_bottle);
                earlyGame2.setImageResource(R.drawable.item_boots_of_speed);
                earlyGame3.setImageResource(R.drawable.item_null_talisman);
                earlyGame4.setVisibility(View.INVISIBLE);

                midGame1.setImageResource(R.drawable.item_arcane_boots);
                midGame2.setImageResource(R.drawable.item_veil_of_discord);
                midGame3.setImageResource(R.drawable.item_aether_lens);
                midGame4.setVisibility(View.INVISIBLE);

                lateGame1.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                lateGame2.setImageResource(R.drawable.item_octarine_core);
                lateGame3.setImageResource(R.drawable.item_aghanims_scepter);
                lateGame4.setVisibility(View.INVISIBLE);

                popularItems1.setImageResource(R.drawable.item_aether_lens);
                popularItems2.setImageResource(R.drawable.item_aghanims_scepter);
                popularItems3.setImageResource(R.drawable.item_veil_of_discord);
                popularItems4.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                popularItems5.setImageResource(R.drawable.item_arcane_boots);
                popularItems6.setImageResource(R.drawable.item_boots_of_travel);
                popularItems7.setImageResource(R.drawable.item_blink_dagger);
                popularItems8.setImageResource(R.drawable.item_bottle);
                popularItems9.setImageResource(R.drawable.item_boots_of_speed);
                popularItems10.setImageResource(R.drawable.item_soul_ring);
                popularItems11.setImageResource(R.drawable.item_force_staff);
                popularItems12.setImageResource(R.drawable.item_bloodstone);

                startingItems1OnClick = "tango";
                startingItems2OnClick = "clarity";
                startingItems3OnClick = "clarity";
                startingItems4OnClick = "circlet";
                startingItems5OnClick = "iron_branch";
                startingItems6OnClick = "iron_branch";

                earlyGame1OnClick = "bottle";
                earlyGame2OnClick = "boots_of_speed";
                earlyGame3OnClick = "null_talisman";

                midGame1OnClick = "arcane_boots";
                midGame2OnClick = "veil_of_discord";
                midGame3OnClick = "aether_lens";

                lateGame1OnClick = "euls_scepter_of_divinity";
                lateGame2OnClick = "octarine_core";
                lateGame3OnClick = "aghanims_scepter";

                popularItems1OnClick = "aether_lens";
                popularItems2OnClick = "aghanims_scepter";
                popularItems3OnClick = "veil_of_discord";
                popularItems4OnClick = "euls_scepter_of_divinity";
                popularItems5OnClick = "arcane_boots";
                popularItems6OnClick = "boots_of_travel";
                popularItems7OnClick = "blink_dagger";
                popularItems8OnClick = "bottle";
                popularItems9OnClick = "boots_of_speed";
                popularItems10OnClick = "soul_ring";
                popularItems11OnClick = "force_staff";
                popularItems12OnClick = "bloodstone";
                break;
        }
    }

}