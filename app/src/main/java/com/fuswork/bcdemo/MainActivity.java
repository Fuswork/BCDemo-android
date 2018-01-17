package com.fuswork.bcdemo;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.fuswork.bcdemo.adapter.BottomNavigationViewHelper;
import com.fuswork.bcdemo.adapter.ViewPagerAdapter;
import com.fuswork.bcdemo.view.Fragment.*;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    BottomNavigationView bottomNavigationView;
    private ViewPager viewPager;

    //fragments
    Page1Fragment page1Fragment;
    Page2Fragment page2Fragment;
    Page3Fragment page3Fragment;
    Page4Fragment page4Fragment;
    private int mCurrentItem = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView(){
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        viewPager.setCurrentItem(0);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                bottomNavigationView.getMenu().getItem(position).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        setupViewPager(viewPager);

    }

    private void initData(){
        bottomNavigationView.setOnNavigationItemReselectedListener(
                new BottomNavigationView.OnNavigationItemReselectedListener() {
                    @Override
                    public void onNavigationItemReselected(@NonNull MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.tab1:
                                if(mCurrentItem != 0){
                                    viewPager.setCurrentItem(0);
                                    mCurrentItem = 0;
                                }
                                break;
                            case R.id.tab2:
                                if(mCurrentItem != 1){
                                    viewPager.setCurrentItem(1);
                                    mCurrentItem = 1;
                                }
                                break;
                            case R.id.tab3:
                                if(mCurrentItem != 2){
                                    viewPager.setCurrentItem(2);
                                    mCurrentItem = 2;
                                }
                                break;
                            case R.id.tab4:
                                if(mCurrentItem != 3){
                                    viewPager.setCurrentItem(3);
                                    mCurrentItem = 3;
                                }
                                break;
                        }
                    }
                }
        );
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        page1Fragment=new Page1Fragment();
        page2Fragment=new Page2Fragment();
        page3Fragment=new Page3Fragment();
        page4Fragment=new Page4Fragment();
        adapter.addFragment(page1Fragment);
        adapter.addFragment(page2Fragment);
        adapter.addFragment(page3Fragment);
        adapter.addFragment(page4Fragment);
        viewPager.setAdapter(adapter);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
