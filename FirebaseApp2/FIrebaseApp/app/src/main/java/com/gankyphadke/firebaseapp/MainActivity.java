package com.gankyphadke.firebaseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.facebook.FacebookSdk;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "FirebaseApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "mrigank");
        setContentView(R.layout.activity_main2);


      FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();


//        Log.d(TAG, user.toString());
//        if (user == null) {
//            startActivity(new Intent(this, LoginActivity.class));
//            Toast.makeText(MainActivity.this, user.toString(), Toast.LENGTH_SHORT).show();
//        } else {
        //TextView fullNameTV = (TextView) findViewById(R.id.tvFullName);
//            ImageView profileImage = (ImageView) findViewById(R.id.ivProfile);
//            ImageView photoImage = (ImageView) findViewById(R.id.ivDisplay);
//           profileImage.setImageURI(user.getPhotoUrl());
          //  fullNameTV.setText(user.getDisplayName());
//            final Button photoButton = (Button) findViewById(R.id.bCapture2);
//            photoButton.setO  nClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View v) {
//                    //startActivity(new Intent(LoginActivity.this, MainActivity.class));
//                    //Start camera fragment
//                }
//            });

        }


    }
