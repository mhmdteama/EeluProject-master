package com.mhmd.eeluproject.Activites;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.WindowManager;
import android.widget.TextView;

import com.mhmd.eeluproject.frgments.Goals;
import com.mhmd.eeluproject.frgments.Home;
import com.mhmd.eeluproject.others.NavigationDrawerCallbacks;
import com.mhmd.eeluproject.R;
import com.mhmd.eeluproject.frgments.NavigationDrawerFragment;


public class MainActivity extends AppCompatActivity
        implements NavigationDrawerCallbacks {
    Home home = new Home();
    Goals goals = new Goals();
    TextView main_text;



    private NavigationDrawerFragment mNavigationDrawerFragment;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);

        setSupportActionBar(mToolbar);
        main_text = findViewById(R.id.tollbartext);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.fragment_drawer);

        // Set up the drawer.
        mNavigationDrawerFragment.setup(R.id.fragment_drawer, (DrawerLayout) findViewById(R.id.drawer), mToolbar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        Fragment fragment;
        FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
        switch (position) {
            case 0: //that is your first fragment//todo
                fragment = getSupportFragmentManager().findFragmentByTag(home.TAG);
                if (fragment == null) {
                    fragment = new Home();

                }
                trans.replace(R.id.container, fragment, home.TAG);
                break;
            case 2:

                fragment = getSupportFragmentManager().findFragmentByTag(goals.TAG);
                if (fragment == null) {
                    fragment = new Goals();
                }
                trans.replace(R.id.container, fragment, goals.TAG);
                break;

        }

        trans.commit();

    }


    @Override
    public void onBackPressed() {
        if (mNavigationDrawerFragment.isDrawerOpen())
            mNavigationDrawerFragment.closeDrawer();
        else
            super.onBackPressed();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }





}
