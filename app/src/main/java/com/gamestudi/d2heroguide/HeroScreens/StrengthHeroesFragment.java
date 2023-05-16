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

public class StrengthHeroesFragment extends Fragment {

	private static View mView;
	private com.google.android.gms.ads.InterstitialAd InterstitialAd;

	public static final StrengthHeroesFragment newInstance() {
		StrengthHeroesFragment f = new StrengthHeroesFragment();

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
		gridView.setAdapter(new ImageAdapter (getActivity()));


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
		final Intent intent = new Intent(getActivity(),HeroScreen.class);


		//Sees which strength hero was selected and passes that variable across
		gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

				switch(position){

					case 0:
						intent.putExtra("heroSelected", "Abaddon");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 1:
						intent.putExtra("heroSelected", "Alchemist");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 2:
						intent.putExtra("heroSelected", "Axe");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 3:
						intent.putExtra("heroSelected", "Beastmaster");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 4:
						intent.putExtra("heroSelected", "Brewmaster");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 5:
						intent.putExtra("heroSelected", "Bristleback");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 6:
						intent.putExtra("heroSelected", "Centuar Warrunner");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 7:
						intent.putExtra("heroSelected", "Chaos Knight");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 8:
						intent.putExtra("heroSelected", "Clockwerk");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 9:
						intent.putExtra("heroSelected", "Dawnbreaker");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 10:
						intent.putExtra("heroSelected", "Doom");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 11:
						intent.putExtra("heroSelected", "Dragon Knight");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 12:
						intent.putExtra("heroSelected", "Earth Spirit");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 13:
						intent.putExtra("heroSelected", "Earthshaker");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 14:
						intent.putExtra("heroSelected", "Elder Titan");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 15:
						intent.putExtra("heroSelected", "Huskar");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 16:
						intent.putExtra("heroSelected", "Wisp");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 17:
						intent.putExtra("heroSelected", "Kunkka");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 18:
						intent.putExtra("heroSelected", "Legion Commander");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 19:
						intent.putExtra("heroSelected", "Lifestealer");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 20:
						intent.putExtra("heroSelected", "Lycan");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 21:
						intent.putExtra("heroSelected", "Magnus");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 22:
						intent.putExtra("heroSelected", "Mars");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 23:
						intent.putExtra("heroSelected", "Night Stalker");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 24:
						intent.putExtra("heroSelected", "Omniknight");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 25:
						intent.putExtra("heroSelected", "Phoenix");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 26:
						intent.putExtra("heroSelected", "Pudge");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 27:
						intent.putExtra("heroSelected", "Sand King");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 28:
						intent.putExtra("heroSelected", "Sladar");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 29:
						intent.putExtra("heroSelected", "Snapfire");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 30:
						intent.putExtra("heroSelected", "Spirit Breaker");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 31:
						intent.putExtra("heroSelected", "Sven");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 32:
						intent.putExtra("heroSelected", "Tidehunter");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 33:
						intent.putExtra("heroSelected", "Timbersaw");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 34:
						intent.putExtra("heroSelected", "Tiny");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 35:
						intent.putExtra("heroSelected", "Treant Protector");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 36:
						intent.putExtra("heroSelected", "Tusk");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 37:
						intent.putExtra("heroSelected", "Underlord");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 38:
						intent.putExtra("heroSelected", "Undying");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 39:
						intent.putExtra("heroSelected", "Wraith King");
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

				R.drawable.abaddon_small,
				R.drawable.alchemist_small,
				R.drawable.axe_small,
				R.drawable.beastmaster_small,
				R.drawable.brewmaster_small,
				R.drawable.bristleback_small,
				R.drawable.centaur_small,
				R.drawable.chaos_knight_small,
				R.drawable.clockwerk_small,
				R.drawable.dawnbreaker_small,
				R.drawable.doom_small,
				R.drawable.dragon_knight_small,
				R.drawable.earth_spirit_small,
				R.drawable.earthshaker_small,
				R.drawable.elder_titan_small,
				R.drawable.huskar_small,
				R.drawable.io_small,
				R.drawable.kunkka_small,
				R.drawable.legion_commander_small,
				R.drawable.lifestealer_small,
				R.drawable.lycan_small,
				R.drawable.magnus_small,
				R.drawable.mars_small,
				R.drawable.night_stalker_small,
				R.drawable.omniknight_small,
				R.drawable.phoenix_small,
				R.drawable.pudge_small,
				R.drawable.sand_king_small,
				R.drawable.slardar_small,
				R.drawable.snapfire_small,
				R.drawable.spirit_breaker_small,
				R.drawable.sven_small,
				R.drawable.tidehunter_small,
				R.drawable.timbersaw_small,
				R.drawable.tiny_small,
				R.drawable.treant_small,
				R.drawable.tusk_small,
				R.drawable.underlord_small,
				R.drawable.undying_small,
				R.drawable.wraith_king_small
		};

	}

}