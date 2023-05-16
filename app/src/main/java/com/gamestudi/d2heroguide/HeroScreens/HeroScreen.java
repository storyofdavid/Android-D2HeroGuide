package com.gamestudi.d2heroguide.HeroScreens;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import com.gamestudi.d2heroguide.MyPageAdapter;
import com.gamestudi.d2heroguide.R;
import com.gigamole.navigationtabstrip.NavigationTabStrip;

import java.util.ArrayList;
import java.util.List;


public class HeroScreen extends FragmentActivity implements
        ViewPager.OnPageChangeListener {


    MyPageAdapter pageAdapter;
    private ViewPager mViewPager;
    private NavigationTabStrip mCenterNavigationTabStrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_screen);

        mCenterNavigationTabStrip = (NavigationTabStrip) findViewById(R.id.nts_center);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);


        //Fragments and ViewPager Initialization
        List<Fragment> fragments = getFragments();
        pageAdapter = new MyPageAdapter(getSupportFragmentManager(), fragments);
        mViewPager.setAdapter(pageAdapter);
        mViewPager.addOnPageChangeListener(HeroScreen.this);



        //Sets the default tab strip to the first value which is strength.
        //In other words sets the default tabstrip to Strength heroes
        mCenterNavigationTabStrip.setViewPager(mViewPager, 0);
    }


        @Override
        public void onPageScrollStateChanged(int arg0) {
        }

        // Manages the Page changes, synchronizing it with Tabs
        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {
            int pos = this.mViewPager.getCurrentItem();
            //Is used to switch when the user swipes between pages
            mCenterNavigationTabStrip.setViewPager(mViewPager, pos);

        }

        @Override
        public void onPageSelected(int arg0) {
        }

    private List<Fragment> getFragments() {
        List<Fragment> fList = new ArrayList<Fragment>();

        // TODO Put here your Fragments
        HeroScreenFragment f1 = HeroScreenFragment.newInstance();
        HeroItemsFragment f2 = HeroItemsFragment.newInstance();

        fList.add(f1);
        fList.add(f2);


        return fList;
    }

    }

