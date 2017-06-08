package com.weightbit.dario.weightbit.db;

import android.util.Log;

import com.weightbit.dario.weightbit.model.User;
import com.weightbit.dario.weightbit.model.Workout;

import java.util.Hashtable;
import java.util.List;

import io.realm.Realm;

/**
 * Created by Dario on 08/06/2017.
 */

public class WeightbitDataSource {

    private static final String TAG = WeightbitDataSource.class.getSimpleName();
    private Realm realm;
    public void open(){
        realm = Realm.getDefaultInstance();

    Log.d(TAG, "database is opened");
    }

    public void close(){
        realm.close();
        Log.d(TAG, "database is closed");
    }

    public void createUser(final User user ){
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.insert(user);
            }
        });

        Log.d(TAG,"user with id");
    }

    public void creatWorkout(final Workout workout){

        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.insert(workout);
            }
        });
        Log.d(TAG,"workout with id");

    }

    public List<User> getUser(){
        return  realm.where(User.class)
                .findAll();
    }

    public void updateUserInfo(final Hashtable<String,String> newUserInfo){
        final User user = realm.where(User.class).findFirst();
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
              user.setCity(newUserInfo.get("city"));
            }
        });
    }

    public void deleteUser(){
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                User user = realm.where(User.class).findFirst();
                user.getWorkouts().deleteAllFromRealm();
                user.deleteFromRealm();
            }
        });
    }


}
