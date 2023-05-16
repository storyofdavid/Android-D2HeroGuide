package com.gamestudi.d2heroguide.NeutralsScreens;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.gamestudi.d2heroguide.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static android.view.View.GONE;


public class NeutralsSelected extends AppCompatActivity {

    ImageView creepImage1;
    TextView creepName1;
    TextView creepHealth1;
    TextView creepAttack1;
    TextView creepBounty1;
    TextView creepExperience1;

    ImageView creep1SkillImage1;
    TextView creep1SkillName1;
    TextView creep1SkillDescription1;
    TextView creep1SkillText1;
    ImageView creep1SkillImage2;
    TextView creep1SkillName2;
    TextView creep1SkillDescription2;
    TextView creep1SkillText2;
    ImageView creep1SkillImage3;
    TextView creep1SkillName3;
    TextView creep1SkillDescription3;
    TextView creep1SkillText3;
    ImageView creep1SkillImage4;
    TextView creep1SkillName4;
    TextView creep1SkillDescription4;
    TextView creep1SkillText4;


    ImageView creepImage2;
    TextView creepName2;
    TextView creepHealth2;
    TextView creepAttack2;
    TextView creepBounty2;
    TextView creepExperience2;

    ImageView creep2SkillImage1;
    TextView creep2SkillName1;
    TextView creep2SkillDescription1;
    TextView creep2SkillText1;
    ImageView creep2SkillImage2;
    TextView creep2SkillName2;
    TextView creep2SkillDescription2;
    TextView creep2SkillText2;
    ImageView creep2SkillImage3;
    TextView creep2SkillName3;
    TextView creep2SkillDescription3;
    TextView creep2SkillText3;
    ImageView creep2SkillImage4;
    TextView creep2SkillName4;
    TextView creep2SkillDescription4;
    TextView creep2SkillText4;


    ImageView creepImage3;
    TextView creepName3;
    TextView creepHealth3;
    TextView creepAttack3;
    TextView creepBounty3;
    TextView creepExperience3;

    ImageView creep3SkillImage1;
    TextView creep3SkillName1;
    TextView creep3SkillDescription1;
    TextView creep3SkillText1;
    ImageView creep3SkillImage2;
    TextView creep3SkillName2;
    TextView creep3SkillDescription2;
    TextView creep3SkillText2;

