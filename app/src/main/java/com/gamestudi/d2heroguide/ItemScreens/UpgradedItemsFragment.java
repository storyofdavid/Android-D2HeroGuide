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

public class UpgradedItemsFragment extends Fragment {

    private static View mView;

    public static final UpgradedItemsFragment newInstance() {
        UpgradedItemsFragment f = new UpgradedItemsFragment();

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
        gridView.setAdapter(new UpgradedItemsFragment.ImageAdapter(getActivity()));


        //Is used in the switch statement below
        //we simply declare an intent to start up the new activity
        //then in the switch statement we send across the hero selected as a variable
        //and start/run the intent which is initialised here
        final Intent intent = new Intent(getActivity(), ItemScreenFragment.class);


        //Sees which strength hero was selected and passes that variable across
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {

                    case 0:
                        intent.putExtra("itemSelected", "magic_wand");
                        startActivity(intent);
                        break;

                    case 1:
                        intent.putExtra("itemSelected", "null_talisman");
                        startActivity(intent);
                        break;

                    case 2:
                        intent.putExtra("itemSelected", "wraith_band");
                        startActivity(intent);
                        break;

                    case 3:
                        intent.putExtra("itemSelected", "bracer");
                        startActivity(intent);
                        break;

                    case 4:
                        intent.putExtra("itemSelected", "soul_ring");
                        startActivity(intent);
                        break;

                    case 5:
                        intent.putExtra("itemSelected", "orb_of_corrosion");
                        startActivity(intent);
                        break;

                    case 6:
                        intent.putExtra("itemSelected", "falcon_blade");
                        startActivity(intent);
                        break;

                    case 7:
                        intent.putExtra("itemSelected", "power_treads");
                        startActivity(intent);
                        break;

                    case 8:
                        intent.putExtra("itemSelected", "phase_boots");
                        startActivity(intent);
                        break;

                    case 9:
                        intent.putExtra("itemSelected", "oblivion_staff");
                        startActivity(intent);
                        break;

                    case 10:
                        intent.putExtra("itemSelected", "perserverance");
                        startActivity(intent);
                        break;

                    case 11:
                        intent.putExtra("itemSelected", "mask_of_madness");
                        startActivity(intent);
                        break;

                    case 12:
                        intent.putExtra("itemSelected", "hand_of_midas");
                        startActivity(intent);
                        break;

                    case 13:
                        intent.putExtra("itemSelected", "helm_of_the_dominator");
                        startActivity(intent);
                        break;

                    case 14:
                        intent.putExtra("itemSelected", "helm_of_the_dominator_2");
                        startActivity(intent);
                        break;

                    case 15:
                        intent.putExtra("itemSelected", "boots_of_travel");
                        startActivity(intent);
                        break;

                    case 16:
                        intent.putExtra("itemSelected", "boots_of_travel_2");
                        startActivity(intent);
                        break;

                    case 17:
                        intent.putExtra("itemSelected", "moon_shard");
                        startActivity(intent);
                        break;

                    case 18:
                        intent.putExtra("itemSelected", "buckler");
                        startActivity(intent);
                        break;

                    case 19:
                        intent.putExtra("itemSelected", "ring_of_basilius");
                        startActivity(intent);
                        break;

                    case 20:
                        intent.putExtra("itemSelected", "headdress");
                        startActivity(intent);
                        break;

                    case 21:
                        intent.putExtra("itemSelected", "urn_of_shadows");
                        startActivity(intent);
                        break;

                    case 22:
                        intent.putExtra("itemSelected", "tranquil_boots");
                        startActivity(intent);
                        break;

                    case 23:
                        intent.putExtra("itemSelected", "medallion_of_courage");
                        startActivity(intent);
                        break;

                    case 24:
                        intent.putExtra("itemSelected", "arcane_boots");
                        startActivity(intent);
                        break;

                    case 25:
                        intent.putExtra("itemSelected", "drum_of_endurance");
                        startActivity(intent);
                        break;

                    case 26:
                        intent.putExtra("itemSelected", "mekansm");
                        startActivity(intent);
                        break;

                    case 27:
                        intent.putExtra("itemSelected", "holy_locket");
                        startActivity(intent);
                        break;

                    case 28:
                        intent.putExtra("itemSelected", "vladmirs_offering");
                        startActivity(intent);
                        break;

                    case 29:
                        intent.putExtra("itemSelected", "spirit_vessel");
                        startActivity(intent);
                        break;

                    case 30:
                        intent.putExtra("itemSelected", "pipe_of_insight");
                        startActivity(intent);
                        break;

                    case 31:
                        intent.putExtra("itemSelected", "guardian_greaves");
                        startActivity(intent);
                        break;

                    case 32:
                        intent.putExtra("itemSelected", "veil_of_discord");
                        startActivity(intent);
                        break;

                    case 33:
                        intent.putExtra("itemSelected", "glimmer_cape");
                        startActivity(intent);
                        break;

                    case 34:
                        intent.putExtra("itemSelected", "force_staff");
                        startActivity(intent);
                        break;

                    case 35:
                        intent.putExtra("itemSelected", "aether_lens");
                        startActivity(intent);
                        break;

                    case 36:
                        intent.putExtra("itemSelected", "witch_blade");
                        startActivity(intent);
                        break;

                    case 37:
                        intent.putExtra("itemSelected", "euls_scepter_of_divinity");
                        startActivity(intent);
                        break;

                    case 38:
                        intent.putExtra("itemSelected", "rod_of_atos");
                        startActivity(intent);
                        break;

                    case 39:
                        intent.putExtra("itemSelected", "dagon");
                        startActivity(intent);
                        break;

                    case 40:
                        intent.putExtra("itemSelected", "orchid_malevolence");
                        startActivity(intent);
                        break;

                    case 41:
                        intent.putExtra("itemSelected", "solar_crest");
                        startActivity(intent);
                        break;

                    case 42:
                        intent.putExtra("itemSelected", "aghanims_scepter");
                        startActivity(intent);
                        break;

                    case 43:
                        intent.putExtra("itemSelected", "refresher_orb");
                        startActivity(intent);
                        break;

                    case 44:
                        intent.putExtra("itemSelected", "octarine_core");
                        startActivity(intent);
                        break;

                    case 45:
                        intent.putExtra("itemSelected", "scythe_of_vyse");
                        startActivity(intent);
                        break;

                    case 46:
                        intent.putExtra("itemSelected", "gleipnir");
                        startActivity(intent);
                        break;

                    case 47:
                        intent.putExtra("itemSelected", "wind_waker");
                        startActivity(intent);
                        break;

                    case 48:
                        intent.putExtra("itemSelected", "hood_of_defiance");
                        startActivity(intent);
                        break;

                    case 49:
                        intent.putExtra("itemSelected", "vanguard");
                        startActivity(intent);
                        break;

                    case 50:
                        intent.putExtra("itemSelected", "blade_mail");
                        startActivity(intent);
                        break;

                    case 51:
                        intent.putExtra("itemSelected", "aeon_disk");
                        startActivity(intent);
                        break;

                    case 52:
                        intent.putExtra("itemSelected", "soul_booster");
                        startActivity(intent);
                        break;

                    case 53:
                        intent.putExtra("itemSelected", "eternal_shroud");
                        startActivity(intent);
                        break;

                    case 54:
                        intent.putExtra("itemSelected", "crimson_guard");
                        startActivity(intent);
                        break;

                    case 55:
                        intent.putExtra("itemSelected", "lotus_orb");
                        startActivity(intent);
                        break;

                    case 56:
                        intent.putExtra("itemSelected", "black_king_bar");
                        startActivity(intent);
                        break;

                    case 57:
                        intent.putExtra("itemSelected", "hurricane_pike");
                        startActivity(intent);
                        break;

                    case 58:
                        intent.putExtra("itemSelected", "manta_style");
                        startActivity(intent);
                        break;

                    case 59:
                        intent.putExtra("itemSelected", "linkens_sphere");
                        startActivity(intent);
                        break;

                    case 60:
                        intent.putExtra("itemSelected", "shivas_guard");
                        startActivity(intent);
                        break;

                    case 61:
                        intent.putExtra("itemSelected", "heart_of_tarrasque");
                        startActivity(intent);
                        break;

                    case 62:
                        intent.putExtra("itemSelected", "assault_cuirass");
                        startActivity(intent);
                        break;

                    case 63:
                        intent.putExtra("itemSelected", "bloodstone");
                        startActivity(intent);
                        break;

                    case 64:
                        intent.putExtra("itemSelected", "crystalys");
                        startActivity(intent);
                        break;

                    case 65:
                        intent.putExtra("itemSelected", "meteor_hammer");
                        startActivity(intent);
                        break;

                    case 66:
                        intent.putExtra("itemSelected", "armlet_of_mordiggian");
                        startActivity(intent);
                        break;

                    case 67:
                        intent.putExtra("itemSelected", "skull_basher");
                        startActivity(intent);
                        break;

                    case 68:
                        intent.putExtra("itemSelected", "shadow_blade");
                        startActivity(intent);
                        break;

                    case 69:
                        intent.putExtra("itemSelected", "desolator");
                        startActivity(intent);
                        break;

                    case 70:
                        intent.putExtra("itemSelected", "battle_fury");
                        startActivity(intent);
                        break;

                    case 71:
                        intent.putExtra("itemSelected", "ethereal_blade");
                        startActivity(intent);
                        break;

                    case 72:
                        intent.putExtra("itemSelected", "nullifier");
                        startActivity(intent);
                        break;

                    case 73:
                        intent.putExtra("itemSelected", "monkey_king_bar");
                        startActivity(intent);
                        break;

                    case 74:
                        intent.putExtra("itemSelected", "butterfly");
                        startActivity(intent);
                        break;

                    case 75:
                        intent.putExtra("itemSelected", "radiance");
                        startActivity(intent);
                        break;

                    case 76:
                        intent.putExtra("itemSelected", "daedalus");
                        startActivity(intent);
                        break;

                    case 77:
                        intent.putExtra("itemSelected", "silver_edge");
                        startActivity(intent);
                        break;

                    case 78:
                        intent.putExtra("itemSelected", "divine_rapier");
                        startActivity(intent);
                        break;

                    case 79:
                        intent.putExtra("itemSelected", "bloodthorn");
                        startActivity(intent);
                        break;

                    case 80:
                        intent.putExtra("itemSelected", "abyssal_blade");
                        startActivity(intent);
                        break;

                    case 81:
                        intent.putExtra("itemSelected", "dragon_lance");
                        startActivity(intent);
                        break;

                    case 82:
                        intent.putExtra("itemSelected", "sange");
                        startActivity(intent);
                        break;

                    case 83:
                        intent.putExtra("itemSelected", "yasha");
                        startActivity(intent);
                        break;

                    case 84:
                        intent.putExtra("itemSelected", "kaya");
                        startActivity(intent);
                        break;

                    case 85:
                        intent.putExtra("itemSelected", "echo_sabre");
                        startActivity(intent);
                        break;

                    case 86:
                        intent.putExtra("itemSelected", "maelstrom");
                        startActivity(intent);
                        break;

                    case 87:
                        intent.putExtra("itemSelected", "diffusal_blade");
                        startActivity(intent);
                        break;

                    case 88:
                        intent.putExtra("itemSelected", "mage_slayer");
                        startActivity(intent);
                        break;

                    case 89:
                        intent.putExtra("itemSelected", "heavens_halberd");
                        startActivity(intent);
                        break;
                    case 90:
                        intent.putExtra("itemSelected", "kaya_and_sange");
                        startActivity(intent);
                        break;
                    case 91:
                        intent.putExtra("itemSelected", "sange_and_yasha");
                        startActivity(intent);
                        break;
                    case 92:
                        intent.putExtra("itemSelected", "yasha_and_kaya");
                        startActivity(intent);
                        break;
                    case 93:
                        intent.putExtra("itemSelected", "satanic");
                        startActivity(intent);
                        break;
                    case 94:
                        intent.putExtra("itemSelected", "eye_of_skadai");
                        startActivity(intent);
                        break;
                    case 95:
                        intent.putExtra("itemSelected", "mjollnir");
                        startActivity(intent);
                        break;
                    case 96:
                        intent.putExtra("itemSelected", "overwhelming_blink");
                        startActivity(intent);
                        break;
                    case 97:
                        intent.putExtra("itemSelected", "swift_blink");
                        startActivity(intent);
                        break;
                    case 98:
                        intent.putExtra("itemSelected", "arcane_blink");
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

                R.drawable.item_magic_wand,
                R.drawable.item_null_talisman,
                R.drawable.item_wraith_band,
                R.drawable.item_bracer,
                R.drawable.item_soul_ring,
                R.drawable.item_orb_of_corrosion,
                R.drawable.item_falcon_blade,
                R.drawable.item_power_treads,
                R.drawable.item_phase_boots,
                R.drawable.item_oblivion_staff,
                R.drawable.item_perserverance,
                R.drawable.item_mask_of_madness,
                R.drawable.item_hand_of_midas,
                R.drawable.item_helm_of_the_dominator,
                R.drawable.item_helm_of_the_dominator_2,
                R.drawable.item_boots_of_travel,
                R.drawable.item_boots_of_travel_2,
                R.drawable.item_moon_shard,
                R.drawable.item_buckler,
                R.drawable.item_ring_of_basilius,
                R.drawable.item_headdress,
                R.drawable.item_urn_of_shadows,
                R.drawable.item_tranquil_boots,
                R.drawable.item_medallion_of_courage,
                R.drawable.item_arcane_boots,
                R.drawable.item_drum_of_endurance,
                R.drawable.item_mekansm,
                R.drawable.item_holy_locket,
                R.drawable.item_vladmirs_offering,
                R.drawable.item_spirit_vessel,
                R.drawable.item_pipe_of_insight,
                R.drawable.item_guardian_greaves,
                R.drawable.item_veil_of_discord,
                R.drawable.item_glimmer_cape,
                R.drawable.item_force_staff,
                R.drawable.item_aether_lens,
                R.drawable.item_witch_blade,
                R.drawable.item_euls_scepter_of_divinity,
                R.drawable.item_rod_of_atos,
                R.drawable.item_dagon,
                R.drawable.item_orchid_malevolence,
                R.drawable.item_solar_crest,
                R.drawable.item_aghanims_scepter,
                R.drawable.item_refresher_orb,
                R.drawable.item_octarine_core,
                R.drawable.item_scythe_of_vyse,
                R.drawable.item_gleipnir,
                R.drawable.item_wind_waker,
                R.drawable.item_hood_of_defiance,
                R.drawable.item_vanguard,
                R.drawable.item_blade_mail,
                R.drawable.item_aeon_disk,
                R.drawable.item_soul_booster,
                R.drawable.item_eternal_shroud,
                R.drawable.item_crimson_guard,
                R.drawable.item_lotus_orb,
                R.drawable.item_black_king_bar,
                R.drawable.item_hurricane_pike,
                R.drawable.item_manta_style,
                R.drawable.item_linkens_sphere,
                R.drawable.item_shivas_guard,
                R.drawable.item_heart_of_tarrasque,
                R.drawable.item_assault_cuirass,
                R.drawable.item_bloodstone,
                R.drawable.item_crystalys,
                R.drawable.item_meteor_hammer,
                R.drawable.item_armlet_of_mordiggian,
                R.drawable.item_skull_basher,
                R.drawable.item_shadowblade,
                R.drawable.item_desolator,
                R.drawable.item_battle_fury,
                R.drawable.item_ethereal_blade,
                R.drawable.item_nullifier,
                R.drawable.item_monkey_king_bar,
                R.drawable.item_butterfly,
                R.drawable.item_radiance,
                R.drawable.item_daedalus,
                R.drawable.item_silver_edge,
                R.drawable.item_divine_raiper,
                R.drawable.item_bloodthorn,
                R.drawable.item_abyssal_blade,
                R.drawable.item_dragon_lance,
                R.drawable.item_sange,
                R.drawable.item_yasha,
                R.drawable.item_kaya,
                R.drawable.item_echo_sabre,
                R.drawable.item_maelstrom,
                R.drawable.item_diffusal_blade,
                R.drawable.item_mage_slayer,
                R.drawable.item_heavens_halberd,
                R.drawable.item_kaya_and_sange,
                R.drawable.item_sange_and_yasha,
                R.drawable.item_yasha_and_kaya,
                R.drawable.item_satanic,
                R.drawable.item_eye_of_skadai,
                R.drawable.item_mjollnir,
                R.drawable.item_overwhelming_blink,
                R.drawable.item_swift_blink,
                R.drawable.item_arcane_blink
        };

    }

}

