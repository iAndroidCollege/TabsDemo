package college.edu.tomer.tabsdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by master on 06/01/16.
 */
public class TabsPagerAdapter extends FragmentStatePagerAdapter {
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new SendMailFragment();
            case 1:
                return new RecievedMailFragment();
            case 2:
                return new HomeFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "SendMail";
            case 1:
                return  "RecievedMail";
            case 2:
                return "Settings";
        }
        return null;
    }
}