    //Is used for the adview
    private AdView AdViewNeutrals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neutrals_selected);

        //Loads the ad as soon as the activity is created
        AdViewNeutrals = (AdView) findViewById(R.id.adViewNeutrals);
        AdRequest adRequest = new AdRequest.Builder().build();
        AdViewNeutrals.loadAd(adRequest);


        creepImage1 = (ImageView) findViewById(R.id.creepImage1);
        creepName1 = (TextView) findViewById(R.id.creepName1);
        creepHealth1 = (TextView) findViewById(R.id.creepHealth1);
        creepAttack1 = (TextView) findViewById(R.id.creepAttack1);
        creepBounty1 = (TextView) findViewById(R.id.creepBounty1);
        creepExperience1 = (TextView) findViewById(R.id.creepExperience1);

        creep1SkillImage1 = (ImageView) findViewById(R.id.creep1SkillImage1);
        creep1SkillName1 = (TextView) findViewById(R.id.creep1SkillName1);
        creep1SkillDescription1 = (TextView) findViewById(R.id.creep1SkillDescription1);
        creep1SkillText1 = (TextView) findViewById(R.id.creep1SkillText1);
        creep1SkillImage2 = (ImageView) findViewById(R.id.creep1SkillImage2);
        creep1SkillName2 = (TextView) findViewById(R.id.creep1SkillName2);
        creep1SkillDescription2 = (TextView) findViewById(R.id.creep1SkillDescription2);
        creep1SkillText2 = (TextView) findViewById(R.id.creep1SkillText2);
        creep1SkillImage3 = (ImageView) findViewById(R.id.creep1SkillImage3);
        creep1SkillName3 = (TextView) findViewById(R.id.creep1SkillName3);
        creep1SkillDescription3 = (TextView) findViewById(R.id.creep1SkillDescription3);
        creep1SkillText3 = (TextView) findViewById(R.id.creep1SkillText3);
        creep1SkillImage4 = (ImageView) findViewById(R.id.creep1SkillImage4);
        creep1SkillName4 = (TextView) findViewById(R.id.creep1SkillName4);
        creep1SkillDescription4 = (TextView) findViewById(R.id.creep1SkillDescription4);
        creep1SkillText4 = (TextView) findViewById(R.id.creep1SkillText4);



        creepImage2 = (ImageView) findViewById(R.id.creepImage2);
        creepName2 = (TextView) findViewById(R.id.creepName2);
        creepHealth2 = (TextView) findViewById(R.id.creepHealth2);
        creepAttack2 = (TextView) findViewById(R.id.creepAttack2);
        creepBounty2 = (TextView) findViewById(R.id.creepBounty2);
        creepExperience2 = (TextView) findViewById(R.id.creepExperience2);

        creep2SkillImage1 = (ImageView) findViewById(R.id.creep2SkillImage1);
        creep2SkillName1 = (TextView) findViewById(R.id.creep2SkillName1);
        creep2SkillDescription1 = (TextView) findViewById(R.id.creep2SkillDescription1);
        creep2SkillText1 = (TextView) findViewById(R.id.creep2SkillText1);
        creep2SkillImage2 = (ImageView) findViewById(R.id.creep2SkillImage2);
        creep2SkillName2 = (TextView) findViewById(R.id.creep2SkillName2);
        creep2SkillDescription2 = (TextView) findViewById(R.id.creep2SkillDescription2);
        creep2SkillText2 = (TextView) findViewById(R.id.creep2SkillText2);
        creep2SkillImage3 = (ImageView) findViewById(R.id.creep2SkillImage3);
        creep2SkillName3 = (TextView) findViewById(R.id.creep2SkillName3);
        creep2SkillDescription3 = (TextView) findViewById(R.id.creep2SkillDescription3);
        creep2SkillText3 = (TextView) findViewById(R.id.creep2SkillText3);
        creep2SkillImage4 = (ImageView) findViewById(R.id.creep2SkillImage4);
        creep2SkillName4 = (TextView) findViewById(R.id.creep2SkillName4);
        creep2SkillDescription4 = (TextView) findViewById(R.id.creep2SkillDescription4);
        creep2SkillText4 = (TextView) findViewById(R.id.creep2SkillText4);





        creepImage3 = (ImageView) findViewById(R.id.creepImage3);
        creepName3 = (TextView) findViewById(R.id.creepName3);
        creepHealth3 = (TextView) findViewById(R.id.creepHealth3);
        creepAttack3 = (TextView) findViewById(R.id.creepAttack3);
        creepBounty3 = (TextView) findViewById(R.id.creepBounty3);
        creepExperience3 = (TextView) findViewById(R.id.creepExperience3);

        creep3SkillImage1 = (ImageView) findViewById(R.id.creep3SkillImage1);
        creep3SkillName1 = (TextView) findViewById(R.id.creep3SkillName1);
        creep3SkillDescription1 = (TextView) findViewById(R.id.creep3SkillDescription1);
        creep3SkillText1 = (TextView) findViewById(R.id.creep3SkillText1);
        creep3SkillImage2 = (ImageView) findViewById(R.id.creep3SkillImage2);
        creep3SkillName2 = (TextView) findViewById(R.id.creep3SkillName2);
        creep3SkillDescription2 = (TextView) findViewById(R.id.creep3SkillDescription2);
        creep3SkillText2 = (TextView) findViewById(R.id.creep3SkillText2);

        //Is used to get the intent values passed from the previous class
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        String neutralSelected = extras.getString("neutralSelected");


        switch (neutralSelected) {

            //All of the small camps
            case "Ghost Camp":
                creepImage1.setImageResource(R.drawable.neutrals_smallcamp_ghost_camp_fell_spirit);
                creepName1.setText(R.string.neutrals_smallcamp_ghost_camp_fell_spirit_name);
                creepHealth1.setText(R.string.neutrals_smallcamp_ghost_camp_fell_spirit_health);
                creepAttack1.setText(R.string.neutrals_smallcamp_ghost_camp_fell_spirit_attack);
                creepBounty1.setText(R.string.neutrals_smallcamp_ghost_camp_fell_spirit_bounty);
                creepExperience1.setText(R.string.neutrals_smallcamp_ghost_camp_fell_spirit_experience);


                creep1SkillImage1.setVisibility(GONE);
                creep1SkillName1.setVisibility(GONE);
                creep1SkillDescription1.setVisibility(GONE);
                creep1SkillText1.setVisibility(GONE);
                creep1SkillImage2.setVisibility(GONE);
                creep1SkillName2.setVisibility(GONE);
                creep1SkillDescription2.setVisibility(GONE);
                creep1SkillText2.setVisibility(GONE);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);




                creepImage2.setImageResource(R.drawable.neutrals_smallcamp_ghost_camp_ghost);
                creepName2.setText(R.string.neutrals_smallcamp_ghost_camp_ghost_name);
                creepHealth2.setText(R.string.neutrals_smallcamp_ghost_camp_ghost_health);
                creepAttack2.setText(R.string.neutrals_smallcamp_ghost_camp_ghost_attack);
                creepBounty2.setText(R.string.neutrals_smallcamp_ghost_camp_ghost_bounty);
                creepExperience2.setText(R.string.neutrals_smallcamp_ghost_camp_ghost_experience);

                creep2SkillImage1.setImageResource(R.drawable.neutrals_smallcamp_ghost_camp_ghost_skill_frost_attack);
                creep2SkillName1.setText(R.string.neutrals_smallcamp_ghost_camp_ghost_skill1_name);
                creep2SkillDescription1.setText(R.string.neutrals_smallcamp_ghost_camp_ghost_skill1_description);
                creep2SkillText1.setText(R.string.neutrals_smallcamp_ghost_camp_ghost_skill1_text);
                creep2SkillImage2.setVisibility(GONE);
                creep2SkillName2.setVisibility(GONE);
                creep2SkillDescription2.setVisibility(GONE);
                creep2SkillText2.setVisibility(GONE);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);

                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;

            case "Harpy Camp":
                creepImage1.setImageResource(R.drawable.neutrals_smallcamp_harpy_camp_harpy_scout);
                creepName1.setText(R.string.neutrals_smallcamp_harpy_camp_harpy_scout_name);
                creepHealth1.setText(R.string.neutrals_smallcamp_harpy_camp_harpy_scout_health);
                creepAttack1.setText(R.string.neutrals_smallcamp_harpy_camp_harpy_scout_attack);
                creepBounty1.setText(R.string.neutrals_smallcamp_harpy_camp_harpy_scout_bounty);
                creepExperience1.setText(R.string.neutrals_smallcamp_harpy_camp_harpy_scout_experience);

                creep1SkillImage1.setVisibility(GONE);
                creep1SkillName1.setVisibility(GONE);
                creep1SkillDescription1.setVisibility(GONE);
                creep1SkillText1.setVisibility(GONE);
                creep1SkillImage2.setVisibility(GONE);
                creep1SkillName2.setVisibility(GONE);
                creep1SkillDescription2.setVisibility(GONE);
                creep1SkillText2.setVisibility(GONE);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);

                creepImage2.setImageResource(R.drawable.neutrals_smallcamp_harpy_camp_harpy_stormcrafter);
                creepName2.setText(R.string.neutrals_smallcamp_harpy_camp_harpy_stormcrafter_name);
                creepHealth2.setText(R.string.neutrals_smallcamp_harpy_camp_harpy_stormcrafter_health);
                creepAttack2.setText(R.string.neutrals_smallcamp_harpy_camp_harpy_stormcrafter_attack);
                creepBounty2.setText(R.string.neutrals_smallcamp_harpy_camp_harpy_stormcrafter_bounty);
                creepExperience2.setText(R.string.neutrals_smallcamp_harpy_camp_harpy_stormcrafter_experience);

                creep2SkillImage1.setImageResource(R.drawable.neutrals_smallcamp_harpy_camp_harpy_stormcrafter_skill_chain_lightning);
                creep2SkillName1.setText(R.string.neutrals_smallcamp_harpy_camp_harpy_stormcrafter_skill1_name);
                creep2SkillDescription1.setText(R.string.neutrals_smallcamp_harpy_camp_harpy_stormcrafter_skill1_description);
                creep2SkillText1.setText(R.string.neutrals_smallcamp_harpy_camp_harpy_stormcrafter_skill1_text);
                creep2SkillImage2.setVisibility(GONE);
                creep2SkillName2.setVisibility(GONE);
                creep2SkillDescription2.setVisibility(GONE);
                creep2SkillText2.setVisibility(GONE);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);


                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;

            case "Hill Troll And Kobold Camp":
                creepImage1.setImageResource(R.drawable.neutrals_smallcamp_hill_troll_and_kobold_camp_hill_troll_berserker);
                creepName1.setText(R.string.neutrals_smallcamp_hill_troll_and_kobold_camp_hill_troll_berserker_name);
                creepHealth1.setText(R.string.neutrals_smallcamp_hill_troll_and_kobold_camp_hill_troll_berserker_health);
                creepAttack1.setText(R.string.neutrals_smallcamp_hill_troll_and_kobold_camp_hill_troll_berserker_attack);
                creepBounty1.setText(R.string.neutrals_smallcamp_hill_troll_and_kobold_camp_hill_troll_berserker_bounty);
                creepExperience1.setText(R.string.neutrals_smallcamp_hill_troll_and_kobold_camp_hill_troll_berserker_experience);

                creep1SkillImage1.setVisibility(GONE);
                creep1SkillName1.setVisibility(GONE);
                creep1SkillDescription1.setVisibility(GONE);
                creep1SkillText1.setVisibility(GONE);
                creep1SkillImage2.setVisibility(GONE);
                creep1SkillName2.setVisibility(GONE);
                creep1SkillDescription2.setVisibility(GONE);
                creep1SkillText2.setVisibility(GONE);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);

                creepImage2.setImageResource(R.drawable.neutrals_smallcamp_hill_troll_and_kobold_camp_kobold_foreman);
                creepName2.setText(R.string.neutrals_smallcamp_hill_troll_and_kobold_camp_kobold_foreman_name);
                creepHealth2.setText(R.string.neutrals_smallcamp_hill_troll_and_kobold_camp_kobold_foreman_health);
                creepAttack2.setText(R.string.neutrals_smallcamp_hill_troll_and_kobold_camp_kobold_foreman_attack);
                creepBounty2.setText(R.string.neutrals_smallcamp_hill_troll_and_kobold_camp_kobold_foreman_bounty);
                creepExperience2.setText(R.string.neutrals_smallcamp_hill_troll_and_kobold_camp_kobold_foreman_experience);

                creep2SkillImage1.setImageResource(R.drawable.neutrals_smallcamp_hill_troll_and_kobold_camp_kobold_foreman_skill_speed_aura);
                creep2SkillName1.setText(R.string.neutrals_smallcamp_hill_troll_and_kobold_camp_kobold_foreman_skill1_name);
                creep2SkillDescription1.setText(R.string.neutrals_smallcamp_hill_troll_and_kobold_camp_kobold_foreman_skill1_description);
                creep2SkillText1.setText(R.string.neutrals_smallcamp_hill_troll_and_kobold_camp_kobold_foreman_skill1_text);
                creep2SkillImage2.setVisibility(GONE);
                creep2SkillName2.setVisibility(GONE);
                creep2SkillDescription2.setVisibility(GONE);
                creep2SkillText2.setVisibility(GONE);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);

                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;

            case "Hill Troll Camp":
                creepImage1.setImageResource(R.drawable.neutrals_smallcamp_hill_troll_camp_hill_troll_berserker);
                creepName1.setText(R.string.neutrals_smallcamp_hill_troll_camp_hill_troll_berserker_name);
                creepHealth1.setText(R.string.neutrals_smallcamp_hill_troll_camp_hill_troll_berserker_health);
                creepAttack1.setText(R.string.neutrals_smallcamp_hill_troll_camp_hill_troll_berserker_attack);
                creepBounty1.setText(R.string.neutrals_smallcamp_hill_troll_camp_hill_troll_berserker_bounty);
                creepExperience1.setText(R.string.neutrals_smallcamp_hill_troll_camp_hill_troll_berserker_experience);

                creep1SkillImage1.setVisibility(GONE);
                creep1SkillName1.setVisibility(GONE);
                creep1SkillDescription1.setVisibility(GONE);
                creep1SkillText1.setVisibility(GONE);
                creep1SkillImage2.setVisibility(GONE);
                creep1SkillName2.setVisibility(GONE);
                creep1SkillDescription2.setVisibility(GONE);
                creep1SkillText2.setVisibility(GONE);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);

                creepImage2.setImageResource(R.drawable.neutrals_smallcamp_hill_troll_camp_hill_troll_priest);
                creepName2.setText(R.string.neutrals_smallcamp_hill_troll_camp_hill_troll_priest_name);
                creepHealth2.setText(R.string.neutrals_smallcamp_hill_troll_camp_hill_troll_priest_health);
                creepAttack2.setText(R.string.neutrals_smallcamp_hill_troll_camp_hill_troll_priest_attack);
                creepBounty2.setText(R.string.neutrals_smallcamp_hill_troll_camp_hill_troll_priest_bounty);
                creepExperience2.setText(R.string.neutrals_smallcamp_hill_troll_camp_hill_troll_priest_experience);

                creep2SkillImage1.setImageResource(R.drawable.neutrals_smallcamp_hill_troll_camp_hill_troll_priest_skill_heal);
                creep2SkillName1.setText(R.string.neutrals_smallcamp_hill_troll_camp_hill_troll_priest_skill1_name);
                creep2SkillDescription1.setText(R.string.neutrals_smallcamp_hill_troll_camp_hill_troll_priest_skill1_description);
                creep2SkillText1.setText(R.string.neutrals_smallcamp_hill_troll_camp_hill_troll_priest_skill1_text);
                creep2SkillImage2.setImageResource(R.drawable.neutrals_smallcamp_hill_troll_camp_hill_troll_priest_skill_mana_aura);
                creep2SkillName2.setText(R.string.neutrals_smallcamp_hill_troll_camp_hill_troll_priest_skill2_name);
                creep2SkillDescription2.setText(R.string.neutrals_smallcamp_hill_troll_camp_hill_troll_priest_skill2_description);
                creep2SkillText2.setText(R.string.neutrals_smallcamp_hill_troll_camp_hill_troll_priest_skill2_text);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);


                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;

            case "Kobold Camp":
                creepImage1.setImageResource(R.drawable.neutrals_smallcamp_kobold_camp_kobold);
                creepName1.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_name);
                creepHealth1.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_health);
                creepAttack1.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_attack);
                creepBounty1.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_bounty);
                creepExperience1.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_experience);

                creep1SkillImage1.setVisibility(GONE);
                creep1SkillName1.setVisibility(GONE);
                creep1SkillDescription1.setVisibility(GONE);
                creep1SkillText1.setVisibility(GONE);
                creep1SkillImage2.setVisibility(GONE);
                creep1SkillName2.setVisibility(GONE);
                creep1SkillDescription2.setVisibility(GONE);
                creep1SkillText2.setVisibility(GONE);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);


                creepImage2.setImageResource(R.drawable.neutrals_smallcamp_kobold_camp_kobold_foreman);
                creepName2.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_foreman_name);
                creepHealth2.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_foreman_health);
                creepAttack2.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_foreman_attack);
                creepBounty2.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_foreman_bounty);
                creepExperience2.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_foreman_experience);

                creep2SkillImage1.setImageResource(R.drawable.neutrals_smallcamp_kobold_camp_kobold_foreman_skill_speed_aura);
                creep2SkillName1.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_foreman_skill1_name);
                creep2SkillDescription1.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_foreman_skill1_description);
                creep2SkillText1.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_foreman_skill1_text);
                creep2SkillImage2.setVisibility(GONE);
                creep2SkillName2.setVisibility(GONE);
                creep2SkillDescription2.setVisibility(GONE);
                creep2SkillText2.setVisibility(GONE);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);


                creepImage3.setImageResource(R.drawable.neutrals_smallcamp_kobold_camp_kobold_soldier);
                creepName3.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_soldier_name);
                creepHealth3.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_soldier_health);
                creepAttack3.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_soldier_attack);
                creepBounty3.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_soldier_bounty);
                creepExperience3.setText(R.string.neutrals_smallcamp_kobold_camp_kobold_soldier_experience);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;

            case "Vhoul Assassin Camp":
                creepImage1.setImageResource(R.drawable.neutrals_smallcamp_vhoul_assassin_camp_vhoul_assassin);
                creepName1.setText(R.string.neutrals_smallcamp_vhoul_assassin_camp_vhoul_assassin_name);
                creepHealth1.setText(R.string.neutrals_smallcamp_vhoul_assassin_camp_vhoul_assassin_health);
                creepAttack1.setText(R.string.neutrals_smallcamp_vhoul_assassin_camp_vhoul_assassin_attack);
                creepBounty1.setText(R.string.neutrals_smallcamp_vhoul_assassin_camp_vhoul_assassin_bounty);
                creepExperience1.setText(R.string.neutrals_smallcamp_vhoul_assassin_camp_vhoul_assassin_experience);
                creep1SkillImage1.setImageResource(R.drawable.neutrals_smallcamp_vhoul_assassin_camp_vhoul_assassin_skill_envenomed_weapon);
                creep1SkillName1.setText(R.string.neutrals_smallcamp_vhoul_assassin_camp_vhoul_assassin_skill1_name);
                creep1SkillDescription1.setText(R.string.neutrals_smallcamp_vhoul_assassin_camp_vhoul_assassin_skill1_description);
                creep1SkillText1.setText(R.string.neutrals_smallcamp_vhoul_assassin_camp_vhoul_assassin_skill1_text);
                creep1SkillImage2.setVisibility(GONE);
                creep1SkillName2.setVisibility(GONE);
                creep1SkillDescription2.setVisibility(GONE);
                creep1SkillText2.setVisibility(GONE);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);

                creepImage2.setVisibility(GONE);
                creepName2.setVisibility(GONE);
                creepHealth2.setVisibility(GONE);
                creepAttack2.setVisibility(GONE);
                creepBounty2.setVisibility(GONE);
                creepExperience2.setVisibility(GONE);

                creep2SkillImage1.setVisibility(GONE);
                creep2SkillName1.setVisibility(GONE);
                creep2SkillDescription1.setVisibility(GONE);
                creep2SkillText1.setVisibility(GONE);
                creep2SkillImage2.setVisibility(GONE);
                creep2SkillName2.setVisibility(GONE);
                creep2SkillDescription2.setVisibility(GONE);
                creep2SkillText2.setVisibility(GONE);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);

                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;



            //All of the medium camps
            case "Centaur Camp":
                creepImage1.setImageResource(R.drawable.neutrals_mediumcamp_centuar_camp_centaur_conqueror);
                creepName1.setText(R.string.neutrals_mediumcamp_centuar_camp_centaur_conqueror_name);
                creepHealth1.setText(R.string.neutrals_mediumcamp_centuar_camp_centaur_conqueror_health);
                creepAttack1.setText(R.string.neutrals_mediumcamp_centuar_camp_centaur_conqueror_attack);
                creepBounty1.setText(R.string.neutrals_mediumcamp_centuar_camp_centaur_conqueror_bounty);
                creepExperience1.setText(R.string.neutrals_mediumcamp_centuar_camp_centaur_conqueror_experience);
                creep1SkillImage1.setImageResource(R.drawable.neutrals_mediumcamp_centuar_camp_centaur_conqueror_skill_war_stomp);
                creep1SkillName1.setText(R.string.neutrals_mediumcamp_centuar_camp_centaur_conqueror_skill1_name);
                creep1SkillDescription1.setText(R.string.neutrals_mediumcamp_centuar_camp_centaur_conqueror_skill1_description);
                creep1SkillText1.setText(R.string.neutrals_mediumcamp_centuar_camp_centaur_conqueror_skill1_text);
                creep1SkillImage2.setVisibility(GONE);
                creep1SkillName2.setVisibility(GONE);
                creep1SkillDescription2.setVisibility(GONE);
                creep1SkillText2.setVisibility(GONE);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);

                creepImage2.setImageResource(R.drawable.neutrals_mediumcamp_centuar_camp_centaur_courser);
                creepName2.setText(R.string.neutrals_mediumcamp_centuar_camp_centaur_courser_name);
                creepHealth2.setText(R.string.neutrals_mediumcamp_centuar_camp_centaur_courser_health);
                creepAttack2.setText(R.string.neutrals_mediumcamp_centuar_camp_centaur_courser_attack);
                creepBounty2.setText(R.string.neutrals_mediumcamp_centuar_camp_centaur_courser_bounty);
                creepExperience2.setText(R.string.neutrals_mediumcamp_centuar_camp_centaur_courser_experience);
                creep2SkillImage1.setImageResource(R.drawable.neutrals_mediumcamp_centuar_camp_centaur_courser_skill_cloak_aura);
                creep2SkillName1.setText(R.string.neutrals_mediumcamp_centuar_camp_centaur_courser_skill1_name);
                creep2SkillDescription1.setText(R.string.neutrals_mediumcamp_centuar_camp_centaur_courser_skill1_description);
                creep2SkillText1.setText(R.string.neutrals_mediumcamp_centuar_camp_centaur_courser_skill1_text);
                creep2SkillImage2.setVisibility(GONE);
                creep2SkillName2.setVisibility(GONE);
                creep2SkillDescription2.setVisibility(GONE);
                creep2SkillText2.setVisibility(GONE);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);

                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;

            case "Golem Camp":
                creepImage1.setImageResource(R.drawable.neutrals_mediumcamp_golem_camp_mud_golem);
                creepName1.setText(R.string.neutrals_mediumcamp_golem_camp_mud_golem_name);
                creepHealth1.setText(R.string.neutrals_mediumcamp_golem_camp_mud_golem_health);
                creepAttack1.setText(R.string.neutrals_mediumcamp_golem_camp_mud_golem_attack);
                creepBounty1.setText(R.string.neutrals_mediumcamp_golem_camp_mud_golem_bounty);
                creepExperience1.setText(R.string.neutrals_mediumcamp_golem_camp_mud_golem_experience);
                creep1SkillImage1.setImageResource(R.drawable.neutrals_mediumcamp_golem_camp_mud_golem_skill_hurl_boulder);
                creep1SkillName1.setText(R.string.neutrals_mediumcamp_golem_camp_mud_golem_skill1_name);
                creep1SkillDescription1.setText(R.string.neutrals_mediumcamp_golem_camp_mud_golem_skill1_description);
                creep1SkillText1.setText(R.string.neutrals_mediumcamp_golem_camp_mud_golem_skill1_text);
                creep1SkillImage2.setImageResource(R.drawable.neutrals_mediumcamp_golem_camp_mud_golem_skill_shard_split);
                creep1SkillName2.setText(R.string.neutrals_mediumcamp_golem_camp_mud_golem_skill2_name);
                creep1SkillDescription2.setText(R.string.neutrals_mediumcamp_golem_camp_mud_golem_skill2_description);
                creep1SkillText2.setText(R.string.neutrals_mediumcamp_golem_camp_mud_golem_skill2_text);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);

                creepImage2.setVisibility(GONE);
                creepName2.setVisibility(GONE);
                creepHealth2.setVisibility(GONE);
                creepAttack2.setVisibility(GONE);
                creepBounty2.setVisibility(GONE);
                creepExperience2.setVisibility(GONE);

                creep2SkillImage1.setVisibility(GONE);
                creep2SkillName1.setVisibility(GONE);
                creep2SkillDescription1.setVisibility(GONE);
                creep2SkillText1.setVisibility(GONE);
                creep2SkillImage2.setVisibility(GONE);
                creep2SkillName2.setVisibility(GONE);
                creep2SkillDescription2.setVisibility(GONE);
                creep2SkillText2.setVisibility(GONE);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);

                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;

            case "Ogre Camp":
                creepImage1.setImageResource(R.drawable.neutrals_mediumcamp_ogre_camp_ogre_bruiser);
                creepName1.setText(R.string.neutrals_mediumcamp_ogre_camp_ogre_bruiser_name);
                creepHealth1.setText(R.string.neutrals_mediumcamp_ogre_camp_ogre_bruiser_health);
                creepAttack1.setText(R.string.neutrals_mediumcamp_ogre_camp_ogre_bruiser_attack);
                creepBounty1.setText(R.string.neutrals_mediumcamp_ogre_camp_ogre_bruiser_bounty);
                creepExperience1.setText(R.string.neutrals_mediumcamp_ogre_camp_ogre_bruiser_experience);

                creep1SkillImage1.setVisibility(GONE);
                creep1SkillName1.setVisibility(GONE);
                creep1SkillDescription1.setVisibility(GONE);
                creep1SkillText1.setVisibility(GONE);
                creep1SkillImage2.setVisibility(GONE);
                creep1SkillName2.setVisibility(GONE);
                creep1SkillDescription2.setVisibility(GONE);
                creep1SkillText2.setVisibility(GONE);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);

                creepImage2.setImageResource(R.drawable.neutrals_mediumcamp_ogre_camp_ogre_frostmage);
                creepName2.setText(R.string.neutrals_mediumcamp_ogre_camp_ogre_frostmage_name);
                creepHealth2.setText(R.string.neutrals_mediumcamp_ogre_camp_ogre_frostmage_health);
                creepAttack2.setText(R.string.neutrals_mediumcamp_ogre_camp_ogre_frostmage_attack);
                creepBounty2.setText(R.string.neutrals_mediumcamp_ogre_camp_ogre_frostmage_bounty);
                creepExperience2.setText(R.string.neutrals_mediumcamp_ogre_camp_ogre_frostmage_experience);
                creep2SkillImage1.setImageResource(R.drawable.neutrals_mediumcamp_ogre_camp_ogre_frostmage_skill_ice_armour);
                creep2SkillName1.setText(R.string.neutrals_mediumcamp_ogre_camp_ogre_frostmage_skill1_name);
                creep2SkillDescription1.setText(R.string.neutrals_mediumcamp_ogre_camp_ogre_frostmage_skill1_description);
                creep2SkillText1.setText(R.string.neutrals_mediumcamp_ogre_camp_ogre_frostmage_skill1_text);
                creep2SkillImage2.setVisibility(GONE);
                creep2SkillName2.setVisibility(GONE);
                creep2SkillDescription2.setVisibility(GONE);
                creep2SkillText2.setVisibility(GONE);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);

                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;

            case "Satyr Camp":
                creepImage1.setImageResource(R.drawable.neutrals_mediumcamp_satyr_camp_satyr_banisher);
                creepName1.setText(R.string.neutrals_mediumcamp_satyr_camp_satyr_banisher_name);
                creepHealth1.setText(R.string.neutrals_mediumcamp_satyr_camp_satyr_banisher_health);
                creepAttack1.setText(R.string.neutrals_mediumcamp_satyr_camp_satyr_banisher_attack);
                creepBounty1.setText(R.string.neutrals_mediumcamp_satyr_camp_satyr_banisher_bounty);
                creepExperience1.setText(R.string.neutrals_mediumcamp_satyr_camp_satyr_banisher_experience);
                creep1SkillImage1.setImageResource(R.drawable.neutrals_mediumcamp_satyr_camp_satyr_banisher_skill_purge);
                creep1SkillName1.setText(R.string.neutrals_mediumcamp_satyr_camp_satyr_banisher_skill1_name);
                creep1SkillDescription1.setText(R.string.neutrals_mediumcamp_satyr_camp_satyr_banisher_skill1_description);
                creep1SkillText1.setText(R.string.neutrals_mediumcamp_satyr_camp_satyr_banisher_skill1_text);
                creep1SkillImage2.setVisibility(GONE);
                creep1SkillName2.setVisibility(GONE);
                creep1SkillDescription2.setVisibility(GONE);
                creep1SkillText2.setVisibility(GONE);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);

                creepImage2.setImageResource(R.drawable.neutrals_mediumcamp_satyr_camp_satyr_mindstealer);
                creepName2.setText(R.string.neutrals_mediumcamp_satyr_camp_satyr_mindstealer_name);
                creepHealth2.setText(R.string.neutrals_mediumcamp_satyr_camp_satyr_mindstealer_health);
                creepAttack2.setText(R.string.neutrals_mediumcamp_satyr_camp_satyr_mindstealer_attack);
                creepBounty2.setText(R.string.neutrals_mediumcamp_satyr_camp_satyr_mindstealer_bounty);
                creepExperience2.setText(R.string.neutrals_mediumcamp_satyr_camp_satyr_mindstealer_experience);
                creep2SkillImage1.setImageResource(R.drawable.neutrals_mediumcamp_satyr_camp_satyr_mindstealer_skill_mana_burn);
                creep2SkillName1.setText(R.string.neutrals_mediumcamp_satyr_camp_satyr_mindstealer_skill1_name);
                creep2SkillDescription1.setText(R.string.neutrals_mediumcamp_satyr_camp_satyr_mindstealer_skill1_description);
                creep2SkillText1.setText(R.string.neutrals_mediumcamp_satyr_camp_satyr_mindstealer_skill1_text);
                creep2SkillImage2.setVisibility(GONE);
                creep2SkillName2.setVisibility(GONE);
                creep2SkillDescription2.setVisibility(GONE);
                creep2SkillText2.setVisibility(GONE);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);

                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);


                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);

                break;

            case "Wolf Camp":
                creepImage1.setImageResource(R.drawable.neutrals_mediumcamp_wolf_camp_alpha_wolf);
                creepName1.setText(R.string.neutrals_mediumcamp_wolf_camp_alpha_wolf_name);
                creepHealth1.setText(R.string.neutrals_mediumcamp_wolf_camp_alpha_wolf_health);
                creepAttack1.setText(R.string.neutrals_mediumcamp_wolf_camp_alpha_wolf_attack);
                creepBounty1.setText(R.string.neutrals_mediumcamp_wolf_camp_alpha_wolf_bounty);
                creepExperience1.setText(R.string.neutrals_mediumcamp_wolf_camp_alpha_wolf_experience);
                creep1SkillImage1.setImageResource(R.drawable.neutrals_mediumcamp_wolf_camp_alpha_wolf_skill_critical_strike);
                creep1SkillName1.setText(R.string.neutrals_mediumcamp_wolf_camp_alpha_wolf_skill1_name);
                creep1SkillDescription1.setText(R.string.neutrals_mediumcamp_wolf_camp_alpha_wolf_skill1_description);
                creep1SkillText1.setText(R.string.neutrals_mediumcamp_wolf_camp_alpha_wolf_skill1_text);
                creep1SkillImage2.setImageResource(R.drawable.neutrals_mediumcamp_wolf_camp_alpha_wolf_skill_packleaders_aura);
                creep1SkillName2.setText(R.string.neutrals_mediumcamp_wolf_camp_alpha_wolf_skill2_name);
                creep1SkillDescription2.setText(R.string.neutrals_mediumcamp_wolf_camp_alpha_wolf_skill2_description);
                creep1SkillText2.setText(R.string.neutrals_mediumcamp_wolf_camp_alpha_wolf_skill2_text);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);

                creepImage2.setImageResource(R.drawable.neutrals_mediumcamp_wolf_camp_giant_wolf);
                creepName2.setText(R.string.neutrals_mediumcamp_wolf_camp_giant_wolf_name);
                creepHealth2.setText(R.string.neutrals_mediumcamp_wolf_camp_giant_wolf_health);
                creepAttack2.setText(R.string.neutrals_mediumcamp_wolf_camp_giant_wolf_attack);
                creepBounty2.setText(R.string.neutrals_mediumcamp_wolf_camp_giant_wolf_bounty);
                creepExperience2.setText(R.string.neutrals_mediumcamp_wolf_camp_giant_wolf_experience);

                creep2SkillImage1.setVisibility(GONE);
                creep2SkillName1.setVisibility(GONE);
                creep2SkillDescription1.setVisibility(GONE);
                creep2SkillText1.setVisibility(GONE);
                creep2SkillImage2.setVisibility(GONE);
                creep2SkillName2.setVisibility(GONE);
                creep2SkillDescription2.setVisibility(GONE);
                creep2SkillText2.setVisibility(GONE);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);

                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;


            //All of the large camps
            case "Hellbear Camp":
                creepImage1.setImageResource(R.drawable.neutrals_largecamp_hellbear_camp_hellbear);
                creepName1.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_name);
                creepHealth1.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_health);
                creepAttack1.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_attack);
                creepBounty1.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_bounty);
                creepExperience1.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_experience);
                creep1SkillImage1.setImageResource(R.drawable.neutrals_largecamp_hellbear_camp_hellbear_skill_cloak_aura);
                creep1SkillName1.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_skill1_name);
                creep1SkillDescription1.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_skill1_description);
                creep1SkillText1.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_skill1_text);
                creep1SkillImage2.setVisibility(GONE);
                creep1SkillName2.setVisibility(GONE);
                creep1SkillDescription2.setVisibility(GONE);
                creep1SkillText2.setVisibility(GONE);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);

                creepImage2.setImageResource(R.drawable.neutrals_largecamp_hellbear_camp_hellbear_smasher);
                creepName2.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_smasher_name);
                creepHealth2.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_smasher_health);
                creepAttack2.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_smasher_attack);
                creepBounty2.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_smasher_bounty);
                creepExperience2.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_smasher_experience);
                creep2SkillImage1.setImageResource(R.drawable.neutrals_largecamp_hellbear_camp_hellbear_smasher_skill_thunder_clap);
                creep2SkillName1.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_smasher_skill1_name);
                creep2SkillDescription1.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_smasher_skill1_description);
                creep2SkillText1.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_smasher_skill1_text);
                creep2SkillImage2.setImageResource(R.drawable.neutrals_largecamp_hellbear_camp_hellbear_smasher_skill_swiftness_aura);
                creep2SkillName2.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_smasher_skill2_name);
                creep2SkillDescription2.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_smasher_skill2_description);
                creep2SkillText2.setText(R.string.neutrals_largecamp_hellbear_camp_hellbear_smasher_skill2_text);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);

                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;

            case "Large Centaur Camp":
                creepImage1.setImageResource(R.drawable.neutrals_largecamp_large_centaur_camp_centaur_conqueror);
                creepName1.setText(R.string.neutrals_largecamp_large_centaur_camp_centaur_conqueror_name);
                creepHealth1.setText(R.string.neutrals_largecamp_large_centaur_camp_centaur_conqueror_health);
                creepAttack1.setText(R.string.neutrals_largecamp_large_centaur_camp_centaur_conqueror_attack);
                creepBounty1.setText(R.string.neutrals_largecamp_large_centaur_camp_centaur_conqueror_bounty);
                creepExperience1.setText(R.string.neutrals_largecamp_large_centaur_camp_centaur_conqueror_experience);
                creep1SkillImage1.setImageResource(R.drawable.neutrals_largecamp_large_centaur_camp_centaur_conqueror_skill_war_stomp);
                creep1SkillName1.setText(R.string.neutrals_largecamp_large_centuar_camp_centaur_conqueror_skill1_name);
                creep1SkillDescription1.setText(R.string.neutrals_largecamp_large_centuar_camp_centaur_conqueror_skill1_description);
                creep1SkillText1.setText(R.string.neutrals_largecamp_large_centuar_camp_centaur_conqueror_skill1_text);
                creep1SkillImage2.setVisibility(GONE);
                creep1SkillName2.setVisibility(GONE);
                creep1SkillDescription2.setVisibility(GONE);
                creep1SkillText2.setVisibility(GONE);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);

                creepImage2.setImageResource(R.drawable.neutrals_largecamp_large_centaur_camp_centaur_courser);
                creepName2.setText(R.string.neutrals_largecamp_large_centaur_camp_centaur_courser_name);
                creepHealth2.setText(R.string.neutrals_largecamp_large_centaur_camp_centaur_courser_health);
                creepAttack2.setText(R.string.neutrals_largecamp_large_centaur_camp_centaur_courser_attack);
                creepBounty2.setText(R.string.neutrals_largecamp_large_centaur_camp_centaur_courser_bounty);
                creepExperience2.setText(R.string.neutrals_largecamp_large_centaur_camp_centaur_courser_experience);
                creep2SkillImage1.setImageResource(R.drawable.neutrals_largecamp_large_centaur_camp_centaur_courser_skill_cloak_aura);
                creep2SkillName1.setText(R.string.neutrals_largecamp_large_centuar_camp_centaur_courser_skill1_name);
                creep2SkillDescription1.setText(R.string.neutrals_largecamp_large_centuar_camp_centaur_courser_skill1_description);
                creep2SkillText1.setText(R.string.neutrals_largecamp_large_centuar_camp_centaur_courser_skill1_text);
                creep2SkillImage2.setVisibility(GONE);
                creep2SkillName2.setVisibility(GONE);
                creep2SkillDescription2.setVisibility(GONE);
                creep2SkillText2.setVisibility(GONE);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);

                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;

            case "Large Satyr Camp":
                creepImage1.setImageResource(R.drawable.neutrals_largecamp_large_satyr_camp_satyr_banisher);
                creepName1.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_banisher_name);
                creepHealth1.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_banisher_health);
                creepAttack1.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_banisher_attack);
                creepBounty1.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_banisher_bounty);
                creepExperience1.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_banisher_experience);
                creep1SkillImage1.setImageResource(R.drawable.neutrals_largecamp_large_satyr_camp_satyr_banisher_skill_purge);
                creep1SkillName1.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_banisher_skill1_name);
                creep1SkillDescription1.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_banisher_skill1_description);
                creep1SkillText1.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_banisher_skill1_text);
                creep1SkillImage2.setVisibility(GONE);
                creep1SkillName2.setVisibility(GONE);
                creep1SkillDescription2.setVisibility(GONE);
                creep1SkillText2.setVisibility(GONE);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);

                creepImage2.setImageResource(R.drawable.neutrals_largecamp_large_satyr_camp_satyr_mindstealer);
                creepName2.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_mindstealer_name);
                creepHealth2.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_mindstealer_health);
                creepAttack2.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_mindstealer_attack);
                creepBounty2.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_mindstealer_bounty);
                creepExperience2.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_mindstealer_experience);
                creep2SkillImage1.setImageResource(R.drawable.neutrals_largecamp_large_satyr_camp_satyr_mindstealer_skill_mana_burn);
                creep2SkillName1.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_mindstealer_skill1_name);
                creep2SkillDescription1.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_mindstealer_skill1_description);
                creep2SkillText1.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_mindstealer_skill1_text);
                creep2SkillImage2.setVisibility(GONE);
                creep2SkillName2.setVisibility(GONE);
                creep2SkillDescription2.setVisibility(GONE);
                creep2SkillText2.setVisibility(GONE);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);

                creepImage3.setImageResource(R.drawable.neutrals_largecamp_large_satyr_camp_satyr_tormenter);
                creepName3.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_tormenter_name);
                creepHealth3.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_tormenter_health);
                creepAttack3.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_tormenter_attack);
                creepBounty3.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_tormenter_bounty);
                creepExperience3.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_tormenter_experience);
                creep3SkillImage1.setImageResource(R.drawable.neutrals_largecamp_large_satyr_camp_satyr_tormenter_skill_shockwave);
                creep3SkillName1.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_tormenter_skill1_name);
                creep3SkillDescription1.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_tormenter_skill1_description);
                creep3SkillText1.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_tormenter_skill1_text);
                creep3SkillImage2.setImageResource(R.drawable.neutrals_largecamp_large_satyr_camp_satyr_tormenter_skill_unholy_aura);
                creep3SkillName2.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_tormenter_skill2_name);
                creep3SkillDescription2.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_tormenter_skill2_description);
                creep3SkillText2.setText(R.string.neutrals_largecamp_large_satyr_camp_satyr_tormenter_skill2_text);
                break;

            case "Troll Camp":
                creepImage1.setImageResource(R.drawable.neutrals_largecamp_troll_camp_dark_troll_summoner);
                creepName1.setText(R.string.neutrals_largecamp_troll_camp_dark_troll_summoner_name);
                creepHealth1.setText(R.string.neutrals_largecamp_troll_camp_dark_troll_summoner_health);
                creepAttack1.setText(R.string.neutrals_largecamp_troll_camp_dark_troll_summoner_attack);
                creepBounty1.setText(R.string.neutrals_largecamp_troll_camp_dark_troll_summoner_bounty);
                creepExperience1.setText(R.string.neutrals_largecamp_troll_camp_dark_troll_summoner_experience);
                creep1SkillImage1.setImageResource(R.drawable.neutrals_largecamp_troll_camp_dark_troll_summoner_skill_ensnare);
                creep1SkillName1.setText(R.string.neutrals_largecamp_troll_camp_dark_troll_summoner_skill1_name);
                creep1SkillDescription1.setText(R.string.neutrals_largecamp_troll_camp_dark_troll_summoner_skill1_description);
                creep1SkillText1.setText(R.string.neutrals_largecamp_troll_camp_dark_troll_summoner_skill1_text);
                creep1SkillImage2.setImageResource(R.drawable.neutrals_largecamp_troll_camp_dark_troll_summoner_skill_raise_dead);
                creep1SkillName2.setText(R.string.neutrals_largecamp_troll_camp_dark_troll_summoner_skill2_name);
                creep1SkillDescription2.setText(R.string.neutrals_largecamp_troll_camp_dark_troll_summoner_skill2_description);
                creep1SkillText2.setText(R.string.neutrals_largecamp_troll_camp_dark_troll_summoner_skill2_text);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);

                creepImage2.setImageResource(R.drawable.neutrals_largecamp_troll_camp_hill_troll);
                creepName2.setText(R.string.neutrals_largecamp_troll_camp_hill_troll_name);
                creepHealth2.setText(R.string.neutrals_largecamp_troll_camp_hill_troll_health);
                creepAttack2.setText(R.string.neutrals_largecamp_troll_camp_hill_troll_attack);
                creepBounty2.setText(R.string.neutrals_largecamp_troll_camp_hill_troll_bounty);
                creepExperience2.setText(R.string.neutrals_largecamp_troll_camp_hill_troll_experience);

                creep2SkillImage1.setVisibility(GONE);
                creep2SkillName1.setVisibility(GONE);
                creep2SkillDescription1.setVisibility(GONE);
                creep2SkillText1.setVisibility(GONE);
                creep2SkillImage2.setVisibility(GONE);
                creep2SkillName2.setVisibility(GONE);
                creep2SkillDescription2.setVisibility(GONE);
                creep2SkillText2.setVisibility(GONE);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);

                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;

            case "Wildwing Camp":
                creepImage1.setImageResource(R.drawable.neutrals_largecamp_wildwing_camp_wildwing);
                creepName1.setText(R.string.neutrals_largecamp_wildwing_camp_wildwing_name);
                creepHealth1.setText(R.string.neutrals_largecamp_wildwing_camp_wildwing_health);
                creepAttack1.setText(R.string.neutrals_largecamp_wildwing_camp_wildwing_attack);
                creepBounty1.setText(R.string.neutrals_largecamp_wildwing_camp_wildwing_bounty);
                creepExperience1.setText(R.string.neutrals_largecamp_wildwing_camp_wildwing_experience);

                creep1SkillImage1.setVisibility(GONE);
                creep1SkillName1.setVisibility(GONE);
                creep1SkillDescription1.setVisibility(GONE);
                creep1SkillText1.setVisibility(GONE);
                creep1SkillImage2.setVisibility(GONE);
                creep1SkillName2.setVisibility(GONE);
                creep1SkillDescription2.setVisibility(GONE);
                creep1SkillText2.setVisibility(GONE);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);


                creepImage2.setImageResource(R.drawable.neutrals_largecamp_wildwing_camp_wildwing_ripper);
                creepName2.setText(R.string.neutrals_largecamp_wildwing_camp_wildwing_ripper_name);
                creepHealth2.setText(R.string.neutrals_largecamp_wildwing_camp_wildwing_ripper_health);
                creepAttack2.setText(R.string.neutrals_largecamp_wildwing_camp_wildwing_ripper_attack);
                creepBounty2.setText(R.string.neutrals_largecamp_wildwing_camp_wildwing_ripper_bounty);
                creepExperience2.setText(R.string.neutrals_largecamp_wildwing_camp_wildwing_ripper_experience);
                creep2SkillImage1.setImageResource(R.drawable.neutrals_largecamp_wildwing_camp_wildwing_ripper_skill_tornando);
                creep2SkillName1.setText(R.string.neutrals_largecamp_wildwing_camp_wildwing_ripper_skill1_name);
                creep2SkillDescription1.setText(R.string.neutrals_largecamp_wildwing_camp_wildwing_ripper_skill1_description);
                creep2SkillText1.setText(R.string.neutrals_largecamp_wildwing_camp_wildwing_ripper_skill1_text);
                creep2SkillImage2.setImageResource(R.drawable.neutrals_largecamp_wildwing_camp_wildwing_ripper_skill_toughness_aura);
                creep2SkillName2.setText(R.string.neutrals_largecamp_wildwing_camp_wildwing_ripper_skill2_name);
                creep2SkillDescription2.setText(R.string.neutrals_largecamp_wildwing_camp_wildwing_ripper_skill2_description);
                creep2SkillText2.setText(R.string.neutrals_largecamp_wildwing_camp_wildwing_ripper_skill2_text);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);

                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;


            //All of the ancient camps
            case "Dragon Camp":
                creepImage1.setImageResource(R.drawable.neutrals_ancientcamp_dragon_camp_ancient_black_dragon);
                creepName1.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_dragon_name);
                creepHealth1.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_dragon_name);
                creepAttack1.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_dragon_attack);
                creepBounty1.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_dragon_bounty);
                creepExperience1.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_dragon_experience);
                creep1SkillImage1.setImageResource(R.drawable.neutrals_ancientcamp_dragon_camp_ancient_black_dragon_skill_fireball);
                creep1SkillName1.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_dragon_skill1_name);
                creep1SkillDescription1.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_dragon_skill1_description);
                creep1SkillText1.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_dragon_skill1_text);
                creep1SkillImage2.setImageResource(R.drawable.neutrals_ancientcamp_dragon_camp_ancient_black_dragon_skill_splash_attack);
                creep1SkillName2.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_dragon_skill2_name);
                creep1SkillDescription2.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_dragon_skill2_description);
                creep1SkillText2.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_dragon_skill2_text);
                creep1SkillImage3.setImageResource(R.drawable.neutrals_ancientcamp_dragon_camp_ancient_black_dragon_skill_dragonhide_aura);
                creep1SkillName3.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_dragon_skill3_name);
                creep1SkillDescription3.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_dragon_skill3_description);
                creep1SkillText3.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_dragon_skill3_text);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);

                creepImage2.setImageResource(R.drawable.neutrals_ancientcamp_dragon_camp_ancient_black_drake);
                creepName2.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_drake_name);
                creepHealth2.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_drake_health);
                creepAttack2.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_drake_attack);
                creepBounty2.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_drake_bounty);
                creepExperience2.setText(R.string.neutrals_ancientcamp_dragon_camp_ancient_black_drake_experience);

                creep2SkillImage1.setVisibility(GONE);
                creep2SkillName1.setVisibility(GONE);
                creep2SkillDescription1.setVisibility(GONE);
                creep2SkillText1.setVisibility(GONE);
                creep2SkillImage2.setVisibility(GONE);
                creep2SkillName2.setVisibility(GONE);
                creep2SkillDescription2.setVisibility(GONE);
                creep2SkillText2.setVisibility(GONE);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);

                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;

            case "Large Golem Camp":
                creepImage1.setImageResource(R.drawable.neutrals_ancientcamp_large_golem_camp_ancient_granite_golem);
                creepName1.setText(R.string.neutrals_ancientcamp_large_golem_camp_ancient_granite_golem_name);
                creepHealth1.setText(R.string.neutrals_ancientcamp_large_golem_camp_ancient_granite_golem_health);
                creepAttack1.setText(R.string.neutrals_ancientcamp_large_golem_camp_ancient_granite_golem_attack);
                creepBounty1.setText(R.string.neutrals_ancientcamp_large_golem_camp_ancient_granite_golem_bounty);
                creepExperience1.setText(R.string.neutrals_ancientcamp_large_golem_camp_ancient_granite_golem_experience);
                creep1SkillImage1.setImageResource(R.drawable.neutrals_ancientcamp_large_golem_camp_ancient_granite_golem_skill_granite_aura);
                creep1SkillName1.setText(R.string.neutrals_ancientcamp_large_golem_camp_ancient_granite_golem_skill1_name);
                creep1SkillDescription1.setText(R.string.neutrals_ancientcamp_large_golem_camp_ancient_granite_golem_skill1_description);
                creep1SkillText1.setText(R.string.neutrals_ancientcamp_large_golem_camp_ancient_granite_golem_skill1_text);
                creep1SkillImage2.setVisibility(GONE);
                creep1SkillName2.setVisibility(GONE);
                creep1SkillDescription2.setVisibility(GONE);
                creep1SkillText2.setVisibility(GONE);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);

                creepImage2.setImageResource(R.drawable.neutrals_ancientcamp_large_golem_camp_ancient_rock_golem);
                creepName2.setText(R.string.neutrals_ancientcamp_large_golem_camp_ancient_rock_golem_name);
                creepHealth2.setText(R.string.neutrals_ancientcamp_large_golem_camp_ancient_rock_golem_health);
                creepAttack2.setText(R.string.neutrals_ancientcamp_large_golem_camp_ancient_rock_golem_attack);
                creepBounty2.setText(R.string.neutrals_ancientcamp_large_golem_camp_ancient_rock_golem_bounty);
                creepExperience2.setText(R.string.neutrals_ancientcamp_large_golem_camp_ancient_rock_golem_experience);

                creep2SkillImage1.setVisibility(GONE);
                creep2SkillName1.setVisibility(GONE);
                creep2SkillDescription1.setVisibility(GONE);
                creep2SkillText1.setVisibility(GONE);
                creep2SkillImage2.setVisibility(GONE);
                creep2SkillName2.setVisibility(GONE);
                creep2SkillDescription2.setVisibility(GONE);
                creep2SkillText2.setVisibility(GONE);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);

                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;

            case "Thunderhide Camp":
                creepImage1.setImageResource(R.drawable.neutrals_ancientcamp_thunderhide_camp_ancient_rumblehide);
                creepName1.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_rumblehide_name);
                creepHealth1.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_rumblehide_health);
                creepAttack1.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_rumblehide_attack);
                creepBounty1.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_rumblehide_bounty);
                creepExperience1.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_rumblehide_experience);

                creep1SkillImage1.setImageResource(R.drawable.neutrals_ancientcamp_thunderhide_camp_ancient_rumblehide_skill_war_drums_aura);
                creep1SkillName1.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_rumblehide_skill1_name);
                creep1SkillDescription1.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_rumblehide_skill1_description);
                creep1SkillText1.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_rumblehide_skill1_text);
                creep1SkillImage2.setVisibility(GONE);
                creep1SkillName2.setVisibility(GONE);
                creep1SkillDescription2.setVisibility(GONE);
                creep1SkillText2.setVisibility(GONE);
                creep1SkillImage3.setVisibility(GONE);
                creep1SkillName3.setVisibility(GONE);
                creep1SkillDescription3.setVisibility(GONE);
                creep1SkillText3.setVisibility(GONE);
                creep1SkillImage4.setVisibility(GONE);
                creep1SkillName4.setVisibility(GONE);
                creep1SkillDescription4.setVisibility(GONE);
                creep1SkillText4.setVisibility(GONE);

                creepImage2.setImageResource(R.drawable.neutrals_ancientcamp_thunderhide_camp_ancient_thunderhide);
                creepName2.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_thunderhide_name);
                creepHealth2.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_thunderhide_health);
                creepAttack2.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_thunderhide_attack);
                creepBounty2.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_thunderhide_bounty);
                creepExperience2.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_thunderhide_experience);
                creep2SkillImage1.setImageResource(R.drawable.neutrals_ancientcamp_thunderhide_camp_ancient_thunderhide_skill_frenzy);
                creep2SkillName1.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_thunderhide_skill1_name);
                creep2SkillDescription1.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_thunderhide_skill1_description);
                creep2SkillText1.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_thunderhide_skill1_text);
                creep2SkillImage2.setImageResource(R.drawable.neutrals_ancientcamp_thunderhide_camp_ancient_rumblehide_skill_war_drums_aura);
                creep2SkillName2.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_thunderhide_skill2_name);
                creep2SkillDescription2.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_thunderhide_skill2_description);
                creep2SkillText2.setText(R.string.neutrals_ancientcamp_thunderhide_camp_ancient_thunderhide_skill2_text);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);



                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;

                //For Roshan
            case "Roshan":
                creepImage1.setImageResource(R.drawable.neutrals_roshan);
                creepName1.setText(R.string.neutrals_roshan_name);
                creepHealth1.setText(R.string.neutrals_roshan_health);
                creepAttack1.setText(R.string.neutrals_roshan_attack);
                creepBounty1.setText(R.string.neutrals_roshan_bounty);
                creepExperience1.setText(R.string.neutrals_roshan_experience);

                creep1SkillImage1.setImageResource(R.drawable.neutrals_roshan_skill_spell_block);
                creep1SkillName1.setText(R.string.neutrals_roshan_skill1_name);
                creep1SkillDescription1.setText(R.string.neutrals_roshan_skill1_description);
                creep1SkillText1.setText(R.string.neutrals_roshan_skill1_text);
                creep1SkillImage2.setImageResource(R.drawable.neutrals_roshan_skill_bash);
                creep1SkillName2.setText(R.string.neutrals_roshan_skill2_name);
                creep1SkillDescription2.setText(R.string.neutrals_roshan_skill2_description);
                creep1SkillText2.setText(R.string.neutrals_roshan_skill2_text);
                creep1SkillImage3.setImageResource(R.drawable.neutrals_roshan_skill_slam);
                creep1SkillName3.setText(R.string.neutrals_roshan_skill3_name);
                creep1SkillDescription3.setText(R.string.neutrals_roshan_skill3_description);
                creep1SkillText3.setText(R.string.neutrals_roshan_skill3_text);
                creep1SkillImage4.setImageResource(R.drawable.neutrals_roshan_skill_strength_of_the_immortal);
                creep1SkillName4.setText(R.string.neutrals_roshan_skill4_name);
                creep1SkillDescription4.setText(R.string.neutrals_roshan_skill4_description);
                creep1SkillText4.setText(R.string.neutrals_roshan_skill4_text);

                creepImage2.setVisibility(GONE);
                creepName2.setVisibility(GONE);
                creepHealth2.setVisibility(GONE);
                creepAttack2.setVisibility(GONE);
                creepBounty2.setVisibility(GONE);
                creepExperience2.setVisibility(GONE);

                creep2SkillImage1.setVisibility(GONE);
                creep2SkillName1.setVisibility(GONE);
                creep2SkillDescription1.setVisibility(GONE);
                creep2SkillText1.setVisibility(GONE);
                creep2SkillImage2.setVisibility(GONE);
                creep2SkillName2.setVisibility(GONE);
                creep2SkillDescription2.setVisibility(GONE);
                creep2SkillText2.setVisibility(GONE);
                creep2SkillImage3.setVisibility(GONE);
                creep2SkillName3.setVisibility(GONE);
                creep2SkillDescription3.setVisibility(GONE);
                creep2SkillText3.setVisibility(GONE);
                creep2SkillImage4.setVisibility(GONE);
                creep2SkillName4.setVisibility(GONE);
                creep2SkillDescription4.setVisibility(GONE);
                creep2SkillText4.setVisibility(GONE);

                creepImage3.setVisibility(GONE);
                creepName3.setVisibility(GONE);
                creepHealth3.setVisibility(GONE);
                creepAttack3.setVisibility(GONE);
                creepBounty3.setVisibility(GONE);
                creepExperience3.setVisibility(GONE);

                creep3SkillImage1.setVisibility(GONE);
                creep3SkillName1.setVisibility(GONE);
                creep3SkillDescription1.setVisibility(GONE);
                creep3SkillText1.setVisibility(GONE);
                creep3SkillImage2.setVisibility(GONE);
                creep3SkillName2.setVisibility(GONE);
                creep3SkillDescription2.setVisibility(GONE);
                creep3SkillText2.setVisibility(GONE);
                break;
        }
}
}
