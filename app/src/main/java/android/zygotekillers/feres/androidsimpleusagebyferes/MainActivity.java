package android.zygotekillers.feres.androidsimpleusagebyferes;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends BaseActivity implements View.OnClickListener {


    private TabLayout tabs;
    private ViewPager viewpager;
    private ViewPagerAdapter adapter;

    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





        //getting the tab layout and the view pager from the view
        tabs = (TabLayout) findViewById(R.id.tab_layout);
        viewpager  = (ViewPager) findViewById(R.id.viewpager);


        tabs.setTabTextColors(getResources().getColor(R.color.colorDivider),
                getResources().getColor(R.color.colorAccent));

        //setting the adapter to the viewpager
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TabFragment(), "Tab 1");
        adapter.addFragment(new TabFragment(), "Tab 2");
        adapter.addFragment(new TabFragment(), "Tab 3");
        viewpager.setAdapter(adapter);

        tabs.setupWithViewPager(viewpager);

        viewpager.setCurrentItem(0);
        fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.fab){
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }

    }
}
