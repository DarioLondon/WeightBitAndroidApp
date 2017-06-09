package com.weightbit.dario.weightbit.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.weightbit.dario.weightbit.R;
import com.weightbit.dario.weightbit.db.WeightbitDataSource;

public class RegistartionActivity extends AppCompatActivity {

    private static final String TAG = RegistartionActivity.class.getSimpleName();
    private WeightbitDataSource dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registartion);
        dataSource = new WeightbitDataSource();
        dataSource.open();

    }

    @Override
    protected void onResume(){
        super.onResume();
        final Button registerButton = (Button) findViewById(R.id.registrationButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(i);
                finish();

            }
        });
    }



    @Override
    protected void onDestroy(){
        dataSource.close();
        super.onDestroy();
    }
}
