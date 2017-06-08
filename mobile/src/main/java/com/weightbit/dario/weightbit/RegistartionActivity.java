package com.weightbit.dario.weightbit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.weightbit.dario.weightbit.db.WeightbitDataSource;
import com.weightbit.dario.weightbit.model.User;

public class RegistartionActivity extends AppCompatActivity {

    private static final String TAG = RegistartionActivity.class.getSimpleName();
    private WeightbitDataSource dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registartion);
        dataSource = new WeightbitDataSource();
        dataSource.open();
    }

    @Override
    protected void onResume(){
        super.onResume();
        User user = new User ();
        dataSource.createUser(user);

    }

    @Override
    protected void onDestroy(){
        dataSource.close();
        super.onDestroy();
    }
}
