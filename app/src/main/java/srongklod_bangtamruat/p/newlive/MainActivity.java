package srongklod_bangtamruat.p.newlive;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        createTab();
    }

    private void createTab() {

        ViewPager viewPager = findViewById(R.id.view_pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        PageTabAdapter pageTabAdapter =
                new PageTabAdapter(fragmentManager);

        viewPager.setAdapter(pageTabAdapter);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setTabsFromPagerAdapter(pageTabAdapter);
        tabLayout.setupWithViewPager(viewPager);

//        TabLayout tabLayout = findViewById(R.id.tabLayout);
//        tabLayout.addTab(tabLayout.newTab().setText("แท็บ 1"));
//        tabLayout.addTab(tabLayout.newTab().setText("แท็บ 2"));
//        tabLayout.addTab(tabLayout.newTab().setText("แท็บ 3"));

    }//Method CreateTab

}//Main Class
