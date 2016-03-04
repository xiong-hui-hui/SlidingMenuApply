package com.example.tozc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity{

    ViewPager mViewPager;
    RadioGroup mRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListener();

        List<Fragment> frags = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            frags.add(new Frag());
        }
        MyAdapt adapter = new MyAdapt(getSupportFragmentManager(), frags);
        mViewPager.setAdapter(adapter);
    }

    private void initListener() {
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.main_radio1:
                        mViewPager.setCurrentItem(0);
                        break;
                    case R.id.main_radio2:
                        mViewPager.setCurrentItem(1);
                        break;
                    case R.id.main_radio3:
                        mViewPager.setCurrentItem(2);
                        break;
                    case R.id.main_radio4:
                        mViewPager.setCurrentItem(3);
                        break;
                    default:
                        break;
                }
            }
        });

        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                RadioButton radioButton;
                for (int i=0;i<mRadioGroup.getChildCount();i++){
                    radioButton= (RadioButton) mRadioGroup.getChildAt(i);
                    if (i==position)
                        radioButton.setChecked(true);
                    else radioButton.setChecked(false);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initView() {
        mViewPager= (ViewPager) findViewById(R.id.vp_main);
        mRadioGroup= (RadioGroup) findViewById(R.id.rg_main);

    }

}
