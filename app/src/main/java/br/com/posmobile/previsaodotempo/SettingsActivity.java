package br.com.posmobile.previsaodotempo;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Rafael on 20/08/2016.
 */
public class SettingsActivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.mypreference);
    }
}
