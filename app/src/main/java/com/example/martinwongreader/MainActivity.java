package com.example.martinwongreader;

import android.content.Context;
import android.content.Intent;
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

import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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
    int Shp1=50;
    TextView UHP;
    int Shp2=50;
    private int Gengarhp=50;
    private int userhp=50;
    private LinearLayout mInfo;
    private Button mInfo_button;
    private ImageView mInfoImg;



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
        mInfo=(LinearLayout) findViewById(R.id.Info);
        mInfo_button=(Button) findViewById(R.id.info_button);
        mInfoImg=(ImageView) findViewById(R.id.info_img);

        DHP=(TextView) findViewById(R.id.gengarHP);
        DHP.setText("HP:"+Shp1);
        UHP=(TextView) findViewById(R.id.userHP);
        UHP.setText("HP:"+Shp2);


        mAttack.setOnClickListener (this);
        mInfo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });
    }

    private void launchActivity() {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
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
                mInfo.setVisibility(View.GONE);
                mInfoImg.setVisibility(View.GONE);
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
                mInfo.setVisibility(View.GONE);
                mInfoImg.setVisibility(View.GONE);
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
                mInfo.setVisibility(View.GONE);
                mInfoImg.setVisibility(View.GONE);
                return true;
//            case R.id.navigation_account:
//                mTextMessage.setText(R.string.Account);
//                mPokemonField.setVisibility(View.GONE);
//                mPokemonFight.setVisibility(View.GONE);
//                mPokemonHome.setVisibility(View.GONE);
//                mPokemonAdded.setVisibility(View.GONE);
//                mAccount.setVisibility(View.VISIBLE);
//                mInfo.setVisibility(View.GONE);
//                mAttack.setVisibility(View.GONE);
//                return true;
            case R.id.navigation_Liked:
                mTextMessage.setText("Liked");
                mPokemonField.setVisibility(View.GONE);
                mPokemonFight.setVisibility(View.GONE);
                mPokemonHome.setVisibility(View.GONE);
                mPokemonAdded.setVisibility(View.GONE);
                mAccount.setVisibility(View.GONE);
                mInfo.setVisibility(View.VISIBLE);
                mDefaultImg.setVisibility(View.GONE);
                mUserImg.setVisibility(View.GONE);
                mUserHp.setVisibility(View.GONE);
                mGengarHp.setVisibility(View.GONE);
                mAttack.setVisibility(View.GONE);
                mInfoImg.setVisibility(View.VISIBLE);
                return true;
        }
        return false;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.Attack_button)
        {
            double num = Math.random();
            if(num<0.5) {
                if(userhp==0){
                    Toast myToast = Toast.makeText(this, "Gengar has beaten you. Game over", Toast.LENGTH_SHORT);
                    myToast.setGravity(Gravity.CENTER, 0, 0);
                    myToast.show();
                     userhp=50;
                     Gengarhp=50;
                     UHP.setText("HP:" + userhp);
                     DHP.setText("Hp:" + Gengarhp);
                }else if(Gengarhp==0){
                    Toast myToast = Toast.makeText(this, "You have beaten Gengar. COngratulation you have beaten a bot.", Toast.LENGTH_SHORT);
                    myToast.setGravity(Gravity.CENTER, 0, 0);
                    myToast.show();
                    userhp=50;
                    Gengarhp=50;
                    UHP.setText("HP:" + userhp);
                    DHP.setText("Hp:" + Gengarhp);
                }else {
                    userhp--;
                    UHP.setText("HP:" + userhp);
                    Toast myToast = Toast.makeText(this, "Gengar has successfully attacked rayquaza. Rayquaza has missed.", Toast.LENGTH_SHORT);
                    myToast.setGravity(Gravity.CENTER, 0, 0);
                    myToast.show();
                }
            }
            else{
                if(userhp==0){
                    Toast myToast = Toast.makeText(this, "Gengar has beaten you. Game over", Toast.LENGTH_SHORT);
                    myToast.setGravity(Gravity.CENTER, 0, 0);
                    myToast.show();
                    userhp=50;
                    Gengarhp=50;
                    UHP.setText("HP:" + userhp);
                    DHP.setText("Hp:" + Gengarhp);
                }else if(Gengarhp==0) {
                    Toast myToast = Toast.makeText(this, "You have beaten Gengar. COngratulation you have beaten a bot.", Toast.LENGTH_SHORT);
                    myToast.setGravity(Gravity.CENTER, 0, 0);
                    myToast.show();
                    userhp = 50;
                    Gengarhp = 50;
                    UHP.setText("HP:" + userhp);
                    DHP.setText("Hp:" + Gengarhp);
                }else {
                    Gengarhp--;
                    DHP.setText("Hp:" + Gengarhp);
                    Toast myToast = Toast.makeText(this, "Rayquaza has successfully attacked Gengar. Gengar has missed.", Toast.LENGTH_SHORT);
                    myToast.setGravity(Gravity.CENTER, 0, 0);
                    myToast.show();
                }
            }
        }
    }
}
