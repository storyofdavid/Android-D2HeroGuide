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

public class SecretItemsFragment extends Fragment {

    private static View mView;

    public static final SecretItemsFragment newInstance() {
        SecretItemsFragment f = new SecretItemsFragment();

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
        gridView.setAdapter(new SecretItemsFragment.ImageAdapter(getActivity()));


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
                        intent.putExtra("itemSelected", "ring_of_health");
                        startActivity(intent);
                        break;

                    case 1:
                        intent.putExtra("itemSelected", "void_stone");
                        startActivity(intent);
                        break;

                    case 2:
                        intent.putExtra("itemSelected", "energy_booster");
                        startActivity(intent);
                        break;

                    case 3:
                        intent.putExtra("itemSelected", "vitality_booster");
                        startActivity(intent);
                        break;

                    case 4:
                        intent.putExtra("itemSelected", "point_booster");
                        startActivity(intent);
                        break;

                    case 5:
                        intent.putExtra("itemSelected", "platemail");
                        startActivity(intent);
                        break;

                    case 6:
                        intent.putExtra("itemSelected", "talisman_of_evasion");
                        startActivity(intent);
                        break;

                    case 7:
                        intent.putExtra("itemSelected", "hyperstone");
                        startActivity(intent);
                        break;

                    case 8:
                        intent.putExtra("itemSelected", "ultimate_orb");
                        startActivity(intent);
                        break;

                    case 9:
                        intent.putExtra("itemSelected", "demon_edge");
                        startActivity(intent);
                        break;

                    case 10:
                        intent.putExtra("itemSelected", "mystic_staff");
                        startActivity(intent);
                        break;

                    case 11:
                        intent.putExtra("itemSelected", "reaver");
                        startActivity(intent);
                        break;

                    case 12:
                        intent.putExtra("itemSelected", "eaglesong");
                        startActivity(intent);
                        break;

                    case 13:
                        intent.putExtra("itemSelected", "sacred_relic");
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

                R.drawable.item_ring_of_health,
                R.drawable.item_void_stone,
                R.drawable.item_energy_booster,
                R.drawable.item_vitality_booster,
                R.drawable.item_point_booster,
                R.drawable.item_platemail,
                R.drawable.item_talisman_of_evasion,
                R.drawable.item_hyperstone,
                R.drawable.item_ultimate_orb,
                R.drawable.item_demon_edge,
                R.drawable.item_mystic_staff,
                R.drawable.item_reaver,
                R.drawable.item_eaglesong,
                R.drawable.item_sacred_relic
        };

    }

}

