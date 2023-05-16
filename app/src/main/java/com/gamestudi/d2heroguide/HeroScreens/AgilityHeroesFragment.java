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

public class AgilityHeroesFragment extends Fragment {

	private static View mView;
	private com.google.android.gms.ads.InterstitialAd InterstitialAd;

	public static final AgilityHeroesFragment newInstance() {
		AgilityHeroesFragment f = new AgilityHeroesFragment();

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
		gridView.setAdapter(new AgilityHeroesFragment.ImageAdapter(getActivity()));



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
						intent.putExtra("heroSelected", "Antimage");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 1:
						intent.putExtra("heroSelected", "Arc Warden");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 2:
						intent.putExtra("heroSelected", "Bloodseeker");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 3:
						intent.putExtra("heroSelected", "Bounty Hunter");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 4:
						intent.putExtra("heroSelected", "Broodmother");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 5:
						intent.putExtra("heroSelected", "Clinkz");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 6:
						intent.putExtra("heroSelected", "Drow Ranger");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 7:
						intent.putExtra("heroSelected", "Ember Spirit");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 8:
						intent.putExtra("heroSelected", "Faceless Void");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 9:
						intent.putExtra("heroSelected", "Gyrocopter");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 10:
						intent.putExtra("heroSelected", "Hoodwink");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 11:
						intent.putExtra("heroSelected", "Juggernaut");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 12:
						intent.putExtra("heroSelected", "Lone Druid");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 13:
						intent.putExtra("heroSelected", "Luna");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 14:
						intent.putExtra("heroSelected", "Medusa");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 15:
						intent.putExtra("heroSelected", "Meepo");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 16:
						intent.putExtra("heroSelected", "Mirana");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 17:
						intent.putExtra("heroSelected", "Monkey King");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 18:
						intent.putExtra("heroSelected", "Morphling");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 19:
						intent.putExtra("heroSelected", "Naga Siren");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 20:
						intent.putExtra("heroSelected", "Nyx Assasin");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 21:
						intent.putExtra("heroSelected", "Pangolier");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 22:
						intent.putExtra("heroSelected", "Phantom Assasin");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 23:
						intent.putExtra("heroSelected", "Phantom Lancer");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 24:
						intent.putExtra("heroSelected", "Razor");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 25:
						intent.putExtra("heroSelected", "Riki");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 26:
						intent.putExtra("heroSelected", "Shadow Fiend");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 27:
						intent.putExtra("heroSelected", "Slark");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 28:
						intent.putExtra("heroSelected", "Sniper");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 29:
						intent.putExtra("heroSelected", "Spectre");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 30:
						intent.putExtra("heroSelected", "Templar Assasin");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 31:
						intent.putExtra("heroSelected", "Terrorblade");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 32:
						intent.putExtra("heroSelected", "Troll Warlord");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 33:
						intent.putExtra("heroSelected", "Ursa");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 34:
						intent.putExtra("heroSelected", "Vengeful Spirit");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 35:
						intent.putExtra("heroSelected", "Venomancer");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 36:
						intent.putExtra("heroSelected", "Viper");
						startActivity(intent);
						//If interstitialAd is loaded then show the ad
						if (InterstitialAd.isLoaded()) {
							InterstitialAd.show();
						}
						break;

					case 37:
						intent.putExtra("heroSelected", "Weaver");
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

				R.drawable.antimage_small,
				R.drawable.arc_warden_small,
				R.drawable.bloodseeker_small,
				R.drawable.bounty_hunter_small,
				R.drawable.broodmother_small,
				R.drawable.clinkz_small,
				R.drawable.drow_ranger_small,
				R.drawable.ember_spirit_small,
				R.drawable.faceless_void_small,
				R.drawable.gyrocopter_small,
				R.drawable.hoodwink_small,
				R.drawable.juggernaut_small,
				R.drawable.lone_druid_small,
				R.drawable.luna_small,
				R.drawable.medusa_small,
				R.drawable.meepo_small,
				R.drawable.mirana_small,
				R.drawable.monkey_king_small,
				R.drawable.morphling_small,
				R.drawable.naga_siren_small,
				R.drawable.nyx_assassin_small,
				R.drawable.pangolier_small,
				R.drawable.phantom_assassin_small,
				R.drawable.phantom_lancer_small,
				R.drawable.razor_small,
				R.drawable.riki_small,
				R.drawable.shadow_fiend_small,
				R.drawable.slark_small,
				R.drawable.sniper_small,
				R.drawable.spectre_small,
				R.drawable.templar_assasin_small,
				R.drawable.terrorblade_small,
				R.drawable.troll_warlord_small,
				R.drawable.ursa_small,
				R.drawable.vengeful_spirit_small,
				R.drawable.venomancer_small,
				R.drawable.viper_small,
				R.drawable.weaver_small
		};

	}

}
