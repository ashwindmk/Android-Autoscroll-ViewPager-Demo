package com.example.ashwin.autoscrollviewpagerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;

public class MainActivity extends AppCompatActivity {

    private AutoScrollViewPager mAutoScrollViewPager;
    private int[] mResources = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5};
    private ImagesPagerAdapter mImagesPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        mAutoScrollViewPager = (AutoScrollViewPager) findViewById(R.id.autoScrollViewPager);
        mImagesPagerAdapter = new ImagesPagerAdapter(this, mResources);
        mAutoScrollViewPager.setAdapter(mImagesPagerAdapter);
        mAutoScrollViewPager.setInterval(2000);
        mAutoScrollViewPager.setScrollDurationFactor(0.5);
        mAutoScrollViewPager.setCycle(true);
        mAutoScrollViewPager.setSlideBorderMode(AutoScrollViewPager.SLIDE_BORDER_MODE_CYCLE);

        mAutoScrollViewPager.startAutoScroll(5000);
    }
}
