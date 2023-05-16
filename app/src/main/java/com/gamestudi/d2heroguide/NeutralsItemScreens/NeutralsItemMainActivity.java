package com.gamestudi.d2heroguide.NeutralsItemScreens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.gamestudi.d2heroguide.ItemScreens.ItemScreenFragment;
import com.gamestudi.d2heroguide.R;


public class NeutralsItemMainActivity extends AppCompatActivity {

    Intent intent;

    ImageView Tier1Items1;
    ImageView Tier1Items2;
    ImageView Tier1Items3;
    ImageView Tier1Items4;
    ImageView Tier1Items5;
    ImageView Tier1Items6;
    ImageView Tier1Items7;
    ImageView Tier1Items8;
    ImageView Tier1Items9;
    ImageView Tier1Items10;
    ImageView Tier1Items11;
    ImageView Tier1Items12;

    ImageView Tier2Items1;
    ImageView Tier2Items2;
    ImageView Tier2Items3;
    ImageView Tier2Items4;
    ImageView Tier2Items5;
    ImageView Tier2Items6;
    ImageView Tier2Items7;
    ImageView Tier2Items8;
    ImageView Tier2Items9;
    ImageView Tier2Items10;
    ImageView Tier2Items11;
    ImageView Tier2Items12;

    ImageView Tier3Items1;
    ImageView Tier3Items2;
    ImageView Tier3Items3;
    ImageView Tier3Items4;
    ImageView Tier3Items5;
    ImageView Tier3Items6;
    ImageView Tier3Items7;
    ImageView Tier3Items8;
    ImageView Tier3Items9;
    ImageView Tier3Items10;
    ImageView Tier3Items11;
    ImageView Tier3Items12;

    ImageView Tier4Items1;
    ImageView Tier4Items2;
    ImageView Tier4Items3;
    ImageView Tier4Items4;
    ImageView Tier4Items5;
    ImageView Tier4Items6;
    ImageView Tier4Items7;
    ImageView Tier4Items8;
    ImageView Tier4Items9;
    ImageView Tier4Items10;
    ImageView Tier4Items11;
    ImageView Tier4Items12;

