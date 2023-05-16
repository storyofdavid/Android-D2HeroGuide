package com.gamestudi.d2heroguide.ItemScreens;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.gamestudi.d2heroguide.R;

public class BasicItemsFragment extends Fragment {

    private static View mView;

    public static final BasicItemsFragment newInstance() {
        BasicItemsFragment f = new BasicItemsFragment();

        Bundle b = new Bundle();

        f.setArguments(b);

        return f;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mView = inflater.inflate(R.layout.content_main,
                container, false);

        //Initialises the GridViews
        GridView gridView = (GridView) mView.findViewById(R.id.gridView);

        //Sets the adapter for the gridview. Believe it is used to show the correct images, count, etc
        gridView.setAdapter(new BasicItemsFragment.ImageAdapter(getActivity()));


        //Is used in the switch statement below
        //we simply declare an intent to start up the new activity
        //then in the switch statement we send across the item selected as a variable
        //and start/run the intent which is initialised here
        final Intent intent = new Intent(getActivity(), ItemScreenFragment.class);


        //Sees which strength hero was selected and passes that variable across
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {

                    case 0:
                        intent.putExtra("itemSelected", "tp_scroll");
                        startActivity(intent);
                        break;

                    case 1:
                        intent.putExtra("itemSelected", "clarity");
                        startActivity(intent);
                        break;

                    case 2:
                        intent.putExtra("itemSelected", "faerie_fire");
                        startActivity(intent);
                        break;

                    case 3:
                        intent.putExtra("itemSelected", "smoke_of_deceit");
                        startActivity(intent);
                        break;

                    case 4:
                        intent.putExtra("itemSelected", "observer_ward");
                        startActivity(intent);
                        break;

                    case 5:
                        intent.putExtra("itemSelected", "sentry_ward");
                        startActivity(intent);
                        break;

                    case 6:
                        intent.putExtra("itemSelected", "enchanted_mango");
                        startActivity(intent);
                        break;

                    case 7:
                        intent.putExtra("itemSelected", "healing_salve");
                        startActivity(intent);
                        break;

                    case 8:
                        intent.putExtra("itemSelected", "tango");
                        startActivity(intent);
                        break;

                    case 9:
                        intent.putExtra("itemSelected", "tome_of_knowledge");
                        startActivity(intent);
                        break;

                    case 10:
                        intent.putExtra("itemSelected", "dust_of_appearance");
                        startActivity(intent);
                        break;

                    case 11:
                        intent.putExtra("itemSelected", "bottle");
                        startActivity(intent);
                        break;

                    case 12:
                        intent.putExtra("itemSelected", "aghanims_shard");
                        startActivity(intent);
                        break;

                    case 13:
                        intent.putExtra("itemSelected", "iron_branch");
                        startActivity(intent);
                        break;

                    case 14:
                        intent.putExtra("itemSelected", "gauntlets_of_strength");
                        startActivity(intent);
                        break;

                    case 15:
                        intent.putExtra("itemSelected", "slippers_of_agility");
                        startActivity(intent);
                        break;

                    case 16:
                        intent.putExtra("itemSelected", "mantle_of_intelligence");
                        startActivity(intent);
                        break;

                    case 17:
                        intent.putExtra("itemSelected", "circlet");
                        startActivity(intent);
                        break;

                    case 18:
                        intent.putExtra("itemSelected", "belt_of_strength");
                        startActivity(intent);
                        break;

                    case 19:
                        intent.putExtra("itemSelected", "band_of_elvenskin");
                        startActivity(intent);
                        break;

                    case 20:
                        intent.putExtra("itemSelected", "robe_of_the_magi");
                        startActivity(intent);
                        break;

                    case 21:
                        intent.putExtra("itemSelected", "crown");
                        startActivity(intent);
                        break;

                    case 22:
                        intent.putExtra("itemSelected", "ogre_axe");
                        startActivity(intent);
                        break;

                    case 23:
                        intent.putExtra("itemSelected", "blade_of_alacrity");
                        startActivity(intent);
                        break;


                    case 24:
                        intent.putExtra("itemSelected", "staff_of_wizardry");
                        startActivity(intent);
                        break;

                    case 25:
                        intent.putExtra("itemSelected", "quelling_blade");
                        startActivity(intent);
                        break;

                    case 26:
                        intent.putExtra("itemSelected", "ring_of_protection");
                        startActivity(intent);
                        break;

                    case 27:
                        intent.putExtra("itemSelected", "infused_raindrops");
                        startActivity(intent);
                        break;

                    case 28:
                        intent.putExtra("itemSelected", "orb_of_venom");
                        startActivity(intent);
                        break;

                    case 29:
                        intent.putExtra("itemSelected", "blight_stone");
                        startActivity(intent);
                        break;

                    case 30:
                        intent.putExtra("itemSelected", "blades_of_attack");
                        startActivity(intent);
                        break;

                    case 31:
                        intent.putExtra("itemSelected", "gloves_of_haste");
                        startActivity(intent);
                        break;

                    case 32:
                        intent.putExtra("itemSelected", "chainmail");
                        startActivity(intent);
                        break;

                    case 33:
                        intent.putExtra("itemSelected", "quarterstaff");
                        startActivity(intent);
                        break;

                    case 34:
                        intent.putExtra("itemSelected", "helm_of_iron_will");
                        startActivity(intent);
                        break;

                    case 35:
                        intent.putExtra("itemSelected", "broadsword");
                        startActivity(intent);
                        break;

                    case 36:
                        intent.putExtra("itemSelected", "blitz_knuckles");
                        startActivity(intent);
                        break;

                    case 37:
                        intent.putExtra("itemSelected", "javelin");
                        startActivity(intent);
                        break;

                    case 38:
                        intent.putExtra("itemSelected", "claymore");
                        startActivity(intent);
                        break;

                    case 39:
                        intent.putExtra("itemSelected", "mithril_hammer");
                        startActivity(intent);
                        break;

                    case 40:
                        intent.putExtra("itemSelected", "ring_of_regen");
                        startActivity(intent);
                        break;

                    case 41:
                        intent.putExtra("itemSelected", "sages_mask");
                        startActivity(intent);
                        break;

                    case 42:
                        intent.putExtra("itemSelected", "magic_stick");
                        startActivity(intent);
                        break;

                    case 43:
                        intent.putExtra("itemSelected", "fluffy_hat");
                        startActivity(intent);
                        break;

                    case 44:
                        intent.putExtra("itemSelected", "wind_lace");
                        startActivity(intent);
                        break;

                    case 45:
                        intent.putExtra("itemSelected", "cloak");
                        startActivity(intent);
                        break;

                    case 46:
                        intent.putExtra("itemSelected", "boots_of_speed");
                        startActivity(intent);
                        break;

                    case 47:
                        intent.putExtra("itemSelected", "gem_of_true_sight");
                        startActivity(intent);
                        break;

                    case 48:
                        intent.putExtra("itemSelected", "morbid_mask");
                        startActivity(intent);
                        break;

                    case 49:
                        intent.putExtra("itemSelected", "voodoo_mask");
                        startActivity(intent);
                        break;

                    case 50:
                        intent.putExtra("itemSelected", "shadow_amulet");
                        startActivity(intent);
                        break;

                    case 51:
                        intent.putExtra("itemSelected", "ghost_scepter");
                        startActivity(intent);
                        break;

                    case 52:
                        intent.putExtra("itemSelected", "blink_dagger");
                        startActivity(intent);
                        break;
                }
            }
        });


        return mView;
    }


    public class ImageAdapter extends BaseAdapter {
        private Context mContext;

        public ImageAdapter(Context c) {
            mContext = c;
        }

        public int getCount() {
            return mThumbIds.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        //Create a new ImageView for each item referenced by the Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(mContext);
            imageView.setImageResource(mThumbIds[position]);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);


            return imageView;
        }


        private Integer[] mThumbIds = {

                R.drawable.item_town_portal_scroll,
                R.drawable.item_clarity,
                R.drawable.item_faerie_fire,
                R.drawable.item_smoke_of_deceit,
                R.drawable.item_observer_ward,
                R.drawable.item_sentry_ward,
                R.drawable.item_enchanted_mango,
                R.drawable.item_healing_salve,
                R.drawable.item_tango,
                R.drawable.item_tome_of_knowledge,
                R.drawable.item_dust_of_appearance,
                R.drawable.item_bottle,
                R.drawable.item_aghanims_shard,
                R.drawable.item_ironwood_branch,
                R.drawable.item_gauntlets_of_strength,
                R.drawable.item_slippers_of_agility,
                R.drawable.item_mantle_of_intelligence,
                R.drawable.item_circlet,
                R.drawable.item_belt_of_strength,
                R.drawable.item_band_of_elvenskin,
                R.drawable.item_robe_of_the_magi,
                R.drawable.item_crown,
                R.drawable.item_ogre_axe,
                R.drawable.item_blade_of_alacrity,
                R.drawable.item_staff_of_wizardry,
                R.drawable.item_quelling_blade,
                R.drawable.item_ring_of_protection,
                R.drawable.item_infused_raindrop,
                R.drawable.item_orb_of_venom,
                R.drawable.item_blight_stone,
                R.drawable.item_blades_of_attack,
                R.drawable.item_gloves_of_haste,
                R.drawable.item_chainmail,
                R.drawable.item_quarterstaff,
                R.drawable.item_helm_of_iron_will,
                R.drawable.item_broadsword,
                R.drawable.item_blitz_knuckles,
                R.drawable.item_javelin,
                R.drawable.item_claymore,
                R.drawable.item_mithril_hammer,
                R.drawable.item_ring_of_regen,
                R.drawable.item_sages_mask,
                R.drawable.item_magic_stick,
                R.drawable.item_fluffy_hat,
                R.drawable.item_wind_lace,
                R.drawable.item_cloak,
                R.drawable.item_boots_of_speed,
                R.drawable.item_gem_of_true_sight,
                R.drawable.item_morbid_mask,
                R.drawable.item_voodoo_mask,
                R.drawable.item_shadow_amulet,
                R.drawable.item_ghost_scepter,
                R.drawable.item_blink_dagger
        };

    }

}

