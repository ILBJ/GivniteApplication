package com.gankyphadke.firebaseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by mriga on 7/23/2016.
 */
public class MajorsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_majors);
        EditText gradYear = (EditText) findViewById(R.id.editText);
        EditText major = (EditText) findViewById(R.id.editText2);

        if(gradYear != null & major != null){
            major.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                    boolean handled = false;
                    if (actionId == EditorInfo.IME_NULL) {
                        startActivity(new Intent(MajorsActivity.this, ProfileClass.class));
                    }
                    return handled;
                }
            });
        }
    }
}
