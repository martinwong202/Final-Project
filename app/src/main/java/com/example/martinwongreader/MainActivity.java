package com.example.martinwongreader;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;
    private LinearLayout mPokemonField;
    private LinearLayout mPokemonFight;
    private LinearLayout mPokemonHome;
    private LinearLayout mPokemonAdded;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    mPokemonField.setVisibility(View.GONE);
                    mPokemonFight.setVisibility(View.GONE);
                    mPokemonHome.setVisibility(View.VISIBLE);
                    mPokemonAdded.setVisibility(View.GONE);
                    return true;
                case R.id.navigation_pokemon:
                    mTextMessage.setText(R.string.Pokemon);
                    mPokemonField.setVisibility(View.VISIBLE);
                    mPokemonFight.setVisibility(View.GONE);
                    mPokemonHome.setVisibility(View.GONE);
                    mPokemonAdded.setVisibility(View.VISIBLE);
                    return true;
                case R.id.navigation_fight:
                    mTextMessage.setText(R.string.Fight);
                    mPokemonField.setVisibility(View.GONE);
                    mPokemonFight.setVisibility(View.VISIBLE);
                    mPokemonHome.setVisibility(View.GONE);
                    mPokemonAdded.setVisibility(View.GONE);
                    return true;
                case R.id.navigation_account:
                    mTextMessage.setText(R.string.Account);
                    mPokemonField.setVisibility(View.GONE);
                    mPokemonFight.setVisibility(View.GONE);
                    mPokemonHome.setVisibility(View.GONE);
                    mPokemonAdded.setVisibility(View.GONE);
                    return true;
                case R.id.navigation_Liked:
                    mTextMessage.setText("Liked");
                    mPokemonField.setVisibility(View.GONE);
                    mPokemonFight.setVisibility(View.GONE);
                    mPokemonHome.setVisibility(View.GONE);
                    mPokemonAdded.setVisibility(View.GONE);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        mPokemonField = (LinearLayout) findViewById(R.id.pokemon_field);
        mPokemonFight = (LinearLayout) findViewById(R.id.pokemon_fight);
        mPokemonHome = (LinearLayout) findViewById(R.id.pokemon_home);
        mPokemonAdded =(LinearLayout) findViewById(R.id.pokemon_added);
    }
}

