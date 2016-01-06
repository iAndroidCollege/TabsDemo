package college.edu.tomer.tabsdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;


public class TabsFragment extends Fragment {

    @Bind(R.id.tabLayout)
    TabLayout tabLayout;
    @Bind(R.id.tabsViewPager)
    ViewPager tabsViewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tabs, container, false);
        ButterKnife.bind(this, view);

        setupTabs();
        return view;
    }

    private void setupTabs() {
        TabsPagerAdapter adapter = new TabsPagerAdapter(getChildFragmentManager());
        tabsViewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(tabsViewPager);
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
