package com.pageviwerpractic;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView dog, cat, birds;
    ViewPager viewPager;
    PageViewAdapter pageViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dog = findViewById(R.id.dog_tab_id);
        cat = findViewById(R.id.cat_tab_id);
        birds = findViewById(R.id.bird_tab_id);

        viewPager = findViewById(R.id.pagview_fradment_id);
        pageViewAdapter=new PageViewAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pageViewAdapter);




        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });

        birds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });



        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

                onChangePage(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }


    private void onChangePage(int i) {

        if(i==0){
            dog.setTextSize(25);
            dog.setTextColor(getColor(R.color.skyblue_dark));

            birds.setTextSize(20);
            birds.setTextColor(getColor(R.color.skyBlue));

            cat.setTextSize(20);
            cat.setTextColor(getColor(R.color.skyBlue));
        }
        if (i==1){

            dog.setTextSize(20);
            dog.setTextColor(getColor(R.color.skyBlue));

            cat.setTextSize(25);
            cat.setTextColor(getColor(R.color.skyblue_dark));

            birds.setTextSize(20);
            birds.setTextColor(getColor(R.color.skyBlue));

        }
        if (i==2){

            dog.setTextSize(20);
            dog.setTextColor(getColor(R.color.skyBlue));

            cat.setTextSize(20);
            cat.setTextColor(getColor(R.color.skyBlue));

            birds.setTextSize(25);
            birds.setTextColor(getColor(R.color.skyblue_dark));

        }


    }
    }
