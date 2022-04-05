package com.patriotnative.android_social_media.Utils;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList<>();


    public SectionPagerAdapter(@NonNull FragmentManager fm) {
        super(fm); // TODO: Not cool
    }

    public void addFragment(Fragment fragment) {

        mFragmentList.add(fragment);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {

        return mFragmentList.size();
    }


}

