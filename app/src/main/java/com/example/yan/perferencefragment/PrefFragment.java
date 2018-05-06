package com.example.yan.perferencefragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Yan on 2018/4/28.
 */

public class PrefFragment extends PreferenceFragment{
    @Override
    public void onCreate(Bundle savedInstantceState){
    super.onCreate(savedInstantceState);

    addPreferencesFromResource(R.xml.preferences);
}

}
