package srongklod_bangtamruat.p.newlive;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageTabAdapter extends FragmentStatePagerAdapter {

    public PageTabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                return new Activity_Home();
            case 1:
                return new Activity_timeline();
            case 2:
                return new Activity_Registor();
             default:
                 return new Activity_Home();
        }

    }


    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String[] tabs = {"Home", "TimeLine", "Register",};
        return tabs[position];
    }
}
