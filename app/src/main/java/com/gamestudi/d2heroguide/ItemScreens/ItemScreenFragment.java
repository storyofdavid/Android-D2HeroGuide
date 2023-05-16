package com.gamestudi.d2heroguide.ItemScreens;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.gamestudi.d2heroguide.R;
import com.google.android.gms.ads.AdRequest;

public class ItemScreenFragment extends FragmentActivity {


    //Is used for the adview
    private com.google.android.gms.ads.AdView AdView;


    //Imageview used to display the item, gold, cooldown & manacost
    ImageView itemIcon;
    ImageView itemGold;
    ImageView itemCooldown;
    ImageView itemManaCost;

    //Imageview used to display items that build into
    ImageView itemBuildInto1;
    ImageView itemBuildInto2;
    ImageView itemBuildInto3;
    ImageView itemBuildInto4;
    ImageView itemBuildInto5;
    ImageView itemBuildInto6;
    ImageView itemBuildInto7;

    //Imageview used to display items that are built from
    ImageView itemBuildFrom1;
    ImageView itemBuildFrom2;
    ImageView itemBuildFrom3;
    ImageView itemBuildFrom4;
    ImageView itemBuildFrom5;
    ImageView itemBuildFrom6;

    //Imageview used to display the item chosen
    ImageView itemChosen;

    //Imageview used to display arrows
    ImageView upArrow;
    ImageView downArrow;

    //View used to display the line dividers
    View line1;
    View line2;

    //Starts referencing all of the required fields from the XML file.
    TextView itemName;
    TextView itemGoldText;
    TextView itemCooldownText;
    TextView itemManacostText;
    TextView itemDescription;
    TextView itemAbility;

