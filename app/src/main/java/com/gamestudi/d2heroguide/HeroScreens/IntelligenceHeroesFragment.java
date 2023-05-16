package com.gamestudi.d2heroguide.HeroScreens;

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
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import static com.gamestudi.d2heroguide.BuildConfig.debug;

public class IntelligenceHeroesFragment extends Fragment {

	private static View mView;
	private com.google.android.gms.ads.InterstitialAd InterstitialAd;

	public static final IntelligenceHeroesFragment newInstance() {
		IntelligenceHeroesFragment f = new IntelligenceHeroesFragment();

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
		gridView.setAdapter(new IntelligenceHeroesFragment.ImageAdapter(getActivity()));


		//If this is a debug build then load test interstitial ads
		if (debug) {
			InterstitialAd = new InterstitialAd(getContext());
			InterstitialAd.setAdUnitId(getResources().getString(R.string.test_interstitial_ad_unit_id));
			InterstitialAd.loadAd(new AdRequest.Builder().build());
		}

		//If this is not a debug build then load real ads
		if (!debug){
			InterstitialAd = new InterstitialAd(getContext());
			InterstitialAd.setAdUnitId(getResources().getString(R.string.d2heroguide_interstitial_ad_unit_id));
			InterstitialAd.loadAd(new AdRequest.Builder().build());
		}

		//Is used in the switch statement below
		//we simply declare an intent to start up the new activity
		//then in the switch statement we send across the hero selected as a variable
		//and start/run the intent which is initialised here
		final Intent intent = new Intent(getActivity(), HeroScreen.class);


		//Sees which strength hero was selected and passes that variable across
		gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

				switch (position) {

					case 0:
						intent.putExtra("heroSelected", "Ancient Apparition");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 1:
						intent.putExtra("heroSelected", "Bane");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 2:
						intent.putExtra("heroSelected", "Batrider");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 3:
						intent.putExtra("heroSelected", "Chen");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 4:
						intent.putExtra("heroSelected", "Crystal Maiden");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 5:
						intent.putExtra("heroSelected", "Dark Seer");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

                    case 6:
                        intent.putExtra("heroSelected", "Dark Willow");
                        startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
                        break;

					case 7:
						intent.putExtra("heroSelected", "Dazzle");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 8:
						intent.putExtra("heroSelected", "Death Prophet");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 9:
						intent.putExtra("heroSelected", "Disruptor");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 10:
						intent.putExtra("heroSelected", "Enchantress");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 11:
						intent.putExtra("heroSelected", "Enigma");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 12:
						intent.putExtra("heroSelected", "Grimstroke");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 13:
						intent.putExtra("heroSelected", "Invoker");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 14:
						intent.putExtra("heroSelected", "Jakiro");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 15:
						intent.putExtra("heroSelected", "Keeper Of The Light");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 16:
						intent.putExtra("heroSelected", "Leshrac");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 17:
						intent.putExtra("heroSelected", "Lich");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 18:
						intent.putExtra("heroSelected", "Lina");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 19:
						intent.putExtra("heroSelected", "Lion");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 20:
						intent.putExtra("heroSelected", "Natures Prophet");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 21:
						intent.putExtra("heroSelected", "Necrophos");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 22:
						intent.putExtra("heroSelected", "Ogre Magi");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 23:
						intent.putExtra("heroSelected", "Oracle");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 24:
						intent.putExtra("heroSelected", "Outworld Devourer");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 25:
						intent.putExtra("heroSelected", "Puck");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 26:
						intent.putExtra("heroSelected", "Pugna");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 27:
						intent.putExtra("heroSelected", "Queen Of Pain");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 28:
						intent.putExtra("heroSelected", "Rubick");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 29:
						intent.putExtra("heroSelected", "Shadow Demon");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 30:
						intent.putExtra("heroSelected", "Shadow Shaman");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 31:
						intent.putExtra("heroSelected", "Silencer");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 32:
						intent.putExtra("heroSelected", "Skywrath Mage");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 33:
						intent.putExtra("heroSelected", "Storm Spirit");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 34:
						intent.putExtra("heroSelected", "Techies");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 35:
						intent.putExtra("heroSelected", "Tinker");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 36:
						intent.putExtra("heroSelected", "Visage");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 37:
						intent.putExtra("heroSelected", "Void Spirit");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 38:
						intent.putExtra("heroSelected", "Warlock");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 39:
						intent.putExtra("heroSelected", "Windranger");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 40:
						intent.putExtra("heroSelected", "Winter Wyvern");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 41:
						intent.putExtra("heroSelected", "Witch Doctor");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 42:
						intent.putExtra("heroSelected", "Zeus");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
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

				R.drawable.ancient_apparition_small,
				R.drawable.bane_small,
				R.drawable.batrider_small,
				R.drawable.chen_small,
				R.drawable.crystal_maiden_small,
				R.drawable.dark_seer_small,
				R.drawable.dark_willow_small,
				R.drawable.dazzle_small,
				R.drawable.death_prophet_small,
				R.drawable.disruptor_small,
				R.drawable.enchantress_small,
				R.drawable.enigma_small,
				R.drawable.grimstroke_small,
				R.drawable.invoker_small,
				R.drawable.jakiro_small,
				R.drawable.keeper_of_the_light_small,
				R.drawable.leshrac_small,
				R.drawable.lich_small,
				R.drawable.lina_small,
				R.drawable.lion_small,
				R.drawable.natures_prophet_small,
				R.drawable.necrophos_small,
				R.drawable.ogre_magi_small,
				R.drawable.oracle_small,
				R.drawable.outworld_devourer_small,
				R.drawable.puck_small,
				R.drawable.pugna_small,
				R.drawable.queen_of_pain_small,
				R.drawable.rubick_small,
				R.drawable.shadow_demon_small,
				R.drawable.shadow_shaman_small,
				R.drawable.silencer_small,
				R.drawable.skywrath_mage_small,
				R.drawable.storm_spirit_small,
				R.drawable.techies_small,
				R.drawable.tinker_small,
				R.drawable.visage_small,
				R.drawable.void_spirit_small,
				R.drawable.warlock_small,
				R.drawable.windrunner_small,
				R.drawable.winter_wyvern_small,
				R.drawable.witch_doctor_small,
				R.drawable.zeus_small

		};

	}

}
