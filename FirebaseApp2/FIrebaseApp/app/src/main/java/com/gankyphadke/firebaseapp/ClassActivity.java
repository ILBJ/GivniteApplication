package com.gankyphadke.firebaseapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by mriga on 7/23/2016.
 */

public class ClassActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);
        final ImageView nyu = (ImageView)findViewById(R.id.imageView2);
        final ImageView cooper = (ImageView)findViewById(R.id.imageView3);
        final ImageView newschool = (ImageView)findViewById(R.id.imageView4);
        final ImageView baruch = (ImageView)findViewById(R.id.imageView5);
        final ImageView fit = (ImageView)findViewById(R.id.imageView6);
        final ImageView sva = (ImageView)findViewById(R.id.imageView7);

        nyu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
              nyu.setImageResource(R.drawable.nyu_color);
                cooper.setImageResource(R.drawable.cooper_black);
                newschool.setImageResource(R.drawable.thenewschool_black);
                baruch.setImageResource(R.drawable.baruch_black);
                fit.setImageResource(R.drawable.fit_black);
                sva.setImageResource(R.drawable.sva_black);

                Button bSchool = (Button)findViewById(R.id.button2);
                bSchool.setText("New York University");
                bSchool.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(ClassActivity.this, MajorsActivity.class));
                    }
                });

            }
        });



        cooper.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                cooper.setImageResource(R.drawable.cooper_color);
                nyu.setImageResource(R.drawable.nyu_black);
                newschool.setImageResource(R.drawable.thenewschool_black);
                baruch.setImageResource(R.drawable.baruch_black);
                fit.setImageResource(R.drawable.fit_black);
                sva.setImageResource(R.drawable.sva_black);

                Button bSchool = (Button)findViewById(R.id.button2);
                bSchool.setText("The Cooper Union");
                bSchool.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(ClassActivity.this, MajorsActivity.class));
                    }
                });
            }
        });



        newschool.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                newschool.setImageResource(R.drawable.thenewschool_color);
                nyu.setImageResource(R.drawable.nyu_black);
                cooper.setImageResource(R.drawable.cooper_black);
                baruch.setImageResource(R.drawable.baruch_black);
                fit.setImageResource(R.drawable.fit_black);
                sva.setImageResource(R.drawable.sva_black);

                Button bSchool = (Button)findViewById(R.id.button2);
                bSchool.setText("The New School");
                bSchool.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(ClassActivity.this, MajorsActivity.class));
                    }
                });
            }
        });



        baruch.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                baruch.setImageResource(R.drawable.baruch_color);
                nyu.setImageResource(R.drawable.nyu_black);
                cooper.setImageResource(R.drawable.cooper_black);
                newschool.setImageResource(R.drawable.thenewschool_black);
                fit.setImageResource(R.drawable.fit_black);
                sva.setImageResource(R.drawable.sva_black);

                Button bSchool = (Button)findViewById(R.id.button2);
                bSchool.setText("Baruch College");
                bSchool.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(ClassActivity.this, MajorsActivity.class));
                    }
                });
            }
        });


        fit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                fit.setImageResource(R.drawable.fit_color);
                nyu.setImageResource(R.drawable.nyu_black);
                cooper.setImageResource(R.drawable.cooper_black);
                baruch.setImageResource(R.drawable.baruch_black);
                newschool.setImageResource(R.drawable.thenewschool_black);
                sva.setImageResource(R.drawable.sva_black);

                Button bSchool = (Button)findViewById(R.id.button2);
                bSchool.setText("Fashion Institute of Technology");
                bSchool.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(ClassActivity.this, MajorsActivity.class));
                    }
                });
            }
        });



        sva.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sva.setImageResource(R.drawable.sva_color);
                nyu.setImageResource(R.drawable.nyu_black);
                cooper.setImageResource(R.drawable.cooper_black);
                baruch.setImageResource(R.drawable.baruch_black);
                fit.setImageResource(R.drawable.fit_black);
                newschool.setImageResource(R.drawable.thenewschool_black);

                Button bSchool = (Button)findViewById(R.id.button2);
                bSchool.setText("School of Visual Arts");
                bSchool.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(ClassActivity.this, MajorsActivity.class));
                    }
                });
            }
        });

    }

}