    //Layout that describes the items ability.
    //We wil reference it as we will want to hide this view for items that don't have an ability
    LinearLayout layoutAbility;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_screen_fragment);


        //Loads the ad as soon as the activity is created
        AdView = (com.google.android.gms.ads.AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        AdView.loadAd(adRequest);


        itemIcon = (ImageView) findViewById(R.id.itemIcon);
        itemGold = (ImageView) findViewById(R.id.itemGold);
        itemCooldown = (ImageView) findViewById(R.id.cooldown);
        itemManaCost = (ImageView) findViewById(R.id.manaCost);

        itemBuildInto1 = (ImageView) findViewById(R.id.itemBuildInto1);
        itemBuildInto2 = (ImageView) findViewById(R.id.itemBuildInto2);
        itemBuildInto3 = (ImageView) findViewById(R.id.itemBuildInto3);
        itemBuildInto4 = (ImageView) findViewById(R.id.itemBuildInto4);
        itemBuildInto5 = (ImageView) findViewById(R.id.itemBuildInto5);
        itemBuildInto6 = (ImageView) findViewById(R.id.itemBuildInto6);
        itemBuildInto7 = (ImageView) findViewById(R.id.itemBuildInto7);

        itemBuildFrom1 = (ImageView) findViewById(R.id.itemBuildFrom1);
        itemBuildFrom2 = (ImageView) findViewById(R.id.itemBuildFrom2);
        itemBuildFrom3 = (ImageView) findViewById(R.id.itemBuildFrom3);
        itemBuildFrom4 = (ImageView) findViewById(R.id.itemBuildFrom4);
        itemBuildFrom5 = (ImageView) findViewById(R.id.itemBuildFrom5);
        itemBuildFrom6 = (ImageView) findViewById(R.id.itemBuildFrom6);

        itemChosen = (ImageView) findViewById(R.id.itemChosen);

        upArrow = (ImageView) findViewById(R.id.upArrow);
        downArrow = (ImageView) findViewById(R.id.downArrow);

        line1 = findViewById(R.id.line1);
        line2 = findViewById(R.id.line2);

        itemName = (TextView) findViewById(R.id.itemName);
        itemGoldText = (TextView) findViewById(R.id.goldText);
        itemCooldownText = (TextView) findViewById(R.id.cooldownText);
        itemManacostText = (TextView) findViewById(R.id.manaCostText);
        itemDescription = (TextView) findViewById(R.id.itemDescription);
        itemAbility = (TextView) findViewById(R.id.itemAbility);

        layoutAbility = (LinearLayout) findViewById(R.id.layoutAbility);

        loadBasicItemsSelection();
        loadUpgradedItemsSelection();
        loadSecretItemsSelection();
        loadNeutralItemsSelection();
    }


    public void loadBasicItemsSelection() {


        //Is used to get the intent values passed from the previous class
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        //Is used to get the itemSelected value from the previous class
        String itemSelected = extras.getString("itemSelected");


        switch (itemSelected) {

            //******************************************************************************
            //ALL OF THE SWITCH CASES FOR BASIC ITEMS
            //******************************************************************************
            case "tp_scroll":
                itemIcon.setImageResource(R.drawable.item_town_portal_scroll);
                itemName.setText(R.string.tp_scroll);
                itemGoldText.setText(R.string.tp_scroll_gold);
                itemCooldownText.setText(R.string.tp_scroll_cooldown);
                itemManacostText.setText(R.string.tp_scroll_manacost);
                itemDescription.setText(R.string.tp_scroll_description);
                itemAbility.setText(R.string.tp_scroll_ability);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_town_portal_scroll);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "clarity":
                itemIcon.setImageResource(R.drawable.item_clarity);
                itemName.setText(R.string.clarity);
                itemGoldText.setText(R.string.clarity_gold);
                itemCooldownText.setText(R.string.clarity_cooldown);
                itemManacostText.setText(R.string.clarity_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.clarity_description);
                itemAbility.setText(R.string.clarity_ability);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_clarity);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "faerie_fire":
                itemIcon.setImageResource(R.drawable.item_faerie_fire);
                itemName.setText(R.string.faerie_fire);
                itemGoldText.setText(R.string.faerie_fire_gold);
                itemCooldownText.setText(R.string.faerie_fire_cooldown);
                itemManacostText.setText(R.string.faerie_fire_manacost);
                itemDescription.setText(R.string.faerie_fire_description);
                itemAbility.setText(R.string.faerie_fire_ability);

                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_faerie_fire);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "smoke_of_deceit":
                itemIcon.setImageResource(R.drawable.item_smoke_of_deceit);
                itemName.setText(R.string.smoke_of_deceit);
                itemGoldText.setText(R.string.smoke_of_deceit_gold);
                itemCooldownText.setText(R.string.smoke_of_deceit_cooldown);
                itemManacostText.setText(R.string.smoke_of_deceit_manacost);
                itemDescription.setText(R.string.smoke_of_deceit_description);
                itemAbility.setText(R.string.smoke_of_deceit_ability);

                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_smoke_of_deceit);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "observer_ward":
                itemIcon.setImageResource(R.drawable.item_observer_ward);
                itemName.setText(R.string.observer_ward);
                itemGoldText.setText(R.string.observer_ward_gold);
                itemCooldownText.setText(R.string.observer_ward_cooldown);
                itemManacostText.setText(R.string.observer_ward_manacost);
                itemDescription.setText(R.string.observer_ward_description);
                itemAbility.setText(R.string.observer_ward_ability);

                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_observer_ward);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "sentry_ward":
                itemIcon.setImageResource(R.drawable.item_sentry_ward);
                itemName.setText(R.string.sentry_ward);
                itemGoldText.setText(R.string.sentry_ward_gold);
                itemCooldownText.setText(R.string.sentry_ward_cooldown);
                itemManacostText.setText(R.string.sentry_ward_manacost);
                itemDescription.setText(R.string.sentry_ward_description);
                itemAbility.setText(R.string.sentry_ward_ability);

                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_sentry_ward);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "enchanted_mango":
                itemIcon.setImageResource(R.drawable.item_enchanted_mango);
                itemName.setText(R.string.enchanted_mango);
                itemGoldText.setText(R.string.enchanted_mango_gold);
                itemCooldownText.setText(R.string.enchanted_mango_cooldown);
                itemManacostText.setText(R.string.enchanted_mango_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.enchanted_mango_description);
                itemAbility.setText(R.string.enchanted_mango_ability);

                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_enchanted_mango);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);
                upArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "healing_salve":
                itemIcon.setImageResource(R.drawable.item_healing_salve);
                itemName.setText(R.string.healing_salve);
                itemGoldText.setText(R.string.healing_salve_gold);
                itemCooldownText.setText(R.string.healing_salve_cooldown);
                itemManacostText.setText(R.string.healing_salve_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.healing_salve_description);
                itemAbility.setText(R.string.healing_salve_ability);

                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_healing_salve);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "tango":
                itemIcon.setImageResource(R.drawable.item_tango);
                itemName.setText(R.string.tango);
                itemGoldText.setText(R.string.tango_gold);
                itemCooldownText.setText(R.string.tango_cooldown);
                itemManacostText.setText(R.string.tango_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.tango_description);
                itemAbility.setText(R.string.tango_ability);

                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_tango);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "tome_of_knowledge":
                itemIcon.setImageResource(R.drawable.item_tome_of_knowledge);
                itemName.setText(R.string.tome_of_knowledge);
                itemGoldText.setText(R.string.tome_of_knowledge_gold);
                itemCooldownText.setText(R.string.tome_of_knowledge_cooldown);
                itemManacostText.setText(R.string.tome_of_knowledge_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.tome_of_knowledge_description);
                itemAbility.setText(R.string.tome_of_knowledge_ability);

                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_tome_of_knowledge);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "dust_of_appearance":
                itemIcon.setImageResource(R.drawable.item_dust_of_appearance);
                itemName.setText(R.string.dust_of_appearance);
                itemGoldText.setText(R.string.dust_of_appearance_gold);
                itemCooldownText.setText(R.string.dust_of_appearance_cooldown);
                itemManacostText.setText(R.string.dust_of_appearance_manacost);
                itemDescription.setText(R.string.dust_of_appearance_description);
                itemAbility.setText(R.string.dust_of_appearance_ability);

                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_dust_of_appearance);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;


            case "bottle":
                itemIcon.setImageResource(R.drawable.item_bottle);
                itemName.setText(R.string.bottle);
                itemGoldText.setText(R.string.bottle_gold);
                itemCooldownText.setText(R.string.bottle_cooldown);
                itemManacostText.setText(R.string.bottle_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.bottle_description);
                itemAbility.setText(R.string.bottle_ability);

                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_bottle);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "iron_branch":
                itemIcon.setImageResource(R.drawable.item_ironwood_branch);
                itemName.setText(R.string.iron_branch);
                itemGoldText.setText(R.string.iron_branch_gold);
                itemCooldownText.setText(R.string.iron_branch_cooldown);
                itemManacostText.setText(R.string.iron_branch_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.iron_branch_description);
                itemAbility.setText(R.string.iron_branch_ability);

                itemBuildInto1.setImageResource(R.drawable.item_magic_wand);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_ironwood_branch);
                downArrow.setVisibility(View.GONE);
                break;

            case "gauntlets_of_strength":
                itemIcon.setImageResource(R.drawable.item_gauntlets_of_strength);
                itemName.setText(R.string.gautlents_of_strength);
                itemGoldText.setText(R.string.gautlents_of_strength_gold);
                itemCooldownText.setText(R.string.gautlents_of_strength_cooldown);
                itemManacostText.setText(R.string.gautlents_of_strength_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.gautlents_of_strength_description);
                itemAbility.setText(R.string.gautlents_of_strength_ability);

                itemBuildInto1.setImageResource(R.drawable.item_bracer);
                itemBuildInto2.setImageResource(R.drawable.item_soul_ring);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_gauntlets_of_strength);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "slippers_of_agility":
                itemIcon.setImageResource(R.drawable.item_slippers_of_agility);
                itemName.setText(R.string.slippers_of_agility);
                itemGoldText.setText(R.string.slippers_of_agility_gold);
                itemCooldownText.setText(R.string.slippers_of_agility_cooldown);
                itemManacostText.setText(R.string.slippers_of_agility_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.slippers_of_agility_description);
                itemAbility.setText(R.string.slippers_of_agility_ability);

                itemBuildInto1.setImageResource(R.drawable.item_wraith_band);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_slippers_of_agility);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "mantle_of_intelligence":
                itemIcon.setImageResource(R.drawable.item_mantle_of_intelligence);
                itemName.setText(R.string.mantle_of_intelligence);
                itemGoldText.setText(R.string.mantle_of_intelligence_gold);
                itemCooldownText.setText(R.string.mantle_of_intelligence_cooldown);
                itemManacostText.setText(R.string.mantle_of_intelligence_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.mantle_of_intelligence_description);
                itemAbility.setText(R.string.mantle_of_intelligence_ability);

                itemBuildInto1.setImageResource(R.drawable.item_null_talisman);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_mantle_of_intelligence);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "circlet":
                itemIcon.setImageResource(R.drawable.item_circlet);
                itemName.setText(R.string.circlet);
                itemGoldText.setText(R.string.circlet_gold);
                itemCooldownText.setText(R.string.circlet_cooldown);
                itemManacostText.setText(R.string.circlet_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.circlet_description);
                itemAbility.setText(R.string.circlet_ability);

                itemBuildInto1.setImageResource(R.drawable.item_bracer);
                itemBuildInto2.setImageResource(R.drawable.item_null_talisman);
                itemBuildInto3.setImageResource(R.drawable.item_wraith_band);
                itemBuildInto4.setImageResource(R.drawable.item_urn_of_shadows);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_circlet);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "belt_of_strength":
                itemIcon.setImageResource(R.drawable.item_belt_of_strength);
                itemName.setText(R.string.belt_of_strength);
                itemGoldText.setText(R.string.belt_of_strength_gold);
                itemCooldownText.setText(R.string.belt_of_strength_cooldown);
                itemManacostText.setText(R.string.belt_of_strength_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.belt_of_strength_description);
                itemAbility.setText(R.string.belt_of_strength_ability);

                itemBuildInto1.setImageResource(R.drawable.item_power_treads);
                itemBuildInto2.setImageResource(R.drawable.item_skull_basher);
                itemBuildInto3.setImageResource(R.drawable.item_sange);
                itemBuildInto4.setImageResource(R.drawable.item_drum_of_endurance);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_belt_of_strength);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "band_of_elvenskin":
                itemIcon.setImageResource(R.drawable.item_band_of_elvenskin);
                itemName.setText(R.string.band_of_elvenskin);
                itemGoldText.setText(R.string.band_of_elvenskin_gold);
                itemCooldownText.setText(R.string.band_of_elvenskin_cooldown);
                itemManacostText.setText(R.string.band_of_elvenskin_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.band_of_elvenskin_description);
                itemAbility.setText(R.string.band_of_elvenskin_ability);

                itemBuildInto1.setImageResource(R.drawable.item_power_treads);
                itemBuildInto2.setImageResource(R.drawable.item_dragon_lance);
                itemBuildInto3.setImageResource(R.drawable.item_yasha);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_band_of_elvenskin);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "robe_of_the_magi":
                itemIcon.setImageResource(R.drawable.item_robe_of_the_magi);
                itemName.setText(R.string.robe_of_the_magi);
                itemGoldText.setText(R.string.robe_of_the_magi_gold);
                itemCooldownText.setText(R.string.robe_of_the_magi_cooldown);
                itemManacostText.setText(R.string.robe_of_the_magi_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.robe_of_the_magi_description);
                itemAbility.setText(R.string.robe_of_the_magi_ability);

                itemBuildInto1.setImageResource(R.drawable.item_power_treads);
                itemBuildInto2.setImageResource(R.drawable.item_oblivion_staff);
                itemBuildInto3.setImageResource(R.drawable.item_kaya);
                itemBuildInto4.setImageResource(R.drawable.item_diffusal_blade);
                itemBuildInto5.setImageResource(R.drawable.item_witch_blade);
                itemBuildInto6.setImageResource(R.drawable.item_drum_of_endurance);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_robe_of_the_magi);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "ogre_axe":
                itemIcon.setImageResource(R.drawable.item_ogre_axe);
                itemName.setText(R.string.ogre_axe);
                itemGoldText.setText(R.string.ogre_axe_gold);
                itemCooldownText.setText(R.string.ogre_axe_cooldown);
                itemManacostText.setText(R.string.ogre_axe_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.ogre_axe_description);
                itemAbility.setText(R.string.ogre_axe_ability);

                itemBuildInto1.setImageResource(R.drawable.item_echo_sabre);
                itemBuildInto2.setImageResource(R.drawable.item_aghanims_scepter);
                itemBuildInto3.setImageResource(R.drawable.item_black_king_bar);
                itemBuildInto4.setImageResource(R.drawable.item_dragon_lance);
                itemBuildInto5.setImageResource(R.drawable.item_sange);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_ogre_axe);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "blade_of_alacrity":
                itemIcon.setImageResource(R.drawable.item_blade_of_alacrity);
                itemName.setText(R.string.blade_of_alacrity);
                itemGoldText.setText(R.string.blade_of_alacrity_gold);
                itemCooldownText.setText(R.string.blade_of_alacrity_cooldown);
                itemManacostText.setText(R.string.blade_of_alacrity_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.blade_of_alacrity_description);
                itemAbility.setText(R.string.blade_of_alacrity_ability);

                itemBuildInto1.setImageResource(R.drawable.item_aghanims_scepter);
                itemBuildInto2.setImageResource(R.drawable.item_diffusal_blade);
                itemBuildInto3.setImageResource(R.drawable.item_yasha);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_blade_of_alacrity);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "staff_of_wizardry":
                itemIcon.setImageResource(R.drawable.item_staff_of_wizardry);
                itemName.setText(R.string.staff_of_wizardry);
                itemGoldText.setText(R.string.staff_of_wizardry_gold);
                itemCooldownText.setText(R.string.staff_of_wizardry_cooldown);
                itemManacostText.setText(R.string.staff_of_wizardry_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.staff_of_wizardry_description);
                itemAbility.setText(R.string.staff_of_wizardry_ability);

                itemBuildInto1.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                itemBuildInto2.setImageResource(R.drawable.item_force_staff);
                itemBuildInto3.setImageResource(R.drawable.item_aghanims_scepter);
                itemBuildInto4.setImageResource(R.drawable.item_kaya);
                itemBuildInto5.setImageResource(R.drawable.item_rod_of_atos);
                itemBuildInto6.setImageResource(R.drawable.item_dagon);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_staff_of_wizardry);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "ring_of_protection":
                itemIcon.setImageResource(R.drawable.item_ring_of_protection);
                itemName.setText(R.string.ring_of_protection);
                itemGoldText.setText(R.string.ring_of_protection_gold);
                itemCooldownText.setText(R.string.ring_of_protection_cooldown);
                itemManacostText.setText(R.string.ring_of_protection_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.ring_of_protection_description);
                itemAbility.setText(R.string.ring_of_protection_ability);

                itemBuildInto1.setImageResource(R.drawable.item_buckler);
                itemBuildInto2.setImageResource(R.drawable.item_urn_of_shadows);
                itemBuildInto3.setImageResource(R.drawable.item_soul_ring);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_ring_of_protection);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;


            case "quelling_blade":
                itemIcon.setImageResource(R.drawable.item_quelling_blade);
                itemName.setText(R.string.quelling_blade);
                itemGoldText.setText(R.string.quelling_blade_gold);
                itemCooldownText.setText(R.string.quelling_blade_cooldown);
                itemManacostText.setText(R.string.quelling_blade_manacost);
                itemDescription.setText(R.string.quelling_blade_description);
                itemAbility.setText(R.string.quelling_blade_ability);

                itemBuildInto1.setImageResource(R.drawable.item_battle_fury);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_quelling_blade);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "infused_raindrops":
                itemIcon.setImageResource(R.drawable.item_infused_raindrop);
                itemName.setText(R.string.infused_raindrops);
                itemGoldText.setText(R.string.infused_raindrops_gold);
                itemCooldownText.setText(R.string.infused_raindrops_cooldown);
                itemManacostText.setText(R.string.infused_raindrops_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.infused_raindrops_description);
                itemAbility.setText(R.string.infused_raindrops_ability);

                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_infused_raindrop);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "orb_of_venom":
                itemIcon.setImageResource(R.drawable.item_orb_of_venom);
                itemName.setText(R.string.orb_of_venom);
                itemGoldText.setText(R.string.orb_of_venom_gold);
                itemCooldownText.setText(R.string.orb_of_venom_cooldown);
                itemManacostText.setText(R.string.orb_of_venom_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.orb_of_venom_description);
                itemAbility.setText(R.string.orb_of_venom_ability);

                itemBuildInto1.setImageResource(R.drawable.item_orb_of_corrosion);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_orb_of_venom);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "blight_stone":
                itemIcon.setImageResource(R.drawable.item_blight_stone);
                itemName.setText(R.string.blight_stone);
                itemGoldText.setText(R.string.blight_stone_gold);
                itemCooldownText.setText(R.string.blight_stone_cooldown);
                itemManacostText.setText(R.string.blight_stone_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.blight_stone_description);
                itemAbility.setText(R.string.blight_stone_ability);

                itemBuildInto1.setImageResource(R.drawable.item_desolator);
                itemBuildInto2.setImageResource(R.drawable.item_medallion_of_courage);
                itemBuildInto3.setImageResource(R.drawable.item_orb_of_corrosion);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_blight_stone);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "blades_of_attack":
                itemIcon.setImageResource(R.drawable.item_blades_of_attack);
                itemName.setText(R.string.blades_of_attack);
                itemGoldText.setText(R.string.blades_of_attack_gold);
                itemCooldownText.setText(R.string.blades_of_attack_cooldown);
                itemManacostText.setText(R.string.blades_of_attack_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.blades_of_attack_description);
                itemAbility.setText(R.string.blades_of_attack_ability);

                itemBuildInto1.setImageResource(R.drawable.item_phase_boots);
                itemBuildInto2.setImageResource(R.drawable.item_armlet_of_mordiggian);
                itemBuildInto3.setImageResource(R.drawable.item_crystalys);
                itemBuildInto4.setImageResource(R.drawable.item_vladmirs_offering);
                itemBuildInto5.setImageResource(R.drawable.item_falcon_blade);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_blades_of_attack);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "chainmail":
                itemIcon.setImageResource(R.drawable.item_chainmail);
                itemName.setText(R.string.chainmail);
                itemGoldText.setText(R.string.chainmail_gold);
                itemCooldownText.setText(R.string.chainmail_cooldown);
                itemManacostText.setText(R.string.chainmail_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.chainmail_description);
                itemAbility.setText(R.string.chainmail_ability);

                itemBuildInto1.setImageResource(R.drawable.item_phase_boots);
                itemBuildInto2.setImageResource(R.drawable.item_blade_mail);
                itemBuildInto3.setImageResource(R.drawable.item_medallion_of_courage);
                itemBuildInto4.setImageResource(R.drawable.item_mekansm);
                itemBuildInto5.setImageResource(R.drawable.item_witch_blade);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_chainmail);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "quarterstaff":
                itemIcon.setImageResource(R.drawable.item_quarterstaff);
                itemName.setText(R.string.quarterstaff);
                itemGoldText.setText(R.string.quarterstaff_gold);
                itemCooldownText.setText(R.string.quarterstaff_cooldown);
                itemManacostText.setText(R.string.quarterstaff_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.quarterstaff_description);
                itemAbility.setText(R.string.quarterstaff_ability);

                itemBuildInto1.setImageResource(R.drawable.item_oblivion_staff);
                itemBuildInto2.setImageResource(R.drawable.item_mask_of_madness);
                itemBuildInto3.setImageResource(R.drawable.item_butterfly);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_quarterstaff);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "helm_of_iron_will":
                itemIcon.setImageResource(R.drawable.item_helm_of_iron_will);
                itemName.setText(R.string.helm_of_ironwill);
                itemGoldText.setText(R.string.helm_of_ironwill_gold);
                itemCooldownText.setText(R.string.helm_of_ironwill_cooldown);
                itemManacostText.setText(R.string.helm_of_ironwill_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.helm_of_ironwill_description);
                itemAbility.setText(R.string.helm_of_ironwill_ability);

                itemBuildInto1.setImageResource(R.drawable.item_armlet_of_mordiggian);
                itemBuildInto2.setImageResource(R.drawable.item_crimson_guard);
                itemBuildInto3.setImageResource(R.drawable.item_nullifier);
                itemBuildInto4.setImageResource(R.drawable.item_helm_of_the_dominator);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_helm_of_iron_will);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "javelin":
                itemIcon.setImageResource(R.drawable.item_javelin);
                itemName.setText(R.string.javelin);
                itemGoldText.setText(R.string.javelin_gold);
                itemCooldownText.setText(R.string.javelin_cooldown);
                itemManacostText.setText(R.string.javelin_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.javelin_description);
                itemAbility.setText(R.string.javelin_ability);

                itemBuildInto1.setImageResource(R.drawable.item_monkey_king_bar);
                itemBuildInto2.setImageResource(R.drawable.item_maelstrom);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_javelin);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "broadsword":
                itemIcon.setImageResource(R.drawable.item_broadsword);
                itemName.setText(R.string.broadsword);
                itemGoldText.setText(R.string.broadsword_gold);
                itemCooldownText.setText(R.string.broadsword_cooldown);
                itemManacostText.setText(R.string.broadsword_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.broadsword_description);
                itemAbility.setText(R.string.broadsword_ability);

                itemBuildInto1.setImageResource(R.drawable.item_blade_mail);
                itemBuildInto2.setImageResource(R.drawable.item_crystalys);
                itemBuildInto3.setImageResource(R.drawable.item_battle_fury);
                itemBuildInto4.setImageResource(R.drawable.item_shadowblade);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_broadsword);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "blitz_knuckles":
                itemIcon.setImageResource(R.drawable.item_blitz_knuckles);
                itemName.setText(R.string.blitz_knuckles);
                itemGoldText.setText(R.string.blitz_knuckles_gold);
                itemCooldownText.setText(R.string.blitz_knuckles_cooldown);
                itemManacostText.setText(R.string.blitz_knuckles_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.blitz_knuckles_description);
                itemAbility.setText(R.string.blitz_knuckles_ability);

                itemBuildInto1.setImageResource(R.drawable.item_monkey_king_bar);
                itemBuildInto2.setImageResource(R.drawable.item_shadowblade);
                itemBuildInto3.setImageResource(R.drawable.item_witch_blade);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_blitz_knuckles);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "claymore":
                itemIcon.setImageResource(R.drawable.item_claymore);
                itemName.setText(R.string.claymore);
                itemGoldText.setText(R.string.claymore_gold);
                itemCooldownText.setText(R.string.claymore_cooldown);
                itemManacostText.setText(R.string.claymore_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.claymore_description);
                itemAbility.setText(R.string.claymore_ability);

                itemBuildInto1.setImageResource(R.drawable.item_battle_fury);
                itemBuildInto2.setImageResource(R.drawable.item_satanic);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_claymore);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "mithril_hammer":
                itemIcon.setImageResource(R.drawable.item_mithril_hammer);
                itemName.setText(R.string.mithril_hammer);
                itemGoldText.setText(R.string.mithril_hammer_gold);
                itemCooldownText.setText(R.string.mithril_hammer_cooldown);
                itemManacostText.setText(R.string.mithril_hammer_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.mithril_hammer_description);
                itemAbility.setText(R.string.mithril_hammer_ability);

                itemBuildInto1.setImageResource(R.drawable.item_black_king_bar);
                itemBuildInto2.setImageResource(R.drawable.item_desolator);
                itemBuildInto3.setImageResource(R.drawable.item_maelstrom);
                itemBuildInto4.setImageResource(R.drawable.item_skull_basher);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_mithril_hammer);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "magic_stick":
                itemIcon.setImageResource(R.drawable.item_magic_stick);
                itemName.setText(R.string.magic_stick);
                itemGoldText.setText(R.string.magic_stick_gold);
                itemCooldownText.setText(R.string.magic_stick_cooldown);
                itemManacostText.setText(R.string.magic_stick_manacost);
                itemDescription.setText(R.string.magic_stick_description);
                itemAbility.setText(R.string.magic_stick_ability);

                itemBuildInto1.setImageResource(R.drawable.item_magic_wand);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_magic_stick);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "wind_lace":
                itemIcon.setImageResource(R.drawable.item_wind_lace);
                itemName.setText(R.string.wind_lace);
                itemGoldText.setText(R.string.wind_lace_gold);
                itemCooldownText.setText(R.string.wind_lace_cooldown);
                itemManacostText.setText(R.string.wind_lace_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.wind_lace_description);
                itemAbility.setText(R.string.wind_lace_ability);

                itemBuildInto1.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                itemBuildInto2.setImageResource(R.drawable.item_drum_of_endurance);
                itemBuildInto3.setImageResource(R.drawable.item_tranquil_boots);
                itemBuildInto4.setImageResource(R.drawable.item_solar_crest);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_wind_lace);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "ring_of_regen":
                itemIcon.setImageResource(R.drawable.item_ring_of_regen);
                itemName.setText(R.string.ring_of_regen);
                itemGoldText.setText(R.string.ring_of_regen_gold);
                itemCooldownText.setText(R.string.ring_of_regen_cooldown);
                itemManacostText.setText(R.string.ring_of_regen_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.ring_of_regen_description);
                itemAbility.setText(R.string.ring_of_regen_ability);

                itemBuildInto1.setImageResource(R.drawable.item_headdress);
                itemBuildInto2.setImageResource(R.drawable.item_hood_of_defiance);
                itemBuildInto3.setImageResource(R.drawable.item_tranquil_boots);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_ring_of_regen);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "sages_mask":
                itemIcon.setImageResource(R.drawable.item_sages_mask);
                itemName.setText(R.string.sages_mask);
                itemGoldText.setText(R.string.sages_mask_gold);
                itemCooldownText.setText(R.string.sages_mask_cooldown);
                itemManacostText.setText(R.string.sages_mask_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.sages_mask_description);
                itemAbility.setText(R.string.sages_mask_ability);

                itemBuildInto1.setImageResource(R.drawable.item_ring_of_basilius);
                itemBuildInto2.setImageResource(R.drawable.item_medallion_of_courage);
                itemBuildInto3.setImageResource(R.drawable.item_oblivion_staff);
                itemBuildInto4.setImageResource(R.drawable.item_urn_of_shadows);
                itemBuildInto5.setImageResource(R.drawable.item_falcon_blade);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_sages_mask);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "boots_of_speed":
                itemIcon.setImageResource(R.drawable.item_boots_of_speed);
                itemName.setText(R.string.boots_of_speed);
                itemGoldText.setText(R.string.boots_of_speed_gold);
                itemCooldownText.setText(R.string.boots_of_speed_cooldown);
                itemManacostText.setText(R.string.boots_of_speed_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.boots_of_speed_description);
                itemAbility.setText(R.string.boots_of_speed_ability);

                itemBuildInto1.setImageResource(R.drawable.item_tranquil_boots);
                itemBuildInto2.setImageResource(R.drawable.item_power_treads);
                itemBuildInto3.setImageResource(R.drawable.item_arcane_boots);
                itemBuildInto4.setImageResource(R.drawable.item_phase_boots);
                itemBuildInto5.setImageResource(R.drawable.item_boots_of_travel);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_boots_of_speed);
                downArrow.setVisibility(View.GONE);
                layoutAbility.setVisibility(View.GONE);
                break;

            case "gloves_of_haste":
                itemIcon.setImageResource(R.drawable.item_gloves_of_haste);
                itemName.setText(R.string.gloves_of_haste);
                itemGoldText.setText(R.string.gloves_of_haste_gold);
                itemCooldownText.setText(R.string.gloves_of_haste_cooldown);
                itemManacostText.setText(R.string.gloves_of_haste_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.gloves_of_haste_description);
                itemAbility.setText(R.string.gloves_of_haste_ability);

                itemBuildInto1.setImageResource(R.drawable.item_power_treads);
                itemBuildInto2.setImageResource(R.drawable.item_hand_of_midas);
                itemBuildInto3.setImageResource(R.drawable.item_armlet_of_mordiggian);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_gloves_of_haste);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "cloak":
                itemIcon.setImageResource(R.drawable.item_cloak);
                itemName.setText(R.string.cloak);
                itemGoldText.setText(R.string.cloak_gold);
                itemCooldownText.setText(R.string.cloak_cooldown);
                itemManacostText.setText(R.string.cloak_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.cloak_description);
                itemAbility.setText(R.string.cloak_ability);

                itemBuildInto1.setImageResource(R.drawable.item_hood_of_defiance);
                itemBuildInto2.setImageResource(R.drawable.item_glimmer_cape);
                itemBuildInto3.setImageResource(R.drawable.item_mage_slayer);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_cloak);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "ring_of_health":
                itemIcon.setImageResource(R.drawable.item_ring_of_health);
                itemName.setText(R.string.ring_of_health);
                itemGoldText.setText(R.string.ring_of_health_gold);
                itemCooldownText.setText(R.string.ring_of_health_cooldown);
                itemManacostText.setText(R.string.ring_of_health_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.ring_of_health_description);
                itemAbility.setText(R.string.ring_of_health_ability);

                itemBuildInto1.setImageResource(R.drawable.item_hood_of_defiance);
                itemBuildInto2.setImageResource(R.drawable.item_perserverance);
                itemBuildInto3.setImageResource(R.drawable.item_vanguard);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_ring_of_health);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "void_stone":
                itemIcon.setImageResource(R.drawable.item_void_stone);
                itemName.setText(R.string.void_stone);
                itemGoldText.setText(R.string.void_stone_gold);
                itemCooldownText.setText(R.string.void_stone_cooldown);
                itemManacostText.setText(R.string.void_stone_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.void_stone_description);
                itemAbility.setText(R.string.void_stone_ability);

                itemBuildInto1.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                itemBuildInto2.setImageResource(R.drawable.item_scythe_of_vyse);
                itemBuildInto3.setImageResource(R.drawable.item_perserverance);
                itemBuildInto4.setImageResource(R.drawable.item_aether_lens);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_void_stone);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "gem_of_true_sight":
                itemIcon.setImageResource(R.drawable.item_gem_of_true_sight);
                itemName.setText(R.string.gem_of_true_sight);
                itemGoldText.setText(R.string.gem_of_true_sight_gold);
                itemCooldownText.setText(R.string.gem_of_true_sight_cooldown);
                itemManacostText.setText(R.string.gem_of_true_sight_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.gem_of_true_sight_description);
                itemAbility.setText(R.string.gem_of_true_sight_ability);

                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "morbid_mask":
                itemIcon.setImageResource(R.drawable.item_morbid_mask);
                itemName.setText(R.string.morbid_mask);
                itemGoldText.setText(R.string.morbid_mask_gold);
                itemCooldownText.setText(R.string.morbid_mask_cooldown);
                itemManacostText.setText(R.string.morbid_mask_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.morbid_mask_description);
                itemAbility.setText(R.string.morbid_mask_ability);

                itemBuildInto1.setImageResource(R.drawable.item_satanic);
                itemBuildInto2.setImageResource(R.drawable.item_mask_of_madness);
                itemBuildInto3.setImageResource(R.drawable.item_vladmirs_offering);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_morbid_mask);
                downArrow.setVisibility(View.GONE);
                break;

            case "voodoo_mask":
                itemIcon.setImageResource(R.drawable.item_voodoo_mask);
                itemName.setText(R.string.voodoo_mask);
                itemGoldText.setText(R.string.voodoo_mask_gold);
                itemCooldownText.setText(R.string.voodoo_mask_cooldown);
                itemManacostText.setText(R.string.voodoo_mask_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.voodoo_mask_description);
                itemAbility.setText(R.string.voodoo_mask_ability);

                itemBuildInto1.setImageResource(R.drawable.item_eternal_shroud);
                itemBuildInto2.setImageResource(R.drawable.item_bloodstone);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_voodoo_mask);
                downArrow.setVisibility(View.GONE);
                break;

            case "shadow_amulet":
                itemIcon.setImageResource(R.drawable.item_shadow_amulet);
                itemName.setText(R.string.shadow_amulet);
                itemGoldText.setText(R.string.shadow_amulet_gold);
                itemCooldownText.setText(R.string.shadow_amulet_cooldown);
                itemManacostText.setText(R.string.shadow_amulet_manacost);
                itemDescription.setText(R.string.shadow_amulet_description);
                itemAbility.setText(R.string.shadow_amulet_ability);

                itemBuildInto1.setImageResource(R.drawable.item_shadowblade);
                itemBuildInto2.setImageResource(R.drawable.item_glimmer_cape);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_shadow_amulet);
                downArrow.setVisibility(View.GONE);
                break;

            case "ghost_scepter":
                itemIcon.setImageResource(R.drawable.item_ghost_scepter);
                itemName.setText(R.string.ghost_scepter);
                itemGoldText.setText(R.string.ghost_scepter_gold);
                itemCooldownText.setText(R.string.ghost_scepter_cooldown);
                itemManacostText.setText(R.string.ghost_scepter_manacost);
                itemDescription.setText(R.string.ghost_scepter_description);
                itemAbility.setText(R.string.ghost_scepter_ability);

                itemBuildInto1.setImageResource(R.drawable.item_ethereal_blade);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_ghost_scepter);
                downArrow.setVisibility(View.GONE);
                break;

            case "blink_dagger":
                itemIcon.setImageResource(R.drawable.item_blink_dagger);
                itemName.setText(R.string.blink_dagger);
                itemGoldText.setText(R.string.blink_dagger_gold);
                itemCooldownText.setText(R.string.blink_dagger_cooldown);
                itemManacostText.setText(R.string.blink_dagger_manacost);
                itemDescription.setText(R.string.blink_dagger_description);
                itemAbility.setText(R.string.blink_dagger_ability);

                itemBuildInto1.setImageResource(R.drawable.item_overwhelming_blink);
                itemBuildInto2.setImageResource(R.drawable.item_swift_blink);
                itemBuildInto3.setImageResource(R.drawable.item_arcane_blink);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_blink_dagger);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;


            case "crown":
                itemIcon.setImageResource(R.drawable.item_crown);
                itemName.setText(R.string.crown);
                itemGoldText.setText(R.string.crown_gold);
                itemCooldownText.setText(R.string.crown_cooldown);
                itemManacostText.setText(R.string.crown_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.crown_description);
                itemAbility.setText(R.string.crown_ability);

                itemBuildInto1.setImageResource(R.drawable.item_meteor_hammer);
                itemBuildInto2.setImageResource(R.drawable.item_helm_of_the_dominator);
                itemBuildInto3.setImageResource(R.drawable.item_veil_of_discord);
                itemBuildInto4.setImageResource(R.drawable.item_rod_of_atos);
                itemBuildInto5.setImageResource(R.drawable.item_dagon);
                itemBuildInto6.setImageResource(R.drawable.item_solar_crest);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_crown);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "aghanims_shard":
                itemIcon.setImageResource(R.drawable.item_aghanims_shard);
                itemName.setText(R.string.aghanims_shard);
                itemGoldText.setText(R.string.aghanims_shard_gold);
                itemCooldownText.setText(R.string.aghanims_shard_cooldown);
                itemManacostText.setText(R.string.aghanims_shard_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.aghanims_shard_description);
                itemAbility.setText(R.string.aghanims_shard_ability);

                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "fluffy_hat":
                itemIcon.setImageResource(R.drawable.item_fluffy_hat);
                itemName.setText(R.string.fluffy_hat);
                itemGoldText.setText(R.string.fluffy_hat_gold);
                itemCooldownText.setText(R.string.fluffy_hat_cooldown);
                itemManacostText.setText(R.string.fluffy_hat_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.fluffy_hat_description);
                itemAbility.setText(R.string.fluffy_hat_ability);

                itemBuildInto1.setImageResource(R.drawable.item_orb_of_corrosion);
                itemBuildInto2.setImageResource(R.drawable.item_falcon_blade);
                itemBuildInto3.setImageResource(R.drawable.item_holy_locket);
                itemBuildInto4.setImageResource(R.drawable.item_force_staff);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_fluffy_hat);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;
        }
    }

    public void loadUpgradedItemsSelection() {
        //Is used to get the intent values passed from the previous class
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        //Is used to get the itemSelected value from the previous class
        String itemSelected = extras.getString("itemSelected");


        switch (itemSelected) {
            //******************************************************************************
            //ALL OF THE SWITCH CASES FOR UPGRADED ITEMS
            //******************************************************************************
            case "magic_wand":
                itemIcon.setImageResource(R.drawable.item_magic_wand);
                itemName.setText(R.string.magic_wand);
                itemGoldText.setText(R.string.magic_wand_gold);
                itemCooldownText.setText(R.string.magic_wand_cooldown);
                itemManacostText.setText(R.string.magic_wand_manacost);
                itemDescription.setText(R.string.magic_wand_description);
                itemAbility.setText(R.string.magic_wand_ability);

                itemBuildInto1.setImageResource(R.drawable.item_holy_locket);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_magic_wand);

                itemBuildFrom1.setImageResource(R.drawable.item_magic_stick);
                itemBuildFrom2.setImageResource(R.drawable.item_ironwood_branch);
                itemBuildFrom3.setImageResource(R.drawable.item_ironwood_branch);
                itemBuildFrom4.setImageResource(R.drawable.item_recipe);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "null_talisman":
                itemIcon.setImageResource(R.drawable.item_null_talisman);
                itemName.setText(R.string.null_talisman);
                itemGoldText.setText(R.string.null_talisman_gold);
                itemCooldownText.setText(R.string.null_talisman_cooldown);
                itemManacostText.setText(R.string.null_talisman_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.null_talisman_description);
                itemAbility.setText(R.string.null_talisman_ability);

                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_null_talisman);

                itemBuildFrom1.setImageResource(R.drawable.item_circlet);
                itemBuildFrom2.setImageResource(R.drawable.item_mantle_of_intelligence);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "wraith_band":
                itemIcon.setImageResource(R.drawable.item_wraith_band);
                itemName.setText(R.string.wraith_band);
                itemGoldText.setText(R.string.wraith_band_gold);
                itemCooldownText.setText(R.string.wraith_band_cooldown);
                itemManacostText.setText(R.string.wraith_band_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.wraith_band_description);
                itemAbility.setText(R.string.wraith_band_ability);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_wraith_band);

                itemBuildFrom1.setImageResource(R.drawable.item_circlet);
                itemBuildFrom2.setImageResource(R.drawable.item_slippers_of_agility);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "bracer":
                itemIcon.setImageResource(R.drawable.item_bracer);
                itemName.setText(R.string.bracer);
                itemGoldText.setText(R.string.bracer_gold);
                itemCooldownText.setText(R.string.bracer_cooldown);
                itemManacostText.setText(R.string.bracer_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.bracer_description);
                itemAbility.setText(R.string.bracer_ability);

                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_bracer);

                itemBuildFrom1.setImageResource(R.drawable.item_circlet);
                itemBuildFrom2.setImageResource(R.drawable.item_gauntlets_of_strength);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "soul_ring":
                itemIcon.setImageResource(R.drawable.item_soul_ring);
                itemName.setText(R.string.soul_ring);
                itemGoldText.setText(R.string.soul_ring_gold);
                itemCooldownText.setText(R.string.soul_ring_cooldown);
                itemManacostText.setText(R.string.soul_ring_manacost);
                itemDescription.setText(R.string.soul_ring_description);
                itemAbility.setText(R.string.soul_ring_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_soul_ring);

                itemBuildFrom1.setImageResource(R.drawable.item_ring_of_protection);
                itemBuildFrom2.setImageResource(R.drawable.item_gauntlets_of_strength);
                itemBuildFrom3.setImageResource(R.drawable.item_gauntlets_of_strength);
                itemBuildFrom4.setImageResource(R.drawable.item_recipe);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "phase_boots":
                itemIcon.setImageResource(R.drawable.item_phase_boots);
                itemName.setText(R.string.phase_boots);
                itemGoldText.setText(R.string.phase_boots_gold);
                itemCooldownText.setText(R.string.phase_boots_cooldown);
                itemManacostText.setText(R.string.phase_boots_manacost);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.phase_boots_description);
                itemAbility.setText(R.string.phase_boots_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_phase_boots);

                itemBuildFrom1.setImageResource(R.drawable.item_boots_of_speed);
                itemBuildFrom2.setImageResource(R.drawable.item_chainmail);
                itemBuildFrom3.setImageResource(R.drawable.item_blades_of_attack);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "power_treads":
                itemIcon.setImageResource(R.drawable.item_power_treads);
                itemName.setText(R.string.power_treads);
                itemGoldText.setText(R.string.power_treads_gold);
                itemCooldownText.setText(R.string.power_treads_cooldown);
                itemManacostText.setText(R.string.power_treads_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.power_treads_description);
                itemAbility.setText(R.string.power_treads_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_power_treads);

                itemBuildFrom1.setImageResource(R.drawable.item_boots_of_speed);
                itemBuildFrom2.setImageResource(R.drawable.item_gloves_of_haste);
                itemBuildFrom3.setImageResource(R.drawable.item_belt_of_strength);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "oblivion_staff":
                itemIcon.setImageResource(R.drawable.item_oblivion_staff);
                itemName.setText(R.string.oblivion_staff);
                itemGoldText.setText(R.string.oblivion_staff_gold);
                itemCooldownText.setText(R.string.oblivion_staff_cooldown);
                itemManacostText.setText(R.string.oblivion_staff_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.oblivion_staff_description);
                itemAbility.setText(R.string.oblivion_staff_ability);

                itemBuildInto1.setImageResource(R.drawable.item_orchid_malevolence);
                itemBuildInto2.setImageResource(R.drawable.item_echo_sabre);
                itemBuildInto3.setImageResource(R.drawable.item_mage_slayer);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_oblivion_staff);

                itemBuildFrom1.setImageResource(R.drawable.item_quarterstaff);
                itemBuildFrom2.setImageResource(R.drawable.item_robe_of_the_magi);
                itemBuildFrom3.setImageResource(R.drawable.item_sages_mask);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "perserverance":
                itemIcon.setImageResource(R.drawable.item_perserverance);
                itemName.setText(R.string.perserverance);
                itemGoldText.setText(R.string.perserverance_gold);
                itemCooldownText.setText(R.string.perserverance_cooldown);
                itemManacostText.setText(R.string.perserverance_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.perserverance_description);
                itemAbility.setText(R.string.perserverance_ability);

                itemBuildInto1.setImageResource(R.drawable.item_battle_fury);
                itemBuildInto2.setImageResource(R.drawable.item_linkens_sphere);
                itemBuildInto3.setImageResource(R.drawable.item_refresher_orb);
                itemBuildInto4.setImageResource(R.drawable.item_lotus_orb);
                itemBuildInto5.setImageResource(R.drawable.item_meteor_hammer);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_perserverance);

                itemBuildFrom1.setImageResource(R.drawable.item_ring_of_health);
                itemBuildFrom2.setImageResource(R.drawable.item_void_stone);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "hand_of_midas":
                itemIcon.setImageResource(R.drawable.item_hand_of_midas);
                itemName.setText(R.string.hand_of_midas);
                itemGoldText.setText(R.string.hand_of_midas_gold);
                itemCooldownText.setText(R.string.hand_of_midas_cooldown);
                itemManacostText.setText(R.string.hand_of_midas_manacost);
                itemDescription.setText(R.string.hand_of_midas_description);
                itemAbility.setText(R.string.hand_of_midas_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_hand_of_midas);

                itemBuildFrom1.setImageResource(R.drawable.item_gloves_of_haste);
                itemBuildFrom2.setImageResource(R.drawable.item_recipe);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "boots_of_travel":
                itemIcon.setImageResource(R.drawable.item_boots_of_travel);
                itemName.setText(R.string.boots_of_travel);
                itemGoldText.setText(R.string.boots_of_travel_gold);
                itemCooldownText.setText(R.string.boots_of_travel_cooldown);
                itemManacostText.setText(R.string.boots_of_travel_manacost);
                itemDescription.setText(R.string.boots_of_travel_description);
                itemAbility.setText(R.string.boots_of_travel_ability);


                itemBuildInto1.setImageResource(R.drawable.item_boots_of_travel_2);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_boots_of_travel);

                itemBuildFrom1.setImageResource(R.drawable.item_boots_of_speed);
                itemBuildFrom2.setImageResource(R.drawable.item_recipe);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "boots_of_travel_2":
                itemIcon.setImageResource(R.drawable.item_boots_of_travel_2);
                itemName.setText(R.string.boots_of_travel_2);
                itemGoldText.setText(R.string.boots_of_travel_2_gold);
                itemCooldownText.setText(R.string.boots_of_travel_2_cooldown);
                itemManacostText.setText(R.string.boots_of_travel_2_manacost);
                itemDescription.setText(R.string.boots_of_travel_2_description);
                itemAbility.setText(R.string.boots_of_travel_2_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_boots_of_travel_2);

                itemBuildFrom1.setImageResource(R.drawable.item_boots_of_travel);
                itemBuildFrom2.setImageResource(R.drawable.item_recipe);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "moon_shard":
                itemIcon.setImageResource(R.drawable.item_moon_shard);
                itemName.setText(R.string.moon_shard);
                itemGoldText.setText(R.string.moon_shard_gold);
                itemCooldownText.setText(R.string.moon_shard_cooldown);
                itemManacostText.setText(R.string.moon_shard_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.moon_shard_description);
                itemAbility.setText(R.string.moon_shard_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_moon_shard);

                itemBuildFrom1.setImageResource(R.drawable.item_hyperstone);
                itemBuildFrom2.setImageResource(R.drawable.item_hyperstone);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "ring_of_basilius":
                itemIcon.setImageResource(R.drawable.item_ring_of_basilius);
                itemName.setText(R.string.ring_of_basilius);
                itemGoldText.setText(R.string.ring_of_basilius_gold);
                itemCooldownText.setText(R.string.ring_of_basilius_cooldown);
                itemManacostText.setText(R.string.ring_of_basilius_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.ring_of_basilius_description);
                itemAbility.setText(R.string.ring_of_basilius_ability);

                itemBuildInto1.setImageResource(R.drawable.item_vladmirs_offering);
                itemBuildInto2.setImageResource(R.drawable.item_veil_of_discord);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_ring_of_basilius);

                itemBuildFrom1.setImageResource(R.drawable.item_sages_mask);
                itemBuildFrom2.setImageResource(R.drawable.item_recipe);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "headdress":
                itemIcon.setImageResource(R.drawable.item_headdress);
                itemName.setText(R.string.headdress);
                itemGoldText.setText(R.string.headdress_gold);
                itemCooldownText.setText(R.string.headdress_cooldown);
                itemManacostText.setText(R.string.headdress_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.headdress_description);
                itemAbility.setText(R.string.headdress_ability);

                itemBuildInto1.setImageResource(R.drawable.item_mekansm);
                itemBuildInto2.setImageResource(R.drawable.item_pipe_of_insight);
                itemBuildInto3.setImageResource(R.drawable.item_holy_locket);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_headdress);

                itemBuildFrom1.setImageResource(R.drawable.item_ring_of_regen);
                itemBuildFrom2.setImageResource(R.drawable.item_recipe);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "buckler":
                itemIcon.setImageResource(R.drawable.item_buckler);
                itemName.setText(R.string.buckler);
                itemGoldText.setText(R.string.buckler_gold);
                itemCooldownText.setText(R.string.buckler_cooldown);
                itemManacostText.setText(R.string.buckler_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.buckler_description);
                itemAbility.setText(R.string.buckler_ability);

                itemBuildInto1.setImageResource(R.drawable.item_vladmirs_offering);
                itemBuildInto2.setImageResource(R.drawable.item_guardian_greaves);
                itemBuildInto3.setImageResource(R.drawable.item_assault_cuirass);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_buckler);

                itemBuildFrom1.setImageResource(R.drawable.item_ring_of_protection);
                itemBuildFrom2.setImageResource(R.drawable.item_recipe);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "urn_of_shadows":
                itemIcon.setImageResource(R.drawable.item_urn_of_shadows);
                itemName.setText(R.string.urn_of_shadows);
                itemGoldText.setText(R.string.urn_of_shadows_gold);
                itemCooldownText.setText(R.string.urn_of_shadows_cooldown);
                itemManacostText.setText(R.string.urn_of_shadows_manacost);
                itemDescription.setText(R.string.urn_of_shadows_description);
                itemAbility.setText(R.string.urn_of_shadows_ability);

                itemBuildInto1.setImageResource(R.drawable.item_spirit_vessel);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_urn_of_shadows);

                itemBuildFrom1.setImageResource(R.drawable.item_sages_mask);
                itemBuildFrom2.setImageResource(R.drawable.item_circlet);
                itemBuildFrom3.setImageResource(R.drawable.item_ring_of_protection);
                itemBuildFrom4.setImageResource(R.drawable.item_recipe);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "tranquil_boots":
                itemIcon.setImageResource(R.drawable.item_tranquil_boots);
                itemName.setText(R.string.tranquil_boots);
                itemGoldText.setText(R.string.tranquil_boots_gold);
                itemCooldownText.setText(R.string.tranquil_boots_cooldown);
                itemManacostText.setText(R.string.tranquil_boots_manacost);
                itemDescription.setText(R.string.tranquil_boots_description);
                itemAbility.setText(R.string.tranquil_boots_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_tranquil_boots);

                itemBuildFrom1.setImageResource(R.drawable.item_boots_of_speed);
                itemBuildFrom2.setImageResource(R.drawable.item_wind_lace);
                itemBuildFrom3.setImageResource(R.drawable.item_ring_of_regen);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "medallion_of_courage":
                itemIcon.setImageResource(R.drawable.item_medallion_of_courage);
                itemName.setText(R.string.medallion_of_courage);
                itemGoldText.setText(R.string.medallion_of_courage_gold);
                itemCooldownText.setText(R.string.medallion_of_courage_cooldown);
                itemManacostText.setText(R.string.medallion_of_courage_manacost);
                itemDescription.setText(R.string.medallion_of_courage_description);
                itemAbility.setText(R.string.medallion_of_courage_ability);

                itemBuildInto1.setImageResource(R.drawable.item_solar_crest);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_medallion_of_courage);
                itemBuildFrom1.setImageResource(R.drawable.item_chainmail);
                itemBuildFrom2.setImageResource(R.drawable.item_sages_mask);
                itemBuildFrom3.setImageResource(R.drawable.item_blight_stone);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "arcane_boots":
                itemIcon.setImageResource(R.drawable.item_arcane_boots);
                itemName.setText(R.string.arcane_boots);
                itemGoldText.setText(R.string.arcane_boots_gold);
                itemCooldownText.setText(R.string.arcane_boots_cooldown);
                itemManacostText.setText(R.string.arcane_boots_manacost);
                itemDescription.setText(R.string.arcane_boots_description);
                itemAbility.setText(R.string.arcane_boots_ability);

                itemBuildInto1.setImageResource(R.drawable.item_guardian_greaves);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_arcane_boots);
                itemBuildFrom1.setImageResource(R.drawable.item_boots_of_speed);
                itemBuildFrom2.setImageResource(R.drawable.item_energy_booster);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "drum_of_endurance":
                itemIcon.setImageResource(R.drawable.item_drum_of_endurance);
                itemName.setText(R.string.drum_of_endurance);
                itemGoldText.setText(R.string.drum_of_endurance_gold);
                itemCooldownText.setText(R.string.drum_of_endurance_cooldown);
                itemManacostText.setText(R.string.drum_of_endurance_manacost);
                itemDescription.setText(R.string.drum_of_endurance_description);
                itemAbility.setText(R.string.drum_of_endurance_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_drum_of_endurance);

                itemBuildFrom1.setImageResource(R.drawable.item_wind_lace);
                itemBuildFrom2.setImageResource(R.drawable.item_robe_of_the_magi);
                itemBuildFrom3.setImageResource(R.drawable.item_belt_of_strength);
                itemBuildFrom4.setImageResource(R.drawable.item_recipe);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "vladmirs_offering":
                itemIcon.setImageResource(R.drawable.item_vladmirs_offering);
                itemName.setText(R.string.vladmirs_offering);
                itemGoldText.setText(R.string.vladmirs_offering_gold);
                itemCooldownText.setText(R.string.vladmirs_offering_cooldown);
                itemManacostText.setText(R.string.vladmirs_offering_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.vladmirs_offering_description);
                itemAbility.setText(R.string.vladmirs_offering_ability);

                itemBuildInto1.setImageResource(R.drawable.item_helm_of_the_dominator_2);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_vladmirs_offering);
                itemBuildFrom1.setImageResource(R.drawable.item_morbid_mask);
                itemBuildFrom2.setImageResource(R.drawable.item_ring_of_basilius);
                itemBuildFrom3.setImageResource(R.drawable.item_blades_of_attack);
                itemBuildFrom4.setImageResource(R.drawable.item_buckler);
                itemBuildFrom5.setImageResource(R.drawable.item_recipe);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "mekansm":
                itemIcon.setImageResource(R.drawable.item_mekansm);
                itemName.setText(R.string.mekanasm);
                itemGoldText.setText(R.string.mekanasm_gold);
                itemCooldownText.setText(R.string.mekanasm_cooldown);
                itemManacostText.setText(R.string.mekanasm_manacost);
                itemDescription.setText(R.string.mekanasm_description);
                itemAbility.setText(R.string.mekanasm_ability);

                itemBuildInto1.setImageResource(R.drawable.item_guardian_greaves);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_mekansm);
                itemBuildFrom1.setImageResource(R.drawable.item_chainmail);
                itemBuildFrom2.setImageResource(R.drawable.item_headdress);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "spirit_vessel":
                itemIcon.setImageResource(R.drawable.item_spirit_vessel);
                itemName.setText(R.string.spirit_vessel);
                itemGoldText.setText(R.string.spirit_vessel_gold);
                itemCooldownText.setText(R.string.spirit_vessel_cooldown);
                itemManacostText.setText(R.string.spirit_vessel_manacost);
                itemDescription.setText(R.string.spirit_vessel_description);
                itemAbility.setText(R.string.spirit_vessel_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_spirit_vessel);

                itemBuildFrom1.setImageResource(R.drawable.item_urn_of_shadows);
                itemBuildFrom2.setImageResource(R.drawable.item_vitality_booster);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "pipe_of_insight":
                itemIcon.setImageResource(R.drawable.item_pipe_of_insight);
                itemName.setText(R.string.pipe_of_insight);
                itemGoldText.setText(R.string.pipe_of_insight_gold);
                itemCooldownText.setText(R.string.pipe_of_insight_cooldown);
                itemManacostText.setText(R.string.pipe_of_insight_manacost);
                itemDescription.setText(R.string.pipe_of_insight_description);
                itemAbility.setText(R.string.pipe_of_insight_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_pipe_of_insight);

                itemBuildFrom1.setImageResource(R.drawable.item_hood_of_defiance);
                itemBuildFrom2.setImageResource(R.drawable.item_headdress);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "guardian_greaves":
                itemIcon.setImageResource(R.drawable.item_guardian_greaves);
                itemName.setText(R.string.guardian_greaves);
                itemGoldText.setText(R.string.guardian_greaves_gold);
                itemCooldownText.setText(R.string.guardian_greaves_cooldown);
                itemManacostText.setText(R.string.guardian_greaves_manacost);
                itemDescription.setText(R.string.guardian_greaves_description);
                itemAbility.setText(R.string.guardian_greaves_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_guardian_greaves);

                itemBuildFrom1.setImageResource(R.drawable.item_arcane_boots);
                itemBuildFrom2.setImageResource(R.drawable.item_mekansm);
                itemBuildFrom3.setImageResource(R.drawable.item_buckler);
                itemBuildFrom4.setImageResource(R.drawable.item_recipe);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "glimmer_cape":
                itemIcon.setImageResource(R.drawable.item_glimmer_cape);
                itemName.setText(R.string.glimmer_cape);
                itemGoldText.setText(R.string.glimmer_cape_gold);
                itemCooldownText.setText(R.string.glimmer_cape_cooldown);
                itemManacostText.setText(R.string.glimmer_cape_manacost);
                itemDescription.setText(R.string.glimmer_cape_description);
                itemAbility.setText(R.string.glimmer_cape_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_glimmer_cape);

                itemBuildFrom1.setImageResource(R.drawable.item_shadow_amulet);
                itemBuildFrom2.setImageResource(R.drawable.item_cloak);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "veil_of_discord":
                itemIcon.setImageResource(R.drawable.item_veil_of_discord);
                itemName.setText(R.string.veil_of_discord);
                itemGoldText.setText(R.string.veil_of_discord_gold);
                itemCooldownText.setText(R.string.veil_of_discord_cooldown);
                itemManacostText.setText(R.string.veil_of_discord_manacost);
                itemDescription.setText(R.string.veil_of_discord_description);
                itemAbility.setText(R.string.veil_of_discord_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_veil_of_discord);

                itemBuildFrom1.setImageResource(R.drawable.item_ring_of_basilius);
                itemBuildFrom2.setImageResource(R.drawable.item_crown);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "aether_lens":
                itemIcon.setImageResource(R.drawable.item_aether_lens);
                itemName.setText(R.string.aether_lens);
                itemGoldText.setText(R.string.aether_lens_gold);
                itemCooldownText.setText(R.string.aether_lens_cooldown);
                itemManacostText.setText(R.string.aether_lens_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.aether_lens_description);
                itemAbility.setText(R.string.aether_lens_ability);

                itemBuildInto1.setImageResource(R.drawable.item_octarine_core);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_aether_lens);

                itemBuildFrom1.setImageResource(R.drawable.item_energy_booster);
                itemBuildFrom2.setImageResource(R.drawable.item_void_stone);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "force_staff":
                itemIcon.setImageResource(R.drawable.item_force_staff);
                itemName.setText(R.string.force_staff);
                itemGoldText.setText(R.string.force_staff_gold);
                itemCooldownText.setText(R.string.force_staff_cooldown);
                itemManacostText.setText(R.string.force_staff_manacost);
                itemDescription.setText(R.string.force_staff_description);
                itemAbility.setText(R.string.force_staff_ability);

                itemBuildInto1.setImageResource(R.drawable.item_hurricane_pike);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_force_staff);
                itemBuildFrom1.setImageResource(R.drawable.item_staff_of_wizardry);
                itemBuildFrom2.setImageResource(R.drawable.item_fluffy_hat);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "solar_crest":
                itemIcon.setImageResource(R.drawable.item_solar_crest);
                itemName.setText(R.string.solar_crest);
                itemGoldText.setText(R.string.solar_crest_gold);
                itemCooldownText.setText(R.string.solar_crest_cooldown);
                itemManacostText.setText(R.string.solar_crest_manacost);
                itemDescription.setText(R.string.solar_crest_description);
                itemAbility.setText(R.string.solar_crest_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_solar_crest);

                itemBuildFrom1.setImageResource(R.drawable.item_medallion_of_courage);
                itemBuildFrom2.setImageResource(R.drawable.item_crown);
                itemBuildFrom3.setImageResource(R.drawable.item_wind_lace);
                itemBuildFrom4.setImageResource(R.drawable.item_recipe);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "dagon":
                itemIcon.setImageResource(R.drawable.item_dagon);
                itemName.setText(R.string.dagon);
                itemGoldText.setText(R.string.dagon_gold);
                itemCooldownText.setText(R.string.dagon_cooldown);
                itemManacostText.setText(R.string.dagon_manacost);
                itemDescription.setText(R.string.dagon_description);
                itemAbility.setText(R.string.dagon_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_dagon);

                itemBuildFrom1.setImageResource(R.drawable.item_staff_of_wizardry);
                itemBuildFrom2.setImageResource(R.drawable.item_crown);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);

                break;

            case "euls_scepter_of_divinity":
                itemIcon.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                itemName.setText(R.string.euls_scepter_of_divinity);
                itemGoldText.setText(R.string.euls_scepter_of_divinity_gold);
                itemCooldownText.setText(R.string.euls_scepter_of_divinity_cooldown);
                itemManacostText.setText(R.string.euls_scepter_of_divinity_manacost);
                itemDescription.setText(R.string.euls_scepter_of_divinity_description);
                itemAbility.setText(R.string.euls_scepter_of_divinity_ability);

                itemBuildInto1.setImageResource(R.drawable.item_wind_waker);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_euls_scepter_of_divinity);

                itemBuildFrom1.setImageResource(R.drawable.item_staff_of_wizardry);
                itemBuildFrom2.setImageResource(R.drawable.item_void_stone);
                itemBuildFrom3.setImageResource(R.drawable.item_wind_lace);
                itemBuildFrom4.setImageResource(R.drawable.item_recipe);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "rod_of_atos":
                itemIcon.setImageResource(R.drawable.item_rod_of_atos);
                itemName.setText(R.string.rod_of_atos);
                itemGoldText.setText(R.string.rod_of_atos_gold);
                itemCooldownText.setText(R.string.rod_of_atos_cooldown);
                itemManacostText.setText(R.string.rod_of_atos_manacost);
                itemDescription.setText(R.string.rod_of_atos_description);
                itemAbility.setText(R.string.rod_of_atos_ability);

                itemBuildInto1.setImageResource(R.drawable.item_gleipnir);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_rod_of_atos);

                itemBuildFrom1.setImageResource(R.drawable.item_staff_of_wizardry);
                itemBuildFrom2.setImageResource(R.drawable.item_crown);
                itemBuildFrom3.setImageResource(R.drawable.item_crown);
                itemBuildFrom4.setImageResource(R.drawable.item_recipe);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "orchid_malevolence":
                itemIcon.setImageResource(R.drawable.item_orchid_malevolence);
                itemName.setText(R.string.orchid_malevolence);
                itemGoldText.setText(R.string.orchid_malevolence_gold);
                itemCooldownText.setText(R.string.orchid_malevolence_cooldown);
                itemManacostText.setText(R.string.orchid_malevolence_manacost);
                itemDescription.setText(R.string.orchid_malevolence_description);
                itemAbility.setText(R.string.orchid_malevolence_ability);

                itemBuildInto1.setImageResource(R.drawable.item_bloodthorn);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_orchid_malevolence);

                itemBuildFrom1.setImageResource(R.drawable.item_oblivion_staff);
                itemBuildFrom2.setImageResource(R.drawable.item_oblivion_staff);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);

                break;

            case "aghanims_scepter":
                itemIcon.setImageResource(R.drawable.item_aghanims_scepter);
                itemName.setText(R.string.aghanims_scepter);
                itemGoldText.setText(R.string.aghanims_scepter_gold);
                itemCooldownText.setText(R.string.aghanims_scepter_cooldown);
                itemManacostText.setText(R.string.aghanims_scepter_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.aghanims_scepter_description);
                itemAbility.setText(R.string.aghanims_scepter_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_aghanims_scepter);

                itemBuildFrom1.setImageResource(R.drawable.item_staff_of_wizardry);
                itemBuildFrom2.setImageResource(R.drawable.item_blade_of_alacrity);
                itemBuildFrom3.setImageResource(R.drawable.item_ogre_axe);
                itemBuildFrom4.setImageResource(R.drawable.item_point_booster);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "nullifier":
                itemIcon.setImageResource(R.drawable.item_nullifier);
                itemName.setText(R.string.nullifier);
                itemGoldText.setText(R.string.nullifier_gold);
                itemCooldownText.setText(R.string.nullifier_cooldown);
                itemManacostText.setText(R.string.nullifier_manacost);
                itemDescription.setText(R.string.nullifier_description);
                itemAbility.setText(R.string.nullifier_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_nullifier);

                itemBuildFrom1.setImageResource(R.drawable.item_helm_of_iron_will);
                itemBuildFrom2.setImageResource(R.drawable.item_sacred_relic);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "refresher_orb":
                itemIcon.setImageResource(R.drawable.item_refresher_orb);
                itemName.setText(R.string.refresher_orb);
                itemGoldText.setText(R.string.refresher_orb_gold);
                itemCooldownText.setText(R.string.refresher_orb_cooldown);
                itemManacostText.setText(R.string.refresher_orb_manacost);
                itemDescription.setText(R.string.refresher_orb_description);
                itemAbility.setText(R.string.refresher_orb_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_refresher_orb);

                itemBuildFrom1.setImageResource(R.drawable.item_perserverance);
                itemBuildFrom2.setImageResource(R.drawable.item_perserverance);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "scythe_of_vyse":
                itemIcon.setImageResource(R.drawable.item_scythe_of_vyse);
                itemName.setText(R.string.scythe_of_vyse);
                itemGoldText.setText(R.string.scythe_of_vyse_gold);
                itemCooldownText.setText(R.string.scythe_of_vyse_cooldown);
                itemManacostText.setText(R.string.scythe_of_vyse_manacost);
                itemDescription.setText(R.string.scythe_of_vyse_description);
                itemAbility.setText(R.string.scythe_of_vyse_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_scythe_of_vyse);

                itemBuildFrom1.setImageResource(R.drawable.item_mystic_staff);
                itemBuildFrom2.setImageResource(R.drawable.item_ultimate_orb);
                itemBuildFrom3.setImageResource(R.drawable.item_void_stone);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "octarine_core":
                itemIcon.setImageResource(R.drawable.item_octarine_core);
                itemName.setText(R.string.octarine_core);
                itemGoldText.setText(R.string.octarine_core_gold);
                itemCooldownText.setText(R.string.octarine_core_cooldown);
                itemManacostText.setText(R.string.octarine_core_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.octarine_core_description);
                itemAbility.setText(R.string.octarine_core_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_octarine_core);

                itemBuildFrom1.setImageResource(R.drawable.item_aether_lens);
                itemBuildFrom2.setImageResource(R.drawable.item_soul_booster);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "hood_of_defiance":
                itemIcon.setImageResource(R.drawable.item_hood_of_defiance);
                itemName.setText(R.string.hood_of_defiance);
                itemGoldText.setText(R.string.hood_of_defiance_gold);
                itemCooldownText.setText(R.string.hood_of_defiance_cooldown);
                itemManacostText.setText(R.string.hood_of_defiance_manacost);
                itemDescription.setText(R.string.hood_of_defiance_description);
                itemAbility.setText(R.string.hood_of_defiance_ability);

                itemBuildInto1.setImageResource(R.drawable.item_pipe_of_insight);
                itemBuildInto2.setImageResource(R.drawable.item_eternal_shroud);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_hood_of_defiance);

                itemBuildFrom1.setImageResource(R.drawable.item_ring_of_health);
                itemBuildFrom2.setImageResource(R.drawable.item_cloak);
                itemBuildFrom3.setImageResource(R.drawable.item_ring_of_regen);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "vanguard":
                itemIcon.setImageResource(R.drawable.item_vanguard);
                itemName.setText(R.string.vanguard);
                itemGoldText.setText(R.string.vanguard_gold);
                itemCooldownText.setText(R.string.vanguard_cooldown);
                itemManacostText.setText(R.string.vanguard_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.vanguard_description);
                itemAbility.setText(R.string.vanguard_ability);

                itemBuildInto1.setImageResource(R.drawable.item_crimson_guard);
                itemBuildInto2.setImageResource(R.drawable.item_abyssal_blade);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_vanguard);
                itemBuildFrom1.setImageResource(R.drawable.item_ring_of_health);
                itemBuildFrom2.setImageResource(R.drawable.item_vitality_booster);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "blade_mail":
                itemIcon.setImageResource(R.drawable.item_blade_mail);
                itemName.setText(R.string.blade_mail);
                itemGoldText.setText(R.string.blade_mail_gold);
                itemCooldownText.setText(R.string.blade_mail_cooldown);
                itemManacostText.setText(R.string.blade_mail_manacost);
                itemDescription.setText(R.string.blade_mail_description);
                itemAbility.setText(R.string.blade_mail_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_blade_mail);
                itemBuildFrom1.setImageResource(R.drawable.item_broadsword);
                itemBuildFrom2.setImageResource(R.drawable.item_chainmail);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "soul_booster":
                itemIcon.setImageResource(R.drawable.item_soul_booster);
                itemName.setText(R.string.soul_booster);
                itemGoldText.setText(R.string.soul_booster_gold);
                itemCooldownText.setText(R.string.soul_booster_cooldown);
                itemManacostText.setText(R.string.soul_booster_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.soul_booster_description);
                itemAbility.setText(R.string.soul_booster_ability);

                itemBuildInto1.setImageResource(R.drawable.item_bloodstone);
                itemBuildInto2.setImageResource(R.drawable.item_octarine_core);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_soul_booster);
                itemBuildFrom1.setImageResource(R.drawable.item_point_booster);
                itemBuildFrom2.setImageResource(R.drawable.item_vitality_booster);
                itemBuildFrom3.setImageResource(R.drawable.item_energy_booster);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "crimson_guard":
                itemIcon.setImageResource(R.drawable.item_crimson_guard);
                itemName.setText(R.string.crimson_guard);
                itemGoldText.setText(R.string.crimson_guard_gold);
                itemCooldownText.setText(R.string.crimson_guard_cooldown);
                itemManacostText.setText(R.string.crimson_guard_manacost);
                itemDescription.setText(R.string.crimson_guard_description);
                itemAbility.setText(R.string.crimson_guard_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_crimson_guard);
                itemBuildFrom1.setImageResource(R.drawable.item_vanguard);
                itemBuildFrom2.setImageResource(R.drawable.item_helm_of_iron_will);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "aeon_disk":
                itemIcon.setImageResource(R.drawable.item_aeon_disk);
                itemName.setText(R.string.aeon_disk);
                itemGoldText.setText(R.string.aeon_disk_gold);
                itemCooldownText.setText(R.string.aeon_disk_cooldown);
                itemManacostText.setText(R.string.aeon_disk_manacost);
                itemDescription.setText(R.string.aeon_disk_description);
                itemAbility.setText(R.string.aeon_disk_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_aeon_disk);

                itemBuildFrom1.setImageResource(R.drawable.item_vitality_booster);
                itemBuildFrom2.setImageResource(R.drawable.item_energy_booster);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "black_king_bar":
                itemIcon.setImageResource(R.drawable.item_black_king_bar);
                itemName.setText(R.string.black_king_bar);
                itemGoldText.setText(R.string.black_king_bar_gold);
                itemCooldownText.setText(R.string.black_king_bar_cooldown);
                itemManacostText.setText(R.string.black_king_bar_manacost);
                itemDescription.setText(R.string.black_king_bar_description);
                itemAbility.setText(R.string.black_king_bar_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_black_king_bar);

                itemBuildFrom1.setImageResource(R.drawable.item_ogre_axe);
                itemBuildFrom2.setImageResource(R.drawable.item_mithril_hammer);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "lotus_orb":
                itemIcon.setImageResource(R.drawable.item_lotus_orb);
                itemName.setText(R.string.lotus_orb);
                itemGoldText.setText(R.string.lotus_orb_gold);
                itemCooldownText.setText(R.string.lotus_orb_cooldown);
                itemManacostText.setText(R.string.lotus_orb_manacost);
                itemDescription.setText(R.string.lotus_orb_description);
                itemAbility.setText(R.string.lotus_orb_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_lotus_orb);

                itemBuildFrom1.setImageResource(R.drawable.item_perserverance);
                itemBuildFrom2.setImageResource(R.drawable.item_platemail);
                itemBuildFrom3.setImageResource(R.drawable.item_energy_booster);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "shivas_guard":
                itemIcon.setImageResource(R.drawable.item_shivas_guard);
                itemName.setText(R.string.shivas_guard);
                itemGoldText.setText(R.string.shivas_guard_gold);
                itemCooldownText.setText(R.string.shivas_guard_cooldown);
                itemManacostText.setText(R.string.shivas_guard_manacost);
                itemDescription.setText(R.string.shivas_guard_description);
                itemAbility.setText(R.string.shivas_guard_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_shivas_guard);

                itemBuildFrom1.setImageResource(R.drawable.item_mystic_staff);
                itemBuildFrom2.setImageResource(R.drawable.item_platemail);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "hurricane_pike":
                itemIcon.setImageResource(R.drawable.item_hurricane_pike);
                itemName.setText(R.string.hurricane_pike);
                itemGoldText.setText(R.string.hurricane_pike_gold);
                itemCooldownText.setText(R.string.hurricane_pike_cooldown);
                itemManacostText.setText(R.string.hurricane_pike_manacost);
                itemDescription.setText(R.string.hurricane_pike_description);
                itemAbility.setText(R.string.hurricane_pike_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_hurricane_pike);

                itemBuildFrom1.setImageResource(R.drawable.item_force_staff);
                itemBuildFrom2.setImageResource(R.drawable.item_dragon_lance);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "linkens_sphere":
                itemIcon.setImageResource(R.drawable.item_linkens_sphere);
                itemName.setText(R.string.linkens_sphere);
                itemGoldText.setText(R.string.linkens_sphere_gold);
                itemCooldownText.setText(R.string.linkens_sphere_cooldown);
                itemManacostText.setText(R.string.linkens_sphere_manacost);
                itemDescription.setText(R.string.linkens_sphere_description);
                itemAbility.setText(R.string.linkens_sphere_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_linkens_sphere);

                itemBuildFrom1.setImageResource(R.drawable.item_perserverance);
                itemBuildFrom2.setImageResource(R.drawable.item_ultimate_orb);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "bloodstone":
                itemIcon.setImageResource(R.drawable.item_bloodstone);
                itemName.setText(R.string.bloodstone);
                itemGoldText.setText(R.string.bloodstone_gold);
                itemCooldownText.setText(R.string.bloodstone_cooldown);
                itemManacostText.setText(R.string.bloodstone_manacost);
                itemDescription.setText(R.string.bloodstone_description);
                itemAbility.setText(R.string.bloodstone_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_bloodstone);

                itemBuildFrom1.setImageResource(R.drawable.item_soul_booster);
                itemBuildFrom2.setImageResource(R.drawable.item_kaya);
                itemBuildFrom3.setImageResource(R.drawable.item_voodoo_mask);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "manta_style":
                itemIcon.setImageResource(R.drawable.item_manta_style);
                itemName.setText(R.string.manta_style);
                itemGoldText.setText(R.string.manta_style_gold);
                itemCooldownText.setText(R.string.manta_style_cooldown);
                itemManacostText.setText(R.string.manta_style_manacost);
                itemDescription.setText(R.string.manta_style_description);
                itemAbility.setText(R.string.manta_style_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_manta_style);

                itemBuildFrom1.setImageResource(R.drawable.item_ultimate_orb);
                itemBuildFrom2.setImageResource(R.drawable.item_yasha);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "heart_of_tarrasque":
                itemIcon.setImageResource(R.drawable.item_heart_of_tarrasque);
                itemName.setText(R.string.heart_of_tarrasque);
                itemGoldText.setText(R.string.heart_of_tarrasque_gold);
                itemCooldownText.setText(R.string.heart_of_tarrasque_cooldown);
                itemManacostText.setText(R.string.heart_of_tarrasque_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.heart_of_tarrasque_description);
                itemAbility.setText(R.string.heart_of_tarrasque_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_heart_of_tarrasque);

                itemBuildFrom1.setImageResource(R.drawable.item_vitality_booster);
                itemBuildFrom2.setImageResource(R.drawable.item_reaver);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "assault_cuirass":
                itemIcon.setImageResource(R.drawable.item_assault_cuirass);
                itemName.setText(R.string.assault_cuirass);
                itemGoldText.setText(R.string.assault_cuirass_gold);
                itemCooldownText.setText(R.string.assault_cuirass_cooldown);
                itemManacostText.setText(R.string.assault_cuirass_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.assault_cuirass_description);
                itemAbility.setText(R.string.assault_cuirass_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_assault_cuirass);

                itemBuildFrom1.setImageResource(R.drawable.item_platemail);
                itemBuildFrom2.setImageResource(R.drawable.item_hyperstone);
                itemBuildFrom3.setImageResource(R.drawable.item_buckler);
                itemBuildFrom4.setImageResource(R.drawable.item_recipe);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "crystalys":
                itemIcon.setImageResource(R.drawable.item_crystalys);
                itemName.setText(R.string.crystalys);
                itemGoldText.setText(R.string.crystalys_gold);
                itemCooldownText.setText(R.string.crystalys_cooldown);
                itemManacostText.setText(R.string.crystalys_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.crystalys_description);
                itemAbility.setText(R.string.crystalys_ability);

                itemBuildInto1.setImageResource(R.drawable.item_daedalus);
                itemBuildInto2.setImageResource(R.drawable.item_silver_edge);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_crystalys);

                itemBuildFrom1.setImageResource(R.drawable.item_broadsword);
                itemBuildFrom2.setImageResource(R.drawable.item_blades_of_attack);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "armlet_of_mordiggian":
                itemIcon.setImageResource(R.drawable.item_armlet_of_mordiggian);
                itemName.setText(R.string.armlet_of_mordiggian);
                itemGoldText.setText(R.string.armlet_of_mordiggian_gold);
                itemCooldownText.setText(R.string.armlet_of_mordiggian_cooldown);
                itemManacostText.setText(R.string.armlet_of_mordiggian_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.armlet_of_mordiggian_description);
                itemAbility.setText(R.string.armlet_of_mordiggian_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_armlet_of_mordiggian);

                itemBuildFrom1.setImageResource(R.drawable.item_helm_of_iron_will);
                itemBuildFrom2.setImageResource(R.drawable.item_gloves_of_haste);
                itemBuildFrom3.setImageResource(R.drawable.item_blades_of_attack);
                itemBuildFrom4.setImageResource(R.drawable.item_recipe);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "meteor_hammer":
                itemIcon.setImageResource(R.drawable.item_meteor_hammer);
                itemName.setText(R.string.meteor_hammer);
                itemGoldText.setText(R.string.meteor_hammer_gold);
                itemCooldownText.setText(R.string.meteor_hammer_cooldown);
                itemManacostText.setText(R.string.meteor_hammer_manacost);
                itemDescription.setText(R.string.meteor_hammer_description);
                itemAbility.setText(R.string.meteor_hammer_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_meteor_hammer);

                itemBuildFrom1.setImageResource(R.drawable.item_perserverance);
                itemBuildFrom2.setImageResource(R.drawable.item_crown);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "shadow_blade":
                itemIcon.setImageResource(R.drawable.item_shadowblade);
                itemName.setText(R.string.shadow_blade);
                itemGoldText.setText(R.string.shadow_blade_gold);
                itemCooldownText.setText(R.string.shadow_blade_cooldown);
                itemManacostText.setText(R.string.shadow_blade_manacost);
                itemDescription.setText(R.string.shadow_blade_description);
                itemAbility.setText(R.string.shadow_blade_ability);

                itemBuildInto1.setImageResource(R.drawable.item_silver_edge);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_shadowblade);

                itemBuildFrom1.setImageResource(R.drawable.item_shadow_amulet);
                itemBuildFrom2.setImageResource(R.drawable.item_blitz_knuckles);
                itemBuildFrom3.setImageResource(R.drawable.item_broadsword);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "skull_basher":
                itemIcon.setImageResource(R.drawable.item_skull_basher);
                itemName.setText(R.string.skull_basher);
                itemGoldText.setText(R.string.skull_basher_gold);
                itemCooldownText.setText(R.string.skull_basher_cooldown);
                itemManacostText.setText(R.string.skull_basher_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.skull_basher_description);
                itemAbility.setText(R.string.skull_basher_ability);

                itemBuildInto1.setImageResource(R.drawable.item_abyssal_blade);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_skull_basher);

                itemBuildFrom1.setImageResource(R.drawable.item_mithril_hammer);
                itemBuildFrom2.setImageResource(R.drawable.item_belt_of_strength);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "battle_fury":
                itemIcon.setImageResource(R.drawable.item_battle_fury);
                itemName.setText(R.string.battle_fury);
                itemGoldText.setText(R.string.battle_fury_gold);
                itemCooldownText.setText(R.string.battle_fury_cooldown);
                itemManacostText.setText(R.string.battle_fury_manacost);
                itemDescription.setText(R.string.battle_fury_description);
                itemAbility.setText(R.string.battle_fury_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_battle_fury);

                itemBuildFrom1.setImageResource(R.drawable.item_broadsword);
                itemBuildFrom2.setImageResource(R.drawable.item_claymore);
                itemBuildFrom3.setImageResource(R.drawable.item_quelling_blade);
                itemBuildFrom4.setImageResource(R.drawable.item_perserverance);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "monkey_king_bar":
                itemIcon.setImageResource(R.drawable.item_monkey_king_bar);
                itemName.setText(R.string.monkey_king_bar);
                itemGoldText.setText(R.string.monkey_king_bar_gold);
                itemCooldownText.setText(R.string.monkey_king_bar_cooldown);
                itemManacostText.setText(R.string.monkey_king_bar_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.monkey_king_bar_description);
                itemAbility.setText(R.string.monkey_king_bar_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_monkey_king_bar);

                itemBuildFrom1.setImageResource(R.drawable.item_demon_edge);
                itemBuildFrom2.setImageResource(R.drawable.item_javelin);
                itemBuildFrom3.setImageResource(R.drawable.item_blitz_knuckles);
                itemBuildFrom4.setImageResource(R.drawable.item_recipe);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "ethereal_blade":
                itemIcon.setImageResource(R.drawable.item_ethereal_blade);
                itemName.setText(R.string.etheral_blade);
                itemGoldText.setText(R.string.etheral_blade_gold);
                itemCooldownText.setText(R.string.etheral_blade_cooldown);
                itemManacostText.setText(R.string.etheral_blade_manacost);
                itemDescription.setText(R.string.etheral_blade_description);
                itemAbility.setText(R.string.etheral_blade_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_ethereal_blade);

                itemBuildFrom1.setImageResource(R.drawable.item_ghost_scepter);
                itemBuildFrom2.setImageResource(R.drawable.item_eaglesong);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "radiance":
                itemIcon.setImageResource(R.drawable.item_radiance);
                itemName.setText(R.string.radiance);
                itemGoldText.setText(R.string.radiance_gold);
                itemCooldownText.setText(R.string.radiance_cooldown);
                itemManacostText.setText(R.string.radiance_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.radiance_description);
                itemAbility.setText(R.string.radiance_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_radiance);

                itemBuildFrom1.setImageResource(R.drawable.item_sacred_relic);
                itemBuildFrom2.setImageResource(R.drawable.item_recipe);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "daedalus":
                itemIcon.setImageResource(R.drawable.item_daedalus);
                itemName.setText(R.string.daedalus);
                itemGoldText.setText(R.string.daedalus_gold);
                itemCooldownText.setText(R.string.daedalus_cooldown);
                itemManacostText.setText(R.string.daedalus_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.daedalus_description);
                itemAbility.setText(R.string.daedalus_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_daedalus);

                itemBuildFrom1.setImageResource(R.drawable.item_demon_edge);
                itemBuildFrom2.setImageResource(R.drawable.item_crystalys);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "butterfly":
                itemIcon.setImageResource(R.drawable.item_butterfly);
                itemName.setText(R.string.butterfly);
                itemGoldText.setText(R.string.butterfly_gold);
                itemCooldownText.setText(R.string.butterfly_cooldown);
                itemManacostText.setText(R.string.butterfly_manacost);
                itemDescription.setText(R.string.butterfly_description);
                itemAbility.setText(R.string.butterfly_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_butterfly);

                itemBuildFrom1.setImageResource(R.drawable.item_eaglesong);
                itemBuildFrom2.setImageResource(R.drawable.item_talisman_of_evasion);
                itemBuildFrom3.setImageResource(R.drawable.item_quarterstaff);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "silver_edge":
                itemIcon.setImageResource(R.drawable.item_silver_edge);
                itemName.setText(R.string.silver_edge);
                itemGoldText.setText(R.string.silver_edge_gold);
                itemCooldownText.setText(R.string.silver_edge_cooldown);
                itemManacostText.setText(R.string.silver_edge_manacost);
                itemDescription.setText(R.string.silver_edge_description);
                itemAbility.setText(R.string.silver_edge_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_silver_edge);

                itemBuildFrom1.setImageResource(R.drawable.item_shadowblade);
                itemBuildFrom2.setImageResource(R.drawable.item_crystalys);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "divine_rapier":
                itemIcon.setImageResource(R.drawable.item_divine_raiper);
                itemName.setText(R.string.divine_rapier);
                itemGoldText.setText(R.string.divine_rapier_gold);
                itemCooldownText.setText(R.string.divine_rapier_cooldown);
                itemManacostText.setText(R.string.divine_rapier_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.divine_rapier_description);
                itemAbility.setText(R.string.divine_rapier_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_divine_raiper);

                itemBuildFrom1.setImageResource(R.drawable.item_sacred_relic);
                itemBuildFrom2.setImageResource(R.drawable.item_demon_edge);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "abyssal_blade":
                itemIcon.setImageResource(R.drawable.item_abyssal_blade);
                itemName.setText(R.string.abyssal_blade);
                itemGoldText.setText(R.string.abyssal_blade_gold);
                itemCooldownText.setText(R.string.abyssal_blade_cooldown);
                itemManacostText.setText(R.string.abyssal_blade_manacost);
                itemDescription.setText(R.string.abyssal_blade_description);
                itemAbility.setText(R.string.abyssal_blade_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_abyssal_blade);

                itemBuildFrom1.setImageResource(R.drawable.item_skull_basher);
                itemBuildFrom2.setImageResource(R.drawable.item_vanguard);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "bloodthorn":
                itemIcon.setImageResource(R.drawable.item_bloodthorn);
                itemName.setText(R.string.bloodthorn);
                itemGoldText.setText(R.string.bloodthorn_gold);
                itemCooldownText.setText(R.string.bloodthorn_cooldown);
                itemManacostText.setText(R.string.bloodthorn_manacost);
                itemDescription.setText(R.string.bloodthorn_description);
                itemAbility.setText(R.string.bloodthorn_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_bloodthorn);

                itemBuildFrom1.setImageResource(R.drawable.item_hyperstone);
                itemBuildFrom2.setImageResource(R.drawable.item_orchid_malevolence);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "dragon_lance":
                itemIcon.setImageResource(R.drawable.item_dragon_lance);
                itemName.setText(R.string.dragon_lance);
                itemGoldText.setText(R.string.dragon_lance_gold);
                itemCooldownText.setText(R.string.dragon_lance_cooldown);
                itemManacostText.setText(R.string.dragon_lance_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.dragon_lance_description);
                itemAbility.setText(R.string.dragon_lance_ability);

                itemBuildInto1.setImageResource(R.drawable.item_hurricane_pike);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_dragon_lance);

                itemBuildFrom1.setImageResource(R.drawable.item_ogre_axe);
                itemBuildFrom2.setImageResource(R.drawable.item_band_of_elvenskin);
                itemBuildFrom3.setImageResource(R.drawable.item_band_of_elvenskin);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "sange":
                itemIcon.setImageResource(R.drawable.item_sange);
                itemName.setText(R.string.sange);
                itemGoldText.setText(R.string.sange_gold);
                itemCooldownText.setText(R.string.sange_cooldown);
                itemManacostText.setText(R.string.sange_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.sange_description);
                itemAbility.setText(R.string.sange_ability);

                itemBuildInto1.setImageResource(R.drawable.item_heavens_halberd);
                itemBuildInto2.setImageResource(R.drawable.item_kaya_and_sange);
                itemBuildInto3.setImageResource(R.drawable.item_sange_and_yasha);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_sange);

                itemBuildFrom1.setImageResource(R.drawable.item_ogre_axe);
                itemBuildFrom2.setImageResource(R.drawable.item_belt_of_strength);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "yasha":
                itemIcon.setImageResource(R.drawable.item_yasha);
                itemName.setText(R.string.yasha);
                itemGoldText.setText(R.string.yasha_gold);
                itemCooldownText.setText(R.string.yasha_cooldown);
                itemManacostText.setText(R.string.yasha_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.yasha_description);
                itemAbility.setText(R.string.yasha_ability);

                itemBuildInto1.setImageResource(R.drawable.item_sange_and_yasha);
                itemBuildInto2.setImageResource(R.drawable.item_manta_style);
                itemBuildInto3.setImageResource(R.drawable.item_yasha_and_kaya);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_yasha);

                itemBuildFrom1.setImageResource(R.drawable.item_blade_of_alacrity);
                itemBuildFrom2.setImageResource(R.drawable.item_band_of_elvenskin);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "kaya":
                itemIcon.setImageResource(R.drawable.item_kaya);
                itemName.setText(R.string.kaya);
                itemGoldText.setText(R.string.kaya_gold);
                itemCooldownText.setText(R.string.kaya_cooldown);
                itemManacostText.setText(R.string.kaya_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.kaya_description);
                itemAbility.setText(R.string.kaya_ability);

                itemBuildInto1.setImageResource(R.drawable.item_kaya_and_sange);
                itemBuildInto2.setImageResource(R.drawable.item_yasha_and_kaya);
                itemBuildInto3.setImageResource(R.drawable.item_bloodstone);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_kaya);

                itemBuildFrom1.setImageResource(R.drawable.item_staff_of_wizardry);
                itemBuildFrom2.setImageResource(R.drawable.item_robe_of_the_magi);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "mask_of_madness":
                itemIcon.setImageResource(R.drawable.item_mask_of_madness);
                itemName.setText(R.string.mask_of_madness);
                itemGoldText.setText(R.string.mask_of_madness_gold);
                itemCooldownText.setText(R.string.mask_of_madness_cooldown);
                itemManacostText.setText(R.string.mask_of_madness_manacost);
                itemDescription.setText(R.string.mask_of_madness_description);
                itemAbility.setText(R.string.mask_of_madness_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_mask_of_madness);

                itemBuildFrom1.setImageResource(R.drawable.item_morbid_mask);
                itemBuildFrom2.setImageResource(R.drawable.item_quarterstaff);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "helm_of_the_dominator":
                itemIcon.setImageResource(R.drawable.item_helm_of_the_dominator);
                itemName.setText(R.string.helm_of_the_dominator);
                itemGoldText.setText(R.string.helm_of_the_dominator_gold);
                itemCooldownText.setText(R.string.helm_of_the_dominator_cooldown);
                itemManacostText.setText(R.string.helm_of_the_dominator_manacost);
                itemDescription.setText(R.string.helm_of_the_dominator_description);
                itemAbility.setText(R.string.helm_of_the_dominator_ability);

                itemBuildInto1.setImageResource(R.drawable.item_helm_of_the_dominator_2);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_helm_of_the_dominator);

                itemBuildFrom1.setImageResource(R.drawable.item_helm_of_iron_will);
                itemBuildFrom2.setImageResource(R.drawable.item_crown);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "echo_sabre":
                itemIcon.setImageResource(R.drawable.item_echo_sabre);
                itemName.setText(R.string.echo_sabre);
                itemGoldText.setText(R.string.echo_sabre_gold);
                itemCooldownText.setText(R.string.echo_sabre_cooldown);
                itemManacostText.setText(R.string.echo_sabre_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.echo_sabre_description);
                itemAbility.setText(R.string.echo_sabre_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_echo_sabre);

                itemBuildFrom1.setImageResource(R.drawable.item_ogre_axe);
                itemBuildFrom2.setImageResource(R.drawable.item_oblivion_staff);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "maelstrom":
                itemIcon.setImageResource(R.drawable.item_maelstrom);
                itemName.setText(R.string.maelstorm);
                itemGoldText.setText(R.string.maelstorm_gold);
                itemCooldownText.setText(R.string.maelstorm_cooldown);
                itemManacostText.setText(R.string.maelstorm_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.maelstorm_description);
                itemAbility.setText(R.string.maelstorm_ability);

                itemBuildInto1.setImageResource(R.drawable.item_mjollnir);
                itemBuildInto2.setImageResource(R.drawable.item_gleipnir);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_maelstrom);

                itemBuildFrom1.setImageResource(R.drawable.item_mithril_hammer);
                itemBuildFrom2.setImageResource(R.drawable.item_javelin);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "diffusal_blade":
                itemIcon.setImageResource(R.drawable.item_diffusal_blade);
                itemName.setText(R.string.diffusal_blade);
                itemGoldText.setText(R.string.diffusal_blade_gold);
                itemCooldownText.setText(R.string.diffusal_blade_cooldown);
                itemManacostText.setText(R.string.diffusal_blade_manacost);
                itemDescription.setText(R.string.diffusal_blade_description);
                itemAbility.setText(R.string.diffusal_blade_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_diffusal_blade);

                itemBuildFrom1.setImageResource(R.drawable.item_blade_of_alacrity);
                itemBuildFrom2.setImageResource(R.drawable.item_blade_of_alacrity);
                itemBuildFrom3.setImageResource(R.drawable.item_robe_of_the_magi);
                itemBuildFrom4.setImageResource(R.drawable.item_recipe);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "heavens_halberd":
                itemIcon.setImageResource(R.drawable.item_heavens_halberd);
                itemName.setText(R.string.heavens_halberd);
                itemGoldText.setText(R.string.heavens_halberd_gold);
                itemCooldownText.setText(R.string.heavens_halberd_cooldown);
                itemManacostText.setText(R.string.heavens_halberd_manacost);
                itemDescription.setText(R.string.heavens_halberd_description);
                itemAbility.setText(R.string.heavens_halberd_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_heavens_halberd);

                itemBuildFrom1.setImageResource(R.drawable.item_sange);
                itemBuildFrom2.setImageResource(R.drawable.item_talisman_of_evasion);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "desolator":
                itemIcon.setImageResource(R.drawable.item_desolator);
                itemName.setText(R.string.desolator);
                itemGoldText.setText(R.string.desolator_gold);
                itemCooldownText.setText(R.string.desolator_cooldown);
                itemManacostText.setText(R.string.desolator_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.desolator_description);
                itemAbility.setText(R.string.desolator_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_desolator);

                itemBuildFrom1.setImageResource(R.drawable.item_mithril_hammer);
                itemBuildFrom2.setImageResource(R.drawable.item_mithril_hammer);
                itemBuildFrom3.setImageResource(R.drawable.item_blight_stone);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "sange_and_yasha":
                itemIcon.setImageResource(R.drawable.item_sange_and_yasha);
                itemName.setText(R.string.sange_and_yasha);
                itemGoldText.setText(R.string.sange_and_yasha_gold);
                itemCooldownText.setText(R.string.sange_and_yasha_cooldown);
                itemManacostText.setText(R.string.sange_and_yasha_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.sange_and_yasha_description);
                itemAbility.setText(R.string.sange_and_yasha_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_sange_and_yasha);

                itemBuildFrom1.setImageResource(R.drawable.item_sange);
                itemBuildFrom2.setImageResource(R.drawable.item_yasha);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "eye_of_skadai":
                itemIcon.setImageResource(R.drawable.item_eye_of_skadai);
                itemName.setText(R.string.eye_of_skadai);
                itemGoldText.setText(R.string.eye_of_skadai_gold);
                itemCooldownText.setText(R.string.eye_of_skadai_cooldown);
                itemManacostText.setText(R.string.eye_of_skadai_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.eye_of_skadai_description);
                itemAbility.setText(R.string.eye_of_skadai_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_eye_of_skadai);

                itemBuildFrom1.setImageResource(R.drawable.item_ultimate_orb);
                itemBuildFrom2.setImageResource(R.drawable.item_ultimate_orb);
                itemBuildFrom3.setImageResource(R.drawable.item_point_booster);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "satanic":
                itemIcon.setImageResource(R.drawable.item_satanic);
                itemName.setText(R.string.satanic);
                itemGoldText.setText(R.string.satanic_gold);
                itemCooldownText.setText(R.string.satanic_cooldown);
                itemManacostText.setText(R.string.satanic_manacost);
                itemDescription.setText(R.string.satanic_description);
                itemAbility.setText(R.string.satanic_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_satanic);

                itemBuildFrom1.setImageResource(R.drawable.item_reaver);
                itemBuildFrom2.setImageResource(R.drawable.item_morbid_mask);
                itemBuildFrom3.setImageResource(R.drawable.item_claymore);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "mjollnir":
                itemIcon.setImageResource(R.drawable.item_mjollnir);
                itemName.setText(R.string.mjollnir);
                itemGoldText.setText(R.string.mjollnir_gold);
                itemCooldownText.setText(R.string.mjollnir_cooldown);
                itemManacostText.setText(R.string.mjollnir_manacost);
                itemDescription.setText(R.string.mjollnir_description);
                itemAbility.setText(R.string.mjollnir_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_mjollnir);

                itemBuildFrom1.setImageResource(R.drawable.item_hyperstone);
                itemBuildFrom2.setImageResource(R.drawable.item_maelstrom);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "yasha_and_kaya":
                itemIcon.setImageResource(R.drawable.item_yasha_and_kaya);
                itemName.setText(R.string.yasha_and_kaya);
                itemGoldText.setText(R.string.yasha_and_kaya_gold);
                itemCooldownText.setText(R.string.yasha_and_kaya_cooldown);
                itemManacostText.setText(R.string.yasha_and_kaya_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.yasha_and_kaya_description);
                itemAbility.setText(R.string.yasha_and_kaya_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_yasha_and_kaya);

                itemBuildFrom1.setImageResource(R.drawable.item_yasha);
                itemBuildFrom2.setImageResource(R.drawable.item_kaya);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "kaya_and_sange":
                itemIcon.setImageResource(R.drawable.item_kaya_and_sange);
                itemName.setText(R.string.kaya_and_sange);
                itemGoldText.setText(R.string.kaya_and_sange_gold);
                itemCooldownText.setText(R.string.kaya_and_sange_cooldown);
                itemManacostText.setText(R.string.kaya_and_sange_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.kaya_and_sange_description);
                itemAbility.setText(R.string.kaya_and_sange_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_kaya_and_sange);

                itemBuildFrom1.setImageResource(R.drawable.item_kaya);
                itemBuildFrom2.setImageResource(R.drawable.item_sange);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "holy_locket":
                itemIcon.setImageResource(R.drawable.item_holy_locket);
                itemName.setText(R.string.holy_locket);
                itemGoldText.setText(R.string.holy_locket_gold);
                itemCooldownText.setText(R.string.holy_locket_cooldown);
                itemManacostText.setText(R.string.holy_locket_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.holy_locket_description);
                itemAbility.setText(R.string.holy_locket_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_holy_locket);

                itemBuildFrom1.setImageResource(R.drawable.item_energy_booster);
                itemBuildFrom2.setImageResource(R.drawable.item_cloak);
                itemBuildFrom3.setImageResource(R.drawable.item_headdress);
                itemBuildFrom4.setImageResource(R.drawable.item_fluffy_hat);
                itemBuildFrom5.setImageResource(R.drawable.item_recipe);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "falcon_blade":
                itemIcon.setImageResource(R.drawable.item_falcon_blade);
                itemName.setText(R.string.falcon_blade);
                itemGoldText.setText(R.string.falcon_blade_gold);
                itemCooldownText.setText(R.string.falcon_blade_cooldown);
                itemManacostText.setText(R.string.falcon_blade_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.falcon_blade_description);
                itemAbility.setText(R.string.falcon_blade_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_falcon_blade);

                itemBuildFrom1.setImageResource(R.drawable.item_sages_mask);
                itemBuildFrom2.setImageResource(R.drawable.item_blades_of_attack);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "orb_of_corrosion":
                itemIcon.setImageResource(R.drawable.item_orb_of_corrosion);
                itemName.setText(R.string.orb_of_corrosion);
                itemGoldText.setText(R.string.orb_of_corrosion_gold);
                itemCooldownText.setText(R.string.orb_of_corrosion_cooldown);
                itemManacostText.setText(R.string.orb_of_corrosion_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.orb_of_corrosion_description);
                itemAbility.setText(R.string.orb_of_corrosion_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_orb_of_corrosion);

                itemBuildFrom1.setImageResource(R.drawable.item_blight_stone);
                itemBuildFrom2.setImageResource(R.drawable.item_orb_of_venom);
                itemBuildFrom3.setImageResource(R.drawable.item_fluffy_hat);
                itemBuildFrom4.setImageResource(R.drawable.item_recipe);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "witch_blade":
                itemIcon.setImageResource(R.drawable.item_witch_blade);
                itemName.setText(R.string.witch_blade);
                itemGoldText.setText(R.string.witch_blade_gold);
                itemCooldownText.setText(R.string.witch_blade_cooldown);
                itemManacostText.setText(R.string.witch_blade_manacost);
                itemManaCost.setVisibility(View.INVISIBLE);
                itemDescription.setText(R.string.witch_blade_description);
                itemAbility.setText(R.string.witch_blade_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_witch_blade);

                itemBuildFrom1.setImageResource(R.drawable.item_blitz_knuckles);
                itemBuildFrom2.setImageResource(R.drawable.item_chainmail);
                itemBuildFrom3.setImageResource(R.drawable.item_robe_of_the_magi);
                itemBuildFrom4.setImageResource(R.drawable.item_recipe);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "gleipnir":
                itemIcon.setImageResource(R.drawable.item_gleipnir);
                itemName.setText(R.string.gleipnir);
                itemGoldText.setText(R.string.gleipnir_gold);
                itemCooldownText.setText(R.string.gleipnir_cooldown);
                itemManacostText.setText(R.string.gleipnir_manacost);
                itemDescription.setText(R.string.gleipnir_description);
                itemAbility.setText(R.string.gleipnir_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_gleipnir);

                itemBuildFrom1.setImageResource(R.drawable.item_maelstrom);
                itemBuildFrom2.setImageResource(R.drawable.item_rod_of_atos);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "mage_slayer":
                itemIcon.setImageResource(R.drawable.item_mage_slayer);
                itemName.setText(R.string.mage_slayer);
                itemGoldText.setText(R.string.mage_slayer_gold);
                itemCooldownText.setText(R.string.mage_slayer_cooldown);
                itemCooldown.setVisibility(View.GONE);
                itemManacostText.setText(R.string.mage_slayer_manacost);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.mage_slayer_description);
                itemAbility.setText(R.string.mage_slayer_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_mage_slayer);

                itemBuildFrom1.setImageResource(R.drawable.item_cloak);
                itemBuildFrom2.setImageResource(R.drawable.item_oblivion_staff);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "eternal_shroud":
                itemIcon.setImageResource(R.drawable.item_eternal_shroud);
                itemName.setText(R.string.eternal_shroud);
                itemGoldText.setText(R.string.eternal_shroud_gold);
                itemCooldownText.setText(R.string.eternal_shroud_cooldown);
                itemManacostText.setText(R.string.eternal_shroud_manacost);
                itemDescription.setText(R.string.eternal_shroud_description);
                itemAbility.setText(R.string.eternal_shroud_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_eternal_shroud);

                itemBuildFrom1.setImageResource(R.drawable.item_hood_of_defiance);
                itemBuildFrom2.setImageResource(R.drawable.item_voodoo_mask);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "helm_of_the_dominator_2":
                itemIcon.setImageResource(R.drawable.item_helm_of_the_dominator_2);
                itemName.setText(R.string.helm_of_the_overlord);
                itemGoldText.setText(R.string.helm_of_the_overlord_gold);
                itemCooldownText.setText(R.string.helm_of_the_overlord_cooldown);
                itemManacostText.setText(R.string.helm_of_the_overlord_manacost);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.helm_of_the_overlord_description);
                itemAbility.setText(R.string.helm_of_the_overlord_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_helm_of_the_dominator_2);

                itemBuildFrom1.setImageResource(R.drawable.item_helm_of_the_dominator);
                itemBuildFrom2.setImageResource(R.drawable.item_vladmirs_offering);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "overwhelming_blink":
                itemIcon.setImageResource(R.drawable.item_overwhelming_blink);
                itemName.setText(R.string.overwhelming_blink);
                itemGoldText.setText(R.string.overwhelming_blink_gold);
                itemCooldownText.setText(R.string.overwhelming_blink_cooldown);
                itemManacostText.setText(R.string.overwhelming_blink_manacost);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.overwhelming_blink_description);
                itemAbility.setText(R.string.overwhelming_blink_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_overwhelming_blink);

                itemBuildFrom1.setImageResource(R.drawable.item_blink_dagger);
                itemBuildFrom2.setImageResource(R.drawable.item_reaver);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "swift_blink":
                itemIcon.setImageResource(R.drawable.item_swift_blink);
                itemName.setText(R.string.swift_blink);
                itemGoldText.setText(R.string.swift_blink_gold);
                itemCooldownText.setText(R.string.swift_blink_cooldown);
                itemManacostText.setText(R.string.swift_blink_manacost);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.swift_blink_description);
                itemAbility.setText(R.string.swift_blink_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_swift_blink);

                itemBuildFrom1.setImageResource(R.drawable.item_blink_dagger);
                itemBuildFrom2.setImageResource(R.drawable.item_eaglesong);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "arcane_blink":
                itemIcon.setImageResource(R.drawable.item_arcane_blink);
                itemName.setText(R.string.arcane_blink);
                itemGoldText.setText(R.string.arcane_blink_gold);
                itemCooldownText.setText(R.string.arcane_blink_cooldown);
                itemManacostText.setText(R.string.arcane_blink_manacost);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.arcane_blink_description);
                itemAbility.setText(R.string.arcane_blink_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_arcane_blink);

                itemBuildFrom1.setImageResource(R.drawable.item_blink_dagger);
                itemBuildFrom2.setImageResource(R.drawable.item_mystic_staff);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "wind_waker":
                itemIcon.setImageResource(R.drawable.item_wind_waker);
                itemName.setText(R.string.wind_waker);
                itemGoldText.setText(R.string.wind_waker_gold);
                itemCooldownText.setText(R.string.wind_waker_cooldown);
                itemManacostText.setText(R.string.wind_waker_manacost);
                itemDescription.setText(R.string.wind_waker_description);
                itemAbility.setText(R.string.wind_waker_ability);

                upArrow.setVisibility(View.GONE);
                itemChosen.setImageResource(R.drawable.item_wind_waker);

                itemBuildFrom1.setImageResource(R.drawable.item_euls_scepter_of_divinity);
                itemBuildFrom2.setImageResource(R.drawable.item_mystic_staff);
                itemBuildFrom3.setImageResource(R.drawable.item_recipe);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;
        }
    }

    public void loadSecretItemsSelection() {
        //Is used to get the intent values passed from the previous class
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        //Is used to get the itemSelected value from the previous class
        String itemSelected = extras.getString("itemSelected");


        switch (itemSelected) {
            //******************************************************************************
            //ALL OF THE SWITCH CASES FOR SECRET SHOP ITEMS
            //******************************************************************************
            case "energy_booster":
                itemIcon.setImageResource(R.drawable.item_energy_booster);
                itemName.setText(R.string.energy_booster);
                itemGoldText.setText(R.string.energy_booster_gold);
                itemCooldownText.setText(R.string.energy_booster_cooldown);
                itemManacostText.setText(R.string.energy_booster_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.energy_booster_description);
                itemAbility.setText(R.string.energy_booster_ability);

                itemBuildInto1.setImageResource(R.drawable.item_arcane_boots);
                itemBuildInto2.setImageResource(R.drawable.item_soul_booster);
                itemBuildInto3.setImageResource(R.drawable.item_aether_lens);
                itemBuildInto4.setImageResource(R.drawable.item_lotus_orb);
                itemBuildInto5.setImageResource(R.drawable.item_aeon_disk);
                itemBuildInto6.setImageResource(R.drawable.item_holy_locket);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_energy_booster);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "vitality_booster":
                itemIcon.setImageResource(R.drawable.item_vitality_booster);
                itemName.setText(R.string.vitality_booster);
                itemGoldText.setText(R.string.vitality_booster_gold);
                itemCooldownText.setText(R.string.vitality_booster_cooldown);
                itemManacostText.setText(R.string.vitality_booster_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.vitality_booster_description);
                itemAbility.setText(R.string.vitality_booster_ability);

                itemBuildInto1.setImageResource(R.drawable.item_heart_of_tarrasque);
                itemBuildInto2.setImageResource(R.drawable.item_soul_booster);
                itemBuildInto3.setImageResource(R.drawable.item_vanguard);
                itemBuildInto4.setImageResource(R.drawable.item_aeon_disk);
                itemBuildInto5.setImageResource(R.drawable.item_spirit_vessel);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_vitality_booster);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "point_booster":
                itemIcon.setImageResource(R.drawable.item_point_booster);
                itemName.setText(R.string.point_booster);
                itemGoldText.setText(R.string.point_booster_gold);
                itemCooldownText.setText(R.string.point_booster_cooldown);
                itemManacostText.setText(R.string.point_booster_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.point_booster_description);
                itemAbility.setText(R.string.point_booster_ability);

                itemBuildInto1.setImageResource(R.drawable.item_aghanims_scepter);
                itemBuildInto2.setImageResource(R.drawable.item_eye_of_skadai);
                itemBuildInto3.setImageResource(R.drawable.item_soul_booster);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_point_booster);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "platemail":
                itemIcon.setImageResource(R.drawable.item_platemail);
                itemName.setText(R.string.platemail);
                itemGoldText.setText(R.string.platemail_gold);
                itemCooldownText.setText(R.string.platemail_cooldown);
                itemManacostText.setText(R.string.platemail_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.platemail_description);
                itemAbility.setText(R.string.platemail_ability);

                itemBuildInto1.setImageResource(R.drawable.item_assault_cuirass);
                itemBuildInto2.setImageResource(R.drawable.item_shivas_guard);
                itemBuildInto3.setImageResource(R.drawable.item_lotus_orb);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_platemail);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "talisman_of_evasion":
                itemIcon.setImageResource(R.drawable.item_talisman_of_evasion);
                itemName.setText(R.string.talisman_of_evasion);
                itemGoldText.setText(R.string.talisman_of_evasion_gold);
                itemCooldownText.setText(R.string.talisman_of_evasion_cooldown);
                itemManacostText.setText(R.string.talisman_of_evasion_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.talisman_of_evasion_description);
                itemAbility.setText(R.string.talisman_of_evasion_ability);

                itemBuildInto1.setImageResource(R.drawable.item_butterfly);
                itemBuildInto2.setImageResource(R.drawable.item_heavens_halberd);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_talisman_of_evasion);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "hyperstone":
                itemIcon.setImageResource(R.drawable.item_hyperstone);
                itemName.setText(R.string.hyperstone);
                itemGoldText.setText(R.string.hyperstone_gold);
                itemCooldownText.setText(R.string.hyperstone_cooldown);
                itemManacostText.setText(R.string.hyperstone_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.hyperstone_description);
                itemAbility.setText(R.string.hyperstone_ability);

                itemBuildInto1.setImageResource(R.drawable.item_assault_cuirass);
                itemBuildInto2.setImageResource(R.drawable.item_mjollnir);
                itemBuildInto3.setImageResource(R.drawable.item_moon_shard);
                itemBuildInto4.setImageResource(R.drawable.item_bloodthorn);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_hyperstone);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "ultimate_orb":
                itemIcon.setImageResource(R.drawable.item_ultimate_orb);
                itemName.setText(R.string.ultimate_orb);
                itemGoldText.setText(R.string.ultimate_orb_gold);
                itemCooldownText.setText(R.string.ultimate_orb_cooldown);
                itemManacostText.setText(R.string.ultimate_orb_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.ultimate_orb_description);
                itemAbility.setText(R.string.ultimate_orb_ability);

                itemBuildInto1.setImageResource(R.drawable.item_linkens_sphere);
                itemBuildInto2.setImageResource(R.drawable.item_manta_style);
                itemBuildInto3.setImageResource(R.drawable.item_eye_of_skadai);
                itemBuildInto4.setImageResource(R.drawable.item_scythe_of_vyse);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_ultimate_orb);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "demon_edge":
                itemIcon.setImageResource(R.drawable.item_demon_edge);
                itemName.setText(R.string.demon_edge);
                itemGoldText.setText(R.string.demon_edge_gold);
                itemCooldownText.setText(R.string.demon_edge_cooldown);
                itemManacostText.setText(R.string.demon_edge_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.demon_edge_description);
                itemAbility.setText(R.string.demon_edge_ability);

                itemBuildInto1.setImageResource(R.drawable.item_daedalus);
                itemBuildInto2.setImageResource(R.drawable.item_divine_raiper);
                itemBuildInto3.setImageResource(R.drawable.item_monkey_king_bar);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_demon_edge);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "mystic_staff":
                itemIcon.setImageResource(R.drawable.item_mystic_staff);
                itemName.setText(R.string.mystic_staff);
                itemGoldText.setText(R.string.mystic_staff_gold);
                itemCooldownText.setText(R.string.mystic_staff_cooldown);
                itemManacostText.setText(R.string.mystic_staff_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.mystic_staff_description);
                itemAbility.setText(R.string.mystic_staff_ability);

                itemBuildInto1.setImageResource(R.drawable.item_scythe_of_vyse);
                itemBuildInto2.setImageResource(R.drawable.item_shivas_guard);
                itemBuildInto3.setImageResource(R.drawable.item_arcane_blink);
                itemBuildInto4.setImageResource(R.drawable.item_wind_waker);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_mystic_staff);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "reaver":
                itemIcon.setImageResource(R.drawable.item_reaver);
                itemName.setText(R.string.reaver);
                itemGoldText.setText(R.string.reaver_gold);
                itemCooldownText.setText(R.string.reaver_cooldown);
                itemManacostText.setText(R.string.reaver_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.reaver_description);
                itemAbility.setText(R.string.reaver_ability);

                itemBuildInto1.setImageResource(R.drawable.item_heart_of_tarrasque);
                itemBuildInto2.setImageResource(R.drawable.item_satanic);
                itemBuildInto3.setImageResource(R.drawable.item_overwhelming_blink);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_reaver);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "eaglesong":
                itemIcon.setImageResource(R.drawable.item_eaglesong);
                itemName.setText(R.string.eaglesong);
                itemGoldText.setText(R.string.eaglesong_gold);
                itemCooldownText.setText(R.string.eaglesong_cooldown);
                itemManacostText.setText(R.string.eaglesong_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.eaglesong_description);
                itemAbility.setText(R.string.eaglesong_ability);

                itemBuildInto1.setImageResource(R.drawable.item_butterfly);
                itemBuildInto2.setImageResource(R.drawable.item_ethereal_blade);
                itemBuildInto3.setImageResource(R.drawable.item_swift_blink);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_eaglesong);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;

            case "sacred_relic":
                itemIcon.setImageResource(R.drawable.item_sacred_relic);
                itemName.setText(R.string.sacred_relic);
                itemGoldText.setText(R.string.sacred_relic_gold);
                itemCooldownText.setText(R.string.sacred_relic_cooldown);
                itemManacostText.setText(R.string.sacred_relic_manacost);
                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemDescription.setText(R.string.sacred_relic_description);
                itemAbility.setText(R.string.sacred_relic_ability);

                itemBuildInto1.setImageResource(R.drawable.item_radiance);
                itemBuildInto2.setImageResource(R.drawable.item_nullifier);
                itemBuildInto3.setImageResource(R.drawable.item_divine_raiper);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                itemChosen.setImageResource(R.drawable.item_sacred_relic);
                downArrow.setVisibility(View.GONE);

                layoutAbility.setVisibility(View.GONE);
                break;
        }
    }

    public void loadNeutralItemsSelection() {
        //Is used to get the intent values passed from the previous class
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        //Is used to get the itemSelected value from the previous class
        String itemSelected = extras.getString("itemSelected");


        switch (itemSelected) {
            //******************************************************************************
            //ALL OF THE SWITCH CASES FOR NEUTRAL ITEMS
            //******************************************************************************
            case "arcane_ring":
                itemIcon.setImageResource(R.drawable.neutral_items_tier1_arcane_ring);
                itemName.setText(R.string.arcane_ring);
                itemGoldText.setText(R.string.arcane_ring_gold);
                itemCooldownText.setText(R.string.arcane_ring_cooldown);
                itemManacostText.setText(R.string.arcane_ring_manacost);
                itemDescription.setText(R.string.arcane_ring_description);
                itemAbility.setText(R.string.arcane_ring_ability);

                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "broom_handle":
                itemIcon.setImageResource(R.drawable.neutral_items_tier1_broom_handle);
                itemName.setText(R.string.broom_handle);
                itemGoldText.setText(R.string.broom_handle_gold);
                itemCooldownText.setText(R.string.broom_handle_cooldown);
                itemManacostText.setText(R.string.broom_handle_manacost);
                itemDescription.setText(R.string.broom_handle_description);
                itemAbility.setText(R.string.broom_handle_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "faded_broach":
                itemIcon.setImageResource(R.drawable.neutral_items_tier1_faded_broach);
                itemName.setText(R.string.faded_broach);
                itemGoldText.setText(R.string.faded_broach_gold);
                itemCooldownText.setText(R.string.faded_broach_cooldown);
                itemManacostText.setText(R.string.faded_broach_manacost);
                itemDescription.setText(R.string.faded_broach_description);
                itemAbility.setText(R.string.faded_broach_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "pig_pole":
                itemIcon.setImageResource(R.drawable.neutral_items_tier1_pig_pole);
                itemName.setText(R.string.pig_pole);
                itemGoldText.setText(R.string.pig_pole_gold);
                itemCooldownText.setText(R.string.pig_pole_cooldown);
                itemManacostText.setText(R.string.pig_pole_manacost);
                itemDescription.setText(R.string.pig_pole_description);
                itemAbility.setText(R.string.pig_pole_ability);

                itemGold.setVisibility(View.GONE);

                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "tumblers_toy":
                itemIcon.setImageResource(R.drawable.neutral_items_tier1_tumblers_toy);
                itemName.setText(R.string.tumblers_toy);
                itemGoldText.setText(R.string.tumblers_toy_gold);
                itemCooldownText.setText(R.string.tumblers_toy_cooldown);
                itemManacostText.setText(R.string.tumblers_toy_manacost);
                itemDescription.setText(R.string.tumblers_toy_description);
                itemAbility.setText(R.string.tumblers_toy_ability);

                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "fairys_trinket":
                itemIcon.setImageResource(R.drawable.neutral_items_tier1_fairys_trinket);
                itemName.setText(R.string.fairys_trinket);
                itemGoldText.setText(R.string.fairys_trinket_gold);
                itemCooldownText.setText(R.string.fairys_trinket_cooldown);
                itemManacostText.setText(R.string.fairys_trinket_manacost);
                itemDescription.setText(R.string.fairys_trinket_description);
                itemAbility.setText(R.string.fairys_trinket_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;


            case "ironwood_tree":
                itemIcon.setImageResource(R.drawable.neutral_items_tier1_ironwood_tree);
                itemName.setText(R.string.ironwood_tree);
                itemGoldText.setText(R.string.ironwood_tree_gold);
                itemCooldownText.setText(R.string.ironwood_tree_cooldown);
                itemManacostText.setText(R.string.ironwood_tree_manacost);
                itemDescription.setText(R.string.ironwood_tree_description);
                itemAbility.setText(R.string.ironwood_tree_ability);

                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "keen_optic":
                itemIcon.setImageResource(R.drawable.neutral_items_tier1_keen_optic);
                itemName.setText(R.string.keen_optic);
                itemGoldText.setText(R.string.keen_optic_gold);
                itemCooldownText.setText(R.string.keen_optic_cooldown);
                itemManacostText.setText(R.string.keen_optic_manacost);
                itemDescription.setText(R.string.keen_optic_description);
                itemAbility.setText(R.string.keen_optic_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "chipped_vest":
                itemIcon.setImageResource(R.drawable.neutral_items_tier1_chipped_vest);
                itemName.setText(R.string.chipped_vest);
                itemGoldText.setText(R.string.chipped_vest_gold);
                itemCooldownText.setText(R.string.chipped_vest_cooldown);
                itemManacostText.setText(R.string.chipped_vest_manacost);
                itemDescription.setText(R.string.chipped_vest_description);
                itemAbility.setText(R.string.chipped_vest_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;


            case "ocean_heart":
                itemIcon.setImageResource(R.drawable.neutral_items_tier1_ocean_heart);
                itemName.setText(R.string.ocean_heart);
                itemGoldText.setText(R.string.ocean_heart_gold);
                itemCooldownText.setText(R.string.ocean_heart_cooldown);
                itemManacostText.setText(R.string.ocean_heart_manacost);
                itemDescription.setText(R.string.ocean_heart_description);
                itemAbility.setText(R.string.ocean_heart_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "possessed_mask":
                itemIcon.setImageResource(R.drawable.neutral_items_tier1_possessed_mask);
                itemName.setText(R.string.possessed_mask);
                itemGoldText.setText(R.string.possessed_mask_gold);
                itemCooldownText.setText(R.string.possessed_mask_cooldown);
                itemManacostText.setText(R.string.possessed_mask_manacost);
                itemDescription.setText(R.string.possessed_mask_description);
                itemAbility.setText(R.string.possessed_mask_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;


            case "trusty_shovel":
                itemIcon.setImageResource(R.drawable.neutral_items_tier1_trusty_shovel);
                itemName.setText(R.string.trusty_shovel);
                itemGoldText.setText(R.string.trusty_shovel_gold);
                itemCooldownText.setText(R.string.trusty_shovel_cooldown);
                itemManacostText.setText(R.string.trusty_shovel_manacost);
                itemDescription.setText(R.string.trusty_shovel_description);
                itemAbility.setText(R.string.trusty_shovel_ability);

                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "quicksilver_amulet":
                itemIcon.setImageResource(R.drawable.neutral_items_tier2_quicksilver_amulet);
                itemName.setText(R.string.quicksilver_amulet);
                itemGoldText.setText(R.string.quicksilver_amulet_gold);
                itemCooldownText.setText(R.string.quicksilver_amulet_cooldown);
                itemManacostText.setText(R.string.quicksilver_amulet_manacost);
                itemDescription.setText(R.string.quicksilver_amulet_description);
                itemAbility.setText(R.string.quicksilver_amulet_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "dragon_scale":
                itemIcon.setImageResource(R.drawable.neutral_items_tier2_dragon_scale);
                itemName.setText(R.string.dragon_scale);
                itemGoldText.setText(R.string.dragon_scale_gold);
                itemCooldownText.setText(R.string.dragon_scale_cooldown);
                itemManacostText.setText(R.string.dragon_scale_manacost);
                itemDescription.setText(R.string.dragon_scale_description);
                itemAbility.setText(R.string.dragon_scale_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "essence_ring":
                itemIcon.setImageResource(R.drawable.neutral_items_tier2_essence_ring);
                itemName.setText(R.string.essence_ring);
                itemGoldText.setText(R.string.essence_ring_gold);
                itemCooldownText.setText(R.string.essence_ring_cooldown);
                itemManacostText.setText(R.string.essence_ring_manacost);
                itemDescription.setText(R.string.essence_ring_description);
                itemAbility.setText(R.string.essence_ring_ability);

                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "grove_bow":
                itemIcon.setImageResource(R.drawable.neutral_items_tier2_grove_bow);
                itemName.setText(R.string.grove_bow);
                itemGoldText.setText(R.string.grove_bow_gold);
                itemCooldownText.setText(R.string.grove_bow_cooldown);
                itemManacostText.setText(R.string.grove_bow_manacost);
                itemDescription.setText(R.string.grove_bow_description);
                itemAbility.setText(R.string.grove_bow_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "imp_claw":
                itemIcon.setImageResource(R.drawable.neutral_items_tier2_imp_claw);
                itemName.setText(R.string.imp_claw);
                itemGoldText.setText(R.string.imp_claw_gold);
                itemCooldownText.setText(R.string.imp_claw_cooldown);
                itemManacostText.setText(R.string.imp_claw_manacost);
                itemDescription.setText(R.string.imp_claw_description);
                itemAbility.setText(R.string.imp_claw_ability);

                itemManaCost.setVisibility(View.INVISIBLE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "brigands_blade":
                itemIcon.setImageResource(R.drawable.neutral_items_tier2_brigands_blade);
                itemName.setText(R.string.brigands_blade);
                itemGoldText.setText(R.string.brigands_blade_gold);
                itemCooldownText.setText(R.string.brigands_blade_cooldown);
                itemManacostText.setText(R.string.brigands_blade_manacost);
                itemDescription.setText(R.string.brigands_blade_description);
                itemAbility.setText(R.string.brigands_blade_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "fae_grenade":
                itemIcon.setImageResource(R.drawable.neutral_items_tier2_fae_grenade);
                itemName.setText(R.string.fae_grenade);
                itemGoldText.setText(R.string.fae_grenade_gold);
                itemCooldownText.setText(R.string.fae_grenade_cooldown);
                itemManacostText.setText(R.string.fae_grenade_manacost);
                itemDescription.setText(R.string.fae_grenade_description);
                itemAbility.setText(R.string.fae_grenade_ability);

                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "nether_shawl":
                itemIcon.setImageResource(R.drawable.neutral_items_tier2_nether_shawl);
                itemName.setText(R.string.nether_shawl);
                itemGoldText.setText(R.string.nether_shawl_gold);
                itemCooldownText.setText(R.string.nether_shawl_cooldown);
                itemManacostText.setText(R.string.nether_shawl_manacost);
                itemDescription.setText(R.string.nether_shawl_description);
                itemAbility.setText(R.string.nether_shawl_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "philosophers_stone":
                itemIcon.setImageResource(R.drawable.neutral_items_tier2_philosophers_stone);
                itemName.setText(R.string.philosophers_stone);
                itemGoldText.setText(R.string.philosophers_stone_gold);
                itemCooldownText.setText(R.string.philosophers_stone_cooldown);
                itemManacostText.setText(R.string.philosophers_stone_manacost);
                itemDescription.setText(R.string.philosophers_stone_description);
                itemAbility.setText(R.string.philosophers_stone_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "pupils_gift":
                itemIcon.setImageResource(R.drawable.neutral_items_tier2_pupils_gift);
                itemName.setText(R.string.pupils_gift);
                itemGoldText.setText(R.string.pupils_gift_gold);
                itemCooldownText.setText(R.string.pupils_gift_cooldown);
                itemManacostText.setText(R.string.pupils_gift_manacost);
                itemDescription.setText(R.string.pupils_gift_description);
                itemAbility.setText(R.string.pupils_gift_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "ring_of_aquila":
                itemIcon.setImageResource(R.drawable.neutral_items_tier2_ring_of_aquila);
                itemName.setText(R.string.ring_of_aquila);
                itemGoldText.setText(R.string.ring_of_aquila_gold);
                itemCooldownText.setText(R.string.ring_of_aquila_cooldown);
                itemManacostText.setText(R.string.ring_of_aquila_manacost);
                itemDescription.setText(R.string.ring_of_aquila_description);
                itemAbility.setText(R.string.ring_of_aquila_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "vambrace":
                itemIcon.setImageResource(R.drawable.neutral_items_tier2_vambrace);
                itemName.setText(R.string.vambrace);
                itemGoldText.setText(R.string.vambrace_gold);
                itemCooldownText.setText(R.string.vambrace_cooldown);
                itemManacostText.setText(R.string.vambrace_manacost);
                itemDescription.setText(R.string.vambrace_description);
                itemAbility.setText(R.string.vambrace_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "bullwhip":
                itemIcon.setImageResource(R.drawable.neutral_items_tier2_bullwhip);
                itemName.setText(R.string.bullwhip);
                itemGoldText.setText(R.string.bullwhip_gold);
                itemCooldownText.setText(R.string.bullwhip_cooldown);
                itemManacostText.setText(R.string.bullwhip_manacost);
                itemDescription.setText(R.string.bullwhip_description);
                itemAbility.setText(R.string.bullwhip_ability);

                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "cloak_of_flames":
                itemIcon.setImageResource(R.drawable.neutral_items_tier3_cloak_of_flames);
                itemName.setText(R.string.cloak_of_flames);
                itemGoldText.setText(R.string.cloak_of_flames_gold);
                itemCooldownText.setText(R.string.cloak_of_flames_cooldown);
                itemManacostText.setText(R.string.cloak_of_flames_manacost);
                itemDescription.setText(R.string.cloak_of_flames_description);
                itemAbility.setText(R.string.cloak_of_flames_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "enchanted_quiver":
                itemIcon.setImageResource(R.drawable.neutral_items_tier3_enchanted_quiver);
                itemName.setText(R.string.enchanted_quiver);
                itemGoldText.setText(R.string.enchanted_quiver_gold);
                itemCooldownText.setText(R.string.enchanted_quiver_cooldown);
                itemManacostText.setText(R.string.enchanted_quiver_manacost);
                itemDescription.setText(R.string.enchanted_quiver_description);
                itemAbility.setText(R.string.enchanted_quiver_ability);

                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "ceremonial_robe":
                itemIcon.setImageResource(R.drawable.neutral_items_tier3_ceremonial_robe);
                itemName.setText(R.string.ceremonial_robe);
                itemGoldText.setText(R.string.ceremonial_robe_gold);
                itemCooldownText.setText(R.string.ceremonial_robe_cooldown);
                itemManacostText.setText(R.string.ceremonial_robe_manacost);
                itemDescription.setText(R.string.ceremonial_robe_description);
                itemAbility.setText(R.string.ceremonial_robe_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "psychic_headband":
                itemIcon.setImageResource(R.drawable.neutral_items_tier3_psychic_headband);
                itemName.setText(R.string.psychic_headband);
                itemGoldText.setText(R.string.psychic_headband_gold);
                itemCooldownText.setText(R.string.psychic_headband_cooldown);
                itemManacostText.setText(R.string.psychic_headband_manacost);
                itemDescription.setText(R.string.psychic_headband_description);
                itemAbility.setText(R.string.psychic_headband_ability);

                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "mind_breaker":
                itemIcon.setImageResource(R.drawable.neutral_items_tier3_mind_breaker);
                itemName.setText(R.string.mind_breaker);
                itemGoldText.setText(R.string.mind_breaker_gold);
                itemCooldownText.setText(R.string.mind_breaker_cooldown);
                itemManacostText.setText(R.string.mind_breaker_manacost);
                itemDescription.setText(R.string.mind_breaker_description);
                itemAbility.setText(R.string.mind_breaker_ability);

                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "orb_of_destruction":
                itemIcon.setImageResource(R.drawable.neutral_items_tier3_orb_of_destruction);
                itemName.setText(R.string.orb_of_destruction);
                itemGoldText.setText(R.string.orb_of_destruction_gold);
                itemCooldownText.setText(R.string.orb_of_destruction_cooldown);
                itemManacostText.setText(R.string.orb_of_destruction_manacost);
                itemDescription.setText(R.string.orb_of_destruction_description);
                itemAbility.setText(R.string.orb_of_destruction_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "paladin_sword":
                itemIcon.setImageResource(R.drawable.neutral_items_tier3_paladin_sword);
                itemName.setText(R.string.paladin_sword);
                itemGoldText.setText(R.string.paladin_sword_gold);
                itemCooldownText.setText(R.string.paladin_sword_cooldown);
                itemManacostText.setText(R.string.paladin_sword_manacost);
                itemDescription.setText(R.string.paladin_sword_description);
                itemAbility.setText(R.string.paladin_sword_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "quickening_charm":
                itemIcon.setImageResource(R.drawable.neutral_items_tier3_quickening_charm);
                itemName.setText(R.string.quickening_charm);
                itemGoldText.setText(R.string.quickening_charm_gold);
                itemCooldownText.setText(R.string.quickening_charm_cooldown);
                itemManacostText.setText(R.string.quickening_charm_manacost);
                itemDescription.setText(R.string.quickening_charm_description);
                itemAbility.setText(R.string.quickening_charm_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "elvin_tunic":
                itemIcon.setImageResource(R.drawable.neutral_items_tier3_elven_tunic);
                itemName.setText(R.string.elvin_tunic);
                itemGoldText.setText(R.string.elvin_tunic_gold);
                itemCooldownText.setText(R.string.elvin_tunic_cooldown);
                itemManacostText.setText(R.string.elvin_tunic_manacost);
                itemDescription.setText(R.string.elvin_tunic_description);
                itemAbility.setText(R.string.elvin_tunic_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "spider_legs":
                itemIcon.setImageResource(R.drawable.neutral_items_tier3_spider_legs);
                itemName.setText(R.string.spider_legs);
                itemGoldText.setText(R.string.spider_legs_gold);
                itemCooldownText.setText(R.string.spider_legs_cooldown);
                itemManacostText.setText(R.string.spider_legs_manacost);
                itemDescription.setText(R.string.spider_legs_description);
                itemAbility.setText(R.string.spider_legs_ability);

                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "telescope":
                itemIcon.setImageResource(R.drawable.neutral_items_tier4_telescope);
                itemName.setText(R.string.telescope);
                itemGoldText.setText(R.string.telescope_gold);
                itemCooldownText.setText(R.string.telescope_cooldown);
                itemManacostText.setText(R.string.telescope_manacost);
                itemDescription.setText(R.string.telescope_description);
                itemAbility.setText(R.string.telescope_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "blast_rig":
                itemIcon.setImageResource(R.drawable.neutral_items_tier3_blast_rig);
                itemName.setText(R.string.blast_rig);
                itemGoldText.setText(R.string.blast_rig_gold);
                itemCooldownText.setText(R.string.blast_rig_cooldown);
                itemManacostText.setText(R.string.blast_rig_manacost);
                itemDescription.setText(R.string.blast_rig_description);
                itemAbility.setText(R.string.blast_rig_ability);

                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "titan_sliver":
                itemIcon.setImageResource(R.drawable.neutral_items_tier3_titan_sliver);
                itemName.setText(R.string.titan_sliver);
                itemGoldText.setText(R.string.titan_sliver_gold);
                itemCooldownText.setText(R.string.titan_sliver_cooldown);
                itemManacostText.setText(R.string.titan_sliver_manacost);
                itemDescription.setText(R.string.titan_sliver_description);
                itemAbility.setText(R.string.titan_sliver_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "flicker":
                itemIcon.setImageResource(R.drawable.neutral_items_tier4_flicker);
                itemName.setText(R.string.flicker);
                itemGoldText.setText(R.string.flicker_gold);
                itemCooldownText.setText(R.string.flicker_cooldown);
                itemManacostText.setText(R.string.flicker_manacost);
                itemDescription.setText(R.string.flicker_description);
                itemAbility.setText(R.string.flicker_ability);

                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;


            case "illusionists_cape":
                itemIcon.setImageResource(R.drawable.neutral_items_tier4_illusionists_cape);
                itemName.setText(R.string.illusionists_cape);
                itemGoldText.setText(R.string.illusionists_cape_gold);
                itemCooldownText.setText(R.string.illusionists_cape_cooldown);
                itemManacostText.setText(R.string.illusionists_cape_manacost);
                itemDescription.setText(R.string.illusionists_cape_description);
                itemAbility.setText(R.string.illusionists_cape_ability);

                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "penta_edged_sword":
                itemIcon.setImageResource(R.drawable.neutral_items_tier4_penta_edged_sword);
                itemName.setText(R.string.penta_edged_sword);
                itemGoldText.setText(R.string.penta_edged_sword_gold);
                itemCooldownText.setText(R.string.penta_edged_sword_cooldown);
                itemManacostText.setText(R.string.penta_edged_sword_manacost);
                itemDescription.setText(R.string.penta_edged_sword_description);
                itemAbility.setText(R.string.penta_edged_sword_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "minotaur_horn":
                itemIcon.setImageResource(R.drawable.neutral_items_tier4_minotaur_horn);
                itemName.setText(R.string.minotaur_horn);
                itemGoldText.setText(R.string.minotaur_horn_gold);
                itemCooldownText.setText(R.string.minotaur_horn_cooldown);
                itemManacostText.setText(R.string.minotaur_horn_manacost);
                itemDescription.setText(R.string.minotaur_horn_description);
                itemAbility.setText(R.string.minotaur_horn_ability);

                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "ninja_gear":
                itemIcon.setImageResource(R.drawable.neutral_items_tier4_ninja_gear);
                itemName.setText(R.string.ninja_gear);
                itemGoldText.setText(R.string.ninja_gear_gold);
                itemCooldownText.setText(R.string.ninja_gear_cooldown);
                itemManacostText.setText(R.string.ninja_gear_manacost);
                itemDescription.setText(R.string.ninja_gear_description);
                itemAbility.setText(R.string.ninja_gear_ability);

                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "ascetics_cap":
                itemIcon.setImageResource(R.drawable.neutral_items_tier4_ascetics_cap);
                itemName.setText(R.string.ascetics_cap);
                itemGoldText.setText(R.string.ascetics_cap_gold);
                itemCooldownText.setText(R.string.ascetics_cap_cooldown);
                itemManacostText.setText(R.string.ascetics_cap_manacost);
                itemDescription.setText(R.string.ascetics_cap_description);
                itemAbility.setText(R.string.ascetics_cap_ability);

                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "witchbane":
                itemIcon.setImageResource(R.drawable.neutral_items_tier4_witchbane);
                itemName.setText(R.string.witchbane);
                itemGoldText.setText(R.string.witchbane_gold);
                itemCooldownText.setText(R.string.witchbane_cooldown);
                itemManacostText.setText(R.string.witchbane_manacost);
                itemDescription.setText(R.string.witchbane_description);
                itemAbility.setText(R.string.witchbane_ability);

                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "trickster_cloak":
                itemIcon.setImageResource(R.drawable.neutral_items_tier4_trickster_cloak);
                itemName.setText(R.string.trickster_cloak);
                itemGoldText.setText(R.string.trickster_cloak_gold);
                itemCooldownText.setText(R.string.trickster_cloak_cooldown);
                itemManacostText.setText(R.string.trickster_cloak_manacost);
                itemDescription.setText(R.string.trickster_cloak_description);
                itemAbility.setText(R.string.trickster_cloak_ability);

                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "spell_prism":
                itemIcon.setImageResource(R.drawable.neutral_items_tier4_spell_prism);
                itemName.setText(R.string.spell_prism);
                itemGoldText.setText(R.string.spell_prism_gold);
                itemCooldownText.setText(R.string.spell_prism_cooldown);
                itemManacostText.setText(R.string.spell_prism_manacost);
                itemDescription.setText(R.string.spell_prism_description);
                itemAbility.setText(R.string.spell_prism_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "the_leveller":
                itemIcon.setImageResource(R.drawable.neutral_items_tier4_the_leveller);
                itemName.setText(R.string.the_leveller);
                itemGoldText.setText(R.string.the_leveller_gold);
                itemCooldownText.setText(R.string.the_leveller_cooldown);
                itemManacostText.setText(R.string.the_leveller_manacost);
                itemDescription.setText(R.string.the_leveller_description);
                itemAbility.setText(R.string.the_leveller_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "timeless_relic":
                itemIcon.setImageResource(R.drawable.neutral_items_tier4_timeless_relic);
                itemName.setText(R.string.timeless_relic);
                itemGoldText.setText(R.string.timeless_relic_gold);
                itemCooldownText.setText(R.string.timeless_relic_cooldown);
                itemManacostText.setText(R.string.timeless_relic_manacost);
                itemDescription.setText(R.string.timeless_relic_description);
                itemAbility.setText(R.string.timeless_relic_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "stormcrafter":
                itemIcon.setImageResource(R.drawable.neutral_items_tier4_stormcrafter);
                itemName.setText(R.string.stormcrafter);
                itemGoldText.setText(R.string.stormcrafter_gold);
                itemCooldownText.setText(R.string.stormcrafter_cooldown);
                itemManacostText.setText(R.string.stormcrafter_manacost);
                itemDescription.setText(R.string.stormcrafter_description);
                itemAbility.setText(R.string.stormcrafter_ability);

                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "apex":
                itemIcon.setImageResource(R.drawable.neutral_items_tier5_apex);
                itemName.setText(R.string.apex);
                itemGoldText.setText(R.string.apex_gold);
                itemCooldownText.setText(R.string.apex_cooldown);
                itemManacostText.setText(R.string.apex_manacost);
                itemDescription.setText(R.string.apex_description);
                itemAbility.setText(R.string.apex_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "ballista":
                itemIcon.setImageResource(R.drawable.neutral_items_tier5_ballista);
                itemName.setText(R.string.ballista);
                itemGoldText.setText(R.string.ballista_gold);
                itemCooldownText.setText(R.string.ballista_cooldown);
                itemManacostText.setText(R.string.ballista_manacost);
                itemDescription.setText(R.string.ballista_description);
                itemAbility.setText(R.string.ballista_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "book_of_the_dead":
                itemIcon.setImageResource(R.drawable.neutral_items_tier5_book_of_the_dead);
                itemName.setText(R.string.book_of_the_dead);
                itemGoldText.setText(R.string.book_of_the_dead_gold);
                itemCooldownText.setText(R.string.book_of_the_dead_cooldown);
                itemManacostText.setText(R.string.book_of_the_dead_manacost);
                itemDescription.setText(R.string.book_of_the_dead_description);
                itemAbility.setText(R.string.book_of_the_dead_ability);

                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "ex_machina":
                itemIcon.setImageResource(R.drawable.neutral_items_tier5_ex_machina);
                itemName.setText(R.string.ex_machina);
                itemGoldText.setText(R.string.ex_machina_gold);
                itemCooldownText.setText(R.string.ex_machina_cooldown);
                itemManacostText.setText(R.string.ex_machina_manacost);
                itemDescription.setText(R.string.ex_machina_description);
                itemAbility.setText(R.string.ex_machina_ability);

                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "fallen_sky":
                itemIcon.setImageResource(R.drawable.neutral_items_tier5_fallen_sky);
                itemName.setText(R.string.fallen_sky);
                itemGoldText.setText(R.string.fallen_sky_gold);
                itemCooldownText.setText(R.string.fallen_sky_cooldown);
                itemManacostText.setText(R.string.fallen_sky_manacost);
                itemDescription.setText(R.string.fallen_sky_description);
                itemAbility.setText(R.string.fallen_sky_ability);

                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "force_boots":
                itemIcon.setImageResource(R.drawable.neutral_items_tier5_force_boots);
                itemName.setText(R.string.force_boots);
                itemGoldText.setText(R.string.force_boots_gold);
                itemCooldownText.setText(R.string.force_boots_cooldown);
                itemManacostText.setText(R.string.force_boots_manacost);
                itemDescription.setText(R.string.force_boots_description);
                itemAbility.setText(R.string.force_boots_ability);

                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "arcanists_armour":
                itemIcon.setImageResource(R.drawable.neutral_items_tier5_arcanists_armour);
                itemName.setText(R.string.arcanists_armour);
                itemGoldText.setText(R.string.arcanists_armour_gold);
                itemCooldownText.setText(R.string.arcanists_armour_cooldown);
                itemManacostText.setText(R.string.arcanists_armour_manacost);
                itemDescription.setText(R.string.arcanists_armour_description);
                itemAbility.setText(R.string.arcanists_armour_ability);

                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "mirror_shield":
                itemIcon.setImageResource(R.drawable.neutral_items_tier5_mirror_shield);
                itemName.setText(R.string.mirror_shield);
                itemGoldText.setText(R.string.mirror_shield_gold);
                itemCooldownText.setText(R.string.mirror_shield_cooldown);
                itemManacostText.setText(R.string.mirror_shield_manacost);
                itemDescription.setText(R.string.mirror_shield_description);
                itemAbility.setText(R.string.mirror_shield_ability);

                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "pirate_hat":
                itemIcon.setImageResource(R.drawable.neutral_items_tier5_pirate_hat);
                itemName.setText(R.string.pirate_hat);
                itemGoldText.setText(R.string.pirate_hat_gold);
                itemCooldownText.setText(R.string.pirate_hat_cooldown);
                itemManacostText.setText(R.string.pirate_hat_manacost);
                itemDescription.setText(R.string.pirate_hat_description);
                itemAbility.setText(R.string.pirate_hat_ability);

                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "seer_stone":
                itemIcon.setImageResource(R.drawable.neutral_items_tier5_seer_stone);
                itemName.setText(R.string.seer_stone);
                itemGoldText.setText(R.string.seer_stone_gold);
                itemCooldownText.setText(R.string.seer_stone_cooldown);
                itemManacostText.setText(R.string.seer_stone_manacost);
                itemDescription.setText(R.string.seer_stone_description);
                itemAbility.setText(R.string.seer_stone_ability);

                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "stygian_desolator":
                itemIcon.setImageResource(R.drawable.neutral_items_tier5_stygian_desolator);
                itemName.setText(R.string.stygian_desolator);
                itemGoldText.setText(R.string.stygian_desolator_gold);
                itemCooldownText.setText(R.string.stygian_desolator_cooldown);
                itemManacostText.setText(R.string.stygian_desolator_manacost);
                itemDescription.setText(R.string.stygian_desolator_description);
                itemAbility.setText(R.string.stygian_desolator_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "giants_ring":
                itemIcon.setImageResource(R.drawable.neutral_items_tier5_giants_ring);
                itemName.setText(R.string.giants_ring);
                itemGoldText.setText(R.string.giants_ring_gold);
                itemCooldownText.setText(R.string.giants_ring_cooldown);
                itemManacostText.setText(R.string.giants_ring_manacost);
                itemDescription.setText(R.string.giants_ring_description);
                itemAbility.setText(R.string.giants_ring_ability);

                itemCooldown.setVisibility(View.GONE);
                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.INVISIBLE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;

            case "book_of_shadows":
                itemIcon.setImageResource(R.drawable.neutral_items_tier5_book_of_shadows);
                itemName.setText(R.string.book_of_shadows);
                itemGoldText.setText(R.string.book_of_shadows_gold);
                itemCooldownText.setText(R.string.book_of_shadows_cooldown);
                itemManacostText.setText(R.string.book_of_shadows_manacost);
                itemDescription.setText(R.string.book_of_shadows_description);
                itemAbility.setText(R.string.book_of_shadows_ability);

                itemManaCost.setVisibility(View.GONE);
                itemGold.setVisibility(View.GONE);


                itemBuildInto1.setVisibility(View.GONE);
                itemBuildInto2.setVisibility(View.GONE);
                itemBuildInto3.setVisibility(View.GONE);
                itemBuildInto4.setVisibility(View.GONE);
                itemBuildInto5.setVisibility(View.GONE);
                itemBuildInto6.setVisibility(View.GONE);
                itemBuildInto7.setVisibility(View.GONE);

                upArrow.setVisibility(View.GONE);
                itemChosen.setVisibility(View.GONE);
                downArrow.setVisibility(View.GONE);

                itemBuildFrom1.setVisibility(View.GONE);
                itemBuildFrom2.setVisibility(View.GONE);
                itemBuildFrom3.setVisibility(View.GONE);
                itemBuildFrom4.setVisibility(View.GONE);
                itemBuildFrom5.setVisibility(View.GONE);
                itemBuildFrom6.setVisibility(View.GONE);
                break;
        }
    }
}
