package com.gamestudi.d2heroguide.HeroScreens;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.gamestudi.d2heroguide.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class HeroScreenFragment extends Fragment {

    private static View mView;

    public static final HeroScreenFragment newInstance() {
        HeroScreenFragment f = new HeroScreenFragment();

        Bundle b = new Bundle();

        f.setArguments(b);

        return f;

    }

    //Is used for the adview
    private AdView mAdView;


    //Imageviews used to display the hero skills
    //There are generally only 4 skills per hero however there are some who require more
    //Such as heroes like Invoker who have 14 skills
    ImageView heroSkill1;
    ImageView heroSkill2;
    ImageView heroSkill3;
    ImageView heroSkill4;
    ImageView heroSkill5;
    ImageView heroSkill6;
    ImageView heroSkill7;
    ImageView heroSkill8;
    ImageView heroSkill9;
    ImageView heroSkill10;
    ImageView heroSkill11;
    ImageView heroSkill12;
    ImageView heroSkill13;
    ImageView heroSkill14;


    //Starts referencing all of the required fields from the XML file.
    //We will be updating the imageViews and textViews based on which hero was selected
    //So if Crystal Maiden was selected then we will change the imageviews and textviews to Crystal Maidans pictures and text, etc through code
    ImageView heroIcon;
    TextView heroName;
    TextView heroRole;

    TextView talent1;
    TextView talent2;
    TextView talent3;
    TextView talent4;
    TextView talent5;
    TextView talent6;
    TextView talent7;
    TextView talent8;





    TextView skillName;
    TextView skillDescription;
    TextView skillText;
    TextView scepterSkillText;
    TextView aghanimShardAbility;

    TextView skillCooldown;
    TextView skillManacost;


    //Is used to set the alpha value of the hero Skill.
    //When we select a skill we will make the other unselected skills fade through the alpha value
    final double alphaValue = .3;

    String strSkillName1;
    String strSkillName2;
    String strSkillName3;
    String strSkillName4;
    String strSkillName5;
    String strSkillName6;
    String strSkillName7;
    String strSkillName8;
    String strSkillName9;
    String strSkillName10;
    String strSkillName11;
    String strSkillName12;
    String strSkillName13;
    String strSkillName14;

    String strSkillDescription1;
    String strSkillDescription2;
    String strSkillDescription3;
    String strSkillDescription4;
    String strSkillDescription5;
    String strSkillDescription6;
    String strSkillDescription7;
    String strSkillDescription8;
    String strSkillDescription9;
    String strSkillDescription10;
    String strSkillDescription11;
    String strSkillDescription12;
    String strSkillDescription13;
    String strSkillDescription14;

    String strSkillText1;
    String strSkillText2;
    String strSkillText3;
    String strSkillText4;
    String strSkillText5;
    String strSkillText6;
    String strSkillText7;
    String strSkillText8;
    String strSkillText9;
    String strSkillText10;
    String strSkillText11;
    String strSkillText12;
    String strSkillText13;
    String strSkillText14;

    String strScepterSkillText1;
    String strScepterSkillText2;
    String strScepterSkillText3;
    String strScepterSkillText4;
    String strScepterSkillText5;
    String strScepterSkillText6;
    String strScepterSkillText7;
    String strScepterSkillText8;
    String strScepterSkillText9;
    String strScepterSkillText10;
    String strScepterSkillText11;
    String strScepterSkillText12;
    String strScepterSkillText13;
    String strScepterSkillText14;

    String aghanimShardAbilityText;

    String strSkillCooldown1;
    String strSkillCooldown2;
    String strSkillCooldown3;
    String strSkillCooldown4;
    String strSkillCooldown5;
    String strSkillCooldown6;
    String strSkillCooldown7;
    String strSkillCooldown8;
    String strSkillCooldown9;
    String strSkillCooldown10;
    String strSkillCooldown11;
    String strSkillCooldown12;
    String strSkillCooldown13;
    String strSkillCooldown14;

    String strSkillManacost1;
    String strSkillManacost2;
    String strSkillManacost3;
    String strSkillManacost4;
    String strSkillManacost5;
    String strSkillManacost6;
    String strSkillManacost7;
    String strSkillManacost8;
    String strSkillManacost9;
    String strSkillManacost10;
    String strSkillManacost11;
    String strSkillManacost12;
    String strSkillManacost13;
    String strSkillManacost14;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mView = inflater.inflate(R.layout.hero_screen_fragment_1,
                container, false);


        //Loads the ad as soon as the activity is created
        mAdView = (AdView) mView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        heroSkill1 = (ImageView) mView.findViewById(R.id.heroSkill1);
        heroSkill2 = (ImageView) mView.findViewById(R.id.heroSkill2);
        heroSkill3 = (ImageView) mView.findViewById(R.id.heroSkill3);
        heroSkill4 = (ImageView) mView.findViewById(R.id.heroSkill4);
        heroSkill5 = (ImageView) mView.findViewById(R.id.heroSkill5);
        heroSkill6 = (ImageView) mView.findViewById(R.id.heroSkill6);
        heroSkill7 = (ImageView) mView.findViewById(R.id.heroSkill7);
        heroSkill8 = (ImageView) mView.findViewById(R.id.heroSkill8);
        heroSkill9 = (ImageView) mView.findViewById(R.id.heroSkill9);
        heroSkill10 = (ImageView) mView.findViewById(R.id.heroSkill10);
        heroSkill11 = (ImageView) mView.findViewById(R.id.heroSkill11);
        heroSkill12 = (ImageView) mView.findViewById(R.id.heroSkill12);
        heroSkill13 = (ImageView) mView.findViewById(R.id.heroSkill13);
        heroSkill14 = (ImageView) mView.findViewById(R.id.heroSkill14);

        heroIcon = (ImageView) mView.findViewById(R.id.heroIcon);
        heroName = (TextView) mView.findViewById(R.id.heroName);
        heroRole = (TextView) mView.findViewById(R.id.heroRole);

        talent1 = (TextView) mView.findViewById(R.id.talent1);
        talent2 = (TextView) mView.findViewById(R.id.talent2);
        talent3 = (TextView) mView.findViewById(R.id.talent3);
        talent4 = (TextView) mView.findViewById(R.id.talent4);
        talent5 = (TextView) mView.findViewById(R.id.talent5);
        talent6 = (TextView) mView.findViewById(R.id.talent6);
        talent7 = (TextView) mView.findViewById(R.id.talent7);
        talent8 = (TextView) mView.findViewById(R.id.talent8);


        skillName = (TextView) mView.findViewById(R.id.skillName);
        skillDescription = (TextView) mView.findViewById(R.id.skillDescription);
        skillText = (TextView) mView.findViewById(R.id.skillText);
        scepterSkillText = (TextView) mView.findViewById(R.id.scepterSkillText);
        aghanimShardAbility = (TextView) mView.findViewById(R.id.aghanims_shard_ability_text);

        skillCooldown = (TextView) mView.findViewById(R.id.coolDownText);
        skillManacost = (TextView) mView.findViewById(R.id.manaCostText);

        loadStrengthHeroSelection();
        loadAgilityHeroSelection();
        loadIntelligenceHeroSelection();
        onClickListeners();


        return mView;
    }


    public void loadStrengthHeroSelection() {

        //Is used to get the heroSelected value from the previous class
        String heroSelected = getActivity().getIntent().getExtras().getString("heroSelected");


        switch(heroSelected){

            //******************************************************************************
            //ALL OF THE SWITCH CASES FOR STRENGTH HEROES
            //******************************************************************************
            case "Abaddon":
                heroIcon.setImageResource(R.drawable.abaddon_medium);
                heroName.setText(R.string.abaddon);
                heroRole.setText(R.string.abaddon_role);

                talent1.setText(R.string.abaddon_talent1_text);
                talent2.setText(R.string.abaddon_talent2_text);
                talent3.setText(R.string.abaddon_talent3_text);
                talent4.setText(R.string.abaddon_talent4_text);
                talent5.setText(R.string.abaddon_talent5_text);
                talent6.setText(R.string.abaddon_talent6_text);
                talent7.setText(R.string.abaddon_talent7_text);
                talent8.setText(R.string.abaddon_talent8_text);


                heroSkill1.setImageResource(R.drawable.abaddon_skill_1);
                heroSkill2.setImageResource(R.drawable.abaddon_skill_2);
                heroSkill3.setImageResource(R.drawable.abaddon_skill_3);
                heroSkill4.setImageResource(R.drawable.abaddon_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.abaddon_skill1_name));
                strSkillName2 = (getResources().getString(R.string.abaddon_skill2_name));
                strSkillName3 = (getResources().getString(R.string.abaddon_skill3_name));
                strSkillName4 = (getResources().getString(R.string.abaddon_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.abaddon_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.abaddon_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.abaddon_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.abaddon_skill4_description));

                strSkillText1 = (getResources().getString(R.string.abaddon_skill1_text));
                strSkillText2 = (getResources().getString(R.string.abaddon_skill2_text));
                strSkillText3 = (getResources().getString(R.string.abaddon_skill3_text));
                strSkillText4 = (getResources().getString(R.string.abaddon_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.abaddon_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.abaddon_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.abaddon_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.abaddon_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.abaddon_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.abaddon_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.abaddon_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.abaddon_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.abaddon_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.abaddon_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.abaddon_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.abaddon_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.abaddon_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Alchemist":
                heroIcon.setImageResource(R.drawable.alchemist_medium);
                heroName.setText(R.string.alchemist);
                heroRole.setText(R.string.alchemist_role);

                talent1.setText(R.string.alchemist_talent1_text);
                talent2.setText(R.string.alchemist_talent2_text);
                talent3.setText(R.string.alchemist_talent3_text);
                talent4.setText(R.string.alchemist_talent4_text);
                talent5.setText(R.string.alchemist_talent5_text);
                talent6.setText(R.string.alchemist_talent6_text);
                talent7.setText(R.string.alchemist_talent7_text);
                talent8.setText(R.string.alchemist_talent8_text);


                heroSkill1.setImageResource(R.drawable.alchemist_skill_1);
                heroSkill2.setImageResource(R.drawable.alchemist_skill_2);
                heroSkill3.setImageResource(R.drawable.alchemist_skill_3);
                heroSkill4.setImageResource(R.drawable.alchemist_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.alchemist_skill1_name));
                strSkillName2 = (getResources().getString(R.string.alchemist_skill2_name));
                strSkillName3 = (getResources().getString(R.string.alchemist_skill3_name));
                strSkillName4 = (getResources().getString(R.string.alchemist_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.alchemist_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.alchemist_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.alchemist_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.alchemist_skill4_description));

                strSkillText1 = (getResources().getString(R.string.alchemist_skill1_text));
                strSkillText2 = (getResources().getString(R.string.alchemist_skill2_text));
                strSkillText3 = (getResources().getString(R.string.alchemist_skill3_text));
                strSkillText4 = (getResources().getString(R.string.alchemist_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.alchemist_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.alchemist_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.alchemist_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.alchemist_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.alchemist_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.alchemist_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.alchemist_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.alchemist_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.alchemist_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.alchemist_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.alchemist_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.alchemist_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.alchemist_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Axe":
                heroIcon.setImageResource(R.drawable.axe_medium);
                heroName.setText(R.string.axe);
                heroRole.setText(R.string.axe_role);

                talent1.setText(R.string.axe_talent1_text);
                talent2.setText(R.string.axe_talent2_text);
                talent3.setText(R.string.axe_talent3_text);
                talent4.setText(R.string.axe_talent4_text);
                talent5.setText(R.string.axe_talent5_text);
                talent6.setText(R.string.axe_talent6_text);
                talent7.setText(R.string.axe_talent7_text);
                talent8.setText(R.string.axe_talent8_text);


                heroSkill1.setImageResource(R.drawable.axe_skill_1);
                heroSkill2.setImageResource(R.drawable.axe_skill_2);
                heroSkill3.setImageResource(R.drawable.axe_skill_3);
                heroSkill4.setImageResource(R.drawable.axe_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.axe_skill1_name));
                strSkillName2 = (getResources().getString(R.string.axe_skill2_name));
                strSkillName3 = (getResources().getString(R.string.axe_skill3_name));
                strSkillName4 = (getResources().getString(R.string.axe_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.axe_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.axe_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.axe_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.axe_skill4_description));

                strSkillText1 = (getResources().getString(R.string.axe_skill1_text));
                strSkillText2 = (getResources().getString(R.string.axe_skill2_text));
                strSkillText3 = (getResources().getString(R.string.axe_skill3_text));
                strSkillText4 = (getResources().getString(R.string.axe_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.axe_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.axe_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.axe_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.axe_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.axe_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.axe_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.axe_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.axe_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.axe_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.axe_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.axe_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.axe_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.axe_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;



            case "Beastmaster":
                heroIcon.setImageResource(R.drawable.beastmaster_medium);
                heroName.setText(R.string.beastmaster);
                heroRole.setText(R.string.beastmaster_role);

                talent1.setText(R.string.beastmaster_talent1_text);
                talent2.setText(R.string.beastmaster_talent2_text);
                talent3.setText(R.string.beastmaster_talent3_text);
                talent4.setText(R.string.beastmaster_talent4_text);
                talent5.setText(R.string.beastmaster_talent5_text);
                talent6.setText(R.string.beastmaster_talent6_text);
                talent7.setText(R.string.beastmaster_talent7_text);
                talent8.setText(R.string.beastmaster_talent8_text);


                heroSkill1.setImageResource(R.drawable.beastmaster_skill_1);
                heroSkill2.setImageResource(R.drawable.beastmaster_skill_2);
                heroSkill3.setImageResource(R.drawable.beastmaster_skill_3);
                heroSkill4.setImageResource(R.drawable.beastmaster_skill_4);
                heroSkill5.setImageResource(R.drawable.beastmaster_skill_5);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.beastmaster_skill1_name));
                strSkillName2 = (getResources().getString(R.string.beastmaster_skill2_name));
                strSkillName3 = (getResources().getString(R.string.beastmaster_skill3_name));
                strSkillName4 = (getResources().getString(R.string.beastmaster_skill4_name));
                strSkillName5 = (getResources().getString(R.string.beastmaster_skill5_name));

                strSkillDescription1 = (getResources().getString(R.string.beastmaster_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.beastmaster_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.beastmaster_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.beastmaster_skill4_description));
                strSkillDescription4 = (getResources().getString(R.string.beastmaster_skill5_description));

                strSkillText1 = (getResources().getString(R.string.beastmaster_skill1_text));
                strSkillText2 = (getResources().getString(R.string.beastmaster_skill2_text));
                strSkillText3 = (getResources().getString(R.string.beastmaster_skill3_text));
                strSkillText4 = (getResources().getString(R.string.beastmaster_skill4_text));
                strSkillText5 = (getResources().getString(R.string.beastmaster_skill5_text));

                strScepterSkillText1 = (getResources().getString(R.string.beastmaster_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.beastmaster_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.beastmaster_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.beastmaster_scepter_skill4_text));
                strScepterSkillText5 = (getResources().getString(R.string.beastmaster_scepter_skill5_text));

                aghanimShardAbilityText = (getResources().getString(R.string.beastmaster_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.beastmaster_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.beastmaster_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.beastmaster_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.beastmaster_skill4_cooldown));
                strSkillCooldown5 = (getResources().getString(R.string.beastmaster_skill5_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.beastmaster_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.beastmaster_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.beastmaster_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.beastmaster_skill4_manacost));
                strSkillManacost5 = (getResources().getString(R.string.beastmaster_skill5_manacost));

                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;







            case "Brewmaster":
                heroIcon.setImageResource(R.drawable.brewmaster_medium);
                heroName.setText(R.string.brewmaster);
                heroRole.setText(R.string.brewmaster_role);

                talent1.setText(R.string.brewmaster_talent1_text);
                talent2.setText(R.string.brewmaster_talent2_text);
                talent3.setText(R.string.brewmaster_talent3_text);
                talent4.setText(R.string.brewmaster_talent4_text);
                talent5.setText(R.string.brewmaster_talent5_text);
                talent6.setText(R.string.brewmaster_talent6_text);
                talent7.setText(R.string.brewmaster_talent7_text);
                talent8.setText(R.string.brewmaster_talent8_text);


                heroSkill1.setImageResource(R.drawable.brewmaster_skill_1);
                heroSkill2.setImageResource(R.drawable.brewmaster_skill_2);
                heroSkill3.setImageResource(R.drawable.brewmaster_skill_3);
                heroSkill4.setImageResource(R.drawable.brewmaster_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.brewmaster_skill1_name));
                strSkillName2 = (getResources().getString(R.string.brewmaster_skill2_name));
                strSkillName3 = (getResources().getString(R.string.brewmaster_skill3_name));
                strSkillName4 = (getResources().getString(R.string.brewmaster_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.brewmaster_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.brewmaster_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.brewmaster_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.brewmaster_skill4_description));

                strSkillText1 = (getResources().getString(R.string.brewmaster_skill1_text));
                strSkillText2 = (getResources().getString(R.string.brewmaster_skill2_text));
                strSkillText3 = (getResources().getString(R.string.brewmaster_skill3_text));
                strSkillText4 = (getResources().getString(R.string.brewmaster_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.brewmaster_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.brewmaster_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.brewmaster_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.brewmaster_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.brewmaster_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.brewmaster_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.brewmaster_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.brewmaster_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.brewmaster_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.brewmaster_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.brewmaster_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.brewmaster_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.brewmaster_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Bristleback":
                heroIcon.setImageResource(R.drawable.bristleback_medium);
                heroName.setText(R.string.bristleback);
                heroRole.setText(R.string.bristleback_role);

                talent1.setText(R.string.bristleback_talent1_text);
                talent2.setText(R.string.bristleback_talent2_text);
                talent3.setText(R.string.bristleback_talent3_text);
                talent4.setText(R.string.bristleback_talent4_text);
                talent5.setText(R.string.bristleback_talent5_text);
                talent6.setText(R.string.bristleback_talent6_text);
                talent7.setText(R.string.bristleback_talent7_text);
                talent8.setText(R.string.bristleback_talent8_text);


                heroSkill1.setImageResource(R.drawable.bristleback_skill_1);
                heroSkill2.setImageResource(R.drawable.bristleback_skill_2);
                heroSkill3.setImageResource(R.drawable.bristleback_skill_3);
                heroSkill4.setImageResource(R.drawable.bristleback_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.bristleback_skill1_name));
                strSkillName2 = (getResources().getString(R.string.bristleback_skill2_name));
                strSkillName3 = (getResources().getString(R.string.bristleback_skill3_name));
                strSkillName4 = (getResources().getString(R.string.bristleback_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.bristleback_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.bristleback_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.bristleback_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.bristleback_skill4_description));

                strSkillText1 = (getResources().getString(R.string.bristleback_skill1_text));
                strSkillText2 = (getResources().getString(R.string.bristleback_skill2_text));
                strSkillText3 = (getResources().getString(R.string.bristleback_skill3_text));
                strSkillText4 = (getResources().getString(R.string.bristleback_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.bristleback_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.bristleback_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.bristleback_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.bristleback_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.bristleback_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.bristleback_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.bristleback_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.bristleback_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.bristleback_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.bristleback_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.bristleback_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.bristleback_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.bristleback_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;






            case "Centuar Warrunner":
                heroIcon.setImageResource(R.drawable.centaur_medium);
                heroName.setText(R.string.centuar);
                heroRole.setText(R.string.centuar_role);

                talent1.setText(R.string.centuar_talent1_text);
                talent2.setText(R.string.centuar_talent2_text);
                talent3.setText(R.string.centuar_talent3_text);
                talent4.setText(R.string.centuar_talent4_text);
                talent5.setText(R.string.centuar_talent5_text);
                talent6.setText(R.string.centuar_talent6_text);
                talent7.setText(R.string.centuar_talent7_text);
                talent8.setText(R.string.centuar_talent8_text);


                heroSkill1.setImageResource(R.drawable.centaur_skill_1);
                heroSkill2.setImageResource(R.drawable.centaur_skill_2);
                heroSkill3.setImageResource(R.drawable.centaur_skill_3);
                heroSkill4.setImageResource(R.drawable.centaur_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.centuar_skill1_name));
                strSkillName2 = (getResources().getString(R.string.centuar_skill2_name));
                strSkillName3 = (getResources().getString(R.string.centuar_skill3_name));
                strSkillName4 = (getResources().getString(R.string.centuar_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.centuar_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.centuar_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.centuar_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.centuar_skill4_description));

                strSkillText1 = (getResources().getString(R.string.centuar_skill1_text));
                strSkillText2 = (getResources().getString(R.string.centuar_skill2_text));
                strSkillText3 = (getResources().getString(R.string.centuar_skill3_text));
                strSkillText4 = (getResources().getString(R.string.centuar_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.centuar_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.centuar_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.centuar_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.centuar_scepter_skill4_text));

                strSkillCooldown1 = (getResources().getString(R.string.centuar_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.centuar_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.centuar_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.centuar_skill4_cooldown));

                aghanimShardAbilityText = (getResources().getString(R.string.centuar_aghanims_shard_ability_text));

                strSkillManacost1 = (getResources().getString(R.string.centuar_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.centuar_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.centuar_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.centuar_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Chaos Knight":
                heroIcon.setImageResource(R.drawable.chaos_knight_medium);
                heroName.setText(R.string.chaos_knight);
                heroRole.setText(R.string.chaos_knight_role);

                talent1.setText(R.string.chaos_knight_talent1_text);
                talent2.setText(R.string.chaos_knight_talent2_text);
                talent3.setText(R.string.chaos_knight_talent3_text);
                talent4.setText(R.string.chaos_knight_talent4_text);
                talent5.setText(R.string.chaos_knight_talent5_text);
                talent6.setText(R.string.chaos_knight_talent6_text);
                talent7.setText(R.string.chaos_knight_talent7_text);
                talent8.setText(R.string.chaos_knight_talent8_text);


                heroSkill1.setImageResource(R.drawable.chaos_knight_skill_1);
                heroSkill2.setImageResource(R.drawable.chaos_knight_skill_2);
                heroSkill3.setImageResource(R.drawable.chaos_knight_skill_3);
                heroSkill4.setImageResource(R.drawable.chaos_knight_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.chaos_knight_skill1_name));
                strSkillName2 = (getResources().getString(R.string.chaos_knight_skill2_name));
                strSkillName3 = (getResources().getString(R.string.chaos_knight_skill3_name));
                strSkillName4 = (getResources().getString(R.string.chaos_knight_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.chaos_knight_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.chaos_knight_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.chaos_knight_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.chaos_knight_skill4_description));

                strSkillText1 = (getResources().getString(R.string.chaos_knight_skill1_text));
                strSkillText2 = (getResources().getString(R.string.chaos_knight_skill2_text));
                strSkillText3 = (getResources().getString(R.string.chaos_knight_skill3_text));
                strSkillText4 = (getResources().getString(R.string.chaos_knight_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.chaos_knight_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.chaos_knight_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.chaos_knight_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.chaos_knight_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.chaos_knight_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.chaos_knight_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.chaos_knight_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.chaos_knight_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.chaos_knight_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.chaos_knight_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.chaos_knight_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.chaos_knight_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.chaos_knight_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;




            case "Clockwerk":
                heroIcon.setImageResource(R.drawable.clockwerk_medium);
                heroName.setText(R.string.clockwerk);
                heroRole.setText(R.string.clockwerk_role);

                talent1.setText(R.string.clockwerk_talent1_text);
                talent2.setText(R.string.clockwerk_talent2_text);
                talent3.setText(R.string.clockwerk_talent3_text);
                talent4.setText(R.string.clockwerk_talent4_text);
                talent5.setText(R.string.clockwerk_talent5_text);
                talent6.setText(R.string.clockwerk_talent6_text);
                talent7.setText(R.string.clockwerk_talent7_text);
                talent8.setText(R.string.clockwerk_talent8_text);


                heroSkill1.setImageResource(R.drawable.clockwerk_skill_1);
                heroSkill2.setImageResource(R.drawable.clockwerk_skill_2);
                heroSkill3.setImageResource(R.drawable.clockwerk_skill_3);
                heroSkill4.setImageResource(R.drawable.clockwerk_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.clockwerk_skill1_name));
                strSkillName2 = (getResources().getString(R.string.clockwerk_skill2_name));
                strSkillName3 = (getResources().getString(R.string.clockwerk_skill3_name));
                strSkillName4 = (getResources().getString(R.string.clockwerk_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.clockwerk_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.clockwerk_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.clockwerk_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.clockwerk_skill4_description));

                strSkillText1 = (getResources().getString(R.string.clockwerk_skill1_text));
                strSkillText2 = (getResources().getString(R.string.clockwerk_skill2_text));
                strSkillText3 = (getResources().getString(R.string.clockwerk_skill3_text));
                strSkillText4 = (getResources().getString(R.string.clockwerk_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.clockwerk_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.clockwerk_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.clockwerk_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.clockwerk_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.clockwerk_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.clockwerk_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.clockwerk_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.clockwerk_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.clockwerk_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.clockwerk_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.clockwerk_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.clockwerk_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.clockwerk_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;

            case "Dawnbreaker":
                heroIcon.setImageResource(R.drawable.dawnbreaker_medium);
                heroName.setText(R.string.dawnbreaker);
                heroRole.setText(R.string.dawnbreaker_role);

                talent1.setText(R.string.dawnbreaker_talent1_text);
                talent2.setText(R.string.dawnbreaker_talent2_text);
                talent3.setText(R.string.dawnbreaker_talent3_text);
                talent4.setText(R.string.dawnbreaker_talent4_text);
                talent5.setText(R.string.dawnbreaker_talent5_text);
                talent6.setText(R.string.dawnbreaker_talent6_text);
                talent7.setText(R.string.dawnbreaker_talent7_text);
                talent8.setText(R.string.dawnbreaker_talent8_text);


                heroSkill1.setImageResource(R.drawable.dawnbreaker_skill_1);
                heroSkill2.setImageResource(R.drawable.dawnbreaker_skill_2);
                heroSkill3.setImageResource(R.drawable.dawnbreaker_skill_3);
                heroSkill4.setImageResource(R.drawable.dawnbreaker_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.dawnbreaker_skill1_name));
                strSkillName2 = (getResources().getString(R.string.dawnbreaker_skill2_name));
                strSkillName3 = (getResources().getString(R.string.dawnbreaker_skill3_name));
                strSkillName4 = (getResources().getString(R.string.dawnbreaker_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.dawnbreaker_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.dawnbreaker_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.dawnbreaker_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.dawnbreaker_skill4_description));

                strSkillText1 = (getResources().getString(R.string.dawnbreaker_skill1_text));
                strSkillText2 = (getResources().getString(R.string.dawnbreaker_skill2_text));
                strSkillText3 = (getResources().getString(R.string.dawnbreaker_skill3_text));
                strSkillText4 = (getResources().getString(R.string.dawnbreaker_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.dawnbreaker_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.dawnbreaker_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.dawnbreaker_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.dawnbreaker_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.dawnbreaker_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.dawnbreaker_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.dawnbreaker_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.dawnbreaker_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.dawnbreaker_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.dawnbreaker_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.dawnbreaker_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.dawnbreaker_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.dawnbreaker_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;

            case "Doom":
                heroIcon.setImageResource(R.drawable.doom_medium);
                heroName.setText(R.string.doom);
                heroRole.setText(R.string.doom_role);

                talent1.setText(R.string.doom_talent1_text);
                talent2.setText(R.string.doom_talent2_text);
                talent3.setText(R.string.doom_talent3_text);
                talent4.setText(R.string.doom_talent4_text);
                talent5.setText(R.string.doom_talent5_text);
                talent6.setText(R.string.doom_talent6_text);
                talent7.setText(R.string.doom_talent7_text);
                talent8.setText(R.string.doom_talent8_text);


                heroSkill1.setImageResource(R.drawable.doom_skill_1);
                heroSkill2.setImageResource(R.drawable.doom_skill_2);
                heroSkill3.setImageResource(R.drawable.doom_skill_3);
                heroSkill4.setImageResource(R.drawable.doom_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.doom_skill1_name));
                strSkillName2 = (getResources().getString(R.string.doom_skill2_name));
                strSkillName3 = (getResources().getString(R.string.doom_skill3_name));
                strSkillName4 = (getResources().getString(R.string.doom_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.doom_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.doom_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.doom_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.doom_skill4_description));

                strSkillText1 = (getResources().getString(R.string.doom_skill1_text));
                strSkillText2 = (getResources().getString(R.string.doom_skill2_text));
                strSkillText3 = (getResources().getString(R.string.doom_skill3_text));
                strSkillText4 = (getResources().getString(R.string.doom_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.doom_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.doom_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.doom_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.doom_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.doom_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.doom_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.doom_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.doom_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.doom_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.doom_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.doom_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.doom_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.doom_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Dragon Knight":
                heroIcon.setImageResource(R.drawable.dragon_knight_medium);
                heroName.setText(R.string.dragon_knight);
                heroRole.setText(R.string.dragon_knight_role);

                talent1.setText(R.string.dragon_knight_talent1_text);
                talent2.setText(R.string.dragon_knight_talent2_text);
                talent3.setText(R.string.dragon_knight_talent3_text);
                talent4.setText(R.string.dragon_knight_talent4_text);
                talent5.setText(R.string.dragon_knight_talent5_text);
                talent6.setText(R.string.dragon_knight_talent6_text);
                talent7.setText(R.string.dragon_knight_talent7_text);
                talent8.setText(R.string.dragon_knight_talent8_text);


                heroSkill1.setImageResource(R.drawable.dragon_knight_skill_1);
                heroSkill2.setImageResource(R.drawable.dragon_knight_skill_2);
                heroSkill3.setImageResource(R.drawable.dragon_knight_skill_3);
                heroSkill4.setImageResource(R.drawable.dragon_knight_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.dragon_knight_skill1_name));
                strSkillName2 = (getResources().getString(R.string.dragon_knight_skill2_name));
                strSkillName3 = (getResources().getString(R.string.dragon_knight_skill3_name));
                strSkillName4 = (getResources().getString(R.string.dragon_knight_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.dragon_knight_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.dragon_knight_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.dragon_knight_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.dragon_knight_skill4_description));

                strSkillText1 = (getResources().getString(R.string.dragon_knight_skill1_text));
                strSkillText2 = (getResources().getString(R.string.dragon_knight_skill2_text));
                strSkillText3 = (getResources().getString(R.string.dragon_knight_skill3_text));
                strSkillText4 = (getResources().getString(R.string.dragon_knight_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.dragon_knight_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.dragon_knight_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.dragon_knight_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.dragon_knight_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.dragon_knight_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.dragon_knight_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.dragon_knight_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.dragon_knight_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.dragon_knight_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.dragon_knight_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.dragon_knight_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.dragon_knight_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.dragon_knight_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;



            case "Earth Spirit":
                heroIcon.setImageResource(R.drawable.earth_spirit_medium);
                heroName.setText(R.string.earth_spirit);
                heroRole.setText(R.string.earth_spirit_role);

                talent1.setText(R.string.earth_spirit_talent1_text);
                talent2.setText(R.string.earth_spirit_talent2_text);
                talent3.setText(R.string.earth_spirit_talent3_text);
                talent4.setText(R.string.earth_spirit_talent4_text);
                talent5.setText(R.string.earth_spirit_talent5_text);
                talent6.setText(R.string.earth_spirit_talent6_text);
                talent7.setText(R.string.earth_spirit_talent7_text);
                talent8.setText(R.string.earth_spirit_talent8_text);


                heroSkill1.setImageResource(R.drawable.earth_spirit_skill_1);
                heroSkill2.setImageResource(R.drawable.earth_spirit_skill_2);
                heroSkill3.setImageResource(R.drawable.earth_spirit_skill_3);
                heroSkill4.setImageResource(R.drawable.earth_spirit_skill_4);
                heroSkill5.setImageResource(R.drawable.earth_spirit_skill_5);
                heroSkill6.setImageResource(R.drawable.earth_spirit_skill_6);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.earth_spirit_skill1_name));
                strSkillName2 = (getResources().getString(R.string.earth_spirit_skill2_name));
                strSkillName3 = (getResources().getString(R.string.earth_spirit_skill3_name));
                strSkillName4 = (getResources().getString(R.string.earth_spirit_skill4_name));
                strSkillName5 = (getResources().getString(R.string.earth_spirit_skill5_name));
                strSkillName6 = (getResources().getString(R.string.earth_spirit_skill6_name));


                strSkillDescription1 = (getResources().getString(R.string.earth_spirit_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.earth_spirit_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.earth_spirit_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.earth_spirit_skill4_description));
                strSkillDescription5 = (getResources().getString(R.string.earth_spirit_skill5_description));
                strSkillDescription6 = (getResources().getString(R.string.earth_spirit_skill6_description));


                strSkillText1 = (getResources().getString(R.string.earth_spirit_skill1_text));
                strSkillText2 = (getResources().getString(R.string.earth_spirit_skill2_text));
                strSkillText3 = (getResources().getString(R.string.earth_spirit_skill3_text));
                strSkillText4 = (getResources().getString(R.string.earth_spirit_skill4_text));
                strSkillText5 = (getResources().getString(R.string.earth_spirit_skill5_text));
                strSkillText6 = (getResources().getString(R.string.earth_spirit_skill6_text));

                strScepterSkillText1 = (getResources().getString(R.string.earth_spirit_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.earth_spirit_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.earth_spirit_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.earth_spirit_scepter_skill4_text));
                strScepterSkillText5 = (getResources().getString(R.string.earth_spirit_scepter_skill5_text));
                strScepterSkillText6 = (getResources().getString(R.string.earth_spirit_scepter_skill6_text));

                aghanimShardAbilityText = (getResources().getString(R.string.earth_spirit_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.earth_spirit_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.earth_spirit_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.earth_spirit_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.earth_spirit_skill4_cooldown));
                strSkillCooldown5 = (getResources().getString(R.string.earth_spirit_skill5_cooldown));
                strSkillCooldown6 = (getResources().getString(R.string.earth_spirit_skill6_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.earth_spirit_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.earth_spirit_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.earth_spirit_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.earth_spirit_skill4_manacost));
                strSkillManacost5 = (getResources().getString(R.string.earth_spirit_skill5_manacost));
                strSkillManacost6 = (getResources().getString(R.string.earth_spirit_skill6_manacost));



                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Earthshaker":
                heroIcon.setImageResource(R.drawable.earthshaker_medium);
                heroName.setText(R.string.earthshaker);
                heroRole.setText(R.string.earthshaker_role);

                talent1.setText(R.string.earthshaker_talent1_text);
                talent2.setText(R.string.earthshaker_talent2_text);
                talent3.setText(R.string.earthshaker_talent3_text);
                talent4.setText(R.string.earthshaker_talent4_text);
                talent5.setText(R.string.earthshaker_talent5_text);
                talent6.setText(R.string.earthshaker_talent6_text);
                talent7.setText(R.string.earthshaker_talent7_text);
                talent8.setText(R.string.earthshaker_talent8_text);


                heroSkill1.setImageResource(R.drawable.earthshaker_skill_1);
                heroSkill2.setImageResource(R.drawable.earthshaker_skill_2);
                heroSkill3.setImageResource(R.drawable.earthshaker_skill_3);
                heroSkill4.setImageResource(R.drawable.earthshaker_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.earthshaker_skill1_name));
                strSkillName2 = (getResources().getString(R.string.earthshaker_skill2_name));
                strSkillName3 = (getResources().getString(R.string.earthshaker_skill3_name));
                strSkillName4 = (getResources().getString(R.string.earthshaker_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.earthshaker_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.earthshaker_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.earthshaker_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.earthshaker_skill4_description));

                strSkillText1 = (getResources().getString(R.string.earthshaker_skill1_text));
                strSkillText2 = (getResources().getString(R.string.earthshaker_skill2_text));
                strSkillText3 = (getResources().getString(R.string.earthshaker_skill3_text));
                strSkillText4 = (getResources().getString(R.string.earthshaker_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.earthshaker_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.earthshaker_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.earthshaker_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.earthshaker_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.earthshaker_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.earthshaker_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.earthshaker_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.earthshaker_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.earthshaker_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.earthshaker_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.earthshaker_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.earthshaker_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.earthshaker_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;



            case "Elder Titan":
                heroIcon.setImageResource(R.drawable.elder_titan_medium);
                heroName.setText(R.string.elder_titan);
                heroRole.setText(R.string.elder_titan_role);

                talent1.setText(R.string.elder_titan_talent1_text);
                talent2.setText(R.string.elder_titan_talent2_text);
                talent3.setText(R.string.elder_titan_talent3_text);
                talent4.setText(R.string.elder_titan_talent4_text);
                talent5.setText(R.string.elder_titan_talent5_text);
                talent6.setText(R.string.elder_titan_talent6_text);
                talent7.setText(R.string.elder_titan_talent7_text);
                talent8.setText(R.string.elder_titan_talent8_text);


                heroSkill1.setImageResource(R.drawable.elder_titan_skill_1);
                heroSkill2.setImageResource(R.drawable.elder_titan_skill_2);
                heroSkill3.setImageResource(R.drawable.elder_titan_skill_3);
                heroSkill4.setImageResource(R.drawable.elder_titan_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.elder_titan_skill1_name));
                strSkillName2 = (getResources().getString(R.string.elder_titan_skill2_name));
                strSkillName3 = (getResources().getString(R.string.elder_titan_skill3_name));
                strSkillName4 = (getResources().getString(R.string.elder_titan_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.elder_titan_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.elder_titan_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.elder_titan_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.elder_titan_skill4_description));

                strSkillText1 = (getResources().getString(R.string.elder_titan_skill1_text));
                strSkillText2 = (getResources().getString(R.string.elder_titan_skill2_text));
                strSkillText3 = (getResources().getString(R.string.elder_titan_skill3_text));
                strSkillText4 = (getResources().getString(R.string.elder_titan_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.elder_titan_aghanims_shard_ability_text));

                strScepterSkillText1 = (getResources().getString(R.string.elder_titan_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.elder_titan_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.elder_titan_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.elder_titan_scepter_skill4_text));

                strSkillCooldown1 = (getResources().getString(R.string.elder_titan_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.elder_titan_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.elder_titan_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.elder_titan_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.elder_titan_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.elder_titan_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.elder_titan_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.elder_titan_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;



            case "Huskar":
                heroIcon.setImageResource(R.drawable.huskar_medium);
                heroName.setText(R.string.huskar);
                heroRole.setText(R.string.huskar_role);

                talent1.setText(R.string.huskar_talent1_text);
                talent2.setText(R.string.huskar_talent2_text);
                talent3.setText(R.string.huskar_talent3_text);
                talent4.setText(R.string.huskar_talent4_text);
                talent5.setText(R.string.huskar_talent5_text);
                talent6.setText(R.string.huskar_talent6_text);
                talent7.setText(R.string.huskar_talent7_text);
                talent8.setText(R.string.huskar_talent8_text);


                heroSkill1.setImageResource(R.drawable.huskar_skill_1);
                heroSkill2.setImageResource(R.drawable.huskar_skill_2);
                heroSkill3.setImageResource(R.drawable.huskar_skill_3);
                heroSkill4.setImageResource(R.drawable.huskar_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.huskar_skill1_name));
                strSkillName2 = (getResources().getString(R.string.huskar_skill2_name));
                strSkillName3 = (getResources().getString(R.string.huskar_skill3_name));
                strSkillName4 = (getResources().getString(R.string.huskar_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.huskar_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.huskar_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.huskar_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.huskar_skill4_description));

                strSkillText1 = (getResources().getString(R.string.huskar_skill1_text));
                strSkillText2 = (getResources().getString(R.string.huskar_skill2_text));
                strSkillText3 = (getResources().getString(R.string.huskar_skill3_text));
                strSkillText4 = (getResources().getString(R.string.huskar_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.huskar_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.huskar_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.huskar_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.huskar_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.huskar_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.huskar_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.huskar_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.huskar_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.huskar_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.huskar_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.huskar_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.huskar_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.huskar_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Kunkka":
                heroIcon.setImageResource(R.drawable.kunkka_medium);
                heroName.setText(R.string.kunkka);
                heroRole.setText(R.string.kunkka_role);

                talent1.setText(R.string.kunkka_talent1_text);
                talent2.setText(R.string.kunkka_talent2_text);
                talent3.setText(R.string.kunkka_talent3_text);
                talent4.setText(R.string.kunkka_talent4_text);
                talent5.setText(R.string.kunkka_talent5_text);
                talent6.setText(R.string.kunkka_talent6_text);
                talent7.setText(R.string.kunkka_talent7_text);
                talent8.setText(R.string.kunkka_talent8_text);


                heroSkill1.setImageResource(R.drawable.kunkka_skill_1);
                heroSkill2.setImageResource(R.drawable.kunkka_skill_2);
                heroSkill3.setImageResource(R.drawable.kunkka_skill_3);
                heroSkill4.setImageResource(R.drawable.kunkka_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.kunkka_skill1_name));
                strSkillName2 = (getResources().getString(R.string.kunkka_skill2_name));
                strSkillName3 = (getResources().getString(R.string.kunkka_skill3_name));
                strSkillName4 = (getResources().getString(R.string.kunkka_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.kunkka_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.kunkka_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.kunkka_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.kunkka_skill4_description));

                strSkillText1 = (getResources().getString(R.string.kunkka_skill1_text));
                strSkillText2 = (getResources().getString(R.string.kunkka_skill2_text));
                strSkillText3 = (getResources().getString(R.string.kunkka_skill3_text));
                strSkillText4 = (getResources().getString(R.string.kunkka_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.kunkka_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.kunkka_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.kunkka_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.kunkka_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.kunkka_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.kunkka_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.kunkka_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.kunkka_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.kunkka_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.kunkka_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.kunkka_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.kunkka_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.kunkka_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Legion Commander":
                heroIcon.setImageResource(R.drawable.legion_commander_medium);
                heroName.setText(R.string.legion_commander);
                heroRole.setText(R.string.legion_commander_role);

                talent1.setText(R.string.legion_commander_talent1_text);
                talent2.setText(R.string.legion_commander_talent2_text);
                talent3.setText(R.string.legion_commander_talent3_text);
                talent4.setText(R.string.legion_commander_talent4_text);
                talent5.setText(R.string.legion_commander_talent5_text);
                talent6.setText(R.string.legion_commander_talent6_text);
                talent7.setText(R.string.legion_commander_talent7_text);
                talent8.setText(R.string.legion_commander_talent8_text);


                heroSkill1.setImageResource(R.drawable.legion_commander_skill_1);
                heroSkill2.setImageResource(R.drawable.legion_commander_skill_2);
                heroSkill3.setImageResource(R.drawable.legion_commander_skill_3);
                heroSkill4.setImageResource(R.drawable.legion_commander_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.legion_commander_skill1_name));
                strSkillName2 = (getResources().getString(R.string.legion_commander_skill2_name));
                strSkillName3 = (getResources().getString(R.string.legion_commander_skill3_name));
                strSkillName4 = (getResources().getString(R.string.legion_commander_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.legion_commander_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.legion_commander_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.legion_commander_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.legion_commander_skill4_description));

                strSkillText1 = (getResources().getString(R.string.legion_commander_skill1_text));
                strSkillText2 = (getResources().getString(R.string.legion_commander_skill2_text));
                strSkillText3 = (getResources().getString(R.string.legion_commander_skill3_text));
                strSkillText4 = (getResources().getString(R.string.legion_commander_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.legion_commander_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.legion_commander_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.legion_commander_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.legion_commander_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.legion_commander_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.legion_commander_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.legion_commander_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.legion_commander_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.legion_commander_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.legion_commander_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.legion_commander_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.legion_commander_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.legion_commander_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;




            case "Lifestealer":
                heroIcon.setImageResource(R.drawable.lifestealer_medium);
                heroName.setText(R.string.lifestealer);
                heroRole.setText(R.string.lifestealer_role);

                talent1.setText(R.string.lifestealer_talent1_text);
                talent2.setText(R.string.lifestealer_talent2_text);
                talent3.setText(R.string.lifestealer_talent3_text);
                talent4.setText(R.string.lifestealer_talent4_text);
                talent5.setText(R.string.lifestealer_talent5_text);
                talent6.setText(R.string.lifestealer_talent6_text);
                talent7.setText(R.string.lifestealer_talent7_text);
                talent8.setText(R.string.lifestealer_talent8_text);


                heroSkill1.setImageResource(R.drawable.lifestealer_skill_1);
                heroSkill2.setImageResource(R.drawable.lifestealer_skill_2);
                heroSkill3.setImageResource(R.drawable.lifestealer_skill_3);
                heroSkill4.setImageResource(R.drawable.lifestealer_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.lifestealer_skill1_name));
                strSkillName2 = (getResources().getString(R.string.lifestealer_skill2_name));
                strSkillName3 = (getResources().getString(R.string.lifestealer_skill3_name));
                strSkillName4 = (getResources().getString(R.string.lifestealer_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.lifestealer_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.lifestealer_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.lifestealer_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.lifestealer_skill4_description));

                strSkillText1 = (getResources().getString(R.string.lifestealer_skill1_text));
                strSkillText2 = (getResources().getString(R.string.lifestealer_skill2_text));
                strSkillText3 = (getResources().getString(R.string.lifestealer_skill3_text));
                strSkillText4 = (getResources().getString(R.string.lifestealer_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.lifestealer_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.lifestealer_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.lifestealer_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.lifestealer_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.lifestealer_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.lifestealer_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.lifestealer_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.lifestealer_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.lifestealer_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.lifestealer_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.lifestealer_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.lifestealer_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.lifestealer_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Lycan":
                heroIcon.setImageResource(R.drawable.lycan_medium);
                heroName.setText(R.string.lycan);
                heroRole.setText(R.string.lycan_role);

                talent1.setText(R.string.lycan_talent1_text);
                talent2.setText(R.string.lycan_talent2_text);
                talent3.setText(R.string.lycan_talent3_text);
                talent4.setText(R.string.lycan_talent4_text);
                talent5.setText(R.string.lycan_talent5_text);
                talent6.setText(R.string.lycan_talent6_text);
                talent7.setText(R.string.lycan_talent7_text);
                talent8.setText(R.string.lycan_talent8_text);


                heroSkill1.setImageResource(R.drawable.lycan_skill_1);
                heroSkill2.setImageResource(R.drawable.lycan_skill_2);
                heroSkill3.setImageResource(R.drawable.lycan_skill_3);
                heroSkill4.setImageResource(R.drawable.lycan_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.lycan_skill1_name));
                strSkillName2 = (getResources().getString(R.string.lycan_skill2_name));
                strSkillName3 = (getResources().getString(R.string.lycan_skill3_name));
                strSkillName4 = (getResources().getString(R.string.lycan_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.lycan_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.lycan_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.lycan_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.lycan_skill4_description));

                strSkillText1 = (getResources().getString(R.string.lycan_skill1_text));
                strSkillText2 = (getResources().getString(R.string.lycan_skill2_text));
                strSkillText3 = (getResources().getString(R.string.lycan_skill3_text));
                strSkillText4 = (getResources().getString(R.string.lycan_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.lycan_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.lycan_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.lycan_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.lycan_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.lycan_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.lycan_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.lycan_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.lycan_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.lycan_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.lycan_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.lycan_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.lycan_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.lycan_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;



            case "Magnus":
                heroIcon.setImageResource(R.drawable.magnus_medium);
                heroName.setText(R.string.magnus);
                heroRole.setText(R.string.magnus_role);

                talent1.setText(R.string.magnus_talent1_text);
                talent2.setText(R.string.magnus_talent2_text);
                talent3.setText(R.string.magnus_talent3_text);
                talent4.setText(R.string.magnus_talent4_text);
                talent5.setText(R.string.magnus_talent5_text);
                talent6.setText(R.string.magnus_talent6_text);
                talent7.setText(R.string.magnus_talent7_text);
                talent8.setText(R.string.magnus_talent8_text);


                heroSkill1.setImageResource(R.drawable.magnus_skill_1);
                heroSkill2.setImageResource(R.drawable.magnus_skill_2);
                heroSkill3.setImageResource(R.drawable.magnus_skill_3);
                heroSkill4.setImageResource(R.drawable.magnus_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.magnus_skill1_name));
                strSkillName2 = (getResources().getString(R.string.magnus_skill2_name));
                strSkillName3 = (getResources().getString(R.string.magnus_skill3_name));
                strSkillName4 = (getResources().getString(R.string.magnus_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.magnus_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.magnus_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.magnus_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.magnus_skill4_description));

                strSkillText1 = (getResources().getString(R.string.magnus_skill1_text));
                strSkillText2 = (getResources().getString(R.string.magnus_skill2_text));
                strSkillText3 = (getResources().getString(R.string.magnus_skill3_text));
                strSkillText4 = (getResources().getString(R.string.magnus_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.magnus_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.magnus_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.magnus_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.magnus_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.magnus_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.magnus_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.magnus_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.magnus_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.magnus_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.magnus_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.magnus_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.magnus_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.magnus_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Mars":
                heroIcon.setImageResource(R.drawable.mars_medium);
                heroName.setText(R.string.mars);
                heroRole.setText(R.string.mars_role);

                talent1.setText(R.string.mars_talent1_text);
                talent2.setText(R.string.mars_talent2_text);
                talent3.setText(R.string.mars_talent3_text);
                talent4.setText(R.string.mars_talent4_text);
                talent5.setText(R.string.mars_talent5_text);
                talent6.setText(R.string.mars_talent6_text);
                talent7.setText(R.string.mars_talent7_text);
                talent8.setText(R.string.mars_talent8_text);


                heroSkill1.setImageResource(R.drawable.mars_skill_1);
                heroSkill2.setImageResource(R.drawable.mars_skill_2);
                heroSkill3.setImageResource(R.drawable.mars_skill_3);
                heroSkill4.setImageResource(R.drawable.mars_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.mars_skill1_name));
                strSkillName2 = (getResources().getString(R.string.mars_skill2_name));
                strSkillName3 = (getResources().getString(R.string.mars_skill3_name));
                strSkillName4 = (getResources().getString(R.string.mars_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.mars_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.mars_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.mars_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.mars_skill4_description));

                strSkillText1 = (getResources().getString(R.string.mars_skill1_text));
                strSkillText2 = (getResources().getString(R.string.mars_skill2_text));
                strSkillText3 = (getResources().getString(R.string.mars_skill3_text));
                strSkillText4 = (getResources().getString(R.string.mars_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.mars_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.mars_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.mars_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.mars_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.mars_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.mars_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.mars_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.mars_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.mars_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.mars_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.mars_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.mars_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.mars_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;



            case "Night Stalker":
                heroIcon.setImageResource(R.drawable.night_stalker_medium);
                heroName.setText(R.string.night_stalker);
                heroRole.setText(R.string.night_stalker_role);

                talent1.setText(R.string.night_stalker_talent1_text);
                talent2.setText(R.string.night_stalker_talent2_text);
                talent3.setText(R.string.night_stalker_talent3_text);
                talent4.setText(R.string.night_stalker_talent4_text);
                talent5.setText(R.string.night_stalker_talent5_text);
                talent6.setText(R.string.night_stalker_talent6_text);
                talent7.setText(R.string.night_stalker_talent7_text);
                talent8.setText(R.string.night_stalker_talent8_text);


                heroSkill1.setImageResource(R.drawable.night_stalker_skill_1);
                heroSkill2.setImageResource(R.drawable.night_stalker_skill_2);
                heroSkill3.setImageResource(R.drawable.night_stalker_skill_3);
                heroSkill4.setImageResource(R.drawable.night_stalker_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.night_stalker_skill1_name));
                strSkillName2 = (getResources().getString(R.string.night_stalker_skill2_name));
                strSkillName3 = (getResources().getString(R.string.night_stalker_skill3_name));
                strSkillName4 = (getResources().getString(R.string.night_stalker_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.night_stalker_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.night_stalker_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.night_stalker_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.night_stalker_skill4_description));

                strSkillText1 = (getResources().getString(R.string.night_stalker_skill1_text));
                strSkillText2 = (getResources().getString(R.string.night_stalker_skill2_text));
                strSkillText3 = (getResources().getString(R.string.night_stalker_skill3_text));
                strSkillText4 = (getResources().getString(R.string.night_stalker_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.night_stalker_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.night_stalker_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.night_stalker_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.night_stalker_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.night_stalker_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.night_stalker_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.night_stalker_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.night_stalker_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.night_stalker_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.night_stalker_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.night_stalker_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.night_stalker_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.night_stalker_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Omniknight":
                heroIcon.setImageResource(R.drawable.omniknight_medium);
                heroName.setText(R.string.omniknight);
                heroRole.setText(R.string.omniknight_role);

                talent1.setText(R.string.omniknight_talent1_text);
                talent2.setText(R.string.omniknight_talent2_text);
                talent3.setText(R.string.omniknight_talent3_text);
                talent4.setText(R.string.omniknight_talent4_text);
                talent5.setText(R.string.omniknight_talent5_text);
                talent6.setText(R.string.omniknight_talent6_text);
                talent7.setText(R.string.omniknight_talent7_text);
                talent8.setText(R.string.omniknight_talent8_text);


                heroSkill1.setImageResource(R.drawable.omniknight_skill_1);
                heroSkill2.setImageResource(R.drawable.omniknight_skill_2);
                heroSkill3.setImageResource(R.drawable.omniknight_skill_3);
                heroSkill4.setImageResource(R.drawable.omniknight_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.omniknight_skill1_name));
                strSkillName2 = (getResources().getString(R.string.omniknight_skill2_name));
                strSkillName3 = (getResources().getString(R.string.omniknight_skill3_name));
                strSkillName4 = (getResources().getString(R.string.omniknight_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.omniknight_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.omniknight_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.omniknight_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.omniknight_skill4_description));

                strSkillText1 = (getResources().getString(R.string.omniknight_skill1_text));
                strSkillText2 = (getResources().getString(R.string.omniknight_skill2_text));
                strSkillText3 = (getResources().getString(R.string.omniknight_skill3_text));
                strSkillText4 = (getResources().getString(R.string.omniknight_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.omniknight_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.omniknight_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.omniknight_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.omniknight_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.omniknight_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.omniknight_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.omniknight_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.omniknight_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.omniknight_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.omniknight_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.omniknight_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.omniknight_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.omniknight_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Phoenix":
                heroIcon.setImageResource(R.drawable.phoenix_medium);
                heroName.setText(R.string.phoenix);
                heroRole.setText(R.string.phoenix_role);

                talent1.setText(R.string.phoenix_talent1_text);
                talent2.setText(R.string.phoenix_talent2_text);
                talent3.setText(R.string.phoenix_talent3_text);
                talent4.setText(R.string.phoenix_talent4_text);
                talent5.setText(R.string.phoenix_talent5_text);
                talent6.setText(R.string.phoenix_talent6_text);
                talent7.setText(R.string.phoenix_talent7_text);
                talent8.setText(R.string.phoenix_talent8_text);


                heroSkill1.setImageResource(R.drawable.phoenix_skill_1);
                heroSkill2.setImageResource(R.drawable.phoenix_skill_2);
                heroSkill3.setImageResource(R.drawable.phoenix_skill_3);
                heroSkill4.setImageResource(R.drawable.phoenix_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.phoenix_skill1_name));
                strSkillName2 = (getResources().getString(R.string.phoenix_skill2_name));
                strSkillName3 = (getResources().getString(R.string.phoenix_skill3_name));
                strSkillName4 = (getResources().getString(R.string.phoenix_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.phoenix_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.phoenix_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.phoenix_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.phoenix_skill4_description));

                strSkillText1 = (getResources().getString(R.string.phoenix_skill1_text));
                strSkillText2 = (getResources().getString(R.string.phoenix_skill2_text));
                strSkillText3 = (getResources().getString(R.string.phoenix_skill3_text));
                strSkillText4 = (getResources().getString(R.string.phoenix_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.phoenix_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.phoenix_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.phoenix_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.phoenix_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.phoenix_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.phoenix_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.phoenix_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.phoenix_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.phoenix_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.phoenix_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.phoenix_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.phoenix_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.phoenix_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Pudge":
                heroIcon.setImageResource(R.drawable.pudge_medium);
                heroName.setText(R.string.pudge);
                heroRole.setText(R.string.pudge_role);

                talent1.setText(R.string.pudge_talent1_text);
                talent2.setText(R.string.pudge_talent2_text);
                talent3.setText(R.string.pudge_talent3_text);
                talent4.setText(R.string.pudge_talent4_text);
                talent5.setText(R.string.pudge_talent5_text);
                talent6.setText(R.string.pudge_talent6_text);
                talent7.setText(R.string.pudge_talent7_text);
                talent8.setText(R.string.pudge_talent8_text);


                heroSkill1.setImageResource(R.drawable.pudge_skill_1);
                heroSkill2.setImageResource(R.drawable.pudge_skill_2);
                heroSkill3.setImageResource(R.drawable.pudge_skill_3);
                heroSkill4.setImageResource(R.drawable.pudge_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.pudge_skill1_name));
                strSkillName2 = (getResources().getString(R.string.pudge_skill2_name));
                strSkillName3 = (getResources().getString(R.string.pudge_skill3_name));
                strSkillName4 = (getResources().getString(R.string.pudge_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.pudge_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.pudge_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.pudge_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.pudge_skill4_description));

                strSkillText1 = (getResources().getString(R.string.pudge_skill1_text));
                strSkillText2 = (getResources().getString(R.string.pudge_skill2_text));
                strSkillText3 = (getResources().getString(R.string.pudge_skill3_text));
                strSkillText4 = (getResources().getString(R.string.pudge_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.pudge_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.pudge_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.pudge_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.pudge_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.pudge_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.pudge_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.pudge_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.pudge_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.pudge_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.pudge_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.pudge_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.pudge_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.pudge_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Sand King":
                heroIcon.setImageResource(R.drawable.sand_king_medium);
                heroName.setText(R.string.sand_king);
                heroRole.setText(R.string.sand_king_role);

                talent1.setText(R.string.sand_king_talent1_text);
                talent2.setText(R.string.sand_king_talent2_text);
                talent3.setText(R.string.sand_king_talent3_text);
                talent4.setText(R.string.sand_king_talent4_text);
                talent5.setText(R.string.sand_king_talent5_text);
                talent6.setText(R.string.sand_king_talent6_text);
                talent7.setText(R.string.sand_king_talent7_text);
                talent8.setText(R.string.sand_king_talent8_text);


                heroSkill1.setImageResource(R.drawable.sand_king_skill_1);
                heroSkill2.setImageResource(R.drawable.sand_king_skill_2);
                heroSkill3.setImageResource(R.drawable.sand_king_skill_3);
                heroSkill4.setImageResource(R.drawable.sand_king_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.sand_king_skill1_name));
                strSkillName2 = (getResources().getString(R.string.sand_king_skill2_name));
                strSkillName3 = (getResources().getString(R.string.sand_king_skill3_name));
                strSkillName4 = (getResources().getString(R.string.sand_king_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.sand_king_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.sand_king_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.sand_king_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.sand_king_skill4_description));

                strSkillText1 = (getResources().getString(R.string.sand_king_skill1_text));
                strSkillText2 = (getResources().getString(R.string.sand_king_skill2_text));
                strSkillText3 = (getResources().getString(R.string.sand_king_skill3_text));
                strSkillText4 = (getResources().getString(R.string.sand_king_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.sand_king_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.sand_king_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.sand_king_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.sand_king_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.sand_king_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.sand_king_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.sand_king_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.sand_king_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.sand_king_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.sand_king_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.sand_king_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.sand_king_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.sand_king_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Sladar":
                heroIcon.setImageResource(R.drawable.slardar_medium);
                heroName.setText(R.string.slardar);
                heroRole.setText(R.string.slardar_role);

                talent1.setText(R.string.slardar_talent1_text);
                talent2.setText(R.string.slardar_talent2_text);
                talent3.setText(R.string.slardar_talent3_text);
                talent4.setText(R.string.slardar_talent4_text);
                talent5.setText(R.string.slardar_talent5_text);
                talent6.setText(R.string.slardar_talent6_text);
                talent7.setText(R.string.slardar_talent7_text);
                talent8.setText(R.string.slardar_talent8_text);


                heroSkill1.setImageResource(R.drawable.slardar_skill_1);
                heroSkill2.setImageResource(R.drawable.slardar_skill_2);
                heroSkill3.setImageResource(R.drawable.slardar_skill_3);
                heroSkill4.setImageResource(R.drawable.slardar_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.slardar_skill1_name));
                strSkillName2 = (getResources().getString(R.string.slardar_skill2_name));
                strSkillName3 = (getResources().getString(R.string.slardar_skill3_name));
                strSkillName4 = (getResources().getString(R.string.slardar_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.slardar_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.slardar_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.slardar_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.slardar_skill4_description));

                strSkillText1 = (getResources().getString(R.string.slardar_skill1_text));
                strSkillText2 = (getResources().getString(R.string.slardar_skill2_text));
                strSkillText3 = (getResources().getString(R.string.slardar_skill3_text));
                strSkillText4 = (getResources().getString(R.string.slardar_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.slardar_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.slardar_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.slardar_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.slardar_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.slardar_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.slardar_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.slardar_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.slardar_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.slardar_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.slardar_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.slardar_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.slardar_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.slardar_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Snapfire":
                heroIcon.setImageResource(R.drawable.snapfire_medium);
                heroName.setText(R.string.snapfire);
                heroRole.setText(R.string.snapfire_role);

                talent1.setText(R.string.snapfire_talent1_text);
                talent2.setText(R.string.snapfire_talent2_text);
                talent3.setText(R.string.snapfire_talent3_text);
                talent4.setText(R.string.snapfire_talent4_text);
                talent5.setText(R.string.snapfire_talent5_text);
                talent6.setText(R.string.snapfire_talent6_text);
                talent7.setText(R.string.snapfire_talent7_text);
                talent8.setText(R.string.snapfire_talent8_text);


                heroSkill1.setImageResource(R.drawable.snapfire_skill_1);
                heroSkill2.setImageResource(R.drawable.snapfire_skill_2);
                heroSkill3.setImageResource(R.drawable.snapfire_skill_3);
                heroSkill4.setImageResource(R.drawable.snapfire_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.snapfire_skill1_name));
                strSkillName2 = (getResources().getString(R.string.snapfire_skill2_name));
                strSkillName3 = (getResources().getString(R.string.snapfire_skill3_name));
                strSkillName4 = (getResources().getString(R.string.snapfire_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.snapfire_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.snapfire_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.snapfire_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.snapfire_skill4_description));

                strSkillText1 = (getResources().getString(R.string.snapfire_skill1_text));
                strSkillText2 = (getResources().getString(R.string.snapfire_skill2_text));
                strSkillText3 = (getResources().getString(R.string.snapfire_skill3_text));
                strSkillText4 = (getResources().getString(R.string.snapfire_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.snapfire_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.snapfire_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.snapfire_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.snapfire_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.snapfire_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.snapfire_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.snapfire_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.snapfire_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.snapfire_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.snapfire_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.snapfire_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.snapfire_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.snapfire_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Spirit Breaker":
                heroIcon.setImageResource(R.drawable.spirit_breaker_medium);
                heroName.setText(R.string.spirit_breaker);
                heroRole.setText(R.string.spirit_breaker_role);

                talent1.setText(R.string.spirit_breaker_talent1_text);
                talent2.setText(R.string.spirit_breaker_talent2_text);
                talent3.setText(R.string.spirit_breaker_talent3_text);
                talent4.setText(R.string.spirit_breaker_talent4_text);
                talent5.setText(R.string.spirit_breaker_talent5_text);
                talent6.setText(R.string.spirit_breaker_talent6_text);
                talent7.setText(R.string.spirit_breaker_talent7_text);
                talent8.setText(R.string.spirit_breaker_talent8_text);


                heroSkill1.setImageResource(R.drawable.spirit_breaker_skill_1);
                heroSkill2.setImageResource(R.drawable.spirit_breaker_skill_2);
                heroSkill3.setImageResource(R.drawable.spirit_breaker_skill_3);
                heroSkill4.setImageResource(R.drawable.spirit_breaker_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.spirit_breaker_skill1_name));
                strSkillName2 = (getResources().getString(R.string.spirit_breaker_skill2_name));
                strSkillName3 = (getResources().getString(R.string.spirit_breaker_skill3_name));
                strSkillName4 = (getResources().getString(R.string.spirit_breaker_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.spirit_breaker_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.spirit_breaker_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.spirit_breaker_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.spirit_breaker_skill4_description));

                strSkillText1 = (getResources().getString(R.string.spirit_breaker_skill1_text));
                strSkillText2 = (getResources().getString(R.string.spirit_breaker_skill2_text));
                strSkillText3 = (getResources().getString(R.string.spirit_breaker_skill3_text));
                strSkillText4 = (getResources().getString(R.string.spirit_breaker_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.spirit_breaker_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.spirit_breaker_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.spirit_breaker_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.spirit_breaker_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.spirit_breaker_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.spirit_breaker_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.spirit_breaker_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.spirit_breaker_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.spirit_breaker_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.spirit_breaker_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.spirit_breaker_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.spirit_breaker_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.spirit_breaker_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Sven":
                heroIcon.setImageResource(R.drawable.sven_medium);
                heroName.setText(R.string.sven);
                heroRole.setText(R.string.sven_role);

                talent1.setText(R.string.sven_talent1_text);
                talent2.setText(R.string.sven_talent2_text);
                talent3.setText(R.string.sven_talent3_text);
                talent4.setText(R.string.sven_talent4_text);
                talent5.setText(R.string.sven_talent5_text);
                talent6.setText(R.string.sven_talent6_text);
                talent7.setText(R.string.sven_talent7_text);
                talent8.setText(R.string.sven_talent8_text);


                heroSkill1.setImageResource(R.drawable.sven_skill_1);
                heroSkill2.setImageResource(R.drawable.sven_skill_2);
                heroSkill3.setImageResource(R.drawable.sven_skill_3);
                heroSkill4.setImageResource(R.drawable.sven_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.sven_skill1_name));
                strSkillName2 = (getResources().getString(R.string.sven_skill2_name));
                strSkillName3 = (getResources().getString(R.string.sven_skill3_name));
                strSkillName4 = (getResources().getString(R.string.sven_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.sven_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.sven_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.sven_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.sven_skill4_description));

                strSkillText1 = (getResources().getString(R.string.sven_skill1_text));
                strSkillText2 = (getResources().getString(R.string.sven_skill2_text));
                strSkillText3 = (getResources().getString(R.string.sven_skill3_text));
                strSkillText4 = (getResources().getString(R.string.sven_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.sven_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.sven_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.sven_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.sven_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.sven_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.sven_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.sven_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.sven_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.sven_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.sven_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.sven_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.sven_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.sven_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Tidehunter":
                heroIcon.setImageResource(R.drawable.tidehunter_medium);
                heroName.setText(R.string.tidehunter);
                heroRole.setText(R.string.tidehunter_role);

                talent1.setText(R.string.tidehunter_talent1_text);
                talent2.setText(R.string.tidehunter_talent2_text);
                talent3.setText(R.string.tidehunter_talent3_text);
                talent4.setText(R.string.tidehunter_talent4_text);
                talent5.setText(R.string.tidehunter_talent5_text);
                talent6.setText(R.string.tidehunter_talent6_text);
                talent7.setText(R.string.tidehunter_talent7_text);
                talent8.setText(R.string.tidehunter_talent8_text);


                heroSkill1.setImageResource(R.drawable.tidehunter_skill_1);
                heroSkill2.setImageResource(R.drawable.tidehunter_skill_2);
                heroSkill3.setImageResource(R.drawable.tidehunter_skill_3);
                heroSkill4.setImageResource(R.drawable.tidehunter_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.tidehunter_skill1_name));
                strSkillName2 = (getResources().getString(R.string.tidehunter_skill2_name));
                strSkillName3 = (getResources().getString(R.string.tidehunter_skill3_name));
                strSkillName4 = (getResources().getString(R.string.tidehunter_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.tidehunter_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.tidehunter_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.tidehunter_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.tidehunter_skill4_description));

                strSkillText1 = (getResources().getString(R.string.tidehunter_skill1_text));
                strSkillText2 = (getResources().getString(R.string.tidehunter_skill2_text));
                strSkillText3 = (getResources().getString(R.string.tidehunter_skill3_text));
                strSkillText4 = (getResources().getString(R.string.tidehunter_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.tidehunter_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.tidehunter_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.tidehunter_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.tidehunter_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.tidehunter_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.tidehunter_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.tidehunter_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.tidehunter_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.tidehunter_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.tidehunter_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.tidehunter_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.tidehunter_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.tidehunter_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Timbersaw":
                heroIcon.setImageResource(R.drawable.timbersaw_medium);
                heroName.setText(R.string.timbersaw);
                heroRole.setText(R.string.timbersaw_role);

                talent1.setText(R.string.timbersaw_talent1_text);
                talent2.setText(R.string.timbersaw_talent2_text);
                talent3.setText(R.string.timbersaw_talent3_text);
                talent4.setText(R.string.timbersaw_talent4_text);
                talent5.setText(R.string.timbersaw_talent5_text);
                talent6.setText(R.string.timbersaw_talent6_text);
                talent7.setText(R.string.timbersaw_talent7_text);
                talent8.setText(R.string.timbersaw_talent8_text);


                heroSkill1.setImageResource(R.drawable.timbersaw_skill_1);
                heroSkill2.setImageResource(R.drawable.timbersaw_skill_2);
                heroSkill3.setImageResource(R.drawable.timbersaw_skill_3);
                heroSkill4.setImageResource(R.drawable.timbersaw_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.timbersaw_skill1_name));
                strSkillName2 = (getResources().getString(R.string.timbersaw_skill2_name));
                strSkillName3 = (getResources().getString(R.string.timbersaw_skill3_name));
                strSkillName4 = (getResources().getString(R.string.timbersaw_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.timbersaw_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.timbersaw_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.timbersaw_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.timbersaw_skill4_description));

                strSkillText1 = (getResources().getString(R.string.timbersaw_skill1_text));
                strSkillText2 = (getResources().getString(R.string.timbersaw_skill2_text));
                strSkillText3 = (getResources().getString(R.string.timbersaw_skill3_text));
                strSkillText4 = (getResources().getString(R.string.timbersaw_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.timbersaw_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.timbersaw_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.timbersaw_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.timbersaw_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.timbersaw_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.timbersaw_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.timbersaw_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.timbersaw_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.timbersaw_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.timbersaw_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.timbersaw_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.timbersaw_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.timbersaw_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Tiny":
                heroIcon.setImageResource(R.drawable.tiny_medium);
                heroName.setText(R.string.tiny);
                heroRole.setText(R.string.tiny_role);

                talent1.setText(R.string.tiny_talent1_text);
                talent2.setText(R.string.tiny_talent2_text);
                talent3.setText(R.string.tiny_talent3_text);
                talent4.setText(R.string.tiny_talent4_text);
                talent5.setText(R.string.tiny_talent5_text);
                talent6.setText(R.string.tiny_talent6_text);
                talent7.setText(R.string.tiny_talent7_text);
                talent8.setText(R.string.tiny_talent8_text);


                heroSkill1.setImageResource(R.drawable.tiny_skill_1);
                heroSkill2.setImageResource(R.drawable.tiny_skill_2);
                heroSkill3.setImageResource(R.drawable.tiny_skill_3);
                heroSkill4.setImageResource(R.drawable.tiny_skill_4);
                heroSkill5.setImageResource(R.drawable.tiny_skill_5);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.tiny_skill1_name));
                strSkillName2 = (getResources().getString(R.string.tiny_skill2_name));
                strSkillName3 = (getResources().getString(R.string.tiny_skill3_name));
                strSkillName4 = (getResources().getString(R.string.tiny_skill4_name));
                strSkillName5 = (getResources().getString(R.string.tiny_skill5_name));

                strSkillDescription1 = (getResources().getString(R.string.tiny_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.tiny_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.tiny_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.tiny_skill4_description));
                strSkillDescription5 = (getResources().getString(R.string.tiny_skill5_description));

                strSkillText1 = (getResources().getString(R.string.tiny_skill1_text));
                strSkillText2 = (getResources().getString(R.string.tiny_skill2_text));
                strSkillText3 = (getResources().getString(R.string.tiny_skill3_text));
                strSkillText4 = (getResources().getString(R.string.tiny_skill4_text));
                strSkillText5 = (getResources().getString(R.string.tiny_skill5_text));

                strScepterSkillText1 = (getResources().getString(R.string.tiny_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.tiny_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.tiny_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.tiny_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.tiny_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.tiny_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.tiny_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.tiny_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.tiny_skill4_cooldown));
                strSkillCooldown5 = (getResources().getString(R.string.tiny_skill5_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.tiny_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.tiny_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.tiny_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.tiny_skill4_manacost));
                strSkillManacost5 = (getResources().getString(R.string.tiny_skill5_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Treant Protector":
                heroIcon.setImageResource(R.drawable.treant_medium);
                heroName.setText(R.string.treant_protector);
                heroRole.setText(R.string.treant_protector_role);

                talent1.setText(R.string.treant_protector_talent1_text);
                talent2.setText(R.string.treant_protector_talent2_text);
                talent3.setText(R.string.treant_protector_talent3_text);
                talent4.setText(R.string.treant_protector_talent4_text);
                talent5.setText(R.string.treant_protector_talent5_text);
                talent6.setText(R.string.treant_protector_talent6_text);
                talent7.setText(R.string.treant_protector_talent7_text);
                talent8.setText(R.string.treant_protector_talent8_text);


                heroSkill1.setImageResource(R.drawable.treant_skill_1);
                heroSkill2.setImageResource(R.drawable.treant_skill_2);
                heroSkill3.setImageResource(R.drawable.treant_skill_3);
                heroSkill4.setImageResource(R.drawable.treant_skill_4);
                heroSkill5.setImageResource(R.drawable.treant_skill_5);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.treant_protector_skill1_name));
                strSkillName2 = (getResources().getString(R.string.treant_protector_skill2_name));
                strSkillName3 = (getResources().getString(R.string.treant_protector_skill3_name));
                strSkillName4 = (getResources().getString(R.string.treant_protector_skill4_name));
                strSkillName5 = (getResources().getString(R.string.treant_protector_skill5_name));

                strSkillDescription1 = (getResources().getString(R.string.treant_protector_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.treant_protector_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.treant_protector_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.treant_protector_skill4_description));
                strSkillDescription5 = (getResources().getString(R.string.treant_protector_skill5_description));

                strSkillText1 = (getResources().getString(R.string.treant_protector_skill1_text));
                strSkillText2 = (getResources().getString(R.string.treant_protector_skill2_text));
                strSkillText3 = (getResources().getString(R.string.treant_protector_skill3_text));
                strSkillText4 = (getResources().getString(R.string.treant_protector_skill4_text));
                strSkillText5 = (getResources().getString(R.string.treant_protector_skill5_text));

                strScepterSkillText1 = (getResources().getString(R.string.treant_protector_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.treant_protector_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.treant_protector_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.treant_protector_scepter_skill4_text));
                strScepterSkillText5 = (getResources().getString(R.string.treant_protector_scepter_skill5_text));

                aghanimShardAbilityText = (getResources().getString(R.string.treant_protector_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.treant_protector_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.treant_protector_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.treant_protector_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.treant_protector_skill4_cooldown));
                strSkillCooldown5 = (getResources().getString(R.string.treant_protector_skill5_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.treant_protector_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.treant_protector_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.treant_protector_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.treant_protector_skill4_manacost));
                strSkillManacost5 = (getResources().getString(R.string.treant_protector_skill5_manacost));



                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Tusk":
                heroIcon.setImageResource(R.drawable.tusk_medium);
                heroName.setText(R.string.tusk);
                heroRole.setText(R.string.tusk_role);

                talent1.setText(R.string.tusk_talent1_text);
                talent2.setText(R.string.tusk_talent2_text);
                talent3.setText(R.string.tusk_talent3_text);
                talent4.setText(R.string.tusk_talent4_text);
                talent5.setText(R.string.tusk_talent5_text);
                talent6.setText(R.string.tusk_talent6_text);
                talent7.setText(R.string.tusk_talent7_text);
                talent8.setText(R.string.tusk_talent8_text);


                heroSkill1.setImageResource(R.drawable.tusk_skill_1);
                heroSkill2.setImageResource(R.drawable.tusk_skill_2);
                heroSkill3.setImageResource(R.drawable.tusk_skill_3);
                heroSkill4.setImageResource(R.drawable.tusk_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.tusk_skill1_name));
                strSkillName2 = (getResources().getString(R.string.tusk_skill2_name));
                strSkillName3 = (getResources().getString(R.string.tusk_skill3_name));
                strSkillName4 = (getResources().getString(R.string.tusk_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.tusk_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.tusk_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.tusk_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.tusk_skill4_description));

                strSkillText1 = (getResources().getString(R.string.tusk_skill1_text));
                strSkillText2 = (getResources().getString(R.string.tusk_skill2_text));
                strSkillText3 = (getResources().getString(R.string.tusk_skill3_text));
                strSkillText4 = (getResources().getString(R.string.tusk_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.tusk_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.tusk_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.tusk_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.tusk_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.tusk_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.tusk_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.tusk_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.tusk_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.tusk_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.tusk_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.tusk_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.tusk_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.tusk_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Underlord":
                heroIcon.setImageResource(R.drawable.underlord_medium);
                heroName.setText(R.string.underlord);
                heroRole.setText(R.string.underlord_role);

                talent1.setText(R.string.underlord_talent1_text);
                talent2.setText(R.string.underlord_talent2_text);
                talent3.setText(R.string.underlord_talent3_text);
                talent4.setText(R.string.underlord_talent4_text);
                talent5.setText(R.string.underlord_talent5_text);
                talent6.setText(R.string.underlord_talent6_text);
                talent7.setText(R.string.underlord_talent7_text);
                talent8.setText(R.string.underlord_talent8_text);


                heroSkill1.setImageResource(R.drawable.underlord_skill_1);
                heroSkill2.setImageResource(R.drawable.underlord_skill_2);
                heroSkill3.setImageResource(R.drawable.underlord_skill_3);
                heroSkill4.setImageResource(R.drawable.underlord_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.underlord_skill1_name));
                strSkillName2 = (getResources().getString(R.string.underlord_skill2_name));
                strSkillName3 = (getResources().getString(R.string.underlord_skill3_name));
                strSkillName4 = (getResources().getString(R.string.underlord_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.underlord_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.underlord_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.underlord_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.underlord_skill4_description));

                strSkillText1 = (getResources().getString(R.string.underlord_skill1_text));
                strSkillText2 = (getResources().getString(R.string.underlord_skill2_text));
                strSkillText3 = (getResources().getString(R.string.underlord_skill3_text));
                strSkillText4 = (getResources().getString(R.string.underlord_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.underlord_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.underlord_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.underlord_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.underlord_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.underlord_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.underlord_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.underlord_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.underlord_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.underlord_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.underlord_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.underlord_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.underlord_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.underlord_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Undying":
                heroIcon.setImageResource(R.drawable.undying_medium);
                heroName.setText(R.string.undying);
                heroRole.setText(R.string.undying_role);

                talent1.setText(R.string.undying_talent1_text);
                talent2.setText(R.string.undying_talent2_text);
                talent3.setText(R.string.undying_talent3_text);
                talent4.setText(R.string.undying_talent4_text);
                talent5.setText(R.string.undying_talent5_text);
                talent6.setText(R.string.undying_talent6_text);
                talent7.setText(R.string.undying_talent7_text);
                talent8.setText(R.string.undying_talent8_text);


                heroSkill1.setImageResource(R.drawable.undying_skill_1);
                heroSkill2.setImageResource(R.drawable.undying_skill_2);
                heroSkill3.setImageResource(R.drawable.undying_skill_3);
                heroSkill4.setImageResource(R.drawable.undying_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.undying_skill1_name));
                strSkillName2 = (getResources().getString(R.string.undying_skill2_name));
                strSkillName3 = (getResources().getString(R.string.undying_skill3_name));
                strSkillName4 = (getResources().getString(R.string.undying_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.undying_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.undying_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.undying_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.undying_skill4_description));

                strSkillText1 = (getResources().getString(R.string.undying_skill1_text));
                strSkillText2 = (getResources().getString(R.string.undying_skill2_text));
                strSkillText3 = (getResources().getString(R.string.undying_skill3_text));
                strSkillText4 = (getResources().getString(R.string.undying_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.undying_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.undying_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.undying_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.undying_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.undying_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.undying_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.undying_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.undying_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.undying_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.undying_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.undying_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.undying_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.undying_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Wisp":
                heroIcon.setImageResource(R.drawable.io_medium);
                heroName.setText(R.string.io);
                heroRole.setText(R.string.io_role);

                talent1.setText(R.string.io_talent1_text);
                talent2.setText(R.string.io_talent2_text);
                talent3.setText(R.string.io_talent3_text);
                talent4.setText(R.string.io_talent4_text);
                talent5.setText(R.string.io_talent5_text);
                talent6.setText(R.string.io_talent6_text);
                talent7.setText(R.string.io_talent7_text);
                talent8.setText(R.string.io_talent8_text);


                heroSkill1.setImageResource(R.drawable.io_skill_1);
                heroSkill2.setImageResource(R.drawable.io_skill_2);
                heroSkill3.setImageResource(R.drawable.io_skill_3);
                heroSkill4.setImageResource(R.drawable.io_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.io_skill1_name));
                strSkillName2 = (getResources().getString(R.string.io_skill2_name));
                strSkillName3 = (getResources().getString(R.string.io_skill3_name));
                strSkillName4 = (getResources().getString(R.string.io_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.io_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.io_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.io_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.io_skill4_description));

                strSkillText1 = (getResources().getString(R.string.io_skill1_text));
                strSkillText2 = (getResources().getString(R.string.io_skill2_text));
                strSkillText3 = (getResources().getString(R.string.io_skill3_text));
                strSkillText4 = (getResources().getString(R.string.io_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.io_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.io_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.io_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.io_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.io_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.io_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.io_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.io_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.io_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.io_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.io_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.io_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.io_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Wraith King":
                heroIcon.setImageResource(R.drawable.wraith_king_medium);
                heroName.setText(R.string.wraith_king);
                heroRole.setText(R.string.wraith_king_role);

                talent1.setText(R.string.wraith_king_talent1_text);
                talent2.setText(R.string.wraith_king_talent2_text);
                talent3.setText(R.string.wraith_king_talent3_text);
                talent4.setText(R.string.wraith_king_talent4_text);
                talent5.setText(R.string.wraith_king_talent5_text);
                talent6.setText(R.string.wraith_king_talent6_text);
                talent7.setText(R.string.wraith_king_talent7_text);
                talent8.setText(R.string.wraith_king_talent8_text);


                heroSkill1.setImageResource(R.drawable.wraith_king_skill_1);
                heroSkill2.setImageResource(R.drawable.wraith_king_skill_2);
                heroSkill3.setImageResource(R.drawable.wraith_king_skill_3);
                heroSkill4.setImageResource(R.drawable.wraith_king_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.wraith_king_skill1_name));
                strSkillName2 = (getResources().getString(R.string.wraith_king_skill2_name));
                strSkillName3 = (getResources().getString(R.string.wraith_king_skill3_name));
                strSkillName4 = (getResources().getString(R.string.wraith_king_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.wraith_king_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.wraith_king_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.wraith_king_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.wraith_king_skill4_description));

                strSkillText1 = (getResources().getString(R.string.wraith_king_skill1_text));
                strSkillText2 = (getResources().getString(R.string.wraith_king_skill2_text));
                strSkillText3 = (getResources().getString(R.string.wraith_king_skill3_text));
                strSkillText4 = (getResources().getString(R.string.wraith_king_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.wraith_king_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.wraith_king_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.wraith_king_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.wraith_king_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.wraith_king_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.wraith_king_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.wraith_king_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.wraith_king_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.wraith_king_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.wraith_king_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.wraith_king_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.wraith_king_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.wraith_king_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
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
                heroIcon.setImageResource(R.drawable.antimage_medium);
                heroName.setText(R.string.antimage);
                heroRole.setText(R.string.antimage_role);

                talent1.setText(R.string.antimage_talent1_text);
                talent2.setText(R.string.antimage_talent2_text);
                talent3.setText(R.string.antimage_talent3_text);
                talent4.setText(R.string.antimage_talent4_text);
                talent5.setText(R.string.antimage_talent5_text);
                talent6.setText(R.string.antimage_talent6_text);
                talent7.setText(R.string.antimage_talent7_text);
                talent8.setText(R.string.antimage_talent8_text);


                heroSkill1.setImageResource(R.drawable.antimage_skill_1);
                heroSkill2.setImageResource(R.drawable.antimage_skill_2);
                heroSkill3.setImageResource(R.drawable.antimage_skill_3);
                heroSkill4.setImageResource(R.drawable.antimage_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.antimage_skill1_name));
                strSkillName2 = (getResources().getString(R.string.antimage_skill2_name));
                strSkillName3 = (getResources().getString(R.string.antimage_skill3_name));
                strSkillName4 = (getResources().getString(R.string.antimage_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.antimage_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.antimage_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.antimage_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.antimage_skill4_description));

                strSkillText1 = (getResources().getString(R.string.antimage_skill1_text));
                strSkillText2 = (getResources().getString(R.string.antimage_skill2_text));
                strSkillText3 = (getResources().getString(R.string.antimage_skill3_text));
                strSkillText4 = (getResources().getString(R.string.antimage_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.antimage_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.antimage_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.antimage_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.antimage_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.antimage_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.antimage_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.antimage_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.antimage_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.antimage_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.antimage_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.antimage_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.antimage_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.antimage_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Arc Warden":
                heroIcon.setImageResource(R.drawable.arc_warden_medium);
                heroName.setText(R.string.arc_warden);
                heroRole.setText(R.string.arc_warden_role);

                talent1.setText(R.string.arc_warden_talent1_text);
                talent2.setText(R.string.arc_warden_talent2_text);
                talent3.setText(R.string.arc_warden_talent3_text);
                talent4.setText(R.string.arc_warden_talent4_text);
                talent5.setText(R.string.arc_warden_talent5_text);
                talent6.setText(R.string.arc_warden_talent6_text);
                talent7.setText(R.string.arc_warden_talent7_text);
                talent8.setText(R.string.arc_warden_talent8_text);


                heroSkill1.setImageResource(R.drawable.arc_warden_skill_1);
                heroSkill2.setImageResource(R.drawable.arc_warden_skill_2);
                heroSkill3.setImageResource(R.drawable.arc_warden_skill_3);
                heroSkill4.setImageResource(R.drawable.arc_warden_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.arc_warden_skill1_name));
                strSkillName2 = (getResources().getString(R.string.arc_warden_skill2_name));
                strSkillName3 = (getResources().getString(R.string.arc_warden_skill3_name));
                strSkillName4 = (getResources().getString(R.string.arc_warden_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.arc_warden_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.arc_warden_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.arc_warden_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.arc_warden_skill4_description));

                strSkillText1 = (getResources().getString(R.string.arc_warden_skill1_text));
                strSkillText2 = (getResources().getString(R.string.arc_warden_skill2_text));
                strSkillText3 = (getResources().getString(R.string.arc_warden_skill3_text));
                strSkillText4 = (getResources().getString(R.string.arc_warden_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.arc_warden_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.arc_warden_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.arc_warden_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.arc_warden_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.arc_warden_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.arc_warden_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.arc_warden_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.arc_warden_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.arc_warden_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.arc_warden_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.arc_warden_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.arc_warden_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.arc_warden_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Bloodseeker":
                heroIcon.setImageResource(R.drawable.bloodseeker_medium);
                heroName.setText(R.string.bloodseeker);
                heroRole.setText(R.string.bloodseeker_role);

                talent1.setText(R.string.bloodseeker_talent1_text);
                talent2.setText(R.string.bloodseeker_talent2_text);
                talent3.setText(R.string.bloodseeker_talent3_text);
                talent4.setText(R.string.bloodseeker_talent4_text);
                talent5.setText(R.string.bloodseeker_talent5_text);
                talent6.setText(R.string.bloodseeker_talent6_text);
                talent7.setText(R.string.bloodseeker_talent7_text);
                talent8.setText(R.string.bloodseeker_talent8_text);


                heroSkill1.setImageResource(R.drawable.bloodseeker_skill_1);
                heroSkill2.setImageResource(R.drawable.bloodseeker_skill_2);
                heroSkill3.setImageResource(R.drawable.bloodseeker_skill_3);
                heroSkill4.setImageResource(R.drawable.bloodseeker_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.bloodseeker_skill1_name));
                strSkillName2 = (getResources().getString(R.string.bloodseeker_skill2_name));
                strSkillName3 = (getResources().getString(R.string.bloodseeker_skill3_name));
                strSkillName4 = (getResources().getString(R.string.bloodseeker_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.bloodseeker_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.bloodseeker_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.bloodseeker_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.bloodseeker_skill4_description));

                strSkillText1 = (getResources().getString(R.string.bloodseeker_skill1_text));
                strSkillText2 = (getResources().getString(R.string.bloodseeker_skill2_text));
                strSkillText3 = (getResources().getString(R.string.bloodseeker_skill3_text));
                strSkillText4 = (getResources().getString(R.string.bloodseeker_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.bloodseeker_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.bloodseeker_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.bloodseeker_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.bloodseeker_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.bloodseeker_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.bloodseeker_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.bloodseeker_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.bloodseeker_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.bloodseeker_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.bloodseeker_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.bloodseeker_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.bloodseeker_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.bloodseeker_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Bounty Hunter":
                heroIcon.setImageResource(R.drawable.bounty_hunter_medium);
                heroName.setText(R.string.bounty_hunter);
                heroRole.setText(R.string.bounty_hunter_role);

                talent1.setText(R.string.bounty_hunter_talent1_text);
                talent2.setText(R.string.bounty_hunter_talent2_text);
                talent3.setText(R.string.bounty_hunter_talent3_text);
                talent4.setText(R.string.bounty_hunter_talent4_text);
                talent5.setText(R.string.bounty_hunter_talent5_text);
                talent6.setText(R.string.bounty_hunter_talent6_text);
                talent7.setText(R.string.bounty_hunter_talent7_text);
                talent8.setText(R.string.bounty_hunter_talent8_text);


                heroSkill1.setImageResource(R.drawable.bounty_hunter_skill_1);
                heroSkill2.setImageResource(R.drawable.bounty_hunter_skill_2);
                heroSkill3.setImageResource(R.drawable.bounty_hunter_skill_3);
                heroSkill4.setImageResource(R.drawable.bounty_hunter_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.bounty_hunter_skill1_name));
                strSkillName2 = (getResources().getString(R.string.bounty_hunter_skill2_name));
                strSkillName3 = (getResources().getString(R.string.bounty_hunter_skill3_name));
                strSkillName4 = (getResources().getString(R.string.bounty_hunter_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.bounty_hunter_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.bounty_hunter_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.bounty_hunter_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.bounty_hunter_skill4_description));

                strSkillText1 = (getResources().getString(R.string.bounty_hunter_skill1_text));
                strSkillText2 = (getResources().getString(R.string.bounty_hunter_skill2_text));
                strSkillText3 = (getResources().getString(R.string.bounty_hunter_skill3_text));
                strSkillText4 = (getResources().getString(R.string.bounty_hunter_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.bounty_hunter_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.bounty_hunter_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.bounty_hunter_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.bounty_hunter_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.bounty_hunter_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.bounty_hunter_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.bounty_hunter_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.bounty_hunter_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.bounty_hunter_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.bounty_hunter_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.bounty_hunter_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.bounty_hunter_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.bounty_hunter_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Broodmother":
                heroIcon.setImageResource(R.drawable.broodmother_medium);
                heroName.setText(R.string.broodmother);
                heroRole.setText(R.string.broodmother_role);

                talent1.setText(R.string.broodmother_talent1_text);
                talent2.setText(R.string.broodmother_talent2_text);
                talent3.setText(R.string.broodmother_talent3_text);
                talent4.setText(R.string.broodmother_talent4_text);
                talent5.setText(R.string.broodmother_talent5_text);
                talent6.setText(R.string.broodmother_talent6_text);
                talent7.setText(R.string.broodmother_talent7_text);
                talent8.setText(R.string.broodmother_talent8_text);


                heroSkill1.setImageResource(R.drawable.broodmother_skill_4);
                heroSkill2.setImageResource(R.drawable.broodmother_skill_2);
                heroSkill3.setImageResource(R.drawable.broodmother_skill_3);
                heroSkill4.setImageResource(R.drawable.broodmother_skill_1);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.broodmother_skill1_name));
                strSkillName2 = (getResources().getString(R.string.broodmother_skill2_name));
                strSkillName3 = (getResources().getString(R.string.broodmother_skill3_name));
                strSkillName4 = (getResources().getString(R.string.broodmother_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.broodmother_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.broodmother_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.broodmother_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.broodmother_skill4_description));

                strSkillText1 = (getResources().getString(R.string.broodmother_skill1_text));
                strSkillText2 = (getResources().getString(R.string.broodmother_skill2_text));
                strSkillText3 = (getResources().getString(R.string.broodmother_skill3_text));
                strSkillText4 = (getResources().getString(R.string.broodmother_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.broodmother_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.broodmother_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.broodmother_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.broodmother_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.broodmother_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.broodmother_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.broodmother_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.broodmother_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.broodmother_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.broodmother_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.broodmother_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.broodmother_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.broodmother_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Clinkz":
                heroIcon.setImageResource(R.drawable.clinkz_medium);
                heroName.setText(R.string.clinkz);
                heroRole.setText(R.string.clinkz_role);

                talent1.setText(R.string.clinkz_talent1_text);
                talent2.setText(R.string.clinkz_talent2_text);
                talent3.setText(R.string.clinkz_talent3_text);
                talent4.setText(R.string.clinkz_talent4_text);
                talent5.setText(R.string.clinkz_talent5_text);
                talent6.setText(R.string.clinkz_talent6_text);
                talent7.setText(R.string.clinkz_talent7_text);
                talent8.setText(R.string.clinkz_talent8_text);


                heroSkill1.setImageResource(R.drawable.clinkz_skill_1);
                heroSkill2.setImageResource(R.drawable.clinkz_skill_2);
                heroSkill3.setImageResource(R.drawable.clinkz_skill_3);
                heroSkill4.setImageResource(R.drawable.clinkz_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.clinkz_skill1_name));
                strSkillName2 = (getResources().getString(R.string.clinkz_skill2_name));
                strSkillName3 = (getResources().getString(R.string.clinkz_skill3_name));
                strSkillName4 = (getResources().getString(R.string.clinkz_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.clinkz_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.clinkz_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.clinkz_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.clinkz_skill4_description));

                strSkillText1 = (getResources().getString(R.string.clinkz_skill1_text));
                strSkillText2 = (getResources().getString(R.string.clinkz_skill2_text));
                strSkillText3 = (getResources().getString(R.string.clinkz_skill3_text));
                strSkillText4 = (getResources().getString(R.string.clinkz_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.clinkz_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.clinkz_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.clinkz_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.clinkz_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.clinkz_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.clinkz_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.clinkz_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.clinkz_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.clinkz_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.clinkz_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.clinkz_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.clinkz_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.clinkz_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Drow Ranger":
                heroIcon.setImageResource(R.drawable.drow_ranger_medium);
                heroName.setText(R.string.drow_ranger);
                heroRole.setText(R.string.drow_ranger_role);

                talent1.setText(R.string.drow_ranger_talent1_text);
                talent2.setText(R.string.drow_ranger_talent2_text);
                talent3.setText(R.string.drow_ranger_talent3_text);
                talent4.setText(R.string.drow_ranger_talent4_text);
                talent5.setText(R.string.drow_ranger_talent5_text);
                talent6.setText(R.string.drow_ranger_talent6_text);
                talent7.setText(R.string.drow_ranger_talent7_text);
                talent8.setText(R.string.drow_ranger_talent8_text);


                heroSkill1.setImageResource(R.drawable.drow_ranger_skill_1);
                heroSkill2.setImageResource(R.drawable.drow_ranger_skill_2);
                heroSkill3.setImageResource(R.drawable.drow_ranger_skill_3);
                heroSkill4.setImageResource(R.drawable.drow_ranger_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.drow_ranger_skill1_name));
                strSkillName2 = (getResources().getString(R.string.drow_ranger_skill2_name));
                strSkillName3 = (getResources().getString(R.string.drow_ranger_skill3_name));
                strSkillName4 = (getResources().getString(R.string.drow_ranger_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.drow_ranger_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.drow_ranger_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.drow_ranger_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.drow_ranger_skill4_description));

                strSkillText1 = (getResources().getString(R.string.drow_ranger_skill1_text));
                strSkillText2 = (getResources().getString(R.string.drow_ranger_skill2_text));
                strSkillText3 = (getResources().getString(R.string.drow_ranger_skill3_text));
                strSkillText4 = (getResources().getString(R.string.drow_ranger_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.drow_ranger_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.drow_ranger_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.drow_ranger_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.drow_ranger_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.drow_ranger_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.drow_ranger_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.drow_ranger_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.drow_ranger_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.drow_ranger_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.drow_ranger_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.drow_ranger_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.drow_ranger_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.drow_ranger_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Ember Spirit":
                heroIcon.setImageResource(R.drawable.ember_spirit_medium);
                heroName.setText(R.string.ember_spirit);
                heroRole.setText(R.string.ember_spirit_role);

                talent1.setText(R.string.ember_spirit_talent1_text);
                talent2.setText(R.string.ember_spirit_talent2_text);
                talent3.setText(R.string.ember_spirit_talent3_text);
                talent4.setText(R.string.ember_spirit_talent4_text);
                talent5.setText(R.string.ember_spirit_talent5_text);
                talent6.setText(R.string.ember_spirit_talent6_text);
                talent7.setText(R.string.ember_spirit_talent7_text);
                talent8.setText(R.string.ember_spirit_talent8_text);


                heroSkill1.setImageResource(R.drawable.ember_spirit_skill_1);
                heroSkill2.setImageResource(R.drawable.ember_spirit_skill_2);
                heroSkill3.setImageResource(R.drawable.ember_spirit_skill_3);
                heroSkill4.setImageResource(R.drawable.ember_spirit_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.ember_spirit_skill1_name));
                strSkillName2 = (getResources().getString(R.string.ember_spirit_skill2_name));
                strSkillName3 = (getResources().getString(R.string.ember_spirit_skill3_name));
                strSkillName4 = (getResources().getString(R.string.ember_spirit_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.ember_spirit_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.ember_spirit_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.ember_spirit_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.ember_spirit_skill4_description));

                strSkillText1 = (getResources().getString(R.string.ember_spirit_skill1_text));
                strSkillText2 = (getResources().getString(R.string.ember_spirit_skill2_text));
                strSkillText3 = (getResources().getString(R.string.ember_spirit_skill3_text));
                strSkillText4 = (getResources().getString(R.string.ember_spirit_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.ember_spirit_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.ember_spirit_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.ember_spirit_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.ember_spirit_scepter_skill4_text));

                strSkillCooldown1 = (getResources().getString(R.string.ember_spirit_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.ember_spirit_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.ember_spirit_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.ember_spirit_skill4_cooldown));

                aghanimShardAbilityText = (getResources().getString(R.string.ember_spirit_aghanims_shard_ability_text));

                strSkillManacost1 = (getResources().getString(R.string.ember_spirit_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.ember_spirit_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.ember_spirit_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.ember_spirit_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Faceless Void":
                heroIcon.setImageResource(R.drawable.faceless_void_medium);
                heroName.setText(R.string.faceless_void);
                heroRole.setText(R.string.faceless_void_role);

                talent1.setText(R.string.faceless_void_talent1_text);
                talent2.setText(R.string.faceless_void_talent2_text);
                talent3.setText(R.string.faceless_void_talent3_text);
                talent4.setText(R.string.faceless_void_talent4_text);
                talent5.setText(R.string.faceless_void_talent5_text);
                talent6.setText(R.string.faceless_void_talent6_text);
                talent7.setText(R.string.faceless_void_talent7_text);
                talent8.setText(R.string.faceless_void_talent8_text);


                heroSkill1.setImageResource(R.drawable.faceless_void_skill_1);
                heroSkill2.setImageResource(R.drawable.faceless_void_skill_2);
                heroSkill3.setImageResource(R.drawable.faceless_void_skill_3);
                heroSkill4.setImageResource(R.drawable.faceless_void_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.faceless_void_skill1_name));
                strSkillName2 = (getResources().getString(R.string.faceless_void_skill2_name));
                strSkillName3 = (getResources().getString(R.string.faceless_void_skill3_name));
                strSkillName4 = (getResources().getString(R.string.faceless_void_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.faceless_void_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.faceless_void_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.faceless_void_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.faceless_void_skill4_description));

                strSkillText1 = (getResources().getString(R.string.faceless_void_skill1_text));
                strSkillText2 = (getResources().getString(R.string.faceless_void_skill2_text));
                strSkillText3 = (getResources().getString(R.string.faceless_void_skill3_text));
                strSkillText4 = (getResources().getString(R.string.faceless_void_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.faceless_void_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.faceless_void_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.faceless_void_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.faceless_void_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.faceless_void_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.faceless_void_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.faceless_void_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.faceless_void_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.faceless_void_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.faceless_void_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.faceless_void_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.faceless_void_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.faceless_void_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Gyrocopter":
                heroIcon.setImageResource(R.drawable.gyrocopter_medium);
                heroName.setText(R.string.gyrocopter);
                heroRole.setText(R.string.gyrocopter_role);

                talent1.setText(R.string.gyrocopter_talent1_text);
                talent2.setText(R.string.gyrocopter_talent2_text);
                talent3.setText(R.string.gyrocopter_talent3_text);
                talent4.setText(R.string.gyrocopter_talent4_text);
                talent5.setText(R.string.gyrocopter_talent5_text);
                talent6.setText(R.string.gyrocopter_talent6_text);
                talent7.setText(R.string.gyrocopter_talent7_text);
                talent8.setText(R.string.gyrocopter_talent8_text);


                heroSkill1.setImageResource(R.drawable.gyrocopter_skill_1);
                heroSkill2.setImageResource(R.drawable.gyrocopter_skill_2);
                heroSkill3.setImageResource(R.drawable.gyrocopter_skill_3);
                heroSkill4.setImageResource(R.drawable.gyrocopter_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.gyrocopter_skill1_name));
                strSkillName2 = (getResources().getString(R.string.gyrocopter_skill2_name));
                strSkillName3 = (getResources().getString(R.string.gyrocopter_skill3_name));
                strSkillName4 = (getResources().getString(R.string.gyrocopter_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.gyrocopter_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.gyrocopter_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.gyrocopter_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.gyrocopter_skill4_description));

                strSkillText1 = (getResources().getString(R.string.gyrocopter_skill1_text));
                strSkillText2 = (getResources().getString(R.string.gyrocopter_skill2_text));
                strSkillText3 = (getResources().getString(R.string.gyrocopter_skill3_text));
                strSkillText4 = (getResources().getString(R.string.gyrocopter_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.gyrocopter_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.gyrocopter_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.gyrocopter_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.gyrocopter_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.gyrocopter_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.gyrocopter_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.gyrocopter_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.gyrocopter_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.gyrocopter_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.gyrocopter_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.gyrocopter_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.gyrocopter_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.gyrocopter_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;

            case "Hoodwink":
                heroIcon.setImageResource(R.drawable.hoodwink_medium);
                heroName.setText(R.string.hoodwink);
                heroRole.setText(R.string.hoodwink_role);

                talent1.setText(R.string.hoodwink_talent1_text);
                talent2.setText(R.string.hoodwink_talent2_text);
                talent3.setText(R.string.hoodwink_talent3_text);
                talent4.setText(R.string.hoodwink_talent4_text);
                talent5.setText(R.string.hoodwink_talent5_text);
                talent6.setText(R.string.hoodwink_talent6_text);
                talent7.setText(R.string.hoodwink_talent7_text);
                talent8.setText(R.string.hoodwink_talent8_text);


                heroSkill1.setImageResource(R.drawable.hoodwink_skill_1);
                heroSkill2.setImageResource(R.drawable.hoodwink_skill_2);
                heroSkill3.setImageResource(R.drawable.hoodwink_skill_3);
                heroSkill4.setImageResource(R.drawable.hoodwink_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.hoodwink_skill1_name));
                strSkillName2 = (getResources().getString(R.string.hoodwink_skill2_name));
                strSkillName3 = (getResources().getString(R.string.hoodwink_skill3_name));
                strSkillName4 = (getResources().getString(R.string.hoodwink_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.hoodwink_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.hoodwink_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.hoodwink_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.hoodwink_skill4_description));

                strSkillText1 = (getResources().getString(R.string.hoodwink_skill1_text));
                strSkillText2 = (getResources().getString(R.string.hoodwink_skill2_text));
                strSkillText3 = (getResources().getString(R.string.hoodwink_skill3_text));
                strSkillText4 = (getResources().getString(R.string.hoodwink_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.hoodwink_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.hoodwink_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.hoodwink_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.hoodwink_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.hoodwink_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.hoodwink_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.hoodwink_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.hoodwink_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.hoodwink_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.hoodwink_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.hoodwink_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.hoodwink_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.hoodwink_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Juggernaut":
                heroIcon.setImageResource(R.drawable.juggernaut_medium);
                heroName.setText(R.string.juggernaut);
                heroRole.setText(R.string.juggernaut_role);

                talent1.setText(R.string.juggernaut_talent1_text);
                talent2.setText(R.string.juggernaut_talent2_text);
                talent3.setText(R.string.juggernaut_talent3_text);
                talent4.setText(R.string.juggernaut_talent4_text);
                talent5.setText(R.string.juggernaut_talent5_text);
                talent6.setText(R.string.juggernaut_talent6_text);
                talent7.setText(R.string.juggernaut_talent7_text);
                talent8.setText(R.string.juggernaut_talent8_text);


                heroSkill1.setImageResource(R.drawable.juggernaut_skill_1);
                heroSkill2.setImageResource(R.drawable.juggernaut_skill_2);
                heroSkill3.setImageResource(R.drawable.juggernaut_skill_3);
                heroSkill4.setImageResource(R.drawable.juggernaut_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.juggernaut_skill1_name));
                strSkillName2 = (getResources().getString(R.string.juggernaut_skill2_name));
                strSkillName3 = (getResources().getString(R.string.juggernaut_skill3_name));
                strSkillName4 = (getResources().getString(R.string.juggernaut_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.juggernaut_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.juggernaut_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.juggernaut_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.juggernaut_skill4_description));

                strSkillText1 = (getResources().getString(R.string.juggernaut_skill1_text));
                strSkillText2 = (getResources().getString(R.string.juggernaut_skill2_text));
                strSkillText3 = (getResources().getString(R.string.juggernaut_skill3_text));
                strSkillText4 = (getResources().getString(R.string.juggernaut_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.juggernaut_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.juggernaut_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.juggernaut_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.juggernaut_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.juggernaut_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.juggernaut_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.juggernaut_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.juggernaut_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.juggernaut_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.juggernaut_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.juggernaut_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.juggernaut_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.juggernaut_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Lone Druid":
                heroIcon.setImageResource(R.drawable.lone_druid_medium);
                heroName.setText(R.string.lone_druid);
                heroRole.setText(R.string.lone_druid_role);

                talent1.setText(R.string.lone_druid_talent1_text);
                talent2.setText(R.string.lone_druid_talent2_text);
                talent3.setText(R.string.lone_druid_talent3_text);
                talent4.setText(R.string.lone_druid_talent4_text);
                talent5.setText(R.string.lone_druid_talent5_text);
                talent6.setText(R.string.lone_druid_talent6_text);
                talent7.setText(R.string.lone_druid_talent7_text);
                talent8.setText(R.string.lone_druid_talent8_text);


                heroSkill1.setImageResource(R.drawable.lone_druid_skill_1);
                heroSkill2.setImageResource(R.drawable.lone_druid_skill_2);
                heroSkill3.setImageResource(R.drawable.lone_druid_skill_3);
                heroSkill4.setImageResource(R.drawable.lone_druid_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.lone_druid_skill1_name));
                strSkillName2 = (getResources().getString(R.string.lone_druid_skill2_name));
                strSkillName3 = (getResources().getString(R.string.lone_druid_skill3_name));
                strSkillName4 = (getResources().getString(R.string.lone_druid_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.lone_druid_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.lone_druid_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.lone_druid_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.lone_druid_skill4_description));

                strSkillText1 = (getResources().getString(R.string.lone_druid_skill1_text));
                strSkillText2 = (getResources().getString(R.string.lone_druid_skill2_text));
                strSkillText3 = (getResources().getString(R.string.lone_druid_skill3_text));
                strSkillText4 = (getResources().getString(R.string.lone_druid_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.lone_druid_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.lone_druid_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.lone_druid_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.lone_druid_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.lone_druid_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.lone_druid_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.lone_druid_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.lone_druid_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.lone_druid_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.lone_druid_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.lone_druid_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.lone_druid_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.lone_druid_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Luna":
                heroIcon.setImageResource(R.drawable.luna_medium);
                heroName.setText(R.string.luna);
                heroRole.setText(R.string.luna_role);

                talent1.setText(R.string.luna_talent1_text);
                talent2.setText(R.string.luna_talent2_text);
                talent3.setText(R.string.luna_talent3_text);
                talent4.setText(R.string.luna_talent4_text);
                talent5.setText(R.string.luna_talent5_text);
                talent6.setText(R.string.luna_talent6_text);
                talent7.setText(R.string.luna_talent7_text);
                talent8.setText(R.string.luna_talent8_text);


                heroSkill1.setImageResource(R.drawable.luna_skill_1);
                heroSkill2.setImageResource(R.drawable.luna_skill_2);
                heroSkill3.setImageResource(R.drawable.luna_skill_3);
                heroSkill4.setImageResource(R.drawable.luna_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.luna_skill1_name));
                strSkillName2 = (getResources().getString(R.string.luna_skill2_name));
                strSkillName3 = (getResources().getString(R.string.luna_skill3_name));
                strSkillName4 = (getResources().getString(R.string.luna_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.luna_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.luna_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.luna_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.luna_skill4_description));

                strSkillText1 = (getResources().getString(R.string.luna_skill1_text));
                strSkillText2 = (getResources().getString(R.string.luna_skill2_text));
                strSkillText3 = (getResources().getString(R.string.luna_skill3_text));
                strSkillText4 = (getResources().getString(R.string.luna_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.luna_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.luna_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.luna_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.luna_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.luna_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.luna_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.luna_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.luna_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.luna_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.luna_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.luna_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.luna_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.luna_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Medusa":
                heroIcon.setImageResource(R.drawable.medusa_medium);
                heroName.setText(R.string.medusa);
                heroRole.setText(R.string.medusa_role);

                talent1.setText(R.string.medusa_talent1_text);
                talent2.setText(R.string.medusa_talent2_text);
                talent3.setText(R.string.medusa_talent3_text);
                talent4.setText(R.string.medusa_talent4_text);
                talent5.setText(R.string.medusa_talent5_text);
                talent6.setText(R.string.medusa_talent6_text);
                talent7.setText(R.string.medusa_talent7_text);
                talent8.setText(R.string.medusa_talent8_text);


                heroSkill1.setImageResource(R.drawable.medusa_skill_1);
                heroSkill2.setImageResource(R.drawable.medusa_skill_2);
                heroSkill3.setImageResource(R.drawable.medusa_skill_3);
                heroSkill4.setImageResource(R.drawable.medusa_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.medusa_skill1_name));
                strSkillName2 = (getResources().getString(R.string.medusa_skill2_name));
                strSkillName3 = (getResources().getString(R.string.medusa_skill3_name));
                strSkillName4 = (getResources().getString(R.string.medusa_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.medusa_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.medusa_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.medusa_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.medusa_skill4_description));

                strSkillText1 = (getResources().getString(R.string.medusa_skill1_text));
                strSkillText2 = (getResources().getString(R.string.medusa_skill2_text));
                strSkillText3 = (getResources().getString(R.string.medusa_skill3_text));
                strSkillText4 = (getResources().getString(R.string.medusa_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.medusa_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.medusa_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.medusa_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.medusa_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.medusa_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.medusa_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.medusa_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.medusa_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.medusa_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.medusa_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.medusa_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.medusa_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.medusa_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Meepo":
                heroIcon.setImageResource(R.drawable.meepo_medium);
                heroName.setText(R.string.meepo);
                heroRole.setText(R.string.meepo_role);

                talent1.setText(R.string.meepo_talent1_text);
                talent2.setText(R.string.meepo_talent2_text);
                talent3.setText(R.string.meepo_talent3_text);
                talent4.setText(R.string.meepo_talent4_text);
                talent5.setText(R.string.meepo_talent5_text);
                talent6.setText(R.string.meepo_talent6_text);
                talent7.setText(R.string.meepo_talent7_text);
                talent8.setText(R.string.meepo_talent8_text);


                heroSkill1.setImageResource(R.drawable.meepo_skill_1);
                heroSkill2.setImageResource(R.drawable.meepo_skill_2);
                heroSkill3.setImageResource(R.drawable.meepo_skill_3);
                heroSkill4.setImageResource(R.drawable.meepo_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.meepo_skill1_name));
                strSkillName2 = (getResources().getString(R.string.meepo_skill2_name));
                strSkillName3 = (getResources().getString(R.string.meepo_skill3_name));
                strSkillName4 = (getResources().getString(R.string.meepo_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.meepo_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.meepo_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.meepo_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.meepo_skill4_description));

                strSkillText1 = (getResources().getString(R.string.meepo_skill1_text));
                strSkillText2 = (getResources().getString(R.string.meepo_skill2_text));
                strSkillText3 = (getResources().getString(R.string.meepo_skill3_text));
                strSkillText4 = (getResources().getString(R.string.meepo_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.meepo_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.meepo_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.meepo_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.meepo_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.meepo_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.meepo_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.meepo_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.meepo_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.meepo_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.meepo_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.meepo_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.meepo_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.meepo_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;



            case "Mirana":
                heroIcon.setImageResource(R.drawable.mirana_medium);
                heroName.setText(R.string.mirana);
                heroRole.setText(R.string.mirana_role);

                talent1.setText(R.string.mirana_talent1_text);
                talent2.setText(R.string.mirana_talent2_text);
                talent3.setText(R.string.mirana_talent3_text);
                talent4.setText(R.string.mirana_talent4_text);
                talent5.setText(R.string.mirana_talent5_text);
                talent6.setText(R.string.mirana_talent6_text);
                talent7.setText(R.string.mirana_talent7_text);
                talent8.setText(R.string.mirana_talent8_text);


                heroSkill1.setImageResource(R.drawable.mirana_skill_1);
                heroSkill2.setImageResource(R.drawable.mirana_skill_2);
                heroSkill3.setImageResource(R.drawable.mirana_skill_3);
                heroSkill4.setImageResource(R.drawable.mirana_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.mirana_skill1_name));
                strSkillName2 = (getResources().getString(R.string.mirana_skill2_name));
                strSkillName3 = (getResources().getString(R.string.mirana_skill3_name));
                strSkillName4 = (getResources().getString(R.string.mirana_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.mirana_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.mirana_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.mirana_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.mirana_skill4_description));

                strSkillText1 = (getResources().getString(R.string.mirana_skill1_text));
                strSkillText2 = (getResources().getString(R.string.mirana_skill2_text));
                strSkillText3 = (getResources().getString(R.string.mirana_skill3_text));
                strSkillText4 = (getResources().getString(R.string.mirana_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.mirana_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.mirana_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.mirana_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.mirana_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.mirana_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.mirana_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.mirana_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.mirana_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.mirana_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.mirana_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.mirana_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.mirana_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.mirana_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;




            case "Monkey King":
                heroIcon.setImageResource(R.drawable.monkey_king_medium);
                heroName.setText(R.string.monkey_king);
                heroRole.setText(R.string.monkey_king_role);

                talent1.setText(R.string.monkey_king_talent1_text);
                talent2.setText(R.string.monkey_king_talent2_text);
                talent3.setText(R.string.monkey_king_talent3_text);
                talent4.setText(R.string.monkey_king_talent4_text);
                talent5.setText(R.string.monkey_king_talent5_text);
                talent6.setText(R.string.monkey_king_talent6_text);
                talent7.setText(R.string.monkey_king_talent7_text);
                talent8.setText(R.string.monkey_king_talent8_text);


                heroSkill1.setImageResource(R.drawable.monkey_king_skill_1);
                heroSkill2.setImageResource(R.drawable.monkey_king_skill_2);
                heroSkill3.setImageResource(R.drawable.monkey_king_skill_3);
                heroSkill4.setImageResource(R.drawable.monkey_king_skill_4);
                heroSkill5.setImageResource(R.drawable.monkey_king_skill_5);
                heroSkill6.setImageResource(R.drawable.monkey_king_skill_6);
                heroSkill7.setImageResource(R.drawable.monkey_king_skill_7);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.monkey_king_skill1_name));
                strSkillName2 = (getResources().getString(R.string.monkey_king_skill2_name));
                strSkillName3 = (getResources().getString(R.string.monkey_king_skill3_name));
                strSkillName4 = (getResources().getString(R.string.monkey_king_skill4_name));
                strSkillName5 = (getResources().getString(R.string.monkey_king_skill5_name));
                strSkillName6 = (getResources().getString(R.string.monkey_king_skill6_name));
                strSkillName7 = (getResources().getString(R.string.monkey_king_skill7_name));

                strSkillDescription1 = (getResources().getString(R.string.monkey_king_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.monkey_king_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.monkey_king_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.monkey_king_skill4_description));
                strSkillDescription5 = (getResources().getString(R.string.monkey_king_skill5_description));
                strSkillDescription6 = (getResources().getString(R.string.monkey_king_skill6_description));
                strSkillDescription7 = (getResources().getString(R.string.monkey_king_skill7_description));


                strSkillText1 = (getResources().getString(R.string.monkey_king_skill1_text));
                strSkillText2 = (getResources().getString(R.string.monkey_king_skill2_text));
                strSkillText3 = (getResources().getString(R.string.monkey_king_skill3_text));
                strSkillText4 = (getResources().getString(R.string.monkey_king_skill4_text));
                strSkillText5 = (getResources().getString(R.string.monkey_king_skill5_text));
                strSkillText6 = (getResources().getString(R.string.monkey_king_skill6_text));
                strSkillText7 = (getResources().getString(R.string.monkey_king_skill7_text));

                strScepterSkillText1 = (getResources().getString(R.string.monkey_king_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.monkey_king_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.monkey_king_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.monkey_king_scepter_skill4_text));
                strScepterSkillText5 = (getResources().getString(R.string.monkey_king_scepter_skill5_text));
                strScepterSkillText6 = (getResources().getString(R.string.monkey_king_scepter_skill6_text));
                strScepterSkillText7 = (getResources().getString(R.string.monkey_king_scepter_skill7_text));

                aghanimShardAbilityText = (getResources().getString(R.string.monkey_king_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.monkey_king_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.monkey_king_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.monkey_king_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.monkey_king_skill4_cooldown));
                strSkillCooldown5 = (getResources().getString(R.string.monkey_king_skill5_cooldown));
                strSkillCooldown6 = (getResources().getString(R.string.monkey_king_skill6_cooldown));
                strSkillCooldown7 = (getResources().getString(R.string.monkey_king_skill7_cooldown));


                strSkillManacost1 = (getResources().getString(R.string.monkey_king_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.monkey_king_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.monkey_king_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.monkey_king_skill4_manacost));
                strSkillManacost5 = (getResources().getString(R.string.monkey_king_skill5_manacost));
                strSkillManacost6 = (getResources().getString(R.string.monkey_king_skill6_manacost));
                strSkillManacost7 = (getResources().getString(R.string.monkey_king_skill7_manacost));



                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Morphling":
                heroIcon.setImageResource(R.drawable.morphling_medium);
                heroName.setText(R.string.morphling);
                heroRole.setText(R.string.morphling_role);

                talent1.setText(R.string.morphling_talent1_text);
                talent2.setText(R.string.morphling_talent2_text);
                talent3.setText(R.string.morphling_talent3_text);
                talent4.setText(R.string.morphling_talent4_text);
                talent5.setText(R.string.morphling_talent5_text);
                talent6.setText(R.string.morphling_talent6_text);
                talent7.setText(R.string.morphling_talent7_text);
                talent8.setText(R.string.morphling_talent8_text);


                heroSkill1.setImageResource(R.drawable.morphling_skill_1);
                heroSkill2.setImageResource(R.drawable.morphling_skill_2);
                heroSkill3.setImageResource(R.drawable.morphling_skill_3);
                heroSkill4.setImageResource(R.drawable.morphling_skill_4);
                heroSkill5.setImageResource(R.drawable.morphling_skill_5);
                heroSkill6.setImageResource(R.drawable.morphling_skill_6);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.morphling_skill1_name));
                strSkillName2 = (getResources().getString(R.string.morphling_skill2_name));
                strSkillName3 = (getResources().getString(R.string.morphling_skill3_name));
                strSkillName4 = (getResources().getString(R.string.morphling_skill4_name));
                strSkillName5 = (getResources().getString(R.string.morphling_skill5_name));
                strSkillName6 = (getResources().getString(R.string.morphling_skill6_name));

                strSkillDescription1 = (getResources().getString(R.string.morphling_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.morphling_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.morphling_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.morphling_skill4_description));
                strSkillDescription5 = (getResources().getString(R.string.morphling_skill5_description));
                strSkillDescription6 = (getResources().getString(R.string.morphling_skill6_description));

                strSkillText1 = (getResources().getString(R.string.morphling_skill1_text));
                strSkillText2 = (getResources().getString(R.string.morphling_skill2_text));
                strSkillText3 = (getResources().getString(R.string.morphling_skill3_text));
                strSkillText4 = (getResources().getString(R.string.morphling_skill4_text));
                strSkillText5 = (getResources().getString(R.string.morphling_skill5_text));
                strSkillText6 = (getResources().getString(R.string.morphling_skill6_text));

                strScepterSkillText1 = (getResources().getString(R.string.morphling_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.morphling_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.morphling_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.morphling_scepter_skill4_text));
                strScepterSkillText5 = (getResources().getString(R.string.morphling_scepter_skill5_text));
                strScepterSkillText6 = (getResources().getString(R.string.morphling_scepter_skill6_text));

                aghanimShardAbilityText = (getResources().getString(R.string.morphling_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.morphling_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.morphling_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.morphling_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.morphling_skill4_cooldown));
                strSkillCooldown5 = (getResources().getString(R.string.morphling_skill5_cooldown));
                strSkillCooldown6 = (getResources().getString(R.string.morphling_skill6_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.morphling_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.morphling_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.morphling_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.morphling_skill4_manacost));
                strSkillManacost5 = (getResources().getString(R.string.morphling_skill5_manacost));
                strSkillManacost6 = (getResources().getString(R.string.morphling_skill6_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Naga Siren":
                heroIcon.setImageResource(R.drawable.naga_siren_medium);
                heroName.setText(R.string.naga_siren);
                heroRole.setText(R.string.naga_siren_role);

                talent1.setText(R.string.naga_siren_talent1_text);
                talent2.setText(R.string.naga_siren_talent2_text);
                talent3.setText(R.string.naga_siren_talent3_text);
                talent4.setText(R.string.naga_siren_talent4_text);
                talent5.setText(R.string.naga_siren_talent5_text);
                talent6.setText(R.string.naga_siren_talent6_text);
                talent7.setText(R.string.naga_siren_talent7_text);
                talent8.setText(R.string.naga_siren_talent8_text);


                heroSkill1.setImageResource(R.drawable.naga_siren_skill_1);
                heroSkill2.setImageResource(R.drawable.naga_siren_skill_2);
                heroSkill3.setImageResource(R.drawable.naga_siren_skill_3);
                heroSkill4.setImageResource(R.drawable.naga_siren_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.naga_siren_skill1_name));
                strSkillName2 = (getResources().getString(R.string.naga_siren_skill2_name));
                strSkillName3 = (getResources().getString(R.string.naga_siren_skill3_name));
                strSkillName4 = (getResources().getString(R.string.naga_siren_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.naga_siren_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.naga_siren_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.naga_siren_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.naga_siren_skill4_description));

                strSkillText1 = (getResources().getString(R.string.naga_siren_skill1_text));
                strSkillText2 = (getResources().getString(R.string.naga_siren_skill2_text));
                strSkillText3 = (getResources().getString(R.string.naga_siren_skill3_text));
                strSkillText4 = (getResources().getString(R.string.naga_siren_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.naga_siren_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.naga_siren_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.naga_siren_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.naga_siren_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.naga_siren_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.naga_siren_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.naga_siren_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.naga_siren_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.naga_siren_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.naga_siren_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.naga_siren_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.naga_siren_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.naga_siren_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;






            case "Nyx Assasin":
                heroIcon.setImageResource(R.drawable.nyx_assassin_medium);
                heroName.setText(R.string.nyx_assassin);
                heroRole.setText(R.string.nyx_assassin_role);

                talent1.setText(R.string.nyx_assassin_talent1_text);
                talent2.setText(R.string.nyx_assassin_talent2_text);
                talent3.setText(R.string.nyx_assassin_talent3_text);
                talent4.setText(R.string.nyx_assassin_talent4_text);
                talent5.setText(R.string.nyx_assassin_talent5_text);
                talent6.setText(R.string.nyx_assassin_talent6_text);
                talent7.setText(R.string.nyx_assassin_talent7_text);
                talent8.setText(R.string.nyx_assassin_talent8_text);


                heroSkill1.setImageResource(R.drawable.nyx_assassin_skill_1);
                heroSkill2.setImageResource(R.drawable.nyx_assassin_skill_2);
                heroSkill3.setImageResource(R.drawable.nyx_assassin_skill_3);
                heroSkill4.setImageResource(R.drawable.nyx_assassin_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.nyx_assassin_skill1_name));
                strSkillName2 = (getResources().getString(R.string.nyx_assassin_skill2_name));
                strSkillName3 = (getResources().getString(R.string.nyx_assassin_skill3_name));
                strSkillName4 = (getResources().getString(R.string.nyx_assassin_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.nyx_assassin_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.nyx_assassin_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.nyx_assassin_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.nyx_assassin_skill4_description));

                strSkillText1 = (getResources().getString(R.string.nyx_assassin_skill1_text));
                strSkillText2 = (getResources().getString(R.string.nyx_assassin_skill2_text));
                strSkillText3 = (getResources().getString(R.string.nyx_assassin_skill3_text));
                strSkillText4 = (getResources().getString(R.string.nyx_assassin_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.nyx_assassin_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.nyx_assassin_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.nyx_assassin_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.nyx_assassin_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.nyx_assassin_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.nyx_assassin_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.nyx_assassin_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.nyx_assassin_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.nyx_assassin_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.nyx_assassin_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.nyx_assassin_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.nyx_assassin_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.nyx_assassin_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Pangolier":
                heroIcon.setImageResource(R.drawable.pangolier_medium);
                heroName.setText(R.string.pangolier);
                heroRole.setText(R.string.pangolier_role);

                talent1.setText(R.string.pangolier_talent1_text);
                talent2.setText(R.string.pangolier_talent2_text);
                talent3.setText(R.string.pangolier_talent3_text);
                talent4.setText(R.string.pangolier_talent4_text);
                talent5.setText(R.string.pangolier_talent5_text);
                talent6.setText(R.string.pangolier_talent6_text);
                talent7.setText(R.string.pangolier_talent7_text);
                talent8.setText(R.string.pangolier_talent8_text);


                heroSkill1.setImageResource(R.drawable.pangolier_skill_1);
                heroSkill2.setImageResource(R.drawable.pangolier_skill_2);
                heroSkill3.setImageResource(R.drawable.pangolier_skill_3);
                heroSkill4.setImageResource(R.drawable.pangolier_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.pangolier_skill1_name));
                strSkillName2 = (getResources().getString(R.string.pangolier_skill2_name));
                strSkillName3 = (getResources().getString(R.string.pangolier_skill3_name));
                strSkillName4 = (getResources().getString(R.string.pangolier_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.pangolier_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.pangolier_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.pangolier_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.pangolier_skill4_description));

                strSkillText1 = (getResources().getString(R.string.pangolier_skill1_text));
                strSkillText2 = (getResources().getString(R.string.pangolier_skill2_text));
                strSkillText3 = (getResources().getString(R.string.pangolier_skill3_text));
                strSkillText4 = (getResources().getString(R.string.pangolier_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.pangolier_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.pangolier_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.pangolier_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.pangolier_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.pangolier_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.pangolier_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.pangolier_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.pangolier_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.pangolier_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.pangolier_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.pangolier_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.pangolier_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.pangolier_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;



            case "Phantom Assasin":
                heroIcon.setImageResource(R.drawable.phantom_assassin_medium);
                heroName.setText(R.string.phantom_assassin);
                heroRole.setText(R.string.phantom_assassin_role);

                talent1.setText(R.string.phantom_assassin_talent1_text);
                talent2.setText(R.string.phantom_assassin_talent2_text);
                talent3.setText(R.string.phantom_assassin_talent3_text);
                talent4.setText(R.string.phantom_assassin_talent4_text);
                talent5.setText(R.string.phantom_assassin_talent5_text);
                talent6.setText(R.string.phantom_assassin_talent6_text);
                talent7.setText(R.string.phantom_assassin_talent7_text);
                talent8.setText(R.string.phantom_assassin_talent8_text);


                heroSkill1.setImageResource(R.drawable.phantom_assassin_skill_1);
                heroSkill2.setImageResource(R.drawable.phantom_assassin_skill_2);
                heroSkill3.setImageResource(R.drawable.phantom_assassin_skill_3);
                heroSkill4.setImageResource(R.drawable.phantom_assassin_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.phantom_assassin_skill1_name));
                strSkillName2 = (getResources().getString(R.string.phantom_assassin_skill2_name));
                strSkillName3 = (getResources().getString(R.string.phantom_assassin_skill3_name));
                strSkillName4 = (getResources().getString(R.string.phantom_assassin_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.phantom_assassin_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.phantom_assassin_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.phantom_assassin_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.phantom_assassin_skill4_description));

                strSkillText1 = (getResources().getString(R.string.phantom_assassin_skill1_text));
                strSkillText2 = (getResources().getString(R.string.phantom_assassin_skill2_text));
                strSkillText3 = (getResources().getString(R.string.phantom_assassin_skill3_text));
                strSkillText4 = (getResources().getString(R.string.phantom_assassin_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.phantom_assassin_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.phantom_assassin_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.phantom_assassin_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.phantom_assassin_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.phantom_assassin_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.phantom_assassin_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.phantom_assassin_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.phantom_assassin_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.phantom_assassin_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.phantom_assassin_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.phantom_assassin_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.phantom_assassin_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.phantom_assassin_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;






            case "Phantom Lancer":
                heroIcon.setImageResource(R.drawable.phantom_lancer_medium);
                heroName.setText(R.string.phantom_lancer);
                heroRole.setText(R.string.phantom_lancer_role);

                talent1.setText(R.string.phantom_lancer_talent1_text);
                talent2.setText(R.string.phantom_lancer_talent2_text);
                talent3.setText(R.string.phantom_lancer_talent3_text);
                talent4.setText(R.string.phantom_lancer_talent4_text);
                talent5.setText(R.string.phantom_lancer_talent5_text);
                talent6.setText(R.string.phantom_lancer_talent6_text);
                talent7.setText(R.string.phantom_lancer_talent7_text);
                talent8.setText(R.string.phantom_lancer_talent8_text);


                heroSkill1.setImageResource(R.drawable.phantom_lancer_skill_1);
                heroSkill2.setImageResource(R.drawable.phantom_lancer_skill_2);
                heroSkill3.setImageResource(R.drawable.phantom_lancer_skill_3);
                heroSkill4.setImageResource(R.drawable.phantom_lancer_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.phantom_lancer_skill1_name));
                strSkillName2 = (getResources().getString(R.string.phantom_lancer_skill2_name));
                strSkillName3 = (getResources().getString(R.string.phantom_lancer_skill3_name));
                strSkillName4 = (getResources().getString(R.string.phantom_lancer_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.phantom_lancer_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.phantom_lancer_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.phantom_lancer_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.phantom_lancer_skill4_description));

                strSkillText1 = (getResources().getString(R.string.phantom_lancer_skill1_text));
                strSkillText2 = (getResources().getString(R.string.phantom_lancer_skill2_text));
                strSkillText3 = (getResources().getString(R.string.phantom_lancer_skill3_text));
                strSkillText4 = (getResources().getString(R.string.phantom_lancer_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.phantom_lancer_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.phantom_lancer_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.phantom_lancer_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.phantom_lancer_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.phantom_lancer_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.phantom_lancer_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.phantom_lancer_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.phantom_lancer_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.phantom_lancer_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.phantom_lancer_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.phantom_lancer_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.phantom_lancer_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.phantom_lancer_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;






            case "Razor":
                heroIcon.setImageResource(R.drawable.razor_medium);
                heroName.setText(R.string.razor);
                heroRole.setText(R.string.razor_role);

                talent1.setText(R.string.razor_talent1_text);
                talent2.setText(R.string.razor_talent2_text);
                talent3.setText(R.string.razor_talent3_text);
                talent4.setText(R.string.razor_talent4_text);
                talent5.setText(R.string.razor_talent5_text);
                talent6.setText(R.string.razor_talent6_text);
                talent7.setText(R.string.razor_talent7_text);
                talent8.setText(R.string.razor_talent8_text);


                heroSkill1.setImageResource(R.drawable.razor_skill_1);
                heroSkill2.setImageResource(R.drawable.razor_skill_2);
                heroSkill3.setImageResource(R.drawable.razor_skill_3);
                heroSkill4.setImageResource(R.drawable.razor_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.razor_skill1_name));
                strSkillName2 = (getResources().getString(R.string.razor_skill2_name));
                strSkillName3 = (getResources().getString(R.string.razor_skill3_name));
                strSkillName4 = (getResources().getString(R.string.razor_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.razor_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.razor_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.razor_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.razor_skill4_description));

                strSkillText1 = (getResources().getString(R.string.razor_skill1_text));
                strSkillText2 = (getResources().getString(R.string.razor_skill2_text));
                strSkillText3 = (getResources().getString(R.string.razor_skill3_text));
                strSkillText4 = (getResources().getString(R.string.razor_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.razor_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.razor_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.razor_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.razor_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.razor_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.razor_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.razor_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.razor_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.razor_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.razor_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.razor_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.razor_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.razor_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Riki":
                heroIcon.setImageResource(R.drawable.riki_medium);
                heroName.setText(R.string.riki);
                heroRole.setText(R.string.riki_role);

                talent1.setText(R.string.riki_talent1_text);
                talent2.setText(R.string.riki_talent2_text);
                talent3.setText(R.string.riki_talent3_text);
                talent4.setText(R.string.riki_talent4_text);
                talent5.setText(R.string.riki_talent5_text);
                talent6.setText(R.string.riki_talent6_text);
                talent7.setText(R.string.riki_talent7_text);
                talent8.setText(R.string.riki_talent8_text);


                heroSkill1.setImageResource(R.drawable.riki_skill_1);
                heroSkill2.setImageResource(R.drawable.riki_skill_2);
                heroSkill3.setImageResource(R.drawable.riki_skill_3);
                heroSkill4.setImageResource(R.drawable.riki_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.riki_skill1_name));
                strSkillName2 = (getResources().getString(R.string.riki_skill2_name));
                strSkillName3 = (getResources().getString(R.string.riki_skill3_name));
                strSkillName4 = (getResources().getString(R.string.riki_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.riki_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.riki_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.riki_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.riki_skill4_description));

                strSkillText1 = (getResources().getString(R.string.riki_skill1_text));
                strSkillText2 = (getResources().getString(R.string.riki_skill2_text));
                strSkillText3 = (getResources().getString(R.string.riki_skill3_text));
                strSkillText4 = (getResources().getString(R.string.riki_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.riki_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.riki_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.riki_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.riki_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.riki_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.riki_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.riki_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.riki_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.riki_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.riki_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.riki_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.riki_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.riki_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Shadow Fiend":
                heroIcon.setImageResource(R.drawable.shadow_fiend_medium);
                heroName.setText(R.string.shadow_fiend);
                heroRole.setText(R.string.shadow_fiend_role);

                talent1.setText(R.string.shadow_fiend_talent1_text);
                talent2.setText(R.string.shadow_fiend_talent2_text);
                talent3.setText(R.string.shadow_fiend_talent3_text);
                talent4.setText(R.string.shadow_fiend_talent4_text);
                talent5.setText(R.string.shadow_fiend_talent5_text);
                talent6.setText(R.string.shadow_fiend_talent6_text);
                talent7.setText(R.string.shadow_fiend_talent7_text);
                talent8.setText(R.string.shadow_fiend_talent8_text);


                heroSkill1.setImageResource(R.drawable.shadow_fiend_skill_1);
                heroSkill2.setImageResource(R.drawable.shadow_fiend_skill_2);
                heroSkill3.setImageResource(R.drawable.shadow_fiend_skill_3);
                heroSkill4.setImageResource(R.drawable.shadow_fiend_skill_4);
                heroSkill5.setImageResource(R.drawable.shadow_fiend_skill_5);
                heroSkill6.setImageResource(R.drawable.shadow_fiend_skill_6);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.shadow_fiend_skill1_name));
                strSkillName2 = (getResources().getString(R.string.shadow_fiend_skill2_name));
                strSkillName3 = (getResources().getString(R.string.shadow_fiend_skill3_name));
                strSkillName4 = (getResources().getString(R.string.shadow_fiend_skill4_name));
                strSkillName5 = (getResources().getString(R.string.shadow_fiend_skill5_name));
                strSkillName6 = (getResources().getString(R.string.shadow_fiend_skill6_name));

                strSkillDescription1 = (getResources().getString(R.string.shadow_fiend_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.shadow_fiend_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.shadow_fiend_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.shadow_fiend_skill4_description));
                strSkillDescription5 = (getResources().getString(R.string.shadow_fiend_skill5_description));
                strSkillDescription6 = (getResources().getString(R.string.shadow_fiend_skill6_description));

                strSkillText1 = (getResources().getString(R.string.shadow_fiend_skill1_text));
                strSkillText2 = (getResources().getString(R.string.shadow_fiend_skill2_text));
                strSkillText3 = (getResources().getString(R.string.shadow_fiend_skill3_text));
                strSkillText4 = (getResources().getString(R.string.shadow_fiend_skill4_text));
                strSkillText5 = (getResources().getString(R.string.shadow_fiend_skill5_text));
                strSkillText6 = (getResources().getString(R.string.shadow_fiend_skill6_text));

                strScepterSkillText1 = (getResources().getString(R.string.shadow_fiend_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.shadow_fiend_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.shadow_fiend_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.shadow_fiend_scepter_skill4_text));
                strScepterSkillText5 = (getResources().getString(R.string.shadow_fiend_scepter_skill5_text));
                strScepterSkillText6 = (getResources().getString(R.string.shadow_fiend_scepter_skill6_text));

                aghanimShardAbilityText = (getResources().getString(R.string.shadow_fiend_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.shadow_fiend_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.shadow_fiend_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.shadow_fiend_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.shadow_fiend_skill4_cooldown));
                strSkillCooldown5 = (getResources().getString(R.string.shadow_fiend_skill5_cooldown));
                strSkillCooldown6 = (getResources().getString(R.string.shadow_fiend_skill6_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.shadow_fiend_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.shadow_fiend_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.shadow_fiend_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.shadow_fiend_skill4_manacost));
                strSkillManacost5 = (getResources().getString(R.string.shadow_fiend_skill5_manacost));
                strSkillManacost6 = (getResources().getString(R.string.shadow_fiend_skill6_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Slark":
                heroIcon.setImageResource(R.drawable.slark_medium);
                heroName.setText(R.string.slark);
                heroRole.setText(R.string.slark_role);

                talent1.setText(R.string.slark_talent1_text);
                talent2.setText(R.string.slark_talent2_text);
                talent3.setText(R.string.slark_talent3_text);
                talent4.setText(R.string.slark_talent4_text);
                talent5.setText(R.string.slark_talent5_text);
                talent6.setText(R.string.slark_talent6_text);
                talent7.setText(R.string.slark_talent7_text);
                talent8.setText(R.string.slark_talent8_text);


                heroSkill1.setImageResource(R.drawable.slark_skill_1);
                heroSkill2.setImageResource(R.drawable.slark_skill_2);
                heroSkill3.setImageResource(R.drawable.slark_skill_3);
                heroSkill4.setImageResource(R.drawable.slark_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.slark_skill1_name));
                strSkillName2 = (getResources().getString(R.string.slark_skill2_name));
                strSkillName3 = (getResources().getString(R.string.slark_skill3_name));
                strSkillName4 = (getResources().getString(R.string.slark_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.slark_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.slark_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.slark_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.slark_skill4_description));

                strSkillText1 = (getResources().getString(R.string.slark_skill1_text));
                strSkillText2 = (getResources().getString(R.string.slark_skill2_text));
                strSkillText3 = (getResources().getString(R.string.slark_skill3_text));
                strSkillText4 = (getResources().getString(R.string.slark_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.slark_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.slark_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.slark_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.slark_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.slark_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.slark_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.slark_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.slark_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.slark_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.slark_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.slark_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.slark_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.slark_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Sniper":
                heroIcon.setImageResource(R.drawable.sniper_medium);
                heroName.setText(R.string.sniper);
                heroRole.setText(R.string.sniper_role);

                talent1.setText(R.string.sniper_talent1_text);
                talent2.setText(R.string.sniper_talent2_text);
                talent3.setText(R.string.sniper_talent3_text);
                talent4.setText(R.string.sniper_talent4_text);
                talent5.setText(R.string.sniper_talent5_text);
                talent6.setText(R.string.sniper_talent6_text);
                talent7.setText(R.string.sniper_talent7_text);
                talent8.setText(R.string.sniper_talent8_text);


                heroSkill1.setImageResource(R.drawable.sniper_skill_1);
                heroSkill2.setImageResource(R.drawable.sniper_skill_2);
                heroSkill3.setImageResource(R.drawable.sniper_skill_3);
                heroSkill4.setImageResource(R.drawable.sniper_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.sniper_skill1_name));
                strSkillName2 = (getResources().getString(R.string.sniper_skill2_name));
                strSkillName3 = (getResources().getString(R.string.sniper_skill3_name));
                strSkillName4 = (getResources().getString(R.string.sniper_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.sniper_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.sniper_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.sniper_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.sniper_skill4_description));

                strSkillText1 = (getResources().getString(R.string.sniper_skill1_text));
                strSkillText2 = (getResources().getString(R.string.sniper_skill2_text));
                strSkillText3 = (getResources().getString(R.string.sniper_skill3_text));
                strSkillText4 = (getResources().getString(R.string.sniper_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.sniper_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.sniper_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.sniper_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.sniper_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.sniper_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.sniper_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.sniper_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.sniper_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.sniper_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.sniper_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.sniper_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.sniper_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.sniper_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Spectre":
                heroIcon.setImageResource(R.drawable.spectre_medium);
                heroName.setText(R.string.spectre);
                heroRole.setText(R.string.spectre_role);

                talent1.setText(R.string.spectre_talent1_text);
                talent2.setText(R.string.spectre_talent2_text);
                talent3.setText(R.string.spectre_talent3_text);
                talent4.setText(R.string.spectre_talent4_text);
                talent5.setText(R.string.spectre_talent5_text);
                talent6.setText(R.string.spectre_talent6_text);
                talent7.setText(R.string.spectre_talent7_text);
                talent8.setText(R.string.spectre_talent8_text);


                heroSkill1.setImageResource(R.drawable.spectre_skill_1);
                heroSkill2.setImageResource(R.drawable.spectre_skill_2);
                heroSkill3.setImageResource(R.drawable.spectre_skill_3);
                heroSkill4.setImageResource(R.drawable.spectre_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.spectre_skill1_name));
                strSkillName2 = (getResources().getString(R.string.spectre_skill2_name));
                strSkillName3 = (getResources().getString(R.string.spectre_skill3_name));
                strSkillName4 = (getResources().getString(R.string.spectre_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.spectre_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.spectre_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.spectre_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.spectre_skill4_description));

                strSkillText1 = (getResources().getString(R.string.spectre_skill1_text));
                strSkillText2 = (getResources().getString(R.string.spectre_skill2_text));
                strSkillText3 = (getResources().getString(R.string.spectre_skill3_text));
                strSkillText4 = (getResources().getString(R.string.spectre_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.spectre_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.spectre_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.spectre_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.spectre_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.spectre_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.spectre_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.spectre_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.spectre_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.spectre_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.spectre_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.spectre_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.spectre_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.spectre_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Templar Assasin":
                heroIcon.setImageResource(R.drawable.templar_assasin_medium);
                heroName.setText(R.string.templar_assassin);
                heroRole.setText(R.string.templar_assassin_role);

                talent1.setText(R.string.templar_assassin_talent1_text);
                talent2.setText(R.string.templar_assassin_talent2_text);
                talent3.setText(R.string.templar_assassin_talent3_text);
                talent4.setText(R.string.templar_assassin_talent4_text);
                talent5.setText(R.string.templar_assassin_talent5_text);
                talent6.setText(R.string.templar_assassin_talent6_text);
                talent7.setText(R.string.templar_assassin_talent7_text);
                talent8.setText(R.string.templar_assassin_talent8_text);


                heroSkill1.setImageResource(R.drawable.templar_assassin_skill_1);
                heroSkill2.setImageResource(R.drawable.templar_assassin_skill_2);
                heroSkill3.setImageResource(R.drawable.templar_assassin_skill_3);
                heroSkill4.setImageResource(R.drawable.templar_assassin_skill_4);
                heroSkill5.setImageResource(R.drawable.templar_assassin_skill_5);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.templar_assassin_skill1_name));
                strSkillName2 = (getResources().getString(R.string.templar_assassin_skill2_name));
                strSkillName3 = (getResources().getString(R.string.templar_assassin_skill3_name));
                strSkillName4 = (getResources().getString(R.string.templar_assassin_skill4_name));
                strSkillName5 = (getResources().getString(R.string.templar_assassin_skill5_name));

                strSkillDescription1 = (getResources().getString(R.string.templar_assassin_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.templar_assassin_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.templar_assassin_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.templar_assassin_skill4_description));
                strSkillDescription5 = (getResources().getString(R.string.templar_assassin_skill5_description));

                strSkillText1 = (getResources().getString(R.string.templar_assassin_skill1_text));
                strSkillText2 = (getResources().getString(R.string.templar_assassin_skill2_text));
                strSkillText3 = (getResources().getString(R.string.templar_assassin_skill3_text));
                strSkillText4 = (getResources().getString(R.string.templar_assassin_skill4_text));
                strSkillText5 = (getResources().getString(R.string.templar_assassin_skill5_text));

                strScepterSkillText1 = (getResources().getString(R.string.templar_assassin_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.templar_assassin_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.templar_assassin_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.templar_assassin_scepter_skill4_text));
                strScepterSkillText5 = (getResources().getString(R.string.templar_assassin_scepter_skill5_text));


                strSkillCooldown1 = (getResources().getString(R.string.templar_assassin_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.templar_assassin_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.templar_assassin_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.templar_assassin_skill4_cooldown));
                strSkillCooldown5 = (getResources().getString(R.string.templar_assassin_skill5_cooldown));

                aghanimShardAbilityText = (getResources().getString(R.string.templar_assassin_aghanims_shard_ability_text));

                strSkillManacost1 = (getResources().getString(R.string.templar_assassin_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.templar_assassin_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.templar_assassin_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.templar_assassin_skill4_manacost));
                strSkillManacost5 = (getResources().getString(R.string.templar_assassin_skill5_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Terrorblade":
                heroIcon.setImageResource(R.drawable.terrorblade_medium);
                heroName.setText(R.string.terrorblade);
                heroRole.setText(R.string.terrorblade_role);

                talent1.setText(R.string.terrorblade_talent1_text);
                talent2.setText(R.string.terrorblade_talent2_text);
                talent3.setText(R.string.terrorblade_talent3_text);
                talent4.setText(R.string.terrorblade_talent4_text);
                talent5.setText(R.string.terrorblade_talent5_text);
                talent6.setText(R.string.terrorblade_talent6_text);
                talent7.setText(R.string.terrorblade_talent7_text);
                talent8.setText(R.string.terrorblade_talent8_text);


                heroSkill1.setImageResource(R.drawable.terrorblade_skill_1);
                heroSkill2.setImageResource(R.drawable.terrorblade_skill_2);
                heroSkill3.setImageResource(R.drawable.terrorblade_skill_3);
                heroSkill4.setImageResource(R.drawable.terrorblade_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.terrorblade_skill1_name));
                strSkillName2 = (getResources().getString(R.string.terrorblade_skill2_name));
                strSkillName3 = (getResources().getString(R.string.terrorblade_skill3_name));
                strSkillName4 = (getResources().getString(R.string.terrorblade_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.terrorblade_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.terrorblade_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.terrorblade_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.terrorblade_skill4_description));

                strSkillText1 = (getResources().getString(R.string.terrorblade_skill1_text));
                strSkillText2 = (getResources().getString(R.string.terrorblade_skill2_text));
                strSkillText3 = (getResources().getString(R.string.terrorblade_skill3_text));
                strSkillText4 = (getResources().getString(R.string.terrorblade_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.terrorblade_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.terrorblade_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.terrorblade_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.terrorblade_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.terrorblade_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.terrorblade_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.terrorblade_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.terrorblade_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.terrorblade_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.terrorblade_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.terrorblade_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.terrorblade_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.terrorblade_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Troll Warlord":
                heroIcon.setImageResource(R.drawable.troll_warlord_medium);
                heroName.setText(R.string.troll_warlord);
                heroRole.setText(R.string.troll_warlord_role);

                talent1.setText(R.string.troll_warlord_talent1_text);
                talent2.setText(R.string.troll_warlord_talent2_text);
                talent3.setText(R.string.troll_warlord_talent3_text);
                talent4.setText(R.string.troll_warlord_talent4_text);
                talent5.setText(R.string.troll_warlord_talent5_text);
                talent6.setText(R.string.troll_warlord_talent6_text);
                talent7.setText(R.string.troll_warlord_talent7_text);
                talent8.setText(R.string.troll_warlord_talent8_text);


                heroSkill1.setImageResource(R.drawable.troll_warlord_skill_1);
                heroSkill2.setImageResource(R.drawable.troll_warlord_skill_2);
                heroSkill3.setImageResource(R.drawable.troll_warlord_skill_3);
                heroSkill4.setImageResource(R.drawable.troll_warlord_skill_4);
                heroSkill5.setImageResource(R.drawable.troll_warlord_skill_5);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.troll_warlord_skill1_name));
                strSkillName2 = (getResources().getString(R.string.troll_warlord_skill2_name));
                strSkillName3 = (getResources().getString(R.string.troll_warlord_skill3_name));
                strSkillName4 = (getResources().getString(R.string.troll_warlord_skill4_name));
                strSkillName5 = (getResources().getString(R.string.troll_warlord_skill5_name));

                strSkillDescription1 = (getResources().getString(R.string.troll_warlord_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.troll_warlord_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.troll_warlord_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.troll_warlord_skill4_description));
                strSkillDescription5 = (getResources().getString(R.string.troll_warlord_skill5_description));

                strSkillText1 = (getResources().getString(R.string.troll_warlord_skill1_text));
                strSkillText2 = (getResources().getString(R.string.troll_warlord_skill2_text));
                strSkillText3 = (getResources().getString(R.string.troll_warlord_skill3_text));
                strSkillText4 = (getResources().getString(R.string.troll_warlord_skill4_text));
                strSkillText5 = (getResources().getString(R.string.troll_warlord_skill5_text));

                strScepterSkillText1 = (getResources().getString(R.string.troll_warlord_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.troll_warlord_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.troll_warlord_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.troll_warlord_scepter_skill4_text));
                strScepterSkillText5 = (getResources().getString(R.string.troll_warlord_scepter_skill5_text));

                aghanimShardAbilityText = (getResources().getString(R.string.troll_warlord_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.troll_warlord_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.troll_warlord_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.troll_warlord_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.troll_warlord_skill4_cooldown));
                strSkillCooldown5 = (getResources().getString(R.string.troll_warlord_skill5_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.troll_warlord_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.troll_warlord_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.troll_warlord_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.troll_warlord_skill4_manacost));
                strSkillManacost5 = (getResources().getString(R.string.troll_warlord_skill5_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Ursa":
                heroIcon.setImageResource(R.drawable.ursa_medium);
                heroName.setText(R.string.ursa);
                heroRole.setText(R.string.ursa_role);

                talent1.setText(R.string.ursa_talent1_text);
                talent2.setText(R.string.ursa_talent2_text);
                talent3.setText(R.string.ursa_talent3_text);
                talent4.setText(R.string.ursa_talent4_text);
                talent5.setText(R.string.ursa_talent5_text);
                talent6.setText(R.string.ursa_talent6_text);
                talent7.setText(R.string.ursa_talent7_text);
                talent8.setText(R.string.ursa_talent8_text);


                heroSkill1.setImageResource(R.drawable.ursa_skill_1);
                heroSkill2.setImageResource(R.drawable.ursa_skill_2);
                heroSkill3.setImageResource(R.drawable.ursa_skill_3);
                heroSkill4.setImageResource(R.drawable.ursa_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.ursa_skill1_name));
                strSkillName2 = (getResources().getString(R.string.ursa_skill2_name));
                strSkillName3 = (getResources().getString(R.string.ursa_skill3_name));
                strSkillName4 = (getResources().getString(R.string.ursa_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.ursa_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.ursa_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.ursa_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.ursa_skill4_description));

                strSkillText1 = (getResources().getString(R.string.ursa_skill1_text));
                strSkillText2 = (getResources().getString(R.string.ursa_skill2_text));
                strSkillText3 = (getResources().getString(R.string.ursa_skill3_text));
                strSkillText4 = (getResources().getString(R.string.ursa_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.ursa_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.ursa_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.ursa_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.ursa_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.ursa_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.ursa_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.ursa_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.ursa_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.ursa_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.ursa_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.ursa_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.ursa_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.ursa_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;

            case "Vengeful Spirit":
                heroIcon.setImageResource(R.drawable.vengeful_spirit_medium);
                heroName.setText(R.string.vengeful_spirit);
                heroRole.setText(R.string.vengeful_spirit_role);

                talent1.setText(R.string.vengeful_spirit_talent1_text);
                talent2.setText(R.string.vengeful_spirit_talent2_text);
                talent3.setText(R.string.vengeful_spirit_talent3_text);
                talent4.setText(R.string.vengeful_spirit_talent4_text);
                talent5.setText(R.string.vengeful_spirit_talent5_text);
                talent6.setText(R.string.vengeful_spirit_talent6_text);
                talent7.setText(R.string.vengeful_spirit_talent7_text);
                talent8.setText(R.string.vengeful_spirit_talent8_text);


                heroSkill1.setImageResource(R.drawable.vengeful_spirit_skill_1);
                heroSkill2.setImageResource(R.drawable.vengeful_spirit_skill_2);
                heroSkill3.setImageResource(R.drawable.vengeful_spirit_skill_3);
                heroSkill4.setImageResource(R.drawable.vengeful_spirit_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.vengeful_spirit_skill1_name));
                strSkillName2 = (getResources().getString(R.string.vengeful_spirit_skill2_name));
                strSkillName3 = (getResources().getString(R.string.vengeful_spirit_skill3_name));
                strSkillName4 = (getResources().getString(R.string.vengeful_spirit_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.vengeful_spirit_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.vengeful_spirit_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.vengeful_spirit_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.vengeful_spirit_skill4_description));

                strSkillText1 = (getResources().getString(R.string.vengeful_spirit_skill1_text));
                strSkillText2 = (getResources().getString(R.string.vengeful_spirit_skill2_text));
                strSkillText3 = (getResources().getString(R.string.vengeful_spirit_skill3_text));
                strSkillText4 = (getResources().getString(R.string.vengeful_spirit_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.vengeful_spirit_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.vengeful_spirit_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.vengeful_spirit_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.vengeful_spirit_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.vengeful_spirit_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.vengeful_spirit_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.vengeful_spirit_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.vengeful_spirit_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.vengeful_spirit_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.vengeful_spirit_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.vengeful_spirit_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.vengeful_spirit_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.vengeful_spirit_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Venomancer":
                heroIcon.setImageResource(R.drawable.venomancer_medium);
                heroName.setText(R.string.venomancer);
                heroRole.setText(R.string.venomancer_role);

                talent1.setText(R.string.venomancer_talent1_text);
                talent2.setText(R.string.venomancer_talent2_text);
                talent3.setText(R.string.venomancer_talent3_text);
                talent4.setText(R.string.venomancer_talent4_text);
                talent5.setText(R.string.venomancer_talent5_text);
                talent6.setText(R.string.venomancer_talent6_text);
                talent7.setText(R.string.venomancer_talent7_text);
                talent8.setText(R.string.venomancer_talent8_text);


                heroSkill1.setImageResource(R.drawable.venomancer_skill_1);
                heroSkill2.setImageResource(R.drawable.venomancer_skill_2);
                heroSkill3.setImageResource(R.drawable.venomancer_skill_3);
                heroSkill4.setImageResource(R.drawable.venomancer_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.venomancer_skill1_name));
                strSkillName2 = (getResources().getString(R.string.venomancer_skill2_name));
                strSkillName3 = (getResources().getString(R.string.venomancer_skill3_name));
                strSkillName4 = (getResources().getString(R.string.venomancer_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.venomancer_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.venomancer_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.venomancer_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.venomancer_skill4_description));

                strSkillText1 = (getResources().getString(R.string.venomancer_skill1_text));
                strSkillText2 = (getResources().getString(R.string.venomancer_skill2_text));
                strSkillText3 = (getResources().getString(R.string.venomancer_skill3_text));
                strSkillText4 = (getResources().getString(R.string.venomancer_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.venomancer_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.venomancer_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.venomancer_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.venomancer_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.venomancer_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.venomancer_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.venomancer_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.venomancer_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.venomancer_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.venomancer_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.venomancer_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.venomancer_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.venomancer_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Viper":
                heroIcon.setImageResource(R.drawable.viper_medium);
                heroName.setText(R.string.viper);
                heroRole.setText(R.string.viper_role);

                talent1.setText(R.string.viper_talent1_text);
                talent2.setText(R.string.viper_talent2_text);
                talent3.setText(R.string.viper_talent3_text);
                talent4.setText(R.string.viper_talent4_text);
                talent5.setText(R.string.viper_talent5_text);
                talent6.setText(R.string.viper_talent6_text);
                talent7.setText(R.string.viper_talent7_text);
                talent8.setText(R.string.viper_talent8_text);


                heroSkill1.setImageResource(R.drawable.viper_skill_1);
                heroSkill2.setImageResource(R.drawable.viper_skill_2);
                heroSkill3.setImageResource(R.drawable.viper_skill_3);
                heroSkill4.setImageResource(R.drawable.viper_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.viper_skill1_name));
                strSkillName2 = (getResources().getString(R.string.viper_skill2_name));
                strSkillName3 = (getResources().getString(R.string.viper_skill3_name));
                strSkillName4 = (getResources().getString(R.string.viper_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.viper_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.viper_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.viper_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.viper_skill4_description));

                strSkillText1 = (getResources().getString(R.string.viper_skill1_text));
                strSkillText2 = (getResources().getString(R.string.viper_skill2_text));
                strSkillText3 = (getResources().getString(R.string.viper_skill3_text));
                strSkillText4 = (getResources().getString(R.string.viper_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.viper_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.viper_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.viper_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.viper_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.viper_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.viper_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.viper_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.viper_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.viper_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.viper_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.viper_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.viper_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.viper_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Weaver":
                heroIcon.setImageResource(R.drawable.weaver_medium);
                heroName.setText(R.string.weaver);
                heroRole.setText(R.string.weaver_role);

                talent1.setText(R.string.weaver_talent1_text);
                talent2.setText(R.string.weaver_talent2_text);
                talent3.setText(R.string.weaver_talent3_text);
                talent4.setText(R.string.weaver_talent4_text);
                talent5.setText(R.string.weaver_talent5_text);
                talent6.setText(R.string.weaver_talent6_text);
                talent7.setText(R.string.weaver_talent7_text);
                talent8.setText(R.string.weaver_talent8_text);


                heroSkill1.setImageResource(R.drawable.weaver_skill_1);
                heroSkill2.setImageResource(R.drawable.weaver_skill_2);
                heroSkill3.setImageResource(R.drawable.weaver_skill_3);
                heroSkill4.setImageResource(R.drawable.weaver_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.weaver_skill1_name));
                strSkillName2 = (getResources().getString(R.string.weaver_skill2_name));
                strSkillName3 = (getResources().getString(R.string.weaver_skill3_name));
                strSkillName4 = (getResources().getString(R.string.weaver_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.weaver_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.weaver_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.weaver_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.weaver_skill4_description));

                strSkillText1 = (getResources().getString(R.string.weaver_skill1_text));
                strSkillText2 = (getResources().getString(R.string.weaver_skill2_text));
                strSkillText3 = (getResources().getString(R.string.weaver_skill3_text));
                strSkillText4 = (getResources().getString(R.string.weaver_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.weaver_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.weaver_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.weaver_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.weaver_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.weaver_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.weaver_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.weaver_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.weaver_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.weaver_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.weaver_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.weaver_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.weaver_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.weaver_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
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
                heroIcon.setImageResource(R.drawable.ancient_apparition_medium);
                heroName.setText(R.string.ancient_apparition);
                heroRole.setText(R.string.ancient_apparition_role);

                talent1.setText(R.string.ancient_apparition_talent1_text);
                talent2.setText(R.string.ancient_apparition_talent2_text);
                talent3.setText(R.string.ancient_apparition_talent3_text);
                talent4.setText(R.string.ancient_apparition_talent4_text);
                talent5.setText(R.string.ancient_apparition_talent5_text);
                talent6.setText(R.string.ancient_apparition_talent6_text);
                talent7.setText(R.string.ancient_apparition_talent7_text);
                talent8.setText(R.string.ancient_apparition_talent8_text);


                heroSkill1.setImageResource(R.drawable.ancient_apparition_skill_1);
                heroSkill2.setImageResource(R.drawable.ancient_apparition_skill_2);
                heroSkill3.setImageResource(R.drawable.ancient_apparition_skill_3);
                heroSkill4.setImageResource(R.drawable.ancient_apparition_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.ancient_apparition_skill1_name));
                strSkillName2 = (getResources().getString(R.string.ancient_apparition_skill2_name));
                strSkillName3 = (getResources().getString(R.string.ancient_apparition_skill3_name));
                strSkillName4 = (getResources().getString(R.string.ancient_apparition_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.ancient_apparition_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.ancient_apparition_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.ancient_apparition_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.ancient_apparition_skill4_description));

                strSkillText1 = (getResources().getString(R.string.ancient_apparition_skill1_text));
                strSkillText2 = (getResources().getString(R.string.ancient_apparition_skill2_text));
                strSkillText3 = (getResources().getString(R.string.ancient_apparition_skill3_text));
                strSkillText4 = (getResources().getString(R.string.ancient_apparition_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.ancient_apparition_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.ancient_apparition_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.ancient_apparition_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.ancient_apparition_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.ancient_apparition_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.ancient_apparition_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.ancient_apparition_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.ancient_apparition_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.ancient_apparition_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.ancient_apparition_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.ancient_apparition_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.ancient_apparition_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.ancient_apparition_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Bane":
                heroIcon.setImageResource(R.drawable.bane_medium);
                heroName.setText(R.string.bane);
                heroRole.setText(R.string.bane_role);

                talent1.setText(R.string.bane_talent1_text);
                talent2.setText(R.string.bane_talent2_text);
                talent3.setText(R.string.bane_talent3_text);
                talent4.setText(R.string.bane_talent4_text);
                talent5.setText(R.string.bane_talent5_text);
                talent6.setText(R.string.bane_talent6_text);
                talent7.setText(R.string.bane_talent7_text);
                talent8.setText(R.string.bane_talent8_text);


                heroSkill1.setImageResource(R.drawable.bane_skill_1);
                heroSkill2.setImageResource(R.drawable.bane_skill_2);
                heroSkill3.setImageResource(R.drawable.bane_skill_3);
                heroSkill4.setImageResource(R.drawable.bane_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.bane_skill1_name));
                strSkillName2 = (getResources().getString(R.string.bane_skill2_name));
                strSkillName3 = (getResources().getString(R.string.bane_skill3_name));
                strSkillName4 = (getResources().getString(R.string.bane_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.bane_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.bane_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.bane_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.bane_skill4_description));

                strSkillText1 = (getResources().getString(R.string.bane_skill1_text));
                strSkillText2 = (getResources().getString(R.string.bane_skill2_text));
                strSkillText3 = (getResources().getString(R.string.bane_skill3_text));
                strSkillText4 = (getResources().getString(R.string.bane_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.bane_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.bane_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.bane_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.bane_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.bane_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.bane_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.bane_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.bane_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.bane_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.bane_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.bane_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.bane_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.bane_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Batrider":
                heroIcon.setImageResource(R.drawable.batrider_medium);
                heroName.setText(R.string.batrider);
                heroRole.setText(R.string.batrider_role);

                talent1.setText(R.string.batrider_talent1_text);
                talent2.setText(R.string.batrider_talent2_text);
                talent3.setText(R.string.batrider_talent3_text);
                talent4.setText(R.string.batrider_talent4_text);
                talent5.setText(R.string.batrider_talent5_text);
                talent6.setText(R.string.batrider_talent6_text);
                talent7.setText(R.string.batrider_talent7_text);
                talent8.setText(R.string.batrider_talent8_text);


                heroSkill1.setImageResource(R.drawable.batrider_skill_1);
                heroSkill2.setImageResource(R.drawable.batrider_skill_2);
                heroSkill3.setImageResource(R.drawable.batrider_skill_3);
                heroSkill4.setImageResource(R.drawable.batrider_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.batrider_skill1_name));
                strSkillName2 = (getResources().getString(R.string.batrider_skill2_name));
                strSkillName3 = (getResources().getString(R.string.batrider_skill3_name));
                strSkillName4 = (getResources().getString(R.string.batrider_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.batrider_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.batrider_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.batrider_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.batrider_skill4_description));

                strSkillText1 = (getResources().getString(R.string.batrider_skill1_text));
                strSkillText2 = (getResources().getString(R.string.batrider_skill2_text));
                strSkillText3 = (getResources().getString(R.string.batrider_skill3_text));
                strSkillText4 = (getResources().getString(R.string.batrider_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.batrider_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.batrider_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.batrider_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.batrider_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.batrider_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.batrider_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.batrider_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.batrider_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.batrider_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.batrider_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.batrider_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.batrider_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.batrider_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Chen":
                heroIcon.setImageResource(R.drawable.chen_medium);
                heroName.setText(R.string.chen);
                heroRole.setText(R.string.chen_role);

                talent1.setText(R.string.chen_talent1_text);
                talent2.setText(R.string.chen_talent2_text);
                talent3.setText(R.string.chen_talent3_text);
                talent4.setText(R.string.chen_talent4_text);
                talent5.setText(R.string.chen_talent5_text);
                talent6.setText(R.string.chen_talent6_text);
                talent7.setText(R.string.chen_talent7_text);
                talent8.setText(R.string.chen_talent8_text);


                heroSkill1.setImageResource(R.drawable.chen_skill_1);
                heroSkill2.setImageResource(R.drawable.chen_skill_2);
                heroSkill3.setImageResource(R.drawable.chen_skill_3);
                heroSkill4.setImageResource(R.drawable.chen_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.chen_skill1_name));
                strSkillName2 = (getResources().getString(R.string.chen_skill2_name));
                strSkillName3 = (getResources().getString(R.string.chen_skill3_name));
                strSkillName4 = (getResources().getString(R.string.chen_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.chen_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.chen_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.chen_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.chen_skill4_description));

                strSkillText1 = (getResources().getString(R.string.chen_skill1_text));
                strSkillText2 = (getResources().getString(R.string.chen_skill2_text));
                strSkillText3 = (getResources().getString(R.string.chen_skill3_text));
                strSkillText4 = (getResources().getString(R.string.chen_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.chen_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.chen_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.chen_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.chen_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.chen_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.chen_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.chen_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.chen_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.chen_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.chen_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.chen_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.chen_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.chen_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Crystal Maiden":
                heroIcon.setImageResource(R.drawable.crystal_maiden_medium);
                heroName.setText(R.string.crystal_maiden);
                heroRole.setText(R.string.crystal_maiden_role);

                talent1.setText(R.string.crystal_maiden_talent1_text);
                talent2.setText(R.string.crystal_maiden_talent2_text);
                talent3.setText(R.string.crystal_maiden_talent3_text);
                talent4.setText(R.string.crystal_maiden_talent4_text);
                talent5.setText(R.string.crystal_maiden_talent5_text);
                talent6.setText(R.string.crystal_maiden_talent6_text);
                talent7.setText(R.string.crystal_maiden_talent7_text);
                talent8.setText(R.string.crystal_maiden_talent8_text);


                heroSkill1.setImageResource(R.drawable.crystal_maiden_skill_1);
                heroSkill2.setImageResource(R.drawable.crystal_maiden_skill_2);
                heroSkill3.setImageResource(R.drawable.crystal_maiden_skill_3);
                heroSkill4.setImageResource(R.drawable.crystal_maiden_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.crystal_maiden_skill1_name));
                strSkillName2 = (getResources().getString(R.string.crystal_maiden_skill2_name));
                strSkillName3 = (getResources().getString(R.string.crystal_maiden_skill3_name));
                strSkillName4 = (getResources().getString(R.string.crystal_maiden_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.crystal_maiden_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.crystal_maiden_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.crystal_maiden_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.crystal_maiden_skill4_description));

                strSkillText1 = (getResources().getString(R.string.crystal_maiden_skill1_text));
                strSkillText2 = (getResources().getString(R.string.crystal_maiden_skill2_text));
                strSkillText3 = (getResources().getString(R.string.crystal_maiden_skill3_text));
                strSkillText4 = (getResources().getString(R.string.crystal_maiden_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.crystal_maiden_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.crystal_maiden_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.crystal_maiden_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.crystal_maiden_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.crystal_maiden_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.crystal_maiden_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.crystal_maiden_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.crystal_maiden_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.crystal_maiden_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.crystal_maiden_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.crystal_maiden_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.crystal_maiden_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.crystal_maiden_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Dark Seer":
                heroIcon.setImageResource(R.drawable.dark_seer_medium);
                heroName.setText(R.string.dark_seer);
                heroRole.setText(R.string.dark_seer_role);

                talent1.setText(R.string.dark_seer_talent1_text);
                talent2.setText(R.string.dark_seer_talent2_text);
                talent3.setText(R.string.dark_seer_talent3_text);
                talent4.setText(R.string.dark_seer_talent4_text);
                talent5.setText(R.string.dark_seer_talent5_text);
                talent6.setText(R.string.dark_seer_talent6_text);
                talent7.setText(R.string.dark_seer_talent7_text);
                talent8.setText(R.string.dark_seer_talent8_text);


                heroSkill1.setImageResource(R.drawable.dark_seer_skill_1);
                heroSkill2.setImageResource(R.drawable.dark_seer_skill_2);
                heroSkill3.setImageResource(R.drawable.dark_seer_skill_3);
                heroSkill4.setImageResource(R.drawable.dark_seer_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.dark_seer_skill1_name));
                strSkillName2 = (getResources().getString(R.string.dark_seer_skill2_name));
                strSkillName3 = (getResources().getString(R.string.dark_seer_skill3_name));
                strSkillName4 = (getResources().getString(R.string.dark_seer_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.dark_seer_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.dark_seer_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.dark_seer_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.dark_seer_skill4_description));

                strSkillText1 = (getResources().getString(R.string.dark_seer_skill1_text));
                strSkillText2 = (getResources().getString(R.string.dark_seer_skill2_text));
                strSkillText3 = (getResources().getString(R.string.dark_seer_skill3_text));
                strSkillText4 = (getResources().getString(R.string.dark_seer_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.dark_seer_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.dark_seer_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.dark_seer_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.dark_seer_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.dark_seer_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.dark_seer_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.dark_seer_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.dark_seer_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.dark_seer_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.dark_seer_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.dark_seer_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.dark_seer_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.dark_seer_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Dark Willow":
                heroIcon.setImageResource(R.drawable.dark_willow_medium);
                heroName.setText(R.string.dark_willow);
                heroRole.setText(R.string.dark_willow_role);

                talent1.setText(R.string.dark_willow_talent1_text);
                talent2.setText(R.string.dark_willow_talent2_text);
                talent3.setText(R.string.dark_willow_talent3_text);
                talent4.setText(R.string.dark_willow_talent4_text);
                talent5.setText(R.string.dark_willow_talent5_text);
                talent6.setText(R.string.dark_willow_talent6_text);
                talent7.setText(R.string.dark_willow_talent7_text);
                talent8.setText(R.string.dark_willow_talent8_text);


                heroSkill1.setImageResource(R.drawable.dark_willow_skill_1);
                heroSkill2.setImageResource(R.drawable.dark_willow_skill_2);
                heroSkill3.setImageResource(R.drawable.dark_willow_skill_3);
                heroSkill4.setImageResource(R.drawable.dark_willow_skill_4);
                heroSkill5.setImageResource(R.drawable.dark_willow_skill_5);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.dark_willow_skill1_name));
                strSkillName2 = (getResources().getString(R.string.dark_willow_skill2_name));
                strSkillName3 = (getResources().getString(R.string.dark_willow_skill3_name));
                strSkillName4 = (getResources().getString(R.string.dark_willow_skill4_name));
                strSkillName5 = (getResources().getString(R.string.dark_willow_skill5_name));

                strSkillDescription1 = (getResources().getString(R.string.dark_willow_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.dark_willow_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.dark_willow_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.dark_willow_skill4_description));
                strSkillDescription5 = (getResources().getString(R.string.dark_willow_skill5_description));

                strSkillText1 = (getResources().getString(R.string.dark_willow_skill1_text));
                strSkillText2 = (getResources().getString(R.string.dark_willow_skill2_text));
                strSkillText3 = (getResources().getString(R.string.dark_willow_skill3_text));
                strSkillText4 = (getResources().getString(R.string.dark_willow_skill4_text));
                strSkillText5 = (getResources().getString(R.string.dark_willow_skill5_text));

                strScepterSkillText1 = (getResources().getString(R.string.dark_willow_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.dark_willow_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.dark_willow_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.dark_willow_scepter_skill4_text));
                strScepterSkillText5 = (getResources().getString(R.string.dark_willow_scepter_skill5_text));

                aghanimShardAbilityText = (getResources().getString(R.string.dark_willow_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.dark_willow_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.dark_willow_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.dark_willow_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.dark_willow_skill4_cooldown));
                strSkillCooldown5 = (getResources().getString(R.string.dark_willow_skill5_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.dark_willow_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.dark_willow_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.dark_willow_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.dark_willow_skill4_manacost));
                strSkillManacost5 = (getResources().getString(R.string.dark_willow_skill5_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Dazzle":
                heroIcon.setImageResource(R.drawable.dazzle_medium);
                heroName.setText(R.string.dazzle);
                heroRole.setText(R.string.dazzle_role);

                talent1.setText(R.string.dazzle_talent1_text);
                talent2.setText(R.string.dazzle_talent2_text);
                talent3.setText(R.string.dazzle_talent3_text);
                talent4.setText(R.string.dazzle_talent4_text);
                talent5.setText(R.string.dazzle_talent5_text);
                talent6.setText(R.string.dazzle_talent6_text);
                talent7.setText(R.string.dazzle_talent7_text);
                talent8.setText(R.string.dazzle_talent8_text);


                heroSkill1.setImageResource(R.drawable.dazzle_skill_1);
                heroSkill2.setImageResource(R.drawable.dazzle_skill_2);
                heroSkill3.setImageResource(R.drawable.dazzle_skill_3);
                heroSkill4.setImageResource(R.drawable.dazzle_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.dazzle_skill1_name));
                strSkillName2 = (getResources().getString(R.string.dazzle_skill2_name));
                strSkillName3 = (getResources().getString(R.string.dazzle_skill3_name));
                strSkillName4 = (getResources().getString(R.string.dazzle_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.dazzle_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.dazzle_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.dazzle_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.dazzle_skill4_description));

                strSkillText1 = (getResources().getString(R.string.dazzle_skill1_text));
                strSkillText2 = (getResources().getString(R.string.dazzle_skill2_text));
                strSkillText3 = (getResources().getString(R.string.dazzle_skill3_text));
                strSkillText4 = (getResources().getString(R.string.dazzle_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.dazzle_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.dazzle_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.dazzle_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.dazzle_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.dazzle_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.dazzle_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.dazzle_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.dazzle_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.dazzle_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.dazzle_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.dazzle_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.dazzle_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.dazzle_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Death Prophet":
                heroIcon.setImageResource(R.drawable.death_prophet_medium);
                heroName.setText(R.string.death_prophet);
                heroRole.setText(R.string.death_prophet_role);

                talent1.setText(R.string.death_prophet_talent1_text);
                talent2.setText(R.string.death_prophet_talent2_text);
                talent3.setText(R.string.death_prophet_talent3_text);
                talent4.setText(R.string.death_prophet_talent4_text);
                talent5.setText(R.string.death_prophet_talent5_text);
                talent6.setText(R.string.death_prophet_talent6_text);
                talent7.setText(R.string.death_prophet_talent7_text);
                talent8.setText(R.string.death_prophet_talent8_text);


                heroSkill1.setImageResource(R.drawable.death_prophet_skill_1);
                heroSkill2.setImageResource(R.drawable.death_prophet_skill_2);
                heroSkill3.setImageResource(R.drawable.death_prophet_skill_3);
                heroSkill4.setImageResource(R.drawable.death_prophet_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.death_prophet_skill1_name));
                strSkillName2 = (getResources().getString(R.string.death_prophet_skill2_name));
                strSkillName3 = (getResources().getString(R.string.death_prophet_skill3_name));
                strSkillName4 = (getResources().getString(R.string.death_prophet_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.death_prophet_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.death_prophet_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.death_prophet_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.death_prophet_skill4_description));

                strSkillText1 = (getResources().getString(R.string.death_prophet_skill1_text));
                strSkillText2 = (getResources().getString(R.string.death_prophet_skill2_text));
                strSkillText3 = (getResources().getString(R.string.death_prophet_skill3_text));
                strSkillText4 = (getResources().getString(R.string.death_prophet_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.death_prophet_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.death_prophet_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.death_prophet_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.death_prophet_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.death_prophet_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.death_prophet_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.death_prophet_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.death_prophet_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.death_prophet_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.death_prophet_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.death_prophet_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.death_prophet_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.death_prophet_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Disruptor":
                heroIcon.setImageResource(R.drawable.disruptor_medium);
                heroName.setText(R.string.disruptor);
                heroRole.setText(R.string.disruptor_role);

                talent1.setText(R.string.disruptor_talent1_text);
                talent2.setText(R.string.disruptor_talent2_text);
                talent3.setText(R.string.disruptor_talent3_text);
                talent4.setText(R.string.disruptor_talent4_text);
                talent5.setText(R.string.disruptor_talent5_text);
                talent6.setText(R.string.disruptor_talent6_text);
                talent7.setText(R.string.disruptor_talent7_text);
                talent8.setText(R.string.disruptor_talent8_text);


                heroSkill1.setImageResource(R.drawable.disruptor_skill_1);
                heroSkill2.setImageResource(R.drawable.disruptor_skill_2);
                heroSkill3.setImageResource(R.drawable.disruptor_skill_3);
                heroSkill4.setImageResource(R.drawable.disruptor_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.disruptor_skill1_name));
                strSkillName2 = (getResources().getString(R.string.disruptor_skill2_name));
                strSkillName3 = (getResources().getString(R.string.disruptor_skill3_name));
                strSkillName4 = (getResources().getString(R.string.disruptor_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.disruptor_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.disruptor_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.disruptor_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.disruptor_skill4_description));

                strSkillText1 = (getResources().getString(R.string.disruptor_skill1_text));
                strSkillText2 = (getResources().getString(R.string.disruptor_skill2_text));
                strSkillText3 = (getResources().getString(R.string.disruptor_skill3_text));
                strSkillText4 = (getResources().getString(R.string.disruptor_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.disruptor_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.disruptor_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.disruptor_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.disruptor_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.disruptor_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.disruptor_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.disruptor_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.disruptor_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.disruptor_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.disruptor_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.disruptor_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.disruptor_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.disruptor_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Enchantress":
                heroIcon.setImageResource(R.drawable.enchantress_medium);
                heroName.setText(R.string.enchantress);
                heroRole.setText(R.string.enchantress_role);

                talent1.setText(R.string.enchantress_talent1_text);
                talent2.setText(R.string.enchantress_talent2_text);
                talent3.setText(R.string.enchantress_talent3_text);
                talent4.setText(R.string.enchantress_talent4_text);
                talent5.setText(R.string.enchantress_talent5_text);
                talent6.setText(R.string.enchantress_talent6_text);
                talent7.setText(R.string.enchantress_talent7_text);
                talent8.setText(R.string.enchantress_talent8_text);


                heroSkill1.setImageResource(R.drawable.enchantress_skill_1);
                heroSkill2.setImageResource(R.drawable.enchantress_skill_2);
                heroSkill3.setImageResource(R.drawable.enchantress_skill_3);
                heroSkill4.setImageResource(R.drawable.enchantress_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.enchantress_skill1_name));
                strSkillName2 = (getResources().getString(R.string.enchantress_skill2_name));
                strSkillName3 = (getResources().getString(R.string.enchantress_skill3_name));
                strSkillName4 = (getResources().getString(R.string.enchantress_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.enchantress_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.enchantress_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.enchantress_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.enchantress_skill4_description));

                strSkillText1 = (getResources().getString(R.string.enchantress_skill1_text));
                strSkillText2 = (getResources().getString(R.string.enchantress_skill2_text));
                strSkillText3 = (getResources().getString(R.string.enchantress_skill3_text));
                strSkillText4 = (getResources().getString(R.string.enchantress_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.enchantress_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.enchantress_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.enchantress_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.enchantress_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.enchantress_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.enchantress_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.enchantress_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.enchantress_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.enchantress_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.enchantress_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.enchantress_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.enchantress_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.enchantress_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;



            case "Enigma":
                heroIcon.setImageResource(R.drawable.enigma_medium);
                heroName.setText(R.string.enigma);
                heroRole.setText(R.string.enigma_role);

                talent1.setText(R.string.enigma_talent1_text);
                talent2.setText(R.string.enigma_talent2_text);
                talent3.setText(R.string.enigma_talent3_text);
                talent4.setText(R.string.enigma_talent4_text);
                talent5.setText(R.string.enigma_talent5_text);
                talent6.setText(R.string.enigma_talent6_text);
                talent7.setText(R.string.enigma_talent7_text);
                talent8.setText(R.string.enigma_talent8_text);


                heroSkill1.setImageResource(R.drawable.enigma_skill_1);
                heroSkill2.setImageResource(R.drawable.enigma_skill_2);
                heroSkill3.setImageResource(R.drawable.enigma_skill_3);
                heroSkill4.setImageResource(R.drawable.enigma_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.enigma_skill1_name));
                strSkillName2 = (getResources().getString(R.string.enigma_skill2_name));
                strSkillName3 = (getResources().getString(R.string.enigma_skill3_name));
                strSkillName4 = (getResources().getString(R.string.enigma_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.enigma_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.enigma_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.enigma_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.enigma_skill4_description));

                strSkillText1 = (getResources().getString(R.string.enigma_skill1_text));
                strSkillText2 = (getResources().getString(R.string.enigma_skill2_text));
                strSkillText3 = (getResources().getString(R.string.enigma_skill3_text));
                strSkillText4 = (getResources().getString(R.string.enigma_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.enigma_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.enigma_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.enigma_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.enigma_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.enigma_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.enigma_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.enigma_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.enigma_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.enigma_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.enigma_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.enigma_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.enigma_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.enigma_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;


            case "Grimstroke":
                heroIcon.setImageResource(R.drawable.grimstroke_medium);
                heroName.setText(R.string.grimstroke);
                heroRole.setText(R.string.grimstroke_role);

                talent1.setText(R.string.grimstroke_talent1_text);
                talent2.setText(R.string.grimstroke_talent2_text);
                talent3.setText(R.string.grimstroke_talent3_text);
                talent4.setText(R.string.grimstroke_talent4_text);
                talent5.setText(R.string.grimstroke_talent5_text);
                talent6.setText(R.string.grimstroke_talent6_text);
                talent7.setText(R.string.grimstroke_talent7_text);
                talent8.setText(R.string.grimstroke_talent8_text);


                heroSkill1.setImageResource(R.drawable.grimstroke_skill_1);
                heroSkill2.setImageResource(R.drawable.grimstroke_skill_2);
                heroSkill3.setImageResource(R.drawable.grimstroke_skill_3);
                heroSkill4.setImageResource(R.drawable.grimstroke_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.grimstroke_skill1_name));
                strSkillName2 = (getResources().getString(R.string.grimstroke_skill2_name));
                strSkillName3 = (getResources().getString(R.string.grimstroke_skill3_name));
                strSkillName4 = (getResources().getString(R.string.grimstroke_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.grimstroke_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.grimstroke_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.grimstroke_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.grimstroke_skill4_description));

                strSkillText1 = (getResources().getString(R.string.grimstroke_skill1_text));
                strSkillText2 = (getResources().getString(R.string.grimstroke_skill2_text));
                strSkillText3 = (getResources().getString(R.string.grimstroke_skill3_text));
                strSkillText4 = (getResources().getString(R.string.grimstroke_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.grimstroke_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.grimstroke_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.grimstroke_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.grimstroke_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.grimstroke_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.grimstroke_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.grimstroke_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.grimstroke_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.grimstroke_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.grimstroke_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.grimstroke_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.grimstroke_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.grimstroke_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;



            case "Invoker":
                heroIcon.setImageResource(R.drawable.invoker_medium);
                heroName.setText(R.string.invoker);
                heroRole.setText(R.string.invoker_role);

                talent1.setText(R.string.invoker_talent1_text);
                talent2.setText(R.string.invoker_talent2_text);
                talent3.setText(R.string.invoker_talent3_text);
                talent4.setText(R.string.invoker_talent4_text);
                talent5.setText(R.string.invoker_talent5_text);
                talent6.setText(R.string.invoker_talent6_text);
                talent7.setText(R.string.invoker_talent7_text);
                talent8.setText(R.string.invoker_talent8_text);


                heroSkill1.setImageResource(R.drawable.invoker_skill_1);
                heroSkill2.setImageResource(R.drawable.invoker_skill_2);
                heroSkill3.setImageResource(R.drawable.invoker_skill_3);
                heroSkill4.setImageResource(R.drawable.invoker_skill_4);
                heroSkill5.setImageResource(R.drawable.invoker_skill_5);
                heroSkill6.setImageResource(R.drawable.invoker_skill_6);
                heroSkill7.setImageResource(R.drawable.invoker_skill_7);
                heroSkill8.setImageResource(R.drawable.invoker_skill_8);
                heroSkill9.setImageResource(R.drawable.invoker_skill_9);
                heroSkill10.setImageResource(R.drawable.invoker_skill_10);
                heroSkill11.setImageResource(R.drawable.invoker_skill_11);
                heroSkill12.setImageResource(R.drawable.invoker_skill_12);
                heroSkill13.setImageResource(R.drawable.invoker_skill_13);
                heroSkill14.setImageResource(R.drawable.invoker_skill_14);

                strSkillName1 = (getResources().getString(R.string.invoker_skill1_name));
                strSkillName2 = (getResources().getString(R.string.invoker_skill2_name));
                strSkillName3 = (getResources().getString(R.string.invoker_skill3_name));
                strSkillName4 = (getResources().getString(R.string.invoker_skill4_name));
                strSkillName5 = (getResources().getString(R.string.invoker_skill5_name));
                strSkillName6 = (getResources().getString(R.string.invoker_skill6_name));
                strSkillName7 = (getResources().getString(R.string.invoker_skill7_name));
                strSkillName8 = (getResources().getString(R.string.invoker_skill8_name));
                strSkillName9 = (getResources().getString(R.string.invoker_skill9_name));
                strSkillName10 = (getResources().getString(R.string.invoker_skill10_name));
                strSkillName11 = (getResources().getString(R.string.invoker_skill11_name));
                strSkillName12 = (getResources().getString(R.string.invoker_skill12_name));
                strSkillName13 = (getResources().getString(R.string.invoker_skill13_name));
                strSkillName14 = (getResources().getString(R.string.invoker_skill14_name));

                strSkillDescription1 = (getResources().getString(R.string.invoker_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.invoker_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.invoker_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.invoker_skill4_description));
                strSkillDescription5 = (getResources().getString(R.string.invoker_skill5_description));
                strSkillDescription6 = (getResources().getString(R.string.invoker_skill6_description));
                strSkillDescription7 = (getResources().getString(R.string.invoker_skill7_description));
                strSkillDescription8 = (getResources().getString(R.string.invoker_skill8_description));
                strSkillDescription9 = (getResources().getString(R.string.invoker_skill9_description));
                strSkillDescription10 = (getResources().getString(R.string.invoker_skill10_description));
                strSkillDescription11 = (getResources().getString(R.string.invoker_skill11_description));
                strSkillDescription12 = (getResources().getString(R.string.invoker_skill12_description));
                strSkillDescription13 = (getResources().getString(R.string.invoker_skill13_description));
                strSkillDescription14 = (getResources().getString(R.string.invoker_skill14_description));

                strSkillText1 = (getResources().getString(R.string.invoker_skill1_text));
                strSkillText2 = (getResources().getString(R.string.invoker_skill2_text));
                strSkillText3 = (getResources().getString(R.string.invoker_skill3_text));
                strSkillText4 = (getResources().getString(R.string.invoker_skill4_text));
                strSkillText5 = (getResources().getString(R.string.invoker_skill5_text));
                strSkillText6 = (getResources().getString(R.string.invoker_skill6_text));
                strSkillText7 = (getResources().getString(R.string.invoker_skill7_text));
                strSkillText8 = (getResources().getString(R.string.invoker_skill8_text));
                strSkillText9 = (getResources().getString(R.string.invoker_skill9_text));
                strSkillText10 = (getResources().getString(R.string.invoker_skill10_text));
                strSkillText11 = (getResources().getString(R.string.invoker_skill11_text));
                strSkillText12 = (getResources().getString(R.string.invoker_skill12_text));
                strSkillText13 = (getResources().getString(R.string.invoker_skill13_text));
                strSkillText14 = (getResources().getString(R.string.invoker_skill14_text));

                strScepterSkillText1 = (getResources().getString(R.string.invoker_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.invoker_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.invoker_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.invoker_scepter_skill4_text));
                strScepterSkillText5 = (getResources().getString(R.string.invoker_scepter_skill5_text));
                strScepterSkillText6 = (getResources().getString(R.string.invoker_scepter_skill6_text));
                strScepterSkillText7 = (getResources().getString(R.string.invoker_scepter_skill7_text));
                strScepterSkillText8 = (getResources().getString(R.string.invoker_scepter_skill8_text));
                strScepterSkillText9 = (getResources().getString(R.string.invoker_scepter_skill9_text));
                strScepterSkillText10 = (getResources().getString(R.string.invoker_scepter_skill10_text));
                strScepterSkillText11 = (getResources().getString(R.string.invoker_scepter_skill11_text));
                strScepterSkillText12 = (getResources().getString(R.string.invoker_scepter_skill12_text));
                strScepterSkillText13 = (getResources().getString(R.string.invoker_scepter_skill13_text));
                strScepterSkillText14 = (getResources().getString(R.string.invoker_scepter_skill14_text));

                aghanimShardAbilityText = (getResources().getString(R.string.invoker_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.invoker_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.invoker_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.invoker_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.invoker_skill4_cooldown));
                strSkillCooldown5 = (getResources().getString(R.string.invoker_skill5_cooldown));
                strSkillCooldown6 = (getResources().getString(R.string.invoker_skill6_cooldown));
                strSkillCooldown7 = (getResources().getString(R.string.invoker_skill7_cooldown));
                strSkillCooldown8 = (getResources().getString(R.string.invoker_skill8_cooldown));
                strSkillCooldown9 = (getResources().getString(R.string.invoker_skill9_cooldown));
                strSkillCooldown10 = (getResources().getString(R.string.invoker_skill10_cooldown));
                strSkillCooldown11 = (getResources().getString(R.string.invoker_skill11_cooldown));
                strSkillCooldown12 = (getResources().getString(R.string.invoker_skill12_cooldown));
                strSkillCooldown13 = (getResources().getString(R.string.invoker_skill13_cooldown));
                strSkillCooldown14 = (getResources().getString(R.string.invoker_skill14_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.invoker_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.invoker_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.invoker_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.invoker_skill4_manacost));
                strSkillManacost5 = (getResources().getString(R.string.invoker_skill5_manacost));
                strSkillManacost6 = (getResources().getString(R.string.invoker_skill6_manacost));
                strSkillManacost7 = (getResources().getString(R.string.invoker_skill7_manacost));
                strSkillManacost8 = (getResources().getString(R.string.invoker_skill8_manacost));
                strSkillManacost9 = (getResources().getString(R.string.invoker_skill9_manacost));
                strSkillManacost10 = (getResources().getString(R.string.invoker_skill10_manacost));
                strSkillManacost11 = (getResources().getString(R.string.invoker_skill11_manacost));
                strSkillManacost12 = (getResources().getString(R.string.invoker_skill12_manacost));
                strSkillManacost13 = (getResources().getString(R.string.invoker_skill13_manacost));
                strSkillManacost14 = (getResources().getString(R.string.invoker_skill14_manacost));



                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;




            case "Jakiro":
                heroIcon.setImageResource(R.drawable.jakiro_medium);
                heroName.setText(R.string.jakiro);
                heroRole.setText(R.string.jakiro_role);

                talent1.setText(R.string.jakiro_talent1_text);
                talent2.setText(R.string.jakiro_talent2_text);
                talent3.setText(R.string.jakiro_talent3_text);
                talent4.setText(R.string.jakiro_talent4_text);
                talent5.setText(R.string.jakiro_talent5_text);
                talent6.setText(R.string.jakiro_talent6_text);
                talent7.setText(R.string.jakiro_talent7_text);
                talent8.setText(R.string.jakiro_talent8_text);


                heroSkill1.setImageResource(R.drawable.jakiro_skill_1);
                heroSkill2.setImageResource(R.drawable.jakiro_skill_2);
                heroSkill3.setImageResource(R.drawable.jakiro_skill_3);
                heroSkill4.setImageResource(R.drawable.jakiro_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.jakiro_skill1_name));
                strSkillName2 = (getResources().getString(R.string.jakiro_skill2_name));
                strSkillName3 = (getResources().getString(R.string.jakiro_skill3_name));
                strSkillName4 = (getResources().getString(R.string.jakiro_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.jakiro_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.jakiro_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.jakiro_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.jakiro_skill4_description));

                strSkillText1 = (getResources().getString(R.string.jakiro_skill1_text));
                strSkillText2 = (getResources().getString(R.string.jakiro_skill2_text));
                strSkillText3 = (getResources().getString(R.string.jakiro_skill3_text));
                strSkillText4 = (getResources().getString(R.string.jakiro_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.jakiro_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.jakiro_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.jakiro_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.jakiro_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.jakiro_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.jakiro_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.jakiro_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.jakiro_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.jakiro_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.jakiro_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.jakiro_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.jakiro_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.jakiro_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;




            case "Keeper Of The Light":
                heroIcon.setImageResource(R.drawable.keeper_of_the_light_medium);
                heroName.setText(R.string.keeper_of_the_light);
                heroRole.setText(R.string.keeper_of_the_light_role);

                talent1.setText(R.string.keeper_of_the_light_talent1_text);
                talent2.setText(R.string.keeper_of_the_light_talent2_text);
                talent3.setText(R.string.keeper_of_the_light_talent3_text);
                talent4.setText(R.string.keeper_of_the_light_talent4_text);
                talent5.setText(R.string.keeper_of_the_light_talent5_text);
                talent6.setText(R.string.keeper_of_the_light_talent6_text);
                talent7.setText(R.string.keeper_of_the_light_talent7_text);
                talent8.setText(R.string.keeper_of_the_light_talent8_text);


                heroSkill1.setImageResource(R.drawable.keeper_of_the_light_skill_1);
                heroSkill2.setImageResource(R.drawable.keeper_of_the_light_skill_2);
                heroSkill3.setImageResource(R.drawable.keeper_of_the_light_skill_3);
                heroSkill4.setImageResource(R.drawable.keeper_of_the_light_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.keeper_of_the_light_skill1_name));
                strSkillName2 = (getResources().getString(R.string.keeper_of_the_light_skill2_name));
                strSkillName3 = (getResources().getString(R.string.keeper_of_the_light_skill3_name));
                strSkillName4 = (getResources().getString(R.string.keeper_of_the_light_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.keeper_of_the_light_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.keeper_of_the_light_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.keeper_of_the_light_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.keeper_of_the_light_skill4_description));

                strSkillText1 = (getResources().getString(R.string.keeper_of_the_light_skill1_text));
                strSkillText2 = (getResources().getString(R.string.keeper_of_the_light_skill2_text));
                strSkillText3 = (getResources().getString(R.string.keeper_of_the_light_skill3_text));
                strSkillText4 = (getResources().getString(R.string.keeper_of_the_light_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.keeper_of_the_light_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.keeper_of_the_light_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.keeper_of_the_light_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.keeper_of_the_light_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.keeper_of_the_light_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.keeper_of_the_light_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.keeper_of_the_light_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.keeper_of_the_light_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.keeper_of_the_light_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.keeper_of_the_light_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.keeper_of_the_light_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.keeper_of_the_light_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.keeper_of_the_light_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Leshrac":
                heroIcon.setImageResource(R.drawable.leshrac_medium);
                heroName.setText(R.string.leshrac);
                heroRole.setText(R.string.leshrac_role);

                talent1.setText(R.string.leshrac_talent1_text);
                talent2.setText(R.string.leshrac_talent2_text);
                talent3.setText(R.string.leshrac_talent3_text);
                talent4.setText(R.string.leshrac_talent4_text);
                talent5.setText(R.string.leshrac_talent5_text);
                talent6.setText(R.string.leshrac_talent6_text);
                talent7.setText(R.string.leshrac_talent7_text);
                talent8.setText(R.string.leshrac_talent8_text);


                heroSkill1.setImageResource(R.drawable.leshrac_skill_1);
                heroSkill2.setImageResource(R.drawable.leshrac_skill_2);
                heroSkill3.setImageResource(R.drawable.leshrac_skill_3);
                heroSkill4.setImageResource(R.drawable.leshrac_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.leshrac_skill1_name));
                strSkillName2 = (getResources().getString(R.string.leshrac_skill2_name));
                strSkillName3 = (getResources().getString(R.string.leshrac_skill3_name));
                strSkillName4 = (getResources().getString(R.string.leshrac_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.leshrac_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.leshrac_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.leshrac_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.leshrac_skill4_description));

                strSkillText1 = (getResources().getString(R.string.leshrac_skill1_text));
                strSkillText2 = (getResources().getString(R.string.leshrac_skill2_text));
                strSkillText3 = (getResources().getString(R.string.leshrac_skill3_text));
                strSkillText4 = (getResources().getString(R.string.leshrac_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.leshrac_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.leshrac_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.leshrac_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.leshrac_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.leshrac_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.leshrac_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.leshrac_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.leshrac_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.leshrac_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.leshrac_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.leshrac_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.leshrac_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.leshrac_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Lich":
                heroIcon.setImageResource(R.drawable.lich_medium);
                heroName.setText(R.string.lich);
                heroRole.setText(R.string.lich_role);

                talent1.setText(R.string.lich_talent1_text);
                talent2.setText(R.string.lich_talent2_text);
                talent3.setText(R.string.lich_talent3_text);
                talent4.setText(R.string.lich_talent4_text);
                talent5.setText(R.string.lich_talent5_text);
                talent6.setText(R.string.lich_talent6_text);
                talent7.setText(R.string.lich_talent7_text);
                talent8.setText(R.string.lich_talent8_text);


                heroSkill1.setImageResource(R.drawable.lich_skill_1);
                heroSkill2.setImageResource(R.drawable.lich_skill_2);
                heroSkill3.setImageResource(R.drawable.lich_skill_3);
                heroSkill4.setImageResource(R.drawable.lich_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.lich_skill1_name));
                strSkillName2 = (getResources().getString(R.string.lich_skill2_name));
                strSkillName3 = (getResources().getString(R.string.lich_skill3_name));
                strSkillName4 = (getResources().getString(R.string.lich_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.lich_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.lich_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.lich_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.lich_skill4_description));

                strSkillText1 = (getResources().getString(R.string.lich_skill1_text));
                strSkillText2 = (getResources().getString(R.string.lich_skill2_text));
                strSkillText3 = (getResources().getString(R.string.lich_skill3_text));
                strSkillText4 = (getResources().getString(R.string.lich_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.lich_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.lich_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.lich_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.lich_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.lich_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.lich_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.lich_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.lich_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.lich_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.lich_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.lich_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.lich_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.lich_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;



            case "Lina":
                heroIcon.setImageResource(R.drawable.lina_medium);
                heroName.setText(R.string.lina);
                heroRole.setText(R.string.lina_role);

                talent1.setText(R.string.lina_talent1_text);
                talent2.setText(R.string.lina_talent2_text);
                talent3.setText(R.string.lina_talent3_text);
                talent4.setText(R.string.lina_talent4_text);
                talent5.setText(R.string.lina_talent5_text);
                talent6.setText(R.string.lina_talent6_text);
                talent7.setText(R.string.lina_talent7_text);
                talent8.setText(R.string.lina_talent8_text);


                heroSkill1.setImageResource(R.drawable.lina_skill_1);
                heroSkill2.setImageResource(R.drawable.lina_skill_2);
                heroSkill3.setImageResource(R.drawable.lina_skill_3);
                heroSkill4.setImageResource(R.drawable.lina_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.lina_skill1_name));
                strSkillName2 = (getResources().getString(R.string.lina_skill2_name));
                strSkillName3 = (getResources().getString(R.string.lina_skill3_name));
                strSkillName4 = (getResources().getString(R.string.lina_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.lina_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.lina_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.lina_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.lina_skill4_description));

                strSkillText1 = (getResources().getString(R.string.lina_skill1_text));
                strSkillText2 = (getResources().getString(R.string.lina_skill2_text));
                strSkillText3 = (getResources().getString(R.string.lina_skill3_text));
                strSkillText4 = (getResources().getString(R.string.lina_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.lina_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.lina_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.lina_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.lina_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.lina_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.lina_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.lina_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.lina_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.lina_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.lina_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.lina_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.lina_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.lina_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;



            case "Lion":
                heroIcon.setImageResource(R.drawable.lion_medium);
                heroName.setText(R.string.lion);
                heroRole.setText(R.string.lion_role);

                talent1.setText(R.string.lion_talent1_text);
                talent2.setText(R.string.lion_talent2_text);
                talent3.setText(R.string.lion_talent3_text);
                talent4.setText(R.string.lion_talent4_text);
                talent5.setText(R.string.lion_talent5_text);
                talent6.setText(R.string.lion_talent6_text);
                talent7.setText(R.string.lion_talent7_text);
                talent8.setText(R.string.lion_talent8_text);


                heroSkill1.setImageResource(R.drawable.lion_skill_1);
                heroSkill2.setImageResource(R.drawable.lion_skill_2);
                heroSkill3.setImageResource(R.drawable.lion_skill_3);
                heroSkill4.setImageResource(R.drawable.lion_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.lion_skill1_name));
                strSkillName2 = (getResources().getString(R.string.lion_skill2_name));
                strSkillName3 = (getResources().getString(R.string.lion_skill3_name));
                strSkillName4 = (getResources().getString(R.string.lion_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.lion_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.lion_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.lion_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.lion_skill4_description));

                strSkillText1 = (getResources().getString(R.string.lion_skill1_text));
                strSkillText2 = (getResources().getString(R.string.lion_skill2_text));
                strSkillText3 = (getResources().getString(R.string.lion_skill3_text));
                strSkillText4 = (getResources().getString(R.string.lion_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.lion_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.lion_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.lion_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.lion_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.lion_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.lion_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.lion_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.lion_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.lion_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.lion_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.lion_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.lion_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.lion_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Natures Prophet":
                heroIcon.setImageResource(R.drawable.natures_prophet_medium);
                heroName.setText(R.string.natures_prophet);
                heroRole.setText(R.string.natures_prophet_role);

                talent1.setText(R.string.natures_prophet_talent1_text);
                talent2.setText(R.string.natures_prophet_talent2_text);
                talent3.setText(R.string.natures_prophet_talent3_text);
                talent4.setText(R.string.natures_prophet_talent4_text);
                talent5.setText(R.string.natures_prophet_talent5_text);
                talent6.setText(R.string.natures_prophet_talent6_text);
                talent7.setText(R.string.natures_prophet_talent7_text);
                talent8.setText(R.string.natures_prophet_talent8_text);


                heroSkill1.setImageResource(R.drawable.natures_prophet_skill_1);
                heroSkill2.setImageResource(R.drawable.natures_prophet_skill_2);
                heroSkill3.setImageResource(R.drawable.natures_prophet_skill_3);
                heroSkill4.setImageResource(R.drawable.natures_prophet_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.natures_prophet_skill1_name));
                strSkillName2 = (getResources().getString(R.string.natures_prophet_skill2_name));
                strSkillName3 = (getResources().getString(R.string.natures_prophet_skill3_name));
                strSkillName4 = (getResources().getString(R.string.natures_prophet_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.natures_prophet_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.natures_prophet_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.natures_prophet_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.natures_prophet_skill4_description));

                strSkillText1 = (getResources().getString(R.string.natures_prophet_skill1_text));
                strSkillText2 = (getResources().getString(R.string.natures_prophet_skill2_text));
                strSkillText3 = (getResources().getString(R.string.natures_prophet_skill3_text));
                strSkillText4 = (getResources().getString(R.string.natures_prophet_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.natures_prophet_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.natures_prophet_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.natures_prophet_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.natures_prophet_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.natures_prophet_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.natures_prophet_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.natures_prophet_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.natures_prophet_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.natures_prophet_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.natures_prophet_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.natures_prophet_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.natures_prophet_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.natures_prophet_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Necrophos":
                heroIcon.setImageResource(R.drawable.necrophos_medium);
                heroName.setText(R.string.necrophos);
                heroRole.setText(R.string.necrophos_role);

                talent1.setText(R.string.necrophos_talent1_text);
                talent2.setText(R.string.necrophos_talent2_text);
                talent3.setText(R.string.necrophos_talent3_text);
                talent4.setText(R.string.necrophos_talent4_text);
                talent5.setText(R.string.necrophos_talent5_text);
                talent6.setText(R.string.necrophos_talent6_text);
                talent7.setText(R.string.necrophos_talent7_text);
                talent8.setText(R.string.necrophos_talent8_text);


                heroSkill1.setImageResource(R.drawable.necrophos_skill_1);
                heroSkill2.setImageResource(R.drawable.necrophos_skill_2);
                heroSkill3.setImageResource(R.drawable.necrophos_skill_3);
                heroSkill4.setImageResource(R.drawable.necrophos_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.necrophos_skill1_name));
                strSkillName2 = (getResources().getString(R.string.necrophos_skill2_name));
                strSkillName3 = (getResources().getString(R.string.necrophos_skill3_name));
                strSkillName4 = (getResources().getString(R.string.necrophos_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.necrophos_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.necrophos_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.necrophos_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.necrophos_skill4_description));

                strSkillText1 = (getResources().getString(R.string.necrophos_skill1_text));
                strSkillText2 = (getResources().getString(R.string.necrophos_skill2_text));
                strSkillText3 = (getResources().getString(R.string.necrophos_skill3_text));
                strSkillText4 = (getResources().getString(R.string.necrophos_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.necrophos_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.necrophos_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.necrophos_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.necrophos_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.necrophos_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.necrophos_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.necrophos_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.necrophos_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.necrophos_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.necrophos_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.necrophos_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.necrophos_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.necrophos_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;



            case "Ogre Magi":
                heroIcon.setImageResource(R.drawable.ogre_magi_medium);
                heroName.setText(R.string.ogre_magi);
                heroRole.setText(R.string.ogre_magi_role);

                talent1.setText(R.string.ogre_magi_talent1_text);
                talent2.setText(R.string.ogre_magi_talent2_text);
                talent3.setText(R.string.ogre_magi_talent3_text);
                talent4.setText(R.string.ogre_magi_talent4_text);
                talent5.setText(R.string.ogre_magi_talent5_text);
                talent6.setText(R.string.ogre_magi_talent6_text);
                talent7.setText(R.string.ogre_magi_talent7_text);
                talent8.setText(R.string.ogre_magi_talent8_text);


                heroSkill1.setImageResource(R.drawable.ogre_magi_skill_1);
                heroSkill2.setImageResource(R.drawable.ogre_magi_skill_2);
                heroSkill3.setImageResource(R.drawable.ogre_magi_skill_3);
                heroSkill4.setImageResource(R.drawable.ogre_magi_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.ogre_magi_skill1_name));
                strSkillName2 = (getResources().getString(R.string.ogre_magi_skill2_name));
                strSkillName3 = (getResources().getString(R.string.ogre_magi_skill3_name));
                strSkillName4 = (getResources().getString(R.string.ogre_magi_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.ogre_magi_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.ogre_magi_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.ogre_magi_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.ogre_magi_skill4_description));

                strSkillText1 = (getResources().getString(R.string.ogre_magi_skill1_text));
                strSkillText2 = (getResources().getString(R.string.ogre_magi_skill2_text));
                strSkillText3 = (getResources().getString(R.string.ogre_magi_skill3_text));
                strSkillText4 = (getResources().getString(R.string.ogre_magi_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.ogre_magi_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.ogre_magi_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.ogre_magi_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.ogre_magi_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.ogre_magi_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.ogre_magi_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.ogre_magi_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.ogre_magi_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.ogre_magi_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.ogre_magi_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.ogre_magi_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.ogre_magi_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.ogre_magi_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Oracle":
                heroIcon.setImageResource(R.drawable.oracle_medium);
                heroName.setText(R.string.oracle);
                heroRole.setText(R.string.oracle_role);

                talent1.setText(R.string.oracle_talent1_text);
                talent2.setText(R.string.oracle_talent2_text);
                talent3.setText(R.string.oracle_talent3_text);
                talent4.setText(R.string.oracle_talent4_text);
                talent5.setText(R.string.oracle_talent5_text);
                talent6.setText(R.string.oracle_talent6_text);
                talent7.setText(R.string.oracle_talent7_text);
                talent8.setText(R.string.oracle_talent8_text);


                heroSkill1.setImageResource(R.drawable.oracle_skill_1);
                heroSkill2.setImageResource(R.drawable.oracle_skill_2);
                heroSkill3.setImageResource(R.drawable.oracle_skill_3);
                heroSkill4.setImageResource(R.drawable.oracle_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.oracle_skill1_name));
                strSkillName2 = (getResources().getString(R.string.oracle_skill2_name));
                strSkillName3 = (getResources().getString(R.string.oracle_skill3_name));
                strSkillName4 = (getResources().getString(R.string.oracle_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.oracle_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.oracle_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.oracle_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.oracle_skill4_description));

                strSkillText1 = (getResources().getString(R.string.oracle_skill1_text));
                strSkillText2 = (getResources().getString(R.string.oracle_skill2_text));
                strSkillText3 = (getResources().getString(R.string.oracle_skill3_text));
                strSkillText4 = (getResources().getString(R.string.oracle_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.oracle_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.oracle_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.oracle_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.oracle_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.oracle_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.oracle_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.oracle_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.oracle_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.oracle_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.oracle_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.oracle_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.oracle_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.oracle_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Outworld Devourer":
                heroIcon.setImageResource(R.drawable.outworld_devourer_medium);
                heroName.setText(R.string.outworld_destroyer);
                heroRole.setText(R.string.outworld_destroyer_role);

                talent1.setText(R.string.outworld_destroyer_talent1_text);
                talent2.setText(R.string.outworld_destroyer_talent2_text);
                talent3.setText(R.string.outworld_destroyer_talent3_text);
                talent4.setText(R.string.outworld_destroyer_talent4_text);
                talent5.setText(R.string.outworld_destroyer_talent5_text);
                talent6.setText(R.string.outworld_destroyer_talent6_text);
                talent7.setText(R.string.outworld_destroyer_talent7_text);
                talent8.setText(R.string.outworld_destroyer_talent8_text);


                heroSkill1.setImageResource(R.drawable.outworld_devourer_skill_1);
                heroSkill2.setImageResource(R.drawable.outworld_devourer_skill_2);
                heroSkill3.setImageResource(R.drawable.outworld_devourer_skill_3);
                heroSkill4.setImageResource(R.drawable.outworld_devourer_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.outworld_destroyer_skill1_name));
                strSkillName2 = (getResources().getString(R.string.outworld_destroyer_skill2_name));
                strSkillName3 = (getResources().getString(R.string.outworld_destroyer_skill3_name));
                strSkillName4 = (getResources().getString(R.string.outworld_destroyer_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.outworld_destroyer_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.outworld_destroyer_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.outworld_destroyer_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.outworld_destroyer_skill4_description));

                strSkillText1 = (getResources().getString(R.string.outworld_destroyer_skill1_text));
                strSkillText2 = (getResources().getString(R.string.outworld_destroyer_skill2_text));
                strSkillText3 = (getResources().getString(R.string.outworld_destroyer_skill3_text));
                strSkillText4 = (getResources().getString(R.string.outworld_destroyer_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.outworld_destroyer_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.outworld_destroyer_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.outworld_destroyer_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.outworld_destroyer_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.outworld_destroyer_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.outworld_destroyer_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.outworld_destroyer_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.outworld_destroyer_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.outworld_destroyer_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.outworld_destroyer_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.outworld_destroyer_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.outworld_destroyer_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.outworld_destroyer_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Puck":
                heroIcon.setImageResource(R.drawable.puck_medium);
                heroName.setText(R.string.puck);
                heroRole.setText(R.string.puck_role);

                talent1.setText(R.string.puck_talent1_text);
                talent2.setText(R.string.puck_talent2_text);
                talent3.setText(R.string.puck_talent3_text);
                talent4.setText(R.string.puck_talent4_text);
                talent5.setText(R.string.puck_talent5_text);
                talent6.setText(R.string.puck_talent6_text);
                talent7.setText(R.string.puck_talent7_text);
                talent8.setText(R.string.puck_talent8_text);


                heroSkill1.setImageResource(R.drawable.puck_skill_1);
                heroSkill2.setImageResource(R.drawable.puck_skill_2);
                heroSkill3.setImageResource(R.drawable.puck_skill_3);
                heroSkill4.setImageResource(R.drawable.puck_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.puck_skill1_name));
                strSkillName2 = (getResources().getString(R.string.puck_skill2_name));
                strSkillName3 = (getResources().getString(R.string.puck_skill3_name));
                strSkillName4 = (getResources().getString(R.string.puck_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.puck_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.puck_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.puck_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.puck_skill4_description));

                strSkillText1 = (getResources().getString(R.string.puck_skill1_text));
                strSkillText2 = (getResources().getString(R.string.puck_skill2_text));
                strSkillText3 = (getResources().getString(R.string.puck_skill3_text));
                strSkillText4 = (getResources().getString(R.string.puck_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.puck_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.puck_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.puck_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.puck_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.puck_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.puck_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.puck_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.puck_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.puck_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.puck_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.puck_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.puck_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.puck_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Pugna":
                heroIcon.setImageResource(R.drawable.pugna_medium);
                heroName.setText(R.string.pugna);
                heroRole.setText(R.string.pugna_role);

                talent1.setText(R.string.pugna_talent1_text);
                talent2.setText(R.string.pugna_talent2_text);
                talent3.setText(R.string.pugna_talent3_text);
                talent4.setText(R.string.pugna_talent4_text);
                talent5.setText(R.string.pugna_talent5_text);
                talent6.setText(R.string.pugna_talent6_text);
                talent7.setText(R.string.pugna_talent7_text);
                talent8.setText(R.string.pugna_talent8_text);


                heroSkill1.setImageResource(R.drawable.pugna_skill_1);
                heroSkill2.setImageResource(R.drawable.pugna_skill_2);
                heroSkill3.setImageResource(R.drawable.pugna_skill_3);
                heroSkill4.setImageResource(R.drawable.pugna_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.pugna_skill1_name));
                strSkillName2 = (getResources().getString(R.string.pugna_skill2_name));
                strSkillName3 = (getResources().getString(R.string.pugna_skill3_name));
                strSkillName4 = (getResources().getString(R.string.pugna_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.pugna_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.pugna_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.pugna_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.pugna_skill4_description));

                strSkillText1 = (getResources().getString(R.string.pugna_skill1_text));
                strSkillText2 = (getResources().getString(R.string.pugna_skill2_text));
                strSkillText3 = (getResources().getString(R.string.pugna_skill3_text));
                strSkillText4 = (getResources().getString(R.string.pugna_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.pugna_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.pugna_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.pugna_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.pugna_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.pugna_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.pugna_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.pugna_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.pugna_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.pugna_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.pugna_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.pugna_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.pugna_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.pugna_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;



            case "Queen Of Pain":
                heroIcon.setImageResource(R.drawable.queen_of_pain_medium);
                heroName.setText(R.string.queen_of_pain);
                heroRole.setText(R.string.queen_of_pain_role);

                talent1.setText(R.string.queen_of_pain_talent1_text);
                talent2.setText(R.string.queen_of_pain_talent2_text);
                talent3.setText(R.string.queen_of_pain_talent3_text);
                talent4.setText(R.string.queen_of_pain_talent4_text);
                talent5.setText(R.string.queen_of_pain_talent5_text);
                talent6.setText(R.string.queen_of_pain_talent6_text);
                talent7.setText(R.string.queen_of_pain_talent7_text);
                talent8.setText(R.string.queen_of_pain_talent8_text);


                heroSkill1.setImageResource(R.drawable.queen_of_pain_skill_1);
                heroSkill2.setImageResource(R.drawable.queen_of_pain_skill_2);
                heroSkill3.setImageResource(R.drawable.queen_of_pain_skill_3);
                heroSkill4.setImageResource(R.drawable.queen_of_pain_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.queen_of_pain_skill1_name));
                strSkillName2 = (getResources().getString(R.string.queen_of_pain_skill2_name));
                strSkillName3 = (getResources().getString(R.string.queen_of_pain_skill3_name));
                strSkillName4 = (getResources().getString(R.string.queen_of_pain_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.queen_of_pain_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.queen_of_pain_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.queen_of_pain_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.queen_of_pain_skill4_description));

                strSkillText1 = (getResources().getString(R.string.queen_of_pain_skill1_text));
                strSkillText2 = (getResources().getString(R.string.queen_of_pain_skill2_text));
                strSkillText3 = (getResources().getString(R.string.queen_of_pain_skill3_text));
                strSkillText4 = (getResources().getString(R.string.queen_of_pain_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.queen_of_pain_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.queen_of_pain_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.queen_of_pain_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.queen_of_pain_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.queen_of_pain_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.queen_of_pain_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.queen_of_pain_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.queen_of_pain_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.queen_of_pain_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.queen_of_pain_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.queen_of_pain_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.queen_of_pain_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.queen_of_pain_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Rubick":
                heroIcon.setImageResource(R.drawable.rubick_medium);
                heroName.setText(R.string.rubick);
                heroRole.setText(R.string.rubick_role);

                talent1.setText(R.string.rubick_talent1_text);
                talent2.setText(R.string.rubick_talent2_text);
                talent3.setText(R.string.rubick_talent3_text);
                talent4.setText(R.string.rubick_talent4_text);
                talent5.setText(R.string.rubick_talent5_text);
                talent6.setText(R.string.rubick_talent6_text);
                talent7.setText(R.string.rubick_talent7_text);
                talent8.setText(R.string.rubick_talent8_text);


                heroSkill1.setImageResource(R.drawable.rubick_skill_1);
                heroSkill2.setImageResource(R.drawable.rubick_skill_2);
                heroSkill3.setImageResource(R.drawable.rubick_skill_3);
                heroSkill4.setImageResource(R.drawable.rubick_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.rubick_skill1_name));
                strSkillName2 = (getResources().getString(R.string.rubick_skill2_name));
                strSkillName3 = (getResources().getString(R.string.rubick_skill3_name));
                strSkillName4 = (getResources().getString(R.string.rubick_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.rubick_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.rubick_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.rubick_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.rubick_skill4_description));

                strSkillText1 = (getResources().getString(R.string.rubick_skill1_text));
                strSkillText2 = (getResources().getString(R.string.rubick_skill2_text));
                strSkillText3 = (getResources().getString(R.string.rubick_skill3_text));
                strSkillText4 = (getResources().getString(R.string.rubick_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.rubick_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.rubick_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.rubick_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.rubick_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.rubick_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.rubick_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.rubick_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.rubick_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.rubick_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.rubick_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.rubick_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.rubick_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.rubick_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Shadow Demon":
                heroIcon.setImageResource(R.drawable.shadow_demon_medium);
                heroName.setText(R.string.shadow_demon);
                heroRole.setText(R.string.shadow_demon_role);

                talent1.setText(R.string.shadow_demon_talent1_text);
                talent2.setText(R.string.shadow_demon_talent2_text);
                talent3.setText(R.string.shadow_demon_talent3_text);
                talent4.setText(R.string.shadow_demon_talent4_text);
                talent5.setText(R.string.shadow_demon_talent5_text);
                talent6.setText(R.string.shadow_demon_talent6_text);
                talent7.setText(R.string.shadow_demon_talent7_text);
                talent8.setText(R.string.shadow_demon_talent8_text);


                heroSkill1.setImageResource(R.drawable.shadow_demon_skill_1);
                heroSkill2.setImageResource(R.drawable.shadow_demon_skill_2);
                heroSkill3.setImageResource(R.drawable.shadow_demon_skill_3);
                heroSkill4.setImageResource(R.drawable.shadow_demon_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.shadow_demon_skill1_name));
                strSkillName2 = (getResources().getString(R.string.shadow_demon_skill2_name));
                strSkillName3 = (getResources().getString(R.string.shadow_demon_skill3_name));
                strSkillName4 = (getResources().getString(R.string.shadow_demon_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.shadow_demon_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.shadow_demon_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.shadow_demon_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.shadow_demon_skill4_description));

                strSkillText1 = (getResources().getString(R.string.shadow_demon_skill1_text));
                strSkillText2 = (getResources().getString(R.string.shadow_demon_skill2_text));
                strSkillText3 = (getResources().getString(R.string.shadow_demon_skill3_text));
                strSkillText4 = (getResources().getString(R.string.shadow_demon_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.shadow_demon_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.shadow_demon_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.shadow_demon_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.shadow_demon_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.shadow_demon_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.shadow_demon_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.shadow_demon_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.shadow_demon_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.shadow_demon_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.shadow_demon_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.shadow_demon_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.shadow_demon_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.shadow_demon_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Shadow Shaman":
                heroIcon.setImageResource(R.drawable.shadow_shaman_medium);
                heroName.setText(R.string.shadow_shaman);
                heroRole.setText(R.string.shadow_shaman_role);

                talent1.setText(R.string.shadow_shaman_talent1_text);
                talent2.setText(R.string.shadow_shaman_talent2_text);
                talent3.setText(R.string.shadow_shaman_talent3_text);
                talent4.setText(R.string.shadow_shaman_talent4_text);
                talent5.setText(R.string.shadow_shaman_talent5_text);
                talent6.setText(R.string.shadow_shaman_talent6_text);
                talent7.setText(R.string.shadow_shaman_talent7_text);
                talent8.setText(R.string.shadow_shaman_talent8_text);


                heroSkill1.setImageResource(R.drawable.shadow_shaman_skill_1);
                heroSkill2.setImageResource(R.drawable.shadow_shaman_skill_2);
                heroSkill3.setImageResource(R.drawable.shadow_shaman_skill_3);
                heroSkill4.setImageResource(R.drawable.shadow_shaman_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.shadow_shaman_skill1_name));
                strSkillName2 = (getResources().getString(R.string.shadow_shaman_skill2_name));
                strSkillName3 = (getResources().getString(R.string.shadow_shaman_skill3_name));
                strSkillName4 = (getResources().getString(R.string.shadow_shaman_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.shadow_shaman_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.shadow_shaman_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.shadow_shaman_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.shadow_shaman_skill4_description));

                strSkillText1 = (getResources().getString(R.string.shadow_shaman_skill1_text));
                strSkillText2 = (getResources().getString(R.string.shadow_shaman_skill2_text));
                strSkillText3 = (getResources().getString(R.string.shadow_shaman_skill3_text));
                strSkillText4 = (getResources().getString(R.string.shadow_shaman_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.shadow_shaman_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.shadow_shaman_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.shadow_shaman_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.shadow_shaman_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.shadow_shaman_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.shadow_shaman_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.shadow_shaman_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.shadow_shaman_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.shadow_shaman_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.shadow_shaman_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.shadow_shaman_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.shadow_shaman_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.shadow_shaman_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Silencer":
                heroIcon.setImageResource(R.drawable.silencer_medium);
                heroName.setText(R.string.silencer);
                heroRole.setText(R.string.silencer_role);

                talent1.setText(R.string.silencer_talent1_text);
                talent2.setText(R.string.silencer_talent2_text);
                talent3.setText(R.string.silencer_talent3_text);
                talent4.setText(R.string.silencer_talent4_text);
                talent5.setText(R.string.silencer_talent5_text);
                talent6.setText(R.string.silencer_talent6_text);
                talent7.setText(R.string.silencer_talent7_text);
                talent8.setText(R.string.silencer_talent8_text);


                heroSkill1.setImageResource(R.drawable.silencer_skill_1);
                heroSkill2.setImageResource(R.drawable.silencer_skill_2);
                heroSkill3.setImageResource(R.drawable.silencer_skill_3);
                heroSkill4.setImageResource(R.drawable.silencer_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.silencer_skill1_name));
                strSkillName2 = (getResources().getString(R.string.silencer_skill2_name));
                strSkillName3 = (getResources().getString(R.string.silencer_skill3_name));
                strSkillName4 = (getResources().getString(R.string.silencer_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.silencer_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.silencer_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.silencer_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.silencer_skill4_description));

                strSkillText1 = (getResources().getString(R.string.silencer_skill1_text));
                strSkillText2 = (getResources().getString(R.string.silencer_skill2_text));
                strSkillText3 = (getResources().getString(R.string.silencer_skill3_text));
                strSkillText4 = (getResources().getString(R.string.silencer_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.silencer_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.silencer_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.silencer_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.silencer_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.silencer_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.silencer_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.silencer_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.silencer_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.silencer_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.silencer_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.silencer_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.silencer_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.silencer_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Skywrath Mage":
                heroIcon.setImageResource(R.drawable.skywrath_mage_medium);
                heroName.setText(R.string.skywrath_mage);
                heroRole.setText(R.string.skywrath_mage_role);

                talent1.setText(R.string.skywrath_mage_talent1_text);
                talent2.setText(R.string.skywrath_mage_talent2_text);
                talent3.setText(R.string.skywrath_mage_talent3_text);
                talent4.setText(R.string.skywrath_mage_talent4_text);
                talent5.setText(R.string.skywrath_mage_talent5_text);
                talent6.setText(R.string.skywrath_mage_talent6_text);
                talent7.setText(R.string.skywrath_mage_talent7_text);
                talent8.setText(R.string.skywrath_mage_talent8_text);


                heroSkill1.setImageResource(R.drawable.skywrath_mage_skill_1);
                heroSkill2.setImageResource(R.drawable.skywrath_mage_skill_2);
                heroSkill3.setImageResource(R.drawable.skywrath_mage_skill_3);
                heroSkill4.setImageResource(R.drawable.skywrath_mage_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.skywrath_mage_skill1_name));
                strSkillName2 = (getResources().getString(R.string.skywrath_mage_skill2_name));
                strSkillName3 = (getResources().getString(R.string.skywrath_mage_skill3_name));
                strSkillName4 = (getResources().getString(R.string.skywrath_mage_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.skywrath_mage_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.skywrath_mage_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.skywrath_mage_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.skywrath_mage_skill4_description));

                strSkillText1 = (getResources().getString(R.string.skywrath_mage_skill1_text));
                strSkillText2 = (getResources().getString(R.string.skywrath_mage_skill2_text));
                strSkillText3 = (getResources().getString(R.string.skywrath_mage_skill3_text));
                strSkillText4 = (getResources().getString(R.string.skywrath_mage_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.skywrath_mage_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.skywrath_mage_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.skywrath_mage_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.skywrath_mage_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.skywrath_mage_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.skywrath_mage_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.skywrath_mage_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.skywrath_mage_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.skywrath_mage_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.skywrath_mage_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.skywrath_mage_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.skywrath_mage_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.skywrath_mage_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Storm Spirit":
                heroIcon.setImageResource(R.drawable.storm_spirit_medium);
                heroName.setText(R.string.storm_spirit);
                heroRole.setText(R.string.storm_spirit_role);

                talent1.setText(R.string.storm_spirit_talent1_text);
                talent2.setText(R.string.storm_spirit_talent2_text);
                talent3.setText(R.string.storm_spirit_talent3_text);
                talent4.setText(R.string.storm_spirit_talent4_text);
                talent5.setText(R.string.storm_spirit_talent5_text);
                talent6.setText(R.string.storm_spirit_talent6_text);
                talent7.setText(R.string.storm_spirit_talent7_text);
                talent8.setText(R.string.storm_spirit_talent8_text);


                heroSkill1.setImageResource(R.drawable.storm_spirit_skill_1);
                heroSkill2.setImageResource(R.drawable.storm_spirit_skill_2);
                heroSkill3.setImageResource(R.drawable.storm_spirit_skill_3);
                heroSkill4.setImageResource(R.drawable.storm_spirit_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.storm_spirit_skill1_name));
                strSkillName2 = (getResources().getString(R.string.storm_spirit_skill2_name));
                strSkillName3 = (getResources().getString(R.string.storm_spirit_skill3_name));
                strSkillName4 = (getResources().getString(R.string.storm_spirit_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.storm_spirit_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.storm_spirit_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.storm_spirit_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.storm_spirit_skill4_description));

                strSkillText1 = (getResources().getString(R.string.storm_spirit_skill1_text));
                strSkillText2 = (getResources().getString(R.string.storm_spirit_skill2_text));
                strSkillText3 = (getResources().getString(R.string.storm_spirit_skill3_text));
                strSkillText4 = (getResources().getString(R.string.storm_spirit_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.storm_spirit_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.storm_spirit_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.storm_spirit_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.storm_spirit_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.storm_spirit_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.storm_spirit_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.storm_spirit_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.storm_spirit_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.storm_spirit_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.storm_spirit_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.storm_spirit_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.storm_spirit_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.storm_spirit_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Techies":
                heroIcon.setImageResource(R.drawable.techies_medium);
                heroName.setText(R.string.techies);
                heroRole.setText(R.string.techies_role);

                talent1.setText(R.string.techies_talent1_text);
                talent2.setText(R.string.techies_talent2_text);
                talent3.setText(R.string.techies_talent3_text);
                talent4.setText(R.string.techies_talent4_text);
                talent5.setText(R.string.techies_talent5_text);
                talent6.setText(R.string.techies_talent6_text);
                talent7.setText(R.string.techies_talent7_text);
                talent8.setText(R.string.techies_talent8_text);


                heroSkill1.setImageResource(R.drawable.techies_skill_1);
                heroSkill2.setImageResource(R.drawable.techies_skill_2);
                heroSkill3.setImageResource(R.drawable.techies_skill_3);
                heroSkill4.setImageResource(R.drawable.techies_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.techies_skill1_name));
                strSkillName2 = (getResources().getString(R.string.techies_skill2_name));
                strSkillName3 = (getResources().getString(R.string.techies_skill3_name));
                strSkillName4 = (getResources().getString(R.string.techies_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.techies_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.techies_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.techies_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.techies_skill4_description));

                strSkillText1 = (getResources().getString(R.string.techies_skill1_text));
                strSkillText2 = (getResources().getString(R.string.techies_skill2_text));
                strSkillText3 = (getResources().getString(R.string.techies_skill3_text));
                strSkillText4 = (getResources().getString(R.string.techies_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.techies_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.techies_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.techies_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.techies_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.techies_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.techies_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.techies_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.techies_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.techies_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.techies_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.techies_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.techies_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.techies_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Tinker":
                heroIcon.setImageResource(R.drawable.tinker_medium);
                heroName.setText(R.string.tinker);
                heroRole.setText(R.string.tinker_role);

                talent1.setText(R.string.tinker_talent1_text);
                talent2.setText(R.string.tinker_talent2_text);
                talent3.setText(R.string.tinker_talent3_text);
                talent4.setText(R.string.tinker_talent4_text);
                talent5.setText(R.string.tinker_talent5_text);
                talent6.setText(R.string.tinker_talent6_text);
                talent7.setText(R.string.tinker_talent7_text);
                talent8.setText(R.string.tinker_talent8_text);


                heroSkill1.setImageResource(R.drawable.tinker_skill_1);
                heroSkill2.setImageResource(R.drawable.tinker_skill_2);
                heroSkill3.setImageResource(R.drawable.tinker_skill_3);
                heroSkill4.setImageResource(R.drawable.tinker_skill_4);
                heroSkill5.setImageResource(R.drawable.tinker_skill_5);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.tinker_skill1_name));
                strSkillName2 = (getResources().getString(R.string.tinker_skill2_name));
                strSkillName3 = (getResources().getString(R.string.tinker_skill3_name));
                strSkillName4 = (getResources().getString(R.string.tinker_skill4_name));
                strSkillName5 = (getResources().getString(R.string.tinker_skill5_name));

                strSkillDescription1 = (getResources().getString(R.string.tinker_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.tinker_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.tinker_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.tinker_skill4_description));
                strSkillDescription5 = (getResources().getString(R.string.tinker_skill5_description));

                strSkillText1 = (getResources().getString(R.string.tinker_skill1_text));
                strSkillText2 = (getResources().getString(R.string.tinker_skill2_text));
                strSkillText3 = (getResources().getString(R.string.tinker_skill3_text));
                strSkillText4 = (getResources().getString(R.string.tinker_skill4_text));
                strSkillText5 = (getResources().getString(R.string.tinker_skill5_text));

                strScepterSkillText1 = (getResources().getString(R.string.tinker_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.tinker_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.tinker_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.tinker_scepter_skill4_text));
                strScepterSkillText5 = (getResources().getString(R.string.tinker_scepter_skill5_text));

                aghanimShardAbilityText = (getResources().getString(R.string.tinker_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.tinker_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.tinker_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.tinker_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.tinker_skill4_cooldown));
                strSkillCooldown5 = (getResources().getString(R.string.tinker_skill5_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.tinker_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.tinker_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.tinker_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.tinker_skill4_manacost));
                strSkillManacost5 = (getResources().getString(R.string.tinker_skill5_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Visage":
                heroIcon.setImageResource(R.drawable.visage_medium);
                heroName.setText(R.string.visage);
                heroRole.setText(R.string.visage_role);

                talent1.setText(R.string.visage_talent1_text);
                talent2.setText(R.string.visage_talent2_text);
                talent3.setText(R.string.visage_talent3_text);
                talent4.setText(R.string.visage_talent4_text);
                talent5.setText(R.string.visage_talent5_text);
                talent6.setText(R.string.visage_talent6_text);
                talent7.setText(R.string.visage_talent7_text);
                talent8.setText(R.string.visage_talent8_text);


                heroSkill1.setImageResource(R.drawable.visage_skill_1);
                heroSkill2.setImageResource(R.drawable.visage_skill_2);
                heroSkill3.setImageResource(R.drawable.visage_skill_3);
                heroSkill4.setImageResource(R.drawable.visage_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.visage_skill1_name));
                strSkillName2 = (getResources().getString(R.string.visage_skill2_name));
                strSkillName3 = (getResources().getString(R.string.visage_skill3_name));
                strSkillName4 = (getResources().getString(R.string.visage_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.visage_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.visage_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.visage_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.visage_skill4_description));

                strSkillText1 = (getResources().getString(R.string.visage_skill1_text));
                strSkillText2 = (getResources().getString(R.string.visage_skill2_text));
                strSkillText3 = (getResources().getString(R.string.visage_skill3_text));
                strSkillText4 = (getResources().getString(R.string.visage_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.visage_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.visage_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.visage_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.visage_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.visage_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.visage_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.visage_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.visage_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.visage_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.visage_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.visage_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.visage_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.visage_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;



            case "Void Spirit":
                heroIcon.setImageResource(R.drawable.void_spirit_medium);
                heroName.setText(R.string.void_spirit);
                heroRole.setText(R.string.void_spirit_role);

                talent1.setText(R.string.void_spirit_talent1_text);
                talent2.setText(R.string.void_spirit_talent2_text);
                talent3.setText(R.string.void_spirit_talent3_text);
                talent4.setText(R.string.void_spirit_talent4_text);
                talent5.setText(R.string.void_spirit_talent5_text);
                talent6.setText(R.string.void_spirit_talent6_text);
                talent7.setText(R.string.void_spirit_talent7_text);
                talent8.setText(R.string.void_spirit_talent8_text);


                heroSkill1.setImageResource(R.drawable.void_spirit_skill_1);
                heroSkill2.setImageResource(R.drawable.void_spirit_skill_2);
                heroSkill3.setImageResource(R.drawable.void_spirit_skill_3);
                heroSkill4.setImageResource(R.drawable.void_spirit_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.void_spirit_skill1_name));
                strSkillName2 = (getResources().getString(R.string.void_spirit_skill2_name));
                strSkillName3 = (getResources().getString(R.string.void_spirit_skill3_name));
                strSkillName4 = (getResources().getString(R.string.void_spirit_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.void_spirit_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.void_spirit_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.void_spirit_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.void_spirit_skill4_description));

                strSkillText1 = (getResources().getString(R.string.void_spirit_skill1_text));
                strSkillText2 = (getResources().getString(R.string.void_spirit_skill2_text));
                strSkillText3 = (getResources().getString(R.string.void_spirit_skill3_text));
                strSkillText4 = (getResources().getString(R.string.void_spirit_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.void_spirit_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.void_spirit_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.void_spirit_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.void_spirit_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.void_spirit_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.void_spirit_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.void_spirit_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.void_spirit_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.void_spirit_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.void_spirit_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.void_spirit_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.void_spirit_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.void_spirit_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;




            case "Warlock":
                heroIcon.setImageResource(R.drawable.warlock_medium);
                heroName.setText(R.string.warlock);
                heroRole.setText(R.string.warlock_role);

                talent1.setText(R.string.warlock_talent1_text);
                talent2.setText(R.string.warlock_talent2_text);
                talent3.setText(R.string.warlock_talent3_text);
                talent4.setText(R.string.warlock_talent4_text);
                talent5.setText(R.string.warlock_talent5_text);
                talent6.setText(R.string.warlock_talent6_text);
                talent7.setText(R.string.warlock_talent7_text);
                talent8.setText(R.string.warlock_talent8_text);


                heroSkill1.setImageResource(R.drawable.warlock_skill_1);
                heroSkill2.setImageResource(R.drawable.warlock_skill_2);
                heroSkill3.setImageResource(R.drawable.warlock_skill_3);
                heroSkill4.setImageResource(R.drawable.warlock_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.warlock_skill1_name));
                strSkillName2 = (getResources().getString(R.string.warlock_skill2_name));
                strSkillName3 = (getResources().getString(R.string.warlock_skill3_name));
                strSkillName4 = (getResources().getString(R.string.warlock_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.warlock_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.warlock_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.warlock_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.warlock_skill4_description));

                strSkillText1 = (getResources().getString(R.string.warlock_skill1_text));
                strSkillText2 = (getResources().getString(R.string.warlock_skill2_text));
                strSkillText3 = (getResources().getString(R.string.warlock_skill3_text));
                strSkillText4 = (getResources().getString(R.string.warlock_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.warlock_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.warlock_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.warlock_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.warlock_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.warlock_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.warlock_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.warlock_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.warlock_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.warlock_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.warlock_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.warlock_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.warlock_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.warlock_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Windranger":
                heroIcon.setImageResource(R.drawable.windrunner_medium);
                heroName.setText(R.string.windranger);
                heroRole.setText(R.string.windranger_role);

                talent1.setText(R.string.windranger_talent1_text);
                talent2.setText(R.string.windranger_talent2_text);
                talent3.setText(R.string.windranger_talent3_text);
                talent4.setText(R.string.windranger_talent4_text);
                talent5.setText(R.string.windranger_talent5_text);
                talent6.setText(R.string.windranger_talent6_text);
                talent7.setText(R.string.windranger_talent7_text);
                talent8.setText(R.string.windranger_talent8_text);


                heroSkill1.setImageResource(R.drawable.windrunner_skill_1);
                heroSkill2.setImageResource(R.drawable.windrunner_skill_2);
                heroSkill3.setImageResource(R.drawable.windrunner_skill_3);
                heroSkill4.setImageResource(R.drawable.windrunner_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.windranger_skill1_name));
                strSkillName2 = (getResources().getString(R.string.windranger_skill2_name));
                strSkillName3 = (getResources().getString(R.string.windranger_skill3_name));
                strSkillName4 = (getResources().getString(R.string.windranger_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.windranger_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.windranger_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.windranger_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.windranger_skill4_description));

                strSkillText1 = (getResources().getString(R.string.windranger_skill1_text));
                strSkillText2 = (getResources().getString(R.string.windranger_skill2_text));
                strSkillText3 = (getResources().getString(R.string.windranger_skill3_text));
                strSkillText4 = (getResources().getString(R.string.windranger_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.windranger_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.windranger_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.windranger_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.windranger_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.windranger_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.windranger_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.windranger_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.windranger_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.windranger_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.windranger_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.windranger_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.windranger_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.windranger_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Winter Wyvern":
                heroIcon.setImageResource(R.drawable.winter_wyvern_medium);
                heroName.setText(R.string.winter_wyvern);
                heroRole.setText(R.string.winter_wyvern_role);

                talent1.setText(R.string.winter_wyvern_talent1_text);
                talent2.setText(R.string.winter_wyvern_talent2_text);
                talent3.setText(R.string.winter_wyvern_talent3_text);
                talent4.setText(R.string.winter_wyvern_talent4_text);
                talent5.setText(R.string.winter_wyvern_talent5_text);
                talent6.setText(R.string.winter_wyvern_talent6_text);
                talent7.setText(R.string.winter_wyvern_talent7_text);
                talent8.setText(R.string.winter_wyvern_talent8_text);


                heroSkill1.setImageResource(R.drawable.winter_wyvern_skill_1);
                heroSkill2.setImageResource(R.drawable.winter_wyvern_skill_2);
                heroSkill3.setImageResource(R.drawable.winter_wyvern_skill_3);
                heroSkill4.setImageResource(R.drawable.winter_wyvern_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.winter_wyvern_skill1_name));
                strSkillName2 = (getResources().getString(R.string.winter_wyvern_skill2_name));
                strSkillName3 = (getResources().getString(R.string.winter_wyvern_skill3_name));
                strSkillName4 = (getResources().getString(R.string.winter_wyvern_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.winter_wyvern_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.winter_wyvern_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.winter_wyvern_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.winter_wyvern_skill4_description));

                strSkillText1 = (getResources().getString(R.string.winter_wyvern_skill1_text));
                strSkillText2 = (getResources().getString(R.string.winter_wyvern_skill2_text));
                strSkillText3 = (getResources().getString(R.string.winter_wyvern_skill3_text));
                strSkillText4 = (getResources().getString(R.string.winter_wyvern_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.winter_wyvern_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.winter_wyvern_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.winter_wyvern_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.winter_wyvern_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.winter_wyvern_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.winter_wyvern_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.winter_wyvern_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.winter_wyvern_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.winter_wyvern_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.winter_wyvern_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.winter_wyvern_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.winter_wyvern_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.winter_wyvern_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Witch Doctor":
                heroIcon.setImageResource(R.drawable.witch_doctor_medium);
                heroName.setText(R.string.witch_doctor);
                heroRole.setText(R.string.witch_doctor_role);

                talent1.setText(R.string.witch_doctor_talent1_text);
                talent2.setText(R.string.witch_doctor_talent2_text);
                talent3.setText(R.string.witch_doctor_talent3_text);
                talent4.setText(R.string.witch_doctor_talent4_text);
                talent5.setText(R.string.witch_doctor_talent5_text);
                talent6.setText(R.string.witch_doctor_talent6_text);
                talent7.setText(R.string.witch_doctor_talent7_text);
                talent8.setText(R.string.witch_doctor_talent8_text);


                heroSkill1.setImageResource(R.drawable.witch_doctor_skill_1);
                heroSkill2.setImageResource(R.drawable.witch_doctor_skill_2);
                heroSkill3.setImageResource(R.drawable.witch_doctor_skill_3);
                heroSkill4.setImageResource(R.drawable.witch_doctor_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.witch_doctor_skill1_name));
                strSkillName2 = (getResources().getString(R.string.witch_doctor_skill2_name));
                strSkillName3 = (getResources().getString(R.string.witch_doctor_skill3_name));
                strSkillName4 = (getResources().getString(R.string.witch_doctor_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.witch_doctor_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.witch_doctor_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.witch_doctor_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.witch_doctor_skill4_description));

                strSkillText1 = (getResources().getString(R.string.witch_doctor_skill1_text));
                strSkillText2 = (getResources().getString(R.string.witch_doctor_skill2_text));
                strSkillText3 = (getResources().getString(R.string.witch_doctor_skill3_text));
                strSkillText4 = (getResources().getString(R.string.witch_doctor_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.witch_doctor_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.witch_doctor_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.witch_doctor_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.witch_doctor_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.witch_doctor_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.witch_doctor_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.witch_doctor_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.witch_doctor_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.witch_doctor_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.witch_doctor_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.witch_doctor_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.witch_doctor_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.witch_doctor_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;





            case "Zeus":
                heroIcon.setImageResource(R.drawable.zeus_medium);
                heroName.setText(R.string.zeus);
                heroRole.setText(R.string.zeus_role);

                talent1.setText(R.string.zeus_talent1_text);
                talent2.setText(R.string.zeus_talent2_text);
                talent3.setText(R.string.zeus_talent3_text);
                talent4.setText(R.string.zeus_talent4_text);
                talent5.setText(R.string.zeus_talent5_text);
                talent6.setText(R.string.zeus_talent6_text);
                talent7.setText(R.string.zeus_talent7_text);
                talent8.setText(R.string.zeus_talent8_text);


                heroSkill1.setImageResource(R.drawable.zeus_skill_1);
                heroSkill2.setImageResource(R.drawable.zeus_skill_2);
                heroSkill3.setImageResource(R.drawable.zeus_skill_3);
                heroSkill4.setImageResource(R.drawable.zeus_skill_4);
                heroSkill5.setVisibility(View.GONE);
                heroSkill6.setVisibility(View.GONE);
                heroSkill7.setVisibility(View.GONE);
                heroSkill8.setVisibility(View.GONE);
                heroSkill9.setVisibility(View.GONE);
                heroSkill10.setVisibility(View.GONE);
                heroSkill11.setVisibility(View.GONE);
                heroSkill12.setVisibility(View.GONE);
                heroSkill13.setVisibility(View.GONE);
                heroSkill14.setVisibility(View.GONE);

                strSkillName1 = (getResources().getString(R.string.zeus_skill1_name));
                strSkillName2 = (getResources().getString(R.string.zeus_skill2_name));
                strSkillName3 = (getResources().getString(R.string.zeus_skill3_name));
                strSkillName4 = (getResources().getString(R.string.zeus_skill4_name));

                strSkillDescription1 = (getResources().getString(R.string.zeus_skill1_description));
                strSkillDescription2 = (getResources().getString(R.string.zeus_skill2_description));
                strSkillDescription3 = (getResources().getString(R.string.zeus_skill3_description));
                strSkillDescription4 = (getResources().getString(R.string.zeus_skill4_description));

                strSkillText1 = (getResources().getString(R.string.zeus_skill1_text));
                strSkillText2 = (getResources().getString(R.string.zeus_skill2_text));
                strSkillText3 = (getResources().getString(R.string.zeus_skill3_text));
                strSkillText4 = (getResources().getString(R.string.zeus_skill4_text));

                strScepterSkillText1 = (getResources().getString(R.string.zeus_scepter_skill1_text));
                strScepterSkillText2 = (getResources().getString(R.string.zeus_scepter_skill2_text));
                strScepterSkillText3 = (getResources().getString(R.string.zeus_scepter_skill3_text));
                strScepterSkillText4 = (getResources().getString(R.string.zeus_scepter_skill4_text));

                aghanimShardAbilityText = (getResources().getString(R.string.zeus_aghanims_shard_ability_text));

                strSkillCooldown1 = (getResources().getString(R.string.zeus_skill1_cooldown));
                strSkillCooldown2 = (getResources().getString(R.string.zeus_skill2_cooldown));
                strSkillCooldown3 = (getResources().getString(R.string.zeus_skill3_cooldown));
                strSkillCooldown4 = (getResources().getString(R.string.zeus_skill4_cooldown));

                strSkillManacost1 = (getResources().getString(R.string.zeus_skill1_manacost));
                strSkillManacost2 = (getResources().getString(R.string.zeus_skill2_manacost));
                strSkillManacost3 = (getResources().getString(R.string.zeus_skill3_manacost));
                strSkillManacost4 = (getResources().getString(R.string.zeus_skill4_manacost));


                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                aghanimShardAbility.setText(aghanimShardAbilityText);

                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);
                break;
        }
    }

    public void onClickListeners(){
        heroSkill1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //When the first skill is clicked we will set its alpha/transperancy to 1
                //So the first skill will be displayed completely while the others will be faded out
                heroSkill1.setAlpha((float) 1);
                heroSkill2.setAlpha((float) alphaValue);
                heroSkill3.setAlpha((float) alphaValue);
                heroSkill4.setAlpha((float) alphaValue);
                heroSkill5.setAlpha((float) alphaValue);
                heroSkill6.setAlpha((float) alphaValue);
                heroSkill7.setAlpha((float) alphaValue);
                heroSkill8.setAlpha((float) alphaValue);
                heroSkill9.setAlpha((float) alphaValue);
                heroSkill10.setAlpha((float) alphaValue);
                heroSkill11.setAlpha((float) alphaValue);
                heroSkill12.setAlpha((float) alphaValue);
                heroSkill13.setAlpha((float) alphaValue);
                heroSkill14.setAlpha((float) alphaValue);

                skillName.setText(strSkillName1);
                skillDescription.setText(strSkillDescription1);
                skillText.setText(strSkillText1);
                scepterSkillText.setText(strScepterSkillText1);
                skillCooldown.setText(strSkillCooldown1);
                skillManacost.setText(strSkillManacost1);

            }
        });

        heroSkill2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                heroSkill1.setAlpha((float) alphaValue);
                heroSkill2.setAlpha((float) 1);
                heroSkill3.setAlpha((float) alphaValue);
                heroSkill4.setAlpha((float) alphaValue);
                heroSkill5.setAlpha((float) alphaValue);
                heroSkill6.setAlpha((float) alphaValue);
                heroSkill7.setAlpha((float) alphaValue);
                heroSkill8.setAlpha((float) alphaValue);
                heroSkill9.setAlpha((float) alphaValue);
                heroSkill10.setAlpha((float) alphaValue);
                heroSkill11.setAlpha((float) alphaValue);
                heroSkill12.setAlpha((float) alphaValue);
                heroSkill13.setAlpha((float) alphaValue);
                heroSkill14.setAlpha((float) alphaValue);

                skillName.setText(strSkillName2);
                skillDescription.setText(strSkillDescription2);
                skillText.setText(strSkillText2);
                scepterSkillText.setText(strScepterSkillText2);
                skillCooldown.setText(strSkillCooldown2);
                skillManacost.setText(strSkillManacost2);
            }
        });

        heroSkill3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                heroSkill1.setAlpha((float) alphaValue);
                heroSkill2.setAlpha((float) alphaValue);
                heroSkill3.setAlpha((float) 1);
                heroSkill4.setAlpha((float) alphaValue);
                heroSkill5.setAlpha((float) alphaValue);
                heroSkill6.setAlpha((float) alphaValue);
                heroSkill7.setAlpha((float) alphaValue);
                heroSkill8.setAlpha((float) alphaValue);
                heroSkill9.setAlpha((float) alphaValue);
                heroSkill10.setAlpha((float) alphaValue);
                heroSkill11.setAlpha((float) alphaValue);
                heroSkill12.setAlpha((float) alphaValue);
                heroSkill13.setAlpha((float) alphaValue);
                heroSkill14.setAlpha((float) alphaValue);

                skillName.setText(strSkillName3);
                skillDescription.setText(strSkillDescription3);
                skillText.setText(strSkillText3);
                scepterSkillText.setText(strScepterSkillText3);
                skillCooldown.setText(strSkillCooldown3);
                skillManacost.setText(strSkillManacost3);
            }
        });

        heroSkill4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                heroSkill1.setAlpha((float) alphaValue);
                heroSkill2.setAlpha((float) alphaValue);
                heroSkill3.setAlpha((float) alphaValue);
                heroSkill4.setAlpha((float) 1);
                heroSkill5.setAlpha((float) alphaValue);
                heroSkill6.setAlpha((float) alphaValue);
                heroSkill7.setAlpha((float) alphaValue);
                heroSkill8.setAlpha((float) alphaValue);
                heroSkill9.setAlpha((float) alphaValue);
                heroSkill10.setAlpha((float) alphaValue);
                heroSkill11.setAlpha((float) alphaValue);
                heroSkill12.setAlpha((float) alphaValue);
                heroSkill13.setAlpha((float) alphaValue);
                heroSkill14.setAlpha((float) alphaValue);

                skillName.setText(strSkillName4);
                skillDescription.setText(strSkillDescription4);
                skillText.setText(strSkillText4);
                scepterSkillText.setText(strScepterSkillText4);
                skillCooldown.setText(strSkillCooldown4);
                skillManacost.setText(strSkillManacost4);
            }
        });

        heroSkill5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                heroSkill1.setAlpha((float) alphaValue);
                heroSkill2.setAlpha((float) alphaValue);
                heroSkill3.setAlpha((float) alphaValue);
                heroSkill4.setAlpha((float) alphaValue);
                heroSkill5.setAlpha((float) 1);
                heroSkill6.setAlpha((float) alphaValue);
                heroSkill7.setAlpha((float) alphaValue);
                heroSkill8.setAlpha((float) alphaValue);
                heroSkill9.setAlpha((float) alphaValue);
                heroSkill10.setAlpha((float) alphaValue);
                heroSkill11.setAlpha((float) alphaValue);
                heroSkill12.setAlpha((float) alphaValue);
                heroSkill13.setAlpha((float) alphaValue);
                heroSkill14.setAlpha((float) alphaValue);

                skillName.setText(strSkillName5);
                skillDescription.setText(strSkillDescription5);
                skillText.setText(strSkillText5);
                scepterSkillText.setText(strScepterSkillText5);
                skillCooldown.setText(strSkillCooldown5);
                skillManacost.setText(strSkillManacost5);
            }
        });

        heroSkill6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                heroSkill1.setAlpha((float) alphaValue);
                heroSkill2.setAlpha((float) alphaValue);
                heroSkill3.setAlpha((float) alphaValue);
                heroSkill4.setAlpha((float) alphaValue);
                heroSkill5.setAlpha((float) alphaValue);
                heroSkill6.setAlpha((float) 1);
                heroSkill7.setAlpha((float) alphaValue);
                heroSkill8.setAlpha((float) alphaValue);
                heroSkill9.setAlpha((float) alphaValue);
                heroSkill10.setAlpha((float) alphaValue);
                heroSkill11.setAlpha((float) alphaValue);
                heroSkill12.setAlpha((float) alphaValue);
                heroSkill13.setAlpha((float) alphaValue);
                heroSkill14.setAlpha((float) alphaValue);

                skillName.setText(strSkillName6);
                skillDescription.setText(strSkillDescription6);
                skillText.setText(strSkillText6);
                scepterSkillText.setText(strScepterSkillText6);
                skillCooldown.setText(strSkillCooldown6);
                skillManacost.setText(strSkillManacost6);
            }
        });

        heroSkill7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                heroSkill1.setAlpha((float) alphaValue);
                heroSkill2.setAlpha((float) alphaValue);
                heroSkill3.setAlpha((float) alphaValue);
                heroSkill4.setAlpha((float) alphaValue);
                heroSkill5.setAlpha((float) alphaValue);
                heroSkill6.setAlpha((float) alphaValue);
                heroSkill7.setAlpha((float) 1);
                heroSkill8.setAlpha((float) alphaValue);
                heroSkill9.setAlpha((float) alphaValue);
                heroSkill10.setAlpha((float) alphaValue);
                heroSkill11.setAlpha((float) alphaValue);
                heroSkill12.setAlpha((float) alphaValue);
                heroSkill13.setAlpha((float) alphaValue);
                heroSkill14.setAlpha((float) alphaValue);

                skillName.setText(strSkillName7);
                skillDescription.setText(strSkillDescription7);
                skillText.setText(strSkillText7);
                scepterSkillText.setText(strScepterSkillText7);
                skillCooldown.setText(strSkillCooldown7);
                skillManacost.setText(strSkillManacost7);
            }
        });

        heroSkill8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                heroSkill1.setAlpha((float) alphaValue);
                heroSkill2.setAlpha((float) alphaValue);
                heroSkill3.setAlpha((float) alphaValue);
                heroSkill4.setAlpha((float) alphaValue);
                heroSkill5.setAlpha((float) alphaValue);
                heroSkill6.setAlpha((float) alphaValue);
                heroSkill7.setAlpha((float) alphaValue);
                heroSkill8.setAlpha((float) 1);
                heroSkill9.setAlpha((float) alphaValue);
                heroSkill10.setAlpha((float) alphaValue);
                heroSkill11.setAlpha((float) alphaValue);
                heroSkill12.setAlpha((float) alphaValue);
                heroSkill13.setAlpha((float) alphaValue);
                heroSkill14.setAlpha((float) alphaValue);

                skillName.setText(strSkillName8);
                skillDescription.setText(strSkillDescription8);
                skillText.setText(strSkillText8);
                scepterSkillText.setText(strScepterSkillText8);
                skillCooldown.setText(strSkillCooldown8);
                skillManacost.setText(strSkillManacost8);
            }
        });

        heroSkill9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                heroSkill1.setAlpha((float) alphaValue);
                heroSkill2.setAlpha((float) alphaValue);
                heroSkill3.setAlpha((float) alphaValue);
                heroSkill4.setAlpha((float) alphaValue);
                heroSkill5.setAlpha((float) alphaValue);
                heroSkill6.setAlpha((float) alphaValue);
                heroSkill7.setAlpha((float) alphaValue);
                heroSkill8.setAlpha((float) alphaValue);
                heroSkill9.setAlpha((float) 1);
                heroSkill10.setAlpha((float) alphaValue);
                heroSkill11.setAlpha((float) alphaValue);
                heroSkill12.setAlpha((float) alphaValue);
                heroSkill13.setAlpha((float) alphaValue);
                heroSkill14.setAlpha((float) alphaValue);

                skillName.setText(strSkillName9);
                skillDescription.setText(strSkillDescription9);
                skillText.setText(strSkillText9);
                scepterSkillText.setText(strScepterSkillText9);
                skillCooldown.setText(strSkillCooldown9);
                skillManacost.setText(strSkillManacost9);
            }
        });

        heroSkill10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                heroSkill1.setAlpha((float) alphaValue);
                heroSkill2.setAlpha((float) alphaValue);
                heroSkill3.setAlpha((float) alphaValue);
                heroSkill4.setAlpha((float) alphaValue);
                heroSkill5.setAlpha((float) alphaValue);
                heroSkill6.setAlpha((float) alphaValue);
                heroSkill7.setAlpha((float) alphaValue);
                heroSkill8.setAlpha((float) alphaValue);
                heroSkill9.setAlpha((float) alphaValue);
                heroSkill10.setAlpha((float) 1);
                heroSkill11.setAlpha((float) alphaValue);
                heroSkill12.setAlpha((float) alphaValue);
                heroSkill13.setAlpha((float) alphaValue);
                heroSkill14.setAlpha((float) alphaValue);

                skillName.setText(strSkillName10);
                skillDescription.setText(strSkillDescription10);
                skillText.setText(strSkillText10);
                scepterSkillText.setText(strScepterSkillText10);
                skillCooldown.setText(strSkillCooldown10);
                skillManacost.setText(strSkillManacost10);
            }
        });

        heroSkill11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                heroSkill1.setAlpha((float) alphaValue);
                heroSkill2.setAlpha((float) alphaValue);
                heroSkill3.setAlpha((float) alphaValue);
                heroSkill4.setAlpha((float) alphaValue);
                heroSkill5.setAlpha((float) alphaValue);
                heroSkill6.setAlpha((float) alphaValue);
                heroSkill7.setAlpha((float) alphaValue);
                heroSkill8.setAlpha((float) alphaValue);
                heroSkill9.setAlpha((float) alphaValue);
                heroSkill10.setAlpha((float) alphaValue);
                heroSkill11.setAlpha((float) 1);
                heroSkill12.setAlpha((float) alphaValue);
                heroSkill13.setAlpha((float) alphaValue);
                heroSkill14.setAlpha((float) alphaValue);

                skillName.setText(strSkillName11);
                skillDescription.setText(strSkillDescription11);
                skillText.setText(strSkillText11);
                scepterSkillText.setText(strScepterSkillText11);
                skillCooldown.setText(strSkillCooldown11);
                skillManacost.setText(strSkillManacost11);
            }
        });

        heroSkill12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                heroSkill1.setAlpha((float) alphaValue);
                heroSkill2.setAlpha((float) alphaValue);
                heroSkill3.setAlpha((float) alphaValue);
                heroSkill4.setAlpha((float) alphaValue);
                heroSkill5.setAlpha((float) alphaValue);
                heroSkill6.setAlpha((float) alphaValue);
                heroSkill7.setAlpha((float) alphaValue);
                heroSkill8.setAlpha((float) alphaValue);
                heroSkill9.setAlpha((float) alphaValue);
                heroSkill10.setAlpha((float) alphaValue);
                heroSkill11.setAlpha((float) alphaValue);
                heroSkill12.setAlpha((float) 1);
                heroSkill13.setAlpha((float) alphaValue);
                heroSkill14.setAlpha((float) alphaValue);

                skillName.setText(strSkillName12);
                skillDescription.setText(strSkillDescription12);
                skillText.setText(strSkillText12);
                scepterSkillText.setText(strScepterSkillText12);
                skillCooldown.setText(strSkillCooldown12);
                skillManacost.setText(strSkillManacost12);
            }
        });

        heroSkill13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                heroSkill1.setAlpha((float) alphaValue);
                heroSkill2.setAlpha((float) alphaValue);
                heroSkill3.setAlpha((float) alphaValue);
                heroSkill4.setAlpha((float) alphaValue);
                heroSkill5.setAlpha((float) alphaValue);
                heroSkill6.setAlpha((float) alphaValue);
                heroSkill7.setAlpha((float) alphaValue);
                heroSkill8.setAlpha((float) alphaValue);
                heroSkill9.setAlpha((float) alphaValue);
                heroSkill10.setAlpha((float) alphaValue);
                heroSkill11.setAlpha((float) alphaValue);
                heroSkill12.setAlpha((float) alphaValue);
                heroSkill13.setAlpha((float) 1);
                heroSkill14.setAlpha((float) alphaValue);

                skillName.setText(strSkillName13);
                skillDescription.setText(strSkillDescription13);
                skillText.setText(strSkillText13);
                scepterSkillText.setText(strScepterSkillText13);
                skillCooldown.setText(strSkillCooldown13);
                skillManacost.setText(strSkillManacost13);
            }
        });

        heroSkill14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                heroSkill1.setAlpha((float) alphaValue);
                heroSkill2.setAlpha((float) alphaValue);
                heroSkill3.setAlpha((float) alphaValue);
                heroSkill4.setAlpha((float) alphaValue);
                heroSkill5.setAlpha((float) alphaValue);
                heroSkill6.setAlpha((float) alphaValue);
                heroSkill7.setAlpha((float) alphaValue);
                heroSkill8.setAlpha((float) alphaValue);
                heroSkill9.setAlpha((float) alphaValue);
                heroSkill10.setAlpha((float) alphaValue);
                heroSkill11.setAlpha((float) alphaValue);
                heroSkill12.setAlpha((float) alphaValue);
                heroSkill13.setAlpha((float) alphaValue);
                heroSkill14.setAlpha((float) 1);

                skillName.setText(strSkillName14);
                skillDescription.setText(strSkillDescription14);
                skillText.setText(strSkillText14);
                scepterSkillText.setText(strScepterSkillText14);
                skillCooldown.setText(strSkillCooldown14);
                skillManacost.setText(strSkillManacost14);
            }
        });
    }

}