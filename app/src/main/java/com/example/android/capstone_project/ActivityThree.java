package com.example.android.capstone_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

/**
 * Created by User on 4/15/2017.
 */

public class ActivityThree extends AppCompatActivity {
    Toolbar toolbar;
    ListView listview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);




        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int i = item.getItemId();
                if (i == R.id.home) {
                    Intent intent0 = new Intent(ActivityThree.this, MainActivity.class);
                    startActivity(intent0);

                } else if (i == R.id.myPlants) {
                    Intent intent1 = new Intent(ActivityThree.this, ActivityOne.class);
                    startActivity(intent1);

                } else if (i == R.id.reminder) {
                    Intent intent2 = new Intent(ActivityThree.this, ActivityTwo.class);
                    startActivity(intent2);

                } else if (i == R.id.settings) {
                }


                return false;
            }
        });
        String [] menuItems ={"Edit Profile","Add Kit Information","About","C"};

        ListView listView = (ListView) findViewById(R.id.mainMenu);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                ActivityThree.this,
                android.R.layout.simple_list_item_1,
                menuItems
        );

        listView.setAdapter(listViewAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){
                    Intent intent0 = new Intent(ActivityThree.this, myProfile.class);
                    startActivity(intent0);


                }
                else if(position == 1)
                {
                    Intent intent1 = new Intent(ActivityThree.this, addToDatabase.class);
                    startActivity(intent1);


                }
                else if(position == 2)
                {
                    Intent intent2 = new Intent(ActivityThree.this, About.class);
                    startActivity(intent2);


                }


            }
        });
    }
}