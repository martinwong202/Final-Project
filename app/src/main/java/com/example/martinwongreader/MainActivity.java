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
    private TextView mText;
    private Button move1;
    private Button move2;
    private Button move3;
    private Button move4;

//    private ImageView RATK;



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
        mText=(TextView) findViewById(R.id.Text_display);
        move1=(Button) findViewById(R.id.move1);
        move2=(Button) findViewById(R.id.move2);
        move3=(Button) findViewById(R.id.move3);
        move4=(Button) findViewById(R.id.move4);

        DHP=(TextView) findViewById(R.id.gengarHP);
        DHP.setText("HP:"+Shp1);
        UHP=(TextView) findViewById(R.id.userHP);
        UHP.setText("HP:"+Shp2);


        mAttack.setOnClickListener (this);
        move1.setOnClickListener(this);
        move2.setOnClickListener(this);
        move3.setOnClickListener(this);
        move4.setOnClickListener(this);

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
        if (view.getId() == R.id.Attack_button) {
            mUserImg.setImageResource(android.R.color.transparent);
            mUserImg.setImageResource(R.drawable.ic_rayquaza_atkform);
            mDefaultImg.setImageResource(R.drawable.ic_pokemon_gengar);
            double number = Math.random();
            double num = Math.random();
            if (userhp == 0) {
//                Toast myToast = Toast.makeText(this, "Gengar has beaten you. Game over", Toast.LENGTH_SHORT);
//                myToast.setGravity(Gravity.CENTER, 0, 0);
//                myToast.show();
                mText.setText("Gengar has beaten you. Game over");
                userhp = 50;
                Gengarhp = 50;
                UHP.setText("HP:" + userhp);
                DHP.setText("Hp:" + Gengarhp);
            } else if (Gengarhp == 0) {
//                Toast myToast = Toast.makeText(this, "You have beaten Gengar. COngratulation you have beaten a bot.", Toast.LENGTH_SHORT);
//                myToast.setGravity(Gravity.CENTER, 0, 0);
//                myToast.show();
                mText.setText("You have beaten Gengar. Congratulation you have beaten a bot.");
                userhp = 50;
                Gengarhp = 50;
                UHP.setText("HP:" + userhp);
                DHP.setText("Hp:" + Gengarhp);
            }
            if (number < 0.50) {
                userhp--;
                UHP.setText("HP:" + userhp);
//                Toast myToast = Toast.makeText(this, "Gengar has successfully attacked rayquaza.", Toast.LENGTH_SHORT);
//                myToast.setGravity(Gravity.CENTER, 0, 0);
//                myToast.show();
//                mText.setText("Gengar has successfully attacked rayquaza.");
            } else {
//                Toast myToast = Toast.makeText(this, "Gengar has missed its attack.", Toast.LENGTH_SHORT);
//                myToast.setGravity(Gravity.CENTER, 0, 0);
//                myToast.show();
//                mText.setText("Gengar has missed its attack.");
            }
            if (num < 0.5) {
                Gengarhp--;
                DHP.setText("Hp:" + Gengarhp);
//                Toast myToast = Toast.makeText(this, "Rayquaza has successfully attacked Gengar.", Toast.LENGTH_SHORT);
//                myToast.setGravity(Gravity.CENTER, 0, 0);
//                myToast.show();
//                mText.setText("Rayquaza has successfully attacked Gengar.");
            } else {
//                Toast myToast = Toast.makeText(this, "Rayquaza has missed its attack.", Toast.LENGTH_SHORT);
//                myToast.setGravity(Gravity.CENTER, 0, 0);
//                myToast.show();
//                mText.setText("Rayquaza has missed its attack.");
            }
            if(num<0.5&&number<0.5){
                Toast myToast = Toast.makeText(this, "Both Gengar and Rayquaza has successfully attacked.", Toast.LENGTH_LONG);
                myToast.setGravity(Gravity.CENTER, 0, 0);
                myToast.show();
            }
            else if(num<0.5&&number>=0.5){
                Toast myToast = Toast.makeText(this, "Gengar has missed and Rayquaza has attacked.", Toast.LENGTH_LONG);
                myToast.setGravity(Gravity.CENTER, 0, 0);
                myToast.show();
            }
            else if(num>0.5&&number<0.5){
                Toast myToast = Toast.makeText(this, "Gengar has successfully attakced and Rayquaza has missed.", Toast.LENGTH_LONG);
                myToast.setGravity(Gravity.CENTER, 0, 0);
                myToast.show();
            }
            else{
                Toast myToast = Toast.makeText(this, "Both Gengar and Rayquaza has missed.", Toast.LENGTH_LONG);
                myToast.setGravity(Gravity.CENTER, 0, 0);
                myToast.show();
            }
//            if(num<0.5) {
//                if(userhp==0){
//                    Toast myToast = Toast.makeText(this, "Gengar has beaten you. Game over", Toast.LENGTH_SHORT);
//                    myToast.setGravity(Gravity.CENTER, 0, 0);
//                    myToast.show();
//                     userhp=50;
//                     Gengarhp=50;
//                     UHP.setText("HP:" + userhp);
//                     DHP.setText("Hp:" + Gengarhp);
//                }else if(Gengarhp==0){
//                    Toast myToast = Toast.makeText(this, "You have beaten Gengar. COngratulation you have beaten a bot.", Toast.LENGTH_SHORT);
//                    myToast.setGravity(Gravity.CENTER, 0, 0);
//                    myToast.show();
//                    userhp=50;
//                    Gengarhp=50;
//                    UHP.setText("HP:" + userhp);
//                    DHP.setText("Hp:" + Gengarhp);
//                }else {
//                    userhp--;
//                    UHP.setText("HP:" + userhp);
//                    Toast myToast = Toast.makeText(this, "Gengar has successfully attacked rayquaza. Rayquaza has missed.", Toast.LENGTH_SHORT);
//                    myToast.setGravity(Gravity.CENTER, 0, 0);
//                    myToast.show();
//                }
//            }
//            else{
//                if(userhp==0){
//                    Toast myToast = Toast.makeText(this, "Gengar has beaten you. Game over", Toast.LENGTH_SHORT);
//                    myToast.setGravity(Gravity.CENTER, 0, 0);
//                    myToast.show();
//                    userhp=50;
//                    Gengarhp=50;
//                    UHP.setText("HP:" + userhp);
//                    DHP.setText("Hp:" + Gengarhp);
//                }else if(Gengarhp==0) {
//                    Toast myToast = Toast.makeText(this, "You have beaten Gengar. COngratulation you have beaten a bot.", Toast.LENGTH_SHORT);
//                    myToast.setGravity(Gravity.CENTER, 0, 0);
//                    myToast.show();
//                    userhp = 50;
//                    Gengarhp = 50;
//                    UHP.setText("HP:" + userhp);
//                    DHP.setText("Hp:" + Gengarhp);
//                }else {
//                    Gengarhp--;
//                    DHP.setText("Hp:" + Gengarhp);
//                    Toast myToast = Toast.makeText(this, "Rayquaza has successfully attacked Gengar. Gengar has missed.", Toast.LENGTH_SHORT);
//                    myToast.setGravity(Gravity.CENTER, 0, 0);
//                    myToast.show();
//                }
//            }
        }
        else if(view.getId()==R.id.move1){
            Toast myToast = Toast.makeText(this, "The user of Outrage attacks for 2-3 turns, during which it cannot switch out, and then becomes confused. Confused Pokémon have a 33% chance of hurting themselves each turn, for 1-4 attacking turns", Toast.LENGTH_LONG);
            myToast.setGravity(Gravity.CENTER, 0, 0);
            myToast.show();
        }
        else if(view.getId()==R.id.move2){
            Toast myToast = Toast.makeText(this, "Twister inflicts damage and has a 20% chance of causing each target to flinch. It will hit all adjacent opponents in battles featuring multiple Pokémon.", Toast.LENGTH_LONG);
            myToast.setGravity(Gravity.CENTER, 0, 0);
            myToast.show();
        }
        else if(view.getId()==R.id.move3){
            Toast myToast = Toast.makeText(this, "ExtremeSpeed inflicts damage. It has a priority of +1, so is used before all moves that do not have increased priority.", Toast.LENGTH_LONG);
            myToast.setGravity(Gravity.CENTER, 0, 0);
            myToast.show();
        }
        else if(view.getId()==R.id.move4){
            Toast myToast = Toast.makeText(this, "A two turn move where the pokemon flies in the sky to attack.", Toast.LENGTH_LONG);
            myToast.setGravity(Gravity.CENTER, 0, 0);
            myToast.show();
        }

    }
}
