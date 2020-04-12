package org.enclave.adultfilms;

import android.app.Application;

import org.enclave.adultfilms.di.DaggerComponent;
import org.enclave.adultfilms.di.DaggerDaggerComponent;
import org.enclave.adultfilms.di.module.AppModule;
import org.enclave.adultfilms.di.module.NetworkModule;

public class AdultFilmsApp extends Application
{
    private static DaggerComponent daggerComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        daggerComponent = DaggerDaggerComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule())
                .build();
    }

    public static DaggerComponent getDaggerComponent() {
        return daggerComponent;
    }
}