    ImageView Tier5Items1;
    ImageView Tier5Items2;
    ImageView Tier5Items3;
    ImageView Tier5Items4;
    ImageView Tier5Items5;
    ImageView Tier5Items6;
    ImageView Tier5Items7;
    ImageView Tier5Items8;
    ImageView Tier5Items9;
    ImageView Tier5Items10;
    ImageView Tier5Items11;
    ImageView Tier5Items12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neutral_items_main_activity);

        //Declares the intent to switch to the itemScreenFragment when an item has been clicked on
        intent = new Intent(this, ItemScreenFragment.class);

        Tier1Items1 = findViewById(R.id.Tier1Items1);
        Tier1Items2 = findViewById(R.id.Tier1Items2);
        Tier1Items3 = findViewById(R.id.Tier1Items3);
        Tier1Items4 = findViewById(R.id.Tier1Items4);
        Tier1Items5 = findViewById(R.id.Tier1Items5);
        Tier1Items6 = findViewById(R.id.Tier1Items6);
        Tier1Items7 = findViewById(R.id.Tier1Items7);
        Tier1Items8 = findViewById(R.id.Tier1Items8);
        Tier1Items9 = findViewById(R.id.Tier1Items9);
        Tier1Items10 = findViewById(R.id.Tier1Items10);
        Tier1Items11 = findViewById(R.id.Tier1Items11);
        Tier1Items12 = findViewById(R.id.Tier1Items12);

        Tier2Items1 = findViewById(R.id.Tier2Items1);
        Tier2Items2 = findViewById(R.id.Tier2Items2);
        Tier2Items3 = findViewById(R.id.Tier2Items3);
        Tier2Items4 = findViewById(R.id.Tier2Items4);
        Tier2Items5 = findViewById(R.id.Tier2Items5);
        Tier2Items6 = findViewById(R.id.Tier2Items6);
        Tier2Items7 = findViewById(R.id.Tier2Items7);
        Tier2Items8 = findViewById(R.id.Tier2Items8);
        Tier2Items9 = findViewById(R.id.Tier2Items9);
        Tier2Items10 = findViewById(R.id.Tier2Items10);
        Tier2Items11 = findViewById(R.id.Tier2Items11);
        Tier2Items12 = findViewById(R.id.Tier2Items12);

        Tier3Items1 = findViewById(R.id.Tier3Items1);
        Tier3Items2 = findViewById(R.id.Tier3Items2);
        Tier3Items3 = findViewById(R.id.Tier3Items3);
        Tier3Items4 = findViewById(R.id.Tier3Items4);
        Tier3Items5 = findViewById(R.id.Tier3Items5);
        Tier3Items6 = findViewById(R.id.Tier3Items6);
        Tier3Items7 = findViewById(R.id.Tier3Items7);
        Tier3Items8 = findViewById(R.id.Tier3Items8);
        Tier3Items9 = findViewById(R.id.Tier3Items9);
        Tier3Items10 = findViewById(R.id.Tier3Items10);
        Tier3Items11 = findViewById(R.id.Tier3Items11);
        Tier3Items12 = findViewById(R.id.Tier3Items12);

        Tier4Items1 = findViewById(R.id.Tier4Items1);
        Tier4Items2 = findViewById(R.id.Tier4Items2);
        Tier4Items3 = findViewById(R.id.Tier4Items3);
        Tier4Items4 = findViewById(R.id.Tier4Items4);
        Tier4Items5 = findViewById(R.id.Tier4Items5);
        Tier4Items6 = findViewById(R.id.Tier4Items6);
        Tier4Items7 = findViewById(R.id.Tier4Items7);
        Tier4Items8 = findViewById(R.id.Tier4Items8);
        Tier4Items9 = findViewById(R.id.Tier4Items9);
        Tier4Items10 = findViewById(R.id.Tier4Items10);
        Tier4Items11 = findViewById(R.id.Tier4Items11);
        Tier4Items12 = findViewById(R.id.Tier4Items12);

        Tier5Items1 = findViewById(R.id.Tier5Items1);
        Tier5Items2 = findViewById(R.id.Tier5Items2);
        Tier5Items3 = findViewById(R.id.Tier5Items3);
        Tier5Items4 = findViewById(R.id.Tier5Items4);
        Tier5Items5 = findViewById(R.id.Tier5Items5);
        Tier5Items6 = findViewById(R.id.Tier5Items6);
        Tier5Items7 = findViewById(R.id.Tier5Items7);
        Tier5Items8 = findViewById(R.id.Tier5Items8);
        Tier5Items9 = findViewById(R.id.Tier5Items9);
        Tier5Items10 = findViewById(R.id.Tier5Items10);
        Tier5Items11 = findViewById(R.id.Tier5Items11);
        Tier5Items12 = findViewById(R.id.Tier5Items12);

        //Hides the Imageviews which are not needed
        Tier1Items11.setVisibility(View.INVISIBLE);
        Tier1Items12.setVisibility(View.INVISIBLE);
        Tier3Items12.setVisibility(View.INVISIBLE);
        Tier4Items12.setVisibility(View.INVISIBLE);

        //Sets the onClickListeners
        setOnClickListeners();

    }

    private void setOnClickListeners(){

        Tier1Items1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "arcane_ring");
                startActivity(intent);
            }
        });

        Tier1Items2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "broom_handle");
                startActivity(intent);
            }
        });

        Tier1Items3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "pig_pole");
                startActivity(intent);
            }
        });

        Tier1Items4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "fairys_trinket");
                startActivity(intent);
            }
        });

        Tier1Items5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "tumblers_toy");
                startActivity(intent);
            }
        });

        Tier1Items6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "keen_optic");
                startActivity(intent);
            }
        });

        Tier1Items7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "chipped_vest");
                startActivity(intent);
            }
        });

        Tier1Items8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "ocean_heart");
                startActivity(intent);
            }
        });

        Tier1Items9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "possessed_mask");
                startActivity(intent);
            }
        });

        Tier1Items10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "trusty_shovel");
                startActivity(intent);
            }
        });


        Tier2Items1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "quicksilver_amulet");
                startActivity(intent);
            }
        });

        Tier2Items2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "dragon_scale");
                startActivity(intent);
            }
        });

        Tier2Items3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "essence_ring");
                startActivity(intent);
            }
        });

        Tier2Items4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "grove_bow");
                startActivity(intent);
            }
        });

        Tier2Items5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "brigands_blade");
                startActivity(intent);
            }
        });

        Tier2Items6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "nether_shawl");
                startActivity(intent);
            }
        });

        Tier2Items7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "philosophers_stone");
                startActivity(intent);
            }
        });

        Tier2Items8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "pupils_gift");
                startActivity(intent);
            }
        });

        Tier2Items9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "ring_of_aquila");
                startActivity(intent);
            }
        });

        Tier2Items10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "vambrace");
                startActivity(intent);
            }
        });

        Tier2Items11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "bullwhip");
                startActivity(intent);
            }
        });

        Tier2Items12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "fae_grenade");
                startActivity(intent);
            }
        });

        Tier3Items1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "cloak_of_flames");
                startActivity(intent);
            }
        });

        Tier3Items2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "enchanted_quiver");
                startActivity(intent);
            }
        });

        Tier3Items3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "ceremonial_robe");
                startActivity(intent);
            }
        });

        Tier3Items4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "mind_breaker");
                startActivity(intent);
            }
        });

        Tier3Items5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "blast_rig");
                startActivity(intent);
            }
        });

        Tier3Items6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "paladin_sword");
                startActivity(intent);
            }
        });

        Tier3Items7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "quickening_charm");
                startActivity(intent);
            }
        });

        Tier3Items8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "elvin_tunic");
                startActivity(intent);
            }
        });

        Tier3Items9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "spider_legs");
                startActivity(intent);
            }
        });

        Tier3Items10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "titan_sliver");
                startActivity(intent);
            }
        });

        Tier3Items11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "psychic_headband");
                startActivity(intent);
            }
        });


        Tier4Items1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "flicker");
                startActivity(intent);
            }
        });

        Tier4Items2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "telescope");
                startActivity(intent);
            }
        });

        Tier4Items3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "ascetics_cap");
                startActivity(intent);
            }
        });

        Tier4Items4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "penta_edged_sword");
                startActivity(intent);
            }
        });

        Tier4Items5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "witchbane");
                startActivity(intent);
            }
        });

        Tier4Items6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "ninja_gear");
                startActivity(intent);
            }
        });

        Tier4Items7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "trickster_cloak");
                startActivity(intent);
            }
        });

        Tier4Items8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "spell_prism");
                startActivity(intent);
            }
        });

        Tier4Items9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "the_leveller");
                startActivity(intent);
            }
        });

        Tier4Items10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "timeless_relic");
                startActivity(intent);
            }
        });

        Tier4Items11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "stormcrafter");
                startActivity(intent);
            }
        });

        Tier5Items1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "apex");
                startActivity(intent);
            }
        });

        Tier5Items2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "arcanists_armour");
                startActivity(intent);
            }
        });

        Tier5Items3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "book_of_the_dead");
                startActivity(intent);
            }
        });

        Tier5Items4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "ex_machina");
                startActivity(intent);
            }
        });

        Tier5Items5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "fallen_sky");
                startActivity(intent);
            }
        });

        Tier5Items6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "force_boots");
                startActivity(intent);
            }
        });

        Tier5Items7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "mirror_shield");
                startActivity(intent);
            }
        });

        Tier5Items8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "pirate_hat");
                startActivity(intent);
            }
        });

        Tier5Items9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "seer_stone");
                startActivity(intent);
            }
        });

        Tier5Items10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "stygian_desolator");
                startActivity(intent);
            }
        });

        Tier5Items11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "giants_ring");
                startActivity(intent);
            }
        });

        Tier5Items12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                intent.putExtra("itemSelected", "book_of_shadows");
                startActivity(intent);
            }
        });
    }
}