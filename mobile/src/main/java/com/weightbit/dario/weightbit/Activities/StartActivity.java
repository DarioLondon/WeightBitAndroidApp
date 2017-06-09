package com.weightbit.dario.weightbit.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.weightbit.dario.weightbit.R;
import com.weightbit.dario.weightbit.db.WeightbitDataSource;
import com.weightbit.dario.weightbit.model.User;

import java.util.List;

/**
 * Created by Dario on 08/06/2017.
 */

public class StartActivity extends AppCompatActivity{

    private static final String TAG = RegistartionActivity.class.getSimpleName();
    private WeightbitDataSource dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
        dataSource = new WeightbitDataSource();
        dataSource.open();
    }



    @Override
    protected void onResume(){
        super.onResume();
        List<User> user = dataSource.getUser();
        if(user == null || user.size() == 0){
            Intent intent = new Intent(this,RegistartionActivity.class);
            startActivity(intent);
            Log.d(TAG,"no user found"+user);
            this.finish();
        }
        else{
            Intent intent = new Intent(this,MenuActivity.class);
            startActivity(intent);
            Log.d(TAG," user found"+user);
            this.finish();
        }

    }

    @Override
    protected void onDestroy(){
        dataSource.close();
        super.onDestroy();
    }
}
