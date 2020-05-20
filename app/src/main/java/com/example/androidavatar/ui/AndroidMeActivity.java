package com.example.androidavatar.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import com.example.androidavatar.R;
import com.example.androidavatar.data.AndroidImageAssets;

public class AndroidMeActivity extends AppCompatActivity {

    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getSupportFragmentManager();

        BodyPartFragment heads = new BodyPartFragment();
        heads.setImages(AndroidImageAssets.getHeads());
        heads.setIndex(6);

        BodyPartFragment bodies = new BodyPartFragment();
        bodies.setImages(AndroidImageAssets.getBodies());
        bodies.setIndex(6);

        BodyPartFragment legs = new BodyPartFragment();
        legs.setImages(AndroidImageAssets.getLegs());
        legs.setIndex(6);

        FragmentTransaction transaction1 = manager.beginTransaction();
        FragmentTransaction transaction2 = manager.beginTransaction();
        FragmentTransaction transaction3 = manager.beginTransaction();

        transaction1.add(R.id.container1,heads,"heads");
        transaction2.add(R.id.container2,bodies,"bodies");
        transaction3.add(R.id.container3,legs,"legs");

        transaction1.commit();
        transaction2.commit();
        transaction3.commit();
    }
}
