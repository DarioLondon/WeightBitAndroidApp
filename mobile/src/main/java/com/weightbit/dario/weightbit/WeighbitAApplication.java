package com.weightbit.dario.weightbit;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Dario on 08/06/2017.
 */

public class WeighbitAApplication extends Application {
public static final int SCHEMA_VERSION = 1;
    @Override
    public void onCreate(){
    super.onCreate();
    Realm.init(this);

    RealmConfiguration configuration = new RealmConfiguration.Builder()
            .schemaVersion(SCHEMA_VERSION)
            .name("weightbit_db.real")
            .deleteRealmIfMigrationNeeded()
            .build();
    Realm.deleteRealm(configuration);
    Realm.setDefaultConfiguration(configuration);
}

}
