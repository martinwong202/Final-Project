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
import androidx.constraintlayout.widget.ConstraintLayout;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
    private TextView mTextMessage;
    private ConstraintLayout mPokemonField;
    private LinearLayout mPokemonFight;
    private LinearLayout mPokemonHome;
    private ImageView mPokemonAdded;
    private LinearLayout mAccount;
    private Button mAttack;
    private ImageView mDefaultImg;
    private ImageView mUserImg;
    private TextView mUserHp;
    private TextView mGengarHp;
    TextView DHP;
    int Shp1=1;
    TextView UHP;
    int Shp2=9999;
    private int mGengarhp=1;
    private int userhp=1;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(this);
        mPokemonField = (ConstraintLayout) findViewById(R.id.pokemon_field);
        mPokemonFight = (LinearLayout) findViewById(R.id.pokemon_fight);
        mPokemonHome = (LinearLayout) findViewById(R.id.pokemon_home);
        mPokemonAdded =(ImageView) findViewById(R.id.pokemon_added);
        mAccount= (LinearLayout)findViewById(R.id.Account);
        mAttack= (Button) findViewById(R.id.Attack_button);
        mDefaultImg = (ImageView) findViewById(R.id.Gengar_image);
        mUserImg=(ImageView) findViewById(R.id.user_image);
        mUserHp=(TextView) findViewById(R.id.userHP);
        mGengarHp=(TextView) findViewById(R.id.gengarHP);

        DHP=(TextView) findViewById(R.id.gengarHP);
        DHP.setText("HP:"+Shp1);
        UHP=(TextView) findViewById(R.id.userHP);
        UHP.setText("HP:"+Shp2);


        mAttack.setOnClickListener (this);
    }
//    @Override
//    public void onClick(View view){
//        if(view.getId()==R.id.Attack_button){
//            userhp--;
//            UHP.setText("HP:"+userhp);
//        }
//    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_home:
                mTextMessage.setText(R.string.title_home);
                mPokemonField.setVisibility(View.GONE);
                mPokemonFight.setVisibility(View.GONE);
                mPokemonHome.setVisibility(View.VISIBLE);
                mPokemonAdded.setVisibility(View.GONE);
                mAccount.setVisibility(View.GONE);
                mAttack.setVisibility(View.GONE);
                mDefaultImg.setVisibility(View.GONE);
                mUserImg.setVisibility(View.GONE);
                mUserHp.setVisibility(View.GONE);
                mGengarHp.setVisibility(View.GONE);
                return true;
            case R.id.navigation_pokemon:
                mTextMessage.setText(R.string.Pokemon);
                mPokemonField.setVisibility(View.VISIBLE);
                mPokemonFight.setVisibility(View.GONE);
                mPokemonHome.setVisibility(View.GONE);
                mPokemonAdded.setVisibility(View.VISIBLE);
                mAccount.setVisibility(View.GONE);
                mAttack.setVisibility(View.GONE);
                mDefaultImg.setVisibility(View.GONE);
                mUserImg.setVisibility(View.GONE);
                mUserHp.setVisibility(View.GONE);
                mGengarHp.setVisibility(View.GONE);
                return true;
            case R.id.navigation_fight:
                mTextMessage.setText(R.string.Fight);
                mPokemonField.setVisibility(View.GONE);
                mPokemonFight.setVisibility(View.VISIBLE);
                mPokemonHome.setVisibility(View.GONE);
                mPokemonAdded.setVisibility(View.GONE);
                mAccount.setVisibility(View.GONE);
                mAttack.setVisibility(View.VISIBLE);
                mDefaultImg.setVisibility(View.VISIBLE);
                mUserImg.setVisibility(View.VISIBLE);
                mUserHp.setVisibility(View.VISIBLE);
                mGengarHp.setVisibility(View.VISIBLE);
                return true;
            case R.id.navigation_account:
                mTextMessage.setText(R.string.Account);
                mPokemonField.setVisibility(View.GONE);
                mPokemonFight.setVisibility(View.GONE);
                mPokemonHome.setVisibility(View.GONE);
                mPokemonAdded.setVisibility(View.GONE);
                mAccount.setVisibility(View.VISIBLE);
                return true;
            case R.id.navigation_Liked:
                mTextMessage.setText("Liked");
                mPokemonField.setVisibility(View.GONE);
                mPokemonFight.setVisibility(View.GONE);
                mPokemonHome.setVisibility(View.GONE);
                mPokemonAdded.setVisibility(View.GONE);
                mAccount.setVisibility(View.GONE);
                return true;
        }
        return false;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.Attack_button)
        {
            userhp--;
            UHP.setText("HP:"+userhp);
        }
    }
}

