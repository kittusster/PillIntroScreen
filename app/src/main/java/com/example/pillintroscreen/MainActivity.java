package com.example.pillintroscreen;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.pillintroscreen.data.DummyDataHelper;
import com.example.pillintroscreen.databinding.ActivityMainBinding;
import com.example.pillintroscreen.model.App;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<App> appsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DummyDataHelper dummyDataHelper = new DummyDataHelper();
        appsList = dummyDataHelper.getAppList();
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        AppListAdapter appListAdapter=new AppListAdapter(getApplicationContext(),appsList);
        binding.recyclerViewOne.setAdapter(appListAdapter);

        AppListAdapter appListAdapterTwo=new AppListAdapter(getApplicationContext(),appsList);
        binding.recyclerViewTwo.setAdapter(appListAdapterTwo);
    }
}
