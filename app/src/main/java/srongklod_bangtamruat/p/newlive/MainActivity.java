package srongklod_bangtamruat.p.newlive;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_activity);
//        createTab();
        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction().add(R.id.ContentMain
                    , new Activity_Home()).commit();
        }

    }
//
//    private void createTab() {

//        ViewPager viewPager = findViewById(R.id.view_pager);
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        PageTabAdapter pageTabAdapter =
//                new PageTabAdapter(fragmentManager);
//
//        viewPager.setAdapter(pageTabAdapter);
//        TabLayout tabLayout = findViewById(R.id.tabLayout);
//        tabLayout.setTabsFromPagerAdapter(pageTabAdapter);
//        tabLayout.setupWithViewPager(viewPager);

//    }//Method CreateTab

}//Main Class
