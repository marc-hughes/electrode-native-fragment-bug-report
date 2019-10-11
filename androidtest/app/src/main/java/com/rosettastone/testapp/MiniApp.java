package com.rosettastone.testapp;

import androidx.annotation.NonNull;

import com.ern.api.impl.navigation.ElectrodeBaseActivity;

// This is the main activity that gets launched upon app start
// It just launches the activity containing the miniapp
// Feel free to modify it at your convenience.

public class MiniApp extends ElectrodeBaseActivity {

    @NonNull
    @Override
    public String getRootComponentName() {
        return "testMiniApp";
    }

    @Override
    protected int mainLayout() {
        return R.layout.activity_mini_app;
    }

    @Override
    public int getFragmentContainerId() {
        return R.id.fragment_container;
    }
}