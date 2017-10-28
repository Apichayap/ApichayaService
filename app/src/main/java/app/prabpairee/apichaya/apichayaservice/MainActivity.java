package app.prabpairee.apichaya.apichayaservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.prabpairee.apichaya.apichayaservice.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Add Fragment to Activity
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentFragmentMain, new MainFragment()).commit();
        }

    }   // Main Method

}   //Main Class
