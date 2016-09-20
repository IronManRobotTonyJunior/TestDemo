package com.example.dllo.thirtysixkr.investment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.example.dllo.thirtysixkr.BaseFragment;
import com.example.dllo.thirtysixkr.R;

import java.util.ArrayList;

public class InvestmentFragment extends BaseFragment {

    private ArrayList<Fragment> fragments;
    private ArrayList<String> titles;

    @Override
    protected int setLayout() {
        return R.layout.fragment_investment;
    }

    @Override
    protected void initView() {
        TabLayout tb = bindView(R.id.investment_tb);
        ViewPager vp = bindView(R.id.investment_vp);

        fragments = new ArrayList<>();
        titles = new ArrayList<>();
        ChildFragment fragmentAll = new ChildFragment();
        ChildFragment fragmentFundraising = new ChildFragment();
        ChildFragment fragmentComplete = new ChildFragment();
        ChildFragment fragmentSuccess = new ChildFragment();

        fragments.add(fragmentAll);
        fragments.add(fragmentFundraising);
        fragments.add(fragmentComplete);
        fragments.add(fragmentSuccess);
        titles.add("全部");
        titles.add("募资中");
        titles.add("募资完成");
        titles.add("融资成功");


    }

    @Override
    protected void initData() {
        InvestmentAdapter adapter = new InvestmentAdapter(getChildFragmentManager());
        adapter.setFragments(fragments);
        adapter.setTitles(titles);

    }
}
